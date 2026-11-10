package bi;

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
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.v10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.cn;
import org.telegram.ui.d21;
import org.telegram.ui.dh;
import org.telegram.ui.ei0;
import org.telegram.ui.ek0;
import org.telegram.ui.ge;
import org.telegram.ui.ke;
import org.telegram.ui.ny0;
import org.telegram.ui.oe;
import org.telegram.ui.ok0;
import org.telegram.ui.oo0;
import org.telegram.ui.p81;
import org.telegram.ui.ry0;
import org.telegram.ui.sy0;
import org.telegram.ui.vj0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ a3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    private final void a() {
        org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.b;
        String str = (String) this.c;
        c20 c20Var = (c20) this.e;
        org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.f;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.h;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.d;
        if (str != null) {
            c20Var.a(str);
        } else if (!d2Var.A(z1Var) || d2Var.j(z1Var)) {
            c20Var.a("Request expired or wallet changed");
        } else {
            d2Var.f.sendRequestTyped(sendtransfer, new d3.b(1), new t3(d2Var, c20Var, z1Var, i0Var, sendtransfer, 6));
        }
    }

    private final void b() {
        org.telegram.ui.Wallet.s2 s2Var = (org.telegram.ui.Wallet.s2) this.b;
        int[] iArr = (int[]) this.c;
        TextView textView = (TextView) this.e;
        org.telegram.ui.Wallet.h7 h7Var = (org.telegram.ui.Wallet.h7) this.f;
        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.h;
        org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.d;
        if (s2Var.e || s2Var.d) {
            return;
        }
        iArr[0] = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        spannableStringBuilder.setSpan(new b80(org.telegram.messenger.g0.L(80.0f), textView), 0, spannableStringBuilder.length(), 33);
        textView.setText(org.telegram.messenger.id.V(null, null, 2131743120, spannableStringBuilder));
        h7Var.run();
        WalletEngine2 walletEngine2 = l0Var.b;
        if (walletEngine2 != null) {
            walletEngine2.previewTonConnect(c2Var, new org.telegram.ui.Wallet.d1(s2Var, iArr, l0Var, textView, c2Var, h7Var, 4));
            return;
        }
        iArr[0] = 3;
        textView.setText(org.telegram.messenger.id.M0(2131742986, null));
        h7Var.run();
    }

    private final void c() {
        org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
        String str = (String) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.h6 h6Var = x0Var.e;
        if (tLObject == null) {
            if (tL_error != null) {
                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    new org.telegram.ui.Components.gc(x0Var, h6Var).I(R.raw.error, org.telegram.messenger.id.M0(2131753128, null), org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.uj, h6Var), org.telegram.messenger.id.a0(null, null, 2131753130, str2))).j();
                    return;
                } else {
                    new org.telegram.ui.Components.gc(x0Var, h6Var).f0(tL_error, false);
                    return;
                }
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
            ei0.b(false, x0Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, x0Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
            ei0.b(false, x0Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, x0Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
            org.telegram.ui.Components.u4.m0(x0Var.getContext(), str, false, true, true, false, 0L, null, null, null);
        }
    }

    private final void d() {
        org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.b;
        File file = (File) this.c;
        org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.e;
        String str = (String) this.f;
        String str2 = (String) this.h;
        String str3 = (String) this.d;
        if (file == null) {
            u1Var.c(500L);
            return;
        }
        int[] iArr = new int[11];
        Utilities.e.c(new r31(file, iArr, new r7((ls) x0Var, (Object) iArr, (Object) file, (Object) u1Var, str, (Object) str2, (Object) str3, 15), 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:282:0x07ac, code lost:
    
        if (r4.admin_rights.manage_call != false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x07e5, code lost:
    
        if (r1.creator != false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x07e1, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L279;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        org.telegram.ui.ActionBar.f2 T;
        TLRPC.User user;
        String str;
        TLRPC.ChatParticipants chatParticipants;
        boolean z9;
        String str2;
        ny0 ny0Var;
        ny0 ny0Var2;
        fi.d dVar;
        int i7;
        int i10 = this.a;
        int i11 = 7;
        int i12 = 3;
        int i13 = 1;
        Object obj = this.d;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.c;
        Object obj5 = this.e;
        Object obj6 = this.b;
        final int i14 = 0;
        switch (i10) {
            case 0:
                k7 k7Var = (k7) obj6;
                TLObject tLObject = (TLObject) obj4;
                wg.f1[] f1VarArr = (wg.f1[]) obj5;
                Long l10 = (Long) obj3;
                aa.s sVar = (aa.s) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tLObject instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                    qp.s1(k7Var.a).Y3(tL_users_userFull.users, false);
                    qp.s1(k7Var.a).S3(tL_users_userFull.chats, false);
                    TLRPC.UserFull userFull = tL_users_userFull.full_user;
                    if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                        org.telegram.messenger.camera.q.s(org.telegram.messenger.id.a0(null, null, 2131743742, org.telegram.messenger.m5.t(l10.longValue())), new org.telegram.ui.Components.gc(f1VarArr[0].c, k7Var.I0), R.raw.error, 36);
                        break;
                    } else {
                        sVar.run();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.bc Y = k7Var.k().Y(tL_error);
                    Y.t = true;
                    Y.j();
                    break;
                }
                break;
            case 1:
                final k7 k7Var2 = (k7) obj6;
                TLObject tLObject2 = (TLObject) obj4;
                final CharSequence charSequence = (CharSequence) obj5;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                final TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject2 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                    ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
                    int size = arrayList.size();
                    final long j3 = 0;
                    int i15 = 0;
                    while (i15 < size) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i15);
                        i15++;
                        j3 += tL_labeledPrice.amount;
                    }
                    LinearLayout linearLayout = new LinearLayout(k7Var2.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
                    TextView b10 = c8.qa.b(k7Var2.getContext(), 16.0f, org.telegram.ui.ActionBar.m6.j5, false, null);
                    b10.setText(org.telegram.messenger.id.M0(2131750041, null));
                    linearLayout.addView(b10, c8.ha.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                    tx0 tx0Var = new tx0(k7Var2.getContext(), k7Var2.I0);
                    rx0 a10 = tx0Var.a(charSequence);
                    a10.setFilled(true);
                    xh.l lVar = (xh.l) a10.getChildAt(0);
                    lVar.setTextSize(1, 12.0f);
                    lVar.setGravity(17);
                    linearLayout.addView(tx0Var, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k7Var2.getContext(), k7Var2.I0);
                    alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131750040, null);
                    alertDialog$Builder.o(linearLayout);
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    alertDialog$Builder.k(dd.T0(org.telegram.messenger.id.a0(null, null, 2131750042, Integer.valueOf((int) j3))), new org.telegram.ui.ActionBar.r1() { // from class: bi.x3
                        @Override // org.telegram.ui.ActionBar.r1
                        public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i16) {
                            vf.b h = u1Var.h(-1, true, true);
                            h.d();
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = paymentForm.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
                            k7 k7Var3 = k7.this;
                            ConnectionsManager.getInstance(k7Var3.a).sendRequest(tL_payments_sendStarsForm, new g4(k7Var3, h, u1Var, tL_starGiftUnique, j3, charSequence));
                        }
                    });
                    alertDialog$Builder.p();
                    break;
                } else if (tL_error2 != null) {
                    k7Var2.k().f0(tL_error2, false);
                    break;
                }
                break;
            case 2:
                ea eaVar = (ea) obj6;
                List list = (List) obj4;
                org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) obj5;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) obj3;
                f5.f fVar = (f5.f) obj2;
                Activity activity = (Activity) obj;
                if (list.isEmpty()) {
                    org.telegram.messenger.g0.h3(new b8(t1Var, i14));
                    break;
                } else {
                    f5.l lVar2 = (f5.l) list.get(0);
                    if (lVar2.a() == null) {
                        org.telegram.messenger.g0.h3(new b8(t1Var, 1));
                        break;
                    } else {
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
                        ConnectionsManager.getInstance(eaVar.a).sendRequest(tL_payments_canPurchaseStore, new c8(lVar2, fVar, t1Var, activity, tL_inputStorePaymentStarsGiveaway, list, 0));
                        break;
                    }
                }
            case 3:
                ((boolean[]) obj4)[0] = true;
                ((ea) obj6).Z((ij) obj5, (TLRPC.InputInvoice) obj3, (TLRPC.TL_payments_paymentFormStars) obj2, new n2((c20) obj, 1));
                break;
            case 4:
                ea eaVar2 = (ea) obj6;
                TLObject tLObject3 = (TLObject) obj4;
                ij ijVar = (ij) obj5;
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) obj3;
                dh dhVar = (dh) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                    eaVar2.X(ijVar, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject3, dhVar, null);
                } else {
                    ea.e(tL_error3 == null ? "NO_PAYMENT_FORM" : tL_error3.text);
                }
                dhVar.run();
                break;
            case 5:
                ea eaVar3 = (ea) obj6;
                Runnable runnable = (Runnable) obj4;
                ij ijVar2 = (ij) obj5;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) obj2;
                c20 c20Var = (c20) obj;
                if (eaVar3.e) {
                    eaVar3.X(ijVar2, inputInvoice, tL_payments_paymentFormStars, runnable, c20Var);
                    break;
                } else {
                    ea.e("NO_BALANCE");
                    runnable.run();
                    break;
                }
            case 6:
                t9 t9Var = (t9) obj6;
                TLObject tLObject4 = (TLObject) obj4;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj5;
                v9 v9Var = (v9) obj3;
                c20 c20Var2 = (c20) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                long j10 = t9Var.b;
                int i16 = t9Var.a;
                HashMap hashMap = t9Var.h;
                ArrayList arrayList2 = t9Var.e;
                t9Var.k = false;
                if (tLObject4 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject4;
                    arrayList2.remove(tL_starGiftCollection);
                    arrayList2.add(tL_starGiftCollection2);
                    hashMap.remove(-1);
                    int i17 = tL_starGiftCollection2.collection_id;
                    v9Var.d = i17;
                    hashMap.put(Integer.valueOf(i17), v9Var);
                    t9Var.j();
                    qs.f(i16).k(qs.H3, Long.valueOf(j10), t9Var);
                    c20Var2.a(tL_starGiftCollection2);
                    break;
                } else {
                    if (tL_error4 != null && (T = LaunchActivity.T()) != null) {
                        org.telegram.ui.Components.gc.a0(T).f0(tL_error4, false);
                    }
                    arrayList2.remove(tL_starGiftCollection);
                    hashMap.remove(-1);
                    t9Var.j();
                    qs.f(i16).k(qs.H3, Long.valueOf(j10), t9Var);
                    break;
                }
            case 7:
                di.r6 r6Var = (di.r6) obj6;
                ArrayList arrayList3 = (ArrayList) obj4;
                HashSet hashSet = (HashSet) obj;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                sb2.append(r6Var.e);
                sb2.append("{");
                sb2.append(r6Var.d);
                sb2.append("} preloadCache {");
                sb2.append(di.z6.a(arrayList3));
                org.telegram.ui.Cells.f1.u("}", sb2);
                ArrayList arrayList4 = r6Var.g;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj5);
                r6Var.t = false;
                int i18 = r6Var.c;
                qp.s1(i18).Y3((ArrayList) obj3, true);
                qp.s1(i18).S3((ArrayList) obj2, true);
                if (r6Var.v) {
                    r6Var.v = false;
                    r6Var.y = null;
                    r6Var.j();
                    break;
                } else {
                    r6Var.m.addAll(hashSet);
                    r6Var.k.clear();
                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                        r6Var.t((ij) arrayList3.get(i19), true);
                    }
                    r6Var.d(false);
                    di.q6 q6Var = r6Var.y;
                    if (q6Var != null) {
                        q6Var.a(0);
                        r6Var.y = null;
                    }
                    qs.f(i18).k(qs.x5, r6Var);
                    break;
                }
            case 8:
                TLObject tLObject5 = (TLObject) obj4;
                qp qpVar = (qp) obj5;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                fi.pb pbVar = (fi.pb) obj2;
                fi.nb nbVar = (fi.nb) obj;
                ((int[]) obj6)[0] = 0;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    qpVar.Y3(tL_contacts_resolvedPeer.users, false);
                    qpVar.S3(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User a22 = qpVar.a2(Long.valueOf(org.telegram.messenger.m5.o(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = a22;
                    if (a22 != null) {
                        pbVar.run();
                        break;
                    }
                }
                nbVar.a(null);
                break;
            case 9:
                String str3 = (String) obj5;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                TLObject tLObject6 = (TLObject) obj4;
                qp qpVar2 = (qp) obj3;
                yr yrVar = (yr) obj2;
                jg.i1 i1Var = ((jg.z0) obj6).e;
                String str4 = i1Var.q0;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error5 == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject6;
                        if (!tL_contacts_resolvedPeer2.users.isEmpty()) {
                            TLRPC.User user2 = tL_contacts_resolvedPeer2.users.get(0);
                            qpVar2.X3(user2, false, false);
                            yrVar.m1(tL_contacts_resolvedPeer2.users, null, true, true);
                            user = user2;
                            i1Var.R(user);
                            i1Var.t0 = 0;
                            break;
                        }
                    }
                    user = null;
                    i1Var.R(user);
                    i1Var.t0 = 0;
                }
                break;
            case 10:
                TLObject tLObject7 = (TLObject) obj4;
                String[] strArr = (String[]) obj6;
                final FrameLayout frameLayout = (FrameLayout) obj5;
                final w70 w70Var = (w70) obj3;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (tLObject7 instanceof TL_phone.exportedGroupCallInvite) {
                    final String str5 = ((TL_phone.exportedGroupCallInvite) tLObject7).link;
                    strArr[0] = str5;
                    if (str5.startsWith("https://")) {
                        str5 = str5.substring(8);
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.i8
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
                                w70Var.setText(str5);
                            }
                        }
                    });
                    duration.addListener(new org.telegram.ui.a9(atomicBoolean, w70Var, str5));
                    duration.start();
                    new org.telegram.ui.Components.gc(w2Var.E, h6Var).I(R.raw.linkbroken, org.telegram.messenger.id.M0(2131749475, null), org.telegram.messenger.id.M0(2131749476, null)).j();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.mb mbVar = (org.telegram.ui.mb) obj6;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj4;
                ArrayList arrayList5 = (ArrayList) obj5;
                ArrayList arrayList6 = (ArrayList) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                org.telegram.ui.ua uaVar = (org.telegram.ui.ua) obj;
                TLRPC.Chat chat = mbVar.f;
                mbVar.Z = channelParticipant;
                if (channelParticipant != null) {
                    if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                        if (org.telegram.messenger.t3.T(chat)) {
                            qp messagesController = mbVar.getMessagesController();
                            long j11 = channelParticipant.peer.user_id;
                            a0.h hVar = (a0.h) messagesController.x1.f(chat.id);
                            TLRPC.ChannelParticipant channelParticipant2 = hVar == null ? null : (TLRPC.ChannelParticipant) hVar.f(j11);
                            if (channelParticipant2 != null) {
                                if (!(channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) {
                                    break;
                                }
                                break;
                            }
                        } else {
                            TLRPC.ChatFull N0 = mbVar.getMessagesController().N0(chat.id);
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
                        org.telegram.ui.Cells.f1.t(null, 2131746063, arrayList5, R.drawable.msg_block2, arrayList6);
                        arrayList7.add(33);
                    } else {
                        str = null;
                    }
                    org.telegram.ui.Cells.f1.t(str, 2131753729, arrayList5, R.drawable.msg_block, arrayList6);
                    arrayList7.add(35);
                }
                uaVar.run();
                break;
            case 12:
                cn cnVar = (cn) obj6;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                TLObject tLObject8 = (TLObject) obj4;
                CharacterStyle characterStyle = (CharacterStyle) obj;
                ((vf.b) obj5).b();
                k60 I = k60.I(cnVar, q1Var);
                jk0 jk0Var = new jk0(cnVar.getParentActivity(), cnVar.za);
                I.p = new ge(jk0Var, i14);
                I.c(R.drawable.msg_copy, org.telegram.messenger.id.M0(2131751766, null), new ke(cnVar, jk0Var, (String) obj2, 2), false);
                if (tLObject8 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject8;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList8 = tL_payments_bankCardData.open_urls;
                    int size3 = arrayList8.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList8.get(i20);
                        i20++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        I.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new oe(8, cnVar, tL_bankCardOpenUrl2), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        I.k();
                        I.p(13, org.telegram.messenger.g0.L(200.0f), tL_payments_bankCardData.title);
                    }
                }
                jk0Var.e(I);
                jk0Var.f(q1Var, characterStyle, null, false);
                cnVar.showDialog(jk0Var);
                break;
            case 13:
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                Context context = (Context) obj6;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj4;
                fi.d dVar2 = (fi.d) obj5;
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) obj3;
                Runnable runnable2 = (Runnable) obj2;
                if (tL_error6 != null) {
                    new org.telegram.ui.Components.gc(org.telegram.ui.Components.wa.a(context), h6Var2).f0(tL_error6, false);
                    break;
                } else {
                    dVar2.setLoading(false);
                    p6Var.dismiss();
                    org.telegram.messenger.k5.o(null, 2131746953, new org.telegram.ui.Components.gc(org.telegram.ui.Components.wa.a(context), h6Var2), R.raw.chats_infotip, 36);
                    runnable2.run();
                    break;
                }
            case 14:
                yv0 yv0Var = (yv0) obj6;
                TLObject tLObject9 = (TLObject) obj4;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj5;
                TextView textView = (TextView) obj3;
                TextView textView2 = (TextView) obj2;
                int[] iArr = (int[]) obj;
                yv0Var.getClass();
                if (!(tLObject9 instanceof TLRPC.TL_stickers_suggestedShortName) || (str2 = ((TLRPC.TL_stickers_suggestedShortName) tLObject9).short_name) == null) {
                    z9 = false;
                } else {
                    editTextBoldCursor.setText(str2);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    yv0Var.K0(textView, editTextBoldCursor.getText().toString(), true);
                    z9 = true;
                }
                textView2.setVisibility(0);
                editTextBoldCursor.setPadding(textView2.getMeasuredWidth(), org.telegram.messenger.g0.L(4.0f), 0, 0);
                if (!z9) {
                    editTextBoldCursor.setText("");
                }
                iArr[0] = 2;
                break;
            case 15:
                ek0.b0((ek0) obj6, (TLRPC.TL_error) obj, (String) obj5, (vj0) obj3, (TLObject) obj4, (TL_account.sendVerifyPhoneCode) obj2);
                break;
            case 16:
                sy0 sy0Var = (sy0) obj6;
                TLObject tLObject10 = (TLObject) obj4;
                CharSequence charSequence2 = (CharSequence) obj5;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                byte[] bArr = (byte[]) obj3;
                String str6 = (String) obj2;
                fi.g1 g1Var = sy0Var.l1;
                if ((g1Var.getCurrentView() instanceof ry0) && (dVar = ((ry0) g1Var.getCurrentView()).s) != null) {
                    dVar.setLoading(false);
                }
                if (tLObject10 != null) {
                    boolean z10 = tLObject10 instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
                    if (!z10 && !(tLObject10 instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject10 instanceof TLRPC.TL_reportResultAddComment)) {
                        if (tLObject10 instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            qp.s1(sy0Var.a).o0(false);
                            ny0 ny0Var3 = sy0Var.u1;
                            if (ny0Var3 != null) {
                                ny0Var3.d();
                                sy0Var.dismiss();
                                break;
                            }
                        } else if (((tLObject10 instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject10 instanceof TLRPC.TL_reportResultReported)) && (ny0Var2 = sy0Var.u1) != null) {
                            ny0Var2.a();
                            sy0Var.dismiss();
                            break;
                        }
                    } else {
                        g1Var.E(g1Var.b + 1);
                        ry0 ry0Var = (ry0) g1Var.getViewPages()[1];
                        if (ry0Var != null) {
                            r41 r41Var = ry0Var.f;
                            if (tLObject10 instanceof TLRPC.TL_reportResultChooseOption) {
                                ry0Var.b = null;
                                ry0Var.c = (TLRPC.TL_reportResultChooseOption) tLObject10;
                                ry0Var.d = null;
                                r41Var.f3.O(false);
                            } else if (tLObject10 instanceof TLRPC.TL_reportResultAddComment) {
                                ry0Var.b((TLRPC.TL_reportResultAddComment) tLObject10);
                            } else if (z10) {
                                ry0Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject10;
                                ry0Var.c = null;
                                ry0Var.d = null;
                                r41Var.f3.O(false);
                            }
                            if (charSequence2 != null) {
                                m5 m5Var = ry0Var.h;
                                ((TextView) m5Var.c).setText(charSequence2);
                                ((TextView) m5Var.c).getText();
                                m5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), TLObject.FLAG_31));
                                if (r41Var != null) {
                                    r41Var.f3.O(true);
                                    break;
                                }
                            }
                        }
                    }
                } else if (tL_error7 != null) {
                    if (!sy0Var.o1 && "MESSAGE_ID_REQUIRED".equals(tL_error7.text)) {
                        long j12 = sy0Var.t1;
                        String charSequence3 = charSequence2.toString();
                        int i21 = cn.kd;
                        org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                        if (T2 != null) {
                            Bundle bundle = new Bundle();
                            if (org.telegram.messenger.m5.E(j12)) {
                                bundle.putLong("user_id", j12);
                            } else {
                                bundle.putLong("chat_id", -j12);
                            }
                            bundle.putString("reportTitle", charSequence3);
                            bundle.putByteArray("reportOption", bArr);
                            bundle.putString("reportMessage", str6);
                            T2.presentFragment(new cn(bundle));
                        }
                    } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error7.text)) {
                        ny0 ny0Var4 = sy0Var.u1;
                        if (ny0Var4 != null) {
                            ny0Var4.g();
                        }
                    } else if ("AD_EXPIRED".equals(tL_error7.text) && (ny0Var = sy0Var.u1) != null) {
                        ny0Var.a();
                    }
                    sy0Var.dismiss();
                    break;
                }
                break;
            case 17:
                Context context2 = (Context) obj6;
                org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) obj5;
                sy0 sy0Var2 = new sy0(context2, h6Var3, 0L, (byte[]) obj3);
                sy0Var2.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) obj4));
                sy0Var2.u1 = new ui.e((org.telegram.ui.ActionBar.f2) obj2, context2, h6Var3, (r80) obj, false, 10);
                sy0Var2.show();
                break;
            case 18:
                final d21 d21Var = (d21) obj6;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj4;
                TLRPC.User user3 = (TLRPC.User) obj5;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj3;
                TLRPC.TL_channels_editCreator tL_channels_editCreator = (TLRPC.TL_channels_editCreator) obj2;
                if (tL_error8 == null) {
                    if (inputCheckPasswordSRP != null) {
                        bg.m0 m0Var = d21Var.U1;
                        if (m0Var != null) {
                            m0Var.run();
                        }
                        d21Var.dismiss();
                        twoStepVerificationActivity.t0();
                        twoStepVerificationActivity.finishFragment();
                        break;
                    }
                } else if (d21Var.e2 != null) {
                    if ("PASSWORD_HASH_INVALID".equals(tL_error8.text)) {
                        if (inputCheckPasswordSRP == null) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(d21Var.e2);
                            String M0 = org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(d21Var.S1) ? 2131751322 : 2131751315, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.a;
                            u1Var.R = M0;
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131751292, d21Var.S1.title, t10.j(user3, true)));
                            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751296, null), new ok0(14, d21Var, user3));
                            alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.u11
                                @Override // org.telegram.ui.ActionBar.r1
                                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i22) {
                                    switch (i14) {
                                        case 0:
                                            d21Var.c2.setLoading(false);
                                            break;
                                        case 1:
                                            d21 d21Var2 = d21Var;
                                            d21Var2.getClass();
                                            org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                                            if (T3 != null) {
                                                d21Var2.dismiss();
                                                T3.presentFragment(new cb1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            d21Var.c2.setLoading(false);
                                            break;
                                        default:
                                            d21Var.c2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder2.p();
                            break;
                        }
                    } else if (!"PASSWORD_MISSING".equals(tL_error8.text) && !tL_error8.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error8.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error8.text)) {
                            ConnectionsManager.getInstance(d21Var.a).sendRequest(new TL_account.getPassword(), new oo0(d21Var, twoStepVerificationActivity, user3, i11), 8);
                            break;
                        } else if (!tL_error8.text.equals("CHANNELS_TOO_MUCH")) {
                            if (twoStepVerificationActivity != null) {
                                twoStepVerificationActivity.t0();
                                twoStepVerificationActivity.finishFragment();
                            }
                            org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                            if (T3 != null) {
                                org.telegram.ui.Components.u4.e0(tL_error8, T3, org.telegram.messenger.t3.V(d21Var.S1), org.telegram.messenger.t3.Y(d21Var.S1), tL_channels_editCreator);
                                break;
                            }
                        } else if (d21Var.e2 == null || p10.i(org.telegram.messenger.c.a(d21Var.a).a).q()) {
                            org.telegram.ui.ActionBar.f2 T4 = LaunchActivity.T();
                            if (T4 != null) {
                                d21Var.dismiss();
                                T4.presentFragment(new p81(1));
                                break;
                            }
                        } else {
                            org.telegram.ui.ActionBar.f2 T5 = LaunchActivity.T();
                            if (T5 != null) {
                                new ug.i0(5, d21Var.a, d21Var.e2, T5, null);
                                break;
                            }
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.t0();
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(d21Var.e2);
                        alertDialog$Builder3.a.R = org.telegram.messenger.id.M0(2131751297, null);
                        LinearLayout linearLayout2 = new LinearLayout(d21Var.e2);
                        linearLayout2.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                        linearLayout2.setOrientation(1);
                        alertDialog$Builder3.o(linearLayout2);
                        TextView textView3 = new TextView(d21Var.e2);
                        int i22 = org.telegram.ui.ActionBar.m6.j5;
                        org.telegram.ui.ActionBar.t6.U(textView3, i22, null);
                        textView3.setTextSize(1, 16.0f);
                        textView3.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
                        if (org.telegram.messenger.t3.V(d21Var.S1)) {
                            org.telegram.messenger.k5.r(null, null, 2131751283, new Object[]{t10.j(user3, true)}, textView3);
                        } else {
                            org.telegram.messenger.k5.r(null, null, 2131751301, new Object[]{t10.j(user3, true)}, textView3);
                        }
                        linearLayout2.addView(textView3, c8.ha.o(-1, -2));
                        LinearLayout linearLayout3 = new LinearLayout(d21Var.e2);
                        linearLayout3.setOrientation(0);
                        linearLayout2.addView(linearLayout3, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView = new ImageView(d21Var.e2);
                        imageView.setImageResource(R.drawable.list_circle);
                        imageView.setPadding(org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.t6.s(imageView, i22, null, mode);
                        TextView textView4 = new TextView(d21Var.e2);
                        org.telegram.ui.ActionBar.t6.U(textView4, i22, null);
                        textView4.setTextSize(1, 16.0f);
                        textView4.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
                        textView4.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131751300, null)));
                        if (org.telegram.messenger.id.a0) {
                            linearLayout3.addView(textView4, c8.ha.o(-1, -2));
                            linearLayout3.addView(imageView, c8.ha.r(-2, -2, 5));
                        } else {
                            linearLayout3.addView(imageView, c8.ha.o(-2, -2));
                            linearLayout3.addView(textView4, c8.ha.o(-1, -2));
                        }
                        LinearLayout linearLayout4 = new LinearLayout(d21Var.e2);
                        linearLayout4.setOrientation(0);
                        linearLayout2.addView(linearLayout4, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView2 = new ImageView(d21Var.e2);
                        imageView2.setImageResource(R.drawable.list_circle);
                        imageView2.setPadding(org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
                        org.telegram.ui.ActionBar.t6.s(imageView2, i22, null, mode);
                        TextView textView5 = new TextView(d21Var.e2);
                        org.telegram.ui.ActionBar.t6.U(textView5, i22, null);
                        textView5.setTextSize(1, 16.0f);
                        textView5.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
                        textView5.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131751299, null)));
                        if (org.telegram.messenger.id.a0) {
                            linearLayout4.addView(textView5, c8.ha.o(-1, -2));
                            i7 = 5;
                            linearLayout4.addView(imageView2, c8.ha.r(-2, -2, 5));
                        } else {
                            i7 = 5;
                            linearLayout4.addView(imageView2, c8.ha.o(-2, -2));
                            linearLayout4.addView(textView5, c8.ha.o(-1, -2));
                        }
                        if ("PASSWORD_MISSING".equals(tL_error8.text)) {
                            final int i23 = 1;
                            alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131751291, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.u11
                                @Override // org.telegram.ui.ActionBar.r1
                                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i222) {
                                    switch (i23) {
                                        case 0:
                                            d21Var.c2.setLoading(false);
                                            break;
                                        case 1:
                                            d21 d21Var2 = d21Var;
                                            d21Var2.getClass();
                                            org.telegram.ui.ActionBar.f2 T32 = LaunchActivity.T();
                                            if (T32 != null) {
                                                d21Var2.dismiss();
                                                T32.presentFragment(new cb1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            d21Var.c2.setLoading(false);
                                            break;
                                        default:
                                            d21Var.c2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                            final int i24 = 2;
                            alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.u11
                                @Override // org.telegram.ui.ActionBar.r1
                                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i222) {
                                    switch (i24) {
                                        case 0:
                                            d21Var.c2.setLoading(false);
                                            break;
                                        case 1:
                                            d21 d21Var2 = d21Var;
                                            d21Var2.getClass();
                                            org.telegram.ui.ActionBar.f2 T32 = LaunchActivity.T();
                                            if (T32 != null) {
                                                d21Var2.dismiss();
                                                T32.presentFragment(new cb1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            d21Var.c2.setLoading(false);
                                            break;
                                        default:
                                            d21Var.c2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                        } else {
                            TextView textView6 = new TextView(d21Var.e2);
                            org.telegram.ui.ActionBar.t6.U(textView6, i22, null);
                            textView6.setTextSize(1, 16.0f);
                            org.telegram.messenger.k5.m(textView6, (org.telegram.messenger.id.a0 ? i7 : 3) | 48, null, 2131751298);
                            linearLayout2.addView(textView6, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            final int i25 = 3;
                            alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131747831, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.u11
                                @Override // org.telegram.ui.ActionBar.r1
                                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i222) {
                                    switch (i25) {
                                        case 0:
                                            d21Var.c2.setLoading(false);
                                            break;
                                        case 1:
                                            d21 d21Var2 = d21Var;
                                            d21Var2.getClass();
                                            org.telegram.ui.ActionBar.f2 T32 = LaunchActivity.T();
                                            if (T32 != null) {
                                                d21Var2.dismiss();
                                                T32.presentFragment(new cb1(6, null));
                                                break;
                                            }
                                            break;
                                        case 2:
                                            d21Var.c2.setLoading(false);
                                            break;
                                        default:
                                            d21Var.c2.setLoading(false);
                                            break;
                                    }
                                }
                            });
                        }
                        alertDialog$Builder3.p();
                        break;
                    }
                }
                break;
            case 19:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj6;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj4;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj5;
                org.telegram.ui.Wallet.s sVar2 = (org.telegram.ui.Wallet.s) obj3;
                JSONObject jSONObject = (JSONObject) obj2;
                String str7 = (String) obj;
                if (!d2Var.A(z1Var) || d2Var.j(z1Var)) {
                    d2Var.y(z1Var, i0Var, null, 0, "Request expired or wallet changed", sVar2);
                    break;
                } else {
                    d2Var.y(z1Var, i0Var, jSONObject, jSONObject == null ? 0 : -1, str7, sVar2);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) obj6;
                byte[] bArr2 = (byte[]) obj5;
                org.telegram.ui.Wallet.s sVar3 = (org.telegram.ui.Wallet.s) obj3;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj2;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj;
                org.telegram.ui.Wallet.l0 l0Var = d2Var2.b;
                if (!TextUtils.equals((String) obj4, l0Var.t()) || !Arrays.equals(bArr2, l0Var.y())) {
                    sVar3.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                    tonconnectclosesession.session_id = tonconnectsession.id;
                    tonconnectclosesession.body = a2Var.c;
                    d2Var2.f.sendRequestTyped(tonconnectclosesession, new d3.b(i13), new org.telegram.ui.Wallet.d(sVar3, i12));
                    break;
                }
            case 21:
                byte[] bArr3 = (byte[]) obj5;
                org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) obj3;
                byte[] bArr4 = a2Var2.b;
                org.telegram.ui.Wallet.t1 t1Var2 = (org.telegram.ui.Wallet.t1) obj2;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                org.telegram.ui.Wallet.l0 l0Var2 = ((org.telegram.ui.Wallet.d2) obj6).b;
                if (!TextUtils.equals((String) obj4, l0Var2.t()) || !Arrays.equals(bArr3, l0Var2.y())) {
                    Arrays.fill(bArr4, (byte) 0);
                    t1Var2.a(null, "Wallet changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
                    inputtonconnectoauthsession.session_id = tonconnectsession2.id;
                    inputtonconnectoauthsession.challenge_answer = bArr4;
                    inputtonconnectoauthsession.body = a2Var2.c;
                    inputtonconnectoauthsession.proof = a2Var2.d;
                    t1Var2.a(inputtonconnectoauthsession, null);
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
                ((WalletEngine2) obj6).lambda$prepareSendNFT$26((String) obj4, (String) obj5, (String) obj3, (byte[]) obj2, (v10) obj);
                break;
            case 25:
                c();
                break;
            case 26:
                d();
                break;
            default:
                final zh.g1 g1Var2 = (zh.g1) obj6;
                TLObject tLObject11 = (TLObject) obj4;
                ub ubVar = (ub) obj3;
                final c20 c20Var3 = (c20) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                ((org.telegram.ui.ActionBar.u1) obj5).dismiss();
                if (tLObject11 instanceof TL_stars.checkCanSendGiftResultOk) {
                    ubVar.run();
                    break;
                } else if (tLObject11 instanceof TL_stars.checkCanSendGiftResultFail) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, g1Var2.getContext(), g1Var2.I0);
                    String M02 = org.telegram.messenger.id.M0(2131749752, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder4.a;
                    u1Var2.R = M02;
                    u1Var2.T = ij.h0(((TL_stars.checkCanSendGiftResultFail) tLObject11).reason, false);
                    alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131747831, null), null);
                    final org.telegram.ui.ActionBar.u1 p10 = alertDialog$Builder4.p();
                    final lt ltVar = p10.n;
                    if (ltVar != null) {
                        ltVar.setOnLinkPressListener(new v70() { // from class: zh.n0
                            @Override // org.telegram.ui.Components.v70
                            public final void a(ClickableSpan clickableSpan) {
                                g1 g1Var3 = g1.this;
                                g1Var3.getClass();
                                p10.dismiss();
                                c20 c20Var4 = c20Var3;
                                if (c20Var4 != null) {
                                    c20Var4.a(Boolean.FALSE);
                                }
                                g1Var3.dismiss();
                                clickableSpan.onClick(ltVar);
                            }
                        });
                        break;
                    }
                } else if (tL_error9 != null) {
                    new org.telegram.ui.Components.gc(g1Var2.c, g1Var2.I0).f0(tL_error9, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a3(jg.z0 z0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, qp qpVar, yr yrVar) {
        this.a = 9;
        this.b = z0Var;
        this.e = str;
        this.d = tL_error;
        this.c = tLObject;
        this.f = qpVar;
        this.h = yrVar;
    }

    public /* synthetic */ a3(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.c = tLObject;
        this.b = obj;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    public /* synthetic */ a3(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.h6 h6Var, fi.d dVar, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.a = 13;
        this.d = tL_error;
        this.b = context;
        this.c = h6Var;
        this.e = dVar;
        this.f = p6Var;
        this.h = runnable;
    }

    public /* synthetic */ a3(cn cnVar, vf.b bVar, org.telegram.ui.Cells.q1 q1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.a = 12;
        this.b = cnVar;
        this.e = bVar;
        this.f = q1Var;
        this.h = str;
        this.c = tLObject;
        this.d = characterStyle;
    }

    public /* synthetic */ a3(ek0 ek0Var, TLRPC.TL_error tL_error, String str, vj0 vj0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.a = 15;
        this.b = ek0Var;
        this.d = tL_error;
        this.e = str;
        this.f = vj0Var;
        this.c = tLObject;
        this.h = sendverifyphonecode;
    }

    public /* synthetic */ a3(sy0 sy0Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.a = 16;
        this.b = sy0Var;
        this.c = tLObject;
        this.e = charSequence;
        this.d = tL_error;
        this.f = bArr;
        this.h = str;
    }

    public /* synthetic */ a3(d21 d21Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.a = 18;
        this.b = d21Var;
        this.d = tL_error;
        this.c = inputCheckPasswordSRP;
        this.e = user;
        this.f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public /* synthetic */ a3(org.telegram.ui.web.x0 x0Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.a = 25;
        this.b = x0Var;
        this.c = tLObject;
        this.e = tL_messages_requestUrlAuth;
        this.f = str;
        this.d = tL_error;
        this.h = str2;
    }

    public /* synthetic */ a3(zh.g1 g1Var, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, ub ubVar, c20 c20Var, TLRPC.TL_error tL_error) {
        this.a = 27;
        this.b = g1Var;
        this.e = u1Var;
        this.c = tLObject;
        this.f = ubVar;
        this.h = c20Var;
        this.d = tL_error;
    }
}
