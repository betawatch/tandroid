package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
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
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e90 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ e90(TLObject tLObject, int i10, org.telegram.ui.ActionBar.c2 c2Var, Context context, long j10, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.web.u uVar, bh.v vVar) {
        this.b = tLObject;
        this.c = i10;
        this.e = c2Var;
        this.f = context;
        this.d = j10;
        this.h = c6Var;
        this.n = uVar;
        this.r = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.tc a02;
        int i10;
        fy fyVar;
        switch (this.a) {
            case 0:
                final LaunchActivity launchActivity = (LaunchActivity) this.e;
                String str = (String) this.f;
                String str2 = (String) this.h;
                final TLRPC.User user = (TLRPC.User) this.r;
                final String str3 = (String) this.n;
                ArrayList arrayList = launchActivity.b0;
                ArrayList arrayList2 = launchActivity.Z;
                ArrayList arrayList3 = launchActivity.A0;
                TLObject tLObject = this.b;
                if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
                    final int i11 = this.c;
                    MessagesController.getInstance(i11).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str != null) {
                        LaunchActivity.C0(launchActivity, launchActivity.K, tL_attachMenuBot, str, false);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList2);
                        if (AndroidUtilities.isTablet() && !(o2Var instanceof tn) && !arrayList.isEmpty()) {
                            o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!TextUtils.isEmpty(str2)) {
                            for (String str4 : str2.split(" ")) {
                                if (MediaDataController.canShowAttachMenuBotForTarget(tL_attachMenuBot, str4)) {
                                    arrayList4.add(str4);
                                }
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            fyVar = null;
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
                            fyVar = new fy(bundle);
                            fyVar.y2 = new m90(launchActivity, user, str3, i11);
                        }
                        if (tL_attachMenuBot.inactive) {
                            org.telegram.ui.Components.v6 v6Var = new org.telegram.ui.Components.v6(launchActivity);
                            v6Var.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ia, false));
                            v6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false));
                            v6Var.setAttachBot(tL_attachMenuBot);
                            final long j10 = this.d;
                            final fy fyVar2 = fyVar;
                            final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            gi1.a(launchActivity, new f5.d() { // from class: org.telegram.ui.n90
                                @Override // f5.d
                                public final void accept(Object obj) {
                                    Pattern pattern = LaunchActivity.x1;
                                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                    int i12 = i11;
                                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(j10);
                                    tL_messages_toggleBotInAttachMenu.enabled = true;
                                    tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.gi(LaunchActivity.this, i12, fyVar2, o2Var2, user, str3), 66);
                                }
                            }, null);
                            break;
                        } else if (fyVar != null) {
                            if (o2Var != null) {
                                o2Var.dismissCurrentDialog();
                            }
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                if (((Dialog) arrayList3.get(i12)).isShowing()) {
                                    ((Dialog) arrayList3.get(i12)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.p0(fyVar);
                            break;
                        } else if (o2Var instanceof tn) {
                            tn tnVar = (tn) o2Var;
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tnVar.i() != null ? tnVar.i() : tnVar.e)) {
                                tnVar.W9(user.id, str3, false);
                                break;
                            } else {
                                a02 = org.telegram.ui.Components.tc.a0(o2Var);
                                i10 = R.string.BotAlreadyAddedToAttachMenu;
                            }
                        } else {
                            a02 = org.telegram.ui.Components.tc.a0(o2Var);
                            i10 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    }
                } else {
                    a02 = org.telegram.ui.Components.tc.a0((org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList2));
                    i10 = R.string.BotCantAddToAttachMenu;
                }
                org.telegram.messenger.x3.s(i10, a02, null);
                break;
            default:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
                Context context = (Context) this.f;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.h;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.n;
                bh.v vVar = (bh.v) this.r;
                TLObject tLObject2 = this.b;
                if (tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i13 = this.c;
                    long j11 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str5 = tL_botInlineMessageMediaWebPage.url;
                            ph.w0 w0Var = new ph.w0(c2Var, context, i13, j11, tL_messages_preparedInlineMessage, c6Var, uVar, vVar);
                            int[] iArr = new int[1];
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str5;
                            iArr[0] = ConnectionsManager.getInstance(i13).sendRequestTyped(getwebpagepreview, new org.telegram.messenger.a(), new jh.i0(iArr, w0Var, notificationCenterDelegateArr, i13, 6));
                            c2Var.setOnCancelListener(new nh.zb(new ll0(iArr, i13, notificationCenterDelegateArr, 12), 1));
                            break;
                        }
                    }
                    File[] fileArr = new File[1];
                    org.telegram.ui.Components.m70 m70Var = new org.telegram.ui.Components.m70(c2Var, context, i13, j11, tL_messages_preparedInlineMessage, fileArr, c6Var, uVar, vVar);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str6 = botInlineResult.content.url;
                            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str6, null);
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str6) + (TextUtils.isEmpty(httpUrlExtension) ? FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type) : u3.c.e(".", httpUrlExtension)));
                            if (file.exists()) {
                                m70Var.run();
                                break;
                            } else {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new yu0(12, fileArr, m70Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str6);
                                c2Var.setOnCancelListener(new nh.zb(httpGetFileTask, 2));
                                break;
                            }
                        }
                    }
                    m70Var.run();
                    break;
                } else {
                    vVar.run("MESSAGE_EXPIRED", null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e90(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.e = launchActivity;
        this.b = tLObject;
        this.c = i10;
        this.f = str;
        this.h = str2;
        this.r = user;
        this.n = str3;
        this.d = j10;
    }
}
