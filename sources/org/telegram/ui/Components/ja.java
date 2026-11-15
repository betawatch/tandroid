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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class ja extends org.telegram.ui.ActionBar.u2 {
    public static final /* synthetic */ int S1 = 0;
    public final RectF A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public boolean G1;
    public boolean H1;
    public u5 I1;
    public boolean J1;
    public boolean K1;
    public rt L1;
    public boolean M1;
    public boolean N1;
    public float O1;
    public int P1;
    public int Q1;
    public int R1;
    public final Drawable m1;
    public final jg.b0 n1;
    public final uj0 o1;
    public final fa p1;
    public boolean q1;
    public int r1;
    public final org.telegram.ui.ActionBar.e2 s1;
    public final boolean t1;
    public final da u1;
    public float v1;
    public boolean w1;
    public float x1;
    public boolean y1;
    public boolean z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja(org.telegram.ui.ActionBar.e2 e2Var, boolean z10) {
        this(r0, e2Var, new ia(r1));
        Activity parentActivity = e2Var.getParentActivity();
        ia iaVar = new ia();
        iaVar.a = false;
        iaVar.c = z10;
        iaVar.g = e2Var.getResourceProvider();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public boolean H() {
        return false;
    }

    public final void I0() {
        uj0 uj0Var = this.o1;
        if (uj0Var == null || uj0Var.getLayoutManager() == null || this.P1 < 0) {
            return;
        }
        int top = (this.Q1 - this.b.getTop()) - uj0Var.getPaddingTop();
        if (uj0Var.getLayoutManager() instanceof v4.b0) {
            ((v4.b0) uj0Var.getLayoutManager()).h1(this.P1, top);
        }
        this.P1 = -1;
    }

    public boolean J0(View view, float f10, float f11) {
        return true;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.t2 t2Var = this.Z;
        if (t2Var == null || this.b == null || this.s0 == null || !Z0() || this.t1) {
            return;
        }
        Rect bounds = this.s0.getBounds();
        if (this.b.getMeasuredWidth() >= this.c.getMeasuredWidth()) {
            t2Var.c(((this.b.getMeasuredHeight() - bounds.top) - org.telegram.messenger.g0.L(30.0f)) - ((int) this.b.getTranslationY()));
        } else {
            t2Var.c(0);
        }
    }

    public abstract tj0 L0(uj0 uj0Var);

    public uj0 M0(Context context) {
        return new di.c1(this, context, this.J0, 13);
    }

    public int N0() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public abstract CharSequence O0();

    public final boolean P0() {
        return i0.a.h(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.J0)) > 0.699999988079071d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(Canvas canvas, FrameLayout frameLayout) {
        int i7 = this.R1;
        Drawable drawable = this.m1;
        fa faVar = this.p1;
        if (i7 == 1) {
            boolean z10 = this.w1;
            if (z10) {
                float f10 = this.x1;
                if (f10 != 1.0f) {
                    this.x1 = f10 + 0.10666667f;
                    frameLayout.invalidate();
                    this.x1 = Utilities.i(this.x1, 1.0f, 0.0f);
                    if (faVar != null && faVar.getVisibility() == 0 && faVar.getAlpha() != 0.0f && this.x1 != 0.0f) {
                        drawable.setBounds(this.u0, faVar.getBottom(), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + faVar.getBottom());
                        drawable.setAlpha((int) (faVar.getAlpha() * 255.0f * this.x1));
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
            if (faVar != null) {
                drawable.setBounds(this.u0, faVar.getBottom(), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + faVar.getBottom());
                drawable.setAlpha((int) (faVar.getAlpha() * 255.0f * this.x1));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                }
            }
            this.q1 = true;
        } else if (i7 == 2 && ((int) (this.x1 * 255.0f)) != 0 && this.w1) {
            drawable.setBounds(this.u0, faVar.getBottom() + ((int) faVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + faVar.getBottom() + ((int) faVar.getTranslationY()));
            drawable.setAlpha((int) (this.x1 * 255.0f));
            drawable.draw(canvas);
        }
        if (this.N1) {
            canvas.restore();
            this.N1 = false;
        }
    }

    public void W0(Canvas canvas, View view) {
        int i7;
        this.N1 = false;
        if (this.t1) {
            return;
        }
        boolean z10 = this.K1;
        uj0 uj0Var = this.o1;
        if (z10) {
            int height = uj0Var.getHeight();
            for (int i10 = 0; i10 < uj0Var.getChildCount(); i10++) {
                View childAt = uj0Var.getChildAt(i10);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R != uj0Var.getAdapter().b() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.J1 ? (int) childAt.getTranslationY() : 0));
                }
            }
            i7 = height - org.telegram.messenger.g0.L(16.0f);
        } else {
            v4.e1 K = uj0Var.K(0);
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
        T0(f10);
        int i13 = this.R1;
        float f11 = 1.0f;
        fa faVar = this.p1;
        if (i13 == 1) {
            float L = 1.0f - ((org.telegram.messenger.g0.L(16.0f) + i12) / N0());
            if (L < 0.0f) {
                L = 0.0f;
            }
            org.telegram.messenger.g0.Y3(faVar, L != 0.0f, 1.0f, true, this.q1);
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
            faVar.e.setAlpha(e10);
            Q0(e10);
            faVar.e.setScaleX(e10);
            faVar.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            faVar.e.setScaleY(e10);
            org.telegram.ui.ActionBar.j5 titleTextView = faVar.getTitleTextView();
            titleTextView.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(21.0f) - titleTextView.getLeft(), 0.0f, e10) + 0);
            if (this.M1) {
                titleTextView.setTranslationX(((faVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            faVar.setTranslationY(max);
            i12 -= org.telegram.messenger.g0.W1(e10, 0, org.telegram.messenger.g0.L(13.0f) + (((this.B1 - this.C1) - this.D1) - this.E1));
            faVar.getBackground().setBounds(0, org.telegram.messenger.g0.W1(e10, faVar.getHeight(), 0), faVar.getWidth(), faVar.getHeight());
            if (e10 > 0.5f) {
                if (this.H1) {
                    this.H1 = false;
                    faVar.setTag(1);
                }
            } else if (!this.H1) {
                this.H1 = true;
                faVar.setTag(null);
            }
        }
        if (Z0()) {
            if (this instanceof wg.y) {
                this.s0.setBounds(-org.telegram.messenger.g0.L(6.0f), i12, org.telegram.messenger.g0.L(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                this.s0.setBounds(0, i12, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            K0();
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
                org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.zj, this.J0));
                org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (r15.getAlpha() * f11));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.j6.t0);
            }
        }
        R0(canvas, i12);
    }

    public final void X0() {
        uj0 uj0Var = this.o1;
        if (uj0Var == null || this.n1 == null || uj0Var.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i7 = -1;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < uj0Var.getChildCount(); i11++) {
            View childAt = uj0Var.getChildAt(i11);
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

    public final void Y0() {
        if (this.t1) {
            return;
        }
        this.R1 = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.C1 = currentActionBarHeight;
        this.B1 = currentActionBarHeight + org.telegram.messenger.g0.m;
        this.D1 = org.telegram.messenger.g0.L(16.0f);
        this.E1 = org.telegram.messenger.g0.L(-20.0f);
        this.I1 = new u5(this.b, 0L, 350L, er.h);
        this.p1.e.setPivotX(0.0f);
        this.o1.setClipToPadding(true);
    }

    public boolean Z0() {
        return true;
    }

    public final void a1() {
        if (this.j1 != null) {
            LaunchActivity.H1.F(true, true, true);
            return;
        }
        fa faVar = this.p1;
        if (faVar != null && faVar.getTag() != null) {
            org.telegram.messenger.g0.q3(this, P0());
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.s1;
        if (e2Var != null) {
            org.telegram.messenger.g0.q3(this, e2Var.isLightStatusBar());
        }
    }

    public final void b1() {
        fa faVar = this.p1;
        if (faVar != null) {
            faVar.setTitle(O0());
        }
    }

    public final void c1() {
        fa faVar = this.p1;
        if (faVar == null || TextUtils.equals(O0(), faVar.getTitle())) {
            return;
        }
        faVar.N(O0(), false, 350L, er.h);
    }

    @Override // org.telegram.ui.ActionBar.u2, org.telegram.ui.ActionBar.a2
    public final boolean f() {
        fa faVar = this.p1;
        if (faVar != null && faVar.getTag() != null) {
            return P0();
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.s1;
        return e2Var != null ? e2Var.isLightStatusBar() : P0();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public void h0() {
        T0(this.O1);
        K0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja(org.telegram.ui.ActionBar.e2 e2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        this(r0, e2Var, new ia(r1));
        Activity parentActivity = e2Var.getParentActivity();
        ia iaVar = new ia();
        iaVar.a = z10;
        iaVar.c = false;
        iaVar.d = z11;
        iaVar.g = e6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja(Context context, org.telegram.ui.ActionBar.e2 e2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, e2Var, new ia(r0));
        ia iaVar = new ia();
        iaVar.a = z10;
        iaVar.c = z11;
        iaVar.d = false;
        iaVar.g = e6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.e2) null, new ia(r0));
        ia iaVar = new ia();
        iaVar.a = z10;
        iaVar.c = false;
        iaVar.d = false;
        iaVar.f = i7;
        iaVar.g = e6Var;
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
    public ja(Context context, org.telegram.ui.ActionBar.e2 e2Var, boolean z10, boolean z11, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, e2Var, new ia(r0));
        ia iaVar = new ia();
        iaVar.a = z10;
        iaVar.c = false;
        iaVar.d = false;
        iaVar.e = z11;
        iaVar.f = i7;
        iaVar.g = e6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.e2) null, new ia(r0));
        ia iaVar = new ia();
        iaVar.a = z10;
        iaVar.b = 2;
        iaVar.c = false;
        iaVar.d = false;
        iaVar.e = false;
        iaVar.f = 2;
        iaVar.g = e6Var;
    }

    public ja(Context context, org.telegram.ui.ActionBar.e2 e2Var, ia iaVar) {
        super(iaVar.b, context, iaVar.g, iaVar.a);
        st0 st0Var;
        this.v1 = 0.4f;
        this.w1 = true;
        this.x1 = 1.0f;
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
        boolean z10 = iaVar.c;
        boolean z11 = iaVar.d;
        boolean z12 = iaVar.e;
        int i7 = iaVar.f;
        this.s1 = e2Var;
        this.t1 = z10;
        this.m1 = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            da daVar = new da(this, context, z12, z10);
            this.u1 = daVar;
            st0Var = daVar;
        } else {
            st0Var = new ea(this, context, z12, z10);
        }
        uj0 M0 = M0(context);
        this.o1 = M0;
        jg.b0 b0Var = new jg.b0(6);
        this.n1 = b0Var;
        if (z12) {
            b0Var.l1(true);
        }
        M0.setLayoutManager(b0Var);
        da daVar2 = this.u1;
        if (daVar2 != null) {
            daVar2.setBottomSheetContainerView(this.c);
            this.u1.setTargetListView(M0);
        }
        if (z10) {
            M0.setHasFixedSize(true);
            M0.setAdapter(L0(M0));
            this.O = st0Var;
            st0Var.addView(M0, c8.ja.c(-2.0f, -1));
        } else {
            M0.setAdapter(new ha(this, L0(M0), context));
            this.b = st0Var;
            fa faVar = new fa(this, context, st0Var);
            this.p1 = faVar;
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, faVar, this.J0);
            org.telegram.ui.ActionBar.q6.l(faVar, 5, org.telegram.ui.ActionBar.j6.G6, this.J0);
            org.telegram.ui.ActionBar.q6.l(faVar, 3, org.telegram.ui.ActionBar.j6.z8, this.J0);
            faVar.setBackButtonImage(R.drawable.ic_ab_back);
            org.telegram.ui.ActionBar.q6.l(faVar, 1, org.telegram.ui.ActionBar.j6.y8, this.J0);
            faVar.setCastShadows(true);
            faVar.setTitle(O0());
            faVar.setActionBarMenuOnItemClick(new org.telegram.ui.p9(this, 12));
            st0Var.addView(M0);
            st0Var.addView(faVar, c8.ja.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            M0.j(new bi.z4(st0Var, 29));
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
