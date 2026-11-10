package bi;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ z1(k7 k7Var, int i7) {
        this.a = i7;
        this.b = k7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0337, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0339, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x034d, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0438  */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v16 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        boolean z9;
        String str;
        boolean z10;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        int i10;
        int i11;
        g7 g7Var;
        ?? r13;
        String G;
        int i12;
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        n6 n6Var;
        String str2;
        int i13 = this.a;
        int i14 = 4;
        int i15 = 0;
        long j3 = 0;
        k7 k7Var = this.b;
        switch (i13) {
            case 0:
                k7Var.k().Q(R.raw.copy, 36, org.telegram.messenger.id.M0(2131743202, null)).k(false);
                break;
            case 1:
                k7Var.k().Q(R.raw.copy, 36, org.telegram.messenger.id.M0(2131743202, null)).k(false);
                break;
            case 2:
                k7Var.getClass();
                new ug.w0((org.telegram.ui.ActionBar.f2) new w4(k7Var, 0), 12, false).show();
                break;
            case 3:
                if (k7Var.n3 != null) {
                    long j10 = 0;
                    for (int i16 = 0; i16 < k7Var.n3.invoice.prices.size(); i16++) {
                        j10 += k7Var.n3.invoice.prices.get(i16).amount;
                    }
                    Context context = k7Var.getContext();
                    ArrayList arrayList = k7Var.k3;
                    org.telegram.ui.ActionBar.h6 h6Var = k7Var.I0;
                    g7 g7Var2 = new g7(context, h6Var);
                    g7Var2.V1 = arrayList;
                    float f10 = g7Var2.t0 / org.telegram.messenger.g0.p;
                    LimitPreviewView limitPreviewView = new LimitPreviewView(R.drawable.star, 0, 0, g7Var2.getContext(), h6Var);
                    g7Var2.W1 = limitPreviewView;
                    float f11 = 14.0f;
                    limitPreviewView.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    limitPreviewView.setIconScale(1.8f);
                    LinearLayout.LayoutParams s5 = c8.ha.s(-1, -2, 17, f10, 20.0f, f10, 10.0f);
                    LinearLayout linearLayout = g7Var2.S1;
                    linearLayout.addView(limitPreviewView, s5);
                    g7Var2.d1(j10);
                    int i17 = org.telegram.ui.ActionBar.m6.G6;
                    TextView b10 = c8.qa.b(context, 20.0f, i17, true, null);
                    org.telegram.messenger.k5.m(b10, 17, null, 2131749868);
                    g7Var2.setTitle(org.telegram.messenger.id.M0(2131749868, null));
                    linearLayout.addView(b10, c8.ha.t(-1, -2, 17, 32, 0, 32, 0));
                    TextView b11 = c8.qa.b(context, 14.0f, i17, false, null);
                    org.telegram.messenger.k5.m(b11, 17, null, 2131749869);
                    linearLayout.addView(b11, c8.ha.t(-1, -2, 17, 32, 10, 32, 10));
                    int currentTime = ConnectionsManager.getInstance(g7Var2.a).getCurrentTime();
                    tx0 tx0Var = new tx0(context, h6Var);
                    boolean z11 = false;
                    int i18 = 0;
                    while (true) {
                        String str3 = "⭐️ ";
                        float f12 = f11;
                        if (i18 >= arrayList.size()) {
                            if (!z11) {
                                int size = arrayList.size();
                                int i19 = 0;
                                while (i19 < size) {
                                    Object obj = arrayList.get(i19);
                                    i19++;
                                    TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) obj;
                                    Date date = new Date(starGiftUpgradePrice2.date * 1000);
                                    tx0Var.c(org.telegram.messenger.id.E0().p0().format(date) + ", " + org.telegram.messenger.id.E0().q0().format(date), dd.a1(false, jg.g.m((int) starGiftUpgradePrice2.upgrade_stars, ',', new StringBuilder(str3)), 0.8f, null), null, null);
                                    str3 = str3;
                                }
                            }
                            float f13 = f10 + f12;
                            linearLayout.addView(tx0Var, c8.ha.s(-1, -2, 7, f13, 16.0f, f13, 15.0f));
                            TextView b12 = c8.qa.b(context, 12.0f, org.telegram.ui.ActionBar.m6.y6, false, null);
                            org.telegram.messenger.k5.m(b12, 17, null, 2131749871);
                            linearLayout.addView(b12, c8.ha.t(-1, -2, 17, 32, 0, 32, 15));
                            float f14 = g7Var2.t0 / org.telegram.messenger.g0.p;
                            FrameLayout frameLayout = new FrameLayout(g7Var2.getContext());
                            g7Var2.T1 = frameLayout;
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, frameLayout, g7Var2.I0);
                            View view = new View(g7Var2.getContext());
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view, g7Var2.I0);
                            g7Var2.T1.addView(view, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
                            fi.d dVar = new fi.d(g7Var2.getContext(), g7Var2.I0, true);
                            g7Var2.U1 = dVar;
                            float f15 = f14 + 16.0f;
                            g7Var2.T1.addView(dVar, c8.ha.d(-1, 48.0f, qs.E1, f15, 16.0f, f15, 16.0f));
                            g7Var2.b.addView(g7Var2.T1, c8.ha.e(-1, -2, 87));
                            pj0 pj0Var = g7Var2.n1;
                            pj0Var.setPadding(pj0Var.getPaddingLeft(), pj0Var.getPaddingTop(), pj0Var.getPaddingRight(), org.telegram.messenger.g0.L(80.0f) + pj0Var.getPaddingBottom());
                            g7Var2.U1.i(k7.f2(org.telegram.messenger.id.M0(2131743888, null)), false, true);
                            g7Var2.U1.setOnClickListener(new ah.d(g7Var2, 10));
                            k7Var.l2 = g7Var2;
                            g7Var2.show();
                            break;
                        } else {
                            if (currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i18)).date || ((i7 = i18 + 1) < arrayList.size() && currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i7)).date)) {
                                Date date2 = new Date(r9.date * 1000);
                                tx0Var.c(org.telegram.messenger.id.E0().p0().format(date2) + ", " + org.telegram.messenger.id.E0().q0().format(date2), dd.a1(false, jg.g.m((int) r9.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                                z11 = true;
                            }
                            i18++;
                            f11 = f12;
                        }
                    }
                }
                break;
            case 4:
                k7Var.dismiss();
                break;
            case 5:
                new m20(k7Var.getContext()).show();
                break;
            case 6:
                k7.d1(k7Var);
                break;
            case 7:
                k7.e1(k7Var);
                break;
            case 8:
                Bundle bundle = new Bundle();
                long j11 = k7Var.S1;
                if (j11 >= 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                if (j11 == p10.i(k7Var.a).e()) {
                    z9 = true;
                    bundle.putBoolean("my_profile", true);
                } else {
                    z9 = true;
                }
                bundle.putBoolean("open_gifts", z9);
                bundle.putBoolean("open_gifts_upgradable", z9);
                k7.b2(new ProfileActivity(bundle, null));
                break;
            case 9:
                k7Var.f2.setLoading(false);
                k7Var.s2(0, true, null);
                break;
            case 10:
                new m20(k7Var.getContext()).show();
                break;
            case 11:
                wp[] wpVarArr = k7Var.o3;
                fi.d dVar2 = k7Var.f2;
                if (k7Var.W2.c == 1 && !k7Var.I) {
                    TL_stars.InputSavedStarGift A1 = k7Var.A1();
                    ij ijVar = k7Var.C2;
                    if (ijVar != null) {
                        TLRPC.MessageAction messageAction = ijVar.k.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                            long j12 = tL_messageActionStarGift.upgrade_stars;
                            str = tL_messageActionStarGift.prepaid_upgrade_hash;
                            if (j12 <= 0) {
                                break;
                            }
                            z10 = false;
                        }
                    } else {
                        TL_stars.SavedStarGift savedStarGift = k7Var.A2;
                        if (savedStarGift != null) {
                            long j13 = savedStarGift.upgrade_stars;
                            str = savedStarGift.prepaid_upgrade_hash;
                            if (j13 <= 0) {
                                break;
                            }
                            z10 = false;
                        }
                    }
                    int currentTime2 = ConnectionsManager.getInstance(k7Var.a).getCurrentTime();
                    if (k7Var.l3 != null) {
                        for (int i20 = 0; i20 < k7Var.l3.size(); i20++) {
                            starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) k7Var.l3.get(i20);
                            if (starGiftUpgradePrice.date >= currentTime2) {
                                i10 = i20;
                                if (k7Var.n3 != null) {
                                    for (int i21 = 0; i21 < k7Var.n3.invoice.prices.size(); i21++) {
                                        j3 += k7Var.n3.invoice.prices.get(i21).amount;
                                    }
                                }
                                long j14 = j3;
                                if (i10 > 0 || k7Var.m3) {
                                    i11 = 1;
                                } else {
                                    k7Var.m3 = true;
                                    if (k7Var.l3 != null) {
                                        for (int i22 = 0; i22 < i10; i22++) {
                                            k7Var.l3.remove(0);
                                        }
                                    }
                                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                    if (TextUtils.isEmpty(str)) {
                                        i12 = 1;
                                        TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                                        tL_inputInvoiceStarGiftUpgrade.keep_original_details = k7Var.r2.a.q;
                                        tL_inputInvoiceStarGiftUpgrade.stargift = A1;
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                                    } else {
                                        TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                                        tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                                        i12 = 1;
                                        tL_inputInvoiceStarGiftPrepaidUpgrade.peer = qp.s1(k7Var.a).j1(k7Var.S1);
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                                    }
                                    JSONObject u10 = hi.a3.u(k7Var.I0, false);
                                    if (u10 != null) {
                                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                        tL_dataJSON.data = u10.toString();
                                        tL_payments_getPaymentForm.flags |= i12;
                                    }
                                    ConnectionsManager.getInstance(k7Var.a).sendRequest(tL_payments_getPaymentForm, new s4(k7Var, i12));
                                    i11 = i12;
                                }
                                if (z10) {
                                    Object[] objArr = new Object[i11];
                                    objArr[0] = Long.valueOf(j14);
                                    dVar2.i(dd.U0(org.telegram.messenger.id.a0(null, null, 2131749877, objArr), 1.13f, wpVarArr), i11, i11);
                                } else {
                                    Object[] objArr2 = new Object[i11];
                                    objArr2[0] = Long.valueOf(j14);
                                    dVar2.i(dd.U0(org.telegram.messenger.id.a0(null, null, 2131750067, objArr2), 1.13f, wpVarArr), i11, i11);
                                }
                                g7Var = k7Var.l2;
                                if (g7Var != null) {
                                    g7Var.d1(j14);
                                }
                                if (starGiftUpgradePrice == null) {
                                    int i23 = starGiftUpgradePrice.date - currentTime2;
                                    if (i23 < 86400) {
                                        r13 = 0;
                                        G = org.telegram.messenger.g0.g0(i23, false, true);
                                    } else {
                                        r13 = 0;
                                        G = org.telegram.messenger.id.G(Math.round(i23 / 86400.0f), "Days", new Object[0]);
                                    }
                                    org.telegram.ui.Components.h6 h6Var2 = dVar2.e;
                                    h6Var2.D = r13;
                                    h6Var2.E = true;
                                    h6Var2.F = true;
                                    h6Var2.G = r13;
                                    h6Var2.H = r13;
                                    Object[] objArr3 = new Object[1];
                                    objArr3[r13] = G;
                                    dVar2.g(org.telegram.messenger.id.a0(null, null, 2131749876, objArr3), true);
                                    org.telegram.messenger.g0.i3(k7Var.p3, 1000L);
                                    break;
                                } else {
                                    dVar2.g(null, true);
                                    break;
                                }
                            }
                        }
                    }
                    starGiftUpgradePrice = null;
                    i10 = -1;
                    if (k7Var.n3 != null) {
                    }
                    long j142 = j3;
                    if (i10 > 0) {
                    }
                    i11 = 1;
                    if (z10) {
                    }
                    g7Var = k7Var.l2;
                    if (g7Var != null) {
                    }
                    if (starGiftUpgradePrice == null) {
                    }
                }
                break;
            case 12:
                k7Var.onBackPressed();
                break;
            case 13:
                TL_stars.SavedStarGift savedStarGift2 = k7Var.A2;
                if (savedStarGift2.unsaved) {
                    savedStarGift2.unsaved = false;
                    t9 F = ea.y(k7Var.a, false).F(k7Var.S1, false);
                    if (F != null) {
                        TL_stars.SavedStarGift savedStarGift3 = k7Var.A2;
                        F.m(savedStarGift3, savedStarGift3.unsaved);
                    }
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = k7Var.A1();
                    savestargift.unsave = k7Var.A2.unsaved;
                    ConnectionsManager.getInstance(k7Var.a).sendRequest(savestargift, null, 64);
                }
                TL_stars.SavedStarGift savedStarGift4 = k7Var.A2;
                boolean z12 = savedStarGift4.pinned_to_top;
                if (((v9) k7Var.B2).o(savedStarGift4, !z12, false)) {
                    new zh.c2(k7Var.getContext(), k7Var.S1, k7Var.A2, k7Var.I0, new l2(k7Var, i15)).show();
                    break;
                } else if (z12) {
                    org.telegram.messenger.k5.o(null, 2131749880, k7Var.k(), R.raw.ic_unpin, 36);
                    break;
                } else {
                    k7Var.k().I(R.raw.ic_pin, org.telegram.messenger.id.M0(2131750076, null), org.telegram.messenger.id.M0(2131750077, null)).j();
                    break;
                }
            case 14:
                long w12 = k7Var.w1();
                if (w12 != 0) {
                    k7Var.T1(w12);
                    break;
                }
                break;
            case 15:
                k7 k7Var2 = this.b;
                TL_stars.InputSavedStarGift A12 = k7Var2.A1();
                if (A12 != null) {
                    long e10 = p10.i(k7Var2.a).e();
                    ij ijVar2 = k7Var2.C2;
                    if (ijVar2 != null && (message = ijVar2.k) != null) {
                        TLRPC.MessageAction messageAction2 = message.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.Peer peer = ((TLRPC.TL_messageActionStarGift) messageAction2).peer;
                            if (peer != null) {
                                e10 = org.telegram.messenger.m5.o(peer);
                            }
                            long j15 = e10;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k7Var2.getContext(), k7Var2.I0);
                            String M0 = org.telegram.messenger.id.M0(2131750218, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = M0;
                            u1Var.T = org.telegram.messenger.id.M0(2131750217, null);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new i(k7Var2, A12, j15, 1));
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            alertDialog$Builder.d(-1);
                            alertDialog$Builder.p();
                            break;
                        }
                    }
                    if (k7Var2.A2 != null) {
                        e10 = k7Var2.S1;
                        long j152 = e10;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, k7Var2.getContext(), k7Var2.I0);
                        String M02 = org.telegram.messenger.id.M0(2131750218, null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                        u1Var2.R = M02;
                        u1Var2.T = org.telegram.messenger.id.M0(2131750217, null);
                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751598, null), new i(k7Var2, A12, j152, 1));
                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder2.d(-1);
                        alertDialog$Builder2.p();
                    }
                }
                break;
            case 16:
                k7Var.S1(true);
                break;
            case 17:
                TL_stars.TL_starGiftUnique G1 = k7Var.G1();
                if (G1 != null) {
                    dd.i1(k7Var.getContext(), k7Var.a, G1, new p4(k7Var, G1, 2), k7Var.I0);
                    break;
                }
                break;
            case 18:
                k7Var.N1();
                break;
            case 19:
                TL_stars.TL_starGiftUnique G12 = k7Var.G1();
                new a1(k7Var.getContext(), k7Var.a, org.telegram.messenger.m5.o(G12.owner_id), G12, k7Var.I0, new z1(k7Var, i14)).show();
                break;
            case 20:
                k7Var.dismiss();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                TL_stars.TL_starGiftUnique G13 = k7Var.G1();
                if (T != null && G13 != null) {
                    zw zwVar = new zw(org.telegram.ui.Cells.f1.h(4, "onlySelect", "dialogsType", true));
                    zwVar.D2 = new a3.h(k7Var, G13, zwVar, 5);
                    T.presentFragment(zwVar);
                    break;
                }
                break;
            case 21:
                k7Var.V1();
                break;
            case 22:
                k7Var.a2();
                break;
            case 23:
                k7Var.onBackPressed();
                break;
            case 24:
                e7 e7Var = k7Var.a2;
                fi.d dVar3 = k7Var.f2;
                o6 o6Var = k7Var.K2.h;
                ImageReceiver imageReceiver = (o6Var == null || (n6Var = o6Var.c) == null) ? null : ((q6) n6Var).d;
                org.telegram.ui.Components.k9 k9Var = e7Var.d[0];
                if (imageReceiver != null && k9Var != null && k9Var.getImageReceiver() != null) {
                    zg0 B = imageReceiver.B();
                    zg0 B2 = k9Var.getImageReceiver().B();
                    if (B2 != null && B != null) {
                        B2.T(false, B.t());
                    } else if (B2 == null && B != null) {
                        imageReceiver.f();
                        k9Var.setImageDrawable(B);
                    }
                }
                e7Var.b.setAlpha(1.0f);
                e7Var.c.setAlpha(0.0f);
                if (!k7Var.m2 || k7Var.U1 == null || k7Var.B2 == null || k7Var.C1() < 0 || k7Var.B2.b(k7Var.C1()) < 0) {
                    dVar3.setFilled(true);
                    dVar3.i(org.telegram.messenger.id.M0(2131747831, null), true, true);
                    dVar3.g(null, true);
                    dVar3.setOnClickListener(new y1(k7Var, 7));
                    break;
                } else {
                    dVar3.setFilled(false);
                    int b13 = k7Var.B2.b(k7Var.C1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131749855, null));
                    Object obj2 = k7Var.B2.get(b13);
                    if ((obj2 instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj2).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.q5(document, dVar3.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar3.i(spannableStringBuilder, true, true);
                    dVar3.g(null, true);
                    dVar3.setOnClickListener(new u2(k7Var, b13, 0));
                    break;
                }
                break;
            case 25:
                if (k7Var.x1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(k7Var.x1().title);
                    sb2.append(" #");
                    str2 = jg.g.m(k7Var.x1().num, ',', sb2);
                } else {
                    str2 = "";
                }
                org.telegram.ui.Components.bc I = k7Var.k().I(R.raw.gift_upgrade, org.telegram.messenger.id.M0(2131749849, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749850, str2)));
                I.j = 5000;
                I.t = true;
                I.j();
                jz jzVar = k7Var.V1;
                if (jzVar != null) {
                    jzVar.c(true);
                    break;
                }
                break;
            default:
                k7Var.n1.v0(((k7) k7Var.O2.d).N2.length - 1);
                break;
        }
    }
}
