package nh;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import lh.lc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.q6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ei1;
import org.telegram.ui.gy;
import org.telegram.ui.m90;
import org.telegram.ui.rn;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ a1(TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j10, c6 c6Var, org.telegram.ui.web.u uVar, cg.u0 u0Var) {
        this.b = tLObject;
        this.c = i10;
        this.e = b2Var;
        this.f = context;
        this.d = j10;
        this.h = c6Var;
        this.n = uVar;
        this.r = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mc a02;
        int i10;
        gy gyVar;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                Context context = (Context) this.f;
                c6 c6Var = (c6) this.h;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.n;
                cg.u0 u0Var = (cg.u0) this.r;
                TLObject tLObject = this.b;
                if (tLObject instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i11 = this.c;
                    long j10 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            b1 b1Var = new b1(b2Var, context, i11, j10, tL_messages_preparedInlineMessage, c6Var, uVar, u0Var);
                            int[] iArr = new int[1];
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            iArr[0] = ConnectionsManager.getInstance(i11).sendRequestTyped(getwebpagepreview, new org.telegram.messenger.a(), new hh.j0(iArr, b1Var, notificationCenterDelegateArr, i11, 1));
                            b2Var.setOnCancelListener(new lc(new d5.i(iArr, i11, notificationCenterDelegateArr, 16), 1));
                            break;
                        }
                    }
                    File[] fileArr = new File[1];
                    c1 c1Var = new c1(b2Var, context, i11, j10, tL_messages_preparedInlineMessage, fileArr, c6Var, uVar, u0Var);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str2 = botInlineResult.content.url;
                            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str2, null);
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str2) + (TextUtils.isEmpty(httpUrlExtension) ? FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type) : s3.c.e(".", httpUrlExtension)));
                            if (file.exists()) {
                                c1Var.run();
                                break;
                            } else {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new gh.d1(19, fileArr, c1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                b2Var.setOnCancelListener(new lc(httpGetFileTask, 2));
                                break;
                            }
                        }
                    }
                    c1Var.run();
                    break;
                } else {
                    u0Var.run("MESSAGE_EXPIRED", null);
                    break;
                }
                break;
            default:
                final LaunchActivity launchActivity = (LaunchActivity) this.e;
                String str3 = (String) this.f;
                String str4 = (String) this.h;
                final TLRPC.User user = (TLRPC.User) this.n;
                final String str5 = (String) this.r;
                ArrayList arrayList = launchActivity.b0;
                ArrayList arrayList2 = launchActivity.Z;
                ArrayList arrayList3 = launchActivity.A0;
                TLObject tLObject2 = this.b;
                if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject2;
                    final int i12 = this.c;
                    MessagesController.getInstance(i12).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str3 != null) {
                        LaunchActivity.C0(launchActivity, launchActivity.K, tL_attachMenuBot, str3, false);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList2);
                        if (AndroidUtilities.isTablet() && !(n2Var instanceof rn) && !arrayList.isEmpty()) {
                            n2Var = (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!TextUtils.isEmpty(str4)) {
                            for (String str6 : str4.split(" ")) {
                                if (MediaDataController.canShowAttachMenuBotForTarget(tL_attachMenuBot, str6)) {
                                    arrayList4.add(str6);
                                }
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            gyVar = null;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putInt("dialogsType", 14);
                            bundle.putBoolean("onlySelect", true);
                            bundle.putBoolean("allowGroups", arrayList4.contains("groups"));
                            bundle.putBoolean("allowMegagroups", arrayList4.contains("groups"));
                            bundle.putBoolean("allowLegacyGroups", arrayList4.contains("groups"));
                            bundle.putBoolean("allowUsers", arrayList4.contains("users"));
                            bundle.putBoolean("allowChannels", arrayList4.contains("channels"));
                            bundle.putBoolean("allowBots", arrayList4.contains("bots"));
                            gyVar = new gy(bundle);
                            gyVar.y2 = new m90(launchActivity, user, str5, i12);
                        }
                        if (tL_attachMenuBot.inactive) {
                            q6 q6Var = new q6(launchActivity);
                            q6Var.setColor(g6.w0(null, g6.ia, false));
                            q6Var.setBackgroundColor(g6.w0(null, g6.L5, false));
                            q6Var.setAttachBot(tL_attachMenuBot);
                            final long j11 = this.d;
                            final gy gyVar2 = gyVar;
                            final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            ei1.a(launchActivity, new d5.d() { // from class: org.telegram.ui.n90
                                @Override // d5.d
                                public final void accept(Object obj) {
                                    Pattern pattern = LaunchActivity.x1;
                                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                    int i13 = i12;
                                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i13).getInputUser(j11);
                                    tL_messages_toggleBotInAttachMenu.enabled = true;
                                    tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                    ConnectionsManager.getInstance(i13).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.di(LaunchActivity.this, i13, gyVar2, n2Var2, user, str5), 66);
                                }
                            }, null);
                            break;
                        } else if (gyVar != null) {
                            if (n2Var != null) {
                                n2Var.dismissCurrentDialog();
                            }
                            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                if (((Dialog) arrayList3.get(i13)).isShowing()) {
                                    ((Dialog) arrayList3.get(i13)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.p0(gyVar);
                            break;
                        } else if (n2Var instanceof rn) {
                            rn rnVar = (rn) n2Var;
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, rnVar.i() != null ? rnVar.i() : rnVar.e)) {
                                rnVar.W9(user.id, str5, false);
                                break;
                            } else {
                                a02 = mc.a0(n2Var);
                                i10 = R.string.BotAlreadyAddedToAttachMenu;
                            }
                        } else {
                            a02 = mc.a0(n2Var);
                            i10 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    }
                } else {
                    a02 = mc.a0((org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList2));
                    i10 = R.string.BotCantAddToAttachMenu;
                }
                org.telegram.messenger.y1.r(i10, a02, null);
                break;
        }
    }

    public /* synthetic */ a1(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.e = launchActivity;
        this.b = tLObject;
        this.c = i10;
        this.f = str;
        this.h = str2;
        this.n = user;
        this.r = str3;
        this.d = j10;
    }
}
