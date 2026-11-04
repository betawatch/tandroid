package ci;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import j$.util.Comparator$-CC;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.i40;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p1 extends org.telegram.ui.Components.ma {
    public static final /* synthetic */ int t2 = 0;
    public final int Q1;
    public final LinearLayout R1;
    public final l1[] S1;
    public final ArrayList T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final a X1;
    public final a Y1;
    public final a Z1;
    public final hy a2;
    public final g1 b2;
    public final o1 c2;
    public i1 d2;
    public final FrameLayout e2;
    public final ImageView f2;
    public final ImageView g2;
    public final h1 h2;
    public final TextView i2;
    public final View j2;
    public final eh.g k2;
    public final eh.c l2;
    public k1 m2;
    public final boolean n2;
    public boolean o2;
    public final eh.k p2;
    public int q2;
    public int r2;
    public int s2;

    public p1(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, e6Var);
        this.s2 = 1;
        this.Q1 = i3;
        this.n2 = z10;
        ArrayList c2 = dg.d.c(TL_stars.starGiftAttributeBackdrop.class, arrayList);
        this.T1 = c2;
        a aVar = new a(c2);
        this.X1 = aVar;
        aVar.a = false;
        ArrayList c10 = dg.d.c(TL_stars.starGiftAttributePattern.class, arrayList);
        this.U1 = c10;
        a aVar2 = new a(c10);
        this.Y1 = aVar2;
        aVar2.a = false;
        this.V1 = dg.d.c(TL_stars.starGiftAttributeModel.class, arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.W1 = arrayList2;
        if (z10) {
            int i10 = 0;
            while (i10 < this.V1.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.V1.get(i10);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.W1.add(stargiftattributemodel);
                    this.V1.remove(i10);
                    i10--;
                }
                i10++;
            }
        } else {
            arrayList2.clear();
        }
        List.-EL.sort(this.T1, Comparator$-CC.comparingDouble(new c1(0)));
        List.-EL.sort(this.U1, Comparator$-CC.comparingDouble(new c1(1)));
        List.-EL.sort(this.V1, Comparator$-CC.comparingDouble(new c1(2)));
        List.-EL.sort(this.W1, Comparator$-CC.comparingDouble(new c1(2)));
        a aVar3 = new a(this.V1);
        this.Z1 = aVar3;
        aVar3.a = false;
        ViewParent parent = this.m1.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.m1);
        }
        this.D1 = false;
        this.C1 = org.telegram.messenger.g0.L(6.0f);
        this.x = true;
        int d12 = d1();
        this.r2 = d12;
        v0(d12);
        N();
        si.c d = this.Y0.d(new f1(this));
        if (Build.VERSION.SDK_INT < 31 || !az.f()) {
            this.k2 = null;
            this.l2 = new eh.c(d, d, d);
        } else {
            eh.g gVar = new eh.g(false);
            this.k2 = gVar;
            this.Y0.a(gVar);
            si.f fVar = new si.f(d);
            fVar.f = d;
            fVar.d = gVar;
            fVar.e = -2;
            eh.c cVar = new eh.c(fVar, fVar, fVar);
            this.l2 = cVar;
            cVar.k = true;
            int L = org.telegram.messenger.lc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar.d = L;
            cVar.e = L;
        }
        this.l2.j = this.Y0;
        hy hyVar = new hy(3, false);
        this.a2 = hyVar;
        hyVar.O = new ai.g2(this, 4);
        this.l1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(74.0f));
        this.l1.setClipToPadding(false);
        this.l1.setLayoutManager(hyVar);
        this.l1.setSelectorType(9);
        this.l1.setSelectorDrawableColor(0);
        this.l1.j(new ai.j5(this, 6));
        this.Y0.b(this.l1);
        g1 g1Var = new g1();
        this.b2 = g1Var;
        g1Var.C = false;
        g1Var.m = false;
        g1Var.n(280L);
        g1Var.o(xq.h);
        g1Var.D = 30L;
        this.l1.setItemAnimator(g1Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e2 = frameLayout;
        frameLayout.setClipChildren(false);
        h1 h1Var = new h1(this, context, e6Var, new d1(this, 0), new ai.t(3), new ai.t(3), new ai.t(3), new ai.t(3), new ai.t(3), new ai.t(3));
        this.h2 = h1Var;
        h1Var.d(new k5(1, 1));
        h1Var.setPreviewingAttributes(arrayList);
        h1Var.removeView(h1Var.Q);
        int i11 = -1;
        frameLayout.addView(h1Var, mf.c(-1.0f, -1));
        int i12 = this.u0;
        frameLayout.setPadding(i12, 0, i12, 0);
        ImageView imageView = new ImageView(context);
        this.f2 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ai.b(this, 9));
        pf.a(imageView);
        frameLayout.addView(imageView, mf.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.g2 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new ai.d(8, this, arrayList));
        pf.a(imageView2);
        frameLayout.addView(imageView2, mf.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i13 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout, textView, mf.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.i2 = m10;
        k2.p1.u(m10, 1, 13.0f, null, 2131750069);
        m10.setGravity(17);
        int i14 = -1879048193;
        m10.setTextColor(-1879048193);
        frameLayout.addView(m10, mf.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.R1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.S1 = new l1[3];
        this.c2 = new o1(context, e6Var, new ai.v2(this, 9));
        int i15 = 0;
        while (true) {
            l1[] l1VarArr = this.S1;
            if (i15 >= l1VarArr.length) {
                this.e2.addView(this.R1, mf.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.b.addView(this.e2, mf.e(-1, hs.m5, 55));
                int d13 = d1();
                View view = new View(context);
                this.j2 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(d13, hs.q2), d13 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e10 = mf.e(-1, 0, 48);
                e10.height = org.telegram.messenger.g0.m;
                this.b.addView(view, e10);
                this.c2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                gh.g c11 = this.l2.c(this.c2, null, false);
                c11.q(org.telegram.messenger.g0.L(4.0f));
                c11.r(org.telegram.messenger.g0.L(28.0f));
                c11.p(new hh.b(org.telegram.ui.ActionBar.k6.d6, e6Var));
                this.c2.setBackground(c11);
                this.b.addView(this.c2, mf.d(hs.r4, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.m2 = new k1((TL_stars.starGiftAttributeBackdrop) dg.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) dg.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) dg.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.d2.O(false);
                h1(false);
                tj0 tj0Var = this.l1;
                ViewGroup viewGroup = this.b;
                Objects.requireNonNull(tj0Var);
                this.p2 = new eh.k(tj0Var, viewGroup, new i40(tj0Var, 0));
                this.Y0.i(this.b);
                pi.q qVar = this.Y0;
                qVar.a = new f1(this);
                qVar.d = new ri.b(org.telegram.messenger.g0.L(48.0f));
                return;
            }
            l1 l1Var = new l1(context);
            l1Var.setClipChildren(false);
            org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, false, false);
            l1Var.c = h6Var;
            h6Var.setTypeface(org.telegram.messenger.g0.o());
            h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
            h6Var.setTextColor(i11);
            h6Var.setGravity(i13);
            l1Var.addView(h6Var, mf.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
            TextView textView2 = new TextView(context);
            l1Var.b = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor(i14);
            textView2.setGravity(i13);
            l1Var.addView(textView2, mf.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
            org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
            l1Var.d = h6Var2;
            h6Var2.setTypeface(org.telegram.messenger.g0.o());
            h6Var2.setTextColor(i11);
            h6Var2.setGravity(5);
            h6Var2.getDrawable().T = true;
            h6Var2.setTextSize(org.telegram.messenger.g0.L(11.0f));
            h6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.0f));
            h6Var2.setSizeableBackground(new v5(org.telegram.messenger.g0.L(10.0f), 285212671));
            l1Var.addView(h6Var2, mf.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
            l1VarArr[i15] = l1Var;
            if (i15 == 0) {
                ((TextView) this.S1[i15].b).setText(bd.M0(2131749634, null));
            } else if (i15 == 1) {
                ((TextView) this.S1[i15].b).setText(bd.M0(2131749651, null));
            } else if (i15 == 2) {
                ((TextView) this.S1[i15].b).setText(bd.M0(2131749632, null));
            }
            pf.a(this.S1[i15]);
            this.S1[i15].setOnClickListener(new bi.q(this, i15, 1));
            this.S1[i15].setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 10, 10));
            LinearLayout linearLayout2 = this.R1;
            l1[] l1VarArr2 = this.S1;
            linearLayout2.addView(l1VarArr2[i15], mf.q(0, 42, 1.0f, 7, 0, 0, i15 != l1VarArr2.length - 1 ? 11 : 0, 0));
            i15++;
            i13 = 17;
            i11 = -1;
            i14 = -1879048193;
        }
    }

    public static double e1(TL_stars.StarGiftAttribute starGiftAttribute) {
        TL_stars.StarGiftAttributeRarity starGiftAttributeRarity = starGiftAttribute.rarity;
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            return ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            return 0.01d;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            return 0.02d;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            return 0.03d;
        }
        return starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon ? 0.04d : 0.0d;
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        i1 i1Var = new i1(this, this.l1, getContext(), this.Q1, new ai.c(this, 15), this.J0);
        this.d2 = i1Var;
        i1Var.r = false;
        return i1Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final tj0 M0(Context context) {
        return new j1(this, context, this.J0, 0);
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean X(float f10, float f11) {
        FrameLayout frameLayout = this.e2;
        return frameLayout.getVisibility() == 0 && frameLayout.getY() > f11;
    }

    public final int d1() {
        return i0.a.f(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, this.J0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0));
    }

    public final boolean f1(k1 k1Var) {
        if (this.s2 == 1) {
            return false;
        }
        int i3 = this.c2.s;
        k1 k1Var2 = this.m2;
        if (k1Var2 == null) {
            return false;
        }
        if (i3 == 1) {
            if (k1Var.a != k1Var2.a) {
                return false;
            }
        } else if (i3 == 2) {
            if (k1Var.b != k1Var2.b) {
                return false;
            }
        } else if (i3 != 0 || k1Var.c != k1Var2.c) {
            return false;
        }
        return true;
    }

    public final void g1(int i3) {
        if (this.s2 == i3) {
            return;
        }
        this.s2 = i3;
        this.g2.setImageResource(i3 == 2 ? R.drawable.filled_gift_play_24 : R.drawable.filled_gift_pause_24);
        this.i2.setText(bd.M0(i3 == 2 ? 2131750068 : 2131750069, null));
        i1();
    }

    public final void h1(boolean z10) {
        h1 h1Var = this.h2;
        if (h1Var.getUpgradeImageViewAttribute() == null || h1Var.getUpgradeBackdropAttribute() == null || h1Var.getUpgradePatternAttribute() == null) {
            return;
        }
        l1[] l1VarArr = this.S1;
        ((org.telegram.ui.Components.h6) l1VarArr[0].c).c(h1Var.getUpgradeImageViewAttribute().name, z10, true);
        ((org.telegram.ui.Components.h6) l1VarArr[0].d).setText(l6.G1(h1Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
        ((org.telegram.ui.Components.h6) l1VarArr[1].c).c(h1Var.getUpgradeBackdropAttribute().name, z10, true);
        ((org.telegram.ui.Components.h6) l1VarArr[1].d).c(ii.k.J0(h1Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
        ((org.telegram.ui.Components.h6) l1VarArr[2].c).c(h1Var.getUpgradePatternAttribute().name, z10, true);
        ((org.telegram.ui.Components.h6) l1VarArr[2].d).c(ii.k.J0(h1Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
    }

    public final void i1() {
        n1 n1Var;
        k1 k1Var;
        tj0 tj0Var = this.l1;
        int childCount = tj0Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = tj0Var.getChildAt(i3);
            if ((childAt instanceof n1) && (k1Var = (n1Var = (n1) childAt).w) != null) {
                boolean f12 = f1(k1Var);
                n1Var.c.f(f12, true);
                n1Var.r.a(f12, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void p0() {
        WindowInsets windowInsets = this.h;
        int systemWindowInsetBottom = windowInsets != null ? windowInsets.getSystemWindowInsetBottom() : 0;
        if (this.q2 != systemWindowInsetBottom) {
            this.q2 = systemWindowInsetBottom;
            this.l1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(74.0f) + systemWindowInsetBottom);
            o1 o1Var = this.c2;
            ((ViewGroup.MarginLayoutParams) o1Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(5.0f) + this.q2;
            o1Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        try {
            int d12 = d1();
            if (d12 != this.r2) {
                this.r2 = d12;
                v0(d12);
                View view = this.j2;
                if (view != null && (view.getBackground() instanceof GradientDrawable)) {
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{i0.a.o(d12, hs.q2), d12 & 16777215});
                }
            }
            o1 o1Var = this.c2;
            if (o1Var != null) {
                int i3 = org.telegram.ui.ActionBar.k6.Kl;
                org.telegram.ui.ActionBar.e6 e6Var = o1Var.r;
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.09411765f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
                org.telegram.ui.ActionBar.k6.r1(0.1254902f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
                o1Var.e.setColor(r12);
                o1Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void v() {
        this.Y0.g();
    }
}
