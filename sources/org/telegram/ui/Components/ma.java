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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class ma extends org.telegram.ui.ActionBar.w2 {
    public static final /* synthetic */ int R1 = 0;
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public boolean F1;
    public boolean G1;
    public v5 H1;
    public boolean I1;
    public boolean J1;
    public kt K1;
    public boolean L1;
    public boolean M1;
    public float N1;
    public int O1;
    public int P1;
    public int Q1;
    public final Drawable l1;
    public final jg.b0 m1;
    public final pj0 n1;
    public final ia o1;
    public boolean p1;
    public int q1;
    public final org.telegram.ui.ActionBar.f2 r1;
    public final boolean s1;
    public final ga t1;
    public float u1;
    public boolean v1;
    public float w1;
    public boolean x1;
    public boolean y1;
    public final RectF z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ma(org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        this(r0, f2Var, new la(r1));
        Activity parentActivity = f2Var.getParentActivity();
        la laVar = new la();
        laVar.a = false;
        laVar.c = z9;
        laVar.g = f2Var.getResourceProvider();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public boolean G() {
        return false;
    }

    public final void I0() {
        pj0 pj0Var = this.n1;
        if (pj0Var == null || pj0Var.getLayoutManager() == null || this.O1 < 0) {
            return;
        }
        int top = (this.P1 - this.b.getTop()) - pj0Var.getPaddingTop();
        if (pj0Var.getLayoutManager() instanceof v4.b0) {
            ((v4.b0) pj0Var.getLayoutManager()).h1(this.O1, top);
        }
        this.O1 = -1;
    }

    public boolean J0(View view, float f10, float f11) {
        return true;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.v2 v2Var = this.Y;
        if (v2Var == null || this.b == null || this.r0 == null || !Z0() || this.s1) {
            return;
        }
        Rect bounds = this.r0.getBounds();
        if (this.b.getMeasuredWidth() >= this.c.getMeasuredWidth()) {
            v2Var.c(((this.b.getMeasuredHeight() - bounds.top) - org.telegram.messenger.g0.L(30.0f)) - ((int) this.b.getTranslationY()));
        } else {
            v2Var.c(0);
        }
    }

    public abstract oj0 L0(pj0 pj0Var);

    public pj0 M0(Context context) {
        return new bi.q1(this, context, this.I0, 13);
    }

    public int N0() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public abstract CharSequence O0();

    public final boolean P0() {
        return i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.I0)) > 0.699999988079071d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(Canvas canvas, FrameLayout frameLayout) {
        int i7 = this.Q1;
        Drawable drawable = this.l1;
        ia iaVar = this.o1;
        if (i7 == 1) {
            boolean z9 = this.v1;
            if (z9) {
                float f10 = this.w1;
                if (f10 != 1.0f) {
                    this.w1 = f10 + 0.10666667f;
                    frameLayout.invalidate();
                    this.w1 = Utilities.i(this.w1, 1.0f, 0.0f);
                    if (iaVar != null && iaVar.getVisibility() == 0 && iaVar.getAlpha() != 0.0f && this.w1 != 0.0f) {
                        drawable.setBounds(this.t0, iaVar.getBottom(), frameLayout.getMeasuredWidth() - this.t0, drawable.getIntrinsicHeight() + iaVar.getBottom());
                        drawable.setAlpha((int) (iaVar.getAlpha() * 255.0f * this.w1));
                        drawable.draw(canvas);
                        if (drawable.getAlpha() < 255) {
                            frameLayout.invalidate();
                        }
                    }
                    this.p1 = true;
                }
            }
            if (!z9) {
                float f11 = this.w1;
                if (f11 != 0.0f) {
                    this.w1 = f11 - 0.10666667f;
                    frameLayout.invalidate();
                }
            }
            this.w1 = Utilities.i(this.w1, 1.0f, 0.0f);
            if (iaVar != null) {
                drawable.setBounds(this.t0, iaVar.getBottom(), frameLayout.getMeasuredWidth() - this.t0, drawable.getIntrinsicHeight() + iaVar.getBottom());
                drawable.setAlpha((int) (iaVar.getAlpha() * 255.0f * this.w1));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                }
            }
            this.p1 = true;
        } else if (i7 == 2 && ((int) (this.w1 * 255.0f)) != 0 && this.v1) {
            drawable.setBounds(this.t0, iaVar.getBottom() + ((int) iaVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.t0, drawable.getIntrinsicHeight() + iaVar.getBottom() + ((int) iaVar.getTranslationY()));
            drawable.setAlpha((int) (this.w1 * 255.0f));
            drawable.draw(canvas);
        }
        if (this.M1) {
            canvas.restore();
            this.M1 = false;
        }
    }

    public void W0(Canvas canvas, View view) {
        int i7;
        this.M1 = false;
        if (this.s1) {
            return;
        }
        boolean z9 = this.J1;
        pj0 pj0Var = this.n1;
        if (z9) {
            int height = pj0Var.getHeight();
            for (int i10 = 0; i10 < pj0Var.getChildCount(); i10++) {
                View childAt = pj0Var.getChildAt(i10);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R != pj0Var.getAdapter().b() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.I1 ? (int) childAt.getTranslationY() : 0));
                }
            }
            i7 = height - org.telegram.messenger.g0.L(16.0f);
        } else {
            v4.d1 K = pj0Var.K(0);
            int i11 = -org.telegram.messenger.g0.L(16.0f);
            if (K != null) {
                View view2 = K.a;
                i11 = view2.getBottom() - org.telegram.messenger.g0.L(16.0f);
                if (this.I1) {
                    i7 = ((int) view2.getTranslationY()) + i11;
                }
            }
            i7 = i11;
        }
        int i12 = (i7 - ((this.B1 + this.C1) + this.D1)) + this.E1;
        if (this.x1 && this.y1) {
            i12 -= org.telegram.messenger.g0.L(this.Q1 == 2 ? 8.0f : 16.0f);
        }
        float f10 = i12;
        this.N1 = f10;
        T0(f10);
        int i13 = this.Q1;
        float f11 = 1.0f;
        ia iaVar = this.o1;
        if (i13 == 1) {
            float L = 1.0f - ((org.telegram.messenger.g0.L(16.0f) + i12) / N0());
            if (L < 0.0f) {
                L = 0.0f;
            }
            org.telegram.messenger.g0.Z3(iaVar, L != 0.0f, 1.0f, true, this.p1);
        } else if (i13 == 2) {
            float max = Math.max(((org.telegram.messenger.g0.L(8.0f) + (i12 - this.E1)) + this.C1) - org.telegram.messenger.g0.m, 0.0f);
            float e10 = this.H1.e(false, max == 0.0f ? 1.0f : 0.0f);
            if (e10 != 0.0f && e10 != 1.0f) {
                canvas.save();
                canvas.clipRect(0.0f, max, this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
                this.M1 = true;
            }
            this.w1 = e10;
            f11 = org.telegram.messenger.g0.T1(1.0f, 0.5f, e10);
            iaVar.e.setAlpha(e10);
            Q0(e10);
            iaVar.e.setScaleX(e10);
            iaVar.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            iaVar.e.setScaleY(e10);
            org.telegram.ui.ActionBar.m5 titleTextView = iaVar.getTitleTextView();
            titleTextView.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(21.0f) - titleTextView.getLeft(), 0.0f, e10) + 0);
            if (this.L1) {
                titleTextView.setTranslationX(((iaVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            iaVar.setTranslationY(max);
            i12 -= org.telegram.messenger.g0.W1(e10, 0, org.telegram.messenger.g0.L(13.0f) + (((this.A1 - this.B1) - this.C1) - this.D1));
            iaVar.getBackground().setBounds(0, org.telegram.messenger.g0.W1(e10, iaVar.getHeight(), 0), iaVar.getWidth(), iaVar.getHeight());
            if (e10 > 0.5f) {
                if (this.G1) {
                    this.G1 = false;
                    iaVar.setTag(1);
                }
            } else if (!this.G1) {
                this.G1 = true;
                iaVar.setTag(null);
            }
        }
        if (Z0()) {
            if (this instanceof wg.z) {
                this.r0.setBounds(-org.telegram.messenger.g0.L(6.0f), i12, org.telegram.messenger.g0.L(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                this.r0.setBounds(0, i12, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            K0();
            this.r0.draw(canvas);
            if (this.x1 && f11 > 0.0f) {
                int L2 = org.telegram.messenger.g0.L(36.0f);
                int L3 = org.telegram.messenger.g0.L(20.0f) + i12;
                float measuredWidth = (view.getMeasuredWidth() - L2) / 2.0f;
                float f12 = L3;
                float measuredWidth2 = (view.getMeasuredWidth() + L2) / 2.0f;
                float L4 = org.telegram.messenger.g0.L(4.0f) + L3;
                RectF rectF = this.z1;
                rectF.set(measuredWidth, f12, measuredWidth2, L4);
                org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, this.I0));
                org.telegram.ui.ActionBar.m6.t0.setAlpha((int) (r15.getAlpha() * f11));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.t0);
            }
        }
        R0(canvas, i12);
    }

    public final void X0() {
        pj0 pj0Var = this.n1;
        if (pj0Var == null || this.m1 == null || pj0Var.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i7 = -1;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < pj0Var.getChildCount(); i11++) {
            View childAt = pj0Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && childAt.getTop() < i10) {
                i10 = childAt.getTop();
                view = childAt;
                i7 = R;
            }
        }
        if (view != null) {
            this.O1 = i7;
            this.P1 = this.b.getTop() + view.getTop();
            this.h1 = System.currentTimeMillis() + 80;
        }
    }

    public final void Y0() {
        if (this.s1) {
            return;
        }
        this.Q1 = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.B1 = currentActionBarHeight;
        this.A1 = currentActionBarHeight + org.telegram.messenger.g0.m;
        this.C1 = org.telegram.messenger.g0.L(16.0f);
        this.D1 = org.telegram.messenger.g0.L(-20.0f);
        this.H1 = new v5(this.b, 0L, 350L, wq.h);
        this.o1.e.setPivotX(0.0f);
        this.n1.setClipToPadding(true);
    }

    public boolean Z0() {
        return true;
    }

    public final void a1() {
        if (this.i1 != null) {
            LaunchActivity.G1.F(true, true, true);
            return;
        }
        ia iaVar = this.o1;
        if (iaVar != null && iaVar.getTag() != null) {
            org.telegram.messenger.g0.q3(this, P0());
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.r1;
        if (f2Var != null) {
            org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
        }
    }

    public final void b1() {
        ia iaVar = this.o1;
        if (iaVar != null) {
            iaVar.setTitle(O0());
        }
    }

    public final void c1() {
        ia iaVar = this.o1;
        if (iaVar == null || TextUtils.equals(O0(), iaVar.getTitle())) {
            return;
        }
        iaVar.M(O0(), false, 350L, wq.h);
    }

    @Override // org.telegram.ui.ActionBar.w2, org.telegram.ui.ActionBar.b2
    public final boolean f() {
        ia iaVar = this.o1;
        if (iaVar != null && iaVar.getTag() != null) {
            return P0();
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.r1;
        return f2Var != null ? f2Var.isLightStatusBar() : P0();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public void h0() {
        T0(this.N1);
        K0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ma(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        this(r0, f2Var, new la(r1));
        Activity parentActivity = f2Var.getParentActivity();
        la laVar = new la();
        laVar.a = z9;
        laVar.c = false;
        laVar.d = z10;
        laVar.g = h6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ma(Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, f2Var, new la(r0));
        la laVar = new la();
        laVar.a = z9;
        laVar.c = z10;
        laVar.d = false;
        laVar.g = h6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ma(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        this(context, (org.telegram.ui.ActionBar.f2) null, new la(r0));
        la laVar = new la();
        laVar.a = z9;
        laVar.c = false;
        laVar.d = false;
        laVar.f = i7;
        laVar.g = h6Var;
    }

    public void Q0(float f10) {
    }

    public void T0(float f10) {
    }

    public void U0(st0 st0Var) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ma(Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, f2Var, new la(r0));
        la laVar = new la();
        laVar.a = z9;
        laVar.c = false;
        laVar.d = false;
        laVar.e = z10;
        laVar.f = i7;
        laVar.g = h6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ma(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        this(context, (org.telegram.ui.ActionBar.f2) null, new la(r0));
        la laVar = new la();
        laVar.a = z9;
        laVar.b = 2;
        laVar.c = false;
        laVar.d = false;
        laVar.e = false;
        laVar.f = 2;
        laVar.g = h6Var;
    }

    public ma(Context context, org.telegram.ui.ActionBar.f2 f2Var, la laVar) {
        super(laVar.b, context, laVar.g, laVar.a);
        st0 st0Var;
        this.u1 = 0.4f;
        this.v1 = true;
        this.w1 = 1.0f;
        this.x1 = false;
        this.z1 = new RectF();
        this.Q1 = 1;
        this.A1 = 0;
        this.B1 = 0;
        this.C1 = 0;
        this.D1 = 0;
        this.E1 = 0;
        this.F1 = true;
        this.G1 = false;
        this.I1 = false;
        this.O1 = -1;
        boolean z9 = laVar.c;
        boolean z10 = laVar.d;
        boolean z11 = laVar.e;
        int i7 = laVar.f;
        this.r1 = f2Var;
        this.s1 = z9;
        this.l1 = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z10) {
            ga gaVar = new ga(this, context, z11, z9);
            this.t1 = gaVar;
            st0Var = gaVar;
        } else {
            st0Var = new ha(this, context, z11, z9);
        }
        pj0 M0 = M0(context);
        this.n1 = M0;
        jg.b0 b0Var = new jg.b0(6);
        this.m1 = b0Var;
        if (z11) {
            b0Var.l1(true);
        }
        M0.setLayoutManager(b0Var);
        ga gaVar2 = this.t1;
        if (gaVar2 != null) {
            gaVar2.setBottomSheetContainerView(this.c);
            this.t1.setTargetListView(M0);
        }
        if (z9) {
            M0.setHasFixedSize(true);
            M0.setAdapter(L0(M0));
            this.N = st0Var;
            st0Var.addView(M0, c8.ha.c(-2.0f, -1));
        } else {
            M0.setAdapter(new ka(this, L0(M0), context));
            this.b = st0Var;
            ia iaVar = new ia(this, context, st0Var);
            this.o1 = iaVar;
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, iaVar, this.I0);
            org.telegram.ui.ActionBar.t6.l(iaVar, 5, org.telegram.ui.ActionBar.m6.G6, this.I0);
            org.telegram.ui.ActionBar.t6.l(iaVar, 3, org.telegram.ui.ActionBar.m6.z8, this.I0);
            iaVar.setBackButtonImage(R.drawable.ic_ab_back);
            org.telegram.ui.ActionBar.t6.l(iaVar, 1, org.telegram.ui.ActionBar.m6.y8, this.I0);
            iaVar.setCastShadows(true);
            iaVar.setTitle(O0());
            iaVar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 11));
            st0Var.addView(M0);
            st0Var.addView(iaVar, c8.ha.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            M0.j(new ai.b(st0Var, 27));
        }
        if (i7 == 2) {
            Y0();
        }
        U0(st0Var);
        a1();
    }

    public void R0(Canvas canvas, int i7) {
    }

    public void S0(int i7, int i10) {
    }
}
