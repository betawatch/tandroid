package ai;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
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
import b8.mf;
import b8.rf;
import ci.e9;
import ci.s8;
import ci.v8;
import ci.wb;
import gi.nb;
import gi.pb;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.n10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.co0;
import org.telegram.ui.d81;
import org.telegram.ui.dy0;
import org.telegram.ui.e51;
import org.telegram.ui.ee;
import org.telegram.ui.ey0;
import org.telegram.ui.ie;
import org.telegram.ui.kb;
import org.telegram.ui.pj0;
import org.telegram.ui.q11;
import org.telegram.ui.rb0;
import org.telegram.ui.sc;
import org.telegram.ui.ta;
import org.telegram.ui.wm;
import org.telegram.ui.xg;
import org.telegram.ui.yh0;
import org.telegram.ui.yj0;
import org.telegram.ui.z8;
import org.telegram.ui.zx0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ w1(e9 e9Var, Object obj, zi ziVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, u10 u10Var, int i3) {
        this.a = i3;
        this.d = e9Var;
        this.e = obj;
        this.b = ziVar;
        this.f = inputInvoice;
        this.c = tL_payments_paymentFormStars;
        this.h = u10Var;
    }

    private final void a() {
        org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.d;
        String str = (String) this.e;
        byte[] bArr = (byte[]) this.b;
        org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.f;
        byte[] bArr2 = z1Var.b;
        org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.h;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
        org.telegram.ui.Wallet.k0 k0Var = c2Var.b;
        if (!TextUtils.equals(str, k0Var.t()) || !Arrays.equals(bArr, k0Var.y())) {
            Arrays.fill(bArr2, (byte) 0);
            s1Var.a(null, "Wallet changed. Open the request again.");
            return;
        }
        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
        inputtonconnectoauthsession.session_id = tonconnectsession.id;
        inputtonconnectoauthsession.challenge_answer = bArr2;
        inputtonconnectoauthsession.body = z1Var.c;
        inputtonconnectoauthsession.proof = z1Var.d;
        s1Var.a(inputtonconnectoauthsession, null);
    }

    private final void b() {
        org.telegram.ui.Wallet.s2 s2Var = (org.telegram.ui.Wallet.s2) this.d;
        int[] iArr = (int[]) this.e;
        TextView textView = (TextView) this.b;
        org.telegram.ui.Wallet.e7 e7Var = (org.telegram.ui.Wallet.e7) this.f;
        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.h;
        org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.c;
        if (s2Var.e || s2Var.d) {
            return;
        }
        iArr[0] = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        spannableStringBuilder.setSpan(new x70(org.telegram.messenger.g0.L(80.0f), textView), 0, spannableStringBuilder.length(), 33);
        textView.setText(bd.V(null, null, 2131743130, spannableStringBuilder));
        e7Var.run();
        WalletEngine2 walletEngine2 = k0Var.b;
        if (walletEngine2 != null) {
            walletEngine2.previewTonConnect(b2Var, new org.telegram.ui.Wallet.c1(s2Var, iArr, k0Var, textView, b2Var, e7Var, 4));
            return;
        }
        iArr[0] = 3;
        textView.setText(bd.M0(2131742996, null));
        e7Var.run();
    }

    private final void c() {
        ((WalletEngine2) this.d).lambda$prepareSendNFT$26((String) this.e, (String) this.b, (String) this.f, (byte[]) this.h, (n10) this.c);
    }

    private final void e() {
        org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.d;
        TLObject tLObject = (TLObject) this.b;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
        String str = (String) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.e6 e6Var = w0Var.e;
        if (tLObject == null) {
            if (tL_error != null) {
                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    new fc(w0Var, e6Var).I(R.raw.error, bd.M0(2131753128, null), org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, e6Var), bd.a0(null, null, 2131753130, str2))).j();
                    return;
                } else {
                    new fc(w0Var, e6Var).f0(tL_error, false);
                    return;
                }
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
            yh0.b(false, w0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, w0Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
            yh0.b(false, w0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, w0Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
            org.telegram.ui.Components.t4.o0(w0Var.getContext(), str, false, true, true, false, 0L, null, null, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:273:0x07d6, code lost:
    
        if (r1.admin_rights.manage_call != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x080f, code lost:
    
        if (r8.creator != false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x080b, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L273;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        org.telegram.ui.ActionBar.d2 T;
        TLRPC.User user;
        String str;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        String str2;
        zx0 zx0Var;
        zx0 zx0Var2;
        gi.d dVar;
        int i3;
        int i10 = 7;
        int i11 = 3;
        int i12 = 8;
        int i13 = 1;
        final int i14 = 0;
        switch (this.a) {
            case 0:
                final b3 b3Var = (b3) this.d;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.e;
                TLObject tLObject = (TLObject) this.b;
                p1 p1Var = (p1) this.f;
                final u10 u10Var = (u10) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                s1Var.dismiss();
                if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
                    p1Var.run();
                    break;
                } else if (tLObject instanceof TL_stars.checkCanSendGiftResultFail) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, b3Var.getContext(), b3Var.J0);
                    alertDialog$Builder.a.S = bd.M0(2131749760, null);
                    alertDialog$Builder.a.U = zi.h0(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
                    alertDialog$Builder.k(bd.M0(2131747839, null), null);
                    final org.telegram.ui.ActionBar.s1 p10 = alertDialog$Builder.p();
                    final kt ktVar = p10.n;
                    if (ktVar != null) {
                        ktVar.setOnLinkPressListener(new r70() { // from class: ai.x1
                            @Override // org.telegram.ui.Components.r70
                            public final void a(ClickableSpan clickableSpan) {
                                b3 b3Var2 = b3.this;
                                b3Var2.getClass();
                                p10.dismiss();
                                u10 u10Var2 = u10Var;
                                if (u10Var2 != null) {
                                    u10Var2.a(Boolean.FALSE);
                                }
                                b3Var2.dismiss();
                                clickableSpan.onClick(ktVar);
                            }
                        });
                        break;
                    }
                } else if (tL_error != null) {
                    new fc(b3Var.c, b3Var.J0).f0(tL_error, false);
                    break;
                }
                break;
            case 1:
                ci.l6 l6Var = (ci.l6) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                xg.e1[] e1VarArr = (xg.e1[]) this.e;
                Long l10 = (Long) this.f;
                k3 k3Var = (k3) this.h;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    hp.s1(l6Var.a).Y3(tL_users_userFull.users, false);
                    hp.s1(l6Var.a).S3(tL_users_userFull.chats, false);
                    TLRPC.UserFull userFull = tL_users_userFull.full_user;
                    if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                        org.telegram.messenger.camera.q.s(bd.a0(null, null, 2131743752, org.telegram.messenger.m5.t(l10.longValue())), new fc(e1VarArr[0].c, l6Var.J0), R.raw.error, 36);
                        break;
                    } else {
                        k3Var.run();
                        break;
                    }
                } else {
                    ac Y = l6Var.k().Y(tL_error2);
                    Y.t = true;
                    Y.j();
                    break;
                }
                break;
            case 2:
                final ci.l6 l6Var2 = (ci.l6) this.d;
                TLObject tLObject3 = (TLObject) this.b;
                final CharSequence charSequence = (CharSequence) this.e;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f;
                final TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.h;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                if (tLObject3 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject3;
                    ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
                    int size = arrayList.size();
                    final long j10 = 0;
                    int i15 = 0;
                    while (i15 < size) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i15);
                        i15++;
                        j10 += tL_labeledPrice.amount;
                    }
                    LinearLayout linearLayout = new LinearLayout(l6Var2.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
                    TextView b10 = rf.b(l6Var2.getContext(), 16.0f, org.telegram.ui.ActionBar.k6.j5, false, null);
                    b10.setText(bd.M0(2131750049, null));
                    linearLayout.addView(b10, mf.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                    rx0 rx0Var = new rx0(l6Var2.getContext(), l6Var2.J0);
                    px0 a10 = rx0Var.a(charSequence);
                    a10.setFilled(true);
                    yh.l lVar = (yh.l) a10.getChildAt(0);
                    lVar.setTextSize(1, 12.0f);
                    lVar.setGravity(17);
                    linearLayout.addView(rx0Var, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, l6Var2.getContext(), l6Var2.J0);
                    alertDialog$Builder2.a.S = bd.M0(2131750048, null);
                    alertDialog$Builder2.o(linearLayout);
                    alertDialog$Builder2.h(bd.M0(2131752589, null), null);
                    alertDialog$Builder2.k(wb.T0(bd.a0(null, null, 2131750050, Integer.valueOf((int) j10))), new org.telegram.ui.ActionBar.p1() { // from class: ci.j3
                        @Override // org.telegram.ui.ActionBar.p1
                        public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i16) {
                            sf.b h = s1Var2.h(-1, true, true);
                            h.d();
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = paymentForm.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
                            l6 l6Var3 = l6.this;
                            ConnectionsManager.getInstance(l6Var3.a).sendRequest(tL_payments_sendStarsForm, new r3(l6Var3, h, s1Var2, tL_starGiftUnique, j10, charSequence));
                        }
                    });
                    alertDialog$Builder2.p();
                    break;
                } else if (tL_error3 != null) {
                    l6Var2.k().f0(tL_error3, false);
                    break;
                }
                break;
            case 3:
                e9 e9Var = (e9) this.d;
                List list = (List) this.e;
                org.telegram.ui.Wallet.s1 s1Var2 = (org.telegram.ui.Wallet.s1) this.b;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f;
                e5.f fVar = (e5.f) this.h;
                Activity activity = (Activity) this.c;
                if (list.isEmpty()) {
                    org.telegram.messenger.g0.h3(new ci.c7(s1Var2, i14));
                    break;
                } else {
                    e5.l lVar2 = (e5.l) list.get(0);
                    if (lVar2.a() == null) {
                        org.telegram.messenger.g0.h3(new ci.c7(s1Var2, 1));
                        break;
                    } else {
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
                        ConnectionsManager.getInstance(e9Var.a).sendRequest(tL_payments_canPurchaseStore, new ci.d7(lVar2, fVar, s1Var2, activity, tL_inputStorePaymentStarsGiveaway, list, 0));
                        break;
                    }
                }
            case 4:
                e9 e9Var2 = (e9) this.d;
                boolean[] zArr = (boolean[]) this.e;
                zi ziVar = (zi) this.b;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.c;
                u10 u10Var2 = (u10) this.h;
                zArr[0] = true;
                e9Var2.Z(ziVar, inputInvoice, tL_payments_paymentFormStars, new ci.e2(u10Var2, 1));
                break;
            case 5:
                e9 e9Var3 = (e9) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                zi ziVar2 = (zi) this.e;
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.f;
                xg xgVar = (xg) this.h;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                if (tLObject4 instanceof TLRPC.TL_payments_paymentFormStars) {
                    e9Var3.X(ziVar2, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject4, xgVar, null);
                } else {
                    e9.e(tL_error4 == null ? "NO_PAYMENT_FORM" : tL_error4.text);
                }
                xgVar.run();
                break;
            case 6:
                e9 e9Var4 = (e9) this.d;
                Runnable runnable = (Runnable) this.e;
                zi ziVar3 = (zi) this.b;
                TLRPC.InputInvoice inputInvoice2 = (TLRPC.InputInvoice) this.f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = (TLRPC.TL_payments_paymentFormStars) this.c;
                u10 u10Var3 = (u10) this.h;
                if (e9Var4.e) {
                    e9Var4.X(ziVar3, inputInvoice2, tL_payments_paymentFormStars2, runnable, u10Var3);
                    break;
                } else {
                    e9.e("NO_BALANCE");
                    runnable.run();
                    break;
                }
            case 7:
                s8 s8Var = (s8) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.e;
                v8 v8Var = (v8) this.f;
                u10 u10Var4 = (u10) this.h;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                long j11 = s8Var.b;
                int i16 = s8Var.a;
                HashMap hashMap = s8Var.h;
                ArrayList arrayList2 = s8Var.e;
                s8Var.k = false;
                if (tLObject5 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject5;
                    arrayList2.remove(tL_starGiftCollection);
                    arrayList2.add(tL_starGiftCollection2);
                    hashMap.remove(-1);
                    int i17 = tL_starGiftCollection2.collection_id;
                    v8Var.d = i17;
                    hashMap.put(Integer.valueOf(i17), v8Var);
                    s8Var.j();
                    hs.f(i16).k(hs.H3, Long.valueOf(j11), s8Var);
                    u10Var4.a(tL_starGiftCollection2);
                    break;
                } else {
                    if (tL_error5 != null && (T = LaunchActivity.T()) != null) {
                        fc.a0(T).f0(tL_error5, false);
                    }
                    arrayList2.remove(tL_starGiftCollection);
                    hashMap.remove(-1);
                    s8Var.j();
                    hs.f(i16).k(hs.H3, Long.valueOf(j11), s8Var);
                    break;
                }
            case 8:
                ei.r6 r6Var = (ei.r6) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList arrayList4 = (ArrayList) this.b;
                ArrayList arrayList5 = (ArrayList) this.f;
                ArrayList arrayList6 = (ArrayList) this.h;
                HashSet hashSet = (HashSet) this.c;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                sb2.append(r6Var.e);
                sb2.append("{");
                sb2.append(r6Var.d);
                sb2.append("} preloadCache {");
                sb2.append(ei.z6.a(arrayList3));
                k2.p1.w("}", sb2);
                ArrayList arrayList7 = r6Var.g;
                arrayList7.clear();
                arrayList7.addAll(arrayList4);
                r6Var.t = false;
                int i18 = r6Var.c;
                hp.s1(i18).Y3(arrayList5, true);
                hp.s1(i18).S3(arrayList6, true);
                if (r6Var.v) {
                    r6Var.v = false;
                    r6Var.y = null;
                    r6Var.j();
                    break;
                } else {
                    r6Var.m.addAll(hashSet);
                    r6Var.k.clear();
                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                        r6Var.t((zi) arrayList3.get(i19), true);
                    }
                    r6Var.d(false);
                    ei.q6 q6Var = r6Var.y;
                    if (q6Var != null) {
                        q6Var.a(0);
                        r6Var.y = null;
                    }
                    hs.f(i18).k(hs.x5, r6Var);
                    break;
                }
            case 9:
                int[] iArr = (int[]) this.d;
                TLObject tLObject6 = (TLObject) this.b;
                hp hpVar = (hp) this.e;
                TLRPC.User[] userArr = (TLRPC.User[]) this.f;
                pb pbVar = (pb) this.h;
                nb nbVar = (nb) this.c;
                iArr[0] = 0;
                if (tLObject6 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject6;
                    hpVar.Y3(tL_contacts_resolvedPeer.users, false);
                    hpVar.S3(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User a22 = hpVar.a2(Long.valueOf(org.telegram.messenger.m5.o(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = a22;
                    if (a22 != null) {
                        pbVar.run();
                        break;
                    }
                }
                nbVar.a(null);
                break;
            case 10:
                kg.w0 w0Var = (kg.w0) this.d;
                String str3 = (String) this.e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.b;
                hp hpVar2 = (hp) this.f;
                qr qrVar = (qr) this.h;
                kg.e1 e1Var = w0Var.e;
                String str4 = e1Var.r0;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error6 == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject7;
                        if (!tL_contacts_resolvedPeer2.users.isEmpty()) {
                            TLRPC.User user2 = tL_contacts_resolvedPeer2.users.get(0);
                            hpVar2.X3(user2, false, false);
                            qrVar.m1(tL_contacts_resolvedPeer2.users, null, true, true);
                            user = user2;
                            e1Var.R(user);
                            e1Var.u0 = 0;
                            break;
                        }
                    }
                    user = null;
                    e1Var.R(user);
                    e1Var.u0 = 0;
                }
                break;
            case 11:
                TLObject tLObject8 = (TLObject) this.b;
                String[] strArr = (String[]) this.d;
                final FrameLayout frameLayout = (FrameLayout) this.e;
                final s70 s70Var = (s70) this.f;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.h;
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
                                s70Var.setText(str5);
                            }
                        }
                    });
                    duration.addListener(new z8(atomicBoolean, s70Var, str5));
                    duration.start();
                    new fc(t2Var.F, e6Var).I(R.raw.linkbroken, bd.M0(2131749483, null), bd.M0(2131749484, null)).j();
                    break;
                }
                break;
            case 12:
                kb kbVar = (kb) this.d;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.e;
                ArrayList arrayList8 = (ArrayList) this.b;
                ArrayList arrayList9 = (ArrayList) this.f;
                ArrayList arrayList10 = (ArrayList) this.h;
                ta taVar = (ta) this.c;
                TLRPC.Chat chat = kbVar.f;
                kbVar.a0 = channelParticipant;
                if (channelParticipant != null) {
                    if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                        if (org.telegram.messenger.t3.T(chat)) {
                            hp messagesController = kbVar.getMessagesController();
                            long j12 = channelParticipant.peer.user_id;
                            a0.h hVar = (a0.h) messagesController.y1.f(chat.id);
                            TLRPC.ChannelParticipant channelParticipant2 = hVar == null ? null : (TLRPC.ChannelParticipant) hVar.f(j12);
                            if (channelParticipant2 != null) {
                                if (!(channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) {
                                    break;
                                }
                                break;
                            }
                        } else {
                            TLRPC.ChatFull N0 = kbVar.getMessagesController().N0(chat.id);
                            if (N0 != null && (chatParticipants = N0.participants) != null) {
                                int size2 = chatParticipants.participants.size();
                                while (true) {
                                    if (i14 < size2) {
                                        TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i14);
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
                    if (org.telegram.messenger.t3.x(chat, channelParticipant, 6) || org.telegram.messenger.t3.x(chat, channelParticipant, 7)) {
                        str = null;
                        org.telegram.ui.Cells.f1.x(null, 2131746073, arrayList8, R.drawable.msg_block2, arrayList9);
                        arrayList10.add(33);
                    } else {
                        str = null;
                    }
                    org.telegram.ui.Cells.f1.x(str, 2131753729, arrayList8, R.drawable.msg_block, arrayList9);
                    arrayList10.add(35);
                }
                taVar.run();
                break;
            case 13:
                wm wmVar = (wm) this.d;
                sf.b bVar = (sf.b) this.e;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
                String str6 = (String) this.h;
                TLObject tLObject9 = (TLObject) this.b;
                CharacterStyle characterStyle = (CharacterStyle) this.c;
                bVar.b();
                f60 I = f60.I(wmVar, q1Var);
                nk0 nk0Var = new nk0(wmVar.getParentActivity(), wmVar.ya);
                I.p = new ee(nk0Var, i14);
                I.c(R.drawable.msg_copy, bd.M0(2131751766, null), new ie(wmVar, nk0Var, str6, 2), false);
                if (tLObject9 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject9;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList11 = tL_payments_bankCardData.open_urls;
                    int size3 = arrayList11.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList11.get(i20);
                        i20++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        I.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new sc(12, wmVar, tL_bankCardOpenUrl2), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        I.k();
                        I.p(13, org.telegram.messenger.g0.L(200.0f), tL_payments_bankCardData.title);
                    }
                }
                nk0Var.e(I);
                nk0Var.f(q1Var, characterStyle, null, false);
                wmVar.showDialog(nk0Var);
                break;
            case 14:
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.e;
                gi.d dVar2 = (gi.d) this.b;
                org.telegram.ui.q6 q6Var2 = (org.telegram.ui.q6) this.f;
                Runnable runnable2 = (Runnable) this.h;
                if (tL_error7 != null) {
                    new fc(wa.a(context), e6Var2).f0(tL_error7, false);
                    break;
                } else {
                    dVar2.setLoading(false);
                    q6Var2.dismiss();
                    org.telegram.messenger.k5.o(null, 2131746961, new fc(wa.a(context), e6Var2), R.raw.chats_infotip, 36);
                    runnable2.run();
                    break;
                }
            case 15:
                xv0 xv0Var = (xv0) this.d;
                TLObject tLObject10 = (TLObject) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.e;
                TextView textView = (TextView) this.f;
                TextView textView2 = (TextView) this.h;
                int[] iArr2 = (int[]) this.c;
                xv0Var.getClass();
                if (!(tLObject10 instanceof TLRPC.TL_stickers_suggestedShortName) || (str2 = ((TLRPC.TL_stickers_suggestedShortName) tLObject10).short_name) == null) {
                    z10 = false;
                } else {
                    editTextBoldCursor.setText(str2);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    xv0Var.K0(textView, editTextBoldCursor.getText().toString(), true);
                    z10 = true;
                }
                textView2.setVisibility(0);
                editTextBoldCursor.setPadding(textView2.getMeasuredWidth(), org.telegram.messenger.g0.L(4.0f), 0, 0);
                if (!z10) {
                    editTextBoldCursor.setText("");
                }
                iArr2[0] = 2;
                break;
            case 16:
                yj0.b0((yj0) this.d, (TLRPC.TL_error) this.c, (String) this.e, (pj0) this.f, (TLObject) this.b, (TL_account.sendVerifyPhoneCode) this.h);
                break;
            case 17:
                ey0 ey0Var = (ey0) this.d;
                TLObject tLObject11 = (TLObject) this.b;
                CharSequence charSequence2 = (CharSequence) this.e;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.c;
                byte[] bArr = (byte[]) this.f;
                String str7 = (String) this.h;
                gi.g1 g1Var = ey0Var.j1;
                if ((g1Var.getCurrentView() instanceof dy0) && (dVar = ((dy0) g1Var.getCurrentView()).s) != null) {
                    dVar.setLoading(false);
                }
                if (tLObject11 != null) {
                    boolean z11 = tLObject11 instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
                    if (!z11 && !(tLObject11 instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject11 instanceof TLRPC.TL_reportResultAddComment)) {
                        if (tLObject11 instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            hp.s1(ey0Var.a).o0(false);
                            zx0 zx0Var3 = ey0Var.s1;
                            if (zx0Var3 != null) {
                                zx0Var3.g();
                                ey0Var.dismiss();
                                break;
                            }
                        } else if (((tLObject11 instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject11 instanceof TLRPC.TL_reportResultReported)) && (zx0Var2 = ey0Var.s1) != null) {
                            zx0Var2.f();
                            ey0Var.dismiss();
                            break;
                        }
                    } else {
                        g1Var.D(g1Var.b + 1);
                        dy0 dy0Var = (dy0) g1Var.getViewPages()[1];
                        if (dy0Var != null) {
                            l41 l41Var = dy0Var.f;
                            if (tLObject11 instanceof TLRPC.TL_reportResultChooseOption) {
                                dy0Var.b = null;
                                dy0Var.c = (TLRPC.TL_reportResultChooseOption) tLObject11;
                                dy0Var.d = null;
                                l41Var.g3.O(false);
                            } else if (tLObject11 instanceof TLRPC.TL_reportResultAddComment) {
                                dy0Var.b((TLRPC.TL_reportResultAddComment) tLObject11);
                            } else if (z11) {
                                dy0Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject11;
                                dy0Var.c = null;
                                dy0Var.d = null;
                                l41Var.g3.O(false);
                            }
                            if (charSequence2 != null) {
                                ci.t4 t4Var = dy0Var.h;
                                ((TextView) t4Var.c).setText(charSequence2);
                                ((TextView) t4Var.c).getText();
                                t4Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), TLObject.FLAG_31));
                                if (l41Var != null) {
                                    l41Var.g3.O(true);
                                    break;
                                }
                            }
                        }
                    }
                } else if (tL_error8 != null) {
                    if (!ey0Var.m1 && "MESSAGE_ID_REQUIRED".equals(tL_error8.text)) {
                        long j13 = ey0Var.r1;
                        String charSequence3 = charSequence2.toString();
                        int i21 = wm.jd;
                        org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                        if (T2 != null) {
                            Bundle bundle = new Bundle();
                            if (org.telegram.messenger.m5.E(j13)) {
                                bundle.putLong("user_id", j13);
                            } else {
                                bundle.putLong("chat_id", -j13);
                            }
                            bundle.putString("reportTitle", charSequence3);
                            bundle.putByteArray("reportOption", bArr);
                            bundle.putString("reportMessage", str7);
                            T2.presentFragment(new wm(bundle));
                        }
                    } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error8.text)) {
                        zx0 zx0Var4 = ey0Var.s1;
                        if (zx0Var4 != null) {
                            zx0Var4.i();
                        }
                    } else if ("AD_EXPIRED".equals(tL_error8.text) && (zx0Var = ey0Var.s1) != null) {
                        zx0Var.f();
                    }
                    ey0Var.dismiss();
                    break;
                }
                break;
            case 18:
                TLObject tLObject12 = (TLObject) this.b;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) this.e;
                byte[] bArr2 = (byte[]) this.f;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.h;
                j50 j50Var = (j50) this.c;
                ey0 ey0Var2 = new ey0(context2, e6Var3, 0L, bArr2);
                ey0Var2.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject12);
                ey0Var2.s1 = new ui.f(d2Var, context2, e6Var3, j50Var, false, 11);
                ey0Var2.show();
                break;
            case 19:
                final q11 q11Var = (q11) this.d;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.c;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.e;
                TLRPC.User user3 = (TLRPC.User) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                TLRPC.TL_channels_editCreator tL_channels_editCreator = (TLRPC.TL_channels_editCreator) this.h;
                if (tL_error9 == null) {
                    if (inputCheckPasswordSRP != null) {
                        cg.l0 l0Var = q11Var.S1;
                        if (l0Var != null) {
                            l0Var.run();
                        }
                        q11Var.dismiss();
                        twoStepVerificationActivity.t0();
                        twoStepVerificationActivity.finishFragment();
                        break;
                    }
                } else if (q11Var.c2 != null) {
                    if ("PASSWORD_HASH_INVALID".equals(tL_error9.text)) {
                        if (inputCheckPasswordSRP == null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(q11Var.c2);
                            alertDialog$Builder3.a.S = bd.M0(org.telegram.messenger.t3.V(q11Var.Q1) ? 2131751323 : 2131751316, null);
                            alertDialog$Builder3.a.U = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131751293, q11Var.Q1.title, l10.j(user3, true)));
                            alertDialog$Builder3.k(bd.M0(2131751297, null), new rb0(22, q11Var, user3));
                            alertDialog$Builder3.h(bd.M0(2131752589, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.h11
                                @Override // org.telegram.ui.ActionBar.p1
                                public final void g(org.telegram.ui.ActionBar.s1 s1Var3, int i22) {
                                    switch (i14) {
                                        case 0:
                                            q11Var.a2.setLoading(false);
                                            break;
                                        case 1:
                                            q11 q11Var2 = q11Var;
                                            q11Var2.getClass();
                                            org.telegram.ui.ActionBar.d2 T3 = LaunchActivity.T();
                                            if (T3 != null) {
                                                q11Var2.dismiss();
                                                T3.presentFragment(new ra1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            q11Var.a2.setLoading(false);
                                            break;
                                        default:
                                            q11Var.a2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder3.p();
                            break;
                        }
                    } else if (!"PASSWORD_MISSING".equals(tL_error9.text) && !tL_error9.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error9.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error9.text)) {
                            ConnectionsManager.getInstance(q11Var.a).sendRequest(new TL_account.getPassword(), new co0(q11Var, twoStepVerificationActivity, user3, i10), 8);
                            break;
                        } else if (!tL_error9.text.equals("CHANNELS_TOO_MUCH")) {
                            if (twoStepVerificationActivity != null) {
                                twoStepVerificationActivity.t0();
                                twoStepVerificationActivity.finishFragment();
                            }
                            org.telegram.ui.ActionBar.d2 T3 = LaunchActivity.T();
                            if (T3 != null) {
                                org.telegram.ui.Components.t4.g0(tL_error9, T3, org.telegram.messenger.t3.V(q11Var.Q1), org.telegram.messenger.t3.Y(q11Var.Q1), tL_channels_editCreator);
                                break;
                            }
                        } else if (q11Var.c2 == null || h10.i(org.telegram.messenger.c.a(q11Var.a).a).q()) {
                            org.telegram.ui.ActionBar.d2 T4 = LaunchActivity.T();
                            if (T4 != null) {
                                q11Var.dismiss();
                                T4.presentFragment(new d81(1));
                                break;
                            }
                        } else {
                            org.telegram.ui.ActionBar.d2 T5 = LaunchActivity.T();
                            if (T5 != null) {
                                new vg.i0(5, q11Var.a, q11Var.c2, T5, null);
                                break;
                            }
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.t0();
                        }
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(q11Var.c2);
                        alertDialog$Builder4.a.S = bd.M0(2131751298, null);
                        LinearLayout linearLayout2 = new LinearLayout(q11Var.c2);
                        linearLayout2.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                        linearLayout2.setOrientation(1);
                        alertDialog$Builder4.o(linearLayout2);
                        TextView textView3 = new TextView(q11Var.c2);
                        int i22 = org.telegram.ui.ActionBar.k6.j5;
                        org.telegram.ui.ActionBar.r6.V(textView3, i22, null);
                        textView3.setTextSize(1, 16.0f);
                        textView3.setGravity((bd.a0 ? 5 : 3) | 48);
                        if (org.telegram.messenger.t3.V(q11Var.Q1)) {
                            org.telegram.messenger.k5.r(null, null, 2131751284, new Object[]{l10.j(user3, true)}, textView3);
                        } else {
                            org.telegram.messenger.k5.r(null, null, 2131751302, new Object[]{l10.j(user3, true)}, textView3);
                        }
                        linearLayout2.addView(textView3, mf.o(-1, -2));
                        LinearLayout linearLayout3 = new LinearLayout(q11Var.c2);
                        linearLayout3.setOrientation(0);
                        linearLayout2.addView(linearLayout3, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView = new ImageView(q11Var.c2);
                        imageView.setImageResource(R.drawable.list_circle);
                        imageView.setPadding(bd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), bd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.r6.t(imageView, i22, null, mode);
                        TextView textView4 = new TextView(q11Var.c2);
                        org.telegram.ui.ActionBar.r6.V(textView4, i22, null);
                        textView4.setTextSize(1, 16.0f);
                        textView4.setGravity((bd.a0 ? 5 : 3) | 48);
                        textView4.setText(org.telegram.messenger.g0.X2(bd.M0(2131751301, null)));
                        if (bd.a0) {
                            linearLayout3.addView(textView4, mf.o(-1, -2));
                            linearLayout3.addView(imageView, mf.r(-2, -2, 5));
                        } else {
                            linearLayout3.addView(imageView, mf.o(-2, -2));
                            linearLayout3.addView(textView4, mf.o(-1, -2));
                        }
                        LinearLayout linearLayout4 = new LinearLayout(q11Var.c2);
                        linearLayout4.setOrientation(0);
                        linearLayout2.addView(linearLayout4, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView2 = new ImageView(q11Var.c2);
                        imageView2.setImageResource(R.drawable.list_circle);
                        imageView2.setPadding(bd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), bd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
                        org.telegram.ui.ActionBar.r6.t(imageView2, i22, null, mode);
                        TextView textView5 = new TextView(q11Var.c2);
                        org.telegram.ui.ActionBar.r6.V(textView5, i22, null);
                        textView5.setTextSize(1, 16.0f);
                        textView5.setGravity((bd.a0 ? 5 : 3) | 48);
                        textView5.setText(org.telegram.messenger.g0.X2(bd.M0(2131751300, null)));
                        if (bd.a0) {
                            linearLayout4.addView(textView5, mf.o(-1, -2));
                            i3 = 5;
                            linearLayout4.addView(imageView2, mf.r(-2, -2, 5));
                        } else {
                            i3 = 5;
                            linearLayout4.addView(imageView2, mf.o(-2, -2));
                            linearLayout4.addView(textView5, mf.o(-1, -2));
                        }
                        if ("PASSWORD_MISSING".equals(tL_error9.text)) {
                            final int i23 = 1;
                            alertDialog$Builder4.k(bd.M0(2131751292, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.h11
                                @Override // org.telegram.ui.ActionBar.p1
                                public final void g(org.telegram.ui.ActionBar.s1 s1Var3, int i222) {
                                    switch (i23) {
                                        case 0:
                                            q11Var.a2.setLoading(false);
                                            break;
                                        case 1:
                                            q11 q11Var2 = q11Var;
                                            q11Var2.getClass();
                                            org.telegram.ui.ActionBar.d2 T32 = LaunchActivity.T();
                                            if (T32 != null) {
                                                q11Var2.dismiss();
                                                T32.presentFragment(new ra1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            q11Var.a2.setLoading(false);
                                            break;
                                        default:
                                            q11Var.a2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                            final int i24 = 2;
                            alertDialog$Builder4.h(bd.M0(2131752589, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.h11
                                @Override // org.telegram.ui.ActionBar.p1
                                public final void g(org.telegram.ui.ActionBar.s1 s1Var3, int i222) {
                                    switch (i24) {
                                        case 0:
                                            q11Var.a2.setLoading(false);
                                            break;
                                        case 1:
                                            q11 q11Var2 = q11Var;
                                            q11Var2.getClass();
                                            org.telegram.ui.ActionBar.d2 T32 = LaunchActivity.T();
                                            if (T32 != null) {
                                                q11Var2.dismiss();
                                                T32.presentFragment(new ra1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            q11Var.a2.setLoading(false);
                                            break;
                                        default:
                                            q11Var.a2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                        } else {
                            TextView textView6 = new TextView(q11Var.c2);
                            org.telegram.ui.ActionBar.r6.V(textView6, i22, null);
                            textView6.setTextSize(1, 16.0f);
                            org.telegram.messenger.k5.m(textView6, (bd.a0 ? i3 : 3) | 48, null, 2131751299);
                            linearLayout2.addView(textView6, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            final int i25 = 3;
                            alertDialog$Builder4.h(bd.M0(2131747839, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.h11
                                @Override // org.telegram.ui.ActionBar.p1
                                public final void g(org.telegram.ui.ActionBar.s1 s1Var3, int i222) {
                                    switch (i25) {
                                        case 0:
                                            q11Var.a2.setLoading(false);
                                            break;
                                        case 1:
                                            q11 q11Var2 = q11Var;
                                            q11Var2.getClass();
                                            org.telegram.ui.ActionBar.d2 T32 = LaunchActivity.T();
                                            if (T32 != null) {
                                                q11Var2.dismiss();
                                                T32.presentFragment(new ra1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            q11Var.a2.setLoading(false);
                                            break;
                                        default:
                                            q11Var.a2.setLoading(false);
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
            case 20:
                org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.d;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) this.e;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.b;
                e51 e51Var = (e51) this.f;
                JSONObject jSONObject = (JSONObject) this.h;
                String str8 = (String) this.c;
                if (!c2Var.A(y1Var) || c2Var.j(y1Var)) {
                    c2Var.y(y1Var, h0Var, null, 0, "Request expired or wallet changed", e51Var);
                    break;
                } else {
                    c2Var.y(y1Var, h0Var, jSONObject, jSONObject == null ? 0 : -1, str8, e51Var);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Wallet.c2 c2Var2 = (org.telegram.ui.Wallet.c2) this.d;
                String str9 = (String) this.e;
                byte[] bArr3 = (byte[]) this.b;
                e51 e51Var2 = (e51) this.f;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.c;
                org.telegram.ui.Wallet.k0 k0Var = c2Var2.b;
                if (!TextUtils.equals(str9, k0Var.t()) || !Arrays.equals(bArr3, k0Var.y())) {
                    e51Var2.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                    tonconnectclosesession.session_id = tonconnectsession.id;
                    tonconnectclosesession.body = z1Var.c;
                    c2Var2.f.sendRequestTyped(tonconnectclosesession, new c3.b(i13), new org.telegram.ui.Wallet.d(e51Var2, i11));
                    break;
                }
            case 22:
                a();
                break;
            case 23:
                org.telegram.ui.Wallet.c2 c2Var3 = (org.telegram.ui.Wallet.c2) this.d;
                String str10 = (String) this.e;
                u10 u10Var5 = (u10) this.h;
                org.telegram.ui.Wallet.y1 y1Var2 = (org.telegram.ui.Wallet.y1) this.b;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.f;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.c;
                if (str10 != null) {
                    u10Var5.a(str10);
                    break;
                } else if (!c2Var3.A(y1Var2) || c2Var3.j(y1Var2)) {
                    u10Var5.a("Request expired or wallet changed");
                    break;
                } else {
                    c2Var3.f.sendRequestTyped(sendtransfer, new c3.b(i13), new ci.g3(c2Var3, u10Var5, y1Var2, h0Var2, sendtransfer, 6));
                    break;
                }
                break;
            case 24:
                b();
                break;
            case 25:
                c();
                break;
            case 26:
                e();
                break;
            default:
                org.telegram.ui.web.w0 w0Var2 = (org.telegram.ui.web.w0) this.d;
                File file = (File) this.b;
                org.telegram.ui.ActionBar.s1 s1Var3 = (org.telegram.ui.ActionBar.s1) this.e;
                String str11 = (String) this.f;
                String str12 = (String) this.h;
                String str13 = (String) this.c;
                if (file == null) {
                    s1Var3.c(500L);
                    break;
                } else {
                    int[] iArr3 = new int[11];
                    Utilities.e.c(new iv0(file, iArr3, new ci.s6((cs) w0Var2, (Object) iArr3, (Object) file, (Object) s1Var3, str11, (Object) str12, (Object) str13, 15), i12));
                    break;
                }
        }
    }

    public /* synthetic */ w1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i3) {
        this.a = i3;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
        this.h = obj5;
        this.c = obj6;
    }

    public /* synthetic */ w1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i3, boolean z10) {
        this.a = i3;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.c = obj6;
    }

    public /* synthetic */ w1(kg.w0 w0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, hp hpVar, qr qrVar) {
        this.a = 10;
        this.d = w0Var;
        this.e = str;
        this.c = tL_error;
        this.b = tLObject;
        this.f = hpVar;
        this.h = qrVar;
    }

    public /* synthetic */ w1(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.a = i3;
        this.b = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.c = obj5;
    }

    public /* synthetic */ w1(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.e6 e6Var, gi.d dVar, org.telegram.ui.q6 q6Var, Runnable runnable) {
        this.a = 14;
        this.c = tL_error;
        this.d = context;
        this.e = e6Var;
        this.b = dVar;
        this.f = q6Var;
        this.h = runnable;
    }

    public /* synthetic */ w1(wm wmVar, sf.b bVar, org.telegram.ui.Cells.q1 q1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.a = 13;
        this.d = wmVar;
        this.e = bVar;
        this.f = q1Var;
        this.h = str;
        this.b = tLObject;
        this.c = characterStyle;
    }

    public /* synthetic */ w1(yj0 yj0Var, TLRPC.TL_error tL_error, String str, pj0 pj0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.a = 16;
        this.d = yj0Var;
        this.c = tL_error;
        this.e = str;
        this.f = pj0Var;
        this.b = tLObject;
        this.h = sendverifyphonecode;
    }

    public /* synthetic */ w1(ey0 ey0Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.a = 17;
        this.d = ey0Var;
        this.b = tLObject;
        this.e = charSequence;
        this.c = tL_error;
        this.f = bArr;
        this.h = str;
    }

    public /* synthetic */ w1(q11 q11Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.a = 19;
        this.d = q11Var;
        this.c = tL_error;
        this.e = inputCheckPasswordSRP;
        this.b = user;
        this.f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public /* synthetic */ w1(org.telegram.ui.Wallet.c2 c2Var, String str, u10 u10Var, org.telegram.ui.Wallet.y1 y1Var, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.sendTransfer sendtransfer) {
        this.a = 23;
        this.d = c2Var;
        this.e = str;
        this.h = u10Var;
        this.b = y1Var;
        this.f = h0Var;
        this.c = sendtransfer;
    }

    public /* synthetic */ w1(org.telegram.ui.web.w0 w0Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.a = 26;
        this.d = w0Var;
        this.b = tLObject;
        this.e = tL_messages_requestUrlAuth;
        this.f = str;
        this.c = tL_error;
        this.h = str2;
    }
}
