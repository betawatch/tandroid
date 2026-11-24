// default package

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
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kpa extends mz0 {
    public final int S1;
    public final LinearLayout T1;
    public final ec0[] U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ef0 Z1;
    public final ef0 a2;
    public final ef0 b2;
    public final f84 c2;
    public final dpa d2;
    public final jpa e2;
    public fpa f2;
    public final FrameLayout g2;
    public final ImageView h2;
    public final ImageView i2;
    public final epa j2;
    public final TextView k2;
    public final View l2;
    public final mr3 m2;
    public final km0 n2;
    public gpa o2;
    public final boolean p2;
    public boolean q2;
    public final nfc r2;
    public int s2;
    public int t2;
    public int u2;

    public kpa(Context context, ylb ylbVar, int i, String str, ArrayList arrayList, boolean z) {
        super(context, null, false, false, ylbVar);
        km0 km0Var;
        byte b = 1;
        this.u2 = 1;
        this.S1 = i;
        this.p2 = z;
        ArrayList c = brb.c(TL_stars.starGiftAttributeBackdrop.class, arrayList);
        this.V1 = c;
        ef0 ef0Var = new ef0(c);
        this.Z1 = ef0Var;
        ef0Var.b = false;
        ArrayList c2 = brb.c(TL_stars.starGiftAttributePattern.class, arrayList);
        this.W1 = c2;
        ef0 ef0Var2 = new ef0(c2);
        this.a2 = ef0Var2;
        ef0Var2.b = false;
        this.X1 = brb.c(TL_stars.starGiftAttributeModel.class, arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.Y1 = arrayList2;
        if (z) {
            int i2 = 0;
            while (i2 < this.X1.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.X1.get(i2);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.Y1.add(stargiftattributemodel);
                    this.X1.remove(i2);
                    i2--;
                }
                i2++;
            }
        } else {
            arrayList2.clear();
        }
        List.-EL.sort(this.V1, Comparator$-CC.comparingDouble(new po7((byte) 3)));
        List.-EL.sort(this.W1, Comparator$-CC.comparingDouble(new po7((byte) 4)));
        List.-EL.sort(this.X1, Comparator$-CC.comparingDouble(new po7((byte) 5)));
        List.-EL.sort(this.Y1, Comparator$-CC.comparingDouble(new po7((byte) 5)));
        ef0 ef0Var3 = new ef0(this.X1);
        this.b2 = ef0Var3;
        ef0Var3.b = false;
        ViewParent parent = this.o1.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.o1);
        }
        this.F1 = false;
        this.E1 = gm.L(6.0f);
        this.x = true;
        int Y0 = Y0();
        this.t2 = Y0;
        s0(Y0);
        J();
        kz4 d = this.X0.d(new cpa(this));
        if (Build.VERSION.SDK_INT < 31 || !gda.f()) {
            this.m2 = null;
            km0 km0Var2 = new km0(d, d, d);
            this.n2 = km0Var2;
            km0Var = km0Var2;
        } else {
            mr3 mr3Var = new mr3(false);
            this.m2 = mr3Var;
            this.X0.a(mr3Var);
            nz4 nz4Var = new nz4(d);
            nz4Var.f = d;
            nz4Var.d = mr3Var;
            nz4Var.e = -2;
            km0Var = new km0(nz4Var, nz4Var, nz4Var);
            this.n2 = km0Var;
            km0Var.k = true;
            int L = e86.e(262144) ? gm.L(8.0f) : gm.L(48.0f);
            km0Var.d = L;
            km0Var.e = L;
        }
        km0Var.j = this.X0;
        f84 f84Var = new f84(3, false);
        this.c2 = f84Var;
        f84Var.O = new zr1(this, (byte) 17);
        this.n1.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(74.0f));
        this.n1.setClipToPadding(false);
        this.n1.setLayoutManager(f84Var);
        this.n1.setSelectorType(9);
        this.n1.setSelectorDrawableColor(0);
        this.n1.j(new so7(this, (byte) 25));
        this.X0.b(this.n1);
        dpa dpaVar = new dpa();
        this.d2 = dpaVar;
        dpaVar.C = false;
        dpaVar.m = false;
        dpaVar.n(280L);
        dpaVar.o(d53.h);
        dpaVar.D = (byte) 30;
        this.n1.setItemAnimator(dpaVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g2 = frameLayout;
        frameLayout.setClipChildren(false);
        epa epaVar = new epa(this, context, ylbVar, new c0a(this, (byte) 22), new x10(b), new x10(b), new x10(b), new x10(b), new x10(b), new x10(b));
        this.j2 = epaVar;
        epaVar.d(new xra(1, 1));
        epaVar.setPreviewingAttributes(arrayList);
        epaVar.removeView(epaVar.Q);
        int i3 = -1;
        frameLayout.addView(epaVar, qoe.c(-1.0f, -1));
        int i4 = this.u0;
        frameLayout.setPadding(i4, 0, i4, 0);
        ImageView imageView = new ImageView(context);
        this.h2 = imageView;
        imageView.setBackground(cmb.Z(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new oha(this, (byte) 3));
        rve.a(imageView);
        frameLayout.addView(imageView, qoe.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.i2 = imageView2;
        imageView2.setBackground(cmb.Z(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new r39(this, arrayList, (byte) 12));
        rve.a(imageView2);
        frameLayout.addView(imageView2, qoe.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i5 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView l = wi8.l(frameLayout, textView, qoe.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.k2 = l;
        ts2.q(13.0f, 1, 2131749994, l, null);
        l.setGravity(17);
        int i6 = -1879048193;
        l.setTextColor(-1879048193);
        frameLayout.addView(l, qoe.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.U1 = new ec0[3];
        this.e2 = new jpa(context, ylbVar, new eg9(this, (byte) 7));
        int i7 = 0;
        while (true) {
            ec0[] ec0VarArr = this.U1;
            if (i7 >= ec0VarArr.length) {
                this.g2.addView(this.T1, qoe.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.b.addView(this.g2, qoe.e(-1, nm7.l5, 55));
                int Y02 = Y0();
                View view = new View(context);
                this.l2 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{on2.p(Y02, nm7.p2), Y02 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e = qoe.e(-1, 0, 48);
                e.height = gm.m;
                this.b.addView(view, e);
                this.e2.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
                im0 c3 = this.n2.c(this.e2, null, false);
                c3.q(gm.L(4.0f));
                c3.r(gm.L(28.0f));
                c3.p(new bm0(cmb.c6, ylbVar));
                this.e2.setBackground(c3);
                this.b.addView(this.e2, qoe.d(nm7.q4, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.o2 = new gpa((TL_stars.starGiftAttributeBackdrop) brb.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) brb.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) brb.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f2.O(false);
                c1(false);
                r59 r59Var = this.n1;
                ViewGroup viewGroup = this.b;
                Objects.requireNonNull(r59Var);
                this.r2 = new nfc(r59Var, viewGroup, new ec5(r59Var, (byte) 0));
                this.X0.i(this.b);
                sy4 sy4Var = this.X0;
                sy4Var.a = new cpa(this);
                sy4Var.d = new cz4(gm.L(48.0f));
                return;
            }
            ec0 ec0Var = new ec0(context);
            ec0Var.setClipChildren(false);
            io ioVar = new io(context, true, false, false);
            ec0Var.c = ioVar;
            ioVar.setTypeface(gm.o());
            ioVar.setTextSize(gm.L(13.0f));
            ioVar.setTextColor(i3);
            ioVar.setGravity(i5);
            ec0Var.addView(ioVar, qoe.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
            TextView textView2 = new TextView(context);
            ec0Var.b = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor(i6);
            textView2.setGravity(i5);
            ec0Var.addView(textView2, qoe.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
            io ioVar2 = new io(context, false, false, false);
            ec0Var.d = ioVar2;
            ioVar2.setTypeface(gm.o());
            ioVar2.setTextColor(i3);
            ioVar2.setGravity(5);
            ioVar2.getDrawable().U = true;
            ioVar2.setTextSize(gm.L(11.0f));
            ioVar2.setPadding(gm.L(4.0f), gm.L(1.0f), gm.L(4.0f), gm.L(1.0f));
            ioVar2.setSizeableBackground(new isa(gm.L(10.0f), 285212671));
            ec0Var.addView(ioVar2, qoe.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
            ec0VarArr[i7] = ec0Var;
            if (i7 == 0) {
                ((TextView) this.U1[i7].b).setText(jb6.M0(2131749403, null));
            } else if (i7 == 1) {
                ((TextView) this.U1[i7].b).setText(jb6.M0(2131749420, null));
            } else if (i7 == 2) {
                ((TextView) this.U1[i7].b).setText(jb6.M0(2131749401, null));
            }
            rve.a(this.U1[i7]);
            this.U1[i7].setOnClickListener(new v0(this, i7, (byte) 23));
            this.U1[i7].setBackground(cmb.Z(0, 285212671, 10, 10));
            LinearLayout linearLayout2 = this.T1;
            ec0[] ec0VarArr2 = this.U1;
            linearLayout2.addView(ec0VarArr2[i7], qoe.q(0, 42, 1.0f, 7, 0, 0, i7 != ec0VarArr2.length - 1 ? 11 : 0, 0));
            i7++;
            i3 = -1;
            i6 = -1879048193;
            i5 = 17;
        }
    }

    public static double Z0(TL_stars.StarGiftAttribute starGiftAttribute) {
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

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        fpa fpaVar = new fpa(this, this.n1, getContext(), this.S1, new vh8(this, (byte) 23), this.J0);
        this.f2 = fpaVar;
        fpaVar.r = false;
        return fpaVar;
    }

    @Override // mz0
    public final r59 H0(Context context) {
        return new pu9(this, context, this.J0, (byte) 4);
    }

    @Override // mz0
    public final CharSequence J0() {
        return null;
    }

    @Override // my0
    public final boolean T(float f, float f2) {
        FrameLayout frameLayout = this.g2;
        return frameLayout.getVisibility() == 0 && frameLayout.getY() > f2;
    }

    public final int Y0() {
        return on2.f(0.1f, cmb.v0(cmb.h5, this.J0), cmb.v0(cmb.g5, this.J0));
    }

    public final boolean a1(gpa gpaVar) {
        if (this.u2 == 1) {
            return false;
        }
        int i = this.e2.s;
        gpa gpaVar2 = this.o2;
        if (gpaVar2 == null) {
            return false;
        }
        if (i == 1) {
            if (gpaVar.a != gpaVar2.a) {
                return false;
            }
        } else if (i == 2) {
            if (gpaVar.b != gpaVar2.b) {
                return false;
            }
        } else if (i != 0 || gpaVar.c != gpaVar2.c) {
            return false;
        }
        return true;
    }

    public final void b1(int i) {
        if (this.u2 == i) {
            return;
        }
        this.u2 = i;
        this.i2.setImageResource(i == 2 ? R.drawable.filled_gift_play_24 : R.drawable.filled_gift_pause_24);
        this.k2.setText(jb6.M0(i == 2 ? 2131749993 : 2131749994, null));
        d1();
    }

    public final void c1(boolean z) {
        epa epaVar = this.j2;
        if (epaVar.getUpgradeImageViewAttribute() == null || epaVar.getUpgradeBackdropAttribute() == null || epaVar.getUpgradePatternAttribute() == null) {
            return;
        }
        ec0[] ec0VarArr = this.U1;
        ((io) ec0VarArr[0].c).c(epaVar.getUpgradeImageViewAttribute().name, z, true);
        ((io) ec0VarArr[0].d).setText(wsa.z1(epaVar.getUpgradeImageViewAttribute().rarity, new Integer[1]));
        ((io) ec0VarArr[1].c).c(epaVar.getUpgradeBackdropAttribute().name, z, true);
        ((io) ec0VarArr[1].d).c(bc.J0(epaVar.getUpgradeBackdropAttribute().getRarityPermille()), z, true);
        ((io) ec0VarArr[2].c).c(epaVar.getUpgradePatternAttribute().name, z, true);
        ((io) ec0VarArr[2].d).c(bc.J0(epaVar.getUpgradePatternAttribute().getRarityPermille()), z, true);
    }

    public final void d1() {
        ipa ipaVar;
        gpa gpaVar;
        r59 r59Var = this.n1;
        int childCount = r59Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = r59Var.getChildAt(i);
            if ((childAt instanceof ipa) && (gpaVar = (ipaVar = (ipa) childAt).w) != null) {
                boolean a1 = a1(gpaVar);
                ipaVar.c.f(a1, true);
                ipaVar.r.a(a1, true);
            }
        }
    }

    @Override // my0
    public final void m0() {
        WindowInsets windowInsets = this.h;
        int systemWindowInsetBottom = windowInsets != null ? windowInsets.getSystemWindowInsetBottom() : 0;
        if (this.s2 != systemWindowInsetBottom) {
            this.s2 = systemWindowInsetBottom;
            this.n1.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(74.0f) + systemWindowInsetBottom);
            jpa jpaVar = this.e2;
            ((ViewGroup.MarginLayoutParams) jpaVar.getLayoutParams()).bottomMargin = gm.L(5.0f) + this.s2;
            jpaVar.requestLayout();
        }
    }

    @Override // my0
    public final void p0() {
        super.p0();
        try {
            int Y0 = Y0();
            if (Y0 != this.t2) {
                this.t2 = Y0;
                s0(Y0);
                View view = this.l2;
                if (view != null && (view.getBackground() instanceof GradientDrawable)) {
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{on2.p(Y0, nm7.p2), Y0 & 16777215});
                }
            }
            jpa jpaVar = this.e2;
            if (jpaVar != null) {
                int i = cmb.Ml;
                ylb ylbVar = jpaVar.r;
                int p1 = cmb.p1(0.09411765f, cmb.v0(i, ylbVar));
                cmb.p1(0.1254902f, cmb.v0(i, ylbVar));
                jpaVar.e.setColor(p1);
                jpaVar.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // my0
    public final void w() {
        this.X0.g();
    }
}
