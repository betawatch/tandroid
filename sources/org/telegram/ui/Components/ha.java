package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class ha extends org.telegram.ui.ActionBar.z2 {
    public static final /* synthetic */ int O1 = 0;
    public int A1;
    public int B1;
    public boolean C1;
    public boolean D1;
    public t5 E1;
    public boolean F1;
    public boolean G1;
    public wt H1;
    public boolean I1;
    public boolean J1;
    public float K1;
    public int L1;
    public int M1;
    public int N1;
    public final Drawable i1;
    public final dh.f j1;
    public final tk0 k1;
    public final da l1;
    public boolean m1;
    public int n1;
    public final org.telegram.ui.ActionBar.k2 o1;
    public final boolean p1;
    public final ba q1;
    public float r1;
    public boolean s1;
    public float t1;
    public boolean u1;
    public boolean v1;
    public final RectF w1;
    public int x1;
    public int y1;
    public int z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ha(org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        this(r0, k2Var, new ga(r1));
        Activity parentActivity = k2Var.getParentActivity();
        ga gaVar = new ga();
        gaVar.a = false;
        gaVar.c = z10;
        gaVar.g = k2Var.getResourceProvider();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public boolean H() {
        return false;
    }

    public final void I0() {
        tk0 tk0Var = this.k1;
        if (tk0Var == null || tk0Var.getLayoutManager() == null || this.L1 < 0) {
            return;
        }
        int top = (this.M1 - this.b.getTop()) - tk0Var.getPaddingTop();
        if (tk0Var.getLayoutManager() instanceof s4.a0) {
            ((s4.a0) tk0Var.getLayoutManager()).h1(this.L1, top);
        }
        this.L1 = -1;
    }

    public boolean J0(View view, float f7, float f10) {
        return true;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.y2 y2Var = this.Y;
        if (y2Var == null || this.b == null || this.r0 == null || !Z0() || this.p1) {
            return;
        }
        Rect bounds = this.r0.getBounds();
        if (this.b.getMeasuredWidth() >= this.c.getMeasuredWidth()) {
            y2Var.c(((this.b.getMeasuredHeight() - bounds.top) - org.telegram.messenger.i0.L(30.0f)) - ((int) this.b.getTranslationY()));
        } else {
            y2Var.c(0);
        }
    }

    public abstract sk0 L0(tk0 tk0Var);

    public tk0 M0(Context context) {
        return new ag.b1(this, context, this.I0, 8);
    }

    public int N0() {
        return org.telegram.messenger.i0.L(56.0f);
    }

    public abstract CharSequence O0();

    public final boolean P0() {
        return i0.b.h(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0)) > 0.699999988079071d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(Canvas canvas, FrameLayout frameLayout) {
        int i10 = this.N1;
        Drawable drawable = this.i1;
        da daVar = this.l1;
        if (i10 == 1) {
            boolean z10 = this.s1;
            if (z10) {
                float f7 = this.t1;
                if (f7 != 1.0f) {
                    this.t1 = f7 + 0.10666667f;
                    frameLayout.invalidate();
                    this.t1 = Utilities.i(this.t1, 1.0f, 0.0f);
                    if (daVar != null && daVar.getVisibility() == 0 && daVar.getAlpha() != 0.0f && this.t1 != 0.0f) {
                        drawable.setBounds(this.t0, daVar.getBottom(), frameLayout.getMeasuredWidth() - this.t0, drawable.getIntrinsicHeight() + daVar.getBottom());
                        drawable.setAlpha((int) (daVar.getAlpha() * 255.0f * this.t1));
                        drawable.draw(canvas);
                        if (drawable.getAlpha() < 255) {
                            frameLayout.invalidate();
                        }
                    }
                    this.m1 = true;
                }
            }
            if (!z10) {
                float f10 = this.t1;
                if (f10 != 0.0f) {
                    this.t1 = f10 - 0.10666667f;
                    frameLayout.invalidate();
                }
            }
            this.t1 = Utilities.i(this.t1, 1.0f, 0.0f);
            if (daVar != null) {
                drawable.setBounds(this.t0, daVar.getBottom(), frameLayout.getMeasuredWidth() - this.t0, drawable.getIntrinsicHeight() + daVar.getBottom());
                drawable.setAlpha((int) (daVar.getAlpha() * 255.0f * this.t1));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                }
            }
            this.m1 = true;
        } else if (i10 == 2 && ((int) (this.t1 * 255.0f)) != 0 && this.s1) {
            drawable.setBounds(this.t0, daVar.getBottom() + ((int) daVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.t0, drawable.getIntrinsicHeight() + daVar.getBottom() + ((int) daVar.getTranslationY()));
            drawable.setAlpha((int) (this.t1 * 255.0f));
            drawable.draw(canvas);
        }
        if (this.J1) {
            canvas.restore();
            this.J1 = false;
        }
    }

    public void W0(Canvas canvas, View view) {
        int i10;
        this.J1 = false;
        if (this.p1) {
            return;
        }
        boolean z10 = this.G1;
        tk0 tk0Var = this.k1;
        if (z10) {
            int height = tk0Var.getHeight();
            for (int i11 = 0; i11 < tk0Var.getChildCount(); i11++) {
                View childAt = tk0Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R != tk0Var.getAdapter().b() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.F1 ? (int) childAt.getTranslationY() : 0));
                }
            }
            i10 = height - org.telegram.messenger.i0.L(16.0f);
        } else {
            s4.c1 K = tk0Var.K(0);
            int i12 = -org.telegram.messenger.i0.L(16.0f);
            if (K != null) {
                View view2 = K.a;
                i12 = view2.getBottom() - org.telegram.messenger.i0.L(16.0f);
                if (this.F1) {
                    i10 = ((int) view2.getTranslationY()) + i12;
                }
            }
            i10 = i12;
        }
        int i13 = (i10 - ((this.y1 + this.z1) + this.A1)) + this.B1;
        if (this.u1 && this.v1) {
            i13 -= org.telegram.messenger.i0.L(this.N1 == 2 ? 8.0f : 16.0f);
        }
        float f7 = i13;
        this.K1 = f7;
        T0(f7);
        int i14 = this.N1;
        float f10 = 1.0f;
        da daVar = this.l1;
        if (i14 == 1) {
            float L = 1.0f - ((org.telegram.messenger.i0.L(16.0f) + i13) / N0());
            if (L < 0.0f) {
                L = 0.0f;
            }
            org.telegram.messenger.i0.Y3(daVar, L != 0.0f, 1.0f, true, this.m1);
        } else if (i14 == 2) {
            float max = Math.max(((org.telegram.messenger.i0.L(8.0f) + (i13 - this.B1)) + this.z1) - org.telegram.messenger.i0.m, 0.0f);
            float e = this.E1.e(false, max == 0.0f ? 1.0f : 0.0f);
            if (e != 0.0f && e != 1.0f) {
                canvas.save();
                canvas.clipRect(0.0f, max, this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
                this.J1 = true;
            }
            this.t1 = e;
            f10 = org.telegram.messenger.i0.T1(1.0f, 0.5f, e);
            daVar.e.setAlpha(e);
            Q0(e);
            daVar.e.setScaleX(e);
            daVar.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            daVar.e.setScaleY(e);
            org.telegram.ui.ActionBar.u5 titleTextView = daVar.getTitleTextView();
            titleTextView.setTranslationX(org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(21.0f) - titleTextView.getLeft(), 0.0f, e) + 0);
            if (this.I1) {
                titleTextView.setTranslationX(((daVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            daVar.setTranslationY(max);
            i13 -= org.telegram.messenger.i0.W1(e, 0, org.telegram.messenger.i0.L(13.0f) + (((this.x1 - this.y1) - this.z1) - this.A1));
            daVar.getBackground().setBounds(0, org.telegram.messenger.i0.W1(e, daVar.getHeight(), 0), daVar.getWidth(), daVar.getHeight());
            if (e > 0.5f) {
                if (this.D1) {
                    this.D1 = false;
                    daVar.setTag(1);
                }
            } else if (!this.D1) {
                this.D1 = true;
                daVar.setTag(null);
            }
        }
        if (Z0()) {
            if (this instanceof mg.w0) {
                this.r0.setBounds(-org.telegram.messenger.i0.L(6.0f), i13, org.telegram.messenger.i0.L(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                this.r0.setBounds(0, i13, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            K0();
            this.r0.draw(canvas);
            if (this.u1 && f10 > 0.0f) {
                int L2 = org.telegram.messenger.i0.L(36.0f);
                int L3 = org.telegram.messenger.i0.L(20.0f) + i13;
                float measuredWidth = (view.getMeasuredWidth() - L2) / 2.0f;
                float f11 = L3;
                float measuredWidth2 = (view.getMeasuredWidth() + L2) / 2.0f;
                float L4 = org.telegram.messenger.i0.L(4.0f) + L3;
                RectF rectF = this.w1;
                rectF.set(measuredWidth, f11, measuredWidth2, L4);
                org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, this.I0));
                org.telegram.ui.ActionBar.t6.t0.setAlpha((int) (r15.getAlpha() * f10));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.t0);
            }
        }
        R0(canvas, i13);
    }

    public final void X0() {
        tk0 tk0Var = this.k1;
        if (tk0Var == null || this.j1 == null || tk0Var.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i10 = -1;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i12 = 0; i12 < tk0Var.getChildCount(); i12++) {
            View childAt = tk0Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && childAt.getTop() < i11) {
                i11 = childAt.getTop();
                view = childAt;
                i10 = R;
            }
        }
        if (view != null) {
            this.L1 = i10;
            this.M1 = this.b.getTop() + view.getTop();
            this.e1 = System.currentTimeMillis() + 80;
        }
    }

    public final void Y0() {
        if (this.p1) {
            return;
        }
        this.N1 = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.y1 = currentActionBarHeight;
        this.x1 = currentActionBarHeight + org.telegram.messenger.i0.m;
        this.z1 = org.telegram.messenger.i0.L(16.0f);
        this.A1 = org.telegram.messenger.i0.L(-20.0f);
        this.E1 = new t5(this.b, 0L, 350L, gr.h);
        this.l1.e.setPivotX(0.0f);
        this.k1.setClipToPadding(true);
    }

    public boolean Z0() {
        return true;
    }

    public final void a1() {
        if (this.f1 != null) {
            LaunchActivity.I1.F(true, true, true);
            return;
        }
        da daVar = this.l1;
        if (daVar != null && daVar.getTag() != null) {
            org.telegram.messenger.i0.p3(this, P0());
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.o1;
        if (k2Var != null) {
            org.telegram.messenger.i0.p3(this, k2Var.isLightStatusBar());
        }
    }

    public final void b1() {
        da daVar = this.l1;
        if (daVar != null) {
            daVar.setTitle(O0());
        }
    }

    public final void c1() {
        da daVar = this.l1;
        if (daVar == null || TextUtils.equals(O0(), daVar.getTitle())) {
            return;
        }
        daVar.K(O0(), false, 350L, gr.h);
    }

    @Override // org.telegram.ui.ActionBar.z2, org.telegram.ui.ActionBar.g2
    public final boolean f() {
        da daVar = this.l1;
        if (daVar != null && daVar.getTag() != null) {
            return P0();
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.o1;
        return k2Var != null ? k2Var.isLightStatusBar() : P0();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public void h0() {
        T0(this.K1);
        K0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ha(org.telegram.ui.ActionBar.k2 k2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var) {
        this(r0, k2Var, new ga(r1));
        Activity parentActivity = k2Var.getParentActivity();
        ga gaVar = new ga();
        gaVar.a = z10;
        gaVar.c = false;
        gaVar.d = z11;
        gaVar.g = p6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ha(Context context, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, k2Var, new ga(r0));
        ga gaVar = new ga();
        gaVar.a = z10;
        gaVar.c = z11;
        gaVar.d = false;
        gaVar.g = p6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ha(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.k2) null, new ga(r0));
        ga gaVar = new ga();
        gaVar.a = z10;
        gaVar.c = false;
        gaVar.d = false;
        gaVar.f = i10;
        gaVar.g = p6Var;
    }

    public void Q0(float f7) {
    }

    public void T0(float f7) {
    }

    public void U0(uu0 uu0Var) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ha(Context context, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, k2Var, new ga(r0));
        ga gaVar = new ga();
        gaVar.a = z10;
        gaVar.c = false;
        gaVar.d = false;
        gaVar.e = z11;
        gaVar.f = i10;
        gaVar.g = p6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ha(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.k2) null, new ga(r0));
        ga gaVar = new ga();
        gaVar.a = z10;
        gaVar.b = 2;
        gaVar.c = false;
        gaVar.d = false;
        gaVar.e = false;
        gaVar.f = 2;
        gaVar.g = p6Var;
    }

    public void R0(Canvas canvas, int i10) {
    }

    public void S0(int i10, int i11) {
    }

    public ha(Context context, org.telegram.ui.ActionBar.k2 k2Var, ga gaVar) {
        super(gaVar.b, context, gaVar.g, gaVar.a);
        uu0 uu0Var;
        this.r1 = 0.4f;
        this.s1 = true;
        this.t1 = 1.0f;
        this.u1 = false;
        this.w1 = new RectF();
        this.N1 = 1;
        this.x1 = 0;
        this.y1 = 0;
        this.z1 = 0;
        this.A1 = 0;
        this.B1 = 0;
        this.C1 = true;
        this.D1 = false;
        this.F1 = false;
        this.L1 = -1;
        boolean z10 = gaVar.c;
        boolean z11 = gaVar.d;
        boolean z12 = gaVar.e;
        int i10 = gaVar.f;
        this.o1 = k2Var;
        this.p1 = z10;
        this.i1 = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            ba baVar = new ba(this, context, z12, z10);
            this.q1 = baVar;
            uu0Var = baVar;
        } else {
            uu0Var = new ca(this, context, z12, z10);
        }
        tk0 M0 = M0(context);
        this.k1 = M0;
        dh.f fVar = new dh.f(5);
        this.j1 = fVar;
        if (z12) {
            fVar.l1(true);
        }
        M0.setLayoutManager(fVar);
        ba baVar2 = this.q1;
        if (baVar2 != null) {
            baVar2.setBottomSheetContainerView(this.c);
            this.q1.setTargetListView(M0);
        }
        int i11 = 2;
        if (z10) {
            M0.setHasFixedSize(true);
            M0.setAdapter(L0(M0));
            this.N = uu0Var;
            uu0Var.addView(M0, w7.b6.c(-2.0f, -1));
        } else {
            M0.setAdapter(new fa(this, L0(M0), context));
            this.b = uu0Var;
            da daVar = new da(this, context, uu0Var);
            this.l1 = daVar;
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, daVar, this.I0);
            org.telegram.ui.ActionBar.a7.m(daVar, 5, org.telegram.ui.ActionBar.t6.G6, this.I0);
            org.telegram.ui.ActionBar.a7.m(daVar, 3, org.telegram.ui.ActionBar.t6.z8, this.I0);
            daVar.setBackButtonImage(R.drawable.ic_ab_back);
            org.telegram.ui.ActionBar.a7.m(daVar, 1, org.telegram.ui.ActionBar.t6.y8, this.I0);
            daVar.setCastShadows(true);
            daVar.setTitle(O0());
            daVar.setActionBarMenuOnItemClick(new org.telegram.ui.ar(this, i11));
            uu0Var.addView(M0);
            uu0Var.addView(daVar, w7.b6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            M0.j(new ag.u(uu0Var, 12));
        }
        if (i10 == 2) {
            Y0();
        }
        U0(uu0Var);
        a1();
    }
}
