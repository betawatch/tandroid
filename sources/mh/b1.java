package mh;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kh.pc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.q6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dy;
import org.telegram.ui.fi1;
import org.telegram.ui.i90;
import org.telegram.ui.qn;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ b1(TLObject tLObject, int i9, org.telegram.ui.ActionBar.c2 c2Var, Context context, long j10, b6 b6Var, org.telegram.ui.web.t tVar, bg.y0 y0Var) {
        this.b = tLObject;
        this.c = i9;
        this.e = c2Var;
        this.f = context;
        this.d = j10;
        this.h = b6Var;
        this.n = tVar;
        this.r = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oc a02;
        int i9;
        dy dyVar;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
                Context context = (Context) this.f;
                b6 b6Var = (b6) this.h;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.n;
                bg.y0 y0Var = (bg.y0) this.r;
                TLObject tLObject = this.b;
                if (tLObject instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i10 = this.c;
                    long j10 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            c1 c1Var = new c1(c2Var, context, i10, j10, tL_messages_preparedInlineMessage, b6Var, tVar, y0Var);
                            int[] iArr = new int[1];
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            iArr[0] = ConnectionsManager.getInstance(i10).sendRequestTyped(getwebpagepreview, new org.telegram.messenger.a(), new gh.j0(iArr, c1Var, notificationCenterDelegateArr, i10, 1));
                            c2Var.setOnCancelListener(new pc(new d5.i(iArr, i10, notificationCenterDelegateArr, 16), 1));
                            break;
                        }
                    }
                    File[] fileArr = new File[1];
                    d1 d1Var = new d1(c2Var, context, i10, j10, tL_messages_preparedInlineMessage, fileArr, b6Var, tVar, y0Var);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str2 = botInlineResult.content.url;
                            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str2, null);
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str2) + (TextUtils.isEmpty(httpUrlExtension) ? FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type) : ta.b.d(".", httpUrlExtension)));
                            if (file.exists()) {
                                d1Var.run();
                                break;
                            } else {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new fh.f1(19, fileArr, d1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                c2Var.setOnCancelListener(new pc(httpGetFileTask, 2));
                                break;
                            }
                        }
                    }
                    d1Var.run();
                    break;
                } else {
                    y0Var.run("MESSAGE_EXPIRED", null);
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
                    final int i11 = this.c;
                    MessagesController.getInstance(i11).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str3 != null) {
                        LaunchActivity.C0(launchActivity, launchActivity.K, tL_attachMenuBot, str3, false);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList2);
                        if (AndroidUtilities.isTablet() && !(o2Var instanceof qn) && !arrayList.isEmpty()) {
                            o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList);
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
                            dyVar = null;
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
                            dyVar = new dy(bundle);
                            dyVar.y2 = new i90(launchActivity, user, str5, i11);
                        }
                        if (tL_attachMenuBot.inactive) {
                            q6 q6Var = new q6(launchActivity);
                            q6Var.setColor(f6.w0(null, f6.ia, false));
                            q6Var.setBackgroundColor(f6.w0(null, f6.L5, false));
                            q6Var.setAttachBot(tL_attachMenuBot);
                            final long j11 = this.d;
                            final dy dyVar2 = dyVar;
                            final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            fi1.a(launchActivity, new d5.d() { // from class: org.telegram.ui.j90
                                @Override // d5.d
                                public final void accept(Object obj) {
                                    Pattern pattern = LaunchActivity.x1;
                                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                    int i12 = i11;
                                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(j11);
                                    tL_messages_toggleBotInAttachMenu.enabled = true;
                                    tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.zh(LaunchActivity.this, i12, dyVar2, o2Var2, user, str5), 66);
                                }
                            }, null);
                            break;
                        } else if (dyVar != null) {
                            if (o2Var != null) {
                                o2Var.dismissCurrentDialog();
                            }
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                if (((Dialog) arrayList3.get(i12)).isShowing()) {
                                    ((Dialog) arrayList3.get(i12)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.p0(dyVar);
                            break;
                        } else if (o2Var instanceof qn) {
                            qn qnVar = (qn) o2Var;
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, qnVar.i() != null ? qnVar.i() : qnVar.e)) {
                                qnVar.W9(user.id, str5, false);
                                break;
                            } else {
                                a02 = oc.a0(o2Var);
                                i9 = R.string.BotAlreadyAddedToAttachMenu;
                            }
                        } else {
                            a02 = oc.a0(o2Var);
                            i9 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    }
                } else {
                    a02 = oc.a0((org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList2));
                    i9 = R.string.BotCantAddToAttachMenu;
                }
                ll.p(i9, a02, null);
                break;
        }
    }

    public /* synthetic */ b1(LaunchActivity launchActivity, TLObject tLObject, int i9, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.e = launchActivity;
        this.b = tLObject;
        this.c = i9;
        this.f = str;
        this.h = str2;
        this.n = user;
        this.r = str3;
        this.d = j10;
    }
}
