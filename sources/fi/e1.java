package fi;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import di.id;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.x6;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import org.telegram.ui.ea0;
import org.telegram.ui.mj1;
import org.telegram.ui.uy;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ e1(TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j3, f6 f6Var, org.telegram.ui.web.u uVar, org.telegram.tgnet.e eVar) {
        this.b = tLObject;
        this.c = i10;
        this.e = b2Var;
        this.f = context;
        this.d = j3;
        this.h = f6Var;
        this.n = uVar;
        this.r = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yc a02;
        int i10;
        uy uyVar;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                Context context = (Context) this.f;
                f6 f6Var = (f6) this.h;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.n;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.r;
                TLObject tLObject = this.b;
                if (tLObject instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i11 = this.c;
                    long j3 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            f1 f1Var = new f1(b2Var, context, i11, j3, tL_messages_preparedInlineMessage, f6Var, uVar, eVar);
                            int[] iArr = new int[1];
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            iArr[0] = ConnectionsManager.getInstance(i11).sendRequestTyped(getwebpagepreview, new org.telegram.messenger.a(), new h1(iArr, f1Var, notificationCenterDelegateArr, i11, 0));
                            b2Var.setOnCancelListener(new id(new ah.p(iArr, i11, notificationCenterDelegateArr, 10), 1));
                            break;
                        }
                    }
                    File[] fileArr = new File[1];
                    g1 g1Var = new g1(b2Var, context, i11, j3, tL_messages_preparedInlineMessage, fileArr, f6Var, uVar, eVar);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str2 = botInlineResult.content.url;
                            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str2, null);
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str2) + (TextUtils.isEmpty(httpUrlExtension) ? FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type) : p6.i(".", httpUrlExtension)));
                            if (file.exists()) {
                                g1Var.run();
                                break;
                            } else {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new di.m2(10, fileArr, g1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                b2Var.setOnCancelListener(new id(httpGetFileTask, 2));
                                break;
                            }
                        }
                    }
                    g1Var.run();
                    break;
                } else {
                    eVar.run("MESSAGE_EXPIRED", null);
                    break;
                }
                break;
            default:
                final LaunchActivity launchActivity = (LaunchActivity) this.e;
                String str3 = (String) this.f;
                String str4 = (String) this.h;
                final TLRPC.User user = (TLRPC.User) this.n;
                final String str5 = (String) this.r;
                ArrayList arrayList = launchActivity.f0;
                ArrayList arrayList2 = launchActivity.d0;
                ArrayList arrayList3 = launchActivity.E0;
                TLObject tLObject2 = this.b;
                if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject2;
                    final int i12 = this.c;
                    MessagesController.getInstance(i12).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str3 != null) {
                        LaunchActivity.C0(launchActivity, launchActivity.O, tL_attachMenuBot, str3, false);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) i2.g.h(1, arrayList2);
                        if (AndroidUtilities.isTablet() && !(n2Var instanceof co) && !arrayList.isEmpty()) {
                            n2Var = (org.telegram.ui.ActionBar.n2) i2.g.h(1, arrayList);
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
                            uyVar = null;
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
                            uyVar = new uy(bundle);
                            uyVar.C2 = new ea0(launchActivity, user, str5, i12);
                        }
                        if (tL_attachMenuBot.inactive) {
                            x6 x6Var = new x6(launchActivity);
                            x6Var.setColor(j6.w0(null, j6.ia, false));
                            x6Var.setBackgroundColor(j6.w0(null, j6.L5, false));
                            x6Var.setAttachBot(tL_attachMenuBot);
                            final long j10 = this.d;
                            final uy uyVar2 = uyVar;
                            final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            mj1.a(launchActivity, new e2.h() { // from class: org.telegram.ui.fa0
                                @Override // e2.h
                                public final void accept(Object obj) {
                                    Pattern pattern = LaunchActivity.B1;
                                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                    int i13 = i12;
                                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i13).getInputUser(j10);
                                    tL_messages_toggleBotInAttachMenu.enabled = true;
                                    tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                    ConnectionsManager.getInstance(i13).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.ii(LaunchActivity.this, i13, uyVar2, n2Var2, user, str5), 66);
                                }
                            }, null);
                            break;
                        } else if (uyVar != null) {
                            if (n2Var != null) {
                                n2Var.dismissCurrentDialog();
                            }
                            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                if (((Dialog) arrayList3.get(i13)).isShowing()) {
                                    ((Dialog) arrayList3.get(i13)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.p0(uyVar);
                            break;
                        } else if (n2Var instanceof co) {
                            co coVar = (co) n2Var;
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, coVar.i() != null ? coVar.i() : coVar.e)) {
                                coVar.W9(user.id, str5, false);
                                break;
                            } else {
                                a02 = yc.a0(n2Var);
                                i10 = R.string.BotAlreadyAddedToAttachMenu;
                            }
                        } else {
                            a02 = yc.a0(n2Var);
                            i10 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    }
                } else {
                    a02 = yc.a0((org.telegram.ui.ActionBar.n2) i2.g.h(1, arrayList2));
                    i10 = R.string.BotCantAddToAttachMenu;
                }
                org.telegram.messenger.w1.p(i10, a02, null);
                break;
        }
    }

    public /* synthetic */ e1(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.e = launchActivity;
        this.b = tLObject;
        this.c = i10;
        this.f = str;
        this.h = str2;
        this.n = user;
        this.r = str3;
        this.d = j3;
    }
}
