package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c8.ma;
import c8.ra;
import di.pb;
import di.ua;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.jk;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class j3 extends sa implements fs {
    public static final /* synthetic */ int F2 = 0;
    public final f71 A2;
    public final ArrayList B2;
    public boolean C2;
    public int D2;
    public boolean E2;
    public final int T1;
    public z41 U1;
    public List V1;
    public TLRPC.DisallowedGiftsSettings W1;
    public final long X1;
    public final boolean Y1;
    public final String Z1;
    public final p2 a2;
    public final FrameLayout b2;
    public final LinearLayout c2;
    public final uy d2;
    public final t2 e2;
    public final q2 f2;
    public final q2 g2;
    public final ArrayList h2;
    public final di.o8 i2;
    public int j2;
    public int k2;
    public int l2;
    public int m2;
    public boolean n2;
    public boolean o2;
    public boolean p2;
    public ua q2;
    public final k80 r2;
    public final TextView s2;
    public final TextView t2;
    public boolean u2;
    public final org.telegram.ui.ActionBar.a5 v2;
    public final te.a w2;
    public final View x2;
    public final View y2;
    public final ai.k0 z2;

    public j3(LaunchActivity launchActivity, int i7, long j3) {
        this(launchActivity, i7, j3, null, null);
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.o1, getContext(), this.T1, 0, true, new b(this, 6), this.J0);
        this.U1 = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return this.Y1 ? gd.M0(2131749923, null) : org.telegram.messenger.j6.m(gd.a0(null, null, 2131749832, this.Z1), null, false, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126  */
    @Override // org.telegram.ui.Components.sa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(Canvas canvas, int i7) {
        float f10;
        int L;
        if (this.v2 == null) {
            return;
        }
        int i10 = org.telegram.messenger.g0.m;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        float f11 = i10;
        float max = Math.max(0.0f, f1() - f11);
        this.v2.setTranslationY(max);
        float l10 = Utilities.l(1.0f - (max / org.telegram.messenger.g0.L(24.0f)));
        float f12 = f11 + max + currentActionBarHeight;
        View view = this.u2 ? this.s2 : this.t2;
        float f13 = Float.NaN;
        ck0 ck0Var = this.o1;
        if (view != null && view.isAttachedToWindow()) {
            float height = view.getHeight();
            while (view != null && view != ck0Var) {
                height += view.getY();
                view = view.getParent() instanceof View ? (View) view.getParent() : null;
            }
            if (view == ck0Var) {
                f10 = ck0Var.getY() + height;
                this.w2.a(Float.isNaN(f10) ? f10 < f12 : f1() == -3.4028235E38f, !this.J);
                L = org.telegram.messenger.g0.L(6.0f) + currentActionBarHeight + i10;
                if (this.C2) {
                    this.z2.setVisibility(8);
                } else {
                    View view2 = this.y2.getParent() instanceof View ? (View) this.y2.getParent() : null;
                    if (view2 != null && view2.getParent() == ck0Var) {
                        ck0Var.getClass();
                        this.D2 = RecyclerView.R(view2);
                        f13 = ck0Var.getY() + view2.getY() + org.telegram.messenger.g0.L(6.0f);
                    }
                    float d = ri.a.d(i10) + max;
                    if (Float.isNaN(f13)) {
                        View childAt = ck0Var.getChildCount() > 0 ? ck0Var.getChildAt(0) : null;
                        f13 = (childAt == null || this.D2 < 0 || RecyclerView.R(childAt) <= this.D2) ? this.b.getHeight() : d;
                    }
                    float max2 = Math.max(d, f13);
                    this.z2.setTranslationY(max2);
                    this.z2.setVisibility(0);
                    L = Math.max(L, Math.round(((org.telegram.messenger.g0.L(46.0f) + d) - max) - Math.max(0.0f, max2 - d)));
                }
                this.x2.setTranslationY(max);
                this.x2.setAlpha(l10);
                if (this.x2.getLayoutParams().height == L) {
                    this.x2.getLayoutParams().height = L;
                    this.x2.requestLayout();
                    return;
                }
                return;
            }
        }
        f10 = Float.NaN;
        this.w2.a(Float.isNaN(f10) ? f10 < f12 : f1() == -3.4028235E38f, !this.J);
        L = org.telegram.messenger.g0.L(6.0f) + currentActionBarHeight + i10;
        if (this.C2) {
        }
        this.x2.setTranslationY(max);
        this.x2.setAlpha(l10);
        if (this.x2.getLayoutParams().height == L) {
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final void c1() {
        super.c1();
        org.telegram.ui.ActionBar.a5 a5Var = this.v2;
        if (a5Var != null) {
            a5Var.setTitle(P0());
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        z41 z41Var;
        if (i7 == ks.l5) {
            h1();
            return;
        }
        if (i7 == ks.H3) {
            z41 z41Var2 = this.U1;
            if (z41Var2 != null) {
                z41Var2.O(true);
                return;
            }
            return;
        }
        if (i7 != ks.E0) {
            if (i7 != ks.K3) {
                if (i7 == ks.I3 && objArr[1] == this.i2 && (z41Var = this.U1) != null) {
                    z41Var.O(true);
                    return;
                }
                return;
            }
            if (this.J) {
                return;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
            new lc(this.c, this.J0).s(starGift.sticker, gd.M0(2131749951, null), org.telegram.messenger.g0.W2(gd.H(',', "Gift2SoldOutCount", starGift.availability_total))).j();
            z41 z41Var3 = this.U1;
            if (z41Var3 != null) {
                z41Var3.O(true);
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
            TLRPC.UserFull d2 = mp.u1(i11).d2(j3);
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j3 == j10.i(i11).e() || d2 == null) ? null : d2.disallowed_stargifts;
            this.W1 = disallowedGiftsSettings;
            if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                dismiss();
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    n10.u(gd.a0(null, null, 2131743505, org.telegram.messenger.n5.t(j3)), lc.b0(T), R.raw.error, 36);
                    return;
                }
                return;
            }
            z41 z41Var4 = this.U1;
            if (z41Var4 != null) {
                z41Var4.O(true);
            }
        }
        ArrayList arrayList = this.h2;
        if (arrayList == null || arrayList.isEmpty()) {
            h1();
            z41 z41Var5 = this.U1;
            if (z41Var5 != null) {
                z41Var5.O(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        super.dismiss();
        int i7 = this.T1;
        ks.f(i7).n(this, ks.l5);
        ks.f(i7).n(this, ks.H3);
        ks.f(i7).n(this, ks.E0);
        ks.f(i7).n(this, ks.K3);
        ks.f(i7).n(this, ks.I3);
    }

    public final void e1(ArrayList arrayList, z41 z41Var) {
        long j3;
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        this.C2 = false;
        this.u2 = false;
        int i7 = 3;
        int i10 = 2;
        p2 p2Var = this.a2;
        long j10 = this.X1;
        long j11 = 0;
        boolean z12 = this.Y1;
        if (z12 || j10 < 0 || ((disallowedGiftsSettings4 = this.W1) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j3 = 0;
            z10 = false;
        } else {
            arrayList.add(l41.k(p2Var));
            this.u2 = true;
            arrayList.add(l41.k(this.b2));
            ArrayList arrayList2 = this.h2;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                j3 = 0;
                l41 q10 = l41.q(1, 34);
                q10.v = 1;
                arrayList.add(q10);
                l41 q11 = l41.q(2, 34);
                q11.v = 1;
                arrayList.add(q11);
                l41 q12 = l41.q(3, 34);
                q12.v = 1;
                arrayList.add(q12);
            } else {
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = b3.b;
                    l41 K = l41.K(b3.class);
                    K.v = 1;
                    K.H = (ug.j) obj;
                    arrayList.add(K);
                    j11 = j11;
                }
                j3 = j11;
            }
            z10 = true;
        }
        int i13 = this.T1;
        di.x8 y10 = di.x8.y(i13, false);
        ArrayList arrayList3 = this.n2 ? y10.J : y10.I;
        if (this.W1 != null) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new ki.i1(this, i10)).collect(Collectors.toCollection(new jk(1)));
        }
        if (j10 < j3) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new aa.m(i7)).collect(Collectors.toCollection(new jk(1)));
        }
        long e10 = j10.i(i13).e();
        di.o8 o8Var = this.i2;
        if (j10 != e10 && o8Var != null) {
            ArrayList arrayList4 = o8Var.l;
            int size2 = arrayList4.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList4.get(i14);
                i14++;
                TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj2).gift;
                if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && !v4.m(starGift2)) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (mp.u1(i13).b6 || (arrayList3.isEmpty() && ((disallowedGiftsSettings3 = this.W1) == null || disallowedGiftsSettings3.disallow_unique_stargifts || o8Var == null || o8Var.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.W1;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(l41.D(org.telegram.messenger.g0.L(300.0f)));
            return;
        }
        if (z10) {
            arrayList.add(l41.D(org.telegram.messenger.g0.L(16.0f)));
        } else {
            arrayList.add(l41.k(p2Var));
        }
        arrayList.add(l41.k(this.c2));
        TreeSet treeSet = new TreeSet();
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.W1;
        if (disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) {
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList3.get(i15)).stars));
            }
        }
        ArrayList arrayList5 = new ArrayList();
        this.k2 = -1;
        this.j2 = -1;
        if (!arrayList3.isEmpty()) {
            this.j2 = arrayList5.size();
            arrayList5.add(gd.M0(2131749934, null));
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.W1;
        if ((disallowedGiftsSettings7 == null || !disallowedGiftsSettings7.disallow_unique_stargifts) && z11) {
            this.k2 = arrayList5.size();
            arrayList5.add(gd.M0(2131749930, null));
        }
        this.l2 = arrayList5.size();
        arrayList5.add(gd.M0(2131749933, null));
        if (this.o2 && !this.p2) {
            this.p2 = true;
            this.m2 = this.l2;
        }
        arrayList.add(l41.n(this.y2, 52));
        this.C2 = true;
        f71 f71Var = this.A2;
        if (f71Var != null) {
            ArrayList arrayList6 = this.B2;
            if (!arrayList6.equals(arrayList5)) {
                arrayList6.clear();
                arrayList6.addAll(arrayList5);
                f71Var.c();
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    f71Var.a(i16, (CharSequence) arrayList5.get(i16));
                }
                f71Var.y.f();
                this.z2.requestLayout();
            }
            int currentTabId = f71Var.getCurrentTabId();
            int i17 = this.m2;
            if (currentTabId != i17) {
                f71Var.g(1.0f, i17);
            }
        }
        boolean z13 = this.m2 == this.l2 && !z12 && j10 >= j3;
        if (z13 != this.E2) {
            this.E2 = z13;
            ViewPropertyAnimator duration = this.f2.animate().alpha(!z13 ? 1.0f : 0.0f).scaleX(!z13 ? 1.0f : 0.85f).scaleY(!z13 ? 1.0f : 0.85f).setDuration(380L);
            lr lrVar = lr.h;
            duration.setInterpolator(lrVar).start();
            this.g2.animate().alpha(z13 ? 1.0f : 0.0f).scaleX(z13 ? 1.0f : 0.85f).scaleY(z13 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(lrVar).start();
        }
        if (o8Var != null && this.m2 == this.k2) {
            arrayList3 = new ArrayList();
            ArrayList arrayList7 = o8Var.l;
            int size3 = arrayList7.size();
            int i18 = 0;
            while (i18 < size3) {
                Object obj3 = arrayList7.get(i18);
                i18++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                TL_stars.StarGift starGift3 = savedStarGift.gift;
                if ((starGift3 instanceof TL_stars.TL_starGiftUnique) && !v4.m(starGift3)) {
                    arrayList3.add(savedStarGift.gift);
                }
            }
        }
        int i19 = 0;
        for (int i20 = 0; i20 < arrayList3.size(); i20++) {
            TL_stars.StarGift starGift4 = (TL_stars.StarGift) arrayList3.get(i20);
            int i21 = this.m2;
            if (i21 == this.j2 || i21 == this.k2 || (i21 == this.l2 && (starGift4.availability_resale > j3 || starGift4.require_premium || starGift4.locked_until_date != 0))) {
                if (starGift4.sold_out || starGift4.availability_resale <= j3 || i21 == this.l2) {
                    starGift = starGift4;
                } else {
                    l41 i22 = b3.i(i21, starGift4, i21 == this.k2, starGift4.limited && (disallowedGiftsSettings2 = this.W1) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift4;
                    arrayList.add(i22);
                    i19++;
                }
                int i23 = this.m2;
                arrayList.add(b3.i(i23, starGift, i23 == this.k2, starGift.limited && (disallowedGiftsSettings = this.W1) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i19++;
            }
        }
        int i24 = this.m2;
        int i25 = this.k2;
        if (i24 == i25 && o8Var != null && !o8Var.j) {
            o8Var.a();
            l41 q13 = l41.q(4, 34);
            q13.v = 1;
            arrayList.add(q13);
            l41 q14 = l41.q(5, 34);
            q14.v = 1;
            arrayList.add(q14);
            l41 q15 = l41.q(6, 34);
            q15.v = 1;
            arrayList.add(q15);
        } else if (i24 != i25 && y10.C) {
            l41 q16 = l41.q(4, 34);
            q16.v = 1;
            arrayList.add(q16);
            l41 q17 = l41.q(5, 34);
            q17.v = 1;
            arrayList.add(q17);
            l41 q18 = l41.q(6, 34);
            q18.v = 1;
            arrayList.add(q18);
        }
        arrayList.add(l41.D(org.telegram.messenger.g0.L(i19 >= 9 ? 40.0f : 300.0f)));
    }

    public final float f1() {
        int i7 = 0;
        float f10 = Float.MAX_VALUE;
        while (true) {
            ck0 ck0Var = this.o1;
            if (i7 >= ck0Var.getChildCount()) {
                return f10 == Float.MAX_VALUE ? ck0Var.getHeight() : f10;
            }
            View childAt = ck0Var.getChildAt(i7);
            int R = RecyclerView.R(childAt);
            if (R == 1) {
                return ck0Var.getY() + childAt.getY();
            }
            if (R > 1) {
                f10 = -3.4028235E38f;
            }
            i7++;
        }
    }

    public final void g1(boolean z10) {
        this.n2 = z10;
        this.U1.O(false);
    }

    public final void h1() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.h2;
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
                    if (org.telegram.messenger.s2.b()) {
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
            if (org.telegram.messenger.s2.b()) {
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((ug.j) obj).g = j3;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                org.telegram.messenger.r1.i().o(arrayList2, new b2(this));
            }
        }
        if (arrayList.isEmpty()) {
            wg.s.j(this.T1, null, new c2(this, 1));
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        try {
            super.s0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void show() {
        int i7 = this.T1;
        if (mp.u1(i7).A2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.W1;
        if (disallowedGiftsSettings == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_unique_stargifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts) {
            super.show();
            return;
        }
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        if (T != null) {
            n10.u(gd.a0(null, null, 2131743505, org.telegram.messenger.n5.t(this.X1)), lc.b0(T), R.raw.error, 36);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0435  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j3(final Context context, final int i7, final long j3, List list, final x10 x10Var) {
        super(context, null, false, false, null);
        int i10;
        int i11;
        this.h2 = new ArrayList();
        this.j2 = -1;
        this.k2 = -1;
        this.l2 = -1;
        new ArrayList();
        b2 b2Var = new b2(this);
        lr lrVar = lr.h;
        int i12 = 0;
        this.w2 = new te.a(0, b2Var, lrVar, 320L, false);
        this.B2 = new ArrayList();
        this.D2 = -1;
        this.T1 = i7;
        this.X1 = j3;
        int i13 = 1;
        boolean z10 = j10.i(i7).e() == j3;
        this.Y1 = z10;
        this.V1 = list;
        int i14 = org.telegram.ui.ActionBar.n6.b6;
        w0(i14);
        Q(i14);
        this.i2 = di.x8.y(i7, false).G(j10.i(i7).e(), true);
        di.x8.y(i7, false).T();
        q9 q9Var = new q9(context);
        q9Var.setImportantForAccessibility(2);
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        if (j3 > 0) {
            i10 = 2;
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
            this.Z1 = o10.l(c22);
            b9Var.r(c22);
            q9Var.f(c22, b9Var);
            TLRPC.UserFull d2 = mp.u1(i7).d2(j3);
            this.W1 = (j3 == j10.i(i7).e() || d2 == null) ? null : d2.disallowed_stargifts;
            if (d2 == null) {
                mp.u1(i7).c3(c22, 0, true, null);
            }
        } else {
            i10 = 2;
            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
            this.Z1 = O0 == null ? "" : O0.title;
            b9Var.q(O0);
            q9Var.f(O0, b9Var);
        }
        this.v1 = 0.1f;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b2 = frameLayout;
        p2 p2Var = new p2(context, i12);
        this.a2 = p2Var;
        p2Var.setClipChildren(false);
        p2Var.setClipToPadding(false);
        ua uaVar = new ua(context, 70, 0, 0);
        this.q2 = uaVar;
        p2Var.addView(uaVar, ma.c(-1.0f, -1));
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(42.0f));
        p2Var.addView(q9Var, ma.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        ra.a(q9Var);
        q9Var.setOnClickListener(new q(this, j3, i13));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, ma.e(-1, -2, 55));
        TextView textView = new TextView(context);
        this.s2 = textView;
        i5.c.x(textView, 1, 20.0f);
        int i15 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.U(textView, i15, this.J0);
        textView.setGravity(17);
        linearLayout.addView(textView, ma.t(-1, -2, 1, 4, 0, 4, 0));
        textView.setMaxWidth(hi.m3.a(textView.getText(), textView.getPaint()));
        k80 k80Var = new k80(context, this.J0);
        int i16 = org.telegram.ui.ActionBar.n6.Xc;
        org.telegram.ui.ActionBar.u6.G(k80Var, i16, this.J0);
        k80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(k80Var, i15, this.J0);
        k80Var.setGravity(17);
        k80Var.setLineSpacing(org.telegram.messenger.g0.L(2.33f), 1.0f);
        linearLayout.addView(k80Var, ma.t(-1, -2, 1, 4, 4, 4, 12));
        textView.setText(gd.M0(2131750059, null));
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750058, this.Z1));
        SpannableStringBuilder H2 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(gd.M0(2131750057, null), new ai.o(4)), true);
        CharSequence[] charSequenceArr = new CharSequence[3];
        charSequenceArr[0] = W2;
        charSequenceArr[1] = " ";
        charSequenceArr[i10] = H2;
        k80Var.setText(TextUtils.concat(charSequenceArr));
        k80Var.setMaxWidth(hi.m3.a(k80Var.getText(), k80Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.c2 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView2 = new TextView(context);
        this.t2 = textView2;
        i5.c.x(textView2, 1, 20.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, i15, this.J0);
        textView2.setGravity(17);
        linearLayout2.addView(textView2, ma.t(-1, -2, 1, 4, 0, 4, 0));
        q2 q2Var = new q2(i12, context, this.J0);
        this.f2 = q2Var;
        org.telegram.ui.ActionBar.u6.G(q2Var, i16, this.J0);
        q2Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(q2Var, i15, this.J0);
        q2Var.setGravity(17);
        q2 q2Var2 = new q2(i13, context, this.J0);
        this.g2 = q2Var2;
        org.telegram.ui.ActionBar.u6.G(q2Var2, i16, this.J0);
        q2Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(q2Var2, i15, this.J0);
        q2Var2.setGravity(17);
        q2Var2.setAlpha(0.0f);
        q2Var2.setScaleX(0.85f);
        q2Var2.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(q2Var, ma.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(q2Var2, ma.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView2.setText(gd.M0(j3 < 0 ? 2131749949 : z10 ? 2131749940 : 2131749950, null));
        int i17 = ks.I3;
        if (z10) {
            linearLayout2.addView(frameLayout2, ma.t(-2, -2, 1, 0, 9, 0, 4));
            k80 k80Var2 = new k80(context, this.J0);
            org.telegram.ui.ActionBar.u6.G(k80Var2, i16, this.J0);
            k80Var2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(k80Var2, i15, this.J0);
            k80Var2.setGravity(17);
            linearLayout2.addView(k80Var2, ma.t(-2, -2, 1, 26, 4, 26, 6));
            q2Var.setText(gd.M0(2131749939, null));
            k80Var2.setText(gd.M0(2131749938, null));
            this.r2 = k80Var2;
        } else {
            if (j3 >= 0) {
                linearLayout2.addView(frameLayout2, ma.t(-1, -2, 1, 0, 9, 0, 6));
                di.o8 G = di.x8.y(i7, false).G(j3, true);
                k2 k2Var = new k2(this, G, j3, x10Var, context, 0);
                k2Var.run();
                q2Var.addOnAttachStateChangeListener(new r2(k2Var, 0));
                i11 = 3;
                if (G.l.size() < 3) {
                    G.a();
                }
                ks.f(i7).h(q2Var, i17, new ai.v1(i10, G, k2Var));
                uy uyVar = new uy(i11, false);
                this.d2 = uyVar;
                uyVar.O = new s2(this, 0);
                this.o1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                this.o1.setClipToPadding(false);
                this.o1.setClipChildren(false);
                this.o1.setLayoutManager(uyVar);
                int i18 = 9;
                this.o1.setSelectorType(9);
                this.o1.setSelectorDrawableColor(0);
                t2 t2Var = new t2();
                this.e2 = t2Var;
                t2Var.C = false;
                t2Var.m = false;
                t2Var.n(350L);
                t2Var.o(lrVar);
                t2Var.D = 40L;
                this.o1.setItemAnimator(t2Var);
                this.o1.setOnItemClickListener(new oj0() { // from class: bi.l2
                    @Override // org.telegram.ui.Components.oj0
                    public final void c(int i19, View view) {
                        TL_stars.SavedStarGift savedStarGift;
                        j3 j3Var = j3.this;
                        org.telegram.ui.ActionBar.n2 n2Var = j3Var.c;
                        int i20 = 1;
                        l41 G2 = j3Var.U1.G(i19 - 1);
                        if (G2 != null && G2.H(b3.class)) {
                            Object obj = G2.H;
                            boolean z11 = obj instanceof ug.j;
                            Context context2 = context;
                            int i21 = i7;
                            x10 x10Var2 = x10Var;
                            int i22 = 0;
                            if (z11) {
                                new u2(j3Var, context2, i21, (ug.j) obj, j3Var.X1, new d2(j3Var, x10Var2, i22)).show();
                                return;
                            }
                            if (obj instanceof TL_stars.StarGift) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                                di.o8 o8Var = j3Var.i2;
                                long j10 = j3;
                                if (o8Var != null && j3Var.m2 == j3Var.k2) {
                                    ArrayList arrayList = o8Var.l;
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
                                    if (savedStarGift == null || v4.m(savedStarGift.gift)) {
                                        return;
                                    }
                                    v2 v2Var = new v2(j3Var, j3Var.getContext(), i21, j10.i(i21).e(), j3Var.J0);
                                    v2Var.w2(savedStarGift, null);
                                    v2Var.l2(j10, new e2(j3Var, v2Var, j10, x10Var2, 0));
                                    return;
                                }
                                if (G2.r) {
                                    if (starGift.availability_resale > 0) {
                                        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                        if (T == null) {
                                            return;
                                        }
                                        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
                                        f2Var.a = true;
                                        f2Var.e = true;
                                        w2 w2Var = new w2(j10, starGift.title, starGift.id, j3Var.J0, n2Var.getViewTreeObserver(), new f2());
                                        w2Var.e = new ai.v1(1, j3Var, x10Var2);
                                        T.showAsSheet(w2Var, f2Var);
                                        return;
                                    }
                                    i20 = 1;
                                }
                                if (starGift.auction) {
                                    m0.f1(context2, j3Var.J0, i21, j10, starGift.id, new d2(j3Var, x10Var2, i20));
                                    return;
                                }
                                if (!starGift.sold_out) {
                                    if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                                        new lc(n2Var, j3Var.J0).R(starGift.getDocument(), org.telegram.messenger.g0.W2(gd.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                                        return;
                                    }
                                    ai.g1 g1Var = new ai.g1(j3Var, context2, i21, starGift, x10Var2, 1);
                                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i21).getCurrentTime()) {
                                        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, j3Var.getContext(), null);
                                        u1Var.r(500L);
                                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                                        checkcansendgift.gift_id = starGift.id;
                                        ConnectionsManager.getInstance(i21).sendRequest(checkcansendgift, new g2(j3Var, u1Var, g1Var, x10Var2, 0));
                                        return;
                                    }
                                    if (!starGift.require_premium || j10.i(i21).q()) {
                                        g1Var.run();
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                    if (T2 == null) {
                                        return;
                                    }
                                    ug.i1 i1Var = new ug.i1(T2, i21, null, null, starGift, j3Var.J0);
                                    q9 q9Var2 = new q9(j3Var.getContext());
                                    org.telegram.ui.Components.m5 m5Var = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(160.0f), 4, q9Var2, false);
                                    q9Var2.setImageDrawable(m5Var);
                                    q9Var2.addOnAttachStateChangeListener(new o2(m5Var, 0));
                                    m5Var.i(starGift.getDocument(), false);
                                    i1Var.x2 = q9Var2;
                                    i1Var.show();
                                    m5Var.f();
                                    return;
                                }
                                org.telegram.ui.ActionBar.i6 i6Var = j3Var.J0;
                                if (context2 == null) {
                                    return;
                                }
                                org.telegram.ui.ActionBar.x2 j11 = org.telegram.messenger.f3.j(i20, context2, i6Var, false);
                                LinearLayout g10 = org.telegram.messenger.f3.g(context2, i20);
                                g10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                                g10.setClipChildren(false);
                                g10.setClipToPadding(false);
                                q9 q9Var3 = new q9(context2);
                                pb.e1(q9Var3.getImageReceiver(), starGift, ks.q2);
                                g10.addView(q9Var3, ma.t(ks.q2, ks.q2, 17, 0, -8, 0, 10));
                                TextView textView3 = new TextView(context2);
                                org.telegram.messenger.f3.l(textView3, org.telegram.ui.ActionBar.n6.j5, i6Var, 1, 20.0f);
                                org.telegram.messenger.f3.k(textView3, 17, null, 2131749953);
                                TextView f10 = n10.f(g10, textView3, ma.t(-1, -2, 17, 20, 0, 20, 4), context2);
                                f10.setTextSize(1, 14.0f);
                                f10.setTypeface(org.telegram.messenger.g0.o());
                                f10.setGravity(17);
                                n10.r(f10, org.telegram.ui.ActionBar.n6.q7, i6Var, null, 2131749954);
                                g10.addView(f10, ma.t(-1, -2, 17, 20, 0, 20, 4));
                                cy0 cy0Var = new cy0(context2, i6Var);
                                if (starGift.first_sale_date != 0) {
                                    cy0Var.g(starGift.first_sale_date, gd.M0(2131749956, null));
                                }
                                if (starGift.last_sale_date != 0) {
                                    cy0Var.g(starGift.last_sale_date, gd.M0(2131749955, null));
                                }
                                cy0Var.e(gd.M0(2131749952, null), pb.b1(false, i5.c.l(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                                if (starGift.limited) {
                                    pb.H0(cy0Var, i21, starGift, i6Var);
                                }
                                g10.addView(cy0Var, ma.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                                hi.d dVar = new hi.d(context2, i6Var, true);
                                dVar.i(gd.M0(2131747638, null), false, true);
                                g10.addView(dVar, ma.o(-1, 48));
                                j11.O = g10;
                                org.telegram.ui.ActionBar.x2[] x2VarArr = {j11};
                                x2VarArr[0].U0 = false;
                                dVar.setOnClickListener(new ai.q2(x2VarArr, 3));
                                x2VarArr[0].O();
                                org.telegram.ui.ActionBar.h2 T3 = LaunchActivity.T();
                                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T3)) {
                                    x2VarArr[0].a0(T3);
                                }
                                x2VarArr[0].show();
                            }
                        }
                    }
                });
                h1();
                this.U1.O(false);
                c1();
                if (org.telegram.messenger.v1.a(i7).c(j3)) {
                    g1(true);
                }
                ks.f(i7).c(this, ks.l5);
                ks.f(i7).c(this, ks.H3);
                ks.f(i7).c(this, ks.E0);
                ks.f(i7).c(this, ks.K3);
                ks.f(i7).c(this, i17);
                this.p1.setTitle(P0());
                ks.i(this.p1.getTitleTextView());
                org.telegram.messenger.g0.E2(this.p1);
                this.w1 = false;
                ri.q qVar = this.Y0;
                ri.a aVar = new ri.a(qVar, new b2(this));
                FrameLayout frameLayout3 = (FrameLayout) this.b;
                View view = new View(context);
                this.x2 = view;
                frameLayout3.addView(view, ma.e(-1, 0, 48));
                View view2 = this.x2;
                int i19 = this.u0;
                org.telegram.messenger.g0.z3(view2, i19, 0, i19, 0);
                View view3 = this.x2;
                view3.setBackground(aVar.a(view3));
                this.y2 = new View(context);
                f71 f71Var = new f71(-2, context, this.J0, true);
                this.A2 = f71Var;
                f71Var.r = 12;
                int i20 = org.telegram.ui.ActionBar.n6.z6;
                f71Var.h(i20, org.telegram.ui.ActionBar.n6.G6, i20, org.telegram.ui.ActionBar.n6.i6, org.telegram.ui.ActionBar.n6.d6);
                f71 f71Var2 = this.A2;
                dh.c cVar = aVar.c;
                fh.g c10 = cVar.c(f71Var2, null, false);
                c10.p(c8.i0.m(this.J0));
                c10.r(org.telegram.messenger.g0.L(20.0f));
                f71Var2.setBlurredBackground(c10);
                this.A2.setDelegate(new cb.c(this, i18));
                ai.k0 k0Var = new ai.k0(this, context, new TextPaint(1), 2);
                this.z2 = k0Var;
                k0Var.addView(this.A2, ma.e(-2, 40, 51));
                this.z2.setVisibility(8);
                frameLayout3.addView(this.z2, ma.e(-1, 40, 48));
                ai.k0 k0Var2 = this.z2;
                int i21 = this.u0;
                org.telegram.messenger.g0.z3(k0Var2, i21, 0, i21, 0);
                org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(context, this.J0);
                this.v2 = a5Var;
                a5Var.setBackButtonImage(R.drawable.ic_ab_back);
                this.v2.setTitle(P0());
                this.v2.setTitlesAlpha(0.0f);
                this.v2.setActionBarMenuOnItemClick(new r1(this, 1));
                aVar.f(frameLayout3, this.o1, this.v2, this.J0);
                org.telegram.ui.ActionBar.a5 a5Var2 = this.v2;
                int i22 = this.u0;
                org.telegram.messenger.g0.z3(a5Var2, i22, 0, i22, 0);
                this.v2.setBackground(null);
                j7 j7Var = new j7(i7, context, this.J0);
                fh.g c11 = cVar.c(j7Var, null, false);
                c11.p(c8.i0.m(this.J0));
                c11.r(org.telegram.messenger.g0.L(23.0f));
                c11.q(org.telegram.messenger.g0.L(6.0f));
                j7Var.setBackground(c11);
                ra.a(j7Var);
                j7Var.setOnClickListener(new ah.d(j7Var, 7));
                j7Var.setOnWidthChanged(new c2(this, 0));
                this.v2.addView(j7Var, ma.e(-2, 58, 5));
                qVar.i(this.b);
                this.U1.O(false);
            }
            linearLayout2.addView(frameLayout2, ma.t(-2, -2, 1, 0, 9, 0, 4));
            ks.i(q2Var);
            q2Var.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749948, this.Z1)), q2Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        i11 = 3;
        uy uyVar2 = new uy(i11, false);
        this.d2 = uyVar2;
        uyVar2.O = new s2(this, 0);
        this.o1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        this.o1.setClipToPadding(false);
        this.o1.setClipChildren(false);
        this.o1.setLayoutManager(uyVar2);
        int i182 = 9;
        this.o1.setSelectorType(9);
        this.o1.setSelectorDrawableColor(0);
        t2 t2Var2 = new t2();
        this.e2 = t2Var2;
        t2Var2.C = false;
        t2Var2.m = false;
        t2Var2.n(350L);
        t2Var2.o(lrVar);
        t2Var2.D = 40L;
        this.o1.setItemAnimator(t2Var2);
        this.o1.setOnItemClickListener(new oj0() { // from class: bi.l2
            @Override // org.telegram.ui.Components.oj0
            public final void c(int i192, View view4) {
                TL_stars.SavedStarGift savedStarGift;
                j3 j3Var = j3.this;
                org.telegram.ui.ActionBar.n2 n2Var = j3Var.c;
                int i202 = 1;
                l41 G2 = j3Var.U1.G(i192 - 1);
                if (G2 != null && G2.H(b3.class)) {
                    Object obj = G2.H;
                    boolean z11 = obj instanceof ug.j;
                    Context context2 = context;
                    int i212 = i7;
                    x10 x10Var2 = x10Var;
                    int i222 = 0;
                    if (z11) {
                        new u2(j3Var, context2, i212, (ug.j) obj, j3Var.X1, new d2(j3Var, x10Var2, i222)).show();
                        return;
                    }
                    if (obj instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                        di.o8 o8Var = j3Var.i2;
                        long j10 = j3;
                        if (o8Var != null && j3Var.m2 == j3Var.k2) {
                            ArrayList arrayList = o8Var.l;
                            int size = arrayList.size();
                            while (true) {
                                if (i222 >= size) {
                                    savedStarGift = null;
                                    break;
                                }
                                Object obj2 = arrayList.get(i222);
                                i222++;
                                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                                ArrayList arrayList2 = arrayList;
                                if (savedStarGift2.gift.id == starGift.id) {
                                    savedStarGift = savedStarGift2;
                                    break;
                                }
                                arrayList = arrayList2;
                            }
                            if (savedStarGift == null || v4.m(savedStarGift.gift)) {
                                return;
                            }
                            v2 v2Var = new v2(j3Var, j3Var.getContext(), i212, j10.i(i212).e(), j3Var.J0);
                            v2Var.w2(savedStarGift, null);
                            v2Var.l2(j10, new e2(j3Var, v2Var, j10, x10Var2, 0));
                            return;
                        }
                        if (G2.r) {
                            if (starGift.availability_resale > 0) {
                                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                if (T == null) {
                                    return;
                                }
                                org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
                                f2Var.a = true;
                                f2Var.e = true;
                                w2 w2Var = new w2(j10, starGift.title, starGift.id, j3Var.J0, n2Var.getViewTreeObserver(), new f2());
                                w2Var.e = new ai.v1(1, j3Var, x10Var2);
                                T.showAsSheet(w2Var, f2Var);
                                return;
                            }
                            i202 = 1;
                        }
                        if (starGift.auction) {
                            m0.f1(context2, j3Var.J0, i212, j10, starGift.id, new d2(j3Var, x10Var2, i202));
                            return;
                        }
                        if (!starGift.sold_out) {
                            if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                                new lc(n2Var, j3Var.J0).R(starGift.getDocument(), org.telegram.messenger.g0.W2(gd.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                                return;
                            }
                            ai.g1 g1Var = new ai.g1(j3Var, context2, i212, starGift, x10Var2, 1);
                            if (starGift.locked_until_date > ConnectionsManager.getInstance(i212).getCurrentTime()) {
                                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, j3Var.getContext(), null);
                                u1Var.r(500L);
                                TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                                checkcansendgift.gift_id = starGift.id;
                                ConnectionsManager.getInstance(i212).sendRequest(checkcansendgift, new g2(j3Var, u1Var, g1Var, x10Var2, 0));
                                return;
                            }
                            if (!starGift.require_premium || j10.i(i212).q()) {
                                g1Var.run();
                                return;
                            }
                            org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                            if (T2 == null) {
                                return;
                            }
                            ug.i1 i1Var = new ug.i1(T2, i212, null, null, starGift, j3Var.J0);
                            q9 q9Var2 = new q9(j3Var.getContext());
                            org.telegram.ui.Components.m5 m5Var = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(160.0f), 4, q9Var2, false);
                            q9Var2.setImageDrawable(m5Var);
                            q9Var2.addOnAttachStateChangeListener(new o2(m5Var, 0));
                            m5Var.i(starGift.getDocument(), false);
                            i1Var.x2 = q9Var2;
                            i1Var.show();
                            m5Var.f();
                            return;
                        }
                        org.telegram.ui.ActionBar.i6 i6Var = j3Var.J0;
                        if (context2 == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.x2 j11 = org.telegram.messenger.f3.j(i202, context2, i6Var, false);
                        LinearLayout g10 = org.telegram.messenger.f3.g(context2, i202);
                        g10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                        g10.setClipChildren(false);
                        g10.setClipToPadding(false);
                        q9 q9Var3 = new q9(context2);
                        pb.e1(q9Var3.getImageReceiver(), starGift, ks.q2);
                        g10.addView(q9Var3, ma.t(ks.q2, ks.q2, 17, 0, -8, 0, 10));
                        TextView textView3 = new TextView(context2);
                        org.telegram.messenger.f3.l(textView3, org.telegram.ui.ActionBar.n6.j5, i6Var, 1, 20.0f);
                        org.telegram.messenger.f3.k(textView3, 17, null, 2131749953);
                        TextView f10 = n10.f(g10, textView3, ma.t(-1, -2, 17, 20, 0, 20, 4), context2);
                        f10.setTextSize(1, 14.0f);
                        f10.setTypeface(org.telegram.messenger.g0.o());
                        f10.setGravity(17);
                        n10.r(f10, org.telegram.ui.ActionBar.n6.q7, i6Var, null, 2131749954);
                        g10.addView(f10, ma.t(-1, -2, 17, 20, 0, 20, 4));
                        cy0 cy0Var = new cy0(context2, i6Var);
                        if (starGift.first_sale_date != 0) {
                            cy0Var.g(starGift.first_sale_date, gd.M0(2131749956, null));
                        }
                        if (starGift.last_sale_date != 0) {
                            cy0Var.g(starGift.last_sale_date, gd.M0(2131749955, null));
                        }
                        cy0Var.e(gd.M0(2131749952, null), pb.b1(false, i5.c.l(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            pb.H0(cy0Var, i212, starGift, i6Var);
                        }
                        g10.addView(cy0Var, ma.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        hi.d dVar = new hi.d(context2, i6Var, true);
                        dVar.i(gd.M0(2131747638, null), false, true);
                        g10.addView(dVar, ma.o(-1, 48));
                        j11.O = g10;
                        org.telegram.ui.ActionBar.x2[] x2VarArr = {j11};
                        x2VarArr[0].U0 = false;
                        dVar.setOnClickListener(new ai.q2(x2VarArr, 3));
                        x2VarArr[0].O();
                        org.telegram.ui.ActionBar.h2 T3 = LaunchActivity.T();
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T3)) {
                            x2VarArr[0].a0(T3);
                        }
                        x2VarArr[0].show();
                    }
                }
            }
        });
        h1();
        this.U1.O(false);
        c1();
        if (org.telegram.messenger.v1.a(i7).c(j3)) {
        }
        ks.f(i7).c(this, ks.l5);
        ks.f(i7).c(this, ks.H3);
        ks.f(i7).c(this, ks.E0);
        ks.f(i7).c(this, ks.K3);
        ks.f(i7).c(this, i17);
        this.p1.setTitle(P0());
        ks.i(this.p1.getTitleTextView());
        org.telegram.messenger.g0.E2(this.p1);
        this.w1 = false;
        ri.q qVar2 = this.Y0;
        ri.a aVar2 = new ri.a(qVar2, new b2(this));
        FrameLayout frameLayout32 = (FrameLayout) this.b;
        View view4 = new View(context);
        this.x2 = view4;
        frameLayout32.addView(view4, ma.e(-1, 0, 48));
        View view22 = this.x2;
        int i192 = this.u0;
        org.telegram.messenger.g0.z3(view22, i192, 0, i192, 0);
        View view32 = this.x2;
        view32.setBackground(aVar2.a(view32));
        this.y2 = new View(context);
        f71 f71Var3 = new f71(-2, context, this.J0, true);
        this.A2 = f71Var3;
        f71Var3.r = 12;
        int i202 = org.telegram.ui.ActionBar.n6.z6;
        f71Var3.h(i202, org.telegram.ui.ActionBar.n6.G6, i202, org.telegram.ui.ActionBar.n6.i6, org.telegram.ui.ActionBar.n6.d6);
        f71 f71Var22 = this.A2;
        dh.c cVar2 = aVar2.c;
        fh.g c102 = cVar2.c(f71Var22, null, false);
        c102.p(c8.i0.m(this.J0));
        c102.r(org.telegram.messenger.g0.L(20.0f));
        f71Var22.setBlurredBackground(c102);
        this.A2.setDelegate(new cb.c(this, i182));
        ai.k0 k0Var3 = new ai.k0(this, context, new TextPaint(1), 2);
        this.z2 = k0Var3;
        k0Var3.addView(this.A2, ma.e(-2, 40, 51));
        this.z2.setVisibility(8);
        frameLayout32.addView(this.z2, ma.e(-1, 40, 48));
        ai.k0 k0Var22 = this.z2;
        int i212 = this.u0;
        org.telegram.messenger.g0.z3(k0Var22, i212, 0, i212, 0);
        org.telegram.ui.ActionBar.a5 a5Var3 = new org.telegram.ui.ActionBar.a5(context, this.J0);
        this.v2 = a5Var3;
        a5Var3.setBackButtonImage(R.drawable.ic_ab_back);
        this.v2.setTitle(P0());
        this.v2.setTitlesAlpha(0.0f);
        this.v2.setActionBarMenuOnItemClick(new r1(this, 1));
        aVar2.f(frameLayout32, this.o1, this.v2, this.J0);
        org.telegram.ui.ActionBar.a5 a5Var22 = this.v2;
        int i222 = this.u0;
        org.telegram.messenger.g0.z3(a5Var22, i222, 0, i222, 0);
        this.v2.setBackground(null);
        j7 j7Var2 = new j7(i7, context, this.J0);
        fh.g c112 = cVar2.c(j7Var2, null, false);
        c112.p(c8.i0.m(this.J0));
        c112.r(org.telegram.messenger.g0.L(23.0f));
        c112.q(org.telegram.messenger.g0.L(6.0f));
        j7Var2.setBackground(c112);
        ra.a(j7Var2);
        j7Var2.setOnClickListener(new ah.d(j7Var2, 7));
        j7Var2.setOnWidthChanged(new c2(this, 0));
        this.v2.addView(j7Var2, ma.e(-2, 58, 5));
        qVar2.i(this.b);
        this.U1.O(false);
    }
}
