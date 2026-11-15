package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import di.ab;
import di.l8;
import di.lb;
import di.qa;
import di.u8;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.lk;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s2 extends ja implements is {
    public static final /* synthetic */ int u2 = 0;
    public final int T1;
    public p41 U1;
    public List V1;
    public TLRPC.DisallowedGiftsSettings W1;
    public final long X1;
    public final boolean Y1;
    public final String Z1;
    public final ab a2;
    public final v1 b2;
    public final FrameLayout c2;
    public final LinearLayout d2;
    public final oy e2;
    public final z1 f2;
    public final w1 g2;
    public final w1 h2;
    public final ArrayList i2;
    public final l8 j2;
    public int k2;
    public int l2;
    public int m2;
    public int n2;
    public boolean o2;
    public boolean p2;
    public boolean q2;
    public qa r2;
    public final z70 s2;
    public boolean t2;

    public s2(LaunchActivity launchActivity, int i7, long j3) {
        this(launchActivity, i7, j3, null, null);
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.o1, getContext(), this.T1, 0, true, new b(this, 5), this.J0);
        this.U1 = p41Var;
        p41Var.r = false;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return this.Y1 ? hd.M0(2131749939, null) : org.telegram.messenger.j6.m(hd.a0(null, null, 2131749848, this.Z1), null, false, null, 0);
    }

    public final void d1(ArrayList arrayList, p41 p41Var) {
        long j3;
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        int i7 = 3;
        int i10 = 2;
        v1 v1Var = this.b2;
        long j10 = this.X1;
        long j11 = 0;
        int i11 = 0;
        boolean z12 = this.Y1;
        if (z12 || j10 < 0 || ((disallowedGiftsSettings4 = this.W1) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j3 = 0;
            z10 = false;
        } else {
            arrayList.add(b41.k(v1Var));
            arrayList.add(b41.k(this.c2));
            ArrayList arrayList2 = this.i2;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                j3 = 0;
                b41 q10 = b41.q(1, 34);
                q10.u = 1;
                arrayList.add(q10);
                b41 q11 = b41.q(2, 34);
                q11.u = 1;
                arrayList.add(q11);
                b41 q12 = b41.q(3, 34);
                q12.u = 1;
                arrayList.add(q12);
            } else {
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    int i13 = h2.b;
                    b41 K = b41.K(h2.class);
                    K.u = 1;
                    K.G = (ug.j) obj;
                    arrayList.add(K);
                    j11 = j11;
                }
                j3 = j11;
            }
            z10 = true;
        }
        int i14 = this.T1;
        u8 y10 = u8.y(i14, false);
        ArrayList arrayList3 = this.o2 ? y10.J : y10.I;
        if (this.W1 != null) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new ki.k1(this, i10)).collect(Collectors.toCollection(new lk(1)));
        }
        if (j10 < j3) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new aa.m(i7)).collect(Collectors.toCollection(new lk(1)));
        }
        long e10 = m10.i(i14).e();
        l8 l8Var = this.j2;
        if (j10 != e10 && l8Var != null) {
            ArrayList arrayList4 = l8Var.l;
            int size2 = arrayList4.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList4.get(i15);
                i15++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (np.s1(i14).Z5 || (arrayList3.isEmpty() && ((disallowedGiftsSettings3 = this.W1) == null || disallowedGiftsSettings3.disallow_unique_stargifts || l8Var == null || l8Var.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.W1;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(b41.D(org.telegram.messenger.g0.L(300.0f)));
            return;
        }
        if (z10) {
            arrayList.add(b41.D(org.telegram.messenger.g0.L(16.0f)));
        } else {
            arrayList.add(b41.k(v1Var));
        }
        arrayList.add(b41.k(this.d2));
        TreeSet treeSet = new TreeSet();
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.W1;
        if (disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) {
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList3.get(i16)).stars));
            }
        }
        ArrayList arrayList5 = new ArrayList();
        this.l2 = -1;
        this.k2 = -1;
        if (!arrayList3.isEmpty()) {
            this.k2 = arrayList5.size();
            arrayList5.add(hd.M0(2131749950, null));
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.W1;
        if ((disallowedGiftsSettings7 == null || !disallowedGiftsSettings7.disallow_unique_stargifts) && z11) {
            this.l2 = arrayList5.size();
            arrayList5.add(hd.M0(2131749946, null));
        }
        this.m2 = arrayList5.size();
        arrayList5.add(hd.M0(2131749949, null));
        if (this.p2 && !this.q2) {
            this.q2 = true;
            this.n2 = this.m2;
        }
        int i17 = this.n2;
        n1 n1Var = new n1(this, i11);
        int i18 = q2.b;
        b41 K2 = b41.K(q2.class);
        K2.d = 1;
        K2.G = arrayList5;
        K2.z = i17;
        K2.H = n1Var;
        arrayList.add(K2);
        boolean z13 = this.n2 == this.m2 && !z12 && j10 >= j3;
        if (z13 != this.t2) {
            this.t2 = z13;
            ViewPropertyAnimator duration = this.g2.animate().alpha(!z13 ? 1.0f : 0.0f).scaleX(!z13 ? 1.0f : 0.85f).scaleY(!z13 ? 1.0f : 0.85f).setDuration(380L);
            er erVar = er.h;
            duration.setInterpolator(erVar).start();
            this.h2.animate().alpha(z13 ? 1.0f : 0.0f).scaleX(z13 ? 1.0f : 0.85f).scaleY(z13 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(erVar).start();
        }
        if (l8Var != null && this.n2 == this.l2) {
            arrayList3 = new ArrayList();
            ArrayList arrayList6 = l8Var.l;
            int size3 = arrayList6.size();
            int i19 = 0;
            while (i19 < size3) {
                Object obj3 = arrayList6.get(i19);
                i19++;
                TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj3).gift;
                if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                    arrayList3.add(starGift2);
                }
            }
        }
        int i20 = 0;
        for (int i21 = 0; i21 < arrayList3.size(); i21++) {
            TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList3.get(i21);
            int i22 = this.n2;
            if (i22 == this.k2 || i22 == this.l2 || (i22 == this.m2 && (starGift3.availability_resale > j3 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                if (starGift3.sold_out || starGift3.availability_resale <= j3 || i22 == this.m2) {
                    starGift = starGift3;
                } else {
                    b41 i23 = h2.i(i22, starGift3, i22 == this.l2, starGift3.limited && (disallowedGiftsSettings2 = this.W1) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift3;
                    arrayList.add(i23);
                    i20++;
                }
                int i24 = this.n2;
                arrayList.add(h2.i(i24, starGift, i24 == this.l2, starGift.limited && (disallowedGiftsSettings = this.W1) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i20++;
            }
        }
        int i25 = this.n2;
        int i26 = this.l2;
        if (i25 == i26 && l8Var != null && !l8Var.j) {
            l8Var.a();
            b41 q13 = b41.q(4, 34);
            q13.u = 1;
            arrayList.add(q13);
            b41 q14 = b41.q(5, 34);
            q14.u = 1;
            arrayList.add(q14);
            b41 q15 = b41.q(6, 34);
            q15.u = 1;
            arrayList.add(q15);
        } else if (i25 != i26 && y10.C) {
            b41 q16 = b41.q(4, 34);
            q16.u = 1;
            arrayList.add(q16);
            b41 q17 = b41.q(5, 34);
            q17.u = 1;
            arrayList.add(q17);
            b41 q18 = b41.q(6, 34);
            q18.u = 1;
            arrayList.add(q18);
        }
        arrayList.add(b41.D(org.telegram.messenger.g0.L(i20 < 9 ? 300.0f : 40.0f)));
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p41 p41Var;
        if (i7 == ns.j5) {
            f1();
            return;
        }
        if (i7 == ns.F3) {
            p41 p41Var2 = this.U1;
            if (p41Var2 != null) {
                p41Var2.O(true);
                return;
            }
            return;
        }
        if (i7 != ns.E0) {
            if (i7 != ns.I3) {
                if (i7 == ns.G3 && objArr[1] == this.j2 && (p41Var = this.U1) != null) {
                    p41Var.O(true);
                    return;
                }
                return;
            }
            if (this.J) {
                return;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
            new cc(this.c, this.J0).s(starGift.sticker, hd.M0(2131749967, null), org.telegram.messenger.g0.X2(hd.H(',', "Gift2SoldOutCount", starGift.availability_total))).j();
            p41 p41Var3 = this.U1;
            if (p41Var3 != null) {
                p41Var3.O(true);
                return;
            }
            return;
        }
        if (this.J) {
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        long j3 = this.X1;
        if (longValue == j3 && j3 > 0) {
            int i11 = this.T1;
            TLRPC.UserFull b22 = np.s1(i11).b2(j3);
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j3 == m10.i(i11).e() || b22 == null) ? null : b22.disallowed_stargifts;
            this.W1 = disallowedGiftsSettings;
            if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                dismiss();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    i20.t(hd.a0(null, null, 2131743742, org.telegram.messenger.m5.t(j3)), cc.a0(T), R.raw.error, 36);
                    return;
                }
                return;
            }
            p41 p41Var4 = this.U1;
            if (p41Var4 != null) {
                p41Var4.O(true);
            }
        }
        ArrayList arrayList = this.i2;
        if (arrayList == null || arrayList.isEmpty()) {
            f1();
            p41 p41Var5 = this.U1;
            if (p41Var5 != null) {
                p41Var5.O(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        int i7 = this.T1;
        ns.f(i7).n(this, ns.j5);
        ns.f(i7).n(this, ns.F3);
        ns.f(i7).n(this, ns.E0);
        ns.f(i7).n(this, ns.I3);
        ns.f(i7).n(this, ns.G3);
    }

    public final void e1(boolean z10) {
        this.o2 = z10;
        this.U1.O(false);
    }

    public final void f1() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.i2;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.V1) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j3 = 0;
            for (int size = this.V1.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.V1.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.V1.iterator();
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
                    ug.j jVar = new ug.j(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(jVar);
                    if (org.telegram.messenger.r2.b()) {
                        if (jVar.f() > j3) {
                            j3 = jVar.f();
                        }
                    } else if (jVar.h() != null && org.telegram.messenger.r1.i().k()) {
                        f5.a aVar = new f5.a();
                        aVar.c = "inapp";
                        aVar.b = jVar.h();
                        arrayList2.add(aVar.a());
                    }
                }
            }
            if (org.telegram.messenger.r2.b()) {
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((ug.j) obj).g = j3;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                org.telegram.messenger.r1.i().o(arrayList2, new a1.c(this, 14));
            }
        }
        if (arrayList.isEmpty()) {
            wg.q.j(this.T1, null, new n1(this, 1));
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        try {
            super.s0();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        int i7 = this.T1;
        if (np.s1(i7).v2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.W1;
        if (disallowedGiftsSettings == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_unique_stargifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts) {
            super.show();
            return;
        }
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T != null) {
            i20.t(hd.a0(null, null, 2131743742, org.telegram.messenger.m5.t(this.X1)), cc.a0(T), R.raw.error, 36);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0447  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s2(final Context context, final int i7, final long j3, List list, final z10 z10Var) {
        super(context, null, false, false, null);
        int i10;
        int i11;
        this.i2 = new ArrayList();
        this.k2 = -1;
        this.l2 = -1;
        this.m2 = -1;
        new ArrayList();
        this.T1 = i7;
        this.X1 = j3;
        int i12 = 1;
        int i13 = 0;
        boolean z10 = m10.i(i7).e() == j3;
        this.Y1 = z10;
        this.V1 = list;
        int i14 = org.telegram.ui.ActionBar.j6.b6;
        w0(i14);
        Q(i14);
        this.j2 = u8.y(i7, false).G(m10.i(i7).e(), true);
        u8.y(i7, false).U();
        i9 i9Var = new i9(context);
        i9Var.setImportantForAccessibility(2);
        t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
        if (j3 > 0) {
            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(j3));
            this.Z1 = q10.k(a22);
            t8Var.r(a22);
            i9Var.f(a22, t8Var);
            TLRPC.UserFull b22 = np.s1(i7).b2(j3);
            this.W1 = (j3 == m10.i(i7).e() || b22 == null) ? null : b22.disallowed_stargifts;
            if (b22 == null) {
                np.s1(i7).W2(a22, 0, true, null);
            }
            i10 = 2;
        } else {
            i10 = 2;
            TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
            this.Z1 = M0 == null ? "" : M0.title;
            t8Var.q(M0);
            i9Var.f(M0, t8Var);
        }
        this.v1 = 0.1f;
        ab abVar = new ab(i7, context, this.J0);
        this.a2 = abVar;
        na.a(abVar);
        abVar.setOnClickListener(new ah.d(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c2 = frameLayout;
        v1 v1Var = new v1(context, i13);
        this.b2 = v1Var;
        v1Var.setClipChildren(false);
        v1Var.setClipToPadding(false);
        qa qaVar = new qa(context, 70, 0, 0);
        this.r2 = qaVar;
        v1Var.addView(qaVar, c8.ja.c(-1.0f, -1));
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(42.0f));
        v1Var.addView(i9Var, c8.ja.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        na.a(i9Var);
        i9Var.setOnClickListener(new q(this, j3, i12));
        v1Var.addView(abVar, c8.ja.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, c8.ja.e(-1, -2, 55));
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 20.0f);
        g10.setTypeface(org.telegram.messenger.g0.o());
        int i15 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(g10, i15, this.J0);
        g10.setGravity(17);
        linearLayout.addView(g10, c8.ja.t(-1, -2, 1, 4, 0, 4, 0));
        g10.setMaxWidth(hi.l3.a(g10.getText(), g10.getPaint()));
        z70 z70Var = new z70(context, this.J0);
        int i16 = org.telegram.ui.ActionBar.j6.Xc;
        org.telegram.ui.ActionBar.q6.G(z70Var, i16, this.J0);
        z70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var, i15, this.J0);
        z70Var.setGravity(17);
        z70Var.setLineSpacing(org.telegram.messenger.g0.L(2.33f), 1.0f);
        linearLayout.addView(z70Var, c8.ja.t(-1, -2, 1, 4, 4, 4, 12));
        g10.setText(hd.M0(2131750075, null));
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750074, this.Z1));
        SpannableStringBuilder H2 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(hd.M0(2131750073, null), new ai.o(4)), true);
        CharSequence[] charSequenceArr = new CharSequence[3];
        charSequenceArr[0] = X2;
        charSequenceArr[1] = " ";
        charSequenceArr[i10] = H2;
        z70Var.setText(TextUtils.concat(charSequenceArr));
        z70Var.setMaxWidth(hi.l3.a(z70Var.getText(), z70Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d2 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.U(textView, i15, this.J0);
        textView.setGravity(17);
        linearLayout2.addView(textView, c8.ja.t(-1, -2, 1, 4, 0, 4, 0));
        w1 w1Var = new w1(i13, context, this.J0);
        this.g2 = w1Var;
        org.telegram.ui.ActionBar.q6.G(w1Var, i16, this.J0);
        w1Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(w1Var, i15, this.J0);
        w1Var.setGravity(17);
        w1 w1Var2 = new w1(i12, context, this.J0);
        this.h2 = w1Var2;
        org.telegram.ui.ActionBar.q6.G(w1Var2, i16, this.J0);
        w1Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(w1Var2, i15, this.J0);
        w1Var2.setGravity(17);
        w1Var2.setAlpha(0.0f);
        w1Var2.setScaleX(0.85f);
        w1Var2.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(w1Var, c8.ja.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(w1Var2, c8.ja.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView.setText(hd.M0(j3 < 0 ? 2131749965 : z10 ? 2131749956 : 2131749966, null));
        int i17 = ns.G3;
        if (z10) {
            linearLayout2.addView(frameLayout2, c8.ja.t(-2, -2, 1, 0, 9, 0, 4));
            z70 z70Var2 = new z70(context, this.J0);
            org.telegram.ui.ActionBar.q6.G(z70Var2, i16, this.J0);
            z70Var2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.q6.U(z70Var2, i15, this.J0);
            z70Var2.setGravity(17);
            linearLayout2.addView(z70Var2, c8.ja.t(-2, -2, 1, 26, 4, 26, 6));
            w1Var.setText(hd.M0(2131749955, null));
            z70Var2.setText(hd.M0(2131749954, null));
            this.s2 = z70Var2;
        } else {
            if (j3 >= 0) {
                linearLayout2.addView(frameLayout2, c8.ja.t(-1, -2, 1, 0, 9, 0, 6));
                l8 G = u8.y(i7, false).G(j3, true);
                r1 r1Var = new r1(this, G, j3, z10Var, context, 0);
                r1Var.run();
                w1Var.addOnAttachStateChangeListener(new x1(r1Var, 0));
                i11 = 3;
                if (G.l.size() < 3) {
                    G.a();
                }
                ns.f(i7).h(w1Var, i17, new ai.v1(i10, G, r1Var));
                oy oyVar = new oy(i11, false);
                this.e2 = oyVar;
                oyVar.O = new y1(this, 0);
                this.o1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                this.o1.setClipToPadding(false);
                this.o1.setClipChildren(false);
                this.o1.setLayoutManager(oyVar);
                this.o1.setSelectorType(9);
                this.o1.setSelectorDrawableColor(0);
                z1 z1Var = new z1();
                this.f2 = z1Var;
                z1Var.C = false;
                z1Var.m = false;
                z1Var.n(350L);
                z1Var.o(er.h);
                z1Var.D = 40L;
                this.o1.setItemAnimator(z1Var);
                this.o1.setOnItemClickListener(new gj0() { // from class: bi.s1
                    @Override // org.telegram.ui.Components.gj0
                    public final void b(int i18, View view) {
                        TL_stars.SavedStarGift savedStarGift;
                        s2 s2Var = s2.this;
                        org.telegram.ui.ActionBar.k2 k2Var = s2Var.c;
                        b41 G2 = s2Var.U1.G(i18 - 1);
                        if (G2 != null && G2.H(h2.class)) {
                            Object obj = G2.G;
                            boolean z11 = obj instanceof ug.j;
                            Context context2 = context;
                            int i19 = i7;
                            z10 z10Var2 = z10Var;
                            if (z11) {
                                new a2(s2Var, context2, i19, (ug.j) obj, s2Var.X1, new k1(s2Var, z10Var2, 2)).show();
                                return;
                            }
                            if (obj instanceof TL_stars.StarGift) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                                l8 l8Var = s2Var.j2;
                                long j10 = j3;
                                int i20 = 0;
                                if (l8Var != null && s2Var.n2 == s2Var.l2) {
                                    ArrayList arrayList = l8Var.l;
                                    int size = arrayList.size();
                                    while (true) {
                                        if (i20 >= size) {
                                            savedStarGift = null;
                                            break;
                                        }
                                        Object obj2 = arrayList.get(i20);
                                        i20++;
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
                                    b2 b2Var = new b2(s2Var, s2Var.getContext(), i19, m10.i(i19).e(), s2Var.J0);
                                    b2Var.k2(savedStarGift, null);
                                    b2Var.Z1(j10, new i1(s2Var, b2Var, j10, z10Var2, 0));
                                    return;
                                }
                                if (G2.q && starGift.availability_resale > 0) {
                                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                    if (T == null) {
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
                                    c2Var.a = true;
                                    c2Var.e = true;
                                    c2 c2Var2 = new c2(j10, starGift.title, starGift.id, s2Var.J0, k2Var.getViewTreeObserver(), new j1());
                                    c2Var2.e = new ai.v1(1, s2Var, z10Var2);
                                    T.showAsSheet(c2Var2, c2Var);
                                    return;
                                }
                                if (starGift.auction) {
                                    m0.e1(context2, s2Var.J0, i19, j10, starGift.id, new k1(s2Var, z10Var2, i20));
                                    return;
                                }
                                if (!starGift.sold_out) {
                                    if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                                        new cc(k2Var, s2Var.J0).R(starGift.getDocument(), org.telegram.messenger.g0.X2(hd.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                                        return;
                                    }
                                    ai.g1 g1Var = new ai.g1(s2Var, context2, i19, starGift, z10Var2, 1);
                                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i19).getCurrentTime()) {
                                        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, s2Var.getContext(), null);
                                        t1Var.r(500L);
                                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                                        checkcansendgift.gift_id = starGift.id;
                                        ConnectionsManager.getInstance(i19).sendRequest(checkcansendgift, new l1(s2Var, t1Var, g1Var, z10Var2, 0));
                                        return;
                                    }
                                    if (!starGift.require_premium || m10.i(i19).q()) {
                                        g1Var.run();
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                                    if (T2 == null) {
                                        return;
                                    }
                                    ug.g1 g1Var2 = new ug.g1(T2, i19, null, null, starGift, s2Var.J0);
                                    i9 i9Var2 = new i9(s2Var.getContext());
                                    org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(160.0f), 4, i9Var2, false);
                                    i9Var2.setImageDrawable(e5Var);
                                    i9Var2.addOnAttachStateChangeListener(new u1(e5Var, 0));
                                    e5Var.i(starGift.getDocument(), false);
                                    g1Var2.x2 = i9Var2;
                                    g1Var2.show();
                                    e5Var.f();
                                    return;
                                }
                                org.telegram.ui.ActionBar.e6 e6Var = s2Var.J0;
                                if (context2 == null) {
                                    return;
                                }
                                org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context2, e6Var, false);
                                LinearLayout f10 = org.telegram.messenger.k5.f(context2, 1);
                                f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                                f10.setClipChildren(false);
                                f10.setClipToPadding(false);
                                i9 i9Var3 = new i9(context2);
                                lb.d1(i9Var3.getImageReceiver(), starGift, ns.q2);
                                f10.addView(i9Var3, c8.ja.t(ns.q2, ns.q2, 17, 0, -8, 0, 10));
                                TextView textView2 = new TextView(context2);
                                org.telegram.messenger.k5.m(textView2, org.telegram.ui.ActionBar.j6.j5, e6Var, 1, 20.0f);
                                org.telegram.messenger.k5.l(textView2, 17, null, 2131749969);
                                TextView f11 = i20.f(f10, textView2, c8.ja.t(-1, -2, 17, 20, 0, 20, 4), context2);
                                f11.setTextSize(1, 14.0f);
                                f11.setTypeface(org.telegram.messenger.g0.o());
                                f11.setGravity(17);
                                i20.q(f11, org.telegram.ui.ActionBar.j6.q7, e6Var, null, 2131749970);
                                f10.addView(f11, c8.ja.t(-1, -2, 17, 20, 0, 20, 4));
                                vx0 vx0Var = new vx0(context2, e6Var);
                                if (starGift.first_sale_date != 0) {
                                    vx0Var.g(starGift.first_sale_date, hd.M0(2131749972, null));
                                }
                                if (starGift.last_sale_date != 0) {
                                    vx0Var.g(starGift.last_sale_date, hd.M0(2131749971, null));
                                }
                                vx0Var.c(hd.M0(2131749968, null), lb.a1(false, i5.c.l(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                                if (starGift.limited) {
                                    lb.H0(vx0Var, i19, starGift, e6Var);
                                }
                                f10.addView(vx0Var, c8.ja.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                                hi.d dVar = new hi.d(context2, e6Var, true);
                                dVar.i(hd.M0(2131747831, null), false, true);
                                f10.addView(dVar, c8.ja.o(-1, 48));
                                k10.O = f10;
                                org.telegram.ui.ActionBar.u2[] u2VarArr = {k10};
                                u2VarArr[0].U0 = false;
                                dVar.setOnClickListener(new ai.q2(u2VarArr, 3));
                                u2VarArr[0].O();
                                org.telegram.ui.ActionBar.e2 T3 = LaunchActivity.T();
                                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T3)) {
                                    u2VarArr[0].a0(T3);
                                }
                                u2VarArr[0].show();
                            }
                        }
                    }
                });
                f1();
                this.U1.O(false);
                b1();
                if (org.telegram.messenger.v1.a(i7).c(j3)) {
                    e1(true);
                }
                ns.f(i7).c(this, ns.j5);
                ns.f(i7).c(this, ns.F3);
                ns.f(i7).c(this, ns.E0);
                ns.f(i7).c(this, ns.I3);
                ns.f(i7).c(this, i17);
                this.p1.setTitle(O0());
                ns.i(this.p1.getTitleTextView());
            }
            linearLayout2.addView(frameLayout2, c8.ja.t(-2, -2, 1, 0, 9, 0, 4));
            ns.i(w1Var);
            w1Var.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749964, this.Z1)), w1Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        i11 = 3;
        oy oyVar2 = new oy(i11, false);
        this.e2 = oyVar2;
        oyVar2.O = new y1(this, 0);
        this.o1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        this.o1.setClipToPadding(false);
        this.o1.setClipChildren(false);
        this.o1.setLayoutManager(oyVar2);
        this.o1.setSelectorType(9);
        this.o1.setSelectorDrawableColor(0);
        z1 z1Var2 = new z1();
        this.f2 = z1Var2;
        z1Var2.C = false;
        z1Var2.m = false;
        z1Var2.n(350L);
        z1Var2.o(er.h);
        z1Var2.D = 40L;
        this.o1.setItemAnimator(z1Var2);
        this.o1.setOnItemClickListener(new gj0() { // from class: bi.s1
            @Override // org.telegram.ui.Components.gj0
            public final void b(int i18, View view) {
                TL_stars.SavedStarGift savedStarGift;
                s2 s2Var = s2.this;
                org.telegram.ui.ActionBar.k2 k2Var = s2Var.c;
                b41 G2 = s2Var.U1.G(i18 - 1);
                if (G2 != null && G2.H(h2.class)) {
                    Object obj = G2.G;
                    boolean z11 = obj instanceof ug.j;
                    Context context2 = context;
                    int i19 = i7;
                    z10 z10Var2 = z10Var;
                    if (z11) {
                        new a2(s2Var, context2, i19, (ug.j) obj, s2Var.X1, new k1(s2Var, z10Var2, 2)).show();
                        return;
                    }
                    if (obj instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                        l8 l8Var = s2Var.j2;
                        long j10 = j3;
                        int i20 = 0;
                        if (l8Var != null && s2Var.n2 == s2Var.l2) {
                            ArrayList arrayList = l8Var.l;
                            int size = arrayList.size();
                            while (true) {
                                if (i20 >= size) {
                                    savedStarGift = null;
                                    break;
                                }
                                Object obj2 = arrayList.get(i20);
                                i20++;
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
                            b2 b2Var = new b2(s2Var, s2Var.getContext(), i19, m10.i(i19).e(), s2Var.J0);
                            b2Var.k2(savedStarGift, null);
                            b2Var.Z1(j10, new i1(s2Var, b2Var, j10, z10Var2, 0));
                            return;
                        }
                        if (G2.q && starGift.availability_resale > 0) {
                            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                            if (T == null) {
                                return;
                            }
                            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
                            c2Var.a = true;
                            c2Var.e = true;
                            c2 c2Var2 = new c2(j10, starGift.title, starGift.id, s2Var.J0, k2Var.getViewTreeObserver(), new j1());
                            c2Var2.e = new ai.v1(1, s2Var, z10Var2);
                            T.showAsSheet(c2Var2, c2Var);
                            return;
                        }
                        if (starGift.auction) {
                            m0.e1(context2, s2Var.J0, i19, j10, starGift.id, new k1(s2Var, z10Var2, i20));
                            return;
                        }
                        if (!starGift.sold_out) {
                            if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                                new cc(k2Var, s2Var.J0).R(starGift.getDocument(), org.telegram.messenger.g0.X2(hd.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                                return;
                            }
                            ai.g1 g1Var = new ai.g1(s2Var, context2, i19, starGift, z10Var2, 1);
                            if (starGift.locked_until_date > ConnectionsManager.getInstance(i19).getCurrentTime()) {
                                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, s2Var.getContext(), null);
                                t1Var.r(500L);
                                TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                                checkcansendgift.gift_id = starGift.id;
                                ConnectionsManager.getInstance(i19).sendRequest(checkcansendgift, new l1(s2Var, t1Var, g1Var, z10Var2, 0));
                                return;
                            }
                            if (!starGift.require_premium || m10.i(i19).q()) {
                                g1Var.run();
                                return;
                            }
                            org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                            if (T2 == null) {
                                return;
                            }
                            ug.g1 g1Var2 = new ug.g1(T2, i19, null, null, starGift, s2Var.J0);
                            i9 i9Var2 = new i9(s2Var.getContext());
                            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(160.0f), 4, i9Var2, false);
                            i9Var2.setImageDrawable(e5Var);
                            i9Var2.addOnAttachStateChangeListener(new u1(e5Var, 0));
                            e5Var.i(starGift.getDocument(), false);
                            g1Var2.x2 = i9Var2;
                            g1Var2.show();
                            e5Var.f();
                            return;
                        }
                        org.telegram.ui.ActionBar.e6 e6Var = s2Var.J0;
                        if (context2 == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context2, e6Var, false);
                        LinearLayout f10 = org.telegram.messenger.k5.f(context2, 1);
                        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                        f10.setClipChildren(false);
                        f10.setClipToPadding(false);
                        i9 i9Var3 = new i9(context2);
                        lb.d1(i9Var3.getImageReceiver(), starGift, ns.q2);
                        f10.addView(i9Var3, c8.ja.t(ns.q2, ns.q2, 17, 0, -8, 0, 10));
                        TextView textView2 = new TextView(context2);
                        org.telegram.messenger.k5.m(textView2, org.telegram.ui.ActionBar.j6.j5, e6Var, 1, 20.0f);
                        org.telegram.messenger.k5.l(textView2, 17, null, 2131749969);
                        TextView f11 = i20.f(f10, textView2, c8.ja.t(-1, -2, 17, 20, 0, 20, 4), context2);
                        f11.setTextSize(1, 14.0f);
                        f11.setTypeface(org.telegram.messenger.g0.o());
                        f11.setGravity(17);
                        i20.q(f11, org.telegram.ui.ActionBar.j6.q7, e6Var, null, 2131749970);
                        f10.addView(f11, c8.ja.t(-1, -2, 17, 20, 0, 20, 4));
                        vx0 vx0Var = new vx0(context2, e6Var);
                        if (starGift.first_sale_date != 0) {
                            vx0Var.g(starGift.first_sale_date, hd.M0(2131749972, null));
                        }
                        if (starGift.last_sale_date != 0) {
                            vx0Var.g(starGift.last_sale_date, hd.M0(2131749971, null));
                        }
                        vx0Var.c(hd.M0(2131749968, null), lb.a1(false, i5.c.l(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            lb.H0(vx0Var, i19, starGift, e6Var);
                        }
                        f10.addView(vx0Var, c8.ja.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        hi.d dVar = new hi.d(context2, e6Var, true);
                        dVar.i(hd.M0(2131747831, null), false, true);
                        f10.addView(dVar, c8.ja.o(-1, 48));
                        k10.O = f10;
                        org.telegram.ui.ActionBar.u2[] u2VarArr = {k10};
                        u2VarArr[0].U0 = false;
                        dVar.setOnClickListener(new ai.q2(u2VarArr, 3));
                        u2VarArr[0].O();
                        org.telegram.ui.ActionBar.e2 T3 = LaunchActivity.T();
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T3)) {
                            u2VarArr[0].a0(T3);
                        }
                        u2VarArr[0].show();
                    }
                }
            }
        });
        f1();
        this.U1.O(false);
        b1();
        if (org.telegram.messenger.v1.a(i7).c(j3)) {
        }
        ns.f(i7).c(this, ns.j5);
        ns.f(i7).c(this, ns.F3);
        ns.f(i7).c(this, ns.E0);
        ns.f(i7).c(this, ns.I3);
        ns.f(i7).c(this, i17);
        this.p1.setTitle(O0());
        ns.i(this.p1.getTitleTextView());
    }
}
