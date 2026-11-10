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
import org.telegram.ui.Components.wq;
import org.telegram.ui.q40;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w1 extends org.telegram.ui.Components.ma {
    public static final /* synthetic */ int v2 = 0;
    public final int S1;
    public final LinearLayout T1;
    public final s1[] U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final a Z1;
    public final a a2;
    public final a b2;
    public final jy c2;
    public final n1 d2;
    public final v1 e2;
    public p1 f2;
    public final FrameLayout g2;
    public final ImageView h2;
    public final ImageView i2;
    public final o1 j2;
    public final TextView k2;
    public final View l2;
    public final dh.g m2;
    public final dh.c n2;
    public r1 o2;
    public final boolean p2;
    public boolean q2;
    public final dh.k r2;
    public int s2;
    public int t2;
    public int u2;

    public w1(Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7, String str, ArrayList arrayList, boolean z9) {
        super(context, null, false, false, h6Var);
        this.u2 = 1;
        this.S1 = i7;
        this.p2 = z9;
        ArrayList c10 = cg.d.c(TL_stars.starGiftAttributeBackdrop.class, arrayList);
        this.V1 = c10;
        a aVar = new a(c10);
        this.Z1 = aVar;
        aVar.a = false;
        ArrayList c11 = cg.d.c(TL_stars.starGiftAttributePattern.class, arrayList);
        this.W1 = c11;
        a aVar2 = new a(c11);
        this.a2 = aVar2;
        aVar2.a = false;
        this.X1 = cg.d.c(TL_stars.starGiftAttributeModel.class, arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.Y1 = arrayList2;
        if (z9) {
            int i10 = 0;
            while (i10 < this.X1.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.X1.get(i10);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.Y1.add(stargiftattributemodel);
                    this.X1.remove(i10);
                    i10--;
                }
                i10++;
            }
        } else {
            arrayList2.clear();
        }
        List.-EL.sort(this.V1, Comparator$-CC.comparingDouble(new j1(0)));
        List.-EL.sort(this.W1, Comparator$-CC.comparingDouble(new j1(1)));
        List.-EL.sort(this.X1, Comparator$-CC.comparingDouble(new j1(2)));
        List.-EL.sort(this.Y1, Comparator$-CC.comparingDouble(new j1(2)));
        a aVar3 = new a(this.X1);
        this.b2 = aVar3;
        aVar3.a = false;
        ViewParent parent = this.o1.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.o1);
        }
        this.F1 = false;
        this.E1 = org.telegram.messenger.g0.L(6.0f);
        this.x = true;
        int d12 = d1();
        this.t2 = d12;
        v0(d12);
        N();
        ri.c d = this.X0.d(new m1(this));
        if (Build.VERSION.SDK_INT < 31 || !iz.f()) {
            this.m2 = null;
            this.n2 = new dh.c(d, d, d);
        } else {
            dh.g gVar = new dh.g(false);
            this.m2 = gVar;
            this.X0.a(gVar);
            ri.f fVar = new ri.f(d);
            fVar.f = d;
            fVar.d = gVar;
            fVar.e = -2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.n2 = cVar;
            cVar.k = true;
            int L = org.telegram.messenger.sc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar.d = L;
            cVar.e = L;
        }
        this.n2.j = this.X0;
        jy jyVar = new jy(3, false);
        this.c2 = jyVar;
        jyVar.O = new ai.l(this, 1);
        this.n1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(74.0f));
        this.n1.setClipToPadding(false);
        this.n1.setLayoutManager(jyVar);
        this.n1.setSelectorType(9);
        this.n1.setSelectorDrawableColor(0);
        this.n1.j(new ai.b(this, 3));
        this.X0.b(this.n1);
        n1 n1Var = new n1();
        this.d2 = n1Var;
        n1Var.C = false;
        n1Var.m = false;
        n1Var.n(280L);
        n1Var.o(wq.h);
        n1Var.D = 30L;
        this.n1.setItemAnimator(n1Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g2 = frameLayout;
        frameLayout.setClipChildren(false);
        o1 o1Var = new o1(this, context, h6Var, new a3.f(this, 20), new l1(0), new l1(0), new l1(0), new l1(0), new l1(0), new l1(0));
        this.j2 = o1Var;
        o1Var.d(new g6(1, 1));
        o1Var.setPreviewingAttributes(arrayList);
        o1Var.removeView(o1Var.P);
        frameLayout.addView(o1Var, c8.ha.c(-1.0f, -1));
        int i11 = this.t0;
        frameLayout.setPadding(i11, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.h2 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.m6.b0(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ah.d(this, 6));
        c8.ka.a(imageView);
        frameLayout.addView(imageView, c8.ha.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.i2 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.m6.b0(0, 285212671, 16, 16));
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
        this.k2 = i13;
        jg.g.v(i13, 1, 13.0f, null, 2131750061);
        i13.setGravity(17);
        int i14 = -1879048193;
        i13.setTextColor(-1879048193);
        frameLayout.addView(i13, c8.ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.U1 = new s1[3];
        int i15 = 5;
        this.e2 = new v1(context, h6Var, new ai.i(this, 5));
        int i16 = 0;
        while (true) {
            s1[] s1VarArr = this.U1;
            if (i16 >= s1VarArr.length) {
                this.g2.addView(this.T1, c8.ha.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.b.addView(this.g2, c8.ha.e(-1, qs.m5, 55));
                int d13 = d1();
                View view = new View(context);
                this.l2 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(d13, qs.q2), d13 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e10 = c8.ha.e(-1, 0, 48);
                e10.height = org.telegram.messenger.g0.m;
                this.b.addView(view, e10);
                this.e2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                fh.g c12 = this.n2.c(this.e2, null, false);
                c12.q(org.telegram.messenger.g0.L(4.0f));
                c12.r(org.telegram.messenger.g0.L(28.0f));
                c12.p(new gh.b(org.telegram.ui.ActionBar.m6.d6, h6Var));
                this.e2.setBackground(c12);
                this.b.addView(this.e2, c8.ha.d(qs.r4, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.o2 = new r1((TL_stars.starGiftAttributeBackdrop) cg.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) cg.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) cg.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f2.O(false);
                h1(false);
                pj0 pj0Var = this.n1;
                ViewGroup viewGroup = this.b;
                Objects.requireNonNull(pj0Var);
                this.r2 = new dh.k(pj0Var, viewGroup, new q40(pj0Var, 0));
                this.X0.i(this.b);
                oi.q qVar = this.X0;
                qVar.a = new m1(this);
                qVar.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
                return;
            }
            s1 s1Var = new s1(context);
            s1Var.setClipChildren(false);
            org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, true, false, false);
            s1Var.c = i6Var;
            i6Var.setTypeface(org.telegram.messenger.g0.o());
            i6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
            i6Var.setTextColor(-1);
            i6Var.setGravity(i12);
            s1Var.addView(i6Var, c8.ha.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
            TextView textView2 = new TextView(context);
            s1Var.b = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor(i14);
            textView2.setGravity(i12);
            s1Var.addView(textView2, c8.ha.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
            org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(context, false, false, false);
            s1Var.d = i6Var2;
            i6Var2.setTypeface(org.telegram.messenger.g0.o());
            i6Var2.setTextColor(-1);
            i6Var2.setGravity(i15);
            i6Var2.getDrawable().T = true;
            i6Var2.setTextSize(org.telegram.messenger.g0.L(11.0f));
            i6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.0f));
            i6Var2.setSizeableBackground(new t6(org.telegram.messenger.g0.L(10.0f), 285212671));
            s1Var.addView(i6Var2, c8.ha.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
            s1VarArr[i16] = s1Var;
            if (i16 == 0) {
                ((TextView) this.U1[i16].b).setText(org.telegram.messenger.id.M0(2131749626, null));
            } else if (i16 == 1) {
                ((TextView) this.U1[i16].b).setText(org.telegram.messenger.id.M0(2131749643, null));
            } else if (i16 == 2) {
                ((TextView) this.U1[i16].b).setText(org.telegram.messenger.id.M0(2131749624, null));
            }
            c8.ka.a(this.U1[i16]);
            this.U1[i16].setOnClickListener(new ai.v(this, i16, 1));
            this.U1[i16].setBackground(org.telegram.ui.ActionBar.m6.b0(0, 285212671, 10, 10));
            LinearLayout linearLayout2 = this.T1;
            s1[] s1VarArr2 = this.U1;
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

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        p1 p1Var = new p1(this, this.n1, getContext(), this.S1, new ai.e(this, 5), this.I0);
        this.f2 = p1Var;
        p1Var.r = false;
        return p1Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final pj0 M0(Context context) {
        return new q1(this, context, this.I0, 0);
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean X(float f10, float f11) {
        FrameLayout frameLayout = this.g2;
        return frameLayout.getVisibility() == 0 && frameLayout.getY() > f11;
    }

    public final int d1() {
        return i0.a.f(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i5, this.I0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.I0));
    }

    public final boolean f1(r1 r1Var) {
        if (this.u2 == 1) {
            return false;
        }
        int i7 = this.e2.s;
        r1 r1Var2 = this.o2;
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
        if (this.u2 == i7) {
            return;
        }
        this.u2 = i7;
        this.i2.setImageResource(i7 == 2 ? R.drawable.filled_gift_play_24 : R.drawable.filled_gift_pause_24);
        this.k2.setText(org.telegram.messenger.id.M0(i7 == 2 ? 2131750060 : 2131750061, null));
        i1();
    }

    public final void h1(boolean z9) {
        o1 o1Var = this.j2;
        if (o1Var.getUpgradeImageViewAttribute() == null || o1Var.getUpgradeBackdropAttribute() == null || o1Var.getUpgradePatternAttribute() == null) {
            return;
        }
        s1[] s1VarArr = this.U1;
        ((org.telegram.ui.Components.i6) s1VarArr[0].c).c(o1Var.getUpgradeImageViewAttribute().name, z9, true);
        ((org.telegram.ui.Components.i6) s1VarArr[0].d).setText(k7.F1(o1Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
        ((org.telegram.ui.Components.i6) s1VarArr[1].c).c(o1Var.getUpgradeBackdropAttribute().name, z9, true);
        ((org.telegram.ui.Components.i6) s1VarArr[1].d).c(hi.j.J0(o1Var.getUpgradeBackdropAttribute().getRarityPermille()), z9, true);
        ((org.telegram.ui.Components.i6) s1VarArr[2].c).c(o1Var.getUpgradePatternAttribute().name, z9, true);
        ((org.telegram.ui.Components.i6) s1VarArr[2].d).c(hi.j.J0(o1Var.getUpgradePatternAttribute().getRarityPermille()), z9, true);
    }

    public final void i1() {
        u1 u1Var;
        r1 r1Var;
        pj0 pj0Var = this.n1;
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

    @Override // org.telegram.ui.ActionBar.w2
    public final void p0() {
        WindowInsets windowInsets = this.h;
        int systemWindowInsetBottom = windowInsets != null ? windowInsets.getSystemWindowInsetBottom() : 0;
        if (this.s2 != systemWindowInsetBottom) {
            this.s2 = systemWindowInsetBottom;
            this.n1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(74.0f) + systemWindowInsetBottom);
            v1 v1Var = this.e2;
            ((ViewGroup.MarginLayoutParams) v1Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(5.0f) + this.s2;
            v1Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            int d12 = d1();
            if (d12 != this.t2) {
                this.t2 = d12;
                v0(d12);
                View view = this.l2;
                if (view != null && (view.getBackground() instanceof GradientDrawable)) {
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{i0.a.o(d12, qs.q2), d12 & 16777215});
                }
            }
            v1 v1Var = this.e2;
            if (v1Var != null) {
                int i7 = org.telegram.ui.ActionBar.m6.Kl;
                org.telegram.ui.ActionBar.h6 h6Var = v1Var.r;
                int r12 = org.telegram.ui.ActionBar.m6.r1(0.09411765f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
                org.telegram.ui.ActionBar.m6.r1(0.1254902f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
                v1Var.e.setColor(r12);
                v1Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void v() {
        this.X0.g();
    }
}
