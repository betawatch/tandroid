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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class ma extends org.telegram.ui.ActionBar.t2 {
    public static final /* synthetic */ int P1 = 0;
    public int A1;
    public int B1;
    public int C1;
    public boolean D1;
    public boolean E1;
    public u5 F1;
    public boolean G1;
    public boolean H1;
    public jt I1;
    public boolean J1;
    public boolean K1;
    public float L1;
    public int M1;
    public int N1;
    public int O1;
    public final Drawable j1;
    public final kg.y k1;
    public final tj0 l1;
    public final ia m1;
    public boolean n1;
    public int o1;
    public final org.telegram.ui.ActionBar.d2 p1;
    public final boolean q1;
    public final ga r1;
    public float s1;
    public boolean t1;
    public float u1;
    public boolean v1;
    public boolean w1;
    public final RectF x1;
    public int y1;
    public int z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ma(org.telegram.ui.ActionBar.d2 d2Var, boolean z10) {
        this(r0, d2Var, new la(r1));
        Activity parentActivity = d2Var.getParentActivity();
        la laVar = new la();
        laVar.a = false;
        laVar.c = z10;
        laVar.g = d2Var.getResourceProvider();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public boolean G() {
        return false;
    }

    public final void I0() {
        tj0 tj0Var = this.l1;
        if (tj0Var == null || tj0Var.getLayoutManager() == null || this.M1 < 0) {
            return;
        }
        int top = (this.N1 - this.b.getTop()) - tj0Var.getPaddingTop();
        if (tj0Var.getLayoutManager() instanceof u4.b0) {
            ((u4.b0) tj0Var.getLayoutManager()).h1(this.M1, top);
        }
        this.M1 = -1;
    }

    public boolean J0(View view, float f10, float f11) {
        return true;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.s2 s2Var = this.Z;
        if (s2Var == null || this.b == null || this.s0 == null || !Z0() || this.q1) {
            return;
        }
        Rect bounds = this.s0.getBounds();
        if (this.b.getMeasuredWidth() >= this.c.getMeasuredWidth()) {
            s2Var.c(((this.b.getMeasuredHeight() - bounds.top) - org.telegram.messenger.g0.L(30.0f)) - ((int) this.b.getTranslationY()));
        } else {
            s2Var.c(0);
        }
    }

    public abstract sj0 L0(tj0 tj0Var);

    public tj0 M0(Context context) {
        return new ci.j1(this, context, this.J0, 13);
    }

    public int N0() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public abstract CharSequence O0();

    public final boolean P0() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0)) > 0.699999988079071d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(Canvas canvas, FrameLayout frameLayout) {
        int i3 = this.O1;
        Drawable drawable = this.j1;
        ia iaVar = this.m1;
        if (i3 == 1) {
            boolean z10 = this.t1;
            if (z10) {
                float f10 = this.u1;
                if (f10 != 1.0f) {
                    this.u1 = f10 + 0.10666667f;
                    frameLayout.invalidate();
                    this.u1 = Utilities.i(this.u1, 1.0f, 0.0f);
                    if (iaVar != null && iaVar.getVisibility() == 0 && iaVar.getAlpha() != 0.0f && this.u1 != 0.0f) {
                        drawable.setBounds(this.u0, iaVar.getBottom(), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + iaVar.getBottom());
                        drawable.setAlpha((int) (iaVar.getAlpha() * 255.0f * this.u1));
                        drawable.draw(canvas);
                        if (drawable.getAlpha() < 255) {
                            frameLayout.invalidate();
                        }
                    }
                    this.n1 = true;
                }
            }
            if (!z10) {
                float f11 = this.u1;
                if (f11 != 0.0f) {
                    this.u1 = f11 - 0.10666667f;
                    frameLayout.invalidate();
                }
            }
            this.u1 = Utilities.i(this.u1, 1.0f, 0.0f);
            if (iaVar != null) {
                drawable.setBounds(this.u0, iaVar.getBottom(), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + iaVar.getBottom());
                drawable.setAlpha((int) (iaVar.getAlpha() * 255.0f * this.u1));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                }
            }
            this.n1 = true;
        } else if (i3 == 2 && ((int) (this.u1 * 255.0f)) != 0 && this.t1) {
            drawable.setBounds(this.u0, iaVar.getBottom() + ((int) iaVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + iaVar.getBottom() + ((int) iaVar.getTranslationY()));
            drawable.setAlpha((int) (this.u1 * 255.0f));
            drawable.draw(canvas);
        }
        if (this.K1) {
            canvas.restore();
            this.K1 = false;
        }
    }

    public void W0(Canvas canvas, View view) {
        int i3;
        this.K1 = false;
        if (this.q1) {
            return;
        }
        boolean z10 = this.H1;
        tj0 tj0Var = this.l1;
        if (z10) {
            int height = tj0Var.getHeight();
            for (int i10 = 0; i10 < tj0Var.getChildCount(); i10++) {
                View childAt = tj0Var.getChildAt(i10);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R != tj0Var.getAdapter().b() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.G1 ? (int) childAt.getTranslationY() : 0));
                }
            }
            i3 = height - org.telegram.messenger.g0.L(16.0f);
        } else {
            u4.d1 K = tj0Var.K(0);
            int i11 = -org.telegram.messenger.g0.L(16.0f);
            if (K != null) {
                View view2 = K.a;
                i11 = view2.getBottom() - org.telegram.messenger.g0.L(16.0f);
                if (this.G1) {
                    i3 = ((int) view2.getTranslationY()) + i11;
                }
            }
            i3 = i11;
        }
        int i12 = (i3 - ((this.z1 + this.A1) + this.B1)) + this.C1;
        if (this.v1 && this.w1) {
            i12 -= org.telegram.messenger.g0.L(this.O1 == 2 ? 8.0f : 16.0f);
        }
        float f10 = i12;
        this.L1 = f10;
        T0(f10);
        int i13 = this.O1;
        float f11 = 1.0f;
        ia iaVar = this.m1;
        if (i13 == 1) {
            float L = 1.0f - ((org.telegram.messenger.g0.L(16.0f) + i12) / N0());
            if (L < 0.0f) {
                L = 0.0f;
            }
            org.telegram.messenger.g0.Z3(iaVar, L != 0.0f, 1.0f, true, this.n1);
        } else if (i13 == 2) {
            float max = Math.max(((org.telegram.messenger.g0.L(8.0f) + (i12 - this.C1)) + this.A1) - org.telegram.messenger.g0.m, 0.0f);
            float e10 = this.F1.e(false, max == 0.0f ? 1.0f : 0.0f);
            if (e10 != 0.0f && e10 != 1.0f) {
                canvas.save();
                canvas.clipRect(0.0f, max, this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
                this.K1 = true;
            }
            this.u1 = e10;
            f11 = org.telegram.messenger.g0.T1(1.0f, 0.5f, e10);
            iaVar.e.setAlpha(e10);
            Q0(e10);
            iaVar.e.setScaleX(e10);
            iaVar.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            iaVar.e.setScaleY(e10);
            org.telegram.ui.ActionBar.k5 titleTextView = iaVar.getTitleTextView();
            titleTextView.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(21.0f) - titleTextView.getLeft(), 0.0f, e10) + 0);
            if (this.J1) {
                titleTextView.setTranslationX(((iaVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            iaVar.setTranslationY(max);
            i12 -= org.telegram.messenger.g0.W1(e10, 0, org.telegram.messenger.g0.L(13.0f) + (((this.y1 - this.z1) - this.A1) - this.B1));
            iaVar.getBackground().setBounds(0, org.telegram.messenger.g0.W1(e10, iaVar.getHeight(), 0), iaVar.getWidth(), iaVar.getHeight());
            if (e10 > 0.5f) {
                if (this.E1) {
                    this.E1 = false;
                    iaVar.setTag(1);
                }
            } else if (!this.E1) {
                this.E1 = true;
                iaVar.setTag(null);
            }
        }
        if (Z0()) {
            if (this instanceof xg.a0) {
                this.s0.setBounds(-org.telegram.messenger.g0.L(6.0f), i12, org.telegram.messenger.g0.L(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                this.s0.setBounds(0, i12, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            K0();
            this.s0.draw(canvas);
            if (this.v1 && f11 > 0.0f) {
                int L2 = org.telegram.messenger.g0.L(36.0f);
                int L3 = org.telegram.messenger.g0.L(20.0f) + i12;
                float measuredWidth = (view.getMeasuredWidth() - L2) / 2.0f;
                float f12 = L3;
                float measuredWidth2 = (view.getMeasuredWidth() + L2) / 2.0f;
                float L4 = org.telegram.messenger.g0.L(4.0f) + L3;
                RectF rectF = this.x1;
                rectF.set(measuredWidth, f12, measuredWidth2, L4);
                org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, this.J0));
                org.telegram.ui.ActionBar.k6.t0.setAlpha((int) (r15.getAlpha() * f11));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.t0);
            }
        }
        R0(canvas, i12);
    }

    public final void X0() {
        tj0 tj0Var = this.l1;
        if (tj0Var == null || this.k1 == null || tj0Var.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i3 = -1;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < tj0Var.getChildCount(); i11++) {
            View childAt = tj0Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && childAt.getTop() < i10) {
                i10 = childAt.getTop();
                view = childAt;
                i3 = R;
            }
        }
        if (view != null) {
            this.M1 = i3;
            this.N1 = this.b.getTop() + view.getTop();
            this.f1 = System.currentTimeMillis() + 80;
        }
    }

    public final void Y0() {
        if (this.q1) {
            return;
        }
        this.O1 = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.z1 = currentActionBarHeight;
        this.y1 = currentActionBarHeight + org.telegram.messenger.g0.m;
        this.A1 = org.telegram.messenger.g0.L(16.0f);
        this.B1 = org.telegram.messenger.g0.L(-20.0f);
        this.F1 = new u5(this.b, 0L, 350L, xq.h);
        this.m1.e.setPivotX(0.0f);
        this.l1.setClipToPadding(true);
    }

    public boolean Z0() {
        return true;
    }

    public final void a1() {
        if (this.g1 != null) {
            LaunchActivity.K1.F(true, true, true);
            return;
        }
        ia iaVar = this.m1;
        if (iaVar != null && iaVar.getTag() != null) {
            org.telegram.messenger.g0.q3(this, P0());
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.p1;
        if (d2Var != null) {
            org.telegram.messenger.g0.q3(this, d2Var.isLightStatusBar());
        }
    }

    public final void b1() {
        ia iaVar = this.m1;
        if (iaVar != null) {
            iaVar.setTitle(O0());
        }
    }

    public final void c1() {
        ia iaVar = this.m1;
        if (iaVar == null || TextUtils.equals(O0(), iaVar.getTitle())) {
            return;
        }
        iaVar.K(O0(), false, 350L, xq.h);
    }

    @Override // org.telegram.ui.ActionBar.t2, org.telegram.ui.ActionBar.z1
    public final boolean f() {
        ia iaVar = this.m1;
        if (iaVar != null && iaVar.getTag() != null) {
            return P0();
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.p1;
        return d2Var != null ? d2Var.isLightStatusBar() : P0();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public void h0() {
        T0(this.L1);
        K0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ma(org.telegram.ui.ActionBar.d2 d2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        this(r0, d2Var, new la(r1));
        Activity parentActivity = d2Var.getParentActivity();
        la laVar = new la();
        laVar.a = z10;
        laVar.c = false;
        laVar.d = z11;
        laVar.g = e6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ma(Context context, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, d2Var, new la(r0));
        la laVar = new la();
        laVar.a = z10;
        laVar.c = z11;
        laVar.d = false;
        laVar.g = e6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ma(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.d2) null, new la(r0));
        la laVar = new la();
        laVar.a = z10;
        laVar.c = false;
        laVar.d = false;
        laVar.f = i3;
        laVar.g = e6Var;
    }

    public void Q0(float f10) {
    }

    public void T0(float f10) {
    }

    public void U0(qt0 qt0Var) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ma(Context context, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, boolean z11, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, d2Var, new la(r0));
        la laVar = new la();
        laVar.a = z10;
        laVar.c = false;
        laVar.d = false;
        laVar.e = z11;
        laVar.f = i3;
        laVar.g = e6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ma(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.d2) null, new la(r0));
        la laVar = new la();
        laVar.a = z10;
        laVar.b = 2;
        laVar.c = false;
        laVar.d = false;
        laVar.e = false;
        laVar.f = 2;
        laVar.g = e6Var;
    }

    public void R0(Canvas canvas, int i3) {
    }

    public void S0(int i3, int i10) {
    }

    public ma(Context context, org.telegram.ui.ActionBar.d2 d2Var, la laVar) {
        super(laVar.b, context, laVar.g, laVar.a);
        qt0 qt0Var;
        this.s1 = 0.4f;
        this.t1 = true;
        this.u1 = 1.0f;
        this.v1 = false;
        this.x1 = new RectF();
        this.O1 = 1;
        this.y1 = 0;
        this.z1 = 0;
        this.A1 = 0;
        this.B1 = 0;
        this.C1 = 0;
        this.D1 = true;
        this.E1 = false;
        this.G1 = false;
        this.M1 = -1;
        boolean z10 = laVar.c;
        boolean z11 = laVar.d;
        boolean z12 = laVar.e;
        int i3 = laVar.f;
        this.p1 = d2Var;
        this.q1 = z10;
        this.j1 = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            ga gaVar = new ga(this, context, z12, z10);
            this.r1 = gaVar;
            qt0Var = gaVar;
        } else {
            qt0Var = new ha(this, context, z12, z10);
        }
        tj0 M0 = M0(context);
        this.l1 = M0;
        kg.y yVar = new kg.y(6);
        this.k1 = yVar;
        if (z12) {
            yVar.l1(true);
        }
        M0.setLayoutManager(yVar);
        ga gaVar2 = this.r1;
        if (gaVar2 != null) {
            gaVar2.setBottomSheetContainerView(this.c);
            this.r1.setTargetListView(M0);
        }
        if (z10) {
            M0.setHasFixedSize(true);
            M0.setAdapter(L0(M0));
            this.O = qt0Var;
            qt0Var.addView(M0, b8.mf.c(-2.0f, -1));
        } else {
            M0.setAdapter(new ka(this, L0(M0), context));
            this.b = qt0Var;
            ia iaVar = new ia(this, context, qt0Var);
            this.m1 = iaVar;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, iaVar, this.J0);
            org.telegram.ui.ActionBar.r6.m(iaVar, 5, org.telegram.ui.ActionBar.k6.G6, this.J0);
            org.telegram.ui.ActionBar.r6.m(iaVar, 3, org.telegram.ui.ActionBar.k6.z8, this.J0);
            iaVar.setBackButtonImage(R.drawable.ic_ab_back);
            org.telegram.ui.ActionBar.r6.m(iaVar, 1, org.telegram.ui.ActionBar.k6.y8, this.J0);
            iaVar.setCastShadows(true);
            iaVar.setTitle(O0());
            iaVar.setActionBarMenuOnItemClick(new org.telegram.ui.o9(this, 12));
            qt0Var.addView(M0);
            qt0Var.addView(iaVar, b8.mf.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            M0.j(new ai.j5(qt0Var, 29));
        }
        if (i3 == 2) {
            Y0();
        }
        U0(qt0Var);
        a1();
    }
}
