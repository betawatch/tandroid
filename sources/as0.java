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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class as0 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ as0(int i, TLRPC.TL_error tL_error, qs0 qs0Var, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, wy wyVar, e eVar, long j) {
        this.d = i;
        this.b = tL_error;
        this.e = qs0Var;
        this.f = tL_inputCheckPasswordSRP;
        this.h = twoStepVerificationActivity;
        this.n = wyVar;
        this.r = eVar;
        this.c = j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0299, code lost:
    
        if (r0.equals("AVAILABLE_BALANCE_TOO_SMALL") == false) goto L123;
     */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.String, vnb] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        String str;
        int i;
        d31 Y;
        int i2;
        ?? r3;
        d31 b0;
        int i3;
        uj3 uj3Var;
        byte b = this.a;
        char c = 6;
        boolean[] zArr = z15.a;
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
                id idVar = (id) obj6;
                Context context = (Context) obj4;
                vnb vnbVar = (vnb) obj3;
                bu0 bu0Var = (bu0) obj2;
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
                            bs0 bs0Var = new bs0(idVar, context, i5, j, tL_messages_preparedInlineMessage, vnbVar, bu0Var, pVar);
                            int[] iArr = new int[1];
                            fn7[] fn7VarArr = new fn7[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str2;
                            iArr[0] = ConnectionsManager.getInstance(i5).sendRequestTyped(getwebpagepreview, new ic((byte) 0), new f(iArr, bs0Var, fn7VarArr, i5, (byte) 3));
                            idVar.setOnCancelListener(new cs0(new bf7(iArr, i5, fn7VarArr, (byte) 7), (byte) 0));
                            break;
                        }
                    }
                    File[] fileArr = new File[1];
                    ds0 ds0Var = new ds0(idVar, context, i5, j, tL_messages_preparedInlineMessage, fileArr, vnbVar, bu0Var, pVar);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str3 = botInlineResult.content.url;
                            String x = in5.x(str3, null);
                            String C = TextUtils.isEmpty(x) ? xb4.C(tL_messages_preparedInlineMessage.result.content.mime_type) : c00.i(".", x);
                            File file = new File(xb4.z(4), Utilities.a(str3) + C);
                            if (file.exists()) {
                                ds0Var.run();
                                break;
                            } else {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new y0(fileArr, ds0Var, (byte) 6), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str3);
                                idVar.setOnCancelListener(new cs0(httpGetFileTask, (byte) 1));
                                break;
                            }
                        }
                    }
                    ds0Var.run();
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
                e eVar = (e) obj3;
                qs0 qs0Var = (qs0) obj2;
                wy wyVar = (wy) obj;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.e0(password);
                    z15.b(eVar, this.c, twoStepVerificationActivity.d0(), twoStepVerificationActivity, qs0Var, wyVar);
                    break;
                } else {
                    zArr[i4] = false;
                    twoStepVerificationActivity.s0();
                    d31.e0(tL_error);
                    break;
                }
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                qs0 qs0Var2 = (qs0) obj6;
                TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) obj4;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) obj3;
                wy wyVar2 = (wy) obj2;
                e eVar2 = (e) obj;
                zArr[i4] = false;
                if (tL_error2 == null || ((!"API_WITHDRAWAL_FEATURE_DISABLED".equals(tL_error2.text) && !"FEATURE_DISABLED".equals(tL_error2.text)) || qs0Var2 == null)) {
                    twoStepVerificationActivity2.s0();
                    if (!z15.h(tL_error2, twoStepVerificationActivity2)) {
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
                                            if (str6.equals("STARS_REVENUE_ONLY_TON")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1149363434:
                                            if (str6.equals("WALLET_UNAVAILABLE")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1810617411:
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    switch (c) {
                                        case 0:
                                        case 6:
                                            i = 2131749273;
                                            break;
                                        case 1:
                                        case 3:
                                            i = 2131749266;
                                            break;
                                        case 2:
                                            i = 2131749584;
                                            break;
                                        case 4:
                                            i = 2131749272;
                                            break;
                                        case 5:
                                            i = 2131749582;
                                            break;
                                        default:
                                            i = 0;
                                            break;
                                    }
                                    if (i != 0) {
                                        bs2.v(null, i, wyVar2 != null ? d31.Y() : d31.b0(eVar2), R.raw.error, 36);
                                        break;
                                    } else {
                                        d31.e0(tL_error2);
                                        break;
                                    }
                                } else {
                                    Y = d31.Y();
                                    i2 = 2131749267;
                                }
                            } else {
                                Y = d31.Y();
                                i2 = 2131750647;
                                str = null;
                            }
                            bs2.v(str, i2, Y, R.raw.error, 36);
                            break;
                        } else {
                            if (wyVar2 != null) {
                                wyVar2.run();
                                z = true;
                            } else {
                                int currentAccount = eVar2.getCurrentAccount();
                                y15 y15Var = new y15(currentAccount, this.c, eVar2);
                                z15.b[currentAccount] = y15Var;
                                jn7.f(currentAccount).k(jn7.B3, new Object[0]);
                                hl.d3(new u15(y15Var, (byte) 0), 1000L);
                                z = true;
                                if (qs0Var2 != null) {
                                    jxa.v(i4, true).Q(true);
                                }
                            }
                            jxa.v(i4, z).L();
                            kt0.g(i4).l(yac.h(i4).e());
                            kt0.g(i4).j(yac.h(i4).e(), z);
                            c.C(i4).J();
                            break;
                        }
                    }
                } else {
                    qs0Var2.a(tL_inputCheckPasswordSRP, twoStepVerificationActivity2);
                    break;
                }
                break;
            case 3:
                sm5 sm5Var = (sm5) obj5;
                String str7 = (String) obj6;
                sm5Var.getClass();
                hl.c3(new qe(this.d, str7, (TLRPC.InputFile) obj4, (TLRPC.InputEncryptedFile) obj3, (byte[]) obj2, (byte[]) obj, this.c));
                sm5Var.b.u.remove(str7);
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
                    uc7.s1(i6).j4(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str8 != null) {
                        LaunchActivity.G0(launchActivity, launchActivity.P, tL_attachMenuBot, str8, false);
                        break;
                    } else {
                        e eVar3 = (e) c00.g(1, arrayList2);
                        if (hl.O1() && !(eVar3 instanceof zu1) && !arrayList.isEmpty()) {
                            eVar3 = (e) c00.g(1, arrayList);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!TextUtils.isEmpty(str9)) {
                            String[] split = str9.split(" ");
                            int length = split.length;
                            int i7 = 0;
                            while (i7 < length) {
                                int i8 = i7;
                                String str12 = split[i8];
                                Pattern pattern = ls6.U1;
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
                            uj3Var = null;
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
                            uj3Var = new uj3(bundle);
                            uj3Var.E2 = new yz5(launchActivity, user, str10, i6);
                        }
                        if (tL_attachMenuBot.inactive) {
                            yx yxVar = new yx(launchActivity);
                            yxVar.setColor(aob.w0(null, aob.ia, false));
                            yob.h(aob.L5, null, yxVar);
                            yxVar.setAttachBot(tL_attachMenuBot);
                            exc.a(launchActivity, new le(launchActivity, i6, this.c, uj3Var, eVar3, user, str10), null);
                            break;
                        } else if (uj3Var != null) {
                            if (eVar3 != null) {
                                eVar3.dismissCurrentDialog();
                            }
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                if (((Dialog) arrayList3.get(i12)).isShowing()) {
                                    ((Dialog) arrayList3.get(i12)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.t0(uj3Var);
                            break;
                        } else {
                            i3 = 2131753133;
                            if (eVar3 instanceof zu1) {
                                zu1 zu1Var = (zu1) eVar3;
                                if (ls6.v(tL_attachMenuBot, zu1Var.h() != null ? zu1Var.h() : zu1Var.e)) {
                                    zu1Var.ma(user.id, str10, false);
                                    break;
                                } else {
                                    b0 = d31.b0(eVar3);
                                    r3 = 0;
                                }
                            } else {
                                r3 = 0;
                                b0 = d31.b0(eVar3);
                            }
                        }
                    }
                } else {
                    r3 = 0;
                    b0 = d31.b0((e) c00.g(1, arrayList2));
                    i3 = 2131753102;
                }
                xnb.x(r3, i3, b0, r3);
                break;
        }
    }

    public /* synthetic */ as0(sm5 sm5Var, int i, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j) {
        this.b = sm5Var;
        this.d = i;
        this.e = str;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.c = j;
    }

    public /* synthetic */ as0(TLObject tLObject, int i, id idVar, Context context, long j, vnb vnbVar, bu0 bu0Var, p pVar) {
        this.b = tLObject;
        this.d = i;
        this.e = idVar;
        this.f = context;
        this.c = j;
        this.h = vnbVar;
        this.n = bu0Var;
        this.r = pVar;
    }

    public /* synthetic */ as0(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, e eVar, long j, qs0 qs0Var, wy wyVar, int i) {
        this.e = tL_error;
        this.b = tLObject;
        this.f = twoStepVerificationActivity;
        this.h = eVar;
        this.c = j;
        this.n = qs0Var;
        this.r = wyVar;
        this.d = i;
    }

    public /* synthetic */ as0(LaunchActivity launchActivity, TLObject tLObject, int i, String str, String str2, TLRPC.User user, String str3, long j) {
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
