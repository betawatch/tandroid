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
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.wy;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class n3 extends sa implements fs {
    public static final /* synthetic */ int F2 = 0;
    public final i71 A2;
    public final ArrayList B2;
    public boolean C2;
    public int D2;
    public boolean E2;
    public final int T1;
    public c51 U1;
    public List V1;
    public TLRPC.DisallowedGiftsSettings W1;
    public final long X1;
    public final boolean Y1;
    public final String Z1;
    public final t2 a2;
    public final FrameLayout b2;
    public final LinearLayout c2;
    public final wy d2;
    public final x2 e2;
    public final u2 f2;
    public final u2 g2;
    public final ArrayList h2;
    public final di.p8 i2;
    public int j2;
    public int k2;
    public int l2;
    public int m2;
    public boolean n2;
    public boolean o2;
    public boolean p2;
    public ua q2;
    public final m80 r2;
    public final TextView s2;
    public final TextView t2;
    public boolean u2;
    public final org.telegram.ui.ActionBar.z4 v2;
    public final te.a w2;
    public final View x2;
    public final View y2;
    public final ai.l0 z2;

    public n3(LaunchActivity launchActivity, int i7, long j3) {
        this(launchActivity, i7, j3, null, null);
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(this.o1, getContext(), this.T1, 0, true, new b(this, 6), this.J0);
        this.U1 = c51Var;
        c51Var.r = false;
        return c51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return this.Y1 ? gd.N0(2131749922, null) : org.telegram.messenger.j6.m(gd.a0(null, null, 2131749831, this.Z1), null, false, null, 0);
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
        ek0 ek0Var = this.o1;
        if (view != null && view.isAttachedToWindow()) {
            float height = view.getHeight();
            while (view != null && view != ek0Var) {
                height += view.getY();
                view = view.getParent() instanceof View ? (View) view.getParent() : null;
            }
            if (view == ek0Var) {
                f10 = ek0Var.getY() + height;
                this.w2.a(Float.isNaN(f10) ? f10 < f12 : f1() == -3.4028235E38f, !this.J);
                L = org.telegram.messenger.g0.L(6.0f) + currentActionBarHeight + i10;
                if (this.C2) {
                    this.z2.setVisibility(8);
                } else {
                    View view2 = this.y2.getParent() instanceof View ? (View) this.y2.getParent() : null;
                    if (view2 != null && view2.getParent() == ek0Var) {
                        ek0Var.getClass();
                        this.D2 = RecyclerView.R(view2);
                        f13 = ek0Var.getY() + view2.getY() + org.telegram.messenger.g0.L(6.0f);
                    }
                    float d = ri.a.d(i10) + max;
                    if (Float.isNaN(f13)) {
                        View childAt = ek0Var.getChildCount() > 0 ? ek0Var.getChildAt(0) : null;
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
        org.telegram.ui.ActionBar.z4 z4Var = this.v2;
        if (z4Var != null) {
            z4Var.setTitle(P0());
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c51 c51Var;
        if (i7 == ks.m5) {
            h1();
            return;
        }
        if (i7 == ks.H3) {
            c51 c51Var2 = this.U1;
            if (c51Var2 != null) {
                c51Var2.O(true);
                return;
            }
            return;
        }
        if (i7 != ks.E0) {
            if (i7 != ks.K3) {
                if (i7 == ks.I3 && objArr[1] == this.i2 && (c51Var = this.U1) != null) {
                    c51Var.O(true);
                    return;
                }
                return;
            }
            if (this.J) {
                return;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
            new lc(this.c, this.J0).s(starGift.sticker, gd.N0(2131749950, null), org.telegram.messenger.g0.W2(gd.H(',', "Gift2SoldOutCount", starGift.availability_total))).j();
            c51 c51Var3 = this.U1;
            if (c51Var3 != null) {
                c51Var3.O(true);
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
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    n10.u(gd.a0(null, null, 2131743499, org.telegram.messenger.n5.t(j3)), lc.b0(T), R.raw.error, 36);
                    return;
                }
                return;
            }
            c51 c51Var4 = this.U1;
            if (c51Var4 != null) {
                c51Var4.O(true);
            }
        }
        ArrayList arrayList = this.h2;
        if (arrayList == null || arrayList.isEmpty()) {
            h1();
            c51 c51Var5 = this.U1;
            if (c51Var5 != null) {
                c51Var5.O(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        int i7 = this.T1;
        ks.f(i7).n(this, ks.m5);
        ks.f(i7).n(this, ks.H3);
        ks.f(i7).n(this, ks.E0);
        ks.f(i7).n(this, ks.K3);
        ks.f(i7).n(this, ks.I3);
    }

    public final void e1(ArrayList arrayList, c51 c51Var) {
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
        t2 t2Var = this.a2;
        long j10 = this.X1;
        long j11 = 0;
        boolean z12 = this.Y1;
        if (z12 || j10 < 0 || ((disallowedGiftsSettings4 = this.W1) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j3 = 0;
            z10 = false;
        } else {
            arrayList.add(o41.k(t2Var));
            this.u2 = true;
            arrayList.add(o41.k(this.b2));
            ArrayList arrayList2 = this.h2;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                j3 = 0;
                o41 q10 = o41.q(1, 34);
                q10.v = 1;
                arrayList.add(q10);
                o41 q11 = o41.q(2, 34);
                q11.v = 1;
                arrayList.add(q11);
                o41 q12 = o41.q(3, 34);
                q12.v = 1;
                arrayList.add(q12);
            } else {
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = f3.b;
                    o41 K = o41.K(f3.class);
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
        di.y8 y10 = di.y8.y(i13, false);
        ArrayList arrayList3 = this.n2 ? y10.J : y10.I;
        if (this.W1 != null) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new ki.h1(this, i10)).collect(Collectors.toCollection(new jk(1)));
        }
        if (j10 < j3) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new aa.m(i7)).collect(Collectors.toCollection(new jk(1)));
        }
        long e10 = j10.i(i13).e();
        di.p8 p8Var = this.i2;
        if (j10 != e10 && p8Var != null) {
            ArrayList arrayList4 = p8Var.l;
            int size2 = arrayList4.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList4.get(i14);
                i14++;
                TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj2).gift;
                if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && !y4.m(starGift2)) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (mp.u1(i13).b6 || (arrayList3.isEmpty() && ((disallowedGiftsSettings3 = this.W1) == null || disallowedGiftsSettings3.disallow_unique_stargifts || p8Var == null || p8Var.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.W1;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(o41.D(org.telegram.messenger.g0.L(300.0f)));
            return;
        }
        if (z10) {
            arrayList.add(o41.D(org.telegram.messenger.g0.L(16.0f)));
        } else {
            arrayList.add(o41.k(t2Var));
        }
        arrayList.add(o41.k(this.c2));
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
            arrayList5.add(gd.N0(2131749933, null));
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.W1;
        if ((disallowedGiftsSettings7 == null || !disallowedGiftsSettings7.disallow_unique_stargifts) && z11) {
            this.k2 = arrayList5.size();
            arrayList5.add(gd.N0(2131749929, null));
        }
        this.l2 = arrayList5.size();
        arrayList5.add(gd.N0(2131749932, null));
        if (this.o2 && !this.p2) {
            this.p2 = true;
            this.m2 = this.l2;
        }
        arrayList.add(o41.n(this.y2, 52));
        this.C2 = true;
        i71 i71Var = this.A2;
        if (i71Var != null) {
            ArrayList arrayList6 = this.B2;
            if (!arrayList6.equals(arrayList5)) {
                arrayList6.clear();
                arrayList6.addAll(arrayList5);
                i71Var.c();
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    i71Var.a(i16, (CharSequence) arrayList5.get(i16));
                }
                i71Var.y.f();
                this.z2.requestLayout();
            }
            int currentTabId = i71Var.getCurrentTabId();
            int i17 = this.m2;
            if (currentTabId != i17) {
                i71Var.g(1.0f, i17);
            }
        }
        boolean z13 = this.m2 == this.l2 && !z12 && j10 >= j3;
        if (z13 != this.E2) {
            this.E2 = z13;
            ViewPropertyAnimator duration = this.f2.animate().alpha(!z13 ? 1.0f : 0.0f).scaleX(!z13 ? 1.0f : 0.85f).scaleY(!z13 ? 1.0f : 0.85f).setDuration(380L);
            nr nrVar = nr.h;
            duration.setInterpolator(nrVar).start();
            this.g2.animate().alpha(z13 ? 1.0f : 0.0f).scaleX(z13 ? 1.0f : 0.85f).scaleY(z13 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(nrVar).start();
        }
        if (p8Var != null && this.m2 == this.k2) {
            arrayList3 = new ArrayList();
            ArrayList arrayList7 = p8Var.l;
            int size3 = arrayList7.size();
            int i18 = 0;
            while (i18 < size3) {
                Object obj3 = arrayList7.get(i18);
                i18++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                TL_stars.StarGift starGift3 = savedStarGift.gift;
                if ((starGift3 instanceof TL_stars.TL_starGiftUnique) && !y4.m(starGift3)) {
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
                    o41 i22 = f3.i(i21, starGift4, i21 == this.k2, starGift4.limited && (disallowedGiftsSettings2 = this.W1) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift4;
                    arrayList.add(i22);
                    i19++;
                }
                int i23 = this.m2;
                arrayList.add(f3.i(i23, starGift, i23 == this.k2, starGift.limited && (disallowedGiftsSettings = this.W1) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i19++;
            }
        }
        int i24 = this.m2;
        int i25 = this.k2;
        if (i24 == i25 && p8Var != null && !p8Var.j) {
            p8Var.a();
            o41 q13 = o41.q(4, 34);
            q13.v = 1;
            arrayList.add(q13);
            o41 q14 = o41.q(5, 34);
            q14.v = 1;
            arrayList.add(q14);
            o41 q15 = o41.q(6, 34);
            q15.v = 1;
            arrayList.add(q15);
        } else if (i24 != i25 && y10.C) {
            o41 q16 = o41.q(4, 34);
            q16.v = 1;
            arrayList.add(q16);
            o41 q17 = o41.q(5, 34);
            q17.v = 1;
            arrayList.add(q17);
            o41 q18 = o41.q(6, 34);
            q18.v = 1;
            arrayList.add(q18);
        }
        arrayList.add(o41.D(org.telegram.messenger.g0.L(i19 >= 9 ? 40.0f : 300.0f)));
    }

    public final float f1() {
        int i7 = 0;
        float f10 = Float.MAX_VALUE;
        while (true) {
            ek0 ek0Var = this.o1;
            if (i7 >= ek0Var.getChildCount()) {
                return f10 == Float.MAX_VALUE ? ek0Var.getHeight() : f10;
            }
            View childAt = ek0Var.getChildAt(i7);
            int R = RecyclerView.R(childAt);
            if (R == 1) {
                return ek0Var.getY() + childAt.getY();
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
                org.telegram.messenger.r1.i().o(arrayList2, new f2(this));
            }
        }
        if (arrayList.isEmpty()) {
            wg.s.j(this.T1, null, new g2(this, 1));
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
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
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T != null) {
            n10.u(gd.a0(null, null, 2131743499, org.telegram.messenger.n5.t(this.X1)), lc.b0(T), R.raw.error, 36);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0435  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n3(final Context context, final int i7, final long j3, List list, final x10 x10Var) {
        super(context, null, false, false, null);
        int i10;
        int i11;
        this.h2 = new ArrayList();
        this.j2 = -1;
        this.k2 = -1;
        this.l2 = -1;
        new ArrayList();
        f2 f2Var = new f2(this);
        nr nrVar = nr.h;
        int i12 = 0;
        this.w2 = new te.a(0, f2Var, nrVar, 320L, false);
        this.B2 = new ArrayList();
        this.D2 = -1;
        this.T1 = i7;
        this.X1 = j3;
        int i13 = 1;
        boolean z10 = j10.i(i7).e() == j3;
        this.Y1 = z10;
        this.V1 = list;
        int i14 = org.telegram.ui.ActionBar.m6.b6;
        w0(i14);
        Q(i14);
        this.i2 = di.y8.y(i7, false).G(j10.i(i7).e(), true);
        di.y8.y(i7, false).T();
        q9 q9Var = new q9(context);
        q9Var.setImportantForAccessibility(2);
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
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
        t2 t2Var = new t2(context, i12);
        this.a2 = t2Var;
        t2Var.setClipChildren(false);
        t2Var.setClipToPadding(false);
        ua uaVar = new ua(context, 70, 0, 0);
        this.q2 = uaVar;
        t2Var.addView(uaVar, ma.c(-1.0f, -1));
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(42.0f));
        t2Var.addView(q9Var, ma.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        ra.a(q9Var);
        q9Var.setOnClickListener(new q(this, j3, i13));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, ma.e(-1, -2, 55));
        TextView textView = new TextView(context);
        this.s2 = textView;
        i5.c.x(textView, 1, 20.0f);
        int i15 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(textView, i15, this.J0);
        textView.setGravity(17);
        linearLayout.addView(textView, ma.t(-1, -2, 1, 4, 0, 4, 0));
        textView.setMaxWidth(hi.l3.a(textView.getText(), textView.getPaint()));
        m80 m80Var = new m80(context, this.J0);
        int i16 = org.telegram.ui.ActionBar.m6.Xc;
        org.telegram.ui.ActionBar.t6.G(m80Var, i16, this.J0);
        m80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var, i15, this.J0);
        m80Var.setGravity(17);
        m80Var.setLineSpacing(org.telegram.messenger.g0.L(2.33f), 1.0f);
        linearLayout.addView(m80Var, ma.t(-1, -2, 1, 4, 4, 4, 12));
        textView.setText(gd.N0(2131750058, null));
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750057, this.Z1));
        SpannableStringBuilder H2 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(gd.N0(2131750056, null), new ai.n(4)), true);
        CharSequence[] charSequenceArr = new CharSequence[3];
        charSequenceArr[0] = W2;
        charSequenceArr[1] = " ";
        charSequenceArr[i10] = H2;
        m80Var.setText(TextUtils.concat(charSequenceArr));
        m80Var.setMaxWidth(hi.l3.a(m80Var.getText(), m80Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.c2 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView2 = new TextView(context);
        this.t2 = textView2;
        i5.c.x(textView2, 1, 20.0f);
        org.telegram.ui.ActionBar.t6.U(textView2, i15, this.J0);
        textView2.setGravity(17);
        linearLayout2.addView(textView2, ma.t(-1, -2, 1, 4, 0, 4, 0));
        u2 u2Var = new u2(i12, context, this.J0);
        this.f2 = u2Var;
        org.telegram.ui.ActionBar.t6.G(u2Var, i16, this.J0);
        u2Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(u2Var, i15, this.J0);
        u2Var.setGravity(17);
        u2 u2Var2 = new u2(i13, context, this.J0);
        this.g2 = u2Var2;
        org.telegram.ui.ActionBar.t6.G(u2Var2, i16, this.J0);
        u2Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(u2Var2, i15, this.J0);
        u2Var2.setGravity(17);
        u2Var2.setAlpha(0.0f);
        u2Var2.setScaleX(0.85f);
        u2Var2.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(u2Var, ma.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(u2Var2, ma.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView2.setText(gd.N0(j3 < 0 ? 2131749948 : z10 ? 2131749939 : 2131749949, null));
        int i17 = ks.I3;
        if (z10) {
            linearLayout2.addView(frameLayout2, ma.t(-2, -2, 1, 0, 9, 0, 4));
            m80 m80Var2 = new m80(context, this.J0);
            org.telegram.ui.ActionBar.t6.G(m80Var2, i16, this.J0);
            m80Var2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.t6.U(m80Var2, i15, this.J0);
            m80Var2.setGravity(17);
            linearLayout2.addView(m80Var2, ma.t(-2, -2, 1, 26, 4, 26, 6));
            u2Var.setText(gd.N0(2131749938, null));
            m80Var2.setText(gd.N0(2131749937, null));
            this.r2 = m80Var2;
        } else {
            if (j3 >= 0) {
                linearLayout2.addView(frameLayout2, ma.t(-1, -2, 1, 0, 9, 0, 6));
                di.p8 G = di.y8.y(i7, false).G(j3, true);
                o2 o2Var = new o2(this, G, j3, x10Var, context, 0);
                o2Var.run();
                u2Var.addOnAttachStateChangeListener(new v2(o2Var, 0));
                i11 = 3;
                if (G.l.size() < 3) {
                    G.a();
                }
                ks.f(i7).h(u2Var, i17, new ai.x1(i10, G, o2Var));
                wy wyVar = new wy(i11, false);
                this.d2 = wyVar;
                wyVar.O = new w2(this, 0);
                this.o1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                this.o1.setClipToPadding(false);
                this.o1.setClipChildren(false);
                this.o1.setLayoutManager(wyVar);
                int i18 = 9;
                this.o1.setSelectorType(9);
                this.o1.setSelectorDrawableColor(0);
                x2 x2Var = new x2();
                this.e2 = x2Var;
                x2Var.C = false;
                x2Var.m = false;
                x2Var.n(350L);
                x2Var.o(nrVar);
                x2Var.D = 40L;
                this.o1.setItemAnimator(x2Var);
                this.o1.setOnItemClickListener(new qj0() { // from class: bi.p2
                    @Override // org.telegram.ui.Components.qj0
                    public final void c(int i19, View view) {
                        TL_stars.SavedStarGift savedStarGift;
                        n3 n3Var = n3.this;
                        org.telegram.ui.ActionBar.m2 m2Var = n3Var.c;
                        int i20 = 1;
                        o41 G2 = n3Var.U1.G(i19 - 1);
                        if (G2 != null && G2.H(f3.class)) {
                            Object obj = G2.H;
                            boolean z11 = obj instanceof ug.j;
                            Context context2 = context;
                            int i21 = i7;
                            x10 x10Var2 = x10Var;
                            int i22 = 0;
                            if (z11) {
                                new y2(n3Var, context2, i21, (ug.j) obj, n3Var.X1, new h2(n3Var, x10Var2, i22)).show();
                                return;
                            }
                            if (obj instanceof TL_stars.StarGift) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                                di.p8 p8Var = n3Var.i2;
                                long j10 = j3;
                                if (p8Var != null && n3Var.m2 == n3Var.k2) {
                                    ArrayList arrayList = p8Var.l;
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
                                    if (savedStarGift == null || y4.m(savedStarGift.gift)) {
                                        return;
                                    }
                                    z2 z2Var = new z2(n3Var, n3Var.getContext(), i21, j10.i(i21).e(), n3Var.J0);
                                    z2Var.w2(savedStarGift, null);
                                    z2Var.l2(j10, new i2(n3Var, z2Var, j10, x10Var2, 0));
                                    return;
                                }
                                if (G2.r) {
                                    if (starGift.availability_resale > 0) {
                                        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                        if (T == null) {
                                            return;
                                        }
                                        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                                        e2Var.a = true;
                                        e2Var.e = true;
                                        a3 a3Var = new a3(j10, starGift.title, starGift.id, n3Var.J0, m2Var.getViewTreeObserver(), new j2());
                                        a3Var.e = new ai.x1(1, n3Var, x10Var2);
                                        T.showAsSheet(a3Var, e2Var);
                                        return;
                                    }
                                    i20 = 1;
                                }
                                if (starGift.auction) {
                                    m0.f1(context2, n3Var.J0, i21, j10, starGift.id, new h2(n3Var, x10Var2, i20));
                                    return;
                                }
                                if (!starGift.sold_out) {
                                    if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                                        new lc(m2Var, n3Var.J0).R(starGift.getDocument(), org.telegram.messenger.g0.W2(gd.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                                        return;
                                    }
                                    ai.i1 i1Var = new ai.i1(n3Var, context2, i21, starGift, x10Var2, 1);
                                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i21).getCurrentTime()) {
                                        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, n3Var.getContext(), null);
                                        t1Var.r(500L);
                                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                                        checkcansendgift.gift_id = starGift.id;
                                        ConnectionsManager.getInstance(i21).sendRequest(checkcansendgift, new k2(n3Var, t1Var, i1Var, x10Var2, 0));
                                        return;
                                    }
                                    if (!starGift.require_premium || j10.i(i21).q()) {
                                        i1Var.run();
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                                    if (T2 == null) {
                                        return;
                                    }
                                    ug.h1 h1Var = new ug.h1(T2, i21, null, null, starGift, n3Var.J0);
                                    q9 q9Var2 = new q9(n3Var.getContext());
                                    org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(160.0f), 4, q9Var2, false);
                                    q9Var2.setImageDrawable(n5Var);
                                    q9Var2.addOnAttachStateChangeListener(new s2(n5Var, 0));
                                    n5Var.i(starGift.getDocument(), false);
                                    h1Var.x2 = q9Var2;
                                    h1Var.show();
                                    n5Var.f();
                                    return;
                                }
                                org.telegram.ui.ActionBar.h6 h6Var = n3Var.J0;
                                if (context2 == null) {
                                    return;
                                }
                                org.telegram.ui.ActionBar.w2 j11 = org.telegram.messenger.f3.j(i20, context2, h6Var, false);
                                LinearLayout g10 = org.telegram.messenger.f3.g(context2, i20);
                                g10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                                g10.setClipChildren(false);
                                g10.setClipToPadding(false);
                                q9 q9Var3 = new q9(context2);
                                pb.e1(q9Var3.getImageReceiver(), starGift, ks.q2);
                                g10.addView(q9Var3, ma.t(ks.q2, ks.q2, 17, 0, -8, 0, 10));
                                TextView textView3 = new TextView(context2);
                                org.telegram.messenger.f3.l(textView3, org.telegram.ui.ActionBar.m6.j5, h6Var, 1, 20.0f);
                                org.telegram.messenger.f3.k(textView3, 17, null, 2131749952);
                                TextView f10 = n10.f(g10, textView3, ma.t(-1, -2, 17, 20, 0, 20, 4), context2);
                                f10.setTextSize(1, 14.0f);
                                f10.setTypeface(org.telegram.messenger.g0.o());
                                f10.setGravity(17);
                                n10.r(f10, org.telegram.ui.ActionBar.m6.q7, h6Var, null, 2131749953);
                                g10.addView(f10, ma.t(-1, -2, 17, 20, 0, 20, 4));
                                ey0 ey0Var = new ey0(context2, h6Var);
                                if (starGift.first_sale_date != 0) {
                                    ey0Var.g(starGift.first_sale_date, gd.N0(2131749955, null));
                                }
                                if (starGift.last_sale_date != 0) {
                                    ey0Var.g(starGift.last_sale_date, gd.N0(2131749954, null));
                                }
                                ey0Var.e(gd.N0(2131749951, null), pb.b1(false, i5.c.l(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                                if (starGift.limited) {
                                    pb.H0(ey0Var, i21, starGift, h6Var);
                                }
                                g10.addView(ey0Var, ma.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                                hi.e eVar = new hi.e(context2, h6Var, true);
                                eVar.i(gd.N0(2131747637, null), false, true);
                                g10.addView(eVar, ma.o(-1, 48));
                                j11.O = g10;
                                org.telegram.ui.ActionBar.w2[] w2VarArr = {j11};
                                w2VarArr[0].U0 = false;
                                eVar.setOnClickListener(new ai.s2(w2VarArr, 3));
                                w2VarArr[0].O();
                                org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T3)) {
                                    w2VarArr[0].a0(T3);
                                }
                                w2VarArr[0].show();
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
                ks.f(i7).c(this, ks.m5);
                ks.f(i7).c(this, ks.H3);
                ks.f(i7).c(this, ks.E0);
                ks.f(i7).c(this, ks.K3);
                ks.f(i7).c(this, i17);
                this.p1.setTitle(P0());
                ks.i(this.p1.getTitleTextView());
                org.telegram.messenger.g0.E2(this.p1);
                this.w1 = false;
                ri.q qVar = this.Y0;
                ri.a aVar = new ri.a(qVar, new f2(this));
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
                i71 i71Var = new i71(-2, context, this.J0, true);
                this.A2 = i71Var;
                i71Var.r = 12;
                int i20 = org.telegram.ui.ActionBar.m6.z6;
                i71Var.h(i20, org.telegram.ui.ActionBar.m6.G6, i20, org.telegram.ui.ActionBar.m6.i6, org.telegram.ui.ActionBar.m6.d6);
                i71 i71Var2 = this.A2;
                dh.c cVar = aVar.c;
                fh.g c10 = cVar.c(i71Var2, null, false);
                c10.p(c8.i0.m(this.J0));
                c10.r(org.telegram.messenger.g0.L(20.0f));
                i71Var2.setBlurredBackground(c10);
                this.A2.setDelegate(new cb.c(this, i18));
                ai.l0 l0Var = new ai.l0(this, context, new TextPaint(1), 2);
                this.z2 = l0Var;
                l0Var.addView(this.A2, ma.e(-2, 40, 51));
                this.z2.setVisibility(8);
                frameLayout3.addView(this.z2, ma.e(-1, 40, 48));
                ai.l0 l0Var2 = this.z2;
                int i21 = this.u0;
                org.telegram.messenger.g0.z3(l0Var2, i21, 0, i21, 0);
                org.telegram.ui.ActionBar.z4 z4Var = new org.telegram.ui.ActionBar.z4(context, this.J0);
                this.v2 = z4Var;
                z4Var.setBackButtonImage(R.drawable.ic_ab_back);
                this.v2.setTitle(P0());
                this.v2.setTitlesAlpha(0.0f);
                this.v2.setActionBarMenuOnItemClick(new v1(this, 1));
                aVar.f(frameLayout3, this.o1, this.v2, this.J0);
                org.telegram.ui.ActionBar.z4 z4Var2 = this.v2;
                int i22 = this.u0;
                org.telegram.messenger.g0.z3(z4Var2, i22, 0, i22, 0);
                this.v2.setBackground(null);
                m7 m7Var = new m7(i7, context, this.J0);
                fh.g c11 = cVar.c(m7Var, null, false);
                c11.p(c8.i0.m(this.J0));
                c11.r(org.telegram.messenger.g0.L(23.0f));
                c11.q(org.telegram.messenger.g0.L(6.0f));
                m7Var.setBackground(c11);
                ra.a(m7Var);
                m7Var.setOnClickListener(new ah.d(m7Var, 6));
                m7Var.setOnWidthChanged(new g2(this, 0));
                this.v2.addView(m7Var, ma.e(-2, 58, 5));
                qVar.i(this.b);
                this.U1.O(false);
            }
            linearLayout2.addView(frameLayout2, ma.t(-2, -2, 1, 0, 9, 0, 4));
            ks.i(u2Var);
            u2Var.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749947, this.Z1)), u2Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        i11 = 3;
        wy wyVar2 = new wy(i11, false);
        this.d2 = wyVar2;
        wyVar2.O = new w2(this, 0);
        this.o1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        this.o1.setClipToPadding(false);
        this.o1.setClipChildren(false);
        this.o1.setLayoutManager(wyVar2);
        int i182 = 9;
        this.o1.setSelectorType(9);
        this.o1.setSelectorDrawableColor(0);
        x2 x2Var2 = new x2();
        this.e2 = x2Var2;
        x2Var2.C = false;
        x2Var2.m = false;
        x2Var2.n(350L);
        x2Var2.o(nrVar);
        x2Var2.D = 40L;
        this.o1.setItemAnimator(x2Var2);
        this.o1.setOnItemClickListener(new qj0() { // from class: bi.p2
            @Override // org.telegram.ui.Components.qj0
            public final void c(int i192, View view4) {
                TL_stars.SavedStarGift savedStarGift;
                n3 n3Var = n3.this;
                org.telegram.ui.ActionBar.m2 m2Var = n3Var.c;
                int i202 = 1;
                o41 G2 = n3Var.U1.G(i192 - 1);
                if (G2 != null && G2.H(f3.class)) {
                    Object obj = G2.H;
                    boolean z11 = obj instanceof ug.j;
                    Context context2 = context;
                    int i212 = i7;
                    x10 x10Var2 = x10Var;
                    int i222 = 0;
                    if (z11) {
                        new y2(n3Var, context2, i212, (ug.j) obj, n3Var.X1, new h2(n3Var, x10Var2, i222)).show();
                        return;
                    }
                    if (obj instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                        di.p8 p8Var = n3Var.i2;
                        long j10 = j3;
                        if (p8Var != null && n3Var.m2 == n3Var.k2) {
                            ArrayList arrayList = p8Var.l;
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
                            if (savedStarGift == null || y4.m(savedStarGift.gift)) {
                                return;
                            }
                            z2 z2Var = new z2(n3Var, n3Var.getContext(), i212, j10.i(i212).e(), n3Var.J0);
                            z2Var.w2(savedStarGift, null);
                            z2Var.l2(j10, new i2(n3Var, z2Var, j10, x10Var2, 0));
                            return;
                        }
                        if (G2.r) {
                            if (starGift.availability_resale > 0) {
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T == null) {
                                    return;
                                }
                                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                                e2Var.a = true;
                                e2Var.e = true;
                                a3 a3Var = new a3(j10, starGift.title, starGift.id, n3Var.J0, m2Var.getViewTreeObserver(), new j2());
                                a3Var.e = new ai.x1(1, n3Var, x10Var2);
                                T.showAsSheet(a3Var, e2Var);
                                return;
                            }
                            i202 = 1;
                        }
                        if (starGift.auction) {
                            m0.f1(context2, n3Var.J0, i212, j10, starGift.id, new h2(n3Var, x10Var2, i202));
                            return;
                        }
                        if (!starGift.sold_out) {
                            if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                                new lc(m2Var, n3Var.J0).R(starGift.getDocument(), org.telegram.messenger.g0.W2(gd.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                                return;
                            }
                            ai.i1 i1Var = new ai.i1(n3Var, context2, i212, starGift, x10Var2, 1);
                            if (starGift.locked_until_date > ConnectionsManager.getInstance(i212).getCurrentTime()) {
                                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, n3Var.getContext(), null);
                                t1Var.r(500L);
                                TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                                checkcansendgift.gift_id = starGift.id;
                                ConnectionsManager.getInstance(i212).sendRequest(checkcansendgift, new k2(n3Var, t1Var, i1Var, x10Var2, 0));
                                return;
                            }
                            if (!starGift.require_premium || j10.i(i212).q()) {
                                i1Var.run();
                                return;
                            }
                            org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                            if (T2 == null) {
                                return;
                            }
                            ug.h1 h1Var = new ug.h1(T2, i212, null, null, starGift, n3Var.J0);
                            q9 q9Var2 = new q9(n3Var.getContext());
                            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(160.0f), 4, q9Var2, false);
                            q9Var2.setImageDrawable(n5Var);
                            q9Var2.addOnAttachStateChangeListener(new s2(n5Var, 0));
                            n5Var.i(starGift.getDocument(), false);
                            h1Var.x2 = q9Var2;
                            h1Var.show();
                            n5Var.f();
                            return;
                        }
                        org.telegram.ui.ActionBar.h6 h6Var = n3Var.J0;
                        if (context2 == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.w2 j11 = org.telegram.messenger.f3.j(i202, context2, h6Var, false);
                        LinearLayout g10 = org.telegram.messenger.f3.g(context2, i202);
                        g10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                        g10.setClipChildren(false);
                        g10.setClipToPadding(false);
                        q9 q9Var3 = new q9(context2);
                        pb.e1(q9Var3.getImageReceiver(), starGift, ks.q2);
                        g10.addView(q9Var3, ma.t(ks.q2, ks.q2, 17, 0, -8, 0, 10));
                        TextView textView3 = new TextView(context2);
                        org.telegram.messenger.f3.l(textView3, org.telegram.ui.ActionBar.m6.j5, h6Var, 1, 20.0f);
                        org.telegram.messenger.f3.k(textView3, 17, null, 2131749952);
                        TextView f10 = n10.f(g10, textView3, ma.t(-1, -2, 17, 20, 0, 20, 4), context2);
                        f10.setTextSize(1, 14.0f);
                        f10.setTypeface(org.telegram.messenger.g0.o());
                        f10.setGravity(17);
                        n10.r(f10, org.telegram.ui.ActionBar.m6.q7, h6Var, null, 2131749953);
                        g10.addView(f10, ma.t(-1, -2, 17, 20, 0, 20, 4));
                        ey0 ey0Var = new ey0(context2, h6Var);
                        if (starGift.first_sale_date != 0) {
                            ey0Var.g(starGift.first_sale_date, gd.N0(2131749955, null));
                        }
                        if (starGift.last_sale_date != 0) {
                            ey0Var.g(starGift.last_sale_date, gd.N0(2131749954, null));
                        }
                        ey0Var.e(gd.N0(2131749951, null), pb.b1(false, i5.c.l(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            pb.H0(ey0Var, i212, starGift, h6Var);
                        }
                        g10.addView(ey0Var, ma.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        hi.e eVar = new hi.e(context2, h6Var, true);
                        eVar.i(gd.N0(2131747637, null), false, true);
                        g10.addView(eVar, ma.o(-1, 48));
                        j11.O = g10;
                        org.telegram.ui.ActionBar.w2[] w2VarArr = {j11};
                        w2VarArr[0].U0 = false;
                        eVar.setOnClickListener(new ai.s2(w2VarArr, 3));
                        w2VarArr[0].O();
                        org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T3)) {
                            w2VarArr[0].a0(T3);
                        }
                        w2VarArr[0].show();
                    }
                }
            }
        });
        h1();
        this.U1.O(false);
        c1();
        if (org.telegram.messenger.v1.a(i7).c(j3)) {
        }
        ks.f(i7).c(this, ks.m5);
        ks.f(i7).c(this, ks.H3);
        ks.f(i7).c(this, ks.E0);
        ks.f(i7).c(this, ks.K3);
        ks.f(i7).c(this, i17);
        this.p1.setTitle(P0());
        ks.i(this.p1.getTitleTextView());
        org.telegram.messenger.g0.E2(this.p1);
        this.w1 = false;
        ri.q qVar2 = this.Y0;
        ri.a aVar2 = new ri.a(qVar2, new f2(this));
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
        i71 i71Var3 = new i71(-2, context, this.J0, true);
        this.A2 = i71Var3;
        i71Var3.r = 12;
        int i202 = org.telegram.ui.ActionBar.m6.z6;
        i71Var3.h(i202, org.telegram.ui.ActionBar.m6.G6, i202, org.telegram.ui.ActionBar.m6.i6, org.telegram.ui.ActionBar.m6.d6);
        i71 i71Var22 = this.A2;
        dh.c cVar2 = aVar2.c;
        fh.g c102 = cVar2.c(i71Var22, null, false);
        c102.p(c8.i0.m(this.J0));
        c102.r(org.telegram.messenger.g0.L(20.0f));
        i71Var22.setBlurredBackground(c102);
        this.A2.setDelegate(new cb.c(this, i182));
        ai.l0 l0Var3 = new ai.l0(this, context, new TextPaint(1), 2);
        this.z2 = l0Var3;
        l0Var3.addView(this.A2, ma.e(-2, 40, 51));
        this.z2.setVisibility(8);
        frameLayout32.addView(this.z2, ma.e(-1, 40, 48));
        ai.l0 l0Var22 = this.z2;
        int i212 = this.u0;
        org.telegram.messenger.g0.z3(l0Var22, i212, 0, i212, 0);
        org.telegram.ui.ActionBar.z4 z4Var3 = new org.telegram.ui.ActionBar.z4(context, this.J0);
        this.v2 = z4Var3;
        z4Var3.setBackButtonImage(R.drawable.ic_ab_back);
        this.v2.setTitle(P0());
        this.v2.setTitlesAlpha(0.0f);
        this.v2.setActionBarMenuOnItemClick(new v1(this, 1));
        aVar2.f(frameLayout32, this.o1, this.v2, this.J0);
        org.telegram.ui.ActionBar.z4 z4Var22 = this.v2;
        int i222 = this.u0;
        org.telegram.messenger.g0.z3(z4Var22, i222, 0, i222, 0);
        this.v2.setBackground(null);
        m7 m7Var2 = new m7(i7, context, this.J0);
        fh.g c112 = cVar2.c(m7Var2, null, false);
        c112.p(c8.i0.m(this.J0));
        c112.r(org.telegram.messenger.g0.L(23.0f));
        c112.q(org.telegram.messenger.g0.L(6.0f));
        m7Var2.setBackground(c112);
        ra.a(m7Var2);
        m7Var2.setOnClickListener(new ah.d(m7Var2, 6));
        m7Var2.setOnWidthChanged(new g2(this, 0));
        this.v2.addView(m7Var2, ma.e(-2, 58, 5));
        qVar2.i(this.b);
        this.U1.O(false);
    }
}
