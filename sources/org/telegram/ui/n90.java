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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n90 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ n90(TLObject tLObject, int i10, org.telegram.ui.ActionBar.d2 d2Var, Context context, long j10, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.web.u uVar, eh.w wVar) {
        this.b = tLObject;
        this.c = i10;
        this.e = d2Var;
        this.f = context;
        this.d = j10;
        this.h = g6Var;
        this.n = uVar;
        this.r = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.qc a02;
        int i10;
        py pyVar;
        switch (this.a) {
            case 0:
                final LaunchActivity launchActivity = (LaunchActivity) this.e;
                String str = (String) this.f;
                String str2 = (String) this.h;
                final TLRPC.User user = (TLRPC.User) this.r;
                final String str3 = (String) this.n;
                ArrayList arrayList = launchActivity.c0;
                ArrayList arrayList2 = launchActivity.a0;
                ArrayList arrayList3 = launchActivity.B0;
                TLObject tLObject = this.b;
                if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
                    final int i11 = this.c;
                    MessagesController.getInstance(i11).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str != null) {
                        LaunchActivity.C0(launchActivity, launchActivity.L, tL_attachMenuBot, str, false);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) l.d.i(1, arrayList2);
                        if (AndroidUtilities.isTablet() && !(p2Var instanceof xn) && !arrayList.isEmpty()) {
                            p2Var = (org.telegram.ui.ActionBar.p2) l.d.i(1, arrayList);
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
                            pyVar = null;
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
                            pyVar = new py(bundle);
                            pyVar.z2 = new v90(launchActivity, user, str3, i11);
                        }
                        if (tL_attachMenuBot.inactive) {
                            org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(launchActivity);
                            r6Var.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ia, false));
                            r6Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L5, false));
                            r6Var.setAttachBot(tL_attachMenuBot);
                            final long j10 = this.d;
                            final py pyVar2 = pyVar;
                            final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            vi1.a(launchActivity, new h5.d() { // from class: org.telegram.ui.w90
                                @Override // h5.d
                                public final void accept(Object obj) {
                                    Pattern pattern = LaunchActivity.y1;
                                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                    int i12 = i11;
                                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(j10);
                                    tL_messages_toggleBotInAttachMenu.enabled = true;
                                    tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.li(LaunchActivity.this, i12, pyVar2, p2Var2, user, str3), 66);
                                }
                            }, null);
                            break;
                        } else if (pyVar != null) {
                            if (p2Var != null) {
                                p2Var.dismissCurrentDialog();
                            }
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                if (((Dialog) arrayList3.get(i12)).isShowing()) {
                                    ((Dialog) arrayList3.get(i12)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.p0(pyVar);
                            break;
                        } else if (p2Var instanceof xn) {
                            xn xnVar = (xn) p2Var;
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, xnVar.i() != null ? xnVar.i() : xnVar.e)) {
                                xnVar.W9(user.id, str3, false);
                                break;
                            } else {
                                a02 = org.telegram.ui.Components.qc.a0(p2Var);
                                i10 = R.string.BotAlreadyAddedToAttachMenu;
                            }
                        } else {
                            a02 = org.telegram.ui.Components.qc.a0(p2Var);
                            i10 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    }
                } else {
                    a02 = org.telegram.ui.Components.qc.a0((org.telegram.ui.ActionBar.p2) l.d.i(1, arrayList2));
                    i10 = R.string.BotCantAddToAttachMenu;
                }
                org.telegram.messenger.y3.s(i10, a02, null);
                break;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.e;
                Context context = (Context) this.f;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.h;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.n;
                eh.w wVar = (eh.w) this.r;
                TLObject tLObject2 = this.b;
                if (tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z4 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i13 = this.c;
                    long j11 = this.d;
                    if (z4) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str5 = tL_botInlineMessageMediaWebPage.url;
                            sh.w0 w0Var = new sh.w0(d2Var, context, i13, j11, tL_messages_preparedInlineMessage, g6Var, uVar, wVar);
                            int[] iArr = new int[1];
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str5;
                            iArr[0] = ConnectionsManager.getInstance(i13).sendRequestTyped(getwebpagepreview, new org.telegram.messenger.a(), new mh.h0(iArr, w0Var, notificationCenterDelegateArr, i13, 6));
                            d2Var.setOnCancelListener(new qh.ua(new bu0(iArr, i13, notificationCenterDelegateArr, 15), 1));
                            break;
                        }
                    }
                    File[] fileArr = new File[1];
                    org.telegram.ui.Components.t70 t70Var = new org.telegram.ui.Components.t70(d2Var, context, i13, j11, tL_messages_preparedInlineMessage, fileArr, g6Var, uVar, wVar);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str6 = botInlineResult.content.url;
                            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str6, null);
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str6) + (TextUtils.isEmpty(httpUrlExtension) ? FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type) : yh.k(".", httpUrlExtension)));
                            if (file.exists()) {
                                t70Var.run();
                                break;
                            } else {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new org.telegram.ui.web.v1(12, fileArr, t70Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str6);
                                d2Var.setOnCancelListener(new qh.ua(httpGetFileTask, 2));
                                break;
                            }
                        }
                    }
                    t70Var.run();
                    break;
                } else {
                    wVar.run("MESSAGE_EXPIRED", null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n90(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
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
