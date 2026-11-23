package ii;

import ai.j1;
import ai.y1;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import bi.h0;
import di.e0;
import di.j0;
import di.y8;
import hi.lb;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import ki.x0;
import ki.y0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.fc;
import org.telegram.messenger.g0;
import org.telegram.messenger.gs;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ob;
import org.telegram.messenger.pb;
import org.telegram.messenger.r10;
import org.telegram.messenger.si;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.v6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.u0;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.wp;
import org.telegram.ui.y60;
import org.telegram.ui.zc1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ long n;
    public final /* synthetic */ Object r;

    public /* synthetic */ i(int i7, TLRPC.TL_error tL_error, r10 r10Var, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, Runnable runnable, g2 g2Var, long j3) {
        this.b = i7;
        this.c = tL_error;
        this.d = r10Var;
        this.r = inputCheckPasswordSRP;
        this.e = twoStepVerificationActivity;
        this.f = runnable;
        this.h = g2Var;
        this.n = j3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03fc, code lost:
    
        if (r3.equals("WALLET_CREATING") == false) goto L131;
     */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.String, org.telegram.ui.ActionBar.h6] */
    /* JADX WARN: Type inference failed for: r3v27 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        String str;
        int i7;
        lc Y;
        int i10;
        cx cxVar;
        ?? r32;
        lc b02;
        int i11 = this.a;
        boolean[] zArr = n.a;
        int i12 = this.b;
        char c10 = 2;
        Object obj = this.f;
        Object obj2 = this.d;
        Object obj3 = this.h;
        Object obj4 = this.e;
        Object obj5 = this.r;
        Object obj6 = this.c;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                TLObject tLObject = (TLObject) obj5;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj4;
                g2 g2Var = (g2) obj3;
                r10 r10Var = (r10) obj2;
                Runnable runnable = (Runnable) obj;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    n.b(g2Var, this.n, twoStepVerificationActivity.q0(), twoStepVerificationActivity, r10Var, runnable);
                    break;
                } else {
                    zArr[i12] = false;
                    twoStepVerificationActivity.t0();
                    lc.e0(tL_error);
                    break;
                }
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj6;
                r10 r10Var2 = (r10) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj5;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) obj4;
                Runnable runnable2 = (Runnable) obj;
                g2 g2Var2 = (g2) obj3;
                zArr[i12] = false;
                if (tL_error2 != null && (("API_WITHDRAWAL_FEATURE_DISABLED".equals(tL_error2.text) || "FEATURE_DISABLED".equals(tL_error2.text)) && r10Var2 != null)) {
                    r10Var2.a(inputCheckPasswordSRP, twoStepVerificationActivity2);
                    break;
                } else {
                    twoStepVerificationActivity2.t0();
                    if (!n.h(tL_error2, twoStepVerificationActivity2)) {
                        twoStepVerificationActivity2.finishFragment();
                        if (tL_error2 != null) {
                            String str2 = tL_error2.text;
                            if (str2 == null || !str2.startsWith("FLOOD_WAIT")) {
                                str = null;
                                String str3 = tL_error2.text;
                                if (str3 == null || !str3.startsWith("TMP_PASSWORD")) {
                                    String str4 = tL_error2.text;
                                    str4.getClass();
                                    switch (str4.hashCode()) {
                                        case -1154072843:
                                            if (str4.equals("AMOUNT_TOO_SMALL")) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -577854011:
                                            if (str4.equals("FEATURE_DISABLED")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -456249281:
                                            break;
                                        case 54255434:
                                            if (str4.equals("API_WITHDRAWAL_FEATURE_DISABLED")) {
                                                c10 = 3;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 367129409:
                                            if (str4.equals("STARS_REVENUE_ONLY_TON")) {
                                                c10 = 4;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1149363434:
                                            if (str4.equals("WALLET_UNAVAILABLE")) {
                                                c10 = 5;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1810617411:
                                            if (str4.equals("AVAILABLE_BALANCE_TOO_SMALL")) {
                                                c10 = 6;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        default:
                                            c10 = 65535;
                                            break;
                                    }
                                    switch (c10) {
                                        case 0:
                                        case 6:
                                            i7 = 2131749326;
                                            break;
                                        case 1:
                                        case 3:
                                            i7 = 2131749319;
                                            break;
                                        case 2:
                                            i7 = 2131749622;
                                            break;
                                        case 4:
                                            i7 = 2131749325;
                                            break;
                                        case 5:
                                            i7 = 2131749620;
                                            break;
                                        default:
                                            i7 = 0;
                                            break;
                                    }
                                    if (i7 != 0) {
                                        f3.n(null, i7, runnable2 != null ? lc.Y() : lc.b0(g2Var2), R.raw.error, 36);
                                        break;
                                    } else {
                                        lc.e0(tL_error2);
                                        break;
                                    }
                                } else {
                                    Y = lc.Y();
                                    i10 = 2131749320;
                                }
                            } else {
                                Y = lc.Y();
                                i10 = 2131750670;
                                str = null;
                            }
                            f3.n(str, i10, Y, R.raw.error, 36);
                            break;
                        } else {
                            if (runnable2 != null) {
                                runnable2.run();
                                z10 = true;
                            } else {
                                int currentAccount = g2Var2.getCurrentAccount();
                                m mVar = new m(currentAccount, this.n, g2Var2);
                                n.b[currentAccount] = mVar;
                                ls.f(currentAccount).k(ls.B3, new Object[0]);
                                g0.h3(new g(mVar, 0), 1000L);
                                z10 = true;
                                if (r10Var2 != null) {
                                    y8.y(i12, true).R(true);
                                }
                            }
                            y8.y(i12, z10).N();
                            e0.g(i12).l(k10.i(i12).e());
                            e0.g(i12).j(k10.i(i12).e(), z10);
                            u0.D(i12).K();
                            break;
                        }
                    }
                }
                break;
            case 2:
                TLObject tLObject2 = (TLObject) obj5;
                t1 t1Var = (t1) obj6;
                Context context = (Context) obj4;
                h6 h6Var = (h6) obj3;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) obj2;
                h0 h0Var = (h0) obj;
                if (tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z11 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i13 = this.b;
                    long j3 = this.n;
                    if (z11) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str5 = tL_botInlineMessageMediaWebPage.url;
                            x0 x0Var = new x0(t1Var, context, i13, j3, tL_messages_preparedInlineMessage, h6Var, qVar, h0Var);
                            int[] iArr = new int[1];
                            gs[] gsVarArr = new gs[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str5;
                            iArr[0] = ConnectionsManager.getInstance(i13).sendRequestTyped(getwebpagepreview, new d3.b(1), new j0(iArr, x0Var, gsVarArr, i13, 2));
                            t1Var.setOnCancelListener(new lb(new j1(iArr, i13, gsVarArr, 20), 1));
                            break;
                        }
                    }
                    File[] fileArr = new File[1];
                    y0 y0Var = new y0(t1Var, context, i13, j3, tL_messages_preparedInlineMessage, fileArr, h6Var, qVar, h0Var);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str6 = botInlineResult.content.url;
                            String B = fc.B(str6, null);
                            String C = TextUtils.isEmpty(B) ? w7.C(tL_messages_preparedInlineMessage.result.content.mime_type) : p5.c.k(".", B);
                            File file = new File(w7.z(4), Utilities.a(str6) + C);
                            if (file.exists()) {
                                y0Var.run();
                                break;
                            } else {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new y1(28, fileArr, y0Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str6);
                                t1Var.setOnCancelListener(new lb(httpGetFileTask, 2));
                                break;
                            }
                        }
                    }
                    y0Var.run();
                    break;
                } else {
                    h0Var.a("MESSAGE_EXPIRED", null);
                    break;
                }
            case 3:
                pb pbVar = (pb) obj6;
                String str7 = (String) obj5;
                pbVar.getClass();
                g0.g3(new ob(this.b, str7, (TLRPC.InputFile) obj4, (TLRPC.InputEncryptedFile) obj3, (byte[]) obj2, (byte[]) obj, this.n));
                pbVar.b.u.remove(str7);
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLObject tLObject3 = (TLObject) obj5;
                String str8 = (String) obj4;
                String str9 = (String) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str10 = (String) obj;
                ArrayList arrayList = launchActivity.g0;
                ArrayList arrayList2 = launchActivity.e0;
                ArrayList arrayList3 = launchActivity.D0;
                if (tLObject3 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject3;
                    int i14 = this.b;
                    np.u1(i14).f4(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str8 != null) {
                        LaunchActivity.G0(launchActivity, launchActivity.P, tL_attachMenuBot, str8, false);
                        break;
                    } else {
                        g2 g2Var3 = (g2) i5.c.h(1, arrayList2);
                        if (g0.Q1() && !(g2Var3 instanceof bn) && !arrayList.isEmpty()) {
                            g2Var3 = (g2) i5.c.h(1, arrayList);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!TextUtils.isEmpty(str9)) {
                            String[] split = str9.split(" ");
                            int length = split.length;
                            int i15 = 0;
                            while (i15 < length) {
                                String[] strArr = split;
                                String str11 = strArr[i15];
                                Pattern pattern = si.U1;
                                int i16 = length;
                                ArrayList<TLRPC.AttachMenuPeerType> arrayList5 = tL_attachMenuBot.peer_types;
                                int i17 = i15;
                                int size = arrayList5.size();
                                int i18 = 0;
                                while (i18 < size) {
                                    TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList5.get(i18);
                                    int i19 = i18 + 1;
                                    TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
                                    ArrayList<TLRPC.AttachMenuPeerType> arrayList6 = arrayList5;
                                    if ((((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) || (attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM)) && str11.equals("bots")) || (((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && str11.equals("channels")) || (((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) && str11.equals("groups")) || ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) && str11.equals("users"))))) {
                                        arrayList4.add(str11);
                                        i15 = i17 + 1;
                                        split = strArr;
                                        length = i16;
                                    } else {
                                        arrayList5 = arrayList6;
                                        i18 = i19;
                                    }
                                }
                                i15 = i17 + 1;
                                split = strArr;
                                length = i16;
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            cxVar = null;
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
                            cxVar = new cx(bundle);
                            cxVar.E2 = new y60(launchActivity, user, str10, i14);
                        }
                        if (tL_attachMenuBot.inactive) {
                            v6 v6Var = new v6(launchActivity);
                            v6Var.setColor(m6.x0(null, m6.ia, false));
                            t6.h(m6.L5, v6Var, null);
                            v6Var.setAttachBot(tL_attachMenuBot);
                            zc1.a(launchActivity, new wp(launchActivity, i14, this.n, cxVar, g2Var3, user, str10), null);
                            break;
                        } else {
                            if (cxVar != null) {
                                if (g2Var3 != null) {
                                    g2Var3.dismissCurrentDialog();
                                }
                                for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                                    if (((Dialog) arrayList3.get(i20)).isShowing()) {
                                        ((Dialog) arrayList3.get(i20)).dismiss();
                                    }
                                }
                                arrayList3.clear();
                                launchActivity.t0(cxVar);
                            } else {
                                if (g2Var3 instanceof bn) {
                                    bn bnVar = (bn) g2Var3;
                                    if (si.v(tL_attachMenuBot, bnVar.j() != null ? bnVar.j() : bnVar.e)) {
                                        bnVar.za(user.id, str10, false);
                                    } else {
                                        b02 = lc.b0(g2Var3);
                                        r32 = 0;
                                    }
                                } else {
                                    r32 = 0;
                                    b02 = lc.b0(g2Var3);
                                }
                                f3.o(r32, 2131753137, b02, r32);
                            }
                            break;
                        }
                    }
                } else {
                    f3.o(null, 2131753106, lc.b0((g2) i5.c.h(1, arrayList2)), null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i(pb pbVar, int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.c = pbVar;
        this.b = i7;
        this.r = str;
        this.e = inputFile;
        this.h = inputEncryptedFile;
        this.d = bArr;
        this.f = bArr2;
        this.n = j3;
    }

    public /* synthetic */ i(TLObject tLObject, int i7, t1 t1Var, Context context, long j3, h6 h6Var, org.telegram.ui.web.q qVar, h0 h0Var) {
        this.r = tLObject;
        this.b = i7;
        this.c = t1Var;
        this.e = context;
        this.n = j3;
        this.h = h6Var;
        this.d = qVar;
        this.f = h0Var;
    }

    public /* synthetic */ i(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, g2 g2Var, long j3, r10 r10Var, Runnable runnable, int i7) {
        this.c = tL_error;
        this.r = tLObject;
        this.e = twoStepVerificationActivity;
        this.h = g2Var;
        this.n = j3;
        this.d = r10Var;
        this.f = runnable;
        this.b = i7;
    }

    public /* synthetic */ i(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.c = launchActivity;
        this.r = tLObject;
        this.b = i7;
        this.e = str;
        this.h = str2;
        this.d = user;
        this.f = str3;
        this.n = j3;
    }
}
