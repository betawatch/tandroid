package di;

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
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.pc;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ty;
import org.telegram.ui.p40;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h1 extends org.telegram.ui.Components.ra {
    public static final /* synthetic */ int w2 = 0;
    public final int T1;
    public final LinearLayout U1;
    public final d1[] V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final com.google.android.gms.common.api.internal.p a2;
    public final com.google.android.gms.common.api.internal.p b2;
    public final com.google.android.gms.common.api.internal.p c2;
    public final ty d2;
    public final y0 e2;
    public final g1 f2;
    public a1 g2;
    public final FrameLayout h2;
    public final ImageView i2;
    public final ImageView j2;
    public final z0 k2;
    public final TextView l2;
    public final View m2;
    public final dh.g n2;
    public final dh.c o2;
    public c1 p2;
    public final boolean q2;
    public boolean r2;
    public final dh.k s2;
    public int t2;
    public int u2;
    public int v2;

    public h1(Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, i6Var);
        this.v2 = 1;
        this.T1 = i7;
        this.q2 = z10;
        ArrayList c10 = cg.d.c(TL_stars.starGiftAttributeBackdrop.class, arrayList);
        this.W1 = c10;
        com.google.android.gms.common.api.internal.p pVar = new com.google.android.gms.common.api.internal.p(c10);
        this.a2 = pVar;
        pVar.b = false;
        ArrayList c11 = cg.d.c(TL_stars.starGiftAttributePattern.class, arrayList);
        this.X1 = c11;
        com.google.android.gms.common.api.internal.p pVar2 = new com.google.android.gms.common.api.internal.p(c11);
        this.b2 = pVar2;
        pVar2.b = false;
        this.Y1 = cg.d.c(TL_stars.starGiftAttributeModel.class, arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.Z1 = arrayList2;
        if (z10) {
            int i10 = 0;
            while (i10 < this.Y1.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.Y1.get(i10);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.Z1.add(stargiftattributemodel);
                    this.Y1.remove(i10);
                    i10--;
                }
                i10++;
            }
        } else {
            arrayList2.clear();
        }
        List.-EL.sort(this.W1, Comparator$-CC.comparingDouble(new w0(0)));
        List.-EL.sort(this.X1, Comparator$-CC.comparingDouble(new w0(1)));
        List.-EL.sort(this.Y1, Comparator$-CC.comparingDouble(new w0(2)));
        List.-EL.sort(this.Z1, Comparator$-CC.comparingDouble(new w0(2)));
        com.google.android.gms.common.api.internal.p pVar3 = new com.google.android.gms.common.api.internal.p(this.Y1);
        this.c2 = pVar3;
        pVar3.b = false;
        ViewParent parent = this.p1.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.p1);
        }
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(6.0f);
        this.x = true;
        int e12 = e1();
        this.u2 = e12;
        v0(e12);
        O();
        ui.c d = this.Y0.d(new x0(this));
        if (Build.VERSION.SDK_INT < 31 || !bz.f()) {
            this.n2 = null;
            this.o2 = new dh.c(d, d, d);
        } else {
            dh.g gVar = new dh.g(false);
            this.n2 = gVar;
            this.Y0.a(gVar);
            ui.f fVar = new ui.f(d);
            fVar.f = d;
            fVar.d = gVar;
            fVar.e = -2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.o2 = cVar;
            cVar.k = true;
            int L = pc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar.d = L;
            cVar.e = L;
        }
        this.o2.j = this.Y0;
        ty tyVar = new ty(3, false);
        this.d2 = tyVar;
        tyVar.O = new bi.y2(this, 4);
        this.o1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(74.0f));
        this.o1.setClipToPadding(false);
        this.o1.setLayoutManager(tyVar);
        this.o1.setSelectorType(9);
        this.o1.setSelectorDrawableColor(0);
        this.o1.j(new bi.v1(this, 8));
        this.Y0.b(this.o1);
        y0 y0Var = new y0();
        this.e2 = y0Var;
        y0Var.C = false;
        y0Var.m = false;
        y0Var.n(280L);
        y0Var.o(kr.h);
        y0Var.D = 30L;
        this.o1.setItemAnimator(y0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h2 = frameLayout;
        frameLayout.setClipChildren(false);
        z0 z0Var = new z0(this, context, i6Var, new ca.r(this, 14), new bi.o(6), new bi.o(6), new bi.o(6), new bi.o(6), new bi.o(6), new bi.o(6));
        this.k2 = z0Var;
        z0Var.d(new e5(1, 1));
        z0Var.setPreviewingAttributes(arrayList);
        z0Var.removeView(z0Var.Q);
        int i11 = -1;
        frameLayout.addView(z0Var, c8.na.c(-1.0f, -1));
        int i12 = this.u0;
        frameLayout.setPadding(i12, 0, i12, 0);
        ImageView imageView = new ImageView(context);
        this.i2 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.n6.b0(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ah.d(this, 14));
        c8.sa.a(imageView);
        frameLayout.addView(imageView, c8.na.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.j2 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.n6.b0(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new ai.p2(11, this, arrayList));
        c8.sa.a(imageView2);
        frameLayout.addView(imageView2, c8.na.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i13 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, c8.na.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.l2 = m10;
        float f10 = 13.0f;
        i5.c.r(13.0f, 1, 2131750044, m10, null);
        m10.setGravity(17);
        int i14 = -1879048193;
        m10.setTextColor(-1879048193);
        frameLayout.addView(m10, c8.na.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.V1 = new d1[3];
        this.f2 = new g1(context, i6Var, new ai.d0(this, 10));
        int i15 = 0;
        while (true) {
            d1[] d1VarArr = this.V1;
            float f11 = f10;
            if (i15 >= d1VarArr.length) {
                this.h2.addView(this.U1, c8.na.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.b.addView(this.h2, c8.na.e(-1, ks.m5, 55));
                int e13 = e1();
                View view = new View(context);
                this.m2 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(e13, ks.q2), e13 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e10 = c8.na.e(-1, 0, 48);
                e10.height = org.telegram.messenger.g0.m;
                this.b.addView(view, e10);
                this.f2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                fh.g c12 = this.o2.c(this.f2, null, false);
                c12.q(org.telegram.messenger.g0.L(4.0f));
                c12.r(org.telegram.messenger.g0.L(28.0f));
                c12.p(new gh.b(org.telegram.ui.ActionBar.n6.d6, i6Var));
                this.f2.setBackground(c12);
                this.b.addView(this.f2, c8.na.d(ks.r4, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.p2 = new c1((TL_stars.starGiftAttributeBackdrop) cg.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) cg.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) cg.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.g2.O(false);
                i1(false);
                ek0 ek0Var = this.o1;
                ViewGroup viewGroup = this.b;
                Objects.requireNonNull(ek0Var);
                this.s2 = new dh.k(ek0Var, viewGroup, new p40(ek0Var, 0));
                this.Y0.i(this.b);
                ri.q qVar = this.Y0;
                qVar.a = new x0(this);
                qVar.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
                return;
            }
            d1 d1Var = new d1(context);
            d1Var.setClipChildren(false);
            org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, false, false);
            d1Var.c = n6Var;
            n6Var.setTypeface(org.telegram.messenger.g0.o());
            n6Var.setTextSize(org.telegram.messenger.g0.L(f11));
            n6Var.setTextColor(i11);
            n6Var.setGravity(i13);
            d1Var.addView(n6Var, c8.na.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
            TextView textView2 = new TextView(context);
            d1Var.b = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor(i14);
            textView2.setGravity(i13);
            d1Var.addView(textView2, c8.na.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
            org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(context, false, false, false);
            d1Var.d = n6Var2;
            n6Var2.setTypeface(org.telegram.messenger.g0.o());
            n6Var2.setTextColor(i11);
            n6Var2.setGravity(5);
            n6Var2.getDrawable().U = true;
            n6Var2.setTextSize(org.telegram.messenger.g0.L(11.0f));
            n6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.0f));
            n6Var2.setSizeableBackground(new p5(org.telegram.messenger.g0.L(10.0f), 285212671));
            d1Var.addView(n6Var2, c8.na.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
            d1VarArr[i15] = d1Var;
            if (i15 == 0) {
                ((TextView) this.V1[i15].b).setText(gd.N0(2131749453, null));
            } else if (i15 == 1) {
                ((TextView) this.V1[i15].b).setText(gd.N0(2131749470, null));
            } else if (i15 == 2) {
                ((TextView) this.V1[i15].b).setText(gd.N0(2131749451, null));
            }
            c8.sa.a(this.V1[i15]);
            this.V1[i15].setOnClickListener(new ci.q(this, i15, 1));
            this.V1[i15].setBackground(org.telegram.ui.ActionBar.n6.b0(0, 285212671, 10, 10));
            LinearLayout linearLayout2 = this.U1;
            d1[] d1VarArr2 = this.V1;
            linearLayout2.addView(d1VarArr2[i15], c8.na.q(0, 42, 1.0f, 7, 0, 0, i15 != d1VarArr2.length - 1 ? 11 : 0, 0));
            i15++;
            f10 = f11;
            i13 = 17;
            i11 = -1;
            i14 = -1879048193;
        }
    }

    public static double f1(TL_stars.StarGiftAttribute starGiftAttribute) {
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

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        a1 a1Var = new a1(this, this.o1, getContext(), this.T1, new bi.b(this, 16), this.J0);
        this.g2 = a1Var;
        a1Var.r = false;
        return a1Var;
    }

    @Override // org.telegram.ui.Components.ra
    public final ek0 N0(Context context) {
        return new b1(this, context, this.J0, 0);
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean Y(float f10, float f11) {
        FrameLayout frameLayout = this.h2;
        return frameLayout.getVisibility() == 0 && frameLayout.getY() > f11;
    }

    public final int e1() {
        return i0.a.f(0.1f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i5, this.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.J0));
    }

    public final boolean g1(c1 c1Var) {
        if (this.v2 == 1) {
            return false;
        }
        int i7 = this.f2.s;
        c1 c1Var2 = this.p2;
        if (c1Var2 == null) {
            return false;
        }
        if (i7 == 1) {
            if (c1Var.a != c1Var2.a) {
                return false;
            }
        } else if (i7 == 2) {
            if (c1Var.b != c1Var2.b) {
                return false;
            }
        } else if (i7 != 0 || c1Var.c != c1Var2.c) {
            return false;
        }
        return true;
    }

    public final void h1(int i7) {
        if (this.v2 == i7) {
            return;
        }
        this.v2 = i7;
        this.j2.setImageResource(i7 == 2 ? R.drawable.filled_gift_play_24 : R.drawable.filled_gift_pause_24);
        this.l2.setText(gd.N0(i7 == 2 ? 2131750043 : 2131750044, null));
        j1();
    }

    public final void i1(boolean z10) {
        z0 z0Var = this.k2;
        if (z0Var.getUpgradeImageViewAttribute() == null || z0Var.getUpgradeBackdropAttribute() == null || z0Var.getUpgradePatternAttribute() == null) {
            return;
        }
        d1[] d1VarArr = this.V1;
        ((org.telegram.ui.Components.n6) d1VarArr[0].c).c(z0Var.getUpgradeImageViewAttribute().name, z10, true);
        ((org.telegram.ui.Components.n6) d1VarArr[0].d).setText(f6.L1(z0Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
        ((org.telegram.ui.Components.n6) d1VarArr[1].c).c(z0Var.getUpgradeBackdropAttribute().name, z10, true);
        ((org.telegram.ui.Components.n6) d1VarArr[1].d).c(ki.j.J0(z0Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
        ((org.telegram.ui.Components.n6) d1VarArr[2].c).c(z0Var.getUpgradePatternAttribute().name, z10, true);
        ((org.telegram.ui.Components.n6) d1VarArr[2].d).c(ki.j.J0(z0Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
    }

    public final void j1() {
        f1 f1Var;
        c1 c1Var;
        ek0 ek0Var = this.o1;
        int childCount = ek0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = ek0Var.getChildAt(i7);
            if ((childAt instanceof f1) && (c1Var = (f1Var = (f1) childAt).w) != null) {
                boolean g12 = g1(c1Var);
                f1Var.c.f(g12, true);
                f1Var.r.a(g12, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void p0() {
        WindowInsets windowInsets = this.h;
        int systemWindowInsetBottom = windowInsets != null ? windowInsets.getSystemWindowInsetBottom() : 0;
        if (this.t2 != systemWindowInsetBottom) {
            this.t2 = systemWindowInsetBottom;
            this.o1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(74.0f) + systemWindowInsetBottom);
            g1 g1Var = this.f2;
            ((ViewGroup.MarginLayoutParams) g1Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(5.0f) + this.t2;
            g1Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            int e12 = e1();
            if (e12 != this.u2) {
                this.u2 = e12;
                v0(e12);
                View view = this.m2;
                if (view != null && (view.getBackground() instanceof GradientDrawable)) {
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{i0.a.o(e12, ks.q2), e12 & 16777215});
                }
            }
            g1 g1Var = this.f2;
            if (g1Var != null) {
                int i7 = org.telegram.ui.ActionBar.n6.Nl;
                org.telegram.ui.ActionBar.i6 i6Var = g1Var.r;
                int r12 = org.telegram.ui.ActionBar.n6.r1(0.09411765f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
                org.telegram.ui.ActionBar.n6.r1(0.1254902f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
                g1Var.e.setColor(r12);
                g1Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void v() {
        this.Y0.g();
    }
}
