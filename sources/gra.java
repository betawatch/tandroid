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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gra extends ny0 {
    public final int S1;
    public final LinearLayout T1;
    public final gb0[] U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ge0 Z1;
    public final ge0 a2;
    public final ge0 b2;
    public final q74 c2;
    public final zqa d2;
    public final fra e2;
    public bra f2;
    public final FrameLayout g2;
    public final ImageView h2;
    public final ImageView i2;
    public final ara j2;
    public final TextView k2;
    public final View l2;
    public final tq3 m2;
    public final ll0 n2;
    public cra o2;
    public final boolean p2;
    public boolean q2;
    public final lhc r2;
    public int s2;
    public int t2;
    public int u2;

    public gra(Context context, vnb vnbVar, int i, String str, ArrayList arrayList, boolean z) {
        super(context, null, false, false, vnbVar);
        ll0 ll0Var;
        byte b = 1;
        this.u2 = 1;
        this.S1 = i;
        this.p2 = z;
        ArrayList c = atb.c(TL_stars.starGiftAttributeBackdrop.class, arrayList);
        this.V1 = c;
        ge0 ge0Var = new ge0(c);
        this.Z1 = ge0Var;
        ge0Var.b = false;
        ArrayList c2 = atb.c(TL_stars.starGiftAttributePattern.class, arrayList);
        this.W1 = c2;
        ge0 ge0Var2 = new ge0(c2);
        this.a2 = ge0Var2;
        ge0Var2.b = false;
        this.X1 = atb.c(TL_stars.starGiftAttributeModel.class, arrayList);
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
        List.-EL.sort(this.V1, Comparator$-CC.comparingDouble(new mp7((byte) 3)));
        List.-EL.sort(this.W1, Comparator$-CC.comparingDouble(new mp7((byte) 4)));
        List.-EL.sort(this.X1, Comparator$-CC.comparingDouble(new mp7((byte) 5)));
        List.-EL.sort(this.Y1, Comparator$-CC.comparingDouble(new mp7((byte) 5)));
        ge0 ge0Var3 = new ge0(this.X1);
        this.b2 = ge0Var3;
        ge0Var3.b = false;
        ViewParent parent = this.o1.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.o1);
        }
        this.F1 = false;
        this.E1 = hl.L(6.0f);
        this.x = true;
        int Z0 = Z0();
        this.t2 = Z0;
        s0(Z0);
        J();
        oz4 d = this.X0.d(new yqa(this));
        if (Build.VERSION.SDK_INT < 31 || !xea.f()) {
            this.m2 = null;
            ll0 ll0Var2 = new ll0(d, d, d);
            this.n2 = ll0Var2;
            ll0Var = ll0Var2;
        } else {
            tq3 tq3Var = new tq3(false);
            this.m2 = tq3Var;
            this.X0.a(tq3Var);
            rz4 rz4Var = new rz4(d);
            rz4Var.f = d;
            rz4Var.d = tq3Var;
            rz4Var.e = -2;
            ll0Var = new ll0(rz4Var, rz4Var, rz4Var);
            this.n2 = ll0Var;
            ll0Var.k = true;
            int L = i86.e(262144) ? hl.L(8.0f) : hl.L(48.0f);
            ll0Var.d = L;
            ll0Var.e = L;
        }
        ll0Var.j = this.X0;
        q74 q74Var = new q74(3, false);
        this.c2 = q74Var;
        q74Var.O = new ar1(this, (byte) 17);
        this.n1.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(74.0f));
        this.n1.setClipToPadding(false);
        this.n1.setLayoutManager(q74Var);
        this.n1.setSelectorType(9);
        this.n1.setSelectorDrawableColor(0);
        this.n1.j(new e98(this, (byte) 24));
        this.X0.b(this.n1);
        zqa zqaVar = new zqa();
        this.d2 = zqaVar;
        zqaVar.C = false;
        zqaVar.m = false;
        zqaVar.n(280L);
        zqaVar.o(k43.h);
        zqaVar.D = (byte) 30;
        this.n1.setItemAnimator(zqaVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g2 = frameLayout;
        frameLayout.setClipChildren(false);
        ara araVar = new ara(this, context, vnbVar, new uoa(this, (byte) 1), new y00(b), new y00(b), new y00(b), new y00(b), new y00(b), new y00(b));
        this.j2 = araVar;
        araVar.d(new yta(1, 1));
        araVar.setPreviewingAttributes(arrayList);
        araVar.removeView(araVar.Q);
        int i3 = -1;
        frameLayout.addView(araVar, tre.c(-1.0f, -1));
        int i4 = this.u0;
        frameLayout.setPadding(i4, 0, i4, 0);
        ImageView imageView = new ImageView(context);
        this.h2 = imageView;
        imageView.setBackground(aob.Z(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new kla(this, b));
        iye.a(imageView);
        frameLayout.addView(imageView, tre.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.i2 = imageView2;
        imageView2.setBackground(aob.Z(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new jy8(this, arrayList, (byte) 14));
        iye.a(imageView2);
        frameLayout.addView(imageView2, tre.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i5 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView l = ik8.l(frameLayout, textView, tre.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.k2 = l;
        float f = 13.0f;
        bs2.r(13.0f, 1, 2131750019, l, null);
        l.setGravity(17);
        int i6 = -1879048193;
        l.setTextColor(-1879048193);
        frameLayout.addView(l, tre.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.U1 = new gb0[3];
        this.e2 = new fra(context, vnbVar, new sh9(this, (byte) 7));
        int i7 = 0;
        while (true) {
            gb0[] gb0VarArr = this.U1;
            if (i7 >= gb0VarArr.length) {
                this.g2.addView(this.T1, tre.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.b.addView(this.g2, tre.e(-1, jn7.l5, 55));
                int Z02 = Z0();
                View view = new View(context);
                this.l2 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{vm2.o(Z02, jn7.p2), Z02 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e = tre.e(-1, 0, 48);
                e.height = hl.m;
                this.b.addView(view, e);
                this.e2.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
                jl0 c3 = this.n2.c(this.e2, null, false);
                c3.q(hl.L(4.0f));
                c3.r(hl.L(28.0f));
                c3.p(new cl0(aob.d6, vnbVar));
                this.e2.setBackground(c3);
                this.b.addView(this.e2, tre.d(jn7.q4, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.o2 = new cra((TL_stars.starGiftAttributeBackdrop) atb.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) atb.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) atb.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f2.O(false);
                d1(false);
                d79 d79Var = this.n1;
                ViewGroup viewGroup = this.b;
                Objects.requireNonNull(d79Var);
                this.r2 = new lhc(d79Var, viewGroup, new hc5(d79Var, (byte) 0));
                this.X0.i(this.b);
                vy4 vy4Var = this.X0;
                vy4Var.a = new yqa(this);
                vy4Var.d = new gz4(hl.L(48.0f));
                return;
            }
            gb0 gb0Var = new gb0(context);
            float f2 = f;
            gb0Var.setClipChildren(false);
            in inVar = new in(context, true, false, false);
            gb0Var.c = inVar;
            inVar.setTypeface(hl.o());
            inVar.setTextSize(hl.L(f2));
            inVar.setTextColor(i3);
            inVar.setGravity(i5);
            gb0Var.addView(inVar, tre.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
            TextView textView2 = new TextView(context);
            gb0Var.b = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor(i6);
            textView2.setGravity(i5);
            gb0Var.addView(textView2, tre.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
            in inVar2 = new in(context, false, false, false);
            gb0Var.d = inVar2;
            inVar2.setTypeface(hl.o());
            inVar2.setTextColor(i3);
            inVar2.setGravity(5);
            inVar2.getDrawable().U = true;
            inVar2.setTextSize(hl.L(11.0f));
            inVar2.setPadding(hl.L(4.0f), hl.L(1.0f), hl.L(4.0f), hl.L(1.0f));
            inVar2.setSizeableBackground(new jua(hl.L(10.0f), 285212671));
            gb0Var.addView(inVar2, tre.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
            gb0VarArr[i7] = gb0Var;
            if (i7 == 0) {
                ((TextView) this.U1[i7].b).setText(ob6.M0(2131749415, null));
            } else if (i7 == 1) {
                ((TextView) this.U1[i7].b).setText(ob6.M0(2131749432, null));
            } else if (i7 == 2) {
                ((TextView) this.U1[i7].b).setText(ob6.M0(2131749413, null));
            }
            iye.a(this.U1[i7]);
            this.U1[i7].setOnClickListener(new w0(this, i7, (byte) 24));
            this.U1[i7].setBackground(aob.Z(0, 285212671, 10, 10));
            LinearLayout linearLayout2 = this.T1;
            gb0[] gb0VarArr2 = this.U1;
            linearLayout2.addView(gb0VarArr2[i7], tre.q(0, 42, 1.0f, 7, 0, 0, i7 != gb0VarArr2.length - 1 ? 11 : 0, 0));
            i7++;
            f = f2;
            i3 = -1;
            i5 = 17;
            i6 = -1879048193;
        }
    }

    public static double a1(TL_stars.StarGiftAttribute starGiftAttribute) {
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

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        bra braVar = new bra(this, this.n1, getContext(), this.S1, new hj8(this, (byte) 23), this.J0);
        this.f2 = braVar;
        braVar.r = false;
        return braVar;
    }

    @Override // ny0
    public final d79 I0(Context context) {
        return new gw9(this, context, this.J0, (byte) 4);
    }

    @Override // ny0
    public final CharSequence K0() {
        return null;
    }

    @Override // nx0
    public final boolean U(float f, float f2) {
        FrameLayout frameLayout = this.g2;
        return frameLayout.getVisibility() == 0 && frameLayout.getY() > f2;
    }

    public final int Z0() {
        return vm2.f(0.1f, aob.v0(aob.i5, this.J0), aob.v0(aob.h5, this.J0));
    }

    public final boolean b1(cra craVar) {
        if (this.u2 == 1) {
            return false;
        }
        int i = this.e2.s;
        cra craVar2 = this.o2;
        if (craVar2 == null) {
            return false;
        }
        if (i == 1) {
            if (craVar.a != craVar2.a) {
                return false;
            }
        } else if (i == 2) {
            if (craVar.b != craVar2.b) {
                return false;
            }
        } else if (i != 0 || craVar.c != craVar2.c) {
            return false;
        }
        return true;
    }

    public final void c1(int i) {
        if (this.u2 == i) {
            return;
        }
        this.u2 = i;
        this.i2.setImageResource(i == 2 ? R.drawable.filled_gift_play_24 : R.drawable.filled_gift_pause_24);
        this.k2.setText(ob6.M0(i == 2 ? 2131750018 : 2131750019, null));
        e1();
    }

    public final void d1(boolean z) {
        ara araVar = this.j2;
        if (araVar.getUpgradeImageViewAttribute() == null || araVar.getUpgradeBackdropAttribute() == null || araVar.getUpgradePatternAttribute() == null) {
            return;
        }
        gb0[] gb0VarArr = this.U1;
        ((in) gb0VarArr[0].c).c(araVar.getUpgradeImageViewAttribute().name, z, true);
        ((in) gb0VarArr[0].d).setText(wua.A1(araVar.getUpgradeImageViewAttribute().rarity, new Integer[1]));
        ((in) gb0VarArr[1].c).c(araVar.getUpgradeBackdropAttribute().name, z, true);
        ((in) gb0VarArr[1].d).c(cc.J0(araVar.getUpgradeBackdropAttribute().getRarityPermille()), z, true);
        ((in) gb0VarArr[2].c).c(araVar.getUpgradePatternAttribute().name, z, true);
        ((in) gb0VarArr[2].d).c(cc.J0(araVar.getUpgradePatternAttribute().getRarityPermille()), z, true);
    }

    public final void e1() {
        era eraVar;
        cra craVar;
        d79 d79Var = this.n1;
        int childCount = d79Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = d79Var.getChildAt(i);
            if ((childAt instanceof era) && (craVar = (eraVar = (era) childAt).w) != null) {
                boolean b1 = b1(craVar);
                eraVar.c.f(b1, true);
                eraVar.r.a(b1, true);
            }
        }
    }

    @Override // nx0
    public final void m0() {
        WindowInsets windowInsets = this.h;
        int systemWindowInsetBottom = windowInsets != null ? windowInsets.getSystemWindowInsetBottom() : 0;
        if (this.s2 != systemWindowInsetBottom) {
            this.s2 = systemWindowInsetBottom;
            this.n1.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(74.0f) + systemWindowInsetBottom);
            fra fraVar = this.e2;
            ((ViewGroup.MarginLayoutParams) fraVar.getLayoutParams()).bottomMargin = hl.L(5.0f) + this.s2;
            fraVar.requestLayout();
        }
    }

    @Override // nx0
    public final void p0() {
        super.p0();
        try {
            int Z0 = Z0();
            if (Z0 != this.t2) {
                this.t2 = Z0;
                s0(Z0);
                View view = this.l2;
                if (view != null && (view.getBackground() instanceof GradientDrawable)) {
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{vm2.o(Z0, jn7.p2), Z0 & 16777215});
                }
            }
            fra fraVar = this.e2;
            if (fraVar != null) {
                int i = aob.Nl;
                vnb vnbVar = fraVar.r;
                int p1 = aob.p1(0.09411765f, aob.v0(i, vnbVar));
                aob.p1(0.1254902f, aob.v0(i, vnbVar));
                fraVar.e.setColor(p1);
                fraVar.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // nx0
    public final void x() {
        this.X0.g();
    }
}
