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
import c8.ja;
import c8.sa;
import di.j8;
import di.l8;
import di.lb;
import di.u8;
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
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.g7;
import org.telegram.ui.a9;
import org.telegram.ui.an;
import org.telegram.ui.bh;
import org.telegram.ui.de;
import org.telegram.ui.di0;
import org.telegram.ui.ek0;
import org.telegram.ui.hy0;
import org.telegram.ui.ie;
import org.telegram.ui.jo0;
import org.telegram.ui.l81;
import org.telegram.ui.ly0;
import org.telegram.ui.my0;
import org.telegram.ui.ua;
import org.telegram.ui.vj0;
import org.telegram.ui.x11;
import org.telegram.ui.x21;
import org.telegram.ui.xi0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ p1(u8 u8Var, Object obj, gj gjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, z10 z10Var, int i7) {
        this.a = i7;
        this.d = u8Var;
        this.e = obj;
        this.b = gjVar;
        this.f = inputInvoice;
        this.c = tL_payments_paymentFormStars;
        this.h = z10Var;
    }

    private final void a() {
        org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.d;
        String str = (String) this.e;
        byte[] bArr = (byte[]) this.b;
        x21 x21Var = (x21) this.f;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
        org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.c;
        org.telegram.ui.Wallet.l0 l0Var = d2Var.b;
        if (!TextUtils.equals(str, l0Var.t()) || !Arrays.equals(bArr, l0Var.y())) {
            x21Var.a("Wallet or TON Connect session changed. Open the request again.");
            return;
        }
        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
        tonconnectclosesession.session_id = tonconnectsession.id;
        tonconnectclosesession.body = a2Var.c;
        d2Var.f.sendRequestTyped(tonconnectclosesession, new d3.b(1), new org.telegram.ui.Wallet.d(x21Var, 3));
    }

    private final void b() {
        org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.d;
        String str = (String) this.e;
        byte[] bArr = (byte[]) this.b;
        org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.f;
        byte[] bArr2 = a2Var.b;
        org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) this.h;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
        org.telegram.ui.Wallet.l0 l0Var = d2Var.b;
        if (!TextUtils.equals(str, l0Var.t()) || !Arrays.equals(bArr, l0Var.y())) {
            Arrays.fill(bArr2, (byte) 0);
            t1Var.a(null, "Wallet changed. Open the request again.");
            return;
        }
        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
        inputtonconnectoauthsession.session_id = tonconnectsession.id;
        inputtonconnectoauthsession.challenge_answer = bArr2;
        inputtonconnectoauthsession.body = a2Var.c;
        inputtonconnectoauthsession.proof = a2Var.d;
        t1Var.a(inputtonconnectoauthsession, null);
    }

    private final void c() {
        org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.d;
        String str = (String) this.e;
        z10 z10Var = (z10) this.h;
        org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.b;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.c;
        if (str != null) {
            z10Var.a(str);
        } else if (!d2Var.A(z1Var) || d2Var.j(z1Var)) {
            z10Var.a("Request expired or wallet changed");
        } else {
            d2Var.f.sendRequestTyped(sendtransfer, new d3.b(1), new di.z2(d2Var, z10Var, z1Var, i0Var, sendtransfer, 6));
        }
    }

    private final void d() {
        org.telegram.ui.Wallet.r2 r2Var = (org.telegram.ui.Wallet.r2) this.d;
        int[] iArr = (int[]) this.e;
        TextView textView = (TextView) this.b;
        g7 g7Var = (g7) this.f;
        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.h;
        org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.c;
        if (r2Var.e || r2Var.d) {
            return;
        }
        iArr[0] = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        spannableStringBuilder.setSpan(new e80(org.telegram.messenger.g0.L(80.0f), textView), 0, spannableStringBuilder.length(), 33);
        textView.setText(hd.V(null, null, 2131743120, spannableStringBuilder));
        g7Var.run();
        WalletEngine2 walletEngine2 = l0Var.b;
        if (walletEngine2 != null) {
            walletEngine2.previewTonConnect(c2Var, new org.telegram.ui.Wallet.d1(r2Var, iArr, l0Var, textView, c2Var, g7Var, 4));
            return;
        }
        iArr[0] = 3;
        textView.setText(hd.M0(2131742986, null));
        g7Var.run();
    }

    private final void f() {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.d;
        TLObject tLObject = (TLObject) this.b;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
        String str = (String) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.e6 e6Var = v0Var.e;
        if (tLObject == null) {
            if (tL_error != null) {
                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    new cc(v0Var, e6Var).I(R.raw.error, hd.M0(2131753128, null), org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.xj, e6Var), hd.a0(null, null, 2131753130, str2))).j();
                    return;
                } else {
                    new cc(v0Var, e6Var).f0(tL_error, false);
                    return;
                }
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
            di0.b(false, v0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, v0Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
            di0.b(false, v0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, v0Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
            org.telegram.ui.Components.t4.m0(v0Var.getContext(), str, false, true, true, false, 0L, null, null, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:262:0x07f5, code lost:
    
        if (r9.creator == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x07f1, code lost:
    
        if ((r12 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L261;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        org.telegram.ui.ActionBar.e2 T;
        TLRPC.User user;
        ArrayList arrayList;
        String str;
        ArrayList arrayList2;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        String str2;
        hy0 hy0Var;
        hy0 hy0Var2;
        hi.d dVar;
        int i7;
        int i10 = 7;
        int i11 = 6;
        final int i12 = 0;
        switch (this.a) {
            case 0:
                final s2 s2Var = (s2) this.d;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.e;
                TLObject tLObject = (TLObject) this.b;
                ai.g1 g1Var = (ai.g1) this.f;
                final z10 z10Var = (z10) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                t1Var.dismiss();
                if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
                    g1Var.run();
                    break;
                } else if (tLObject instanceof TL_stars.checkCanSendGiftResultFail) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, s2Var.getContext(), s2Var.J0);
                    alertDialog$Builder.a.S = hd.M0(2131749752, null);
                    alertDialog$Builder.a.U = gj.h0(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
                    alertDialog$Builder.k(hd.M0(2131747831, null), null);
                    final org.telegram.ui.ActionBar.t1 p10 = alertDialog$Builder.p();
                    final st stVar = p10.n;
                    if (stVar != null) {
                        stVar.setOnLinkPressListener(new y70() { // from class: bi.q1
                            @Override // org.telegram.ui.Components.y70
                            public final void a(ClickableSpan clickableSpan) {
                                s2 s2Var2 = s2.this;
                                s2Var2.getClass();
                                p10.dismiss();
                                z10 z10Var2 = z10Var;
                                if (z10Var2 != null) {
                                    z10Var2.a(Boolean.FALSE);
                                }
                                s2Var2.dismiss();
                                clickableSpan.onClick(stVar);
                            }
                        });
                        break;
                    }
                } else if (tL_error != null) {
                    new cc(s2Var.c, s2Var.J0).f0(tL_error, false);
                    break;
                }
                break;
            case 1:
                di.c6 c6Var = (di.c6) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                wg.c1[] c1VarArr = (wg.c1[]) this.e;
                Long l10 = (Long) this.f;
                aa.r rVar = (aa.r) this.h;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    np.s1(c6Var.a).Y3(tL_users_userFull.users, false);
                    np.s1(c6Var.a).S3(tL_users_userFull.chats, false);
                    TLRPC.UserFull userFull = tL_users_userFull.full_user;
                    if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                        i20.t(hd.a0(null, null, 2131743742, org.telegram.messenger.m5.t(l10.longValue())), new cc(c1VarArr[0].c, c6Var.J0), R.raw.error, 36);
                        break;
                    } else {
                        rVar.run();
                        break;
                    }
                } else {
                    xb Y = c6Var.k().Y(tL_error2);
                    Y.t = true;
                    Y.j();
                    break;
                }
                break;
            case 2:
                final di.c6 c6Var2 = (di.c6) this.d;
                TLObject tLObject3 = (TLObject) this.b;
                final CharSequence charSequence = (CharSequence) this.e;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f;
                final TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.h;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                if (tLObject3 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject3;
                    ArrayList<TLRPC.TL_labeledPrice> arrayList3 = paymentForm.invoice.prices;
                    int size = arrayList3.size();
                    final long j3 = 0;
                    int i13 = 0;
                    while (i13 < size) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = arrayList3.get(i13);
                        i13++;
                        j3 += tL_labeledPrice.amount;
                    }
                    LinearLayout linearLayout = new LinearLayout(c6Var2.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
                    TextView b10 = sa.b(c6Var2.getContext(), 16.0f, org.telegram.ui.ActionBar.j6.j5, false, null);
                    b10.setText(hd.M0(2131750041, null));
                    linearLayout.addView(b10, ja.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                    vx0 vx0Var = new vx0(c6Var2.getContext(), c6Var2.J0);
                    tx0 a10 = vx0Var.a(charSequence);
                    a10.setFilled(true);
                    xh.l lVar = (xh.l) a10.getChildAt(0);
                    lVar.setTextSize(1, 12.0f);
                    lVar.setGravity(17);
                    linearLayout.addView(vx0Var, ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, c6Var2.getContext(), c6Var2.J0);
                    alertDialog$Builder2.a.S = hd.M0(2131750040, null);
                    alertDialog$Builder2.o(linearLayout);
                    alertDialog$Builder2.h(hd.M0(2131752589, null), null);
                    alertDialog$Builder2.k(lb.T0(hd.a0(null, null, 2131750042, Integer.valueOf((int) j3))), new org.telegram.ui.ActionBar.q1() { // from class: di.c3
                        @Override // org.telegram.ui.ActionBar.q1
                        public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i14) {
                            vf.b h = t1Var2.h(-1, true, true);
                            h.d();
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = paymentForm.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
                            c6 c6Var3 = c6.this;
                            ConnectionsManager.getInstance(c6Var3.a).sendRequest(tL_payments_sendStarsForm, new i3(c6Var3, h, t1Var2, tL_starGiftUnique, j3, charSequence));
                        }
                    });
                    alertDialog$Builder2.p();
                    break;
                } else if (tL_error3 != null) {
                    c6Var2.k().f0(tL_error3, false);
                    break;
                }
                break;
            case 3:
                u8 u8Var = (u8) this.d;
                List list = (List) this.e;
                org.telegram.ui.Wallet.t1 t1Var2 = (org.telegram.ui.Wallet.t1) this.b;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f;
                f5.f fVar = (f5.f) this.h;
                Activity activity = (Activity) this.c;
                if (list.isEmpty()) {
                    org.telegram.messenger.g0.h3(new di.t6(t1Var2, i12));
                    break;
                } else {
                    f5.m mVar = (f5.m) list.get(0);
                    if (mVar.a() == null) {
                        org.telegram.messenger.g0.h3(new di.t6(t1Var2, 1));
                        break;
                    } else {
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
                        ConnectionsManager.getInstance(u8Var.a).sendRequest(tL_payments_canPurchaseStore, new di.u6(mVar, fVar, t1Var2, activity, tL_inputStorePaymentStarsGiveaway, list, 0));
                        break;
                    }
                }
            case 4:
                u8 u8Var2 = (u8) this.d;
                boolean[] zArr = (boolean[]) this.e;
                gj gjVar = (gj) this.b;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.c;
                z10 z10Var2 = (z10) this.h;
                zArr[0] = true;
                u8Var2.Z(gjVar, inputInvoice, tL_payments_paymentFormStars, new di.y1(z10Var2, 1));
                break;
            case 5:
                u8 u8Var3 = (u8) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                gj gjVar2 = (gj) this.e;
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.f;
                bh bhVar = (bh) this.h;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                if (tLObject4 instanceof TLRPC.TL_payments_paymentFormStars) {
                    u8Var3.X(gjVar2, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject4, bhVar, null);
                } else {
                    u8.e(tL_error4 == null ? "NO_PAYMENT_FORM" : tL_error4.text);
                }
                bhVar.run();
                break;
            case 6:
                u8 u8Var4 = (u8) this.d;
                Runnable runnable = (Runnable) this.e;
                gj gjVar3 = (gj) this.b;
                TLRPC.InputInvoice inputInvoice2 = (TLRPC.InputInvoice) this.f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = (TLRPC.TL_payments_paymentFormStars) this.c;
                z10 z10Var3 = (z10) this.h;
                if (u8Var4.e) {
                    u8Var4.X(gjVar3, inputInvoice2, tL_payments_paymentFormStars2, runnable, z10Var3);
                    break;
                } else {
                    u8.e("NO_BALANCE");
                    runnable.run();
                    break;
                }
            case 7:
                j8 j8Var = (j8) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.e;
                l8 l8Var = (l8) this.f;
                z10 z10Var4 = (z10) this.h;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                long j10 = j8Var.b;
                int i14 = j8Var.a;
                HashMap hashMap = j8Var.h;
                ArrayList arrayList4 = j8Var.e;
                j8Var.k = false;
                if (tLObject5 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject5;
                    arrayList4.remove(tL_starGiftCollection);
                    arrayList4.add(tL_starGiftCollection2);
                    hashMap.remove(-1);
                    int i15 = tL_starGiftCollection2.collection_id;
                    l8Var.d = i15;
                    hashMap.put(Integer.valueOf(i15), l8Var);
                    j8Var.j();
                    ns.f(i14).k(ns.H3, Long.valueOf(j10), j8Var);
                    z10Var4.a(tL_starGiftCollection2);
                    break;
                } else {
                    if (tL_error5 != null && (T = LaunchActivity.T()) != null) {
                        cc.a0(T).f0(tL_error5, false);
                    }
                    arrayList4.remove(tL_starGiftCollection);
                    hashMap.remove(-1);
                    j8Var.j();
                    ns.f(i14).k(ns.H3, Long.valueOf(j10), j8Var);
                    break;
                }
            case 8:
                fi.k6 k6Var = (fi.k6) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = (ArrayList) this.b;
                ArrayList arrayList7 = (ArrayList) this.f;
                ArrayList arrayList8 = (ArrayList) this.h;
                HashSet hashSet = (HashSet) this.c;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                sb2.append(k6Var.e);
                sb2.append("{");
                sb2.append(k6Var.d);
                sb2.append("} preloadCache {");
                sb2.append(fi.s6.a(arrayList5));
                org.telegram.ui.Cells.y0.t("}", sb2);
                ArrayList arrayList9 = k6Var.g;
                arrayList9.clear();
                arrayList9.addAll(arrayList6);
                k6Var.t = false;
                int i16 = k6Var.c;
                np.s1(i16).Y3(arrayList7, true);
                np.s1(i16).S3(arrayList8, true);
                if (k6Var.v) {
                    k6Var.v = false;
                    k6Var.y = null;
                    k6Var.j();
                    break;
                } else {
                    k6Var.m.addAll(hashSet);
                    k6Var.k.clear();
                    for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                        k6Var.t((gj) arrayList5.get(i17), true);
                    }
                    k6Var.d(false);
                    fi.j6 j6Var = k6Var.y;
                    if (j6Var != null) {
                        j6Var.a(0);
                        k6Var.y = null;
                    }
                    ns.f(i16).k(ns.x5, k6Var);
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
                    npVar.Y3(tL_contacts_resolvedPeer.users, false);
                    npVar.S3(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User a22 = npVar.a2(Long.valueOf(org.telegram.messenger.m5.o(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = a22;
                    if (a22 != null) {
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
                vr vrVar = (vr) this.h;
                jg.h1 h1Var = z0Var.e;
                String str4 = h1Var.r0;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error6 == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject7;
                        if (!tL_contacts_resolvedPeer2.users.isEmpty()) {
                            TLRPC.User user2 = tL_contacts_resolvedPeer2.users.get(0);
                            npVar2.X3(user2, false, false);
                            vrVar.m1(tL_contacts_resolvedPeer2.users, null, true, true);
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
                final z70 z70Var = (z70) this.f;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.h;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
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
                                z70Var.setText(str5);
                            }
                        }
                    });
                    duration.addListener(new a9(atomicBoolean, z70Var, str5));
                    duration.start();
                    new cc(u2Var.F, e6Var).I(R.raw.linkbroken, hd.M0(2131749475, null), hd.M0(2131749476, null)).j();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.lb lbVar = (org.telegram.ui.lb) this.d;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.e;
                ArrayList arrayList10 = (ArrayList) this.b;
                ArrayList arrayList11 = (ArrayList) this.f;
                ArrayList arrayList12 = (ArrayList) this.h;
                ua uaVar = (ua) this.c;
                TLRPC.Chat chat = lbVar.f;
                lbVar.a0 = channelParticipant;
                if (channelParticipant != null) {
                    if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                        if (!org.telegram.messenger.t3.T(chat)) {
                            TLRPC.ChatFull N0 = lbVar.getMessagesController().N0(chat.id);
                            if (N0 != null && (chatParticipants = N0.participants) != null) {
                                int size2 = chatParticipants.participants.size();
                                while (i12 < size2) {
                                    TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i12);
                                    arrayList = arrayList12;
                                    if (chatParticipant.user_id == channelParticipant.peer.user_id) {
                                        if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                            break;
                                        }
                                    } else {
                                        i12++;
                                        arrayList12 = arrayList;
                                    }
                                }
                            }
                        } else {
                            np messagesController = lbVar.getMessagesController();
                            long j11 = channelParticipant.peer.user_id;
                            a0.h hVar = (a0.h) messagesController.y1.f(chat.id);
                            TLRPC.ChannelParticipant channelParticipant2 = hVar == null ? null : (TLRPC.ChannelParticipant) hVar.f(j11);
                            if (channelParticipant2 != null && ((channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) || channelParticipant2.admin_rights.manage_call)) {
                                arrayList = arrayList12;
                                break;
                            }
                        }
                    }
                    arrayList = arrayList12;
                    if (org.telegram.messenger.t3.x(chat, channelParticipant, 6) || org.telegram.messenger.t3.x(chat, channelParticipant, 7)) {
                        str = null;
                        org.telegram.ui.Cells.y0.s(null, 2131746063, arrayList10, R.drawable.msg_block2, arrayList11);
                        arrayList2 = arrayList;
                        arrayList2.add(33);
                    } else {
                        arrayList2 = arrayList;
                        str = null;
                    }
                    org.telegram.ui.Cells.y0.s(str, 2131753729, arrayList10, R.drawable.msg_block, arrayList11);
                    arrayList2.add(35);
                }
                uaVar.run();
                break;
            case 13:
                an anVar = (an) this.d;
                vf.b bVar = (vf.b) this.e;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
                String str6 = (String) this.h;
                TLObject tLObject9 = (TLObject) this.b;
                CharacterStyle characterStyle = (CharacterStyle) this.c;
                bVar.b();
                m60 I = m60.I(anVar, q1Var);
                ok0 ok0Var = new ok0(anVar.getParentActivity(), anVar.Aa);
                I.p = new de(ok0Var, i12);
                I.c(R.drawable.msg_copy, hd.M0(2131751766, null), new ie(anVar, ok0Var, str6, 2), false);
                if (tLObject9 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject9;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList13 = tL_payments_bankCardData.open_urls;
                    int size3 = arrayList13.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList13.get(i18);
                        i18++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        I.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new org.telegram.ui.u5(26, anVar, tL_bankCardOpenUrl2), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        I.k();
                        I.p(13, org.telegram.messenger.g0.L(200.0f), tL_payments_bankCardData.title);
                    }
                }
                ok0Var.e(I);
                ok0Var.f(q1Var, characterStyle, null, false);
                anVar.showDialog(ok0Var);
                break;
            case 14:
                gf gfVar = (gf) this.d;
                ji.e eVar = (ji.e) this.e;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                View view = (View) this.f;
                RectF rectF = (RectF) this.h;
                hi.g7 g7Var = (hi.g7) this.c;
                gfVar.getClass();
                eVar.getLocationInWindow(new int[2]);
                frameLayout2.getLocationInWindow(new int[2]);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.leftMargin = Math.round((rectF.left + r8[0]) - r7[0]);
                layoutParams.topMargin = Math.round((rectF.top + r8[1]) - r7[1]);
                view.setLayoutParams(layoutParams);
                view.post(new org.telegram.ui.ActionBar.l5(gfVar, frameLayout2, view, g7Var, 21));
                break;
            case 15:
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.e;
                hi.d dVar2 = (hi.d) this.b;
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.f;
                Runnable runnable2 = (Runnable) this.h;
                if (tL_error7 != null) {
                    new cc(ta.a(context), e6Var2).f0(tL_error7, false);
                    break;
                } else {
                    dVar2.setLoading(false);
                    p6Var.dismiss();
                    org.telegram.messenger.k5.n(null, 2131746953, new cc(ta.a(context), e6Var2), R.raw.chats_infotip, 36);
                    runnable2.run();
                    break;
                }
            case 16:
                bw0 bw0Var = (bw0) this.d;
                TLObject tLObject10 = (TLObject) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.e;
                TextView textView = (TextView) this.f;
                TextView textView2 = (TextView) this.h;
                int[] iArr2 = (int[]) this.c;
                bw0Var.getClass();
                if (!(tLObject10 instanceof TLRPC.TL_stickers_suggestedShortName) || (str2 = ((TLRPC.TL_stickers_suggestedShortName) tLObject10).short_name) == null) {
                    z10 = false;
                } else {
                    editTextBoldCursor.setText(str2);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    bw0Var.K0(textView, editTextBoldCursor.getText().toString(), true);
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
                ek0.b0((ek0) this.d, (TLRPC.TL_error) this.c, (String) this.e, (vj0) this.f, (TLObject) this.b, (TL_account.sendVerifyPhoneCode) this.h);
                break;
            case 18:
                my0 my0Var = (my0) this.d;
                TLObject tLObject11 = (TLObject) this.b;
                CharSequence charSequence2 = (CharSequence) this.e;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.c;
                byte[] bArr = (byte[]) this.f;
                String str7 = (String) this.h;
                hi.i1 i1Var = my0Var.m1;
                if ((i1Var.getCurrentView() instanceof ly0) && (dVar = ((ly0) i1Var.getCurrentView()).s) != null) {
                    dVar.setLoading(false);
                }
                if (tLObject11 != null) {
                    boolean z11 = tLObject11 instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
                    if (!z11 && !(tLObject11 instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject11 instanceof TLRPC.TL_reportResultAddComment)) {
                        if (tLObject11 instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            np.s1(my0Var.a).o0(false);
                            hy0 hy0Var3 = my0Var.v1;
                            if (hy0Var3 != null) {
                                hy0Var3.d();
                                my0Var.dismiss();
                                break;
                            }
                        } else if (((tLObject11 instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject11 instanceof TLRPC.TL_reportResultReported)) && (hy0Var2 = my0Var.v1) != null) {
                            hy0Var2.a();
                            my0Var.dismiss();
                            break;
                        }
                    } else {
                        i1Var.C(i1Var.b + 1);
                        ly0 ly0Var = (ly0) i1Var.getViewPages()[1];
                        if (ly0Var != null) {
                            u41 u41Var = ly0Var.f;
                            if (tLObject11 instanceof TLRPC.TL_reportResultChooseOption) {
                                ly0Var.b = null;
                                ly0Var.c = (TLRPC.TL_reportResultChooseOption) tLObject11;
                                ly0Var.d = null;
                                u41Var.g3.O(false);
                            } else if (tLObject11 instanceof TLRPC.TL_reportResultAddComment) {
                                ly0Var.b((TLRPC.TL_reportResultAddComment) tLObject11);
                            } else if (z11) {
                                ly0Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject11;
                                ly0Var.c = null;
                                ly0Var.d = null;
                                u41Var.g3.O(false);
                            }
                            if (charSequence2 != null) {
                                di.k4 k4Var = ly0Var.h;
                                ((TextView) k4Var.c).setText(charSequence2);
                                ((TextView) k4Var.c).getText();
                                k4Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), TLObject.FLAG_31));
                                if (u41Var != null) {
                                    u41Var.g3.O(true);
                                    break;
                                }
                            }
                        }
                    }
                } else if (tL_error8 != null) {
                    if (!my0Var.p1 && "MESSAGE_ID_REQUIRED".equals(tL_error8.text)) {
                        long j12 = my0Var.u1;
                        String charSequence3 = charSequence2.toString();
                        int i19 = an.ld;
                        org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                        if (T2 != null) {
                            Bundle bundle = new Bundle();
                            if (org.telegram.messenger.m5.E(j12)) {
                                bundle.putLong("user_id", j12);
                            } else {
                                bundle.putLong("chat_id", -j12);
                            }
                            bundle.putString("reportTitle", charSequence3);
                            bundle.putByteArray("reportOption", bArr);
                            bundle.putString("reportMessage", str7);
                            T2.presentFragment(new an(bundle));
                        }
                    } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error8.text)) {
                        hy0 hy0Var4 = my0Var.v1;
                        if (hy0Var4 != null) {
                            hy0Var4.g();
                        }
                    } else if ("AD_EXPIRED".equals(tL_error8.text) && (hy0Var = my0Var.v1) != null) {
                        hy0Var.a();
                    }
                    my0Var.dismiss();
                    break;
                }
                break;
            case 19:
                TLObject tLObject12 = (TLObject) this.b;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) this.e;
                byte[] bArr2 = (byte[]) this.f;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.h;
                hh0 hh0Var = (hh0) this.c;
                my0 my0Var2 = new my0(context2, e6Var3, 0L, bArr2);
                my0Var2.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject12);
                my0Var2.v1 = new ab.c0(e2Var, context2, e6Var3, hh0Var, 11);
                my0Var2.show();
                break;
            case 20:
                final x11 x11Var = (x11) this.d;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.c;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.e;
                TLRPC.User user3 = (TLRPC.User) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                TLRPC.TL_channels_editCreator tL_channels_editCreator = (TLRPC.TL_channels_editCreator) this.h;
                if (tL_error9 == null) {
                    if (inputCheckPasswordSRP != null) {
                        org.telegram.ui.Components.a2 a2Var = x11Var.V1;
                        if (a2Var != null) {
                            a2Var.run();
                        }
                        x11Var.dismiss();
                        twoStepVerificationActivity.t0();
                        twoStepVerificationActivity.finishFragment();
                        break;
                    }
                } else if (x11Var.f2 != null) {
                    if ("PASSWORD_HASH_INVALID".equals(tL_error9.text)) {
                        if (inputCheckPasswordSRP == null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(x11Var.f2);
                            alertDialog$Builder3.a.S = hd.M0(org.telegram.messenger.t3.V(x11Var.T1) ? 2131751322 : 2131751315, null);
                            alertDialog$Builder3.a.U = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131751292, x11Var.T1.title, q10.j(user3, true)));
                            alertDialog$Builder3.k(hd.M0(2131751296, null), new xi0(18, x11Var, user3));
                            alertDialog$Builder3.h(hd.M0(2131752589, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.o11
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var3, int i20) {
                                    switch (i12) {
                                        case 0:
                                            x11Var.d2.setLoading(false);
                                            break;
                                        case 1:
                                            x11 x11Var2 = x11Var;
                                            x11Var2.getClass();
                                            org.telegram.ui.ActionBar.e2 T3 = LaunchActivity.T();
                                            if (T3 != null) {
                                                x11Var2.dismiss();
                                                T3.presentFragment(new xa1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            x11Var.d2.setLoading(false);
                                            break;
                                        default:
                                            x11Var.d2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder3.p();
                            break;
                        }
                    } else if (!"PASSWORD_MISSING".equals(tL_error9.text) && !tL_error9.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error9.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error9.text)) {
                            ConnectionsManager.getInstance(x11Var.a).sendRequest(new TL_account.getPassword(), new jo0(x11Var, twoStepVerificationActivity, user3, i10), 8);
                            break;
                        } else if (!tL_error9.text.equals("CHANNELS_TOO_MUCH")) {
                            if (twoStepVerificationActivity != null) {
                                twoStepVerificationActivity.t0();
                                twoStepVerificationActivity.finishFragment();
                            }
                            org.telegram.ui.ActionBar.e2 T3 = LaunchActivity.T();
                            if (T3 != null) {
                                org.telegram.ui.Components.t4.e0(tL_error9, T3, org.telegram.messenger.t3.V(x11Var.T1), org.telegram.messenger.t3.Y(x11Var.T1), tL_channels_editCreator);
                                break;
                            }
                        } else if (x11Var.f2 == null || m10.i(org.telegram.messenger.c.a(x11Var.a).a).q()) {
                            org.telegram.ui.ActionBar.e2 T4 = LaunchActivity.T();
                            if (T4 != null) {
                                x11Var.dismiss();
                                T4.presentFragment(new l81(1));
                                break;
                            }
                        } else {
                            org.telegram.ui.ActionBar.e2 T5 = LaunchActivity.T();
                            if (T5 != null) {
                                new ug.j0(5, x11Var.a, x11Var.f2, T5, null);
                                break;
                            }
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.t0();
                        }
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(x11Var.f2);
                        alertDialog$Builder4.a.S = hd.M0(2131751297, null);
                        LinearLayout linearLayout2 = new LinearLayout(x11Var.f2);
                        linearLayout2.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                        linearLayout2.setOrientation(1);
                        alertDialog$Builder4.o(linearLayout2);
                        TextView textView3 = new TextView(x11Var.f2);
                        int i20 = org.telegram.ui.ActionBar.j6.j5;
                        org.telegram.ui.ActionBar.q6.U(textView3, i20, null);
                        textView3.setTextSize(1, 16.0f);
                        textView3.setGravity((hd.a0 ? 5 : 3) | 48);
                        if (org.telegram.messenger.t3.V(x11Var.T1)) {
                            org.telegram.messenger.k5.q(null, null, 2131751283, new Object[]{q10.j(user3, true)}, textView3);
                        } else {
                            org.telegram.messenger.k5.q(null, null, 2131751301, new Object[]{q10.j(user3, true)}, textView3);
                        }
                        linearLayout2.addView(textView3, ja.o(-1, -2));
                        LinearLayout linearLayout3 = new LinearLayout(x11Var.f2);
                        linearLayout3.setOrientation(0);
                        linearLayout2.addView(linearLayout3, ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView = new ImageView(x11Var.f2);
                        imageView.setImageResource(R.drawable.list_circle);
                        imageView.setPadding(hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.q6.s(imageView, i20, null, mode);
                        TextView textView4 = new TextView(x11Var.f2);
                        org.telegram.ui.ActionBar.q6.U(textView4, i20, null);
                        textView4.setTextSize(1, 16.0f);
                        textView4.setGravity((hd.a0 ? 5 : 3) | 48);
                        textView4.setText(org.telegram.messenger.g0.X2(hd.M0(2131751300, null)));
                        if (hd.a0) {
                            linearLayout3.addView(textView4, ja.o(-1, -2));
                            linearLayout3.addView(imageView, ja.r(-2, -2, 5));
                        } else {
                            linearLayout3.addView(imageView, ja.o(-2, -2));
                            linearLayout3.addView(textView4, ja.o(-1, -2));
                        }
                        LinearLayout linearLayout4 = new LinearLayout(x11Var.f2);
                        linearLayout4.setOrientation(0);
                        linearLayout2.addView(linearLayout4, ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView2 = new ImageView(x11Var.f2);
                        imageView2.setImageResource(R.drawable.list_circle);
                        imageView2.setPadding(hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
                        org.telegram.ui.ActionBar.q6.s(imageView2, i20, null, mode);
                        TextView textView5 = new TextView(x11Var.f2);
                        org.telegram.ui.ActionBar.q6.U(textView5, i20, null);
                        textView5.setTextSize(1, 16.0f);
                        textView5.setGravity((hd.a0 ? 5 : 3) | 48);
                        textView5.setText(org.telegram.messenger.g0.X2(hd.M0(2131751299, null)));
                        if (hd.a0) {
                            linearLayout4.addView(textView5, ja.o(-1, -2));
                            i7 = 5;
                            linearLayout4.addView(imageView2, ja.r(-2, -2, 5));
                        } else {
                            i7 = 5;
                            linearLayout4.addView(imageView2, ja.o(-2, -2));
                            linearLayout4.addView(textView5, ja.o(-1, -2));
                        }
                        if ("PASSWORD_MISSING".equals(tL_error9.text)) {
                            final int i21 = 1;
                            alertDialog$Builder4.k(hd.M0(2131751291, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.o11
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var3, int i202) {
                                    switch (i21) {
                                        case 0:
                                            x11Var.d2.setLoading(false);
                                            break;
                                        case 1:
                                            x11 x11Var2 = x11Var;
                                            x11Var2.getClass();
                                            org.telegram.ui.ActionBar.e2 T32 = LaunchActivity.T();
                                            if (T32 != null) {
                                                x11Var2.dismiss();
                                                T32.presentFragment(new xa1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            x11Var.d2.setLoading(false);
                                            break;
                                        default:
                                            x11Var.d2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                            final int i22 = 2;
                            alertDialog$Builder4.h(hd.M0(2131752589, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.o11
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var3, int i202) {
                                    switch (i22) {
                                        case 0:
                                            x11Var.d2.setLoading(false);
                                            break;
                                        case 1:
                                            x11 x11Var2 = x11Var;
                                            x11Var2.getClass();
                                            org.telegram.ui.ActionBar.e2 T32 = LaunchActivity.T();
                                            if (T32 != null) {
                                                x11Var2.dismiss();
                                                T32.presentFragment(new xa1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            x11Var.d2.setLoading(false);
                                            break;
                                        default:
                                            x11Var.d2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                        } else {
                            TextView textView6 = new TextView(x11Var.f2);
                            org.telegram.ui.ActionBar.q6.U(textView6, i20, null);
                            textView6.setTextSize(1, 16.0f);
                            org.telegram.messenger.k5.l(textView6, (hd.a0 ? i7 : 3) | 48, null, 2131751298);
                            linearLayout2.addView(textView6, ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            final int i23 = 3;
                            alertDialog$Builder4.h(hd.M0(2131747831, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.o11
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var3, int i202) {
                                    switch (i23) {
                                        case 0:
                                            x11Var.d2.setLoading(false);
                                            break;
                                        case 1:
                                            x11 x11Var2 = x11Var;
                                            x11Var2.getClass();
                                            org.telegram.ui.ActionBar.e2 T32 = LaunchActivity.T();
                                            if (T32 != null) {
                                                x11Var2.dismiss();
                                                T32.presentFragment(new xa1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            x11Var.d2.setLoading(false);
                                            break;
                                        default:
                                            x11Var.d2.setLoading(false);
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
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.d;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.e;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.b;
                x21 x21Var = (x21) this.f;
                JSONObject jSONObject = (JSONObject) this.h;
                String str8 = (String) this.c;
                if (!d2Var.A(z1Var) || d2Var.j(z1Var)) {
                    d2Var.y(z1Var, i0Var, null, 0, "Request expired or wallet changed", x21Var);
                    break;
                } else {
                    d2Var.y(z1Var, i0Var, jSONObject, jSONObject == null ? 0 : -1, str8, x21Var);
                    break;
                }
                break;
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
                ((WalletEngine2) this.d).lambda$prepareSendNFT$26((String) this.e, (String) this.b, (String) this.f, (byte[]) this.h, (s10) this.c);
                break;
            case 27:
                f();
                break;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.d;
                File file = (File) this.b;
                org.telegram.ui.ActionBar.t1 t1Var3 = (org.telegram.ui.ActionBar.t1) this.e;
                String str9 = (String) this.f;
                String str10 = (String) this.h;
                String str11 = (String) this.c;
                if (file == null) {
                    t1Var3.c(500L);
                    break;
                } else {
                    int[] iArr3 = new int[11];
                    Utilities.e.c(new lv0(file, iArr3, new di.j6((is) v0Var, (Object) iArr3, (Object) file, (Object) t1Var3, str9, (Object) str10, (Object) str11, 15), i11));
                    break;
                }
        }
    }

    public /* synthetic */ p1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
        this.h = obj5;
        this.c = obj6;
    }

    public /* synthetic */ p1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7, boolean z10) {
        this.a = i7;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.c = obj6;
    }

    public /* synthetic */ p1(jg.z0 z0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, np npVar, vr vrVar) {
        this.a = 10;
        this.d = z0Var;
        this.e = str;
        this.c = tL_error;
        this.b = tLObject;
        this.f = npVar;
        this.h = vrVar;
    }

    public /* synthetic */ p1(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.c = obj5;
    }

    public /* synthetic */ p1(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.e6 e6Var, hi.d dVar, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.a = 15;
        this.c = tL_error;
        this.d = context;
        this.e = e6Var;
        this.b = dVar;
        this.f = p6Var;
        this.h = runnable;
    }

    public /* synthetic */ p1(an anVar, vf.b bVar, org.telegram.ui.Cells.q1 q1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.a = 13;
        this.d = anVar;
        this.e = bVar;
        this.f = q1Var;
        this.h = str;
        this.b = tLObject;
        this.c = characterStyle;
    }

    public /* synthetic */ p1(ek0 ek0Var, TLRPC.TL_error tL_error, String str, vj0 vj0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.a = 17;
        this.d = ek0Var;
        this.c = tL_error;
        this.e = str;
        this.f = vj0Var;
        this.b = tLObject;
        this.h = sendverifyphonecode;
    }

    public /* synthetic */ p1(my0 my0Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.a = 18;
        this.d = my0Var;
        this.b = tLObject;
        this.e = charSequence;
        this.c = tL_error;
        this.f = bArr;
        this.h = str;
    }

    public /* synthetic */ p1(x11 x11Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.a = 20;
        this.d = x11Var;
        this.c = tL_error;
        this.e = inputCheckPasswordSRP;
        this.b = user;
        this.f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public /* synthetic */ p1(org.telegram.ui.Wallet.d2 d2Var, String str, z10 z10Var, org.telegram.ui.Wallet.z1 z1Var, org.telegram.ui.Wallet.i0 i0Var, TL_wallet.sendTransfer sendtransfer) {
        this.a = 24;
        this.d = d2Var;
        this.e = str;
        this.h = z10Var;
        this.b = z1Var;
        this.f = i0Var;
        this.c = sendtransfer;
    }

    public /* synthetic */ p1(org.telegram.ui.web.v0 v0Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.a = 27;
        this.d = v0Var;
        this.b = tLObject;
        this.e = tL_messages_requestUrlAuth;
        this.f = str;
        this.c = tL_error;
        this.h = str2;
    }
}
