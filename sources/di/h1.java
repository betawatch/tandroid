package di;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import bi.xe;
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
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.v6;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.da0;
import org.telegram.ui.eo;
import org.telegram.ui.qj1;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ h1(TLObject tLObject, int i10, org.telegram.ui.ActionBar.d2 d2Var, Context context, long j3, f6 f6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.g gVar) {
        this.b = tLObject;
        this.c = i10;
        this.e = d2Var;
        this.f = context;
        this.d = j3;
        this.h = f6Var;
        this.n = tVar;
        this.r = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc a02;
        int i10;
        wy wyVar;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.e;
                Context context = (Context) this.f;
                f6 f6Var = (f6) this.h;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.n;
                org.telegram.tgnet.g gVar = (org.telegram.tgnet.g) this.r;
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
                            i1 i1Var = new i1(d2Var, context, i11, j3, tL_messages_preparedInlineMessage, f6Var, tVar, gVar);
                            int[] iArr = new int[1];
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            iArr[0] = ConnectionsManager.getInstance(i11).sendRequestTyped(getwebpagepreview, new org.telegram.messenger.a(), new k1(iArr, i1Var, notificationCenterDelegateArr, i11, 0));
                            d2Var.setOnCancelListener(new xe(new bi.g3(iArr, i11, notificationCenterDelegateArr, 5), 1));
                            break;
                        }
                    }
                    File[] fileArr = new File[1];
                    j1 j1Var = new j1(d2Var, context, i11, j3, tL_messages_preparedInlineMessage, fileArr, f6Var, tVar, gVar);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str2 = botInlineResult.content.url;
                            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str2, null);
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str2) + (TextUtils.isEmpty(httpUrlExtension) ? FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type) : r6.i(".", httpUrlExtension)));
                            if (file.exists()) {
                                j1Var.run();
                                break;
                            } else {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new bi.y2(10, fileArr, j1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                d2Var.setOnCancelListener(new xe(httpGetFileTask, 2));
                                break;
                            }
                        }
                    }
                    j1Var.run();
                    break;
                } else {
                    gVar.run("MESSAGE_EXPIRED", null);
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
                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) hc.b.i(1, arrayList2);
                        if (AndroidUtilities.isTablet() && !(p2Var instanceof eo) && !arrayList.isEmpty()) {
                            p2Var = (org.telegram.ui.ActionBar.p2) hc.b.i(1, arrayList);
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
                            wyVar = null;
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
                            wyVar = new wy(bundle);
                            wyVar.C2 = new da0(launchActivity, user, str5, i12);
                        }
                        if (tL_attachMenuBot.inactive) {
                            v6 v6Var = new v6(launchActivity);
                            v6Var.setColor(j6.w0(null, j6.ia, false));
                            v6Var.setBackgroundColor(j6.w0(null, j6.L5, false));
                            v6Var.setAttachBot(tL_attachMenuBot);
                            final long j10 = this.d;
                            final wy wyVar2 = wyVar;
                            final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qj1.a(launchActivity, new e2.h() { // from class: org.telegram.ui.ea0
                                @Override // e2.h
                                public final void accept(Object obj) {
                                    Pattern pattern = LaunchActivity.B1;
                                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                    int i13 = i12;
                                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i13).getInputUser(j10);
                                    tL_messages_toggleBotInAttachMenu.enabled = true;
                                    tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                    ConnectionsManager.getInstance(i13).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.qi(LaunchActivity.this, i13, wyVar2, p2Var2, user, str5), 66);
                                }
                            }, null);
                            break;
                        } else if (wyVar != null) {
                            if (p2Var != null) {
                                p2Var.dismissCurrentDialog();
                            }
                            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                if (((Dialog) arrayList3.get(i13)).isShowing()) {
                                    ((Dialog) arrayList3.get(i13)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.p0(wyVar);
                            break;
                        } else if (p2Var instanceof eo) {
                            eo eoVar = (eo) p2Var;
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, eoVar.i() != null ? eoVar.i() : eoVar.e)) {
                                eoVar.W9(user.id, str5, false);
                                break;
                            } else {
                                a02 = wc.a0(p2Var);
                                i10 = R.string.BotAlreadyAddedToAttachMenu;
                            }
                        } else {
                            a02 = wc.a0(p2Var);
                            i10 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    }
                } else {
                    a02 = wc.a0((org.telegram.ui.ActionBar.p2) hc.b.i(1, arrayList2));
                    i10 = R.string.BotCantAddToAttachMenu;
                }
                org.telegram.messenger.a2.p(i10, a02, null);
                break;
        }
    }

    public /* synthetic */ h1(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j3) {
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
