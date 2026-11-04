package ii;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import gi.ob;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.ib;
import org.telegram.messenger.jb;
import org.telegram.messenger.k5;
import org.telegram.messenger.li;
import org.telegram.messenger.w7;
import org.telegram.messenger.zb;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.o6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r60;
import org.telegram.ui.rc1;
import org.telegram.ui.rp;
import org.telegram.ui.uw;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ z0(jb jbVar, int i3, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.d = jbVar;
        this.b = i3;
        this.e = str;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.c = j10;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.String, org.telegram.ui.ActionBar.e6] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // java.lang.Runnable
    public final void run() {
        uw uwVar;
        ?? r22;
        fc a02;
        int i3 = this.a;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.d;
        Object obj6 = this.e;
        switch (i3) {
            case 0:
                TLObject tLObject = (TLObject) obj5;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj6;
                Context context = (Context) obj4;
                e6 e6Var = (e6) obj3;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) obj2;
                ai.n0 n0Var = (ai.n0) obj;
                if (tLObject instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i10 = this.b;
                    long j10 = this.c;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            a1 a1Var = new a1(s1Var, context, i10, j10, tL_messages_preparedInlineMessage, e6Var, rVar, n0Var);
                            int[] iArr = new int[1];
                            cs[] csVarArr = new cs[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            iArr[0] = ConnectionsManager.getInstance(i10).sendRequestTyped(getwebpagepreview, new c3.b(1), new ci.o0(iArr, a1Var, csVarArr, i10, 2));
                            s1Var.setOnCancelListener(new ob(new ai.e3(iArr, i10, csVarArr, 16), 1));
                            break;
                        }
                    }
                    File[] fileArr = new File[1];
                    b1 b1Var = new b1(s1Var, context, i10, j10, tL_messages_preparedInlineMessage, fileArr, e6Var, rVar, n0Var);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str2 = botInlineResult.content.url;
                            String B = zb.B(str2, null);
                            String C = TextUtils.isEmpty(B) ? w7.C(tL_messages_preparedInlineMessage.result.content.mime_type) : t4.c.f(".", B);
                            File file = new File(w7.z(4), Utilities.a(str2) + C);
                            if (file.exists()) {
                                b1Var.run();
                                break;
                            } else {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new ai.o1(22, fileArr, b1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                s1Var.setOnCancelListener(new ob(httpGetFileTask, 2));
                                break;
                            }
                        }
                    }
                    b1Var.run();
                    break;
                } else {
                    n0Var.a("MESSAGE_EXPIRED", null);
                    break;
                }
                break;
            case 1:
                jb jbVar = (jb) obj5;
                String str3 = (String) obj6;
                jbVar.getClass();
                org.telegram.messenger.g0.h3(new ib(this.b, str3, (TLRPC.InputFile) obj4, (TLRPC.InputEncryptedFile) obj3, (byte[]) obj2, (byte[]) obj, this.c));
                jbVar.b.u.remove(str3);
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                ArrayList arrayList = launchActivity.g0;
                ArrayList arrayList2 = launchActivity.e0;
                ArrayList arrayList3 = launchActivity.F0;
                if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject2;
                    int i11 = this.b;
                    hp.s1(i11).Y3(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str4 != null) {
                        LaunchActivity.G0(launchActivity, launchActivity.P, tL_attachMenuBot, str4, false);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList2);
                        if (org.telegram.messenger.g0.Q1() && !(d2Var instanceof wm) && !arrayList.isEmpty()) {
                            d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!TextUtils.isEmpty(str5)) {
                            String[] split = str5.split(" ");
                            int length = split.length;
                            int i12 = 0;
                            while (i12 < length) {
                                String[] strArr = split;
                                String str7 = strArr[i12];
                                Pattern pattern = li.S1;
                                int i13 = length;
                                ArrayList<TLRPC.AttachMenuPeerType> arrayList5 = tL_attachMenuBot.peer_types;
                                int i14 = i12;
                                int size = arrayList5.size();
                                int i15 = 0;
                                while (i15 < size) {
                                    TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList5.get(i15);
                                    int i16 = i15 + 1;
                                    TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
                                    ArrayList<TLRPC.AttachMenuPeerType> arrayList6 = arrayList5;
                                    if ((((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) || (attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM)) && str7.equals("bots")) || (((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && str7.equals("channels")) || (((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) && str7.equals("groups")) || ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) && str7.equals("users"))))) {
                                        arrayList4.add(str7);
                                        i12 = i14 + 1;
                                        split = strArr;
                                        length = i13;
                                    } else {
                                        arrayList5 = arrayList6;
                                        i15 = i16;
                                    }
                                }
                                i12 = i14 + 1;
                                split = strArr;
                                length = i13;
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            uwVar = null;
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
                            uwVar = new uw(bundle);
                            uwVar.D2 = new r60(launchActivity, user, str6, i11);
                        }
                        if (tL_attachMenuBot.inactive) {
                            o6 o6Var = new o6(launchActivity);
                            o6Var.setColor(k6.x0(null, k6.ia, false));
                            r6.i(k6.L5, o6Var, null);
                            o6Var.setAttachBot(tL_attachMenuBot);
                            rc1.a(launchActivity, new rp(launchActivity, i11, this.c, uwVar, d2Var, user, str6), null);
                            break;
                        } else {
                            if (uwVar != null) {
                                if (d2Var != null) {
                                    d2Var.dismissCurrentDialog();
                                }
                                for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                    if (((Dialog) arrayList3.get(i17)).isShowing()) {
                                        ((Dialog) arrayList3.get(i17)).dismiss();
                                    }
                                }
                                arrayList3.clear();
                                launchActivity.t0(uwVar);
                            } else {
                                if (d2Var instanceof wm) {
                                    wm wmVar = (wm) d2Var;
                                    if (li.t(tL_attachMenuBot, wmVar.j() != null ? wmVar.j() : wmVar.e)) {
                                        wmVar.wa(user.id, str6, false);
                                    } else {
                                        a02 = fc.a0(d2Var);
                                        r22 = 0;
                                    }
                                } else {
                                    r22 = 0;
                                    a02 = fc.a0(d2Var);
                                }
                                k5.p(r22, 2131753140, a02, r22);
                            }
                            break;
                        }
                    }
                } else {
                    k5.p(null, 2131753109, fc.a0((org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList2)), null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z0(TLObject tLObject, int i3, org.telegram.ui.ActionBar.s1 s1Var, Context context, long j10, e6 e6Var, org.telegram.ui.web.r rVar, ai.n0 n0Var) {
        this.d = tLObject;
        this.b = i3;
        this.e = s1Var;
        this.f = context;
        this.c = j10;
        this.h = e6Var;
        this.n = rVar;
        this.r = n0Var;
    }

    public /* synthetic */ z0(LaunchActivity launchActivity, TLObject tLObject, int i3, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.e = launchActivity;
        this.d = tLObject;
        this.b = i3;
        this.f = str;
        this.h = str2;
        this.n = user;
        this.r = str3;
        this.c = j10;
    }
}
