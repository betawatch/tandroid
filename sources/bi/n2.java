package bi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import c8.wa;
import di.pb;
import hi.hc;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.a21;
import org.telegram.ui.a31;
import org.telegram.ui.bn;
import org.telegram.ui.ch;
import org.telegram.ui.ei0;
import org.telegram.ui.fe;
import org.telegram.ui.fk0;
import org.telegram.ui.ii;
import org.telegram.ui.je;
import org.telegram.ui.ky0;
import org.telegram.ui.lb;
import org.telegram.ui.mo0;
import org.telegram.ui.n81;
import org.telegram.ui.ne;
import org.telegram.ui.oy0;
import org.telegram.ui.py0;
import org.telegram.ui.ua;
import org.telegram.ui.wj0;
import org.telegram.ui.yi0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ n2(di.y8 y8Var, Object obj, fj fjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, w10 w10Var, int i7) {
        this.a = i7;
        this.d = y8Var;
        this.e = obj;
        this.b = fjVar;
        this.f = inputInvoice;
        this.c = tL_payments_paymentFormStars;
        this.h = w10Var;
    }

    private final void a() {
        org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) this.d;
        String str = (String) this.e;
        byte[] bArr = (byte[]) this.b;
        org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) this.f;
        byte[] bArr2 = j2Var.b;
        org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.h;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
        org.telegram.ui.Wallet.v0 v0Var = m2Var.b;
        if (!TextUtils.equals(str, v0Var.y()) || !Arrays.equals(bArr, v0Var.E())) {
            Arrays.fill(bArr2, (byte) 0);
            f0Var.a(null, "Wallet changed. Open the request again.");
            return;
        }
        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
        inputtonconnectoauthsession.session_id = tonconnectsession.id;
        inputtonconnectoauthsession.challenge_answer = bArr2;
        inputtonconnectoauthsession.body = j2Var.c;
        inputtonconnectoauthsession.proof = j2Var.d;
        f0Var.a(inputtonconnectoauthsession, null);
    }

    private final void b() {
        org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) this.d;
        String str = (String) this.e;
        w10 w10Var = (w10) this.h;
        org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.b;
        org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) this.f;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.c;
        if (str != null) {
            w10Var.a(str);
        } else if (!m2Var.A(i2Var) || m2Var.j(i2Var)) {
            w10Var.a("Request expired or wallet changed");
        } else {
            m2Var.f.sendRequestTyped(sendtransfer, new d3.b(1), new ne(m2Var, w10Var, i2Var, s0Var, sendtransfer, 6));
        }
    }

    private final void c() {
        org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) this.d;
        org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.e;
        org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) this.b;
        a31 a31Var = (a31) this.f;
        JSONObject jSONObject = (JSONObject) this.h;
        String str = (String) this.c;
        if (!m2Var.A(i2Var) || m2Var.j(i2Var)) {
            m2Var.y(i2Var, s0Var, null, 0, "Request expired or wallet changed", a31Var);
        } else {
            m2Var.y(i2Var, s0Var, jSONObject, jSONObject == null ? 0 : -1, str, a31Var);
        }
    }

    private final void d() {
        org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) this.d;
        int[] iArr = (int[]) this.e;
        TextView textView = (TextView) this.b;
        org.telegram.ui.Wallet.w7 w7Var = (org.telegram.ui.Wallet.w7) this.f;
        org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) this.h;
        org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.c;
        if (z2Var.e || z2Var.d) {
            return;
        }
        iArr[0] = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        spannableStringBuilder.setSpan(new o80(org.telegram.messenger.g0.L(80.0f), textView), 0, spannableStringBuilder.length(), 33);
        textView.setText(gd.V(null, null, 2131742868, spannableStringBuilder));
        w7Var.run();
        WalletEngine2 walletEngine2 = v0Var.b;
        if (walletEngine2 != null) {
            walletEngine2.previewTonConnect(l2Var, new di.s1(z2Var, iArr, v0Var, textView, l2Var, w7Var));
            return;
        }
        iArr[0] = 3;
        textView.setText(gd.N0(2131742715, null));
        w7Var.run();
    }

    private final void f() {
        ((WalletEngine2) this.d).lambda$prepareSendNFT$29((String) this.e, (String) this.b, (String) this.f, (byte[]) this.h, (p10) this.c);
    }

    private final void g() {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.d;
        TLObject tLObject = (TLObject) this.b;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
        String str = (String) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.i6 i6Var = v0Var.e;
        if (tLObject == null) {
            if (tL_error != null) {
                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    new kc(v0Var, i6Var).I(R.raw.error, gd.N0(2131753125, null), org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, i6Var), gd.a0(null, null, 2131753127, str2))).j();
                    return;
                } else {
                    new kc(v0Var, i6Var).g0(tL_error, false);
                    return;
                }
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
            ei0.b(false, v0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, v0Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
            ei0.b(false, v0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, v0Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
            org.telegram.ui.Components.b5.m0(v0Var.getContext(), str, false, true, true, false, 0L, null, null, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x07d3, code lost:
    
        if (r1.admin_rights.manage_call != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x080e, code lost:
    
        if (r8.creator != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x080a, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L259;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        org.telegram.ui.ActionBar.g2 T;
        TLRPC.User user;
        String str;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        String str2;
        ky0 ky0Var;
        ky0 ky0Var2;
        hi.e eVar;
        int i7;
        int i10 = 7;
        int i11 = 17;
        int i12 = 3;
        int i13 = 1;
        final int i14 = 0;
        switch (this.a) {
            case 0:
                final p3 p3Var = (p3) this.d;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.e;
                TLObject tLObject = (TLObject) this.b;
                ai.d1 d1Var = (ai.d1) this.f;
                final w10 w10Var = (w10) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                t1Var.dismiss();
                if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
                    d1Var.run();
                    break;
                } else if (tLObject instanceof TL_stars.checkCanSendGiftResultFail) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, p3Var.getContext(), p3Var.J0);
                    alertDialog$Builder.a.S = gd.N0(2131749734, null);
                    alertDialog$Builder.a.U = fj.h0(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
                    alertDialog$Builder.k(gd.N0(2131747637, null), null);
                    final org.telegram.ui.ActionBar.t1 p10 = alertDialog$Builder.p();
                    final xt xtVar = p10.n;
                    if (xtVar != null) {
                        xtVar.setOnLinkPressListener(new i80() { // from class: bi.p2
                            @Override // org.telegram.ui.Components.i80
                            public final void a(ClickableSpan clickableSpan) {
                                p3 p3Var2 = p3.this;
                                p3Var2.getClass();
                                p10.dismiss();
                                w10 w10Var2 = w10Var;
                                if (w10Var2 != null) {
                                    w10Var2.a(Boolean.FALSE);
                                }
                                p3Var2.dismiss();
                                clickableSpan.onClick(xtVar);
                            }
                        });
                        break;
                    }
                } else if (tL_error != null) {
                    new kc(p3Var.c, p3Var.J0).g0(tL_error, false);
                    break;
                }
                break;
            case 1:
                final di.f6 f6Var = (di.f6) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                final CharSequence charSequence = (CharSequence) this.e;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f;
                final TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.h;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (tLObject2 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                    ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
                    int size = arrayList.size();
                    long j3 = 0;
                    int i15 = 0;
                    while (i15 < size) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i15);
                        i15++;
                        j3 += tL_labeledPrice.amount;
                    }
                    LinearLayout linearLayout = new LinearLayout(f6Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
                    TextView b10 = wa.b(f6Var.getContext(), 16.0f, org.telegram.ui.ActionBar.n6.j5, false, null);
                    b10.setText(gd.N0(2131750024, null));
                    linearLayout.addView(b10, na.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                    dy0 dy0Var = new dy0(f6Var.getContext(), f6Var.J0);
                    by0 a10 = dy0Var.a(charSequence);
                    a10.setFilled(true);
                    xh.l lVar = (xh.l) a10.getChildAt(0);
                    lVar.setTextSize(1, 12.0f);
                    lVar.setGravity(17);
                    linearLayout.addView(dy0Var, na.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
                    alertDialog$Builder2.a.S = gd.N0(2131750023, null);
                    alertDialog$Builder2.o(linearLayout);
                    alertDialog$Builder2.h(gd.N0(2131752577, null), null);
                    final long j10 = j3;
                    alertDialog$Builder2.k(pb.T0(gd.a0(null, null, 2131750025, Integer.valueOf((int) j3))), new org.telegram.ui.ActionBar.q1() { // from class: di.f3
                        @Override // org.telegram.ui.ActionBar.q1
                        public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i16) {
                            vf.b h = t1Var2.h(-1, true, true);
                            h.d();
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = paymentForm.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
                            f6 f6Var2 = f6.this;
                            ConnectionsManager.getInstance(f6Var2.a).sendRequest(tL_payments_sendStarsForm, new k3(f6Var2, h, t1Var2, tL_starGiftUnique, j10, charSequence));
                        }
                    });
                    alertDialog$Builder2.p();
                    break;
                } else if (tL_error2 != null) {
                    f6Var.k().g0(tL_error2, false);
                    break;
                }
                break;
            case 2:
                di.f6 f6Var2 = (di.f6) this.d;
                TLObject tLObject3 = (TLObject) this.b;
                f2[] f2VarArr = (f2[]) this.e;
                Long l10 = (Long) this.f;
                aa.r rVar = (aa.r) this.h;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                if (tLObject3 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject3;
                    mp.u1(f6Var2.a).f4(tL_users_userFull.users, false);
                    mp.u1(f6Var2.a).Z3(tL_users_userFull.chats, false);
                    TLRPC.UserFull userFull = tL_users_userFull.full_user;
                    if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                        m10.u(gd.a0(null, null, 2131743495, org.telegram.messenger.n5.t(l10.longValue())), new kc(f2VarArr[0].c, f6Var2.J0), R.raw.error, 36);
                        break;
                    } else {
                        rVar.run();
                        break;
                    }
                } else {
                    fc Z = f6Var2.k().Z(tL_error3);
                    Z.t = true;
                    Z.j();
                    break;
                }
                break;
            case 3:
                di.y8 y8Var = (di.y8) this.d;
                List list = (List) this.e;
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.b;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f;
                f5.f fVar = (f5.f) this.h;
                Activity activity = (Activity) this.c;
                if (list.isEmpty()) {
                    org.telegram.messenger.g0.g3(new di.x6(f0Var, i14));
                    break;
                } else {
                    f5.m mVar = (f5.m) list.get(0);
                    if (mVar.a() == null) {
                        org.telegram.messenger.g0.g3(new di.x6(f0Var, 1));
                        break;
                    } else {
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
                        ConnectionsManager.getInstance(y8Var.a).sendRequest(tL_payments_canPurchaseStore, new di.y6(mVar, fVar, f0Var, activity, tL_inputStorePaymentStarsGiveaway, list, 0));
                        break;
                    }
                }
            case 4:
                di.y8 y8Var2 = (di.y8) this.d;
                boolean[] zArr = (boolean[]) this.e;
                fj fjVar = (fj) this.b;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.c;
                w10 w10Var2 = (w10) this.h;
                zArr[0] = true;
                y8Var2.Y(fjVar, inputInvoice, tL_payments_paymentFormStars, new di.c2(w10Var2, 1));
                break;
            case 5:
                di.y8 y8Var3 = (di.y8) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                fj fjVar2 = (fj) this.e;
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.f;
                ch chVar = (ch) this.h;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                if (tLObject4 instanceof TLRPC.TL_payments_paymentFormStars) {
                    y8Var3.W(fjVar2, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject4, chVar, null);
                } else {
                    di.y8.e(tL_error4 == null ? "NO_PAYMENT_FORM" : tL_error4.text);
                }
                chVar.run();
                break;
            case 6:
                di.y8 y8Var4 = (di.y8) this.d;
                Runnable runnable = (Runnable) this.e;
                fj fjVar3 = (fj) this.b;
                TLRPC.InputInvoice inputInvoice2 = (TLRPC.InputInvoice) this.f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = (TLRPC.TL_payments_paymentFormStars) this.c;
                w10 w10Var3 = (w10) this.h;
                if (y8Var4.e) {
                    y8Var4.W(fjVar3, inputInvoice2, tL_payments_paymentFormStars2, runnable, w10Var3);
                    break;
                } else {
                    di.y8.e("NO_BALANCE");
                    runnable.run();
                    break;
                }
            case 7:
                di.n8 n8Var = (di.n8) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.e;
                di.p8 p8Var = (di.p8) this.f;
                w10 w10Var4 = (w10) this.h;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                long j11 = n8Var.b;
                int i16 = n8Var.a;
                HashMap hashMap = n8Var.h;
                ArrayList arrayList2 = n8Var.e;
                n8Var.k = false;
                if (tLObject5 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject5;
                    arrayList2.remove(tL_starGiftCollection);
                    arrayList2.add(tL_starGiftCollection2);
                    hashMap.remove(-1);
                    int i17 = tL_starGiftCollection2.collection_id;
                    p8Var.d = i17;
                    hashMap.put(Integer.valueOf(i17), p8Var);
                    n8Var.j();
                    ks.f(i16).k(ks.J3, Long.valueOf(j11), n8Var);
                    w10Var4.a(tL_starGiftCollection2);
                    break;
                } else {
                    if (tL_error5 != null && (T = LaunchActivity.T()) != null) {
                        kc.b0(T).g0(tL_error5, false);
                    }
                    arrayList2.remove(tL_starGiftCollection);
                    hashMap.remove(-1);
                    n8Var.j();
                    ks.f(i16).k(ks.J3, Long.valueOf(j11), n8Var);
                    break;
                }
            case 8:
                fi.h6 h6Var = (fi.h6) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList arrayList4 = (ArrayList) this.b;
                ArrayList arrayList5 = (ArrayList) this.f;
                ArrayList arrayList6 = (ArrayList) this.h;
                HashSet hashSet = (HashSet) this.c;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                sb2.append(h6Var.e);
                sb2.append("{");
                sb2.append(h6Var.d);
                sb2.append("} preloadCache {");
                sb2.append(fi.p6.a(arrayList3));
                p5.c.s("}", sb2);
                ArrayList arrayList7 = h6Var.g;
                arrayList7.clear();
                arrayList7.addAll(arrayList4);
                h6Var.t = false;
                int i18 = h6Var.c;
                mp.u1(i18).f4(arrayList5, true);
                mp.u1(i18).Z3(arrayList6, true);
                if (h6Var.v) {
                    h6Var.v = false;
                    h6Var.y = null;
                    h6Var.j();
                    break;
                } else {
                    h6Var.m.addAll(hashSet);
                    h6Var.k.clear();
                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                        h6Var.t((fj) arrayList3.get(i19), true);
                    }
                    h6Var.d(false);
                    fi.g6 g6Var = h6Var.y;
                    if (g6Var != null) {
                        g6Var.a(0);
                        h6Var.y = null;
                    }
                    ks.f(i18).k(ks.A5, h6Var);
                    break;
                }
            case 9:
                int[] iArr = (int[]) this.d;
                TLObject tLObject6 = (TLObject) this.b;
                mp mpVar = (mp) this.e;
                TLRPC.User[] userArr = (TLRPC.User[]) this.f;
                hc hcVar = (hc) this.h;
                hi.fc fcVar = (hi.fc) this.c;
                iArr[0] = 0;
                if (tLObject6 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject6;
                    mpVar.f4(tL_contacts_resolvedPeer.users, false);
                    mpVar.Z3(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User c22 = mpVar.c2(Long.valueOf(org.telegram.messenger.n5.o(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = c22;
                    if (c22 != null) {
                        hcVar.run();
                        break;
                    }
                }
                fcVar.a(null);
                break;
            case 10:
                jg.z0 z0Var = (jg.z0) this.d;
                String str3 = (String) this.e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.b;
                mp mpVar2 = (mp) this.f;
                tr trVar = (tr) this.h;
                jg.h1 h1Var = z0Var.e;
                String str4 = h1Var.r0;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error6 == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject7;
                        if (!tL_contacts_resolvedPeer2.users.isEmpty()) {
                            TLRPC.User user2 = tL_contacts_resolvedPeer2.users.get(0);
                            mpVar2.e4(user2, false, false);
                            trVar.m1(tL_contacts_resolvedPeer2.users, null, true, true);
                            user = user2;
                            h1Var.R(user);
                            h1Var.u0 = 0;
                            break;
                        }
                    }
                    user = null;
                    h1Var.R(user);
                    h1Var.u0 = 0;
                }
                break;
            case 11:
                TLObject tLObject8 = (TLObject) this.b;
                String[] strArr = (String[]) this.d;
                final FrameLayout frameLayout = (FrameLayout) this.e;
                final j80 j80Var = (j80) this.f;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.h;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                if (tLObject8 instanceof TL_phone.exportedGroupCallInvite) {
                    final String str5 = ((TL_phone.exportedGroupCallInvite) tLObject8).link;
                    strArr[0] = str5;
                    if (str5.startsWith("https://")) {
                        str5 = str5.substring(8);
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.k8
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
                                j80Var.setText(str5);
                            }
                        }
                    });
                    duration.addListener(new org.telegram.ui.b9(atomicBoolean, j80Var, str5));
                    duration.start();
                    new kc(w2Var.F, i6Var).I(R.raw.linkbroken, gd.N0(2131749282, null), gd.N0(2131749283, null)).j();
                    break;
                }
                break;
            case 12:
                lb lbVar = (lb) this.d;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.e;
                ArrayList arrayList8 = (ArrayList) this.b;
                ArrayList arrayList9 = (ArrayList) this.f;
                ArrayList arrayList10 = (ArrayList) this.h;
                ua uaVar = (ua) this.c;
                TLRPC.Chat chat = lbVar.f;
                lbVar.a0 = channelParticipant;
                if (channelParticipant != null) {
                    if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                        if (org.telegram.messenger.v3.T(chat)) {
                            mp messagesController = lbVar.getMessagesController();
                            long j12 = channelParticipant.peer.user_id;
                            a0.h hVar = (a0.h) messagesController.A1.f(chat.id);
                            TLRPC.ChannelParticipant channelParticipant2 = hVar == null ? null : (TLRPC.ChannelParticipant) hVar.f(j12);
                            if (channelParticipant2 != null) {
                                if (!(channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) {
                                    break;
                                }
                                break;
                            }
                        } else {
                            TLRPC.ChatFull P0 = lbVar.getMessagesController().P0(chat.id);
                            if (P0 != null && (chatParticipants = P0.participants) != null) {
                                int size2 = chatParticipants.participants.size();
                                while (true) {
                                    if (i14 < size2) {
                                        TLRPC.ChatParticipant chatParticipant = P0.participants.participants.get(i14);
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
                    if (org.telegram.messenger.v3.x(chat, channelParticipant, 6) || org.telegram.messenger.v3.x(chat, channelParticipant, 7)) {
                        str = null;
                        org.telegram.ui.Cells.c0.v(null, 2131745867, arrayList8, R.drawable.msg_block2, arrayList9);
                        arrayList10.add(33);
                    } else {
                        str = null;
                    }
                    org.telegram.ui.Cells.c0.v(str, 2131753726, arrayList8, R.drawable.msg_block, arrayList9);
                    arrayList10.add(35);
                }
                uaVar.run();
                break;
            case 13:
                bn bnVar = (bn) this.d;
                vf.b bVar = (vf.b) this.e;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f;
                String str6 = (String) this.h;
                TLObject tLObject9 = (TLObject) this.b;
                CharacterStyle characterStyle = (CharacterStyle) this.c;
                bVar.b();
                x60 J = x60.J(bnVar, r1Var);
                yk0 yk0Var = new yk0(bnVar.getParentActivity(), bnVar.Ba);
                J.p = new fe(yk0Var, i14);
                J.c(R.drawable.msg_copy, gd.N0(2131751754, null), new je(bnVar, yk0Var, str6, 2), false);
                if (tLObject9 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject9;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList11 = tL_payments_bankCardData.open_urls;
                    int size3 = arrayList11.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList11.get(i20);
                        i20++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        J.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new org.telegram.ui.u5(26, bnVar, tL_bankCardOpenUrl2), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        J.k();
                        J.p(13, org.telegram.messenger.g0.L(200.0f), tL_payments_bankCardData.title);
                    }
                }
                yk0Var.e(J);
                yk0Var.f(r1Var, characterStyle, null, false);
                bnVar.showDialog(yk0Var);
                break;
            case 14:
                qf qfVar = (qf) this.d;
                ji.e eVar2 = (ji.e) this.e;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                View view = (View) this.f;
                RectF rectF = (RectF) this.h;
                hi.c7 c7Var = (hi.c7) this.c;
                qfVar.getClass();
                eVar2.getLocationInWindow(new int[2]);
                frameLayout2.getLocationInWindow(new int[2]);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.leftMargin = Math.round((rectF.left + r8[0]) - r7[0]);
                layoutParams.topMargin = Math.round((rectF.top + r8[1]) - r7[1]);
                view.setLayoutParams(layoutParams);
                view.post(new oi.h(qfVar, frameLayout2, view, c7Var, 25));
                break;
            case 15:
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) this.e;
                hi.e eVar3 = (hi.e) this.b;
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.f;
                Runnable runnable2 = (Runnable) this.h;
                if (tL_error7 != null) {
                    new kc(bb.a(context), i6Var2).g0(tL_error7, false);
                    break;
                } else {
                    eVar3.setLoading(false);
                    p6Var.dismiss();
                    org.telegram.messenger.f3.n(null, 2131746759, new kc(bb.a(context), i6Var2), R.raw.chats_infotip, 36);
                    runnable2.run();
                    break;
                }
            case 16:
                jw0 jw0Var = (jw0) this.d;
                TLObject tLObject10 = (TLObject) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.e;
                TextView textView = (TextView) this.f;
                TextView textView2 = (TextView) this.h;
                int[] iArr2 = (int[]) this.c;
                jw0Var.getClass();
                if (!(tLObject10 instanceof TLRPC.TL_stickers_suggestedShortName) || (str2 = ((TLRPC.TL_stickers_suggestedShortName) tLObject10).short_name) == null) {
                    z10 = false;
                } else {
                    editTextBoldCursor.setText(str2);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    jw0Var.L0(textView, editTextBoldCursor.getText().toString(), true);
                    z10 = true;
                }
                textView2.setVisibility(0);
                editTextBoldCursor.setPadding(textView2.getMeasuredWidth(), org.telegram.messenger.g0.L(4.0f), 0, 0);
                if (!z10) {
                    editTextBoldCursor.setText("");
                }
                iArr2[0] = 2;
                break;
            case 17:
                fk0.b0((fk0) this.d, (TLRPC.TL_error) this.c, (String) this.e, (wj0) this.f, (TLObject) this.b, (TL_account.sendVerifyPhoneCode) this.h);
                break;
            case 18:
                py0 py0Var = (py0) this.d;
                TLObject tLObject11 = (TLObject) this.b;
                CharSequence charSequence2 = (CharSequence) this.e;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.c;
                byte[] bArr = (byte[]) this.f;
                String str7 = (String) this.h;
                hi.q1 q1Var = py0Var.m1;
                if ((q1Var.getCurrentView() instanceof oy0) && (eVar = ((oy0) q1Var.getCurrentView()).s) != null) {
                    eVar.setLoading(false);
                }
                if (tLObject11 != null) {
                    boolean z11 = tLObject11 instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
                    if (!z11 && !(tLObject11 instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject11 instanceof TLRPC.TL_reportResultAddComment)) {
                        if (tLObject11 instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            mp.u1(py0Var.a).p0(false);
                            ky0 ky0Var3 = py0Var.v1;
                            if (ky0Var3 != null) {
                                ky0Var3.d();
                                py0Var.dismiss();
                                break;
                            }
                        } else if (((tLObject11 instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject11 instanceof TLRPC.TL_reportResultReported)) && (ky0Var2 = py0Var.v1) != null) {
                            ky0Var2.a();
                            py0Var.dismiss();
                            break;
                        }
                    } else {
                        q1Var.C(q1Var.b + 1);
                        oy0 oy0Var = (oy0) q1Var.getViewPages()[1];
                        if (oy0Var != null) {
                            g51 g51Var = oy0Var.f;
                            if (tLObject11 instanceof TLRPC.TL_reportResultChooseOption) {
                                oy0Var.b = null;
                                oy0Var.c = (TLRPC.TL_reportResultChooseOption) tLObject11;
                                oy0Var.d = null;
                                g51Var.g3.O(false);
                            } else if (tLObject11 instanceof TLRPC.TL_reportResultAddComment) {
                                oy0Var.b((TLRPC.TL_reportResultAddComment) tLObject11);
                            } else if (z11) {
                                oy0Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject11;
                                oy0Var.c = null;
                                oy0Var.d = null;
                                g51Var.g3.O(false);
                            }
                            if (charSequence2 != null) {
                                di.n4 n4Var = oy0Var.h;
                                ((TextView) n4Var.c).setText(charSequence2);
                                ((TextView) n4Var.c).getText();
                                n4Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), TLObject.FLAG_31));
                                if (g51Var != null) {
                                    g51Var.g3.O(true);
                                    break;
                                }
                            }
                        }
                    }
                } else if (tL_error8 != null) {
                    if (!py0Var.p1 && "MESSAGE_ID_REQUIRED".equals(tL_error8.text)) {
                        long j13 = py0Var.u1;
                        String charSequence3 = charSequence2.toString();
                        int i21 = bn.md;
                        org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                        if (T2 != null) {
                            Bundle bundle = new Bundle();
                            if (org.telegram.messenger.n5.E(j13)) {
                                bundle.putLong("user_id", j13);
                            } else {
                                bundle.putLong("chat_id", -j13);
                            }
                            bundle.putString("reportTitle", charSequence3);
                            bundle.putByteArray("reportOption", bArr);
                            bundle.putString("reportMessage", str7);
                            T2.presentFragment(new bn(bundle));
                        }
                    } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error8.text)) {
                        ky0 ky0Var4 = py0Var.v1;
                        if (ky0Var4 != null) {
                            ky0Var4.i();
                        }
                    } else if ("AD_EXPIRED".equals(tL_error8.text) && (ky0Var = py0Var.v1) != null) {
                        ky0Var.a();
                    }
                    py0Var.dismiss();
                    break;
                }
                break;
            case 19:
                TLObject tLObject12 = (TLObject) this.b;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) this.e;
                byte[] bArr2 = (byte[]) this.f;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.h;
                sh0 sh0Var = (sh0) this.c;
                py0 py0Var2 = new py0(context2, i6Var3, 0L, bArr2);
                py0Var2.O0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject12);
                py0Var2.v1 = new ab.c0(g2Var, context2, i6Var3, sh0Var, 11);
                py0Var2.show();
                break;
            case 20:
                final a21 a21Var = (a21) this.d;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.c;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.e;
                TLRPC.User user3 = (TLRPC.User) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                TLRPC.TL_channels_editCreator tL_channels_editCreator = (TLRPC.TL_channels_editCreator) this.h;
                if (tL_error9 == null) {
                    if (inputCheckPasswordSRP != null) {
                        ii iiVar = a21Var.V1;
                        if (iiVar != null) {
                            iiVar.run();
                        }
                        a21Var.dismiss();
                        twoStepVerificationActivity.t0();
                        twoStepVerificationActivity.finishFragment();
                        break;
                    }
                } else if (a21Var.f2 != null) {
                    if ("PASSWORD_HASH_INVALID".equals(tL_error9.text)) {
                        if (inputCheckPasswordSRP == null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(a21Var.f2);
                            alertDialog$Builder3.a.S = gd.N0(org.telegram.messenger.v3.V(a21Var.T1) ? 2131751310 : 2131751303, null);
                            alertDialog$Builder3.a.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131751280, a21Var.T1.title, n10.k(user3, true)));
                            alertDialog$Builder3.k(gd.N0(2131751284, null), new yi0(i11, a21Var, user3));
                            alertDialog$Builder3.h(gd.N0(2131752577, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.r11
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i22) {
                                    switch (i14) {
                                        case 0:
                                            a21Var.d2.setLoading(false);
                                            break;
                                        case 1:
                                            a21 a21Var2 = a21Var;
                                            a21Var2.getClass();
                                            org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                                            if (T3 != null) {
                                                a21Var2.dismiss();
                                                T3.presentFragment(new za1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            a21Var.d2.setLoading(false);
                                            break;
                                        default:
                                            a21Var.d2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder3.p();
                            break;
                        }
                    } else if (!"PASSWORD_MISSING".equals(tL_error9.text) && !tL_error9.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error9.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error9.text)) {
                            ConnectionsManager.getInstance(a21Var.a).sendRequest(new TL_account.getPassword(), new mo0(a21Var, twoStepVerificationActivity, user3, i10), 8);
                            break;
                        } else if (!tL_error9.text.equals("CHANNELS_TOO_MUCH")) {
                            if (twoStepVerificationActivity != null) {
                                twoStepVerificationActivity.t0();
                                twoStepVerificationActivity.finishFragment();
                            }
                            org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                            if (T3 != null) {
                                org.telegram.ui.Components.b5.e0(tL_error9, T3, org.telegram.messenger.v3.V(a21Var.T1), org.telegram.messenger.v3.Y(a21Var.T1), tL_channels_editCreator);
                                break;
                            }
                        } else if (a21Var.f2 == null || i10.i(org.telegram.messenger.c.a(a21Var.a).a).q()) {
                            org.telegram.ui.ActionBar.g2 T4 = LaunchActivity.T();
                            if (T4 != null) {
                                a21Var.dismiss();
                                T4.presentFragment(new n81(1));
                                break;
                            }
                        } else {
                            org.telegram.ui.ActionBar.g2 T5 = LaunchActivity.T();
                            if (T5 != null) {
                                new ug.k0(5, a21Var.a, a21Var.f2, T5, null);
                                break;
                            }
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.t0();
                        }
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(a21Var.f2);
                        alertDialog$Builder4.a.S = gd.N0(2131751285, null);
                        LinearLayout linearLayout2 = new LinearLayout(a21Var.f2);
                        linearLayout2.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                        linearLayout2.setOrientation(1);
                        alertDialog$Builder4.o(linearLayout2);
                        TextView textView3 = new TextView(a21Var.f2);
                        int i22 = org.telegram.ui.ActionBar.n6.j5;
                        org.telegram.ui.ActionBar.u6.U(textView3, i22, null);
                        textView3.setTextSize(1, 16.0f);
                        textView3.setGravity((gd.a0 ? 5 : 3) | 48);
                        if (org.telegram.messenger.v3.V(a21Var.T1)) {
                            org.telegram.messenger.f3.q(null, null, 2131751271, new Object[]{n10.k(user3, true)}, textView3);
                        } else {
                            org.telegram.messenger.f3.q(null, null, 2131751289, new Object[]{n10.k(user3, true)}, textView3);
                        }
                        linearLayout2.addView(textView3, na.o(-1, -2));
                        LinearLayout linearLayout3 = new LinearLayout(a21Var.f2);
                        linearLayout3.setOrientation(0);
                        linearLayout2.addView(linearLayout3, na.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView = new ImageView(a21Var.f2);
                        imageView.setImageResource(R.drawable.list_circle);
                        imageView.setPadding(gd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), gd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.u6.s(imageView, i22, null, mode);
                        TextView textView4 = new TextView(a21Var.f2);
                        org.telegram.ui.ActionBar.u6.U(textView4, i22, null);
                        textView4.setTextSize(1, 16.0f);
                        textView4.setGravity((gd.a0 ? 5 : 3) | 48);
                        textView4.setText(org.telegram.messenger.g0.W2(gd.N0(2131751288, null)));
                        if (gd.a0) {
                            linearLayout3.addView(textView4, na.o(-1, -2));
                            linearLayout3.addView(imageView, na.r(-2, -2, 5));
                        } else {
                            linearLayout3.addView(imageView, na.o(-2, -2));
                            linearLayout3.addView(textView4, na.o(-1, -2));
                        }
                        LinearLayout linearLayout4 = new LinearLayout(a21Var.f2);
                        linearLayout4.setOrientation(0);
                        linearLayout2.addView(linearLayout4, na.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView2 = new ImageView(a21Var.f2);
                        imageView2.setImageResource(R.drawable.list_circle);
                        imageView2.setPadding(gd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), gd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
                        org.telegram.ui.ActionBar.u6.s(imageView2, i22, null, mode);
                        TextView textView5 = new TextView(a21Var.f2);
                        org.telegram.ui.ActionBar.u6.U(textView5, i22, null);
                        textView5.setTextSize(1, 16.0f);
                        textView5.setGravity((gd.a0 ? 5 : 3) | 48);
                        textView5.setText(org.telegram.messenger.g0.W2(gd.N0(2131751287, null)));
                        if (gd.a0) {
                            linearLayout4.addView(textView5, na.o(-1, -2));
                            i7 = 5;
                            linearLayout4.addView(imageView2, na.r(-2, -2, 5));
                        } else {
                            i7 = 5;
                            linearLayout4.addView(imageView2, na.o(-2, -2));
                            linearLayout4.addView(textView5, na.o(-1, -2));
                        }
                        if ("PASSWORD_MISSING".equals(tL_error9.text)) {
                            final int i23 = 1;
                            alertDialog$Builder4.k(gd.N0(2131751279, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.r11
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i222) {
                                    switch (i23) {
                                        case 0:
                                            a21Var.d2.setLoading(false);
                                            break;
                                        case 1:
                                            a21 a21Var2 = a21Var;
                                            a21Var2.getClass();
                                            org.telegram.ui.ActionBar.g2 T32 = LaunchActivity.T();
                                            if (T32 != null) {
                                                a21Var2.dismiss();
                                                T32.presentFragment(new za1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            a21Var.d2.setLoading(false);
                                            break;
                                        default:
                                            a21Var.d2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                            final int i24 = 2;
                            alertDialog$Builder4.h(gd.N0(2131752577, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.r11
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i222) {
                                    switch (i24) {
                                        case 0:
                                            a21Var.d2.setLoading(false);
                                            break;
                                        case 1:
                                            a21 a21Var2 = a21Var;
                                            a21Var2.getClass();
                                            org.telegram.ui.ActionBar.g2 T32 = LaunchActivity.T();
                                            if (T32 != null) {
                                                a21Var2.dismiss();
                                                T32.presentFragment(new za1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            a21Var.d2.setLoading(false);
                                            break;
                                        default:
                                            a21Var.d2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                        } else {
                            TextView textView6 = new TextView(a21Var.f2);
                            org.telegram.ui.ActionBar.u6.U(textView6, i22, null);
                            textView6.setTextSize(1, 16.0f);
                            org.telegram.messenger.f3.k(textView6, (gd.a0 ? i7 : 3) | 48, null, 2131751286);
                            linearLayout2.addView(textView6, na.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            final int i25 = 3;
                            alertDialog$Builder4.h(gd.N0(2131747637, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.r11
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i222) {
                                    switch (i25) {
                                        case 0:
                                            a21Var.d2.setLoading(false);
                                            break;
                                        case 1:
                                            a21 a21Var2 = a21Var;
                                            a21Var2.getClass();
                                            org.telegram.ui.ActionBar.g2 T32 = LaunchActivity.T();
                                            if (T32 != null) {
                                                a21Var2.dismiss();
                                                T32.presentFragment(new za1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            a21Var.d2.setLoading(false);
                                            break;
                                        default:
                                            a21Var.d2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                        }
                        alertDialog$Builder4.p();
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) this.d;
                String str8 = (String) this.e;
                byte[] bArr3 = (byte[]) this.b;
                a31 a31Var = (a31) this.f;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) this.c;
                org.telegram.ui.Wallet.v0 v0Var = m2Var.b;
                if (!TextUtils.equals(str8, v0Var.y()) || !Arrays.equals(bArr3, v0Var.E())) {
                    a31Var.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                    tonconnectclosesession.session_id = tonconnectsession.id;
                    tonconnectclosesession.body = j2Var.c;
                    m2Var.f.sendRequestTyped(tonconnectclosesession, new d3.b(i13), new org.telegram.ui.Wallet.e(a31Var, i12));
                    break;
                }
            case 22:
                a();
                break;
            case 23:
                b();
                break;
            case 24:
                c();
                break;
            case 25:
                d();
                break;
            case 26:
                ((WalletEngine2) this.d).lambda$prepareTonConnectTransferPair$8((byte[]) this.e, (org.telegram.ui.Wallet.l2) this.b, (String) this.f, (org.telegram.ui.Wallet.l2) this.h, (p10) this.c);
                break;
            case 27:
                f();
                break;
            case 28:
                g();
                break;
            default:
                org.telegram.ui.web.v0 v0Var2 = (org.telegram.ui.web.v0) this.d;
                File file = (File) this.b;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.e;
                String str9 = (String) this.f;
                String str10 = (String) this.h;
                String str11 = (String) this.c;
                if (file == null) {
                    t1Var2.c(500L);
                    break;
                } else {
                    int[] iArr3 = new int[11];
                    Utilities.e.c(new as0(file, iArr3, new di.m6((fs) v0Var2, (Object) iArr3, (Object) file, (Object) t1Var2, str9, (Object) str10, (Object) str11, 15), 11));
                    break;
                }
        }
    }

    public /* synthetic */ n2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
        this.h = obj5;
        this.c = obj6;
    }

    public /* synthetic */ n2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7, boolean z10) {
        this.a = i7;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.c = obj6;
    }

    public /* synthetic */ n2(jg.z0 z0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, mp mpVar, tr trVar) {
        this.a = 10;
        this.d = z0Var;
        this.e = str;
        this.c = tL_error;
        this.b = tLObject;
        this.f = mpVar;
        this.h = trVar;
    }

    public /* synthetic */ n2(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.c = obj5;
    }

    public /* synthetic */ n2(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.i6 i6Var, hi.e eVar, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.a = 15;
        this.c = tL_error;
        this.d = context;
        this.e = i6Var;
        this.b = eVar;
        this.f = p6Var;
        this.h = runnable;
    }

    public /* synthetic */ n2(bn bnVar, vf.b bVar, org.telegram.ui.Cells.r1 r1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.a = 13;
        this.d = bnVar;
        this.e = bVar;
        this.f = r1Var;
        this.h = str;
        this.b = tLObject;
        this.c = characterStyle;
    }

    public /* synthetic */ n2(fk0 fk0Var, TLRPC.TL_error tL_error, String str, wj0 wj0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.a = 17;
        this.d = fk0Var;
        this.c = tL_error;
        this.e = str;
        this.f = wj0Var;
        this.b = tLObject;
        this.h = sendverifyphonecode;
    }

    public /* synthetic */ n2(py0 py0Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.a = 18;
        this.d = py0Var;
        this.b = tLObject;
        this.e = charSequence;
        this.c = tL_error;
        this.f = bArr;
        this.h = str;
    }

    public /* synthetic */ n2(a21 a21Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.a = 20;
        this.d = a21Var;
        this.c = tL_error;
        this.e = inputCheckPasswordSRP;
        this.b = user;
        this.f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public /* synthetic */ n2(org.telegram.ui.Wallet.m2 m2Var, String str, w10 w10Var, org.telegram.ui.Wallet.i2 i2Var, org.telegram.ui.Wallet.s0 s0Var, TL_wallet.sendTransfer sendtransfer) {
        this.a = 23;
        this.d = m2Var;
        this.e = str;
        this.h = w10Var;
        this.b = i2Var;
        this.f = s0Var;
        this.c = sendtransfer;
    }

    public /* synthetic */ n2(org.telegram.ui.web.v0 v0Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.a = 28;
        this.d = v0Var;
        this.b = tLObject;
        this.e = tL_messages_requestUrlAuth;
        this.f = str;
        this.c = tL_error;
        this.h = str2;
    }
}
