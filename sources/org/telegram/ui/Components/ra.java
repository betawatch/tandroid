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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class ra extends org.telegram.ui.ActionBar.w2 {
    public static final /* synthetic */ int S1 = 0;
    public final RectF A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public boolean G1;
    public boolean H1;
    public c6 I1;
    public boolean J1;
    public boolean K1;
    public wt L1;
    public boolean M1;
    public boolean N1;
    public float O1;
    public int P1;
    public int Q1;
    public int R1;
    public final Drawable m1;
    public final jg.b0 n1;
    public final ek0 o1;
    public final ma p1;
    public boolean q1;
    public int r1;
    public final org.telegram.ui.ActionBar.g2 s1;
    public final boolean t1;
    public final ka u1;
    public float v1;
    public boolean w1;
    public float x1;
    public boolean y1;
    public boolean z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ra(org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        this(r0, g2Var, new qa(r1));
        Activity parentActivity = g2Var.getParentActivity();
        qa qaVar = new qa();
        qaVar.a = false;
        qaVar.c = z10;
        qaVar.g = g2Var.getResourceProvider();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public boolean F() {
        return false;
    }

    public final void J0() {
        ek0 ek0Var = this.o1;
        if (ek0Var == null || ek0Var.getLayoutManager() == null || this.P1 < 0) {
            return;
        }
        int top = (this.Q1 - this.b.getTop()) - ek0Var.getPaddingTop();
        if (ek0Var.getLayoutManager() instanceof v4.c0) {
            ((v4.c0) ek0Var.getLayoutManager()).h1(this.P1, top);
        }
        this.P1 = -1;
    }

    public boolean K0(View view, float f10, float f11) {
        return true;
    }

    public final void L0() {
        org.telegram.ui.ActionBar.v2 v2Var = this.Z;
        if (v2Var == null || this.b == null || this.s0 == null || !a1() || this.t1) {
            return;
        }
        Rect bounds = this.s0.getBounds();
        if (this.b.getMeasuredWidth() >= this.c.getMeasuredWidth()) {
            v2Var.c(((this.b.getMeasuredHeight() - bounds.top) - org.telegram.messenger.g0.L(30.0f)) - ((int) this.b.getTranslationY()));
        } else {
            v2Var.c(0);
        }
    }

    public abstract dk0 M0(ek0 ek0Var);

    public ek0 N0(Context context) {
        return new di.b1(this, context, this.J0, 13);
    }

    public int O0() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public abstract CharSequence P0();

    public final boolean Q0() {
        return i0.a.h(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.J0)) > 0.699999988079071d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0(Canvas canvas, FrameLayout frameLayout) {
        int i7 = this.R1;
        Drawable drawable = this.m1;
        ma maVar = this.p1;
        if (i7 == 1) {
            boolean z10 = this.w1;
            if (z10) {
                float f10 = this.x1;
                if (f10 != 1.0f) {
                    this.x1 = f10 + 0.10666667f;
                    frameLayout.invalidate();
                    this.x1 = Utilities.i(this.x1, 1.0f, 0.0f);
                    if (maVar != null && maVar.getVisibility() == 0 && maVar.getAlpha() != 0.0f && this.x1 != 0.0f) {
                        drawable.setBounds(this.u0, maVar.getBottom(), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + maVar.getBottom());
                        drawable.setAlpha((int) (maVar.getAlpha() * 255.0f * this.x1));
                        drawable.draw(canvas);
                        if (drawable.getAlpha() < 255) {
                            frameLayout.invalidate();
                        }
                    }
                    this.q1 = true;
                }
            }
            if (!z10) {
                float f11 = this.x1;
                if (f11 != 0.0f) {
                    this.x1 = f11 - 0.10666667f;
                    frameLayout.invalidate();
                }
            }
            this.x1 = Utilities.i(this.x1, 1.0f, 0.0f);
            if (maVar != null) {
                drawable.setBounds(this.u0, maVar.getBottom(), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + maVar.getBottom());
                drawable.setAlpha((int) (maVar.getAlpha() * 255.0f * this.x1));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                }
            }
            this.q1 = true;
        } else if (i7 == 2 && ((int) (this.x1 * 255.0f)) != 0 && this.w1) {
            drawable.setBounds(this.u0, maVar.getBottom() + ((int) maVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + maVar.getBottom() + ((int) maVar.getTranslationY()));
            drawable.setAlpha((int) (this.x1 * 255.0f));
            drawable.draw(canvas);
        }
        if (this.N1) {
            canvas.restore();
            this.N1 = false;
        }
    }

    public void X0(Canvas canvas, View view) {
        int i7;
        this.N1 = false;
        if (this.t1) {
            return;
        }
        boolean z10 = this.K1;
        ek0 ek0Var = this.o1;
        if (z10) {
            int height = ek0Var.getHeight();
            for (int i10 = 0; i10 < ek0Var.getChildCount(); i10++) {
                View childAt = ek0Var.getChildAt(i10);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R != ek0Var.getAdapter().b() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.J1 ? (int) childAt.getTranslationY() : 0));
                }
            }
            i7 = height - org.telegram.messenger.g0.L(16.0f);
        } else {
            v4.f1 K = ek0Var.K(0);
            int i11 = -org.telegram.messenger.g0.L(16.0f);
            if (K != null) {
                View view2 = K.a;
                i11 = view2.getBottom() - org.telegram.messenger.g0.L(16.0f);
                if (this.J1) {
                    i7 = ((int) view2.getTranslationY()) + i11;
                }
            }
            i7 = i11;
        }
        int i12 = (i7 - ((this.C1 + this.D1) + this.E1)) + this.F1;
        if (this.y1 && this.z1) {
            i12 -= org.telegram.messenger.g0.L(this.R1 == 2 ? 8.0f : 16.0f);
        }
        float f10 = i12;
        this.O1 = f10;
        U0(f10);
        int i13 = this.R1;
        float f11 = 1.0f;
        ma maVar = this.p1;
        if (i13 == 1) {
            float L = 1.0f - ((org.telegram.messenger.g0.L(16.0f) + i12) / O0());
            if (L < 0.0f) {
                L = 0.0f;
            }
            org.telegram.messenger.g0.X3(maVar, L != 0.0f, 1.0f, true, this.q1);
        } else if (i13 == 2) {
            float max = Math.max(((org.telegram.messenger.g0.L(8.0f) + (i12 - this.F1)) + this.D1) - org.telegram.messenger.g0.m, 0.0f);
            float e10 = this.I1.e(false, max == 0.0f ? 1.0f : 0.0f);
            if (e10 != 0.0f && e10 != 1.0f) {
                canvas.save();
                canvas.clipRect(0.0f, max, this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
                this.N1 = true;
            }
            this.x1 = e10;
            f11 = org.telegram.messenger.g0.T1(1.0f, 0.5f, e10);
            maVar.e.setAlpha(e10);
            R0(e10);
            maVar.e.setScaleX(e10);
            maVar.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            maVar.e.setScaleY(e10);
            org.telegram.ui.ActionBar.n5 titleTextView = maVar.getTitleTextView();
            titleTextView.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(21.0f) - titleTextView.getLeft(), 0.0f, e10) + 0);
            if (this.M1) {
                titleTextView.setTranslationX(((maVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            maVar.setTranslationY(max);
            i12 -= org.telegram.messenger.g0.W1(e10, 0, org.telegram.messenger.g0.L(13.0f) + (((this.B1 - this.C1) - this.D1) - this.E1));
            maVar.getBackground().setBounds(0, org.telegram.messenger.g0.W1(e10, maVar.getHeight(), 0), maVar.getWidth(), maVar.getHeight());
            if (e10 > 0.5f) {
                if (this.H1) {
                    this.H1 = false;
                    maVar.setTag(1);
                }
            } else if (!this.H1) {
                this.H1 = true;
                maVar.setTag(null);
            }
        }
        if (a1()) {
            if (this instanceof wg.z) {
                this.s0.setBounds(-org.telegram.messenger.g0.L(6.0f), i12, org.telegram.messenger.g0.L(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                this.s0.setBounds(0, i12, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            L0();
            this.s0.draw(canvas);
            if (this.y1 && f11 > 0.0f) {
                int L2 = org.telegram.messenger.g0.L(36.0f);
                int L3 = org.telegram.messenger.g0.L(20.0f) + i12;
                float measuredWidth = (view.getMeasuredWidth() - L2) / 2.0f;
                float f12 = L3;
                float measuredWidth2 = (view.getMeasuredWidth() + L2) / 2.0f;
                float L4 = org.telegram.messenger.g0.L(4.0f) + L3;
                RectF rectF = this.A1;
                rectF.set(measuredWidth, f12, measuredWidth2, L4);
                org.telegram.ui.ActionBar.n6.t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, this.J0));
                org.telegram.ui.ActionBar.n6.t0.setAlpha((int) (r15.getAlpha() * f11));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.t0);
            }
        }
        S0(canvas, i12);
    }

    public final void Y0() {
        ek0 ek0Var = this.o1;
        if (ek0Var == null || this.n1 == null || ek0Var.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i7 = -1;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < ek0Var.getChildCount(); i11++) {
            View childAt = ek0Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && childAt.getTop() < i10) {
                i10 = childAt.getTop();
                view = childAt;
                i7 = R;
            }
        }
        if (view != null) {
            this.P1 = i7;
            this.Q1 = this.b.getTop() + view.getTop();
            this.i1 = System.currentTimeMillis() + 80;
        }
    }

    public final void Z0() {
        if (this.t1) {
            return;
        }
        this.R1 = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.C1 = currentActionBarHeight;
        this.B1 = currentActionBarHeight + org.telegram.messenger.g0.m;
        this.D1 = org.telegram.messenger.g0.L(16.0f);
        this.E1 = org.telegram.messenger.g0.L(-20.0f);
        this.I1 = new c6(this.b, 0L, 350L, kr.h);
        this.p1.e.setPivotX(0.0f);
        this.o1.setClipToPadding(true);
    }

    public boolean a1() {
        return true;
    }

    public final void b1() {
        if (this.j1 != null) {
            LaunchActivity.H1.G(true, true, true);
            return;
        }
        ma maVar = this.p1;
        if (maVar != null && maVar.getTag() != null) {
            org.telegram.messenger.g0.p3(this, Q0());
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.s1;
        if (g2Var != null) {
            org.telegram.messenger.g0.p3(this, g2Var.isLightStatusBar());
        }
    }

    public void c1() {
        ma maVar = this.p1;
        if (maVar != null) {
            maVar.setTitle(P0());
        }
    }

    public final void d1() {
        ma maVar = this.p1;
        if (maVar == null || TextUtils.equals(P0(), maVar.getTitle())) {
            return;
        }
        maVar.N(P0(), false, 350L, kr.h);
    }

    @Override // org.telegram.ui.ActionBar.w2, org.telegram.ui.ActionBar.c2
    public final boolean f() {
        ma maVar = this.p1;
        if (maVar != null && maVar.getTag() != null) {
            return Q0();
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.s1;
        return g2Var != null ? g2Var.isLightStatusBar() : Q0();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public void h0() {
        U0(this.O1);
        L0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ra(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.i6 i6Var) {
        this(r0, g2Var, new qa(r1));
        Activity parentActivity = g2Var.getParentActivity();
        qa qaVar = new qa();
        qaVar.a = z10;
        qaVar.c = false;
        qaVar.d = z11;
        qaVar.g = i6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ra(Context context, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.i6 i6Var) {
        this(context, g2Var, new qa(r0));
        qa qaVar = new qa();
        qaVar.a = z10;
        qaVar.c = z11;
        qaVar.d = false;
        qaVar.g = i6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ra(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.g2) null, new qa(r0));
        qa qaVar = new qa();
        qaVar.a = z10;
        qaVar.c = false;
        qaVar.d = false;
        qaVar.f = i7;
        qaVar.g = i6Var;
    }

    public void R0(float f10) {
    }

    public void U0(float f10) {
    }

    public void V0(cu0 cu0Var) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ra(Context context, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this(context, g2Var, new qa(r0));
        qa qaVar = new qa();
        qaVar.a = z10;
        qaVar.c = false;
        qaVar.d = false;
        qaVar.e = z11;
        qaVar.f = i7;
        qaVar.g = i6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ra(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.g2) null, new qa(r0));
        qa qaVar = new qa();
        qaVar.a = z10;
        qaVar.b = 2;
        qaVar.c = false;
        qaVar.d = false;
        qaVar.e = false;
        qaVar.f = 2;
        qaVar.g = i6Var;
    }

    public ra(Context context, org.telegram.ui.ActionBar.g2 g2Var, qa qaVar) {
        super(qaVar.b, context, qaVar.g, qaVar.a);
        cu0 cu0Var;
        this.v1 = 0.4f;
        this.w1 = true;
        this.x1 = 1.0f;
        int i7 = 0;
        this.y1 = false;
        this.A1 = new RectF();
        this.R1 = 1;
        this.B1 = 0;
        this.C1 = 0;
        this.D1 = 0;
        this.E1 = 0;
        this.F1 = 0;
        this.G1 = true;
        this.H1 = false;
        this.J1 = false;
        this.P1 = -1;
        boolean z10 = qaVar.c;
        boolean z11 = qaVar.d;
        boolean z12 = qaVar.e;
        int i10 = qaVar.f;
        this.s1 = g2Var;
        this.t1 = z10;
        this.m1 = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            ka kaVar = new ka(this, context, z12, z10);
            this.u1 = kaVar;
            cu0Var = kaVar;
        } else {
            cu0Var = new la(this, context, z12, z10);
        }
        ek0 N0 = N0(context);
        this.o1 = N0;
        jg.b0 b0Var = new jg.b0(6);
        this.n1 = b0Var;
        if (z12) {
            b0Var.l1(true);
        }
        N0.setLayoutManager(b0Var);
        ka kaVar2 = this.u1;
        if (kaVar2 != null) {
            kaVar2.setBottomSheetContainerView(this.c);
            this.u1.setTargetListView(N0);
        }
        if (z10) {
            N0.setHasFixedSize(true);
            N0.setAdapter(M0(N0));
            this.O = cu0Var;
            cu0Var.addView(N0, c8.na.c(-2.0f, -1));
        } else {
            N0.setAdapter(new pa(this, M0(N0), context));
            this.b = cu0Var;
            ma maVar = new ma(this, context, cu0Var);
            this.p1 = maVar;
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, maVar, this.J0);
            org.telegram.ui.ActionBar.u6.l(maVar, 5, org.telegram.ui.ActionBar.n6.G6, this.J0);
            org.telegram.ui.ActionBar.u6.l(maVar, 3, org.telegram.ui.ActionBar.n6.z8, this.J0);
            maVar.setBackButtonImage(R.drawable.ic_ab_back);
            org.telegram.ui.ActionBar.u6.l(maVar, 1, org.telegram.ui.ActionBar.n6.y8, this.J0);
            maVar.setCastShadows(true);
            maVar.setTitle(P0());
            maVar.setActionBarMenuOnItemClick(new org.telegram.ui.y7(this, 14));
            cu0Var.addView(N0);
            cu0Var.addView(maVar, c8.na.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            N0.j(new na(cu0Var, i7));
        }
        if (i10 == 2) {
            Z0();
        }
        V0(cu0Var);
        b1();
    }

    public void S0(Canvas canvas, int i7) {
    }

    public void T0(int i7, int i10) {
    }
}
