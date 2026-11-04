package ai;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import ci.bb;
import ci.e9;
import ci.lb;
import ci.t9;
import ci.v8;
import ci.wb;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.ek;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b3 extends ma implements cs {
    public static final /* synthetic */ int r2 = 0;
    public final int Q1;
    public f41 R1;
    public List S1;
    public TLRPC.DisallowedGiftsSettings T1;
    public final long U1;
    public final boolean V1;
    public final String W1;
    public final lb X1;
    public final d2 Y1;
    public final FrameLayout Z1;
    public final LinearLayout a2;
    public final hy b2;
    public final h2 c2;
    public final e2 d2;
    public final e2 e2;
    public final ArrayList f2;
    public final v8 g2;
    public int h2;
    public int i2;
    public int j2;
    public int k2;
    public boolean l2;
    public boolean m2;
    public boolean n2;
    public bb o2;
    public final s70 p2;
    public boolean q2;

    public b3(LaunchActivity launchActivity, int i3, long j10) {
        this(launchActivity, i3, j10, null, null);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.l1, getContext(), this.Q1, 0, true, new c(this, 5), this.J0);
        this.R1 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return this.V1 ? bd.M0(2131749947, null) : org.telegram.messenger.i6.m(bd.a0(null, null, 2131749856, this.W1), null, false, null, 0);
    }

    public final void d1(ArrayList arrayList, f41 f41Var) {
        long j10;
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        int i3 = 2;
        d2 d2Var = this.Y1;
        long j11 = this.U1;
        long j12 = 0;
        int i10 = 0;
        boolean z12 = this.V1;
        if (z12 || j11 < 0 || ((disallowedGiftsSettings4 = this.T1) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z10 = false;
        } else {
            arrayList.add(r31.k(d2Var));
            arrayList.add(r31.k(this.Z1));
            ArrayList arrayList2 = this.f2;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                j10 = 0;
                r31 q10 = r31.q(1, 34);
                q10.u = 1;
                arrayList.add(q10);
                r31 q11 = r31.q(2, 34);
                q11.u = 1;
                arrayList.add(q11);
                r31 q12 = r31.q(3, 34);
                q12.u = 1;
                arrayList.add(q12);
            } else {
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = p2.b;
                    long j13 = j12;
                    r31 K = r31.K(p2.class);
                    K.u = 1;
                    K.G = (vg.j) obj;
                    arrayList.add(K);
                    j12 = j13;
                }
                j10 = j12;
            }
            z10 = true;
        }
        int i13 = this.Q1;
        e9 y9 = e9.y(i13, false);
        ArrayList arrayList3 = this.l2 ? y9.J : y9.I;
        if (this.T1 != null) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new ii.k1(this, i3)).collect(Collectors.toCollection(new ek(1)));
        }
        if (j11 < j10) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new t1(i10)).collect(Collectors.toCollection(new ek(1)));
        }
        long e10 = h10.i(i13).e();
        v8 v8Var = this.g2;
        if (j11 != e10 && v8Var != null) {
            ArrayList arrayList4 = v8Var.l;
            int size2 = arrayList4.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList4.get(i14);
                i14++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (hp.s1(i13).Y5 || (arrayList3.isEmpty() && ((disallowedGiftsSettings3 = this.T1) == null || disallowedGiftsSettings3.disallow_unique_stargifts || v8Var == null || v8Var.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.T1;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(r31.D(org.telegram.messenger.g0.L(300.0f)));
            return;
        }
        if (z10) {
            arrayList.add(r31.D(org.telegram.messenger.g0.L(16.0f)));
        } else {
            arrayList.add(r31.k(d2Var));
        }
        arrayList.add(r31.k(this.a2));
        TreeSet treeSet = new TreeSet();
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.T1;
        if (disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) {
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList3.get(i15)).stars));
            }
        }
        ArrayList arrayList5 = new ArrayList();
        this.i2 = -1;
        this.h2 = -1;
        if (!arrayList3.isEmpty()) {
            this.h2 = arrayList5.size();
            arrayList5.add(bd.M0(2131749958, null));
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.T1;
        if ((disallowedGiftsSettings7 == null || !disallowedGiftsSettings7.disallow_unique_stargifts) && z11) {
            this.i2 = arrayList5.size();
            arrayList5.add(bd.M0(2131749954, null));
        }
        this.j2 = arrayList5.size();
        arrayList5.add(bd.M0(2131749957, null));
        if (this.m2 && !this.n2) {
            this.n2 = true;
            this.k2 = this.j2;
        }
        int i16 = this.k2;
        u1 u1Var = new u1(this, i10);
        int i17 = z2.b;
        r31 K2 = r31.K(z2.class);
        K2.d = 1;
        K2.G = arrayList5;
        K2.z = i16;
        K2.H = u1Var;
        arrayList.add(K2);
        boolean z13 = this.k2 == this.j2 && !z12 && j11 >= j10;
        if (z13 != this.q2) {
            this.q2 = z13;
            ViewPropertyAnimator duration = this.d2.animate().alpha(!z13 ? 1.0f : 0.0f).scaleX(!z13 ? 1.0f : 0.85f).scaleY(!z13 ? 1.0f : 0.85f).setDuration(380L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).start();
            this.e2.animate().alpha(z13 ? 1.0f : 0.0f).scaleX(z13 ? 1.0f : 0.85f).scaleY(z13 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(xqVar).start();
        }
        if (v8Var != null && this.k2 == this.i2) {
            arrayList3 = new ArrayList();
            ArrayList arrayList6 = v8Var.l;
            int size3 = arrayList6.size();
            int i18 = 0;
            while (i18 < size3) {
                Object obj3 = arrayList6.get(i18);
                i18++;
                TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj3).gift;
                if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                    arrayList3.add(starGift2);
                }
            }
        }
        int i19 = 0;
        for (int i20 = 0; i20 < arrayList3.size(); i20++) {
            TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList3.get(i20);
            int i21 = this.k2;
            if (i21 == this.h2 || i21 == this.i2 || (i21 == this.j2 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                if (starGift3.sold_out || starGift3.availability_resale <= j10 || i21 == this.j2) {
                    starGift = starGift3;
                } else {
                    r31 i22 = p2.i(i21, starGift3, i21 == this.i2, starGift3.limited && (disallowedGiftsSettings2 = this.T1) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift3;
                    arrayList.add(i22);
                    i19++;
                }
                int i23 = this.k2;
                arrayList.add(p2.i(i23, starGift, i23 == this.i2, starGift.limited && (disallowedGiftsSettings = this.T1) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i19++;
            }
        }
        int i24 = this.k2;
        int i25 = this.i2;
        if (i24 == i25 && v8Var != null && !v8Var.j) {
            v8Var.a();
            r31 q13 = r31.q(4, 34);
            q13.u = 1;
            arrayList.add(q13);
            r31 q14 = r31.q(5, 34);
            q14.u = 1;
            arrayList.add(q14);
            r31 q15 = r31.q(6, 34);
            q15.u = 1;
            arrayList.add(q15);
        } else if (i24 != i25 && y9.C) {
            r31 q16 = r31.q(4, 34);
            q16.u = 1;
            arrayList.add(q16);
            r31 q17 = r31.q(5, 34);
            q17.u = 1;
            arrayList.add(q17);
            r31 q18 = r31.q(6, 34);
            q18.u = 1;
            arrayList.add(q18);
        }
        arrayList.add(r31.D(org.telegram.messenger.g0.L(i19 >= 9 ? 40.0f : 300.0f)));
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        f41 f41Var;
        if (i3 == hs.j5) {
            f1();
            return;
        }
        if (i3 == hs.F3) {
            f41 f41Var2 = this.R1;
            if (f41Var2 != null) {
                f41Var2.O(true);
                return;
            }
            return;
        }
        if (i3 != hs.E0) {
            if (i3 != hs.I3) {
                if (i3 == hs.G3 && objArr[1] == this.g2 && (f41Var = this.R1) != null) {
                    f41Var.O(true);
                    return;
                }
                return;
            }
            if (this.J) {
                return;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
            new fc(this.c, this.J0).s(starGift.sticker, bd.M0(2131749975, null), org.telegram.messenger.g0.X2(bd.H(',', "Gift2SoldOutCount", starGift.availability_total))).j();
            f41 f41Var3 = this.R1;
            if (f41Var3 != null) {
                f41Var3.O(true);
                return;
            }
            return;
        }
        if (this.J) {
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        long j10 = this.U1;
        if (longValue == j10 && j10 > 0) {
            int i11 = this.Q1;
            TLRPC.UserFull b22 = hp.s1(i11).b2(j10);
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j10 == h10.i(i11).e() || b22 == null) ? null : b22.disallowed_stargifts;
            this.T1 = disallowedGiftsSettings;
            if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                dismiss();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.messenger.camera.q.s(bd.a0(null, null, 2131743752, org.telegram.messenger.m5.t(j10)), fc.a0(T), R.raw.error, 36);
                    return;
                }
                return;
            }
            f41 f41Var4 = this.R1;
            if (f41Var4 != null) {
                f41Var4.O(true);
            }
        }
        ArrayList arrayList = this.f2;
        if (arrayList == null || arrayList.isEmpty()) {
            f1();
            f41 f41Var5 = this.R1;
            if (f41Var5 != null) {
                f41Var5.O(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        int i3 = this.Q1;
        hs.f(i3).n(this, hs.j5);
        hs.f(i3).n(this, hs.F3);
        hs.f(i3).n(this, hs.E0);
        hs.f(i3).n(this, hs.I3);
        hs.f(i3).n(this, hs.G3);
    }

    public final void e1(boolean z10) {
        this.l2 = z10;
        this.R1.O(false);
    }

    public final void f1() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f2;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.S1) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j10 = 0;
            for (int size = this.S1.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.S1.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.S1.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            tL_premiumGiftCodeOption = null;
                            break;
                        }
                        tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
                        if (tL_premiumGiftCodeOption != tL_premiumGiftCodeOption2 && "XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency) && tL_premiumGiftCodeOption.months == tL_premiumGiftCodeOption2.months) {
                            break;
                        }
                    }
                    vg.j jVar = new vg.j(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(jVar);
                    if (org.telegram.messenger.r2.b()) {
                        if (jVar.f() > j10) {
                            j10 = jVar.f();
                        }
                    } else if (jVar.h() != null && org.telegram.messenger.r1.i().k()) {
                        e5.a aVar = new e5.a();
                        aVar.c = "inapp";
                        aVar.b = jVar.h();
                        arrayList2.add(aVar.a());
                    }
                }
            }
            if (org.telegram.messenger.r2.b()) {
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((vg.j) obj).g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                org.telegram.messenger.r1.i().o(arrayList2, new a1.c(this, 5));
            }
        }
        if (arrayList.isEmpty()) {
            xg.s.j(this.Q1, null, new u1(this, 1));
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        try {
            super.s0();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        int i3 = this.Q1;
        if (hp.s1(i3).v2()) {
            org.telegram.ui.b.b(i3);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.T1;
        if (disallowedGiftsSettings == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_unique_stargifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts) {
            super.show();
            return;
        }
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T != null) {
            org.telegram.messenger.camera.q.s(bd.a0(null, null, 2131743752, org.telegram.messenger.m5.t(this.U1)), fc.a0(T), R.raw.error, 36);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0447  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b3(final Context context, final int i3, final long j10, List list, final u10 u10Var) {
        super(context, null, false, false, null);
        int i10;
        int i11;
        this.f2 = new ArrayList();
        this.h2 = -1;
        this.i2 = -1;
        this.j2 = -1;
        new ArrayList();
        this.Q1 = i3;
        this.U1 = j10;
        int i12 = 1;
        int i13 = 0;
        boolean z10 = h10.i(i3).e() == j10;
        this.V1 = z10;
        this.S1 = list;
        int i14 = org.telegram.ui.ActionBar.k6.b6;
        w0(i14);
        P(i14);
        this.g2 = e9.y(i3, false).G(h10.i(i3).e(), true);
        e9.y(i3, false).U();
        k9 k9Var = new k9(context);
        int i15 = 2;
        k9Var.setImportantForAccessibility(2);
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        int i16 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i16 > 0) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
            this.W1 = l10.k(a22);
            u8Var.r(a22);
            k9Var.e(a22, u8Var);
            TLRPC.UserFull b22 = hp.s1(i3).b2(j10);
            this.T1 = (j10 == h10.i(i3).e() || b22 == null) ? null : b22.disallowed_stargifts;
            if (b22 == null) {
                hp.s1(i3).W2(a22, 0, true, null);
            }
            i10 = i16;
        } else {
            i10 = i16;
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
            this.W1 = M0 == null ? "" : M0.title;
            u8Var.q(M0);
            k9Var.e(M0, u8Var);
        }
        this.s1 = 0.1f;
        lb lbVar = new lb(i3, context, this.J0);
        this.X1 = lbVar;
        pf.a(lbVar);
        lbVar.setOnClickListener(new b(this, i15));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z1 = frameLayout;
        d2 d2Var = new d2(context, 0);
        this.Y1 = d2Var;
        d2Var.setClipChildren(false);
        d2Var.setClipToPadding(false);
        bb bbVar = new bb(context, 70, 0, 0);
        this.o2 = bbVar;
        d2Var.addView(bbVar, mf.c(-1.0f, -1));
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(42.0f));
        d2Var.addView(k9Var, mf.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        pf.a(k9Var);
        k9Var.setOnClickListener(new v(this, j10, i12));
        d2Var.addView(lbVar, mf.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, mf.e(-1, -2, 55));
        TextView g7 = org.telegram.messenger.k5.g(context, 1, 20.0f);
        g7.setTypeface(org.telegram.messenger.g0.o());
        int i17 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(g7, i17, this.J0);
        g7.setGravity(17);
        linearLayout.addView(g7, mf.t(-1, -2, 1, 4, 0, 4, 0));
        g7.setMaxWidth(gi.l3.a(g7.getText(), g7.getPaint()));
        s70 s70Var = new s70(context, this.J0);
        int i18 = org.telegram.ui.ActionBar.k6.Uc;
        org.telegram.ui.ActionBar.r6.H(s70Var, i18, this.J0);
        s70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, i17, this.J0);
        s70Var.setGravity(17);
        s70Var.setLineSpacing(org.telegram.messenger.g0.L(2.33f), 1.0f);
        linearLayout.addView(s70Var, mf.t(-1, -2, 1, 4, 4, 4, 12));
        g7.setText(bd.M0(2131750083, null));
        s70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131750082, this.W1)), " ", org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(bd.M0(2131750081, null), new y1(0)), true)));
        s70Var.setMaxWidth(gi.l3.a(s70Var.getText(), s70Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a2 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(textView, i17, this.J0);
        textView.setGravity(17);
        linearLayout2.addView(textView, mf.t(-1, -2, 1, 4, 0, 4, 0));
        e2 e2Var = new e2(i13, context, this.J0);
        this.d2 = e2Var;
        org.telegram.ui.ActionBar.r6.H(e2Var, i18, this.J0);
        e2Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(e2Var, i17, this.J0);
        e2Var.setGravity(17);
        e2 e2Var2 = new e2(i12, context, this.J0);
        this.e2 = e2Var2;
        org.telegram.ui.ActionBar.r6.H(e2Var2, i18, this.J0);
        e2Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(e2Var2, i17, this.J0);
        e2Var2.setGravity(17);
        e2Var2.setAlpha(0.0f);
        e2Var2.setScaleX(0.85f);
        e2Var2.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(e2Var, mf.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(e2Var2, mf.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView.setText(bd.M0(i10 < 0 ? 2131749973 : z10 ? 2131749964 : 2131749974, null));
        int i19 = hs.G3;
        if (z10) {
            linearLayout2.addView(frameLayout2, mf.t(-2, -2, 1, 0, 9, 0, 4));
            s70 s70Var2 = new s70(context, this.J0);
            org.telegram.ui.ActionBar.r6.H(s70Var2, i18, this.J0);
            s70Var2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(s70Var2, i17, this.J0);
            s70Var2.setGravity(17);
            linearLayout2.addView(s70Var2, mf.t(-2, -2, 1, 26, 4, 26, 6));
            e2Var.setText(bd.M0(2131749963, null));
            s70Var2.setText(bd.M0(2131749962, null));
            this.p2 = s70Var2;
        } else {
            if (i10 >= 0) {
                linearLayout2.addView(frameLayout2, mf.t(-1, -2, 1, 0, 9, 0, 6));
                v8 G = e9.y(i3, false).G(j10, true);
                z1 z1Var = new z1(this, G, j10, u10Var, context, 0);
                z1Var.run();
                e2Var.addOnAttachStateChangeListener(new f2(z1Var, 0));
                i11 = 3;
                if (G.l.size() < 3) {
                    G.a();
                }
                hs.f(i3).h(e2Var, i19, new o1(i12, G, z1Var));
                hy hyVar = new hy(i11, false);
                this.b2 = hyVar;
                hyVar.O = new g2(this, 0);
                this.l1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                this.l1.setClipToPadding(false);
                this.l1.setClipChildren(false);
                this.l1.setLayoutManager(hyVar);
                this.l1.setSelectorType(9);
                this.l1.setSelectorDrawableColor(0);
                h2 h2Var = new h2();
                this.c2 = h2Var;
                h2Var.C = false;
                h2Var.m = false;
                h2Var.n(350L);
                h2Var.o(xq.h);
                h2Var.D = 40L;
                this.l1.setItemAnimator(h2Var);
                this.l1.setOnItemClickListener(new fj0() { // from class: ai.a2
                    @Override // org.telegram.ui.Components.fj0
                    public final void f(int i20, View view) {
                        TL_stars.SavedStarGift savedStarGift;
                        b3 b3Var = b3.this;
                        org.telegram.ui.ActionBar.j2 j2Var = b3Var.c;
                        r31 G2 = b3Var.R1.G(i20 - 1);
                        if (G2 != null && G2.H(p2.class)) {
                            Object obj = G2.G;
                            boolean z11 = obj instanceof vg.j;
                            Context context2 = context;
                            int i21 = i3;
                            u10 u10Var2 = u10Var;
                            int i22 = 0;
                            if (z11) {
                                new i2(b3Var, context2, i21, (vg.j) obj, b3Var.U1, new l1(b3Var, u10Var2, i22)).show();
                                return;
                            }
                            if (obj instanceof TL_stars.StarGift) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                                v8 v8Var = b3Var.g2;
                                long j11 = j10;
                                if (v8Var != null && b3Var.k2 == b3Var.i2) {
                                    ArrayList arrayList = v8Var.l;
                                    int size = arrayList.size();
                                    while (true) {
                                        if (i22 >= size) {
                                            savedStarGift = null;
                                            break;
                                        }
                                        Object obj2 = arrayList.get(i22);
                                        i22++;
                                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                                        ArrayList arrayList2 = arrayList;
                                        if (savedStarGift2.gift.id == starGift.id) {
                                            savedStarGift = savedStarGift2;
                                            break;
                                        }
                                        arrayList = arrayList2;
                                    }
                                    if (savedStarGift == null) {
                                        return;
                                    }
                                    j2 j2Var2 = new j2(b3Var, b3Var.getContext(), i21, h10.i(i21).e(), b3Var.J0);
                                    j2Var2.j2(savedStarGift, null);
                                    j2Var2.Y1(j11, new m1(b3Var, j2Var2, j11, u10Var2, 0));
                                    return;
                                }
                                if (G2.q && starGift.availability_resale > 0) {
                                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                    if (T == null) {
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                                    b2Var.a = true;
                                    b2Var.e = true;
                                    k2 k2Var = new k2(j11, starGift.title, starGift.id, b3Var.J0, j2Var.getViewTreeObserver(), new n1());
                                    k2Var.e = new o1(i22, b3Var, u10Var2);
                                    T.showAsSheet(k2Var, b2Var);
                                    return;
                                }
                                if (starGift.auction) {
                                    s0.e1(context2, b3Var.J0, i21, j11, starGift.id, new l1(b3Var, u10Var2, 1));
                                    return;
                                }
                                if (!starGift.sold_out) {
                                    if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                                        new fc(j2Var, b3Var.J0).R(starGift.getDocument(), org.telegram.messenger.g0.X2(bd.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                                        return;
                                    }
                                    p1 p1Var = new p1(b3Var, context2, i21, starGift, u10Var2, 0);
                                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i21).getCurrentTime()) {
                                        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, b3Var.getContext(), null);
                                        s1Var.r(500L);
                                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                                        checkcansendgift.gift_id = starGift.id;
                                        ConnectionsManager.getInstance(i21).sendRequest(checkcansendgift, new q1(b3Var, s1Var, p1Var, u10Var2, 0));
                                        return;
                                    }
                                    if (!starGift.require_premium || h10.i(i21).q()) {
                                        p1Var.run();
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                                    if (T2 == null) {
                                        return;
                                    }
                                    vg.h1 h1Var = new vg.h1(T2, i21, null, null, starGift, b3Var.J0);
                                    k9 k9Var2 = new k9(b3Var.getContext());
                                    org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(160.0f), 4, k9Var2, false);
                                    k9Var2.setImageDrawable(e5Var);
                                    k9Var2.addOnAttachStateChangeListener(new c2(e5Var, 0));
                                    e5Var.i(starGift.getDocument(), false);
                                    h1Var.u2 = k9Var2;
                                    h1Var.show();
                                    e5Var.f();
                                    return;
                                }
                                org.telegram.ui.ActionBar.e6 e6Var = b3Var.J0;
                                if (context2 == null) {
                                    return;
                                }
                                org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context2, e6Var, false);
                                LinearLayout f10 = org.telegram.messenger.k5.f(context2, 1);
                                f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                                f10.setClipChildren(false);
                                f10.setClipToPadding(false);
                                k9 k9Var3 = new k9(context2);
                                wb.d1(k9Var3.getImageReceiver(), starGift, hs.q2);
                                f10.addView(k9Var3, mf.t(hs.q2, hs.q2, 17, 0, -8, 0, 10));
                                TextView textView2 = new TextView(context2);
                                org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.j5, e6Var, 1, 20.0f);
                                org.telegram.messenger.k5.m(textView2, 17, null, 2131749977);
                                TextView f11 = org.telegram.messenger.camera.q.f(f10, textView2, mf.t(-1, -2, 17, 20, 0, 20, 4), context2);
                                f11.setTextSize(1, 14.0f);
                                f11.setTypeface(org.telegram.messenger.g0.o());
                                f11.setGravity(17);
                                org.telegram.messenger.camera.q.o(f11, org.telegram.ui.ActionBar.k6.q7, e6Var, null, 2131749978);
                                f10.addView(f11, mf.t(-1, -2, 17, 20, 0, 20, 4));
                                rx0 rx0Var = new rx0(context2, e6Var);
                                if (starGift.first_sale_date != 0) {
                                    rx0Var.g(starGift.first_sale_date, bd.M0(2131749980, null));
                                }
                                if (starGift.last_sale_date != 0) {
                                    rx0Var.g(starGift.last_sale_date, bd.M0(2131749979, null));
                                }
                                rx0Var.c(bd.M0(2131749976, null), wb.a1(false, k2.p1.l(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                                if (starGift.limited) {
                                    wb.H0(rx0Var, i21, starGift, e6Var);
                                }
                                f10.addView(rx0Var, mf.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                                gi.d dVar = new gi.d(context2, e6Var, true);
                                dVar.i(bd.M0(2131747839, null), false, true);
                                f10.addView(dVar, mf.o(-1, 48));
                                l10.O = f10;
                                org.telegram.ui.ActionBar.t2[] t2VarArr = {l10};
                                t2VarArr[0].U0 = false;
                                dVar.setOnClickListener(new t9(t2VarArr, 2));
                                t2VarArr[0].N();
                                org.telegram.ui.ActionBar.d2 T3 = LaunchActivity.T();
                                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T3)) {
                                    t2VarArr[0].a0(T3);
                                }
                                t2VarArr[0].show();
                            }
                        }
                    }
                });
                f1();
                this.R1.O(false);
                b1();
                if (org.telegram.messenger.v1.a(i3).c(j10)) {
                    e1(true);
                }
                hs.f(i3).c(this, hs.j5);
                hs.f(i3).c(this, hs.F3);
                hs.f(i3).c(this, hs.E0);
                hs.f(i3).c(this, hs.I3);
                hs.f(i3).c(this, i19);
                this.m1.setTitle(O0());
                hs.i(this.m1.getTitleTextView());
            }
            linearLayout2.addView(frameLayout2, mf.t(-2, -2, 1, 0, 9, 0, 4));
            hs.i(e2Var);
            e2Var.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749972, this.W1)), e2Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        i11 = 3;
        hy hyVar2 = new hy(i11, false);
        this.b2 = hyVar2;
        hyVar2.O = new g2(this, 0);
        this.l1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        this.l1.setClipToPadding(false);
        this.l1.setClipChildren(false);
        this.l1.setLayoutManager(hyVar2);
        this.l1.setSelectorType(9);
        this.l1.setSelectorDrawableColor(0);
        h2 h2Var2 = new h2();
        this.c2 = h2Var2;
        h2Var2.C = false;
        h2Var2.m = false;
        h2Var2.n(350L);
        h2Var2.o(xq.h);
        h2Var2.D = 40L;
        this.l1.setItemAnimator(h2Var2);
        this.l1.setOnItemClickListener(new fj0() { // from class: ai.a2
            @Override // org.telegram.ui.Components.fj0
            public final void f(int i20, View view) {
                TL_stars.SavedStarGift savedStarGift;
                b3 b3Var = b3.this;
                org.telegram.ui.ActionBar.j2 j2Var = b3Var.c;
                r31 G2 = b3Var.R1.G(i20 - 1);
                if (G2 != null && G2.H(p2.class)) {
                    Object obj = G2.G;
                    boolean z11 = obj instanceof vg.j;
                    Context context2 = context;
                    int i21 = i3;
                    u10 u10Var2 = u10Var;
                    int i22 = 0;
                    if (z11) {
                        new i2(b3Var, context2, i21, (vg.j) obj, b3Var.U1, new l1(b3Var, u10Var2, i22)).show();
                        return;
                    }
                    if (obj instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                        v8 v8Var = b3Var.g2;
                        long j11 = j10;
                        if (v8Var != null && b3Var.k2 == b3Var.i2) {
                            ArrayList arrayList = v8Var.l;
                            int size = arrayList.size();
                            while (true) {
                                if (i22 >= size) {
                                    savedStarGift = null;
                                    break;
                                }
                                Object obj2 = arrayList.get(i22);
                                i22++;
                                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                                ArrayList arrayList2 = arrayList;
                                if (savedStarGift2.gift.id == starGift.id) {
                                    savedStarGift = savedStarGift2;
                                    break;
                                }
                                arrayList = arrayList2;
                            }
                            if (savedStarGift == null) {
                                return;
                            }
                            j2 j2Var2 = new j2(b3Var, b3Var.getContext(), i21, h10.i(i21).e(), b3Var.J0);
                            j2Var2.j2(savedStarGift, null);
                            j2Var2.Y1(j11, new m1(b3Var, j2Var2, j11, u10Var2, 0));
                            return;
                        }
                        if (G2.q && starGift.availability_resale > 0) {
                            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                            if (T == null) {
                                return;
                            }
                            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                            b2Var.a = true;
                            b2Var.e = true;
                            k2 k2Var = new k2(j11, starGift.title, starGift.id, b3Var.J0, j2Var.getViewTreeObserver(), new n1());
                            k2Var.e = new o1(i22, b3Var, u10Var2);
                            T.showAsSheet(k2Var, b2Var);
                            return;
                        }
                        if (starGift.auction) {
                            s0.e1(context2, b3Var.J0, i21, j11, starGift.id, new l1(b3Var, u10Var2, 1));
                            return;
                        }
                        if (!starGift.sold_out) {
                            if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                                new fc(j2Var, b3Var.J0).R(starGift.getDocument(), org.telegram.messenger.g0.X2(bd.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                                return;
                            }
                            p1 p1Var = new p1(b3Var, context2, i21, starGift, u10Var2, 0);
                            if (starGift.locked_until_date > ConnectionsManager.getInstance(i21).getCurrentTime()) {
                                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, b3Var.getContext(), null);
                                s1Var.r(500L);
                                TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                                checkcansendgift.gift_id = starGift.id;
                                ConnectionsManager.getInstance(i21).sendRequest(checkcansendgift, new q1(b3Var, s1Var, p1Var, u10Var2, 0));
                                return;
                            }
                            if (!starGift.require_premium || h10.i(i21).q()) {
                                p1Var.run();
                                return;
                            }
                            org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                            if (T2 == null) {
                                return;
                            }
                            vg.h1 h1Var = new vg.h1(T2, i21, null, null, starGift, b3Var.J0);
                            k9 k9Var2 = new k9(b3Var.getContext());
                            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(160.0f), 4, k9Var2, false);
                            k9Var2.setImageDrawable(e5Var);
                            k9Var2.addOnAttachStateChangeListener(new c2(e5Var, 0));
                            e5Var.i(starGift.getDocument(), false);
                            h1Var.u2 = k9Var2;
                            h1Var.show();
                            e5Var.f();
                            return;
                        }
                        org.telegram.ui.ActionBar.e6 e6Var = b3Var.J0;
                        if (context2 == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context2, e6Var, false);
                        LinearLayout f10 = org.telegram.messenger.k5.f(context2, 1);
                        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                        f10.setClipChildren(false);
                        f10.setClipToPadding(false);
                        k9 k9Var3 = new k9(context2);
                        wb.d1(k9Var3.getImageReceiver(), starGift, hs.q2);
                        f10.addView(k9Var3, mf.t(hs.q2, hs.q2, 17, 0, -8, 0, 10));
                        TextView textView2 = new TextView(context2);
                        org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.j5, e6Var, 1, 20.0f);
                        org.telegram.messenger.k5.m(textView2, 17, null, 2131749977);
                        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView2, mf.t(-1, -2, 17, 20, 0, 20, 4), context2);
                        f11.setTextSize(1, 14.0f);
                        f11.setTypeface(org.telegram.messenger.g0.o());
                        f11.setGravity(17);
                        org.telegram.messenger.camera.q.o(f11, org.telegram.ui.ActionBar.k6.q7, e6Var, null, 2131749978);
                        f10.addView(f11, mf.t(-1, -2, 17, 20, 0, 20, 4));
                        rx0 rx0Var = new rx0(context2, e6Var);
                        if (starGift.first_sale_date != 0) {
                            rx0Var.g(starGift.first_sale_date, bd.M0(2131749980, null));
                        }
                        if (starGift.last_sale_date != 0) {
                            rx0Var.g(starGift.last_sale_date, bd.M0(2131749979, null));
                        }
                        rx0Var.c(bd.M0(2131749976, null), wb.a1(false, k2.p1.l(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            wb.H0(rx0Var, i21, starGift, e6Var);
                        }
                        f10.addView(rx0Var, mf.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        gi.d dVar = new gi.d(context2, e6Var, true);
                        dVar.i(bd.M0(2131747839, null), false, true);
                        f10.addView(dVar, mf.o(-1, 48));
                        l10.O = f10;
                        org.telegram.ui.ActionBar.t2[] t2VarArr = {l10};
                        t2VarArr[0].U0 = false;
                        dVar.setOnClickListener(new t9(t2VarArr, 2));
                        t2VarArr[0].N();
                        org.telegram.ui.ActionBar.d2 T3 = LaunchActivity.T();
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T3)) {
                            t2VarArr[0].a0(T3);
                        }
                        t2VarArr[0].show();
                    }
                }
            }
        });
        f1();
        this.R1.O(false);
        b1();
        if (org.telegram.messenger.v1.a(i3).c(j10)) {
        }
        hs.f(i3).c(this, hs.j5);
        hs.f(i3).c(this, hs.F3);
        hs.f(i3).c(this, hs.E0);
        hs.f(i3).c(this, hs.I3);
        hs.f(i3).c(this, i19);
        this.m1.setTitle(O0());
        hs.i(this.m1.getTitleTextView());
    }
}
