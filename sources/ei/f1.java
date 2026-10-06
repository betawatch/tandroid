package ei;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import ci.ed;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.w6;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cj1;
import org.telegram.ui.da0;
import org.telegram.ui.uy;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.wq;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ f1(TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j3, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.b = tLObject;
        this.c = i10;
        this.e = b2Var;
        this.f = context;
        this.d = j3;
        this.h = d6Var;
        this.n = sVar;
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
                d6 d6Var = (d6) this.h;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.n;
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
                            g1 g1Var = new g1(b2Var, context, i11, j3, tL_messages_preparedInlineMessage, d6Var, sVar, eVar);
                            int[] iArr = new int[1];
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            iArr[0] = ConnectionsManager.getInstance(i11).sendRequestTyped(getwebpagepreview, new org.telegram.messenger.a(), new i1(iArr, g1Var, notificationCenterDelegateArr, i11, 0));
                            b2Var.setOnCancelListener(new ed(new ai.s1(iArr, i11, notificationCenterDelegateArr, 9), 1));
                            break;
                        }
                    }
                    File[] fileArr = new File[1];
                    h1 h1Var = new h1(b2Var, context, i11, j3, tL_messages_preparedInlineMessage, fileArr, d6Var, sVar, eVar);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str2 = botInlineResult.content.url;
                            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str2, null);
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str2) + (TextUtils.isEmpty(httpUrlExtension) ? FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type) : sa.e.i(".", httpUrlExtension)));
                            if (file.exists()) {
                                h1Var.run();
                                break;
                            } else {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new ai.g3(11, fileArr, h1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                b2Var.setOnCancelListener(new ed(httpGetFileTask, 2));
                                break;
                            }
                        }
                    }
                    h1Var.run();
                    break;
                } else {
                    eVar.run("MESSAGE_EXPIRED", null);
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.e;
                String str3 = (String) this.f;
                String str4 = (String) this.h;
                TLRPC.User user = (TLRPC.User) this.n;
                String str5 = (String) this.r;
                ArrayList arrayList = launchActivity.f0;
                ArrayList arrayList2 = launchActivity.d0;
                ArrayList arrayList3 = launchActivity.E0;
                TLObject tLObject2 = this.b;
                if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject2;
                    int i12 = this.c;
                    MessagesController.getInstance(i12).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str3 != null) {
                        LaunchActivity.C0(launchActivity, launchActivity.O, tL_attachMenuBot, str3, false);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) hg.c.g(1, arrayList2);
                        if (AndroidUtilities.isTablet() && !(n2Var instanceof yn) && !arrayList.isEmpty()) {
                            n2Var = (org.telegram.ui.ActionBar.n2) hg.c.g(1, arrayList);
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
                            uyVar.C2 = new da0(launchActivity, user, str5, i12);
                        }
                        if (tL_attachMenuBot.inactive) {
                            w6 w6Var = new w6(launchActivity);
                            w6Var.setColor(i6.w0(null, i6.ia, false));
                            w6Var.setBackgroundColor(i6.w0(null, i6.L5, false));
                            w6Var.setAttachBot(tL_attachMenuBot);
                            cj1.a(launchActivity, new wq(launchActivity, i12, this.d, uyVar, n2Var, user, str5), null);
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
                        } else if (n2Var instanceof yn) {
                            yn ynVar = (yn) n2Var;
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, ynVar.i() != null ? ynVar.i() : ynVar.e)) {
                                ynVar.V9(user.id, str5, false);
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
                    a02 = yc.a0((org.telegram.ui.ActionBar.n2) hg.c.g(1, arrayList2));
                    i10 = R.string.BotCantAddToAttachMenu;
                }
                bi.o(i10, a02, null);
                break;
        }
    }

    public /* synthetic */ f1(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j3) {
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
