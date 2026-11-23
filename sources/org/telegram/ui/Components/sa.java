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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class sa extends org.telegram.ui.ActionBar.w2 {
    public static final /* synthetic */ int S1 = 0;
    public final RectF A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public boolean G1;
    public boolean H1;
    public d6 I1;
    public boolean J1;
    public boolean K1;
    public yt L1;
    public boolean M1;
    public boolean N1;
    public float O1;
    public int P1;
    public int Q1;
    public int R1;
    public final Drawable m1;
    public final jg.b0 n1;
    public final ek0 o1;
    public final na p1;
    public boolean q1;
    public int r1;
    public final org.telegram.ui.ActionBar.g2 s1;
    public final boolean t1;
    public final la u1;
    public float v1;
    public boolean w1;
    public float x1;
    public boolean y1;
    public boolean z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sa(org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        this(r0, g2Var, new ra(r1));
        Activity parentActivity = g2Var.getParentActivity();
        ra raVar = new ra();
        raVar.a = false;
        raVar.c = z10;
        raVar.g = g2Var.getResourceProvider();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public boolean G() {
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
        return i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.J0)) > 0.699999988079071d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0(Canvas canvas, FrameLayout frameLayout) {
        int i7 = this.R1;
        Drawable drawable = this.m1;
        na naVar = this.p1;
        if (i7 == 1) {
            boolean z10 = this.w1;
            if (z10) {
                float f10 = this.x1;
                if (f10 != 1.0f) {
                    this.x1 = f10 + 0.10666667f;
                    frameLayout.invalidate();
                    this.x1 = Utilities.i(this.x1, 1.0f, 0.0f);
                    if (naVar != null && naVar.getVisibility() == 0 && naVar.getAlpha() != 0.0f && this.x1 != 0.0f) {
                        drawable.setBounds(this.u0, naVar.getBottom(), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + naVar.getBottom());
                        drawable.setAlpha((int) (naVar.getAlpha() * 255.0f * this.x1));
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
            if (naVar != null) {
                drawable.setBounds(this.u0, naVar.getBottom(), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + naVar.getBottom());
                drawable.setAlpha((int) (naVar.getAlpha() * 255.0f * this.x1));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                }
            }
            this.q1 = true;
        } else if (i7 == 2 && ((int) (this.x1 * 255.0f)) != 0 && this.w1) {
            drawable.setBounds(this.u0, naVar.getBottom() + ((int) naVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + naVar.getBottom() + ((int) naVar.getTranslationY()));
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
        na naVar = this.p1;
        if (i13 == 1) {
            float L = 1.0f - ((org.telegram.messenger.g0.L(16.0f) + i12) / O0());
            if (L < 0.0f) {
                L = 0.0f;
            }
            org.telegram.messenger.g0.X3(naVar, L != 0.0f, 1.0f, true, this.q1);
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
            naVar.e.setAlpha(e10);
            R0(e10);
            naVar.e.setScaleX(e10);
            naVar.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            naVar.e.setScaleY(e10);
            org.telegram.ui.ActionBar.m5 titleTextView = naVar.getTitleTextView();
            titleTextView.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(21.0f) - titleTextView.getLeft(), 0.0f, e10) + 0);
            if (this.M1) {
                titleTextView.setTranslationX(((naVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            naVar.setTranslationY(max);
            i12 -= org.telegram.messenger.g0.W1(e10, 0, org.telegram.messenger.g0.L(13.0f) + (((this.B1 - this.C1) - this.D1) - this.E1));
            naVar.getBackground().setBounds(0, org.telegram.messenger.g0.W1(e10, naVar.getHeight(), 0), naVar.getWidth(), naVar.getHeight());
            if (e10 > 0.5f) {
                if (this.H1) {
                    this.H1 = false;
                    naVar.setTag(1);
                }
            } else if (!this.H1) {
                this.H1 = true;
                naVar.setTag(null);
            }
        }
        if (a1()) {
            if (this instanceof wg.a0) {
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
                org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.zj, this.J0));
                org.telegram.ui.ActionBar.m6.t0.setAlpha((int) (r15.getAlpha() * f11));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.t0);
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
        this.I1 = new d6(this.b, 0L, 350L, nr.h);
        this.p1.e.setPivotX(0.0f);
        this.o1.setClipToPadding(true);
    }

    public boolean a1() {
        return true;
    }

    public final void b1() {
        if (this.j1 != null) {
            LaunchActivity.H1.F(true, true, true);
            return;
        }
        na naVar = this.p1;
        if (naVar != null && naVar.getTag() != null) {
            org.telegram.messenger.g0.p3(this, Q0());
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.s1;
        if (g2Var != null) {
            org.telegram.messenger.g0.p3(this, g2Var.isLightStatusBar());
        }
    }

    public void c1() {
        na naVar = this.p1;
        if (naVar != null) {
            naVar.setTitle(P0());
        }
    }

    public final void d1() {
        na naVar = this.p1;
        if (naVar == null || TextUtils.equals(P0(), naVar.getTitle())) {
            return;
        }
        naVar.N(P0(), false, 350L, nr.h);
    }

    @Override // org.telegram.ui.ActionBar.w2, org.telegram.ui.ActionBar.c2
    public final boolean f() {
        na naVar = this.p1;
        if (naVar != null && naVar.getTag() != null) {
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
    public sa(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.h6 h6Var) {
        this(r0, g2Var, new ra(r1));
        Activity parentActivity = g2Var.getParentActivity();
        ra raVar = new ra();
        raVar.a = z10;
        raVar.c = false;
        raVar.d = z11;
        raVar.g = h6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sa(Context context, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, g2Var, new ra(r0));
        ra raVar = new ra();
        raVar.a = z10;
        raVar.c = z11;
        raVar.d = false;
        raVar.g = h6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sa(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.g2) null, new ra(r0));
        ra raVar = new ra();
        raVar.a = z10;
        raVar.c = false;
        raVar.d = false;
        raVar.f = i7;
        raVar.g = h6Var;
    }

    public void R0(float f10) {
    }

    public void U0(float f10) {
    }

    public void V0(du0 du0Var) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sa(Context context, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, g2Var, new ra(r0));
        ra raVar = new ra();
        raVar.a = z10;
        raVar.c = false;
        raVar.d = false;
        raVar.e = z11;
        raVar.f = i7;
        raVar.g = h6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sa(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.g2) null, new ra(r0));
        ra raVar = new ra();
        raVar.a = z10;
        raVar.b = 2;
        raVar.c = false;
        raVar.d = false;
        raVar.e = false;
        raVar.f = 2;
        raVar.g = h6Var;
    }

    public sa(Context context, org.telegram.ui.ActionBar.g2 g2Var, ra raVar) {
        super(raVar.b, context, raVar.g, raVar.a);
        du0 du0Var;
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
        boolean z10 = raVar.c;
        boolean z11 = raVar.d;
        boolean z12 = raVar.e;
        int i10 = raVar.f;
        this.s1 = g2Var;
        this.t1 = z10;
        this.m1 = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            la laVar = new la(this, context, z12, z10);
            this.u1 = laVar;
            du0Var = laVar;
        } else {
            du0Var = new ma(this, context, z12, z10);
        }
        ek0 N0 = N0(context);
        this.o1 = N0;
        jg.b0 b0Var = new jg.b0(6);
        this.n1 = b0Var;
        if (z12) {
            b0Var.l1(true);
        }
        N0.setLayoutManager(b0Var);
        la laVar2 = this.u1;
        if (laVar2 != null) {
            laVar2.setBottomSheetContainerView(this.c);
            this.u1.setTargetListView(N0);
        }
        if (z10) {
            N0.setHasFixedSize(true);
            N0.setAdapter(M0(N0));
            this.O = du0Var;
            du0Var.addView(N0, c8.ma.c(-2.0f, -1));
        } else {
            N0.setAdapter(new qa(this, M0(N0), context));
            this.b = du0Var;
            na naVar = new na(this, context, du0Var);
            this.p1 = naVar;
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, naVar, this.J0);
            org.telegram.ui.ActionBar.t6.l(naVar, 5, org.telegram.ui.ActionBar.m6.G6, this.J0);
            org.telegram.ui.ActionBar.t6.l(naVar, 3, org.telegram.ui.ActionBar.m6.z8, this.J0);
            naVar.setBackButtonImage(R.drawable.ic_ab_back);
            org.telegram.ui.ActionBar.t6.l(naVar, 1, org.telegram.ui.ActionBar.m6.y8, this.J0);
            naVar.setCastShadows(true);
            naVar.setTitle(P0());
            naVar.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 14));
            du0Var.addView(N0);
            du0Var.addView(naVar, c8.ma.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            N0.j(new oa(du0Var, i7));
        }
        if (i10 == 2) {
            Z0();
        }
        V0(du0Var);
        b1();
    }

    public void S0(Canvas canvas, int i7) {
    }

    public void T0(int i7, int i10) {
    }
}
