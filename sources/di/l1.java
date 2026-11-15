package di;

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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    public /* synthetic */ l1(c6 c6Var, int i7) {
        this.a = i7;
        this.b = c6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0331, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0333, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0347, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0433  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        String str;
        boolean z10;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        int i10;
        boolean z11;
        int i11;
        y5 y5Var;
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        g5 g5Var;
        String str2;
        int i12 = this.a;
        int i13 = 4;
        int i14 = 6;
        int i15 = 0;
        long j3 = 0;
        int i16 = 1;
        c6 c6Var = this.b;
        switch (i12) {
            case 0:
                c6Var.k().Q(R.raw.copy, 36, hd.M0(2131743202, null)).k(false);
                break;
            case 1:
                c6Var.k().Q(R.raw.copy, 36, hd.M0(2131743202, null)).k(false);
                break;
            case 2:
                c6Var.getClass();
                new ug.x0((org.telegram.ui.ActionBar.e2) new bi.t6(c6Var, 1), 12, false).show();
                break;
            case 3:
                if (c6Var.o3 != null) {
                    long j10 = 0;
                    for (int i17 = 0; i17 < c6Var.o3.invoice.prices.size(); i17++) {
                        j10 += c6Var.o3.invoice.prices.get(i17).amount;
                    }
                    Context context = c6Var.getContext();
                    ArrayList arrayList = c6Var.l3;
                    org.telegram.ui.ActionBar.e6 e6Var = c6Var.J0;
                    y5 y5Var2 = new y5(context, e6Var);
                    y5Var2.W1 = arrayList;
                    float f10 = y5Var2.u0 / org.telegram.messenger.g0.p;
                    LimitPreviewView limitPreviewView = new LimitPreviewView(R.drawable.star, 0, 0, y5Var2.getContext(), e6Var);
                    y5Var2.X1 = limitPreviewView;
                    float f11 = 14.0f;
                    limitPreviewView.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    limitPreviewView.setIconScale(1.8f);
                    LinearLayout.LayoutParams s5 = c8.ja.s(-1, -2, 17, f10, 20.0f, f10, 10.0f);
                    LinearLayout linearLayout = y5Var2.T1;
                    linearLayout.addView(limitPreviewView, s5);
                    y5Var2.d1(j10);
                    int i18 = org.telegram.ui.ActionBar.j6.G6;
                    TextView b10 = c8.sa.b(context, 20.0f, i18, true, null);
                    org.telegram.messenger.k5.l(b10, 17, null, 2131749868);
                    y5Var2.setTitle(hd.M0(2131749868, null));
                    linearLayout.addView(b10, c8.ja.t(-1, -2, 17, 32, 0, 32, 0));
                    TextView b11 = c8.sa.b(context, 14.0f, i18, false, null);
                    org.telegram.messenger.k5.l(b11, 17, null, 2131749869);
                    linearLayout.addView(b11, c8.ja.t(-1, -2, 17, 32, 10, 32, 10));
                    int currentTime = ConnectionsManager.getInstance(y5Var2.a).getCurrentTime();
                    vx0 vx0Var = new vx0(context, e6Var);
                    int i19 = 0;
                    boolean z12 = false;
                    while (true) {
                        float f12 = f11;
                        if (i19 >= arrayList.size()) {
                            if (!z12) {
                                int i20 = 0;
                                for (int size = arrayList.size(); i20 < size; size = size) {
                                    Object obj = arrayList.get(i20);
                                    i20++;
                                    TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) obj;
                                    Date date = new Date(starGiftUpgradePrice2.date * 1000);
                                    vx0Var.c(hd.E0().p0().format(date) + ", " + hd.E0().q0().format(date), lb.a1(false, i5.c.l((int) starGiftUpgradePrice2.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                                }
                            }
                            float f13 = f10 + f12;
                            linearLayout.addView(vx0Var, c8.ja.s(-1, -2, 7, f13, 16.0f, f13, 15.0f));
                            TextView b12 = c8.sa.b(context, 12.0f, org.telegram.ui.ActionBar.j6.y6, false, null);
                            org.telegram.messenger.k5.l(b12, 17, null, 2131749871);
                            linearLayout.addView(b12, c8.ja.t(-1, -2, 17, 32, 0, 32, 15));
                            float f14 = y5Var2.u0 / org.telegram.messenger.g0.p;
                            FrameLayout frameLayout = new FrameLayout(y5Var2.getContext());
                            y5Var2.U1 = frameLayout;
                            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, frameLayout, y5Var2.J0);
                            View view = new View(y5Var2.getContext());
                            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d7, view, y5Var2.J0);
                            y5Var2.U1.addView(view, c8.ja.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
                            hi.d dVar = new hi.d(y5Var2.getContext(), y5Var2.J0, true);
                            y5Var2.V1 = dVar;
                            float f15 = f14 + 16.0f;
                            y5Var2.U1.addView(dVar, c8.ja.d(-1, 48.0f, ns.E1, f15, 16.0f, f15, 16.0f));
                            y5Var2.b.addView(y5Var2.U1, c8.ja.e(-1, -2, 87));
                            uj0 uj0Var = y5Var2.o1;
                            uj0Var.setPadding(uj0Var.getPaddingLeft(), uj0Var.getPaddingTop(), uj0Var.getPaddingRight(), org.telegram.messenger.g0.L(80.0f) + uj0Var.getPaddingBottom());
                            y5Var2.V1.i(c6.h2(hd.M0(2131743888, null)), false, true);
                            y5Var2.V1.setOnClickListener(new ah.d(y5Var2, 17));
                            c6Var.m2 = y5Var2;
                            y5Var2.show();
                            break;
                        } else {
                            if (currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i19)).date || ((i7 = i19 + 1) < arrayList.size() && currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i7)).date)) {
                                Date date2 = new Date(r8.date * 1000);
                                vx0Var.c(hd.E0().p0().format(date2) + ", " + hd.E0().q0().format(date2), lb.a1(false, i5.c.l((int) r8.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                                z12 = true;
                            }
                            i19++;
                            f11 = f12;
                        }
                    }
                }
                break;
            case 4:
                c6Var.dismiss();
                break;
            case 5:
                new p20(c6Var.getContext()).show();
                break;
            case 6:
                c6.d1(c6Var);
                break;
            case 7:
                c6.e1(c6Var);
                break;
            case 8:
                Bundle bundle = new Bundle();
                long j11 = c6Var.T1;
                if (j11 >= 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                if (j11 == m10.i(c6Var.a).e()) {
                    bundle.putBoolean("my_profile", true);
                }
                bundle.putBoolean("open_gifts", true);
                bundle.putBoolean("open_gifts_upgradable", true);
                c6.d2(new ProfileActivity(bundle, null));
                break;
            case 9:
                c6Var.g2.setLoading(false);
                c6Var.t2(0, true, null);
                break;
            case 10:
                new p20(c6Var.getContext()).show();
                break;
            case 11:
                eq[] eqVarArr = c6Var.p3;
                hi.d dVar2 = c6Var.g2;
                if (c6Var.X2.c == 1 && !c6Var.J) {
                    TL_stars.InputSavedStarGift B1 = c6Var.B1();
                    gj gjVar = c6Var.D2;
                    if (gjVar != null) {
                        TLRPC.MessageAction messageAction = gjVar.k.action;
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
                        TL_stars.SavedStarGift savedStarGift = c6Var.B2;
                        if (savedStarGift != null) {
                            long j13 = savedStarGift.upgrade_stars;
                            str = savedStarGift.prepaid_upgrade_hash;
                            if (j13 <= 0) {
                                break;
                            }
                            z10 = false;
                        }
                    }
                    int currentTime2 = ConnectionsManager.getInstance(c6Var.a).getCurrentTime();
                    if (c6Var.m3 != null) {
                        for (int i21 = 0; i21 < c6Var.m3.size(); i21++) {
                            starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) c6Var.m3.get(i21);
                            if (starGiftUpgradePrice.date >= currentTime2) {
                                i10 = i21;
                                if (c6Var.o3 != null) {
                                    for (int i22 = 0; i22 < c6Var.o3.invoice.prices.size(); i22++) {
                                        j3 += c6Var.o3.invoice.prices.get(i22).amount;
                                    }
                                }
                                long j14 = j3;
                                if (i10 > 0 || c6Var.n3) {
                                    z11 = z10;
                                    i11 = currentTime2;
                                } else {
                                    c6Var.n3 = true;
                                    if (c6Var.m3 != null) {
                                        for (int i23 = 0; i23 < i10; i23++) {
                                            c6Var.m3.remove(0);
                                        }
                                    }
                                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                    if (TextUtils.isEmpty(str)) {
                                        z11 = z10;
                                        i11 = currentTime2;
                                        TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                                        tL_inputInvoiceStarGiftUpgrade.keep_original_details = c6Var.s2.a.q;
                                        tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                                    } else {
                                        TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                                        tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                                        z11 = z10;
                                        i11 = currentTime2;
                                        tL_inputInvoiceStarGiftPrepaidUpgrade.peer = np.s1(c6Var.a).j1(c6Var.T1);
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                                    }
                                    JSONObject u10 = ki.x2.u(c6Var.J0, false);
                                    if (u10 != null) {
                                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                        tL_dataJSON.data = u10.toString();
                                        tL_payments_getPaymentForm.flags |= 1;
                                    }
                                    ConnectionsManager.getInstance(c6Var.a).sendRequest(tL_payments_getPaymentForm, new t3(c6Var, i16));
                                }
                                if (z11) {
                                    dVar2.i(lb.U0(hd.a0(null, null, 2131749877, Long.valueOf(j14)), 1.13f, eqVarArr), true, true);
                                } else {
                                    dVar2.i(lb.U0(hd.a0(null, null, 2131750067, Long.valueOf(j14)), 1.13f, eqVarArr), true, true);
                                }
                                y5Var = c6Var.m2;
                                if (y5Var != null) {
                                    y5Var.d1(j14);
                                }
                                if (starGiftUpgradePrice == null) {
                                    int i24 = starGiftUpgradePrice.date - i11;
                                    String g02 = i24 < 86400 ? org.telegram.messenger.g0.g0(i24, false, true) : hd.G(Math.round(i24 / 86400.0f), "Days", new Object[0]);
                                    org.telegram.ui.Components.g6 g6Var = dVar2.e;
                                    g6Var.E = false;
                                    g6Var.F = true;
                                    g6Var.G = true;
                                    g6Var.H = false;
                                    g6Var.I = false;
                                    dVar2.g(hd.a0(null, null, 2131749876, g02), true);
                                    org.telegram.messenger.g0.i3(c6Var.q3, 1000L);
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
                    if (c6Var.o3 != null) {
                    }
                    long j142 = j3;
                    if (i10 > 0) {
                    }
                    z11 = z10;
                    i11 = currentTime2;
                    if (z11) {
                    }
                    y5Var = c6Var.m2;
                    if (y5Var != null) {
                    }
                    if (starGiftUpgradePrice == null) {
                    }
                }
                break;
            case 12:
                c6Var.onBackPressed();
                break;
            case 13:
                TL_stars.SavedStarGift savedStarGift2 = c6Var.B2;
                if (savedStarGift2.unsaved) {
                    savedStarGift2.unsaved = false;
                    j8 F = u8.y(c6Var.a, false).F(c6Var.T1, false);
                    if (F != null) {
                        TL_stars.SavedStarGift savedStarGift3 = c6Var.B2;
                        F.m(savedStarGift3, savedStarGift3.unsaved);
                    }
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = c6Var.B1();
                    savestargift.unsave = c6Var.B2.unsaved;
                    ConnectionsManager.getInstance(c6Var.a).sendRequest(savestargift, null, 64);
                }
                TL_stars.SavedStarGift savedStarGift4 = c6Var.B2;
                boolean z13 = savedStarGift4.pinned_to_top;
                if (((l8) c6Var.C2).o(savedStarGift4, !z13, false)) {
                    new bi.h4(c6Var.getContext(), c6Var.T1, c6Var.B2, c6Var.J0, new w1(c6Var, i15)).show();
                    break;
                } else if (z13) {
                    org.telegram.messenger.k5.n(null, 2131749880, c6Var.k(), R.raw.ic_unpin, 36);
                    break;
                } else {
                    c6Var.k().I(R.raw.ic_pin, hd.M0(2131750076, null), hd.M0(2131750077, null)).j();
                    break;
                }
            case 14:
                long x12 = c6Var.x1();
                if (x12 != 0) {
                    c6Var.V1(x12);
                    break;
                }
                break;
            case 15:
                c6 c6Var2 = this.b;
                TL_stars.InputSavedStarGift B12 = c6Var2.B1();
                if (B12 != null) {
                    long e10 = m10.i(c6Var2.a).e();
                    gj gjVar2 = c6Var2.D2;
                    if (gjVar2 != null && (message = gjVar2.k) != null) {
                        TLRPC.MessageAction messageAction2 = message.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.Peer peer = ((TLRPC.TL_messageActionStarGift) messageAction2).peer;
                            if (peer != null) {
                                e10 = org.telegram.messenger.m5.o(peer);
                            }
                            long j15 = e10;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, c6Var2.getContext(), c6Var2.J0);
                            String M0 = hd.M0(2131750218, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = M0;
                            t1Var.U = hd.M0(2131750217, null);
                            alertDialog$Builder.k(hd.M0(2131751598, null), new h(c6Var2, B12, j15, 1));
                            alertDialog$Builder.h(hd.M0(2131752589, null), null);
                            alertDialog$Builder.d(-1);
                            alertDialog$Builder.p();
                            break;
                        }
                    }
                    if (c6Var2.B2 != null) {
                        e10 = c6Var2.T1;
                        long j152 = e10;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, c6Var2.getContext(), c6Var2.J0);
                        String M02 = hd.M0(2131750218, null);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                        t1Var2.S = M02;
                        t1Var2.U = hd.M0(2131750217, null);
                        alertDialog$Builder2.k(hd.M0(2131751598, null), new h(c6Var2, B12, j152, 1));
                        alertDialog$Builder2.h(hd.M0(2131752589, null), null);
                        alertDialog$Builder2.d(-1);
                        alertDialog$Builder2.p();
                    }
                }
                break;
            case 16:
                c6Var.T1(true);
                break;
            case 17:
                TL_stars.TL_starGiftUnique H1 = c6Var.H1();
                if (H1 != null) {
                    lb.i1(c6Var.getContext(), c6Var.a, H1, new q3(c6Var, H1, 2), c6Var.J0);
                    break;
                }
                break;
            case 18:
                c6Var.O1();
                break;
            case 19:
                TL_stars.TL_starGiftUnique H12 = c6Var.H1();
                new p0(c6Var.getContext(), c6Var.a, org.telegram.messenger.m5.o(H12.owner_id), H12, c6Var.J0, new l1(c6Var, i13)).show();
                break;
            case 20:
                c6Var.dismiss();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                TL_stars.TL_starGiftUnique H13 = c6Var.H1();
                if (T != null && H13 != null) {
                    yw ywVar = new yw(org.telegram.ui.Cells.y0.j(4, "onlySelect", "dialogsType", true));
                    ywVar.E2 = new a3.h(c6Var, H13, ywVar, i14);
                    T.presentFragment(ywVar);
                    break;
                }
                break;
            case 21:
                c6Var.X1();
                break;
            case 22:
                c6Var.c2();
                break;
            case 23:
                c6Var.onBackPressed();
                break;
            case 24:
                w5 w5Var = c6Var.b2;
                hi.d dVar3 = c6Var.g2;
                h5 h5Var = c6Var.L2.h;
                ImageReceiver imageReceiver = (h5Var == null || (g5Var = h5Var.c) == null) ? null : ((j5) g5Var).d;
                org.telegram.ui.Components.i9 i9Var = w5Var.d[0];
                if (imageReceiver != null && i9Var != null && i9Var.getImageReceiver() != null) {
                    ch0 B = imageReceiver.B();
                    ch0 B2 = i9Var.getImageReceiver().B();
                    if (B2 != null && B != null) {
                        B2.T(false, B.t());
                    } else if (B2 == null && B != null) {
                        imageReceiver.f();
                        i9Var.setImageDrawable(B);
                    }
                }
                w5Var.b.setAlpha(1.0f);
                w5Var.c.setAlpha(0.0f);
                if (!c6Var.n2 || c6Var.V1 == null || c6Var.C2 == null || c6Var.D1() < 0 || c6Var.C2.b(c6Var.D1()) < 0) {
                    dVar3.setFilled(true);
                    dVar3.i(hd.M0(2131747831, null), true, true);
                    dVar3.g(null, true);
                    dVar3.setOnClickListener(new k1(c6Var, i14));
                    break;
                } else {
                    dVar3.setFilled(false);
                    int b13 = c6Var.C2.b(c6Var.D1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) hd.M0(2131749855, null));
                    Object obj2 = c6Var.C2.get(b13);
                    if ((obj2 instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj2).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(document, dVar3.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar3.i(spannableStringBuilder, true, true);
                    dVar3.g(null, true);
                    dVar3.setOnClickListener(new d2(c6Var, b13, 0));
                    break;
                }
                break;
            case 25:
                if (c6Var.y1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c6Var.y1().title);
                    sb2.append(" #");
                    str2 = i5.c.l(c6Var.y1().num, ',', sb2);
                } else {
                    str2 = "";
                }
                org.telegram.ui.Components.xb I = c6Var.k().I(R.raw.gift_upgrade, hd.M0(2131749849, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749850, str2)));
                I.j = 5000;
                I.t = true;
                I.j();
                nz nzVar = c6Var.W1;
                if (nzVar != null) {
                    nzVar.c(true);
                    break;
                }
                break;
            default:
                c6Var.o1.v0(((c6) c6Var.P2.d).O2.length - 1);
                break;
        }
    }
}
