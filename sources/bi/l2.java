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
import c8.ma;
import c8.va;
import di.pb;
import hi.kb;
import hi.mb;
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
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.messenger.r10;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.aj0;
import org.telegram.ui.bh;
import org.telegram.ui.bn;
import org.telegram.ui.c21;
import org.telegram.ui.fe;
import org.telegram.ui.gi0;
import org.telegram.ui.hk0;
import org.telegram.ui.ii;
import org.telegram.ui.je;
import org.telegram.ui.lb;
import org.telegram.ui.ly0;
import org.telegram.ui.mo0;
import org.telegram.ui.ne;
import org.telegram.ui.p51;
import org.telegram.ui.p81;
import org.telegram.ui.py0;
import org.telegram.ui.qy0;
import org.telegram.ui.ua;
import org.telegram.ui.yj0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ l2(di.y8 y8Var, Object obj, gj gjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, y10 y10Var, int i7) {
        this.a = i7;
        this.d = y8Var;
        this.e = obj;
        this.b = gjVar;
        this.f = inputInvoice;
        this.c = tL_payments_paymentFormStars;
        this.h = y10Var;
    }

    private final void a() {
        org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.d;
        String str = (String) this.e;
        byte[] bArr = (byte[]) this.b;
        org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.f;
        byte[] bArr2 = i2Var.b;
        org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.h;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
        org.telegram.ui.Wallet.u0 u0Var = l2Var.b;
        if (!TextUtils.equals(str, u0Var.y()) || !Arrays.equals(bArr, u0Var.E())) {
            Arrays.fill(bArr2, (byte) 0);
            e0Var.a(null, "Wallet changed. Open the request again.");
            return;
        }
        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
        inputtonconnectoauthsession.session_id = tonconnectsession.id;
        inputtonconnectoauthsession.challenge_answer = bArr2;
        inputtonconnectoauthsession.body = i2Var.c;
        inputtonconnectoauthsession.proof = i2Var.d;
        e0Var.a(inputtonconnectoauthsession, null);
    }

    private final void b() {
        org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.d;
        String str = (String) this.e;
        y10 y10Var = (y10) this.h;
        org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.b;
        org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.f;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.c;
        if (str != null) {
            y10Var.a(str);
        } else if (!l2Var.A(h2Var) || l2Var.j(h2Var)) {
            y10Var.a("Request expired or wallet changed");
        } else {
            l2Var.f.sendRequestTyped(sendtransfer, new d3.b(1), new ne(l2Var, y10Var, h2Var, r0Var, sendtransfer, 6));
        }
    }

    private final void c() {
        org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.d;
        org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.e;
        org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.b;
        p51 p51Var = (p51) this.f;
        JSONObject jSONObject = (JSONObject) this.h;
        String str = (String) this.c;
        if (!l2Var.A(h2Var) || l2Var.j(h2Var)) {
            l2Var.y(h2Var, r0Var, null, 0, "Request expired or wallet changed", p51Var);
        } else {
            l2Var.y(h2Var, r0Var, jSONObject, jSONObject == null ? 0 : -1, str, p51Var);
        }
    }

    private final void d() {
        org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) this.d;
        int[] iArr = (int[]) this.e;
        TextView textView = (TextView) this.b;
        org.telegram.ui.Wallet.v7 v7Var = (org.telegram.ui.Wallet.v7) this.f;
        org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.h;
        org.telegram.ui.Wallet.k2 k2Var = (org.telegram.ui.Wallet.k2) this.c;
        if (y2Var.e || y2Var.d) {
            return;
        }
        iArr[0] = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        spannableStringBuilder.setSpan(new r80(org.telegram.messenger.g0.L(80.0f), textView), 0, spannableStringBuilder.length(), 33);
        textView.setText(hd.V(null, null, 2131742873, spannableStringBuilder));
        v7Var.run();
        WalletEngine2 walletEngine2 = u0Var.b;
        if (walletEngine2 != null) {
            walletEngine2.previewTonConnect(k2Var, new di.s1(y2Var, iArr, u0Var, textView, k2Var, v7Var));
            return;
        }
        iArr[0] = 3;
        textView.setText(hd.N0(2131742720, null));
        v7Var.run();
    }

    private final void f() {
        ((WalletEngine2) this.d).lambda$prepareSendNFT$29((String) this.e, (String) this.b, (String) this.f, (byte[]) this.h, (r10) this.c);
    }

    private final void g() {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.d;
        TLObject tLObject = (TLObject) this.b;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
        String str = (String) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.h6 h6Var = v0Var.e;
        if (tLObject == null) {
            if (tL_error != null) {
                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    new lc(v0Var, h6Var).I(R.raw.error, hd.N0(2131753125, null), org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, h6Var), hd.a0(null, null, 2131753127, str2))).j();
                    return;
                } else {
                    new lc(v0Var, h6Var).g0(tL_error, false);
                    return;
                }
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
            gi0.b(false, v0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, v0Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
            gi0.b(false, v0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, v0Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
            org.telegram.ui.Components.c5.m0(v0Var.getContext(), str, false, true, true, false, 0L, null, null, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x07d5, code lost:
    
        if (r1.admin_rights.manage_call != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0810, code lost:
    
        if (r8.creator != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x080c, code lost:
    
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
        ly0 ly0Var;
        ly0 ly0Var2;
        hi.e eVar;
        int i7;
        int i10 = 7;
        int i11 = 17;
        int i12 = 3;
        int i13 = 1;
        final int i14 = 0;
        switch (this.a) {
            case 0:
                final n3 n3Var = (n3) this.d;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.e;
                TLObject tLObject = (TLObject) this.b;
                ai.i1 i1Var = (ai.i1) this.f;
                final y10 y10Var = (y10) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                t1Var.dismiss();
                if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
                    i1Var.run();
                    break;
                } else if (tLObject instanceof TL_stars.checkCanSendGiftResultFail) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n3Var.getContext(), n3Var.J0);
                    alertDialog$Builder.a.S = hd.N0(2131749734, null);
                    alertDialog$Builder.a.U = gj.h0(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
                    alertDialog$Builder.k(hd.N0(2131747637, null), null);
                    final org.telegram.ui.ActionBar.t1 p10 = alertDialog$Builder.p();
                    final zt ztVar = p10.n;
                    if (ztVar != null) {
                        ztVar.setOnLinkPressListener(new l80() { // from class: bi.n2
                            @Override // org.telegram.ui.Components.l80
                            public final void a(ClickableSpan clickableSpan) {
                                n3 n3Var2 = n3.this;
                                n3Var2.getClass();
                                p10.dismiss();
                                y10 y10Var2 = y10Var;
                                if (y10Var2 != null) {
                                    y10Var2.a(Boolean.FALSE);
                                }
                                n3Var2.dismiss();
                                clickableSpan.onClick(ztVar);
                            }
                        });
                        break;
                    }
                } else if (tL_error != null) {
                    new lc(n3Var.c, n3Var.J0).g0(tL_error, false);
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
                    TextView b10 = va.b(f6Var.getContext(), 16.0f, org.telegram.ui.ActionBar.m6.j5, false, null);
                    b10.setText(hd.N0(2131750024, null));
                    linearLayout.addView(b10, ma.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                    ey0 ey0Var = new ey0(f6Var.getContext(), f6Var.J0);
                    cy0 a10 = ey0Var.a(charSequence);
                    a10.setFilled(true);
                    xh.l lVar = (xh.l) a10.getChildAt(0);
                    lVar.setTextSize(1, 12.0f);
                    lVar.setGravity(17);
                    linearLayout.addView(ey0Var, ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
                    alertDialog$Builder2.a.S = hd.N0(2131750023, null);
                    alertDialog$Builder2.o(linearLayout);
                    alertDialog$Builder2.h(hd.N0(2131752577, null), null);
                    final long j10 = j3;
                    alertDialog$Builder2.k(pb.T0(hd.a0(null, null, 2131750025, Integer.valueOf((int) j3))), new org.telegram.ui.ActionBar.q1() { // from class: di.f3
                        @Override // org.telegram.ui.ActionBar.q1
                        public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i16) {
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
                e2[] e2VarArr = (e2[]) this.e;
                Long l10 = (Long) this.f;
                aa.r rVar = (aa.r) this.h;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                if (tLObject3 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject3;
                    np.u1(f6Var2.a).f4(tL_users_userFull.users, false);
                    np.u1(f6Var2.a).Z3(tL_users_userFull.chats, false);
                    TLRPC.UserFull userFull = tL_users_userFull.full_user;
                    if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                        o10.u(hd.a0(null, null, 2131743497, org.telegram.messenger.n5.t(l10.longValue())), new lc(e2VarArr[0].c, f6Var2.J0), R.raw.error, 36);
                        break;
                    } else {
                        rVar.run();
                        break;
                    }
                } else {
                    gc Z = f6Var2.k().Z(tL_error3);
                    Z.t = true;
                    Z.j();
                    break;
                }
                break;
            case 3:
                di.y8 y8Var = (di.y8) this.d;
                List list = (List) this.e;
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.b;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f;
                f5.f fVar = (f5.f) this.h;
                Activity activity = (Activity) this.c;
                if (list.isEmpty()) {
                    org.telegram.messenger.g0.g3(new di.x6(e0Var, i14));
                    break;
                } else {
                    f5.m mVar = (f5.m) list.get(0);
                    if (mVar.a() == null) {
                        org.telegram.messenger.g0.g3(new di.x6(e0Var, 1));
                        break;
                    } else {
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
                        ConnectionsManager.getInstance(y8Var.a).sendRequest(tL_payments_canPurchaseStore, new di.y6(mVar, fVar, e0Var, activity, tL_inputStorePaymentStarsGiveaway, list, 0));
                        break;
                    }
                }
            case 4:
                di.y8 y8Var2 = (di.y8) this.d;
                boolean[] zArr = (boolean[]) this.e;
                gj gjVar = (gj) this.b;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.c;
                y10 y10Var2 = (y10) this.h;
                zArr[0] = true;
                y8Var2.Y(gjVar, inputInvoice, tL_payments_paymentFormStars, new di.c2(y10Var2, 1));
                break;
            case 5:
                di.y8 y8Var3 = (di.y8) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                gj gjVar2 = (gj) this.e;
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.f;
                bh bhVar = (bh) this.h;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                if (tLObject4 instanceof TLRPC.TL_payments_paymentFormStars) {
                    y8Var3.W(gjVar2, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject4, bhVar, null);
                } else {
                    di.y8.e(tL_error4 == null ? "NO_PAYMENT_FORM" : tL_error4.text);
                }
                bhVar.run();
                break;
            case 6:
                di.y8 y8Var4 = (di.y8) this.d;
                Runnable runnable = (Runnable) this.e;
                gj gjVar3 = (gj) this.b;
                TLRPC.InputInvoice inputInvoice2 = (TLRPC.InputInvoice) this.f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = (TLRPC.TL_payments_paymentFormStars) this.c;
                y10 y10Var3 = (y10) this.h;
                if (y8Var4.e) {
                    y8Var4.W(gjVar3, inputInvoice2, tL_payments_paymentFormStars2, runnable, y10Var3);
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
                y10 y10Var4 = (y10) this.h;
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
                    ls.f(i16).k(ls.J3, Long.valueOf(j11), n8Var);
                    y10Var4.a(tL_starGiftCollection2);
                    break;
                } else {
                    if (tL_error5 != null && (T = LaunchActivity.T()) != null) {
                        lc.b0(T).g0(tL_error5, false);
                    }
                    arrayList2.remove(tL_starGiftCollection);
                    hashMap.remove(-1);
                    n8Var.j();
                    ls.f(i16).k(ls.J3, Long.valueOf(j11), n8Var);
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
                np.u1(i18).f4(arrayList5, true);
                np.u1(i18).Z3(arrayList6, true);
                if (h6Var.v) {
                    h6Var.v = false;
                    h6Var.y = null;
                    h6Var.j();
                    break;
                } else {
                    h6Var.m.addAll(hashSet);
                    h6Var.k.clear();
                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                        h6Var.t((gj) arrayList3.get(i19), true);
                    }
                    h6Var.d(false);
                    fi.g6 g6Var = h6Var.y;
                    if (g6Var != null) {
                        g6Var.a(0);
                        h6Var.y = null;
                    }
                    ls.f(i18).k(ls.A5, h6Var);
                    break;
                }
            case 9:
                int[] iArr = (int[]) this.d;
                TLObject tLObject6 = (TLObject) this.b;
                np npVar = (np) this.e;
                TLRPC.User[] userArr = (TLRPC.User[]) this.f;
                mb mbVar = (mb) this.h;
                kb kbVar = (kb) this.c;
                iArr[0] = 0;
                if (tLObject6 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject6;
                    npVar.f4(tL_contacts_resolvedPeer.users, false);
                    npVar.Z3(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User c22 = npVar.c2(Long.valueOf(org.telegram.messenger.n5.o(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = c22;
                    if (c22 != null) {
                        mbVar.run();
                        break;
                    }
                }
                kbVar.a(null);
                break;
            case 10:
                jg.z0 z0Var = (jg.z0) this.d;
                String str3 = (String) this.e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.b;
                np npVar2 = (np) this.f;
                ur urVar = (ur) this.h;
                jg.h1 h1Var = z0Var.e;
                String str4 = h1Var.r0;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error6 == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject7;
                        if (!tL_contacts_resolvedPeer2.users.isEmpty()) {
                            TLRPC.User user2 = tL_contacts_resolvedPeer2.users.get(0);
                            npVar2.e4(user2, false, false);
                            urVar.m1(tL_contacts_resolvedPeer2.users, null, true, true);
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
                final m80 m80Var = (m80) this.f;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.h;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) this.c;
                if (tLObject8 instanceof TL_phone.exportedGroupCallInvite) {
                    final String str5 = ((TL_phone.exportedGroupCallInvite) tLObject8).link;
                    strArr[0] = str5;
                    if (str5.startsWith("https://")) {
                        str5 = str5.substring(8);
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.j8
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
                                m80Var.setText(str5);
                            }
                        }
                    });
                    duration.addListener(new org.telegram.ui.b9(atomicBoolean, m80Var, str5));
                    duration.start();
                    new lc(w2Var.F, h6Var2).I(R.raw.linkbroken, hd.N0(2131749282, null), hd.N0(2131749283, null)).j();
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
                            np messagesController = lbVar.getMessagesController();
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
                a70 J = a70.J(bnVar, r1Var);
                yk0 yk0Var = new yk0(bnVar.getParentActivity(), bnVar.Ba);
                J.p = new fe(yk0Var, i14);
                J.c(R.drawable.msg_copy, hd.N0(2131751754, null), new je(bnVar, yk0Var, str6, 2), false);
                if (tLObject9 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject9;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList11 = tL_payments_bankCardData.open_urls;
                    int size3 = arrayList11.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList11.get(i20);
                        i20++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        J.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new org.telegram.ui.u8(24, bnVar, tL_bankCardOpenUrl2), false);
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
                rf rfVar = (rf) this.d;
                ji.e eVar2 = (ji.e) this.e;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                View view = (View) this.f;
                RectF rectF = (RectF) this.h;
                hi.s6 s6Var = (hi.s6) this.c;
                rfVar.getClass();
                eVar2.getLocationInWindow(new int[2]);
                frameLayout2.getLocationInWindow(new int[2]);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.leftMargin = Math.round((rectF.left + r8[0]) - r7[0]);
                layoutParams.topMargin = Math.round((rectF.top + r8[1]) - r7[1]);
                view.setLayoutParams(layoutParams);
                view.post(new org.telegram.messenger.camera.i(rfVar, frameLayout2, view, s6Var, 24));
                break;
            case 15:
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) this.e;
                hi.e eVar3 = (hi.e) this.b;
                org.telegram.ui.o6 o6Var = (org.telegram.ui.o6) this.f;
                Runnable runnable2 = (Runnable) this.h;
                if (tL_error7 != null) {
                    new lc(cb.a(context), h6Var3).g0(tL_error7, false);
                    break;
                } else {
                    eVar3.setLoading(false);
                    o6Var.dismiss();
                    org.telegram.messenger.f3.n(null, 2131746759, new lc(cb.a(context), h6Var3), R.raw.chats_infotip, 36);
                    runnable2.run();
                    break;
                }
            case 16:
                kw0 kw0Var = (kw0) this.d;
                TLObject tLObject10 = (TLObject) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.e;
                TextView textView = (TextView) this.f;
                TextView textView2 = (TextView) this.h;
                int[] iArr2 = (int[]) this.c;
                kw0Var.getClass();
                if (!(tLObject10 instanceof TLRPC.TL_stickers_suggestedShortName) || (str2 = ((TLRPC.TL_stickers_suggestedShortName) tLObject10).short_name) == null) {
                    z10 = false;
                } else {
                    editTextBoldCursor.setText(str2);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    kw0Var.L0(textView, editTextBoldCursor.getText().toString(), true);
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
                hk0.b0((hk0) this.d, (TLRPC.TL_error) this.c, (String) this.e, (yj0) this.f, (TLObject) this.b, (TL_account.sendVerifyPhoneCode) this.h);
                break;
            case 18:
                qy0 qy0Var = (qy0) this.d;
                TLObject tLObject11 = (TLObject) this.b;
                CharSequence charSequence2 = (CharSequence) this.e;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.c;
                byte[] bArr = (byte[]) this.f;
                String str7 = (String) this.h;
                hi.i1 i1Var2 = qy0Var.m1;
                if ((i1Var2.getCurrentView() instanceof py0) && (eVar = ((py0) i1Var2.getCurrentView()).s) != null) {
                    eVar.setLoading(false);
                }
                if (tLObject11 != null) {
                    boolean z11 = tLObject11 instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
                    if (!z11 && !(tLObject11 instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject11 instanceof TLRPC.TL_reportResultAddComment)) {
                        if (tLObject11 instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            np.u1(qy0Var.a).p0(false);
                            ly0 ly0Var3 = qy0Var.v1;
                            if (ly0Var3 != null) {
                                ly0Var3.d();
                                qy0Var.dismiss();
                                break;
                            }
                        } else if (((tLObject11 instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject11 instanceof TLRPC.TL_reportResultReported)) && (ly0Var2 = qy0Var.v1) != null) {
                            ly0Var2.a();
                            qy0Var.dismiss();
                            break;
                        }
                    } else {
                        i1Var2.A(i1Var2.b + 1);
                        py0 py0Var = (py0) i1Var2.getViewPages()[1];
                        if (py0Var != null) {
                            h51 h51Var = py0Var.f;
                            if (tLObject11 instanceof TLRPC.TL_reportResultChooseOption) {
                                py0Var.b = null;
                                py0Var.c = (TLRPC.TL_reportResultChooseOption) tLObject11;
                                py0Var.d = null;
                                h51Var.g3.O(false);
                            } else if (tLObject11 instanceof TLRPC.TL_reportResultAddComment) {
                                py0Var.b((TLRPC.TL_reportResultAddComment) tLObject11);
                            } else if (z11) {
                                py0Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject11;
                                py0Var.c = null;
                                py0Var.d = null;
                                h51Var.g3.O(false);
                            }
                            if (charSequence2 != null) {
                                di.n4 n4Var = py0Var.h;
                                ((TextView) n4Var.c).setText(charSequence2);
                                ((TextView) n4Var.c).getText();
                                n4Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), TLObject.FLAG_31));
                                if (h51Var != null) {
                                    h51Var.g3.O(true);
                                    break;
                                }
                            }
                        }
                    }
                } else if (tL_error8 != null) {
                    if (!qy0Var.p1 && "MESSAGE_ID_REQUIRED".equals(tL_error8.text)) {
                        long j13 = qy0Var.u1;
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
                        ly0 ly0Var4 = qy0Var.v1;
                        if (ly0Var4 != null) {
                            ly0Var4.h();
                        }
                    } else if ("AD_EXPIRED".equals(tL_error8.text) && (ly0Var = qy0Var.v1) != null) {
                        ly0Var.a();
                    }
                    qy0Var.dismiss();
                    break;
                }
                break;
            case 19:
                TLObject tLObject12 = (TLObject) this.b;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.h6 h6Var4 = (org.telegram.ui.ActionBar.h6) this.e;
                byte[] bArr2 = (byte[]) this.f;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.h;
                ou ouVar = (ou) this.c;
                qy0 qy0Var2 = new qy0(context2, h6Var4, 0L, bArr2);
                qy0Var2.O0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject12);
                qy0Var2.v1 = new ab.c0(g2Var, context2, h6Var4, ouVar, 11);
                qy0Var2.show();
                break;
            case 20:
                final c21 c21Var = (c21) this.d;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.c;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.e;
                TLRPC.User user3 = (TLRPC.User) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                TLRPC.TL_channels_editCreator tL_channels_editCreator = (TLRPC.TL_channels_editCreator) this.h;
                if (tL_error9 == null) {
                    if (inputCheckPasswordSRP != null) {
                        ii iiVar = c21Var.V1;
                        if (iiVar != null) {
                            iiVar.run();
                        }
                        c21Var.dismiss();
                        twoStepVerificationActivity.t0();
                        twoStepVerificationActivity.finishFragment();
                        break;
                    }
                } else if (c21Var.f2 != null) {
                    if ("PASSWORD_HASH_INVALID".equals(tL_error9.text)) {
                        if (inputCheckPasswordSRP == null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(c21Var.f2);
                            alertDialog$Builder3.a.S = hd.N0(org.telegram.messenger.v3.V(c21Var.T1) ? 2131751310 : 2131751303, null);
                            alertDialog$Builder3.a.U = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131751280, c21Var.T1.title, p10.k(user3, true)));
                            alertDialog$Builder3.k(hd.N0(2131751284, null), new aj0(i11, c21Var, user3));
                            alertDialog$Builder3.h(hd.N0(2131752577, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.t11
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i22) {
                                    switch (i14) {
                                        case 0:
                                            c21Var.d2.setLoading(false);
                                            break;
                                        case 1:
                                            c21 c21Var2 = c21Var;
                                            c21Var2.getClass();
                                            org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                                            if (T3 != null) {
                                                c21Var2.dismiss();
                                                T3.presentFragment(new bb1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            c21Var.d2.setLoading(false);
                                            break;
                                        default:
                                            c21Var.d2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder3.p();
                            break;
                        }
                    } else if (!"PASSWORD_MISSING".equals(tL_error9.text) && !tL_error9.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error9.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error9.text)) {
                            ConnectionsManager.getInstance(c21Var.a).sendRequest(new TL_account.getPassword(), new mo0(c21Var, twoStepVerificationActivity, user3, i10), 8);
                            break;
                        } else if (!tL_error9.text.equals("CHANNELS_TOO_MUCH")) {
                            if (twoStepVerificationActivity != null) {
                                twoStepVerificationActivity.t0();
                                twoStepVerificationActivity.finishFragment();
                            }
                            org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                            if (T3 != null) {
                                org.telegram.ui.Components.c5.e0(tL_error9, T3, org.telegram.messenger.v3.V(c21Var.T1), org.telegram.messenger.v3.Y(c21Var.T1), tL_channels_editCreator);
                                break;
                            }
                        } else if (c21Var.f2 == null || k10.i(org.telegram.messenger.c.a(c21Var.a).a).q()) {
                            org.telegram.ui.ActionBar.g2 T4 = LaunchActivity.T();
                            if (T4 != null) {
                                c21Var.dismiss();
                                T4.presentFragment(new p81(1));
                                break;
                            }
                        } else {
                            org.telegram.ui.ActionBar.g2 T5 = LaunchActivity.T();
                            if (T5 != null) {
                                new ug.k0(5, c21Var.a, c21Var.f2, T5, null);
                                break;
                            }
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.t0();
                        }
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(c21Var.f2);
                        alertDialog$Builder4.a.S = hd.N0(2131751285, null);
                        LinearLayout linearLayout2 = new LinearLayout(c21Var.f2);
                        linearLayout2.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                        linearLayout2.setOrientation(1);
                        alertDialog$Builder4.o(linearLayout2);
                        TextView textView3 = new TextView(c21Var.f2);
                        int i22 = org.telegram.ui.ActionBar.m6.j5;
                        org.telegram.ui.ActionBar.t6.U(textView3, i22, null);
                        textView3.setTextSize(1, 16.0f);
                        textView3.setGravity((hd.a0 ? 5 : 3) | 48);
                        if (org.telegram.messenger.v3.V(c21Var.T1)) {
                            org.telegram.messenger.f3.q(null, null, 2131751271, new Object[]{p10.k(user3, true)}, textView3);
                        } else {
                            org.telegram.messenger.f3.q(null, null, 2131751289, new Object[]{p10.k(user3, true)}, textView3);
                        }
                        linearLayout2.addView(textView3, ma.o(-1, -2));
                        LinearLayout linearLayout3 = new LinearLayout(c21Var.f2);
                        linearLayout3.setOrientation(0);
                        linearLayout2.addView(linearLayout3, ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView = new ImageView(c21Var.f2);
                        imageView.setImageResource(R.drawable.list_circle);
                        imageView.setPadding(hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.t6.s(imageView, i22, null, mode);
                        TextView textView4 = new TextView(c21Var.f2);
                        org.telegram.ui.ActionBar.t6.U(textView4, i22, null);
                        textView4.setTextSize(1, 16.0f);
                        textView4.setGravity((hd.a0 ? 5 : 3) | 48);
                        textView4.setText(org.telegram.messenger.g0.W2(hd.N0(2131751288, null)));
                        if (hd.a0) {
                            linearLayout3.addView(textView4, ma.o(-1, -2));
                            linearLayout3.addView(imageView, ma.r(-2, -2, 5));
                        } else {
                            linearLayout3.addView(imageView, ma.o(-2, -2));
                            linearLayout3.addView(textView4, ma.o(-1, -2));
                        }
                        LinearLayout linearLayout4 = new LinearLayout(c21Var.f2);
                        linearLayout4.setOrientation(0);
                        linearLayout2.addView(linearLayout4, ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView2 = new ImageView(c21Var.f2);
                        imageView2.setImageResource(R.drawable.list_circle);
                        imageView2.setPadding(hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
                        org.telegram.ui.ActionBar.t6.s(imageView2, i22, null, mode);
                        TextView textView5 = new TextView(c21Var.f2);
                        org.telegram.ui.ActionBar.t6.U(textView5, i22, null);
                        textView5.setTextSize(1, 16.0f);
                        textView5.setGravity((hd.a0 ? 5 : 3) | 48);
                        textView5.setText(org.telegram.messenger.g0.W2(hd.N0(2131751287, null)));
                        if (hd.a0) {
                            linearLayout4.addView(textView5, ma.o(-1, -2));
                            i7 = 5;
                            linearLayout4.addView(imageView2, ma.r(-2, -2, 5));
                        } else {
                            i7 = 5;
                            linearLayout4.addView(imageView2, ma.o(-2, -2));
                            linearLayout4.addView(textView5, ma.o(-1, -2));
                        }
                        if ("PASSWORD_MISSING".equals(tL_error9.text)) {
                            final int i23 = 1;
                            alertDialog$Builder4.k(hd.N0(2131751279, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.t11
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i222) {
                                    switch (i23) {
                                        case 0:
                                            c21Var.d2.setLoading(false);
                                            break;
                                        case 1:
                                            c21 c21Var2 = c21Var;
                                            c21Var2.getClass();
                                            org.telegram.ui.ActionBar.g2 T32 = LaunchActivity.T();
                                            if (T32 != null) {
                                                c21Var2.dismiss();
                                                T32.presentFragment(new bb1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            c21Var.d2.setLoading(false);
                                            break;
                                        default:
                                            c21Var.d2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                            final int i24 = 2;
                            alertDialog$Builder4.h(hd.N0(2131752577, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.t11
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i222) {
                                    switch (i24) {
                                        case 0:
                                            c21Var.d2.setLoading(false);
                                            break;
                                        case 1:
                                            c21 c21Var2 = c21Var;
                                            c21Var2.getClass();
                                            org.telegram.ui.ActionBar.g2 T32 = LaunchActivity.T();
                                            if (T32 != null) {
                                                c21Var2.dismiss();
                                                T32.presentFragment(new bb1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            c21Var.d2.setLoading(false);
                                            break;
                                        default:
                                            c21Var.d2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                        } else {
                            TextView textView6 = new TextView(c21Var.f2);
                            org.telegram.ui.ActionBar.t6.U(textView6, i22, null);
                            textView6.setTextSize(1, 16.0f);
                            org.telegram.messenger.f3.k(textView6, (hd.a0 ? i7 : 3) | 48, null, 2131751286);
                            linearLayout2.addView(textView6, ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            final int i25 = 3;
                            alertDialog$Builder4.h(hd.N0(2131747637, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.t11
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i222) {
                                    switch (i25) {
                                        case 0:
                                            c21Var.d2.setLoading(false);
                                            break;
                                        case 1:
                                            c21 c21Var2 = c21Var;
                                            c21Var2.getClass();
                                            org.telegram.ui.ActionBar.g2 T32 = LaunchActivity.T();
                                            if (T32 != null) {
                                                c21Var2.dismiss();
                                                T32.presentFragment(new bb1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            c21Var.d2.setLoading(false);
                                            break;
                                        default:
                                            c21Var.d2.setLoading(false);
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
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.d;
                String str8 = (String) this.e;
                byte[] bArr3 = (byte[]) this.b;
                p51 p51Var = (p51) this.f;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.c;
                org.telegram.ui.Wallet.u0 u0Var = l2Var.b;
                if (!TextUtils.equals(str8, u0Var.y()) || !Arrays.equals(bArr3, u0Var.E())) {
                    p51Var.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                    tonconnectclosesession.session_id = tonconnectsession.id;
                    tonconnectclosesession.body = i2Var.c;
                    l2Var.f.sendRequestTyped(tonconnectclosesession, new d3.b(i13), new org.telegram.ui.Wallet.e(p51Var, i12));
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
                ((WalletEngine2) this.d).lambda$prepareTonConnectTransferPair$8((byte[]) this.e, (org.telegram.ui.Wallet.k2) this.b, (String) this.f, (org.telegram.ui.Wallet.k2) this.h, (r10) this.c);
                break;
            case 27:
                f();
                break;
            case 28:
                g();
                break;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.d;
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
                    Utilities.e.c(new es0(file, iArr3, new di.m6((gs) v0Var, (Object) iArr3, (Object) file, (Object) t1Var2, str9, (Object) str10, (Object) str11, 15), 10));
                    break;
                }
        }
    }

    public /* synthetic */ l2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
        this.h = obj5;
        this.c = obj6;
    }

    public /* synthetic */ l2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7, boolean z10) {
        this.a = i7;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.c = obj6;
    }

    public /* synthetic */ l2(jg.z0 z0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, np npVar, ur urVar) {
        this.a = 10;
        this.d = z0Var;
        this.e = str;
        this.c = tL_error;
        this.b = tLObject;
        this.f = npVar;
        this.h = urVar;
    }

    public /* synthetic */ l2(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.c = obj5;
    }

    public /* synthetic */ l2(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.h6 h6Var, hi.e eVar, org.telegram.ui.o6 o6Var, Runnable runnable) {
        this.a = 15;
        this.c = tL_error;
        this.d = context;
        this.e = h6Var;
        this.b = eVar;
        this.f = o6Var;
        this.h = runnable;
    }

    public /* synthetic */ l2(bn bnVar, vf.b bVar, org.telegram.ui.Cells.r1 r1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.a = 13;
        this.d = bnVar;
        this.e = bVar;
        this.f = r1Var;
        this.h = str;
        this.b = tLObject;
        this.c = characterStyle;
    }

    public /* synthetic */ l2(hk0 hk0Var, TLRPC.TL_error tL_error, String str, yj0 yj0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.a = 17;
        this.d = hk0Var;
        this.c = tL_error;
        this.e = str;
        this.f = yj0Var;
        this.b = tLObject;
        this.h = sendverifyphonecode;
    }

    public /* synthetic */ l2(qy0 qy0Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.a = 18;
        this.d = qy0Var;
        this.b = tLObject;
        this.e = charSequence;
        this.c = tL_error;
        this.f = bArr;
        this.h = str;
    }

    public /* synthetic */ l2(c21 c21Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.a = 20;
        this.d = c21Var;
        this.c = tL_error;
        this.e = inputCheckPasswordSRP;
        this.b = user;
        this.f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public /* synthetic */ l2(org.telegram.ui.Wallet.l2 l2Var, String str, y10 y10Var, org.telegram.ui.Wallet.h2 h2Var, org.telegram.ui.Wallet.r0 r0Var, TL_wallet.sendTransfer sendtransfer) {
        this.a = 23;
        this.d = l2Var;
        this.e = str;
        this.h = y10Var;
        this.b = h2Var;
        this.f = r0Var;
        this.c = sendtransfer;
    }

    public /* synthetic */ l2(org.telegram.ui.web.v0 v0Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.a = 28;
        this.d = v0Var;
        this.b = tLObject;
        this.e = tL_messages_requestUrlAuth;
        this.f = str;
        this.c = tL_error;
        this.h = str2;
    }
}
