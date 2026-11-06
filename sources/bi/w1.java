package bi;

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
import j$.util.Comparator$-CC;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.iz;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.n40;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class w1 extends org.telegram.ui.Components.na {
    public static final /* synthetic */ int s2 = 0;
    public final int P1;
    public final LinearLayout Q1;
    public final s1[] R1;
    public final ArrayList S1;
    public final ArrayList T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final a W1;
    public final a X1;
    public final a Y1;
    public final jy Z1;
    public final n1 a2;
    public final v1 b2;
    public p1 c2;
    public final FrameLayout d2;
    public final ImageView e2;
    public final ImageView f2;
    public final o1 g2;
    public final TextView h2;
    public final View i2;
    public final dh.g j2;
    public final dh.c k2;
    public r1 l2;
    public final boolean m2;
    public boolean n2;
    public final dh.k o2;
    public int p2;
    public int q2;
    public int r2;

    public w1(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7, String str, ArrayList arrayList, boolean z9) {
        super(context, null, false, false, f6Var);
        this.r2 = 1;
        this.P1 = i7;
        this.m2 = z9;
        ArrayList c10 = cg.d.c(TL_stars.starGiftAttributeBackdrop.class, arrayList);
        this.S1 = c10;
        a aVar = new a(c10);
        this.W1 = aVar;
        aVar.a = false;
        ArrayList c11 = cg.d.c(TL_stars.starGiftAttributePattern.class, arrayList);
        this.T1 = c11;
        a aVar2 = new a(c11);
        this.X1 = aVar2;
        aVar2.a = false;
        this.U1 = cg.d.c(TL_stars.starGiftAttributeModel.class, arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.V1 = arrayList2;
        if (z9) {
            int i10 = 0;
            while (i10 < this.U1.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.U1.get(i10);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.V1.add(stargiftattributemodel);
                    this.U1.remove(i10);
                    i10--;
                }
                i10++;
            }
        } else {
            arrayList2.clear();
        }
        List.-EL.sort(this.S1, Comparator$-CC.comparingDouble(new j1(0)));
        List.-EL.sort(this.T1, Comparator$-CC.comparingDouble(new j1(1)));
        List.-EL.sort(this.U1, Comparator$-CC.comparingDouble(new j1(2)));
        List.-EL.sort(this.V1, Comparator$-CC.comparingDouble(new j1(2)));
        a aVar3 = new a(this.U1);
        this.Y1 = aVar3;
        aVar3.a = false;
        ViewParent parent = this.l1.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.l1);
        }
        this.C1 = false;
        this.B1 = org.telegram.messenger.g0.L(6.0f);
        this.x = true;
        int d12 = d1();
        this.q2 = d12;
        v0(d12);
        N();
        ri.c d = this.X0.d(new m1(this));
        if (Build.VERSION.SDK_INT < 31 || !iz.f()) {
            this.j2 = null;
            this.k2 = new dh.c(d, d, d);
        } else {
            dh.g gVar = new dh.g(false);
            this.j2 = gVar;
            this.X0.a(gVar);
            ri.f fVar = new ri.f(d);
            fVar.f = d;
            fVar.d = gVar;
            fVar.e = -2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.k2 = cVar;
            cVar.k = true;
            int L = org.telegram.messenger.rc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar.d = L;
            cVar.e = L;
        }
        this.k2.j = this.X0;
        jy jyVar = new jy(3, false);
        this.Z1 = jyVar;
        jyVar.O = new ai.l(this, 1);
        this.k1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(74.0f));
        this.k1.setClipToPadding(false);
        this.k1.setLayoutManager(jyVar);
        this.k1.setSelectorType(9);
        this.k1.setSelectorDrawableColor(0);
        this.k1.j(new ai.b(this, 3));
        this.X0.b(this.k1);
        n1 n1Var = new n1();
        this.a2 = n1Var;
        n1Var.C = false;
        n1Var.m = false;
        n1Var.n(280L);
        n1Var.o(xq.h);
        n1Var.D = 30L;
        this.k1.setItemAnimator(n1Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d2 = frameLayout;
        frameLayout.setClipChildren(false);
        o1 o1Var = new o1(this, context, f6Var, new a3.f(this, 20), new l1(0), new l1(0), new l1(0), new l1(0), new l1(0), new l1(0));
        this.g2 = o1Var;
        o1Var.d(new g6(1, 1));
        o1Var.setPreviewingAttributes(arrayList);
        o1Var.removeView(o1Var.P);
        frameLayout.addView(o1Var, c8.ha.c(-1.0f, -1));
        int i11 = this.t0;
        frameLayout.setPadding(i11, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.e2 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ah.d(this, 6));
        c8.ka.a(imageView);
        frameLayout.addView(imageView, c8.ha.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f2 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new r(3, this, arrayList));
        c8.ka.a(imageView2);
        frameLayout.addView(imageView2, c8.ha.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i12 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView i13 = org.telegram.ui.Cells.f1.i(frameLayout, textView, c8.ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.h2 = i13;
        jg.g.v(i13, 1, 13.0f, null, 2131750060);
        i13.setGravity(17);
        int i14 = -1879048193;
        i13.setTextColor(-1879048193);
        frameLayout.addView(i13, c8.ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.R1 = new s1[3];
        int i15 = 5;
        this.b2 = new v1(context, f6Var, new ai.i(this, 5));
        int i16 = 0;
        while (true) {
            s1[] s1VarArr = this.R1;
            if (i16 >= s1VarArr.length) {
                this.d2.addView(this.Q1, c8.ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.b.addView(this.d2, c8.ha.e(-1, qs.m5, 55));
                int d13 = d1();
                View view = new View(context);
                this.i2 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(d13, qs.q2), d13 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e10 = c8.ha.e(-1, 0, 48);
                e10.height = org.telegram.messenger.g0.m;
                this.b.addView(view, e10);
                this.b2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                fh.g c12 = this.k2.c(this.b2, null, false);
                c12.q(org.telegram.messenger.g0.L(4.0f));
                c12.r(org.telegram.messenger.g0.L(28.0f));
                c12.p(new gh.b(org.telegram.ui.ActionBar.k6.d6, f6Var));
                this.b2.setBackground(c12);
                this.b.addView(this.b2, c8.ha.d(qs.r4, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.l2 = new r1((TL_stars.starGiftAttributeBackdrop) cg.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) cg.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) cg.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.c2.O(false);
                h1(false);
                pj0 pj0Var = this.k1;
                ViewGroup viewGroup = this.b;
                Objects.requireNonNull(pj0Var);
                this.o2 = new dh.k(pj0Var, viewGroup, new n40(pj0Var, 0));
                this.X0.i(this.b);
                oi.q qVar = this.X0;
                qVar.a = new m1(this);
                qVar.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
                return;
            }
            s1 s1Var = new s1(context);
            s1Var.setClipChildren(false);
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, false, false);
            s1Var.c = j6Var;
            j6Var.setTypeface(org.telegram.messenger.g0.o());
            j6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
            j6Var.setTextColor(-1);
            j6Var.setGravity(i12);
            s1Var.addView(j6Var, c8.ha.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
            TextView textView2 = new TextView(context);
            s1Var.b = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor(i14);
            textView2.setGravity(i12);
            s1Var.addView(textView2, c8.ha.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
            org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
            s1Var.d = j6Var2;
            j6Var2.setTypeface(org.telegram.messenger.g0.o());
            j6Var2.setTextColor(-1);
            j6Var2.setGravity(i15);
            j6Var2.getDrawable().T = true;
            j6Var2.setTextSize(org.telegram.messenger.g0.L(11.0f));
            j6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.0f));
            j6Var2.setSizeableBackground(new t6(org.telegram.messenger.g0.L(10.0f), 285212671));
            s1Var.addView(j6Var2, c8.ha.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
            s1VarArr[i16] = s1Var;
            if (i16 == 0) {
                ((TextView) this.R1[i16].b).setText(org.telegram.messenger.hd.M0(2131749625, null));
            } else if (i16 == 1) {
                ((TextView) this.R1[i16].b).setText(org.telegram.messenger.hd.M0(2131749642, null));
            } else if (i16 == 2) {
                ((TextView) this.R1[i16].b).setText(org.telegram.messenger.hd.M0(2131749623, null));
            }
            c8.ka.a(this.R1[i16]);
            this.R1[i16].setOnClickListener(new ai.v(this, i16, 1));
            this.R1[i16].setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 10, 10));
            LinearLayout linearLayout2 = this.Q1;
            s1[] s1VarArr2 = this.R1;
            linearLayout2.addView(s1VarArr2[i16], c8.ha.q(0, 42, 1.0f, 7, 0, 0, i16 != s1VarArr2.length - 1 ? 11 : 0, 0));
            i16++;
            i12 = 17;
            i14 = -1879048193;
            i15 = 5;
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

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        p1 p1Var = new p1(this, this.k1, getContext(), this.P1, new ai.e(this, 5), this.I0);
        this.c2 = p1Var;
        p1Var.r = false;
        return p1Var;
    }

    @Override // org.telegram.ui.Components.na
    public final pj0 M0(Context context) {
        return new q1(this, context, this.I0, 0);
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean X(float f10, float f11) {
        FrameLayout frameLayout = this.d2;
        return frameLayout.getVisibility() == 0 && frameLayout.getY() > f11;
    }

    public final int d1() {
        return i0.a.f(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, this.I0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.I0));
    }

    public final boolean f1(r1 r1Var) {
        if (this.r2 == 1) {
            return false;
        }
        int i7 = this.b2.s;
        r1 r1Var2 = this.l2;
        if (r1Var2 == null) {
            return false;
        }
        if (i7 == 1) {
            if (r1Var.a != r1Var2.a) {
                return false;
            }
        } else if (i7 == 2) {
            if (r1Var.b != r1Var2.b) {
                return false;
            }
        } else if (i7 != 0 || r1Var.c != r1Var2.c) {
            return false;
        }
        return true;
    }

    public final void g1(int i7) {
        if (this.r2 == i7) {
            return;
        }
        this.r2 = i7;
        this.f2.setImageResource(i7 == 2 ? R.drawable.filled_gift_play_24 : R.drawable.filled_gift_pause_24);
        this.h2.setText(org.telegram.messenger.hd.M0(i7 == 2 ? 2131750059 : 2131750060, null));
        i1();
    }

    public final void h1(boolean z9) {
        o1 o1Var = this.g2;
        if (o1Var.getUpgradeImageViewAttribute() == null || o1Var.getUpgradeBackdropAttribute() == null || o1Var.getUpgradePatternAttribute() == null) {
            return;
        }
        s1[] s1VarArr = this.R1;
        ((org.telegram.ui.Components.j6) s1VarArr[0].c).c(o1Var.getUpgradeImageViewAttribute().name, z9, true);
        ((org.telegram.ui.Components.j6) s1VarArr[0].d).setText(k7.G1(o1Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
        ((org.telegram.ui.Components.j6) s1VarArr[1].c).c(o1Var.getUpgradeBackdropAttribute().name, z9, true);
        ((org.telegram.ui.Components.j6) s1VarArr[1].d).c(hi.j.J0(o1Var.getUpgradeBackdropAttribute().getRarityPermille()), z9, true);
        ((org.telegram.ui.Components.j6) s1VarArr[2].c).c(o1Var.getUpgradePatternAttribute().name, z9, true);
        ((org.telegram.ui.Components.j6) s1VarArr[2].d).c(hi.j.J0(o1Var.getUpgradePatternAttribute().getRarityPermille()), z9, true);
    }

    public final void i1() {
        u1 u1Var;
        r1 r1Var;
        pj0 pj0Var = this.k1;
        int childCount = pj0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = pj0Var.getChildAt(i7);
            if ((childAt instanceof u1) && (r1Var = (u1Var = (u1) childAt).w) != null) {
                boolean f12 = f1(r1Var);
                u1Var.c.f(f12, true);
                u1Var.r.a(f12, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void p0() {
        WindowInsets windowInsets = this.h;
        int systemWindowInsetBottom = windowInsets != null ? windowInsets.getSystemWindowInsetBottom() : 0;
        if (this.p2 != systemWindowInsetBottom) {
            this.p2 = systemWindowInsetBottom;
            this.k1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(74.0f) + systemWindowInsetBottom);
            v1 v1Var = this.b2;
            ((ViewGroup.MarginLayoutParams) v1Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(5.0f) + this.p2;
            v1Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        super.s0();
        try {
            int d12 = d1();
            if (d12 != this.q2) {
                this.q2 = d12;
                v0(d12);
                View view = this.i2;
                if (view != null && (view.getBackground() instanceof GradientDrawable)) {
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{i0.a.o(d12, qs.q2), d12 & 16777215});
                }
            }
            v1 v1Var = this.b2;
            if (v1Var != null) {
                int i7 = org.telegram.ui.ActionBar.k6.Kl;
                org.telegram.ui.ActionBar.f6 f6Var = v1Var.r;
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.09411765f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
                org.telegram.ui.ActionBar.k6.r1(0.1254902f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
                v1Var.e.setColor(r12);
                v1Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void v() {
        this.X0.g();
    }
}
