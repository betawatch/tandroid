package ai;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.h61;
import org.telegram.ui.i21;
import org.telegram.ui.mm0;
import org.telegram.ui.o21;
import org.telegram.ui.qe;
import org.telegram.ui.qn;
import org.telegram.ui.ti;
import org.telegram.ui.ue;
import org.telegram.ui.uk0;
import org.telegram.ui.vm0;
import org.telegram.ui.wh1;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ g3(hg.a1 a1Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.a = 10;
        this.b = a1Var;
        this.e = str;
        this.d = tL_error;
        this.c = tLObject;
        this.f = messagesController;
        this.h = messagesStorage;
    }

    private final void a() {
        h61.S((h61) this.b, (TLRPC.TL_error) this.d, (TLRPC.InputCheckPasswordSRP) this.c, (TLRPC.User) this.e, (TwoStepVerificationActivity) this.f, (TLRPC.TL_channels_editCreator) this.h);
    }

    private final void b() {
        org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.b;
        String str = (String) this.c;
        byte[] bArr = (byte[]) this.e;
        org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.f;
        byte[] bArr2 = c2Var.b;
        org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.h;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
        org.telegram.ui.Wallet.m0 m0Var = f2Var.b;
        if (!TextUtils.equals(str, m0Var.s()) || !Arrays.equals(bArr, m0Var.x())) {
            Arrays.fill(bArr2, (byte) 0);
            s1Var.run(null, "Wallet changed. Open the request again.");
            return;
        }
        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
        inputtonconnectoauthsession.session_id = tonconnectsession.id;
        inputtonconnectoauthsession.challenge_answer = bArr2;
        inputtonconnectoauthsession.body = c2Var.c;
        inputtonconnectoauthsession.proof = c2Var.d;
        s1Var.run(inputtonconnectoauthsession, null);
    }

    private final void c() {
        org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.b;
        String str = (String) this.c;
        byte[] bArr = (byte[]) this.e;
        org.telegram.ui.Wallet.x xVar = (org.telegram.ui.Wallet.x) this.f;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
        org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.d;
        org.telegram.ui.Wallet.m0 m0Var = f2Var.b;
        if (!TextUtils.equals(str, m0Var.s()) || !Arrays.equals(bArr, m0Var.x())) {
            xVar.run("Wallet or TON Connect session changed. Open the request again.");
            return;
        }
        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
        tonconnectclosesession.session_id = tonconnectsession.id;
        tonconnectclosesession.body = c2Var.c;
        f2Var.f.sendRequestTyped(tonconnectclosesession, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.d(xVar, 3));
    }

    private final void d() {
        org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.b;
        String str = (String) this.c;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.f;
        org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.h;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.d;
        if (str != null) {
            callback.run(str);
        } else if (!f2Var.y(b2Var) || f2Var.i(b2Var)) {
            callback.run("Request expired or wallet changed");
        } else {
            f2Var.f.sendRequestTyped(sendtransfer, new org.telegram.messenger.a(), new x3(f2Var, callback, b2Var, j0Var, sendtransfer, 6));
        }
    }

    private final void f() {
        org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.b;
        org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.c;
        org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.e;
        org.telegram.ui.Wallet.x xVar = (org.telegram.ui.Wallet.x) this.f;
        JSONObject jSONObject = (JSONObject) this.h;
        String str = (String) this.d;
        if (!f2Var.y(b2Var) || f2Var.i(b2Var)) {
            f2Var.w(b2Var, j0Var, null, 0, "Request expired or wallet changed", xVar);
        } else {
            f2Var.w(b2Var, j0Var, jSONObject, jSONObject == null ? 0 : -1, str, xVar);
        }
    }

    private final void g() {
        ((WalletEngine2) this.b).lambda$prepareSendNFT$26((String) this.c, (String) this.e, (String) this.f, (byte[]) this.h, (Utilities.Callback2) this.d);
    }

    private final void h() {
        org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
        String str = (String) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.d6 d6Var = a1Var.e;
        if (tLObject == null) {
            if (tL_error != null) {
                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    new org.telegram.ui.Components.xc(a1Var, d6Var).f0(tL_error, false);
                    return;
                }
                new org.telegram.ui.Components.xc(a1Var, d6Var).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str2), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, d6Var)), R.raw.error).j();
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
            uk0.b(false, a1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, a1Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
            uk0.b(false, a1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, a1Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
            org.telegram.ui.Components.f5.o0(a1Var.getContext(), str, false, true, true, false, 0L, null, null, null);
        }
    }

    private final void i() {
        org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.b;
        File file = (File) this.c;
        org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
        String str = (String) this.f;
        String str2 = (String) this.h;
        String str3 = (String) this.d;
        if (file == null) {
            b2Var.c(500L);
            return;
        }
        int[] iArr = new int[11];
        Utilities.globalQueue.postRunnable(new cy0(file, iArr, new v7((NotificationCenter.NotificationCenterDelegate) a1Var, (Object) iArr, (Object) file, (Object) b2Var, str, (Object) str2, (Object) str3, 14), 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0231, code lost:
    
        if (r1.admin_rights.manage_call != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x026a, code lost:
    
        if (r8.creator != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0266, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04a2 A[Catch: Exception -> 0x043c, TryCatch #0 {Exception -> 0x043c, blocks: (B:358:0x042c, B:360:0x0436, B:143:0x043f, B:146:0x044d, B:148:0x0457, B:150:0x045d, B:151:0x0460, B:153:0x049c, B:155:0x04a2, B:157:0x04a8, B:158:0x04ab, B:160:0x04b0, B:162:0x04b6, B:163:0x04b9, B:166:0x04c3, B:168:0x04cd, B:170:0x04dd, B:172:0x04e9, B:174:0x04f5, B:178:0x053e, B:180:0x0544, B:181:0x0547, B:183:0x0550, B:184:0x0553, B:185:0x055d, B:330:0x0506, B:332:0x0516, B:334:0x0520, B:336:0x0539, B:342:0x0465, B:344:0x046f, B:346:0x0475, B:347:0x0478, B:348:0x047c, B:350:0x0486, B:352:0x048c, B:354:0x0492, B:355:0x0495), top: B:357:0x042c }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04cd A[Catch: Exception -> 0x043c, TryCatch #0 {Exception -> 0x043c, blocks: (B:358:0x042c, B:360:0x0436, B:143:0x043f, B:146:0x044d, B:148:0x0457, B:150:0x045d, B:151:0x0460, B:153:0x049c, B:155:0x04a2, B:157:0x04a8, B:158:0x04ab, B:160:0x04b0, B:162:0x04b6, B:163:0x04b9, B:166:0x04c3, B:168:0x04cd, B:170:0x04dd, B:172:0x04e9, B:174:0x04f5, B:178:0x053e, B:180:0x0544, B:181:0x0547, B:183:0x0550, B:184:0x0553, B:185:0x055d, B:330:0x0506, B:332:0x0516, B:334:0x0520, B:336:0x0539, B:342:0x0465, B:344:0x046f, B:346:0x0475, B:347:0x0478, B:348:0x047c, B:350:0x0486, B:352:0x048c, B:354:0x0492, B:355:0x0495), top: B:357:0x042c }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0544 A[Catch: Exception -> 0x043c, TryCatch #0 {Exception -> 0x043c, blocks: (B:358:0x042c, B:360:0x0436, B:143:0x043f, B:146:0x044d, B:148:0x0457, B:150:0x045d, B:151:0x0460, B:153:0x049c, B:155:0x04a2, B:157:0x04a8, B:158:0x04ab, B:160:0x04b0, B:162:0x04b6, B:163:0x04b9, B:166:0x04c3, B:168:0x04cd, B:170:0x04dd, B:172:0x04e9, B:174:0x04f5, B:178:0x053e, B:180:0x0544, B:181:0x0547, B:183:0x0550, B:184:0x0553, B:185:0x055d, B:330:0x0506, B:332:0x0516, B:334:0x0520, B:336:0x0539, B:342:0x0465, B:344:0x046f, B:346:0x0475, B:347:0x0478, B:348:0x047c, B:350:0x0486, B:352:0x048c, B:354:0x0492, B:355:0x0495), top: B:357:0x042c }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0550 A[Catch: Exception -> 0x043c, TryCatch #0 {Exception -> 0x043c, blocks: (B:358:0x042c, B:360:0x0436, B:143:0x043f, B:146:0x044d, B:148:0x0457, B:150:0x045d, B:151:0x0460, B:153:0x049c, B:155:0x04a2, B:157:0x04a8, B:158:0x04ab, B:160:0x04b0, B:162:0x04b6, B:163:0x04b9, B:166:0x04c3, B:168:0x04cd, B:170:0x04dd, B:172:0x04e9, B:174:0x04f5, B:178:0x053e, B:180:0x0544, B:181:0x0547, B:183:0x0550, B:184:0x0553, B:185:0x055d, B:330:0x0506, B:332:0x0516, B:334:0x0520, B:336:0x0539, B:342:0x0465, B:344:0x046f, B:346:0x0475, B:347:0x0478, B:348:0x047c, B:350:0x0486, B:352:0x048c, B:354:0x0492, B:355:0x0495), top: B:357:0x042c }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x070a A[Catch: Exception -> 0x083b, TryCatch #1 {Exception -> 0x083b, blocks: (B:316:0x0566, B:322:0x0579, B:324:0x057f, B:189:0x05ac, B:191:0x05b2, B:193:0x05d0, B:194:0x05d2, B:195:0x05da, B:197:0x05de, B:199:0x05f3, B:200:0x05f9, B:202:0x05ff, B:203:0x0603, B:205:0x0609, B:206:0x060d, B:208:0x061c, B:209:0x062f, B:211:0x0635, B:213:0x0641, B:215:0x0649, B:217:0x0653, B:219:0x0661, B:220:0x0667, B:222:0x066d, B:224:0x0677, B:226:0x0685, B:227:0x0689, B:229:0x068f, B:231:0x0699, B:233:0x06a7, B:234:0x06ab, B:236:0x06b1, B:238:0x06b7, B:240:0x06c1, B:242:0x06c7, B:243:0x06ca, B:244:0x06cf, B:247:0x06d6, B:249:0x06db, B:254:0x06ee, B:256:0x06f4, B:258:0x070a, B:265:0x071b, B:267:0x0727, B:269:0x075e, B:271:0x0773, B:272:0x0779, B:274:0x077f, B:275:0x0783, B:277:0x0789, B:278:0x078d, B:280:0x0797, B:281:0x07a1, B:283:0x07a7, B:285:0x07b1, B:289:0x07be, B:294:0x07c4, B:296:0x07d0, B:298:0x0807, B:299:0x0814, B:251:0x06ea, B:313:0x05d7), top: B:315:0x0566 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0566 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x04c0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.n2 U;
        hg.c cVar;
        Location location;
        String str;
        int i10;
        List<Address> fromLocationName;
        List<Address> fromLocationName2;
        HashSet hashSet;
        HashSet hashSet2;
        int i11;
        boolean z10;
        Address address;
        Locale locale;
        String str2;
        List<Address> list;
        HashSet hashSet3;
        int i12;
        List<Address> list2;
        StringBuilder sb2;
        String str3;
        String thoroughfare;
        boolean z11;
        boolean z12;
        String countryName;
        HashSet hashSet4;
        StringBuilder sb3;
        boolean z13;
        StringBuilder sb4;
        StringBuilder sb5;
        boolean z14;
        String str4;
        int i13;
        TLRPC.User user;
        TLRPC.ChatParticipants chatParticipants;
        String str5;
        String str6 = "";
        boolean z15 = true;
        int i14 = 0;
        switch (this.a) {
            case 0:
                l7.c1((l7) this.b, (TLObject) this.c, (ug.m1[]) this.e, (Long) this.f, (a3.l0) this.h, (TLRPC.TL_error) this.d);
                break;
            case 1:
                l7.s1((l7) this.b, (TLObject) this.c, (CharSequence) this.e, (TL_stars.TL_starGiftUnique) this.f, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.h, (TLRPC.TL_error) this.d);
                break;
            case 2:
                ga gaVar = (ga) this.b;
                List list3 = (List) this.c;
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.e;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f;
                c5.i iVar = (c5.i) this.h;
                Activity activity = (Activity) this.d;
                if (list3.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new e8(s1Var, 0));
                    break;
                } else {
                    c5.p pVar = (c5.p) list3.get(0);
                    if (pVar.a() == null) {
                        AndroidUtilities.runOnUIThread(new e8(s1Var, 1));
                        break;
                    } else {
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
                        ConnectionsManager.getInstance(gaVar.a).sendRequest(tL_payments_canPurchaseStore, new f8(pVar, iVar, s1Var, activity, tL_inputStorePaymentStarsGiveaway, list3, 0));
                        break;
                    }
                }
            case 3:
                ga gaVar2 = (ga) this.b;
                Runnable runnable = (Runnable) this.c;
                MessageObject messageObject = (MessageObject) this.e;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.h;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (gaVar2.e) {
                    gaVar2.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
                    break;
                } else {
                    ga.e("NO_BALANCE");
                    runnable.run();
                    break;
                }
            case 4:
                ga gaVar3 = (ga) this.b;
                TLObject tLObject = (TLObject) this.c;
                MessageObject messageObject2 = (MessageObject) this.e;
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.f;
                ti tiVar = (ti) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                    gaVar3.Y(messageObject2, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, tiVar, null);
                } else {
                    ga.e(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
                }
                tiVar.run();
                break;
            case 5:
                ga gaVar4 = (ga) this.b;
                boolean[] zArr = (boolean[]) this.c;
                MessageObject messageObject3 = (MessageObject) this.e;
                TLRPC.InputInvoice inputInvoice2 = (TLRPC.InputInvoice) this.f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = (TLRPC.TL_payments_paymentFormStars) this.h;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                zArr[0] = true;
                gaVar4.a0(messageObject3, inputInvoice2, tL_payments_paymentFormStars2, new s2(1, callback2));
                break;
            case 6:
                v9 v9Var = (v9) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.e;
                y9 y9Var = (y9) this.f;
                Utilities.Callback callback3 = (Utilities.Callback) this.h;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                long j10 = v9Var.b;
                int i15 = v9Var.a;
                HashMap hashMap = v9Var.h;
                ArrayList arrayList = v9Var.e;
                v9Var.k = false;
                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                    arrayList.remove(tL_starGiftCollection);
                    arrayList.add(tL_starGiftCollection2);
                    hashMap.remove(-1);
                    int i16 = tL_starGiftCollection2.collection_id;
                    y9Var.d = i16;
                    hashMap.put(Integer.valueOf(i16), y9Var);
                    v9Var.j();
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), v9Var);
                    if (callback3 != null) {
                        callback3.run(tL_starGiftCollection2);
                        break;
                    }
                } else {
                    if (tL_error2 != null && (U = LaunchActivity.U()) != null) {
                        org.telegram.ui.Components.xc.a0(U).f0(tL_error2, false);
                    }
                    arrayList.remove(tL_starGiftCollection);
                    hashMap.remove(-1);
                    v9Var.j();
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), v9Var);
                    break;
                }
                break;
            case 7:
                ci.a7 a7Var = (ci.a7) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList<TLRPC.User> arrayList4 = (ArrayList) this.f;
                ArrayList<TLRPC.Chat> arrayList5 = (ArrayList) this.h;
                HashSet hashSet5 = (HashSet) this.d;
                StringBuilder sb6 = new StringBuilder("StoriesList ");
                sb6.append(a7Var.e);
                sb6.append("{");
                sb6.append(a7Var.d);
                sb6.append("} preloadCache {");
                sb6.append(ci.i7.a(arrayList2));
                i2.e.v("}", sb6);
                ArrayList arrayList6 = a7Var.g;
                arrayList6.clear();
                arrayList6.addAll(arrayList3);
                a7Var.t = false;
                int i17 = a7Var.c;
                MessagesController.getInstance(i17).putUsers(arrayList4, true);
                MessagesController.getInstance(i17).putChats(arrayList5, true);
                if (a7Var.v) {
                    a7Var.v = false;
                    a7Var.y = null;
                    a7Var.j();
                    break;
                } else {
                    a7Var.m.addAll(hashSet5);
                    a7Var.k.clear();
                    for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                        a7Var.t((MessageObject) arrayList2.get(i18), true);
                    }
                    a7Var.d(false);
                    ci.z6 z6Var = a7Var.y;
                    if (z6Var != null) {
                        z6Var.run(0);
                        a7Var.y = null;
                    }
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, a7Var);
                    break;
                }
            case 8:
                int[] iArr = (int[]) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                MessagesController messagesController = (MessagesController) this.e;
                TLRPC.User[] userArr = (TLRPC.User[]) this.f;
                ei.qc qcVar = (ei.qc) this.h;
                ei.oc ocVar = (ei.oc) this.d;
                iArr[0] = 0;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = user2;
                    if (user2 != null) {
                        qcVar.run();
                        break;
                    }
                }
                ocVar.run(null);
                break;
            case 9:
                hg.c cVar2 = (hg.c) this.b;
                Locale locale2 = (Locale) this.c;
                String str7 = (String) this.e;
                Locale locale3 = (Locale) this.f;
                Location location2 = (Location) this.h;
                String str8 = (String) this.d;
                ArrayList arrayList7 = new ArrayList();
                try {
                    i10 = cVar2.e ? 10 : 5;
                    fromLocationName = new Geocoder(ApplicationLoader.applicationContext, locale2).getFromLocationName(str7, 5);
                    fromLocationName2 = cVar2.d ? new Geocoder(ApplicationLoader.applicationContext, locale3).getFromLocationName(str7, 5) : null;
                    hashSet = new HashSet();
                    hashSet2 = new HashSet();
                    i11 = 0;
                } catch (Exception unused) {
                }
                while (i11 < fromLocationName.size()) {
                    Address address2 = fromLocationName.get(i11);
                    if (fromLocationName2 != null) {
                        z10 = z15;
                        if (i11 < fromLocationName2.size()) {
                            address = fromLocationName2.get(i11);
                            if (address2.hasLatitude() || !address2.hasLongitude()) {
                                locale = locale2;
                                str2 = str6;
                                list = fromLocationName2;
                                hashSet3 = hashSet2;
                                location = location2;
                                str = str8;
                                i12 = i11;
                                list2 = fromLocationName;
                                cVar = cVar2;
                            } else {
                                HashSet hashSet6 = hashSet2;
                                double latitude = address2.getLatitude();
                                locale = locale2;
                                str2 = str6;
                                double longitude = address2.getLongitude();
                                list = fromLocationName2;
                                StringBuilder sb7 = new StringBuilder();
                                Address address3 = address;
                                StringBuilder sb8 = new StringBuilder();
                                location = location2;
                                try {
                                    sb2 = new StringBuilder();
                                    String locality = address2.getLocality();
                                    if (TextUtils.isEmpty(locality)) {
                                        locality = address2.getAdminArea();
                                    }
                                    str = str8;
                                    str3 = locality;
                                    if (address3 != null) {
                                        try {
                                            if (TextUtils.isEmpty(address3.getLocality())) {
                                                address3.getAdminArea();
                                            }
                                        } catch (Exception unused2) {
                                            cVar = cVar2;
                                        }
                                    }
                                    i12 = i11;
                                    thoroughfare = address2.getThoroughfare();
                                    list2 = fromLocationName;
                                } catch (Exception unused3) {
                                    cVar = cVar2;
                                }
                                if (TextUtils.isEmpty(thoroughfare) || TextUtils.equals(thoroughfare, address2.getAdminArea())) {
                                    String subLocality = address2.getSubLocality();
                                    if (TextUtils.isEmpty(subLocality)) {
                                        String locality2 = address2.getLocality();
                                        if (TextUtils.isEmpty(locality2) || TextUtils.equals(locality2, str3)) {
                                            z11 = z10;
                                            sb2 = null;
                                            if (TextUtils.isEmpty(str3)) {
                                                if (sb8.length() > 0) {
                                                    sb8.append(", ");
                                                }
                                                sb8.append(str3);
                                                if (sb2 != null) {
                                                    if (sb2.length() > 0) {
                                                        sb2.append(", ");
                                                    }
                                                    sb2.append(str3);
                                                }
                                                z12 = false;
                                            } else {
                                                z12 = z10;
                                            }
                                            boolean z16 = z11;
                                            countryName = address2.getCountryName();
                                            if (TextUtils.isEmpty(countryName)) {
                                                sb3 = sb2;
                                                z13 = z12;
                                                if (!"US".equals(address2.getCountryCode()) && !"AE".equals(address2.getCountryCode()) && (!"GB".equals(address2.getCountryCode()) || !"en".equals(locale.getLanguage()))) {
                                                    hashSet4 = hashSet;
                                                    str4 = countryName;
                                                    if (sb8.length() > 0) {
                                                        sb8.append(", ");
                                                    }
                                                    sb8.append(str4);
                                                    if (sb7.length() > 0) {
                                                        sb7.append(", ");
                                                    }
                                                    sb7.append(countryName);
                                                }
                                                String[] split = countryName.split(" ");
                                                int length = split.length;
                                                hashSet4 = hashSet;
                                                str4 = str2;
                                                int i19 = 0;
                                                while (i19 < length) {
                                                    int i20 = i19;
                                                    String str9 = split[i20];
                                                    if (str9.length() > 0) {
                                                        i13 = length;
                                                        str4 = str4 + str9.charAt(0);
                                                    } else {
                                                        i13 = length;
                                                    }
                                                    i19 = i20 + 1;
                                                    length = i13;
                                                }
                                                if (sb8.length() > 0) {
                                                }
                                                sb8.append(str4);
                                                if (sb7.length() > 0) {
                                                }
                                                sb7.append(countryName);
                                            } else {
                                                hashSet4 = hashSet;
                                                sb3 = sb2;
                                                z13 = z12;
                                            }
                                            cVar = cVar2;
                                            if (cVar2.e) {
                                                if (sb3 == null || sb3.length() <= 0) {
                                                    sb4 = sb7;
                                                    sb5 = sb8;
                                                } else {
                                                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                    tL_messageMediaVenue.geo = tL_geoPoint;
                                                    tL_geoPoint.lat = latitude;
                                                    tL_geoPoint._long = longitude;
                                                    tL_messageMediaVenue.query_id = -1L;
                                                    tL_messageMediaVenue.title = sb3.toString();
                                                    tL_messageMediaVenue.icon = "pin";
                                                    tL_messageMediaVenue.address = LocaleController.getString(z16 ? R.string.PassportCity : R.string.PassportStreet1);
                                                    if (address3 != null) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
                                                        tL_messageMediaVenue.geoAddress = tL_geoPointAddress;
                                                        tL_geoPointAddress.country_iso2 = address3.getCountryCode();
                                                        String locality3 = TextUtils.isEmpty(null) ? address3.getLocality() : null;
                                                        if (TextUtils.isEmpty(locality3)) {
                                                            locality3 = address3.getAdminArea();
                                                        }
                                                        if (TextUtils.isEmpty(locality3)) {
                                                            locality3 = address3.getSubAdminArea();
                                                        }
                                                        String adminArea = address3.getAdminArea();
                                                        StringBuilder sb9 = new StringBuilder();
                                                        if (TextUtils.isEmpty(adminArea)) {
                                                            sb4 = sb7;
                                                            sb5 = sb8;
                                                        } else {
                                                            sb4 = sb7;
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue.geoAddress;
                                                            tL_geoPointAddress2.state = adminArea;
                                                            sb5 = sb8;
                                                            tL_geoPointAddress2.flags |= 1;
                                                        }
                                                        if (!TextUtils.isEmpty(locality3)) {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue.geoAddress;
                                                            tL_geoPointAddress3.city = locality3;
                                                            tL_geoPointAddress3.flags |= 2;
                                                        }
                                                        if (!z16) {
                                                            String thoroughfare2 = (!TextUtils.isEmpty(null) || TextUtils.equals(address3.getThoroughfare(), str3) || TextUtils.equals(address3.getThoroughfare(), address3.getCountryName())) ? null : address3.getThoroughfare();
                                                            if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address3.getSubLocality(), str3) && !TextUtils.equals(address3.getSubLocality(), address3.getCountryName())) {
                                                                thoroughfare2 = address3.getSubLocality();
                                                            }
                                                            if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address3.getLocality(), str3) && !TextUtils.equals(address3.getLocality(), address3.getCountryName())) {
                                                                thoroughfare2 = address3.getLocality();
                                                            }
                                                            if (TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(thoroughfare2, adminArea) || TextUtils.equals(thoroughfare2, address3.getCountryName())) {
                                                                sb9 = null;
                                                            } else {
                                                                if (sb9.length() > 0) {
                                                                    sb9.append(", ");
                                                                }
                                                                sb9.append(thoroughfare2);
                                                            }
                                                            if (!TextUtils.isEmpty(sb9)) {
                                                                int i21 = 0;
                                                                while (true) {
                                                                    String[] strArr = LocationController.unnamedRoads;
                                                                    if (i21 < strArr.length) {
                                                                        if (strArr[i21].equalsIgnoreCase(sb9.toString())) {
                                                                            z14 = z10;
                                                                        } else {
                                                                            i21++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z14 = false;
                                                            if (!TextUtils.isEmpty(sb9)) {
                                                                TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue.geoAddress;
                                                                tL_geoPointAddress4.flags |= 4;
                                                                tL_geoPointAddress4.street = sb9.toString();
                                                            }
                                                            if (!z14) {
                                                                arrayList7.add(tL_messageMediaVenue);
                                                                if (arrayList7.size() >= i10) {
                                                                    AndroidUtilities.runOnUIThread(new y0(cVar, location, str, arrayList7, 17));
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        sb4 = sb7;
                                                        sb5 = sb8;
                                                    }
                                                    z14 = false;
                                                    if (!z14) {
                                                    }
                                                }
                                                if (z13) {
                                                    hashSet3 = hashSet6;
                                                } else {
                                                    hashSet3 = hashSet6;
                                                    if (!hashSet3.contains(sb5.toString())) {
                                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                                        TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                                        tL_messageMediaVenue2.geo = tL_geoPoint2;
                                                        tL_geoPoint2.lat = latitude;
                                                        tL_geoPoint2._long = longitude;
                                                        tL_messageMediaVenue2.query_id = -1L;
                                                        tL_messageMediaVenue2.title = sb5.toString();
                                                        tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                                        tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address2.getCountryCode());
                                                        hashSet3.add(tL_messageMediaVenue2.title);
                                                        tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                                        if (address3 != null) {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress5 = new TL_stories.TL_geoPointAddress();
                                                            tL_messageMediaVenue2.geoAddress = tL_geoPointAddress5;
                                                            tL_geoPointAddress5.country_iso2 = address3.getCountryCode();
                                                            String locality4 = TextUtils.isEmpty(null) ? address3.getLocality() : null;
                                                            if (TextUtils.isEmpty(locality4)) {
                                                                locality4 = address3.getAdminArea();
                                                            }
                                                            if (TextUtils.isEmpty(locality4)) {
                                                                locality4 = address3.getSubAdminArea();
                                                            }
                                                            String adminArea2 = address3.getAdminArea();
                                                            if (!TextUtils.isEmpty(adminArea2)) {
                                                                TL_stories.TL_geoPointAddress tL_geoPointAddress6 = tL_messageMediaVenue2.geoAddress;
                                                                tL_geoPointAddress6.state = adminArea2;
                                                                tL_geoPointAddress6.flags |= 1;
                                                            }
                                                            if (!TextUtils.isEmpty(locality4)) {
                                                                TL_stories.TL_geoPointAddress tL_geoPointAddress7 = tL_messageMediaVenue2.geoAddress;
                                                                tL_geoPointAddress7.city = locality4;
                                                                tL_geoPointAddress7.flags |= 2;
                                                            }
                                                        }
                                                        arrayList7.add(tL_messageMediaVenue2);
                                                        if (arrayList7.size() >= i10) {
                                                            AndroidUtilities.runOnUIThread(new y0(cVar, location, str, arrayList7, 17));
                                                        }
                                                    }
                                                }
                                                if (sb4.length() > 0) {
                                                    hashSet = hashSet4;
                                                    if (hashSet.contains(sb4.toString())) {
                                                        continue;
                                                    } else {
                                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                                                        TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                                        tL_messageMediaVenue3.geo = tL_geoPoint3;
                                                        tL_geoPoint3.lat = latitude;
                                                        tL_geoPoint3._long = longitude;
                                                        tL_messageMediaVenue3.query_id = -1L;
                                                        tL_messageMediaVenue3.title = sb4.toString();
                                                        tL_messageMediaVenue3.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                                        tL_messageMediaVenue3.emoji = LocationController.countryCodeToEmoji(address2.getCountryCode());
                                                        hashSet.add(tL_messageMediaVenue3.title);
                                                        tL_messageMediaVenue3.address = LocaleController.getString(R.string.Country);
                                                        if (address3 != null) {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress8 = new TL_stories.TL_geoPointAddress();
                                                            tL_messageMediaVenue3.geoAddress = tL_geoPointAddress8;
                                                            tL_geoPointAddress8.country_iso2 = address3.getCountryCode();
                                                        }
                                                        arrayList7.add(tL_messageMediaVenue3);
                                                        if (arrayList7.size() >= i10) {
                                                            AndroidUtilities.runOnUIThread(new y0(cVar, location, str, arrayList7, 17));
                                                        }
                                                    }
                                                }
                                            } else {
                                                try {
                                                    StringBuilder sb10 = new StringBuilder();
                                                    try {
                                                        String addressLine = address2.getAddressLine(0);
                                                        if (!TextUtils.isEmpty(addressLine)) {
                                                            sb10.append(addressLine);
                                                        }
                                                    } catch (Exception unused4) {
                                                    }
                                                    if (sb10.length() > 0) {
                                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                                        TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                                        tL_messageMediaVenue4.geo = tL_geoPoint4;
                                                        tL_geoPoint4.lat = latitude;
                                                        tL_geoPoint4._long = longitude;
                                                        tL_messageMediaVenue4.query_id = -1L;
                                                        tL_messageMediaVenue4.title = sb10.toString();
                                                        tL_messageMediaVenue4.icon = "pin";
                                                        tL_messageMediaVenue4.address = LocaleController.getString(R.string.PassportAddress);
                                                        arrayList7.add(tL_messageMediaVenue4);
                                                    }
                                                    hashSet3 = hashSet6;
                                                } catch (Exception unused5) {
                                                }
                                            }
                                            hashSet = hashSet4;
                                        } else {
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(locality2);
                                        }
                                    } else {
                                        if (sb2.length() > 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(subLocality);
                                    }
                                } else {
                                    if (sb2.length() > 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(thoroughfare);
                                }
                                z11 = false;
                                if (TextUtils.isEmpty(str3)) {
                                }
                                boolean z162 = z11;
                                countryName = address2.getCountryName();
                                if (TextUtils.isEmpty(countryName)) {
                                }
                                cVar = cVar2;
                                if (cVar2.e) {
                                }
                                hashSet = hashSet4;
                            }
                            hashSet2 = hashSet3;
                            cVar2 = cVar;
                            z15 = z10;
                            str6 = str2;
                            locale2 = locale;
                            fromLocationName2 = list;
                            location2 = location;
                            str8 = str;
                            fromLocationName = list2;
                            i11 = i12 + 1;
                        }
                    } else {
                        z10 = z15;
                    }
                    address = null;
                    if (address2.hasLatitude()) {
                    }
                    locale = locale2;
                    str2 = str6;
                    list = fromLocationName2;
                    hashSet3 = hashSet2;
                    location = location2;
                    str = str8;
                    i12 = i11;
                    list2 = fromLocationName;
                    cVar = cVar2;
                    hashSet2 = hashSet3;
                    cVar2 = cVar;
                    z15 = z10;
                    str6 = str2;
                    locale2 = locale;
                    fromLocationName2 = list;
                    location2 = location;
                    str8 = str;
                    fromLocationName = list2;
                    i11 = i12 + 1;
                }
                cVar = cVar2;
                location = location2;
                str = str8;
                AndroidUtilities.runOnUIThread(new y0(cVar, location, str, arrayList7, 17));
                break;
            case 10:
                hg.a1 a1Var = (hg.a1) this.b;
                String str10 = (String) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.c;
                MessagesController messagesController2 = (MessagesController) this.f;
                MessagesStorage messagesStorage = (MessagesStorage) this.h;
                hg.j1 j1Var = a1Var.e;
                String str11 = j1Var.q0;
                if (str11 != null && str11.equals(str10)) {
                    if (tL_error3 == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject4;
                        if (!tL_contacts_resolvedPeer2.users.isEmpty()) {
                            TLRPC.User user3 = tL_contacts_resolvedPeer2.users.get(0);
                            messagesController2.putUser(user3, false);
                            messagesStorage.putUsersAndChats(tL_contacts_resolvedPeer2.users, null, true, true);
                            user = user3;
                            j1Var.R(user);
                            j1Var.t0 = 0;
                            break;
                        }
                    }
                    user = null;
                    j1Var.R(user);
                    j1Var.t0 = 0;
                }
                break;
            case 11:
                TLObject tLObject5 = (TLObject) this.c;
                String[] strArr2 = (String[]) this.b;
                final FrameLayout frameLayout = (FrameLayout) this.e;
                final x90 x90Var = (x90) this.f;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.h;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                if (tLObject5 instanceof TL_phone.exportedGroupCallInvite) {
                    final String str12 = ((TL_phone.exportedGroupCallInvite) tLObject5).link;
                    strArr2[0] = str12;
                    if (str12.startsWith("https://")) {
                        str12 = str12.substring(8);
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.l8
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float abs = (Math.abs(floatValue - 0.5f) / 5.0f) + 0.9f;
                            FrameLayout frameLayout2 = frameLayout;
                            frameLayout2.setScaleX(abs);
                            frameLayout2.setScaleY(abs);
                            if (floatValue >= 0.5f) {
                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                if (atomicBoolean2.get()) {
                                    return;
                                }
                                atomicBoolean2.set(true);
                                x90Var.setText(str12);
                            }
                        }
                    });
                    duration.addListener(new org.telegram.ui.d9(atomicBoolean, x90Var, str12));
                    duration.start();
                    new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, d6Var).M(LocaleController.getString(R.string.GroupCallCreatedLinkRevokedTitle), LocaleController.getString(R.string.GroupCallCreatedLinkRevokedText), R.raw.linkbroken).j();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.vb vbVar = (org.telegram.ui.vb) this.b;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.c;
                ArrayList arrayList8 = (ArrayList) this.e;
                ArrayList arrayList9 = (ArrayList) this.f;
                ArrayList arrayList10 = (ArrayList) this.h;
                org.telegram.ui.ta taVar = (org.telegram.ui.ta) this.d;
                TLRPC.Chat chat = vbVar.f;
                vbVar.Z = channelParticipant;
                if (channelParticipant != null) {
                    if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                        if (ChatObject.isChannel(chat)) {
                            TLRPC.ChannelParticipant adminInChannel = vbVar.getMessagesController().getAdminInChannel(channelParticipant.peer.user_id, chat.id);
                            if (adminInChannel != null) {
                                if (!(adminInChannel instanceof TLRPC.TL_channelParticipantCreator)) {
                                    break;
                                }
                                break;
                            }
                        } else {
                            TLRPC.ChatFull chatFull = vbVar.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                int size = chatParticipants.participants.size();
                                while (true) {
                                    if (i14 < size) {
                                        TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i14);
                                        if (chatParticipant.user_id == channelParticipant.peer.user_id) {
                                            if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                                break;
                                            }
                                        } else {
                                            i14++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (ChatObject.canUserDoAction(chat, channelParticipant, 6) || ChatObject.canUserDoAction(chat, channelParticipant, 7)) {
                        arrayList8.add(LocaleController.getString(R.string.Restrict));
                        org.telegram.ui.Cells.c1.m(R.drawable.msg_block2, 33, arrayList9, arrayList10);
                    }
                    arrayList8.add(LocaleController.getString(R.string.Ban));
                    org.telegram.ui.Cells.c1.m(R.drawable.msg_block, 35, arrayList9, arrayList10);
                }
                taVar.run();
                break;
            case 13:
                qn qnVar = (qn) this.b;
                pf.c cVar3 = (pf.c) this.e;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f;
                String str13 = (String) this.h;
                TLObject tLObject6 = (TLObject) this.c;
                CharacterStyle characterStyle = (CharacterStyle) this.d;
                cVar3.b();
                i80 I = i80.I(qnVar, u1Var);
                zm0 zm0Var = new zm0(qnVar.getParentActivity(), qnVar.ea);
                I.p = new qe(zm0Var, i14);
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyCardNumber), new ue(qnVar, zm0Var, str13, 3), false);
                if (tLObject6 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject6;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList11 = tL_payments_bankCardData.open_urls;
                    int size2 = arrayList11.size();
                    int i22 = 0;
                    while (i22 < size2) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList11.get(i22);
                        i22++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        I.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new org.telegram.ui.i0(28, qnVar, tL_bankCardOpenUrl2), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        I.k();
                        I.p(13, AndroidUtilities.dp(200.0f), tL_payments_bankCardData.title);
                    }
                }
                zm0Var.e(I);
                zm0Var.f(u1Var, characterStyle, null, false);
                qnVar.showDialog(zm0Var);
                break;
            case 14:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                Context context = (Context) this.b;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.c;
                ei.d dVar = (ei.d) this.e;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.f;
                Runnable runnable2 = (Runnable) this.h;
                if (tL_error4 != null) {
                    new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(context), d6Var2).f0(tL_error4, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    f3Var2.dismiss();
                    new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(context), d6Var2).Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumReadSet)).j();
                    runnable2.run();
                    break;
                }
            case 15:
                qy0 qy0Var = (qy0) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.e;
                TextView textView = (TextView) this.f;
                TextView textView2 = (TextView) this.h;
                int[] iArr2 = (int[]) this.d;
                qy0Var.getClass();
                if (!(tLObject7 instanceof TLRPC.TL_stickers_suggestedShortName) || (str5 = ((TLRPC.TL_stickers_suggestedShortName) tLObject7).short_name) == null) {
                    z15 = false;
                } else {
                    editTextBoldCursor.setText(str5);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    qy0Var.n0(textView, editTextBoldCursor.getText().toString(), true);
                }
                textView2.setVisibility(0);
                editTextBoldCursor.setPadding(textView2.getMeasuredWidth(), AndroidUtilities.dp(4.0f), 0, 0);
                if (!z15) {
                    editTextBoldCursor.setText("");
                }
                iArr2[0] = 2;
                break;
            case 16:
                vm0.W((vm0) this.b, (TLRPC.TL_error) this.d, (String) this.e, (mm0) this.f, (TLObject) this.c, (TL_account.sendVerifyPhoneCode) this.h);
                break;
            case 17:
                o21.o((o21) this.b, (TLObject) this.c, (CharSequence) this.e, (TLRPC.TL_error) this.d, (byte[]) this.f, (String) this.h);
                break;
            case 18:
                TLObject tLObject8 = (TLObject) this.c;
                Context context2 = (Context) this.b;
                org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                ho0 ho0Var = (ho0) this.d;
                o21 o21Var = new o21(context2, d6Var3, 0L, bArr);
                o21Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject8);
                o21Var.s = new i21(n2Var, context2, d6Var3, ho0Var);
                o21Var.show();
                break;
            case 19:
                a();
                break;
            case 20:
                b();
                break;
            case 21:
                c();
                break;
            case 22:
                d();
                break;
            case 23:
                f();
                break;
            case 24:
                g();
                break;
            case 25:
                h();
                break;
            case 26:
                i();
                break;
            default:
                yh.o1.Q((yh.o1) this.b, (org.telegram.ui.ActionBar.b2) this.e, (TLObject) this.c, (wh1) this.f, (Utilities.Callback) this.h, (TLRPC.TL_error) this.d);
                break;
        }
    }

    public /* synthetic */ g3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    public /* synthetic */ g3(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.c = tLObject;
        this.b = obj;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    public /* synthetic */ g3(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.d6 d6Var, ei.d dVar, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.a = 14;
        this.d = tL_error;
        this.b = context;
        this.c = d6Var;
        this.e = dVar;
        this.f = f3Var;
        this.h = runnable;
    }

    public /* synthetic */ g3(qn qnVar, pf.c cVar, org.telegram.ui.Cells.u1 u1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.a = 13;
        this.b = qnVar;
        this.e = cVar;
        this.f = u1Var;
        this.h = str;
        this.c = tLObject;
        this.d = characterStyle;
    }

    public /* synthetic */ g3(vm0 vm0Var, TLRPC.TL_error tL_error, String str, mm0 mm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.a = 16;
        this.b = vm0Var;
        this.d = tL_error;
        this.e = str;
        this.f = mm0Var;
        this.c = tLObject;
        this.h = sendverifyphonecode;
    }

    public /* synthetic */ g3(o21 o21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.a = 17;
        this.b = o21Var;
        this.c = tLObject;
        this.e = charSequence;
        this.d = tL_error;
        this.f = bArr;
        this.h = str;
    }

    public /* synthetic */ g3(h61 h61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.a = 19;
        this.b = h61Var;
        this.d = tL_error;
        this.c = inputCheckPasswordSRP;
        this.e = user;
        this.f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public /* synthetic */ g3(org.telegram.ui.web.a1 a1Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.a = 25;
        this.b = a1Var;
        this.c = tLObject;
        this.e = tL_messages_requestUrlAuth;
        this.f = str;
        this.d = tL_error;
        this.h = str2;
    }

    public /* synthetic */ g3(yh.o1 o1Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, wh1 wh1Var, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.a = 27;
        this.b = o1Var;
        this.e = b2Var;
        this.c = tLObject;
        this.f = wh1Var;
        this.h = callback;
        this.d = tL_error;
    }
}
