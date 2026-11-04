package ci;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.rf;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.i20;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;

    public /* synthetic */ s1(l6 l6Var, int i3) {
        this.a = i3;
        this.b = l6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0336, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0338, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x034c, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0437  */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v16 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        boolean z10;
        String str;
        boolean z11;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        int i10;
        int i11;
        h6 h6Var;
        ?? r13;
        String G;
        int i12;
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        p5 p5Var;
        String str2;
        int i13 = this.a;
        int i14 = 4;
        int i15 = 0;
        long j10 = 0;
        l6 l6Var = this.b;
        switch (i13) {
            case 0:
                l6Var.k().Q(R.raw.copy, 36, bd.M0(2131743212, null)).k(false);
                break;
            case 1:
                l6Var.k().Q(R.raw.copy, 36, bd.M0(2131743212, null)).k(false);
                break;
            case 2:
                l6Var.getClass();
                new vg.v0((org.telegram.ui.ActionBar.d2) new ai.c7(l6Var, 1), 12, false).show();
                break;
            case 3:
                if (l6Var.l3 != null) {
                    long j11 = 0;
                    for (int i16 = 0; i16 < l6Var.l3.invoice.prices.size(); i16++) {
                        j11 += l6Var.l3.invoice.prices.get(i16).amount;
                    }
                    Context context = l6Var.getContext();
                    ArrayList arrayList = l6Var.i3;
                    org.telegram.ui.ActionBar.e6 e6Var = l6Var.J0;
                    h6 h6Var2 = new h6(context, e6Var);
                    h6Var2.T1 = arrayList;
                    float f10 = h6Var2.u0 / org.telegram.messenger.g0.p;
                    LimitPreviewView limitPreviewView = new LimitPreviewView(R.drawable.star, 0, 0, h6Var2.getContext(), e6Var);
                    h6Var2.U1 = limitPreviewView;
                    float f11 = 14.0f;
                    limitPreviewView.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    limitPreviewView.setIconScale(1.8f);
                    LinearLayout.LayoutParams s6 = mf.s(-1, -2, 17, f10, 20.0f, f10, 10.0f);
                    LinearLayout linearLayout = h6Var2.Q1;
                    linearLayout.addView(limitPreviewView, s6);
                    h6Var2.d1(j11);
                    int i17 = org.telegram.ui.ActionBar.k6.G6;
                    TextView b10 = rf.b(context, 20.0f, i17, true, null);
                    org.telegram.messenger.k5.m(b10, 17, null, 2131749876);
                    h6Var2.setTitle(bd.M0(2131749876, null));
                    linearLayout.addView(b10, mf.t(-1, -2, 17, 32, 0, 32, 0));
                    TextView b11 = rf.b(context, 14.0f, i17, false, null);
                    org.telegram.messenger.k5.m(b11, 17, null, 2131749877);
                    linearLayout.addView(b11, mf.t(-1, -2, 17, 32, 10, 32, 10));
                    int currentTime = ConnectionsManager.getInstance(h6Var2.a).getCurrentTime();
                    rx0 rx0Var = new rx0(context, e6Var);
                    boolean z12 = false;
                    int i18 = 0;
                    while (true) {
                        String str3 = "⭐️ ";
                        float f12 = f11;
                        if (i18 >= arrayList.size()) {
                            if (!z12) {
                                int size = arrayList.size();
                                int i19 = 0;
                                while (i19 < size) {
                                    Object obj = arrayList.get(i19);
                                    i19++;
                                    TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) obj;
                                    Date date = new Date(starGiftUpgradePrice2.date * 1000);
                                    rx0Var.c(bd.E0().p0().format(date) + ", " + bd.E0().q0().format(date), wb.a1(false, k2.p1.l((int) starGiftUpgradePrice2.upgrade_stars, ',', new StringBuilder(str3)), 0.8f, null), null, null);
                                    str3 = str3;
                                }
                            }
                            float f13 = f10 + f12;
                            linearLayout.addView(rx0Var, mf.s(-1, -2, 7, f13, 16.0f, f13, 15.0f));
                            TextView b12 = rf.b(context, 12.0f, org.telegram.ui.ActionBar.k6.y6, false, null);
                            org.telegram.messenger.k5.m(b12, 17, null, 2131749879);
                            linearLayout.addView(b12, mf.t(-1, -2, 17, 32, 0, 32, 15));
                            float f14 = h6Var2.u0 / org.telegram.messenger.g0.p;
                            FrameLayout frameLayout = new FrameLayout(h6Var2.getContext());
                            h6Var2.R1 = frameLayout;
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout, h6Var2.J0);
                            View view = new View(h6Var2.getContext());
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, h6Var2.J0);
                            h6Var2.R1.addView(view, mf.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
                            gi.d dVar = new gi.d(h6Var2.getContext(), h6Var2.J0, true);
                            h6Var2.S1 = dVar;
                            float f15 = f14 + 16.0f;
                            h6Var2.R1.addView(dVar, mf.d(-1, 48.0f, hs.E1, f15, 16.0f, f15, 16.0f));
                            h6Var2.b.addView(h6Var2.R1, mf.e(-1, -2, 87));
                            tj0 tj0Var = h6Var2.l1;
                            tj0Var.setPadding(tj0Var.getPaddingLeft(), tj0Var.getPaddingTop(), tj0Var.getPaddingRight(), org.telegram.messenger.g0.L(80.0f) + tj0Var.getPaddingBottom());
                            h6Var2.S1.i(l6.g2(bd.M0(2131743898, null)), false, true);
                            h6Var2.S1.setOnClickListener(new ai.b(h6Var2, 13));
                            l6Var.j2 = h6Var2;
                            h6Var2.show();
                            break;
                        } else {
                            if (currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i18)).date || ((i3 = i18 + 1) < arrayList.size() && currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i3)).date)) {
                                Date date2 = new Date(r9.date * 1000);
                                rx0Var.c(bd.E0().p0().format(date2) + ", " + bd.E0().q0().format(date2), wb.a1(false, k2.p1.l((int) r9.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                                z12 = true;
                            }
                            i18++;
                            f11 = f12;
                        }
                    }
                }
                break;
            case 4:
                l6Var.dismiss();
                break;
            case 5:
                new i20(l6Var.getContext()).show();
                break;
            case 6:
                l6.d1(l6Var);
                break;
            case 7:
                l6.e1(l6Var);
                break;
            case 8:
                Bundle bundle = new Bundle();
                long j12 = l6Var.Q1;
                if (j12 >= 0) {
                    bundle.putLong("user_id", j12);
                } else {
                    bundle.putLong("chat_id", -j12);
                }
                if (j12 == h10.i(l6Var.a).e()) {
                    z10 = true;
                    bundle.putBoolean("my_profile", true);
                } else {
                    z10 = true;
                }
                bundle.putBoolean("open_gifts", z10);
                bundle.putBoolean("open_gifts_upgradable", z10);
                l6.c2(new ProfileActivity(bundle, null));
                break;
            case 9:
                l6Var.d2.setLoading(false);
                l6Var.s2(0, true, null);
                break;
            case 10:
                new i20(l6Var.getContext()).show();
                break;
            case 11:
                wp[] wpVarArr = l6Var.m3;
                gi.d dVar2 = l6Var.d2;
                if (l6Var.U2.c == 1 && !l6Var.J) {
                    TL_stars.InputSavedStarGift B1 = l6Var.B1();
                    zi ziVar = l6Var.A2;
                    if (ziVar != null) {
                        TLRPC.MessageAction messageAction = ziVar.k.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                            long j13 = tL_messageActionStarGift.upgrade_stars;
                            str = tL_messageActionStarGift.prepaid_upgrade_hash;
                            if (j13 <= 0) {
                                break;
                            }
                            z11 = false;
                        }
                    } else {
                        TL_stars.SavedStarGift savedStarGift = l6Var.y2;
                        if (savedStarGift != null) {
                            long j14 = savedStarGift.upgrade_stars;
                            str = savedStarGift.prepaid_upgrade_hash;
                            if (j14 <= 0) {
                                break;
                            }
                            z11 = false;
                        }
                    }
                    int currentTime2 = ConnectionsManager.getInstance(l6Var.a).getCurrentTime();
                    if (l6Var.j3 != null) {
                        for (int i20 = 0; i20 < l6Var.j3.size(); i20++) {
                            starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) l6Var.j3.get(i20);
                            if (starGiftUpgradePrice.date >= currentTime2) {
                                i10 = i20;
                                if (l6Var.l3 != null) {
                                    for (int i21 = 0; i21 < l6Var.l3.invoice.prices.size(); i21++) {
                                        j10 += l6Var.l3.invoice.prices.get(i21).amount;
                                    }
                                }
                                long j15 = j10;
                                if (i10 > 0 || l6Var.k3) {
                                    i11 = 1;
                                } else {
                                    l6Var.k3 = true;
                                    if (l6Var.j3 != null) {
                                        for (int i22 = 0; i22 < i10; i22++) {
                                            l6Var.j3.remove(0);
                                        }
                                    }
                                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                    if (TextUtils.isEmpty(str)) {
                                        i12 = 1;
                                        TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                                        tL_inputInvoiceStarGiftUpgrade.keep_original_details = l6Var.p2.a.q;
                                        tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                                    } else {
                                        TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                                        tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                                        i12 = 1;
                                        tL_inputInvoiceStarGiftPrepaidUpgrade.peer = hp.s1(l6Var.a).j1(l6Var.Q1);
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                                    }
                                    JSONObject u10 = ii.a3.u(l6Var.J0, false);
                                    if (u10 != null) {
                                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                        tL_dataJSON.data = u10.toString();
                                        tL_payments_getPaymentForm.flags |= i12;
                                    }
                                    ConnectionsManager.getInstance(l6Var.a).sendRequest(tL_payments_getPaymentForm, new c4(l6Var, i12));
                                    i11 = i12;
                                }
                                if (z11) {
                                    Object[] objArr = new Object[i11];
                                    objArr[0] = Long.valueOf(j15);
                                    dVar2.i(wb.U0(bd.a0(null, null, 2131749885, objArr), 1.13f, wpVarArr), i11, i11);
                                } else {
                                    Object[] objArr2 = new Object[i11];
                                    objArr2[0] = Long.valueOf(j15);
                                    dVar2.i(wb.U0(bd.a0(null, null, 2131750075, objArr2), 1.13f, wpVarArr), i11, i11);
                                }
                                h6Var = l6Var.j2;
                                if (h6Var != null) {
                                    h6Var.d1(j15);
                                }
                                if (starGiftUpgradePrice == null) {
                                    int i23 = starGiftUpgradePrice.date - currentTime2;
                                    if (i23 < 86400) {
                                        r13 = 0;
                                        G = org.telegram.messenger.g0.g0(i23, false, true);
                                    } else {
                                        r13 = 0;
                                        G = bd.G(Math.round(i23 / 86400.0f), "Days", new Object[0]);
                                    }
                                    org.telegram.ui.Components.g6 g6Var = dVar2.e;
                                    g6Var.D = r13;
                                    g6Var.E = true;
                                    g6Var.F = true;
                                    g6Var.G = r13;
                                    g6Var.H = r13;
                                    Object[] objArr3 = new Object[1];
                                    objArr3[r13] = G;
                                    dVar2.g(bd.a0(null, null, 2131749884, objArr3), true);
                                    org.telegram.messenger.g0.i3(l6Var.n3, 1000L);
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
                    if (l6Var.l3 != null) {
                    }
                    long j152 = j10;
                    if (i10 > 0) {
                    }
                    i11 = 1;
                    if (z11) {
                    }
                    h6Var = l6Var.j2;
                    if (h6Var != null) {
                    }
                    if (starGiftUpgradePrice == null) {
                    }
                }
                break;
            case 12:
                l6Var.onBackPressed();
                break;
            case 13:
                TL_stars.SavedStarGift savedStarGift2 = l6Var.y2;
                if (savedStarGift2.unsaved) {
                    savedStarGift2.unsaved = false;
                    s8 F = e9.y(l6Var.a, false).F(l6Var.Q1, false);
                    if (F != null) {
                        TL_stars.SavedStarGift savedStarGift3 = l6Var.y2;
                        F.m(savedStarGift3, savedStarGift3.unsaved);
                    }
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = l6Var.B1();
                    savestargift.unsave = l6Var.y2.unsaved;
                    ConnectionsManager.getInstance(l6Var.a).sendRequest(savestargift, null, 64);
                }
                TL_stars.SavedStarGift savedStarGift4 = l6Var.y2;
                boolean z13 = savedStarGift4.pinned_to_top;
                if (((v8) l6Var.z2).o(savedStarGift4, !z13, false)) {
                    new ai.t4(l6Var.getContext(), l6Var.Q1, l6Var.y2, l6Var.J0, new c2(l6Var, i15)).show();
                    break;
                } else if (z13) {
                    org.telegram.messenger.k5.o(null, 2131749888, l6Var.k(), R.raw.ic_unpin, 36);
                    break;
                } else {
                    l6Var.k().I(R.raw.ic_pin, bd.M0(2131750084, null), bd.M0(2131750085, null)).j();
                    break;
                }
            case 14:
                long x12 = l6Var.x1();
                if (x12 != 0) {
                    l6Var.U1(x12);
                    break;
                }
                break;
            case 15:
                l6 l6Var2 = this.b;
                TL_stars.InputSavedStarGift B12 = l6Var2.B1();
                if (B12 != null) {
                    long e10 = h10.i(l6Var2.a).e();
                    zi ziVar2 = l6Var2.A2;
                    if (ziVar2 != null && (message = ziVar2.k) != null) {
                        TLRPC.MessageAction messageAction2 = message.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.Peer peer = ((TLRPC.TL_messageActionStarGift) messageAction2).peer;
                            if (peer != null) {
                                e10 = org.telegram.messenger.m5.o(peer);
                            }
                            long j16 = e10;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l6Var2.getContext(), l6Var2.J0);
                            String M0 = bd.M0(2131750226, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = M0;
                            s1Var.U = bd.M0(2131750225, null);
                            alertDialog$Builder.k(bd.M0(2131751599, null), new i(l6Var2, B12, j16, 1));
                            alertDialog$Builder.h(bd.M0(2131752589, null), null);
                            alertDialog$Builder.d(-1);
                            alertDialog$Builder.p();
                            break;
                        }
                    }
                    if (l6Var2.y2 != null) {
                        e10 = l6Var2.Q1;
                        long j162 = e10;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, l6Var2.getContext(), l6Var2.J0);
                        String M02 = bd.M0(2131750226, null);
                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                        s1Var2.S = M02;
                        s1Var2.U = bd.M0(2131750225, null);
                        alertDialog$Builder2.k(bd.M0(2131751599, null), new i(l6Var2, B12, j162, 1));
                        alertDialog$Builder2.h(bd.M0(2131752589, null), null);
                        alertDialog$Builder2.d(-1);
                        alertDialog$Builder2.p();
                    }
                }
                break;
            case 16:
                l6Var.T1(true);
                break;
            case 17:
                TL_stars.TL_starGiftUnique H1 = l6Var.H1();
                if (H1 != null) {
                    wb.i1(l6Var.getContext(), l6Var.a, H1, new z3(l6Var, H1, 2), l6Var.J0);
                    break;
                }
                break;
            case 18:
                l6Var.O1();
                break;
            case 19:
                TL_stars.TL_starGiftUnique H12 = l6Var.H1();
                new t0(l6Var.getContext(), l6Var.a, org.telegram.messenger.m5.o(H12.owner_id), H12, l6Var.J0, new s1(l6Var, i14)).show();
                break;
            case 20:
                l6Var.dismiss();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                TL_stars.TL_starGiftUnique H13 = l6Var.H1();
                if (T != null && H13 != null) {
                    uw uwVar = new uw(org.telegram.ui.Cells.f1.l(4, "onlySelect", "dialogsType", true));
                    uwVar.D2 = new aa.a(l6Var, H13, uwVar, 3);
                    T.presentFragment(uwVar);
                    break;
                }
                break;
            case 21:
                l6Var.W1();
                break;
            case 22:
                l6Var.b2();
                break;
            case 23:
                l6Var.onBackPressed();
                break;
            case 24:
                f6 f6Var = l6Var.Y1;
                gi.d dVar3 = l6Var.d2;
                q5 q5Var = l6Var.I2.h;
                ImageReceiver imageReceiver = (q5Var == null || (p5Var = q5Var.c) == null) ? null : ((s5) p5Var).d;
                org.telegram.ui.Components.k9 k9Var = f6Var.d[0];
                if (imageReceiver != null && k9Var != null && k9Var.getImageReceiver() != null) {
                    ch0 B = imageReceiver.B();
                    ch0 B2 = k9Var.getImageReceiver().B();
                    if (B2 != null && B != null) {
                        B2.T(false, B.t());
                    } else if (B2 == null && B != null) {
                        imageReceiver.f();
                        k9Var.setImageDrawable(B);
                    }
                }
                f6Var.b.setAlpha(1.0f);
                f6Var.c.setAlpha(0.0f);
                if (!l6Var.k2 || l6Var.S1 == null || l6Var.z2 == null || l6Var.D1() < 0 || l6Var.z2.b(l6Var.D1()) < 0) {
                    dVar3.setFilled(true);
                    dVar3.i(bd.M0(2131747839, null), true, true);
                    dVar3.g(null, true);
                    dVar3.setOnClickListener(new r1(l6Var, 7));
                    break;
                } else {
                    dVar3.setFilled(false);
                    int b13 = l6Var.z2.b(l6Var.D1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) bd.M0(2131749863, null));
                    Object obj2 = l6Var.z2.get(b13);
                    if ((obj2 instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj2).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(document, dVar3.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar3.i(spannableStringBuilder, true, true);
                    dVar3.g(null, true);
                    dVar3.setOnClickListener(new j2(l6Var, b13, 0));
                    break;
                }
                break;
            case 25:
                if (l6Var.y1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(l6Var.y1().title);
                    sb2.append(" #");
                    str2 = k2.p1.l(l6Var.y1().num, ',', sb2);
                } else {
                    str2 = "";
                }
                org.telegram.ui.Components.ac I = l6Var.k().I(R.raw.gift_upgrade, bd.M0(2131749857, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749858, str2)));
                I.j = 5000;
                I.t = true;
                I.j();
                gz gzVar = l6Var.T1;
                if (gzVar != null) {
                    gzVar.c(true);
                    break;
                }
                break;
            default:
                l6Var.l1.v0(((l6) l6Var.M2.d).L2.length - 1);
                break;
        }
    }
}
