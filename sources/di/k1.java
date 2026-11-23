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
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ k1(f6 f6Var, int i7) {
        this.a = i7;
        this.b = f6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x01d1, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01bb, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01bd, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0205  */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v50 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r82;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        j5 j5Var;
        String str;
        b6 b6Var;
        int i7;
        boolean z10;
        String str2;
        boolean z11;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        int i10;
        int i11;
        b6 b6Var2;
        ?? r10;
        String G;
        int i12;
        TLRPC.Message message;
        int i13 = this.a;
        int i14 = 12;
        int i15 = 0;
        f6 f6Var = this.b;
        switch (i13) {
            case 0:
                z5 z5Var = f6Var.b2;
                hi.e eVar = f6Var.g2;
                k5 k5Var = f6Var.L2.h;
                ImageReceiver imageReceiver = (k5Var == null || (j5Var = k5Var.c) == null) ? null : ((m5) j5Var).d;
                org.telegram.ui.Components.q9 q9Var = z5Var.d[0];
                if (imageReceiver != null && q9Var != null && q9Var.getImageReceiver() != null) {
                    oh0 B = imageReceiver.B();
                    oh0 B2 = q9Var.getImageReceiver().B();
                    if (B2 != null && B != null) {
                        B2.T(false, B.t());
                    } else if (B2 == null && B != null) {
                        imageReceiver.f();
                        q9Var.setImageDrawable(B);
                    }
                }
                z5Var.b.setAlpha(1.0f);
                z5Var.c.setAlpha(0.0f);
                if (!f6Var.n2 || f6Var.V1 == null || f6Var.C2 == null || f6Var.I1() < 0 || f6Var.C2.b(f6Var.I1()) < 0) {
                    eVar.setFilled(true);
                    eVar.i(hd.N0(2131747637, null), true, true);
                    eVar.g(null, true);
                    eVar.setOnClickListener(new i1(f6Var, i14));
                    break;
                } else {
                    eVar.setFilled(false);
                    int b10 = f6Var.C2.b(f6Var.I1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) hd.N0(2131749838, null));
                    Object obj = f6Var.C2.get(b10);
                    if (!(obj instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift.getDocument()) == null) {
                        r82 = 1;
                    } else {
                        spannableStringBuilder.append((CharSequence) " e");
                        r82 = 1;
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(document, eVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    eVar.i(spannableStringBuilder, r82, r82);
                    eVar.g(null, r82);
                    eVar.setOnClickListener(new j1(f6Var, b10, r82));
                    break;
                }
                break;
            case 1:
                if (f6Var.D1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f6Var.D1().title);
                    sb2.append(" #");
                    str = i5.c.l(f6Var.D1().num, ',', sb2);
                } else {
                    str = "";
                }
                org.telegram.ui.Components.gc I = f6Var.k().I(R.raw.gift_upgrade, hd.N0(2131749832, null), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749833, str)));
                I.j = 5000;
                I.t = true;
                I.j();
                wz wzVar = f6Var.W1;
                if (wzVar != null) {
                    wzVar.c(true);
                    break;
                }
                break;
            case 2:
                f6Var.o1.v0(((f6) f6Var.P2.d).O2.length - 1);
                break;
            case 3:
                f6Var.getClass();
                new ug.y0((org.telegram.ui.ActionBar.g2) new bi.b9(f6Var, 1), 12, false).show();
                break;
            case 4:
                f6Var.dismiss();
                break;
            case 5:
                if (f6Var.r3 != null) {
                    long j3 = 0;
                    for (int i16 = 0; i16 < f6Var.r3.invoice.prices.size(); i16++) {
                        j3 += f6Var.r3.invoice.prices.get(i16).amount;
                    }
                    Context context = f6Var.getContext();
                    ArrayList arrayList = f6Var.o3;
                    org.telegram.ui.ActionBar.h6 h6Var = f6Var.J0;
                    b6 b6Var3 = new b6(context, h6Var);
                    b6Var3.W1 = arrayList;
                    float f10 = b6Var3.u0 / org.telegram.messenger.g0.p;
                    LimitPreviewView limitPreviewView = new LimitPreviewView(R.drawable.star, 0, 0, b6Var3.getContext(), h6Var);
                    b6Var3.X1 = limitPreviewView;
                    float f11 = 14.0f;
                    limitPreviewView.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    limitPreviewView.setIconScale(1.8f);
                    LinearLayout.LayoutParams s5 = c8.ma.s(-1, -2, 17, f10, 20.0f, f10, 10.0f);
                    LinearLayout linearLayout = b6Var3.T1;
                    linearLayout.addView(limitPreviewView, s5);
                    b6Var3.e1(j3);
                    int i17 = org.telegram.ui.ActionBar.m6.G6;
                    TextView b11 = c8.va.b(context, 20.0f, i17, true, null);
                    org.telegram.messenger.f3.k(b11, 17, null, 2131749851);
                    b6Var3.setTitle(hd.N0(2131749851, null));
                    linearLayout.addView(b11, c8.ma.t(-1, -2, 17, 32, 0, 32, 0));
                    TextView b12 = c8.va.b(context, 14.0f, i17, false, null);
                    org.telegram.messenger.f3.k(b12, 17, null, 2131749852);
                    linearLayout.addView(b12, c8.ma.t(-1, -2, 17, 32, 10, 32, 10));
                    int currentTime = ConnectionsManager.getInstance(b6Var3.a).getCurrentTime();
                    ey0 ey0Var = new ey0(context, h6Var);
                    boolean z12 = false;
                    int i18 = 0;
                    while (true) {
                        float f12 = f11;
                        if (i18 >= arrayList.size()) {
                            b6 b6Var4 = b6Var3;
                            if (!z12) {
                                int size = arrayList.size();
                                int i19 = 0;
                                while (i19 < size) {
                                    Object obj2 = arrayList.get(i19);
                                    i19++;
                                    TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) obj2;
                                    Date date = new Date(starGiftUpgradePrice2.date * 1000);
                                    ey0Var.e(hd.E0().p0().format(date) + ", " + hd.E0().q0().format(date), pb.b1(false, i5.c.l((int) starGiftUpgradePrice2.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                                }
                            }
                            float f13 = f10 + f12;
                            linearLayout.addView(ey0Var, c8.ma.s(-1, -2, 7, f13, 16.0f, f13, 15.0f));
                            TextView b13 = c8.va.b(context, 12.0f, org.telegram.ui.ActionBar.m6.y6, false, null);
                            org.telegram.messenger.f3.k(b13, 17, null, 2131749854);
                            linearLayout.addView(b13, c8.ma.t(-1, -2, 17, 32, 0, 32, 15));
                            float f14 = b6Var4.u0 / org.telegram.messenger.g0.p;
                            FrameLayout frameLayout = new FrameLayout(b6Var4.getContext());
                            b6Var4.U1 = frameLayout;
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, frameLayout, b6Var4.J0);
                            View view = new View(b6Var4.getContext());
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view, b6Var4.J0);
                            b6Var4.U1.addView(view, c8.ma.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
                            hi.e eVar2 = new hi.e(b6Var4.getContext(), b6Var4.J0, true);
                            b6Var4.V1 = eVar2;
                            float f15 = f14 + 16.0f;
                            b6Var4.U1.addView(eVar2, c8.ma.d(-1, 48.0f, ls.E1, f15, 16.0f, f15, 16.0f));
                            b6Var4.b.addView(b6Var4.U1, c8.ma.e(-1, -2, 87));
                            ek0 ek0Var = b6Var4.o1;
                            ek0Var.setPadding(ek0Var.getPaddingLeft(), ek0Var.getPaddingTop(), ek0Var.getPaddingRight(), org.telegram.messenger.g0.L(80.0f) + ek0Var.getPaddingBottom());
                            b6Var4.V1.i(f6.t2(hd.N0(2131743643, null)), false, true);
                            b6Var4.V1.setOnClickListener(new ah.d(b6Var4, 18));
                            f6Var.m2 = b6Var4;
                            b6Var4.show();
                            break;
                        } else {
                            if (currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i18)).date || ((i7 = i18 + 1) < arrayList.size() && currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i7)).date)) {
                                b6Var = b6Var3;
                                Date date2 = new Date(r11.date * 1000);
                                ey0Var.e(hd.E0().p0().format(date2) + ", " + hd.E0().q0().format(date2), pb.b1(false, i5.c.l((int) r11.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                                z12 = true;
                            } else {
                                b6Var = b6Var3;
                            }
                            i18++;
                            f11 = f12;
                            b6Var3 = b6Var;
                        }
                    }
                }
                break;
            case 6:
                new a30(f6Var.getContext()).show();
                break;
            case 7:
                f6Var.dismiss();
                break;
            case 8:
                f6.e1(f6Var);
                break;
            case 9:
                bi.y5 y5Var = f6Var.j3;
                if (y5Var != null) {
                    y5Var.run();
                }
                f6Var.dismiss();
                break;
            case 10:
                f6.f1(f6Var);
                break;
            case 11:
                bi.y5 y5Var2 = f6Var.j3;
                if (y5Var2 != null) {
                    y5Var2.run();
                }
                f6Var.dismiss();
                break;
            case 12:
                Bundle bundle = new Bundle();
                long j10 = f6Var.T1;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                if (j10 == k10.i(f6Var.a).e()) {
                    z10 = true;
                    bundle.putBoolean("my_profile", true);
                } else {
                    z10 = true;
                }
                bundle.putBoolean("open_gifts", z10);
                bundle.putBoolean("open_gifts_upgradable", z10);
                f6.p2(new ProfileActivity(bundle, null));
                break;
            case 13:
                bi.y5 y5Var3 = f6Var.j3;
                if (y5Var3 != null) {
                    y5Var3.run();
                }
                f6Var.dismiss();
                break;
            case 14:
                f6Var.g2.setLoading(false);
                f6Var.H2(0, true, null);
                break;
            case 15:
                new a30(f6Var.getContext()).show();
                break;
            case 16:
                nq[] nqVarArr = f6Var.s3;
                hi.e eVar3 = f6Var.g2;
                if (f6Var.X2.c == 1 && !f6Var.J) {
                    TL_stars.InputSavedStarGift G1 = f6Var.G1();
                    gj gjVar = f6Var.D2;
                    if (gjVar != null) {
                        TLRPC.MessageAction messageAction = gjVar.k.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                            long j11 = tL_messageActionStarGift.upgrade_stars;
                            str2 = tL_messageActionStarGift.prepaid_upgrade_hash;
                            if (j11 <= 0) {
                                break;
                            }
                            z11 = false;
                        }
                    } else {
                        TL_stars.SavedStarGift savedStarGift = f6Var.B2;
                        if (savedStarGift != null) {
                            long j12 = savedStarGift.upgrade_stars;
                            str2 = savedStarGift.prepaid_upgrade_hash;
                            if (j12 <= 0) {
                                break;
                            }
                            z11 = false;
                        }
                    }
                    int currentTime2 = ConnectionsManager.getInstance(f6Var.a).getCurrentTime();
                    long j13 = 0;
                    if (f6Var.p3 != null) {
                        for (int i20 = 0; i20 < f6Var.p3.size(); i20++) {
                            starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) f6Var.p3.get(i20);
                            if (starGiftUpgradePrice.date >= currentTime2) {
                                i10 = i20;
                                if (f6Var.r3 != null) {
                                    for (int i21 = 0; i21 < f6Var.r3.invoice.prices.size(); i21++) {
                                        j13 += f6Var.r3.invoice.prices.get(i21).amount;
                                    }
                                }
                                long j14 = j13;
                                if (i10 > 0 || f6Var.q3) {
                                    i11 = 1;
                                } else {
                                    f6Var.q3 = true;
                                    if (f6Var.p3 != null) {
                                        for (int i22 = 0; i22 < i10; i22++) {
                                            f6Var.p3.remove(0);
                                        }
                                    }
                                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                    if (TextUtils.isEmpty(str2)) {
                                        i12 = 1;
                                        TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                                        tL_inputInvoiceStarGiftUpgrade.keep_original_details = f6Var.s2.a.q;
                                        tL_inputInvoiceStarGiftUpgrade.stargift = G1;
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                                    } else {
                                        TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                                        tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str2;
                                        i12 = 1;
                                        tL_inputInvoiceStarGiftPrepaidUpgrade.peer = np.u1(f6Var.a).l1(f6Var.T1);
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                                    }
                                    JSONObject u10 = ki.s2.u(f6Var.J0, false);
                                    if (u10 != null) {
                                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                        tL_dataJSON.data = u10.toString();
                                        tL_payments_getPaymentForm.flags |= i12;
                                    }
                                    ConnectionsManager.getInstance(f6Var.a).sendRequest(tL_payments_getPaymentForm, new w3(f6Var, i12));
                                    i11 = i12;
                                }
                                if (z11) {
                                    Object[] objArr = new Object[i11];
                                    objArr[0] = Long.valueOf(j14);
                                    eVar3.i(pb.U0(hd.a0(null, null, 2131749860, objArr), 1.13f, nqVarArr), i11, i11);
                                } else {
                                    Object[] objArr2 = new Object[i11];
                                    objArr2[0] = Long.valueOf(j14);
                                    eVar3.i(pb.U0(hd.a0(null, null, 2131750050, objArr2), 1.13f, nqVarArr), i11, i11);
                                }
                                b6Var2 = f6Var.m2;
                                if (b6Var2 != null) {
                                    b6Var2.e1(j14);
                                }
                                if (starGiftUpgradePrice == null) {
                                    int i23 = starGiftUpgradePrice.date - currentTime2;
                                    if (i23 < 86400) {
                                        r10 = 0;
                                        G = org.telegram.messenger.g0.g0(i23, false, true);
                                    } else {
                                        r10 = 0;
                                        G = hd.G(Math.round(i23 / 86400.0f), "Days", new Object[0]);
                                    }
                                    org.telegram.ui.Components.n6 n6Var = eVar3.e;
                                    n6Var.E = r10;
                                    n6Var.F = true;
                                    n6Var.G = true;
                                    n6Var.H = r10;
                                    n6Var.I = r10;
                                    Object[] objArr3 = new Object[1];
                                    objArr3[r10] = G;
                                    eVar3.g(hd.a0(null, null, 2131749859, objArr3), true);
                                    org.telegram.messenger.g0.h3(f6Var.t3, 1000L);
                                    break;
                                } else {
                                    eVar3.g(null, true);
                                    break;
                                }
                            }
                        }
                    }
                    starGiftUpgradePrice = null;
                    i10 = -1;
                    if (f6Var.r3 != null) {
                    }
                    long j142 = j13;
                    if (i10 > 0) {
                    }
                    i11 = 1;
                    if (z11) {
                    }
                    b6Var2 = f6Var.m2;
                    if (b6Var2 != null) {
                    }
                    if (starGiftUpgradePrice == null) {
                    }
                }
                break;
            case 17:
                f6Var.onBackPressed();
                break;
            case 18:
                TL_stars.SavedStarGift savedStarGift2 = f6Var.B2;
                if (savedStarGift2.unsaved) {
                    savedStarGift2.unsaved = false;
                    n8 F = y8.y(f6Var.a, false).F(f6Var.T1, false);
                    if (F != null) {
                        TL_stars.SavedStarGift savedStarGift3 = f6Var.B2;
                        F.m(savedStarGift3, savedStarGift3.unsaved);
                    }
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = f6Var.G1();
                    savestargift.unsave = f6Var.B2.unsaved;
                    ConnectionsManager.getInstance(f6Var.a).sendRequest(savestargift, null, 64);
                }
                TL_stars.SavedStarGift savedStarGift4 = f6Var.B2;
                boolean z13 = savedStarGift4.pinned_to_top;
                if (((p8) f6Var.C2).q(savedStarGift4, !z13, false)) {
                    new bi.r6(f6Var.getContext(), f6Var.T1, f6Var.B2, f6Var.J0, new a2(f6Var, i15)).show();
                    break;
                } else if (z13) {
                    org.telegram.messenger.f3.n(null, 2131749863, f6Var.k(), R.raw.ic_unpin, 36);
                    break;
                } else {
                    f6Var.k().I(R.raw.ic_pin, hd.N0(2131750059, null), hd.N0(2131750060, null)).j();
                    break;
                }
            case 19:
                f6Var.o2();
                break;
            case 20:
                f6Var.f2();
                break;
            case 21:
                f6Var.e2();
                break;
            case 22:
                f6Var.g2();
                break;
            case 23:
                long C1 = f6Var.C1();
                if (C1 != 0) {
                    f6Var.h2(C1);
                    break;
                }
                break;
            case 24:
                f6 f6Var2 = this.b;
                TL_stars.InputSavedStarGift G12 = f6Var2.G1();
                if (G12 != null) {
                    long e10 = k10.i(f6Var2.a).e();
                    gj gjVar2 = f6Var2.D2;
                    if (gjVar2 != null && (message = gjVar2.k) != null) {
                        TLRPC.MessageAction messageAction2 = message.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.Peer peer = ((TLRPC.TL_messageActionStarGift) messageAction2).peer;
                            if (peer != null) {
                                e10 = org.telegram.messenger.n5.o(peer);
                            }
                            long j15 = e10;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f6Var2.getContext(), f6Var2.J0);
                            String N0 = hd.N0(2131750201, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = N0;
                            t1Var.U = hd.N0(2131750200, null);
                            alertDialog$Builder.k(hd.N0(2131751586, null), new h(f6Var2, G12, j15, 1));
                            alertDialog$Builder.h(hd.N0(2131752577, null), null);
                            alertDialog$Builder.d(-1);
                            alertDialog$Builder.p();
                            break;
                        }
                    }
                    if (f6Var2.B2 != null) {
                        e10 = f6Var2.T1;
                        long j152 = e10;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, f6Var2.getContext(), f6Var2.J0);
                        String N02 = hd.N0(2131750201, null);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                        t1Var2.S = N02;
                        t1Var2.U = hd.N0(2131750200, null);
                        alertDialog$Builder2.k(hd.N0(2131751586, null), new h(f6Var2, G12, j152, 1));
                        alertDialog$Builder2.h(hd.N0(2131752577, null), null);
                        alertDialog$Builder2.d(-1);
                        alertDialog$Builder2.p();
                    }
                }
                break;
            case 25:
                f6Var.c2(true);
                break;
            case 26:
                f6Var.Z1();
                break;
            case 27:
                f6Var.W1();
                break;
            case 28:
                TL_stars.TL_starGiftUnique M1 = f6Var.M1();
                new bi.c5(f6Var.a, org.telegram.messenger.n5.o(M1.owner_id), f6Var.getContext(), new k1(f6Var, 4), M1, f6Var.J0).show();
                break;
            default:
                TL_stars.TL_starGiftUnique M12 = f6Var.M1();
                new o0(f6Var.a, org.telegram.messenger.n5.o(M12.owner_id), f6Var.getContext(), new k1(f6Var, 7), M12, f6Var.J0).show();
                break;
        }
    }
}
