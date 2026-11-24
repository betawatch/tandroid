// default package

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class at0 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ at0(int i, TLRPC.TL_error tL_error, qt0 qt0Var, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, wz wzVar, d dVar, long j) {
        this.d = i;
        this.b = tL_error;
        this.e = qt0Var;
        this.f = tL_inputCheckPasswordSRP;
        this.h = twoStepVerificationActivity;
        this.n = wzVar;
        this.r = dVar;
        this.c = j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02a8, code lost:
    
        if (r0.equals("STARS_REVENUE_ONLY_TON") == false) goto L123;
     */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.String, ylb] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v23 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        String str;
        int i;
        c41 Y;
        int i2;
        ?? r3;
        c41 b0;
        int i3;
        nk3 nk3Var;
        byte b = this.a;
        char c = 4;
        boolean[] zArr = u15.a;
        int i4 = this.d;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.b;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                TLObject tLObject = (TLObject) obj5;
                he heVar = (he) obj6;
                Context context = (Context) obj4;
                ylb ylbVar = (ylb) obj3;
                bv0 bv0Var = (bv0) obj2;
                p pVar = (p) obj;
                if (tLObject instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z2 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i5 = this.d;
                    long j = this.c;
                    if (z2) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str2 = tL_botInlineMessageMediaWebPage.url;
                            bt0 bt0Var = new bt0(heVar, context, i5, j, tL_messages_preparedInlineMessage, ylbVar, bv0Var, pVar);
                            int[] iArr = new int[1];
                            jm7[] jm7VarArr = new jm7[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str2;
                            iArr[0] = ConnectionsManager.getInstance(i5).sendRequestTyped(getwebpagepreview, new kc((byte) 0), new e(iArr, bt0Var, jm7VarArr, i5, (byte) 3));
                            heVar.setOnCancelListener(new ct0(new wc7(iArr, i5, jm7VarArr, (byte) 7), (byte) 0));
                            break;
                        }
                    }
                    File[] fileArr = new File[1];
                    dt0 dt0Var = new dt0(heVar, context, i5, j, tL_messages_preparedInlineMessage, fileArr, ylbVar, bv0Var, pVar);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str3 = botInlineResult.content.url;
                            String x = fn5.x(str3, null);
                            String C = TextUtils.isEmpty(x) ? bc4.C(tL_messages_preparedInlineMessage.result.content.mime_type) : b10.h(".", x);
                            File file = new File(bc4.z(4), Utilities.a(str3) + C);
                            if (file.exists()) {
                                dt0Var.run();
                                break;
                            } else {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new x0(fileArr, dt0Var, (byte) 7), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str3);
                                heVar.setOnCancelListener(new ct0(httpGetFileTask, (byte) 1));
                                break;
                            }
                        }
                    }
                    dt0Var.run();
                    break;
                } else {
                    pVar.a("MESSAGE_EXPIRED", null);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj4;
                d dVar = (d) obj3;
                qt0 qt0Var = (qt0) obj2;
                wz wzVar = (wz) obj;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.f0(password);
                    u15.b(dVar, this.c, twoStepVerificationActivity.e0(), twoStepVerificationActivity, qt0Var, wzVar);
                    break;
                } else {
                    zArr[i4] = false;
                    twoStepVerificationActivity.t0();
                    c41.e0(tL_error);
                    break;
                }
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                qt0 qt0Var2 = (qt0) obj6;
                TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) obj4;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) obj3;
                wz wzVar2 = (wz) obj2;
                d dVar2 = (d) obj;
                zArr[i4] = false;
                if (tL_error2 == null || ((!"API_WITHDRAWAL_FEATURE_DISABLED".equals(tL_error2.text) && !"FEATURE_DISABLED".equals(tL_error2.text)) || qt0Var2 == null)) {
                    twoStepVerificationActivity2.t0();
                    if (!u15.h(tL_error2, twoStepVerificationActivity2)) {
                        twoStepVerificationActivity2.finishFragment();
                        if (tL_error2 != null) {
                            String str4 = tL_error2.text;
                            if (str4 == null || !str4.startsWith("FLOOD_WAIT")) {
                                str = null;
                                String str5 = tL_error2.text;
                                if (str5 == null || !str5.startsWith("TMP_PASSWORD")) {
                                    String str6 = tL_error2.text;
                                    str6.getClass();
                                    switch (str6.hashCode()) {
                                        case -1154072843:
                                            if (str6.equals("AMOUNT_TOO_SMALL")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -577854011:
                                            if (str6.equals("FEATURE_DISABLED")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -456249281:
                                            if (str6.equals("WALLET_CREATING")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 54255434:
                                            if (str6.equals("API_WITHDRAWAL_FEATURE_DISABLED")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 367129409:
                                            break;
                                        case 1149363434:
                                            if (str6.equals("WALLET_UNAVAILABLE")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1810617411:
                                            if (str6.equals("AVAILABLE_BALANCE_TOO_SMALL")) {
                                                c = 6;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    switch (c) {
                                        case 0:
                                        case 6:
                                            i = 2131749276;
                                            break;
                                        case 1:
                                        case 3:
                                            i = 2131749269;
                                            break;
                                        case 2:
                                            i = 2131749572;
                                            break;
                                        case 4:
                                            i = 2131749275;
                                            break;
                                        case 5:
                                            i = 2131749570;
                                            break;
                                        default:
                                            i = 0;
                                            break;
                                    }
                                    if (i != 0) {
                                        ts2.u(null, i, wzVar2 != null ? c41.Y() : c41.b0(dVar2), R.raw.error, 36);
                                        break;
                                    } else {
                                        c41.e0(tL_error2);
                                        break;
                                    }
                                } else {
                                    Y = c41.Y();
                                    i2 = 2131749270;
                                }
                            } else {
                                Y = c41.Y();
                                i2 = 2131750619;
                                str = null;
                            }
                            ts2.u(str, i2, Y, R.raw.error, 36);
                            break;
                        } else {
                            if (wzVar2 != null) {
                                wzVar2.run();
                                z = true;
                            } else {
                                int currentAccount = dVar2.getCurrentAccount();
                                t15 t15Var = new t15(currentAccount, this.c, dVar2);
                                u15.b[currentAccount] = t15Var;
                                nm7.f(currentAccount).k(nm7.B3, new Object[0]);
                                gm.d3(new p15(t15Var, (byte) 0), 1000L);
                                z = true;
                                if (qt0Var2 != null) {
                                    jva.v(i4, true).P(true);
                                }
                            }
                            jva.v(i4, z).L();
                            ku0.g(i4).l(z8c.h(i4).e());
                            ku0.g(i4).j(z8c.h(i4).e(), z);
                            c.C(i4).J();
                            break;
                        }
                    }
                } else {
                    qt0Var2.a(tL_inputCheckPasswordSRP, twoStepVerificationActivity2);
                    break;
                }
                break;
            case 3:
                pm5 pm5Var = (pm5) obj5;
                String str7 = (String) obj6;
                pm5Var.getClass();
                gm.c3(new pf(this.d, str7, (TLRPC.InputFile) obj4, (TLRPC.InputEncryptedFile) obj3, (byte[]) obj2, (byte[]) obj, this.c));
                pm5Var.b.u.remove(str7);
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLObject tLObject3 = (TLObject) obj5;
                String str8 = (String) obj4;
                String str9 = (String) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str10 = (String) obj;
                String str11 = LaunchActivity.C1;
                ArrayList arrayList = launchActivity.g0;
                ArrayList arrayList2 = launchActivity.e0;
                ArrayList arrayList3 = launchActivity.D0;
                if (tLObject3 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject3;
                    int i6 = this.d;
                    oc7.r1(i6).d4(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str8 != null) {
                        LaunchActivity.G0(launchActivity, launchActivity.P, tL_attachMenuBot, str8, false);
                        break;
                    } else {
                        d dVar3 = (d) b10.f(1, arrayList2);
                        if (gm.O1() && !(dVar3 instanceof yv1) && !arrayList.isEmpty()) {
                            dVar3 = (d) b10.f(1, arrayList);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!TextUtils.isEmpty(str9)) {
                            String[] split = str9.split(" ");
                            int length = split.length;
                            int i7 = 0;
                            while (i7 < length) {
                                int i8 = i7;
                                String str12 = split[i8];
                                Pattern pattern = hs6.U1;
                                String[] strArr = split;
                                ArrayList<TLRPC.AttachMenuPeerType> arrayList5 = tL_attachMenuBot.peer_types;
                                int i9 = length;
                                int size = arrayList5.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList5.get(i10);
                                    int i11 = i10 + 1;
                                    TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
                                    ArrayList<TLRPC.AttachMenuPeerType> arrayList6 = arrayList5;
                                    if ((((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) || (attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM)) && str12.equals("bots")) || (((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && str12.equals("channels")) || (((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) && str12.equals("groups")) || ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) && str12.equals("users"))))) {
                                        arrayList4.add(str12);
                                        i7 = i8 + 1;
                                        split = strArr;
                                        length = i9;
                                    } else {
                                        arrayList5 = arrayList6;
                                        i10 = i11;
                                    }
                                }
                                i7 = i8 + 1;
                                split = strArr;
                                length = i9;
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            nk3Var = null;
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
                            nk3Var = new nk3(bundle);
                            nk3Var.E2 = new wz5(launchActivity, user, str10, i6);
                        }
                        if (tL_attachMenuBot.inactive) {
                            yy yyVar = new yy(launchActivity);
                            yyVar.setColor(cmb.w0(null, cmb.ha, false));
                            anb.h(cmb.K5, null, yyVar);
                            yyVar.setAttachBot(tL_attachMenuBot);
                            quc.a(launchActivity, new fi(launchActivity, i6, this.c, nk3Var, dVar3, user, str10), null);
                            break;
                        } else if (nk3Var != null) {
                            if (dVar3 != null) {
                                dVar3.dismissCurrentDialog();
                            }
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                if (((Dialog) arrayList3.get(i12)).isShowing()) {
                                    ((Dialog) arrayList3.get(i12)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.t0(nk3Var);
                            break;
                        } else {
                            i3 = 2131753105;
                            if (dVar3 instanceof yv1) {
                                yv1 yv1Var = (yv1) dVar3;
                                if (hs6.v(tL_attachMenuBot, yv1Var.h() != null ? yv1Var.h() : yv1Var.e)) {
                                    yv1Var.la(user.id, str10, false);
                                    break;
                                } else {
                                    b0 = c41.b0(dVar3);
                                    r3 = 0;
                                }
                            } else {
                                r3 = 0;
                                b0 = c41.b0(dVar3);
                            }
                        }
                    }
                } else {
                    r3 = 0;
                    b0 = c41.b0((d) b10.f(1, arrayList2));
                    i3 = 2131753074;
                }
                mlb.y(r3, i3, b0, r3);
                break;
        }
    }

    public /* synthetic */ at0(pm5 pm5Var, int i, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j) {
        this.b = pm5Var;
        this.d = i;
        this.e = str;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.c = j;
    }

    public /* synthetic */ at0(TLObject tLObject, int i, he heVar, Context context, long j, ylb ylbVar, bv0 bv0Var, p pVar) {
        this.b = tLObject;
        this.d = i;
        this.e = heVar;
        this.f = context;
        this.c = j;
        this.h = ylbVar;
        this.n = bv0Var;
        this.r = pVar;
    }

    public /* synthetic */ at0(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, d dVar, long j, qt0 qt0Var, wz wzVar, int i) {
        this.e = tL_error;
        this.b = tLObject;
        this.f = twoStepVerificationActivity;
        this.h = dVar;
        this.c = j;
        this.n = qt0Var;
        this.r = wzVar;
        this.d = i;
    }

    public /* synthetic */ at0(LaunchActivity launchActivity, TLObject tLObject, int i, String str, String str2, TLRPC.User user, String str3, long j) {
        this.e = launchActivity;
        this.b = tLObject;
        this.d = i;
        this.f = str;
        this.h = str2;
        this.n = user;
        this.r = str3;
        this.c = j;
    }
}
