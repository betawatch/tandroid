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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class na extends org.telegram.ui.ActionBar.v2 {
    public static final /* synthetic */ int O1 = 0;
    public int A1;
    public int B1;
    public boolean C1;
    public boolean D1;
    public w5 E1;
    public boolean F1;
    public boolean G1;
    public lt H1;
    public boolean I1;
    public boolean J1;
    public float K1;
    public int L1;
    public int M1;
    public int N1;
    public final Drawable i1;
    public final jg.b0 j1;
    public final pj0 k1;
    public final ja l1;
    public boolean m1;
    public int n1;
    public final org.telegram.ui.ActionBar.f2 o1;
    public final boolean p1;
    public final ha q1;
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
    public na(org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        this(r0, f2Var, new ma(r1));
        Activity parentActivity = f2Var.getParentActivity();
        ma maVar = new ma();
        maVar.a = false;
        maVar.c = z9;
        maVar.g = f2Var.getResourceProvider();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public boolean G() {
        return false;
    }

    public final void I0() {
        pj0 pj0Var = this.k1;
        if (pj0Var == null || pj0Var.getLayoutManager() == null || this.L1 < 0) {
            return;
        }
        int top = (this.M1 - this.b.getTop()) - pj0Var.getPaddingTop();
        if (pj0Var.getLayoutManager() instanceof v4.b0) {
            ((v4.b0) pj0Var.getLayoutManager()).h1(this.L1, top);
        }
        this.L1 = -1;
    }

    public boolean J0(View view, float f10, float f11) {
        return true;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.u2 u2Var = this.Y;
        if (u2Var == null || this.b == null || this.r0 == null || !Z0() || this.p1) {
            return;
        }
        Rect bounds = this.r0.getBounds();
        if (this.b.getMeasuredWidth() >= this.c.getMeasuredWidth()) {
            u2Var.c(((this.b.getMeasuredHeight() - bounds.top) - org.telegram.messenger.g0.L(30.0f)) - ((int) this.b.getTranslationY()));
        } else {
            u2Var.c(0);
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
        return i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.I0)) > 0.699999988079071d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(Canvas canvas, FrameLayout frameLayout) {
        int i7 = this.N1;
        Drawable drawable = this.i1;
        ja jaVar = this.l1;
        if (i7 == 1) {
            boolean z9 = this.s1;
            if (z9) {
                float f10 = this.t1;
                if (f10 != 1.0f) {
                    this.t1 = f10 + 0.10666667f;
                    frameLayout.invalidate();
                    this.t1 = Utilities.i(this.t1, 1.0f, 0.0f);
                    if (jaVar != null && jaVar.getVisibility() == 0 && jaVar.getAlpha() != 0.0f && this.t1 != 0.0f) {
                        drawable.setBounds(this.t0, jaVar.getBottom(), frameLayout.getMeasuredWidth() - this.t0, drawable.getIntrinsicHeight() + jaVar.getBottom());
                        drawable.setAlpha((int) (jaVar.getAlpha() * 255.0f * this.t1));
                        drawable.draw(canvas);
                        if (drawable.getAlpha() < 255) {
                            frameLayout.invalidate();
                        }
                    }
                    this.m1 = true;
                }
            }
            if (!z9) {
                float f11 = this.t1;
                if (f11 != 0.0f) {
                    this.t1 = f11 - 0.10666667f;
                    frameLayout.invalidate();
                }
            }
            this.t1 = Utilities.i(this.t1, 1.0f, 0.0f);
            if (jaVar != null) {
                drawable.setBounds(this.t0, jaVar.getBottom(), frameLayout.getMeasuredWidth() - this.t0, drawable.getIntrinsicHeight() + jaVar.getBottom());
                drawable.setAlpha((int) (jaVar.getAlpha() * 255.0f * this.t1));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                }
            }
            this.m1 = true;
        } else if (i7 == 2 && ((int) (this.t1 * 255.0f)) != 0 && this.s1) {
            drawable.setBounds(this.t0, jaVar.getBottom() + ((int) jaVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.t0, drawable.getIntrinsicHeight() + jaVar.getBottom() + ((int) jaVar.getTranslationY()));
            drawable.setAlpha((int) (this.t1 * 255.0f));
            drawable.draw(canvas);
        }
        if (this.J1) {
            canvas.restore();
            this.J1 = false;
        }
    }

    public void W0(Canvas canvas, View view) {
        int i7;
        this.J1 = false;
        if (this.p1) {
            return;
        }
        boolean z9 = this.G1;
        pj0 pj0Var = this.k1;
        if (z9) {
            int height = pj0Var.getHeight();
            for (int i10 = 0; i10 < pj0Var.getChildCount(); i10++) {
                View childAt = pj0Var.getChildAt(i10);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R != pj0Var.getAdapter().b() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.F1 ? (int) childAt.getTranslationY() : 0));
                }
            }
            i7 = height - org.telegram.messenger.g0.L(16.0f);
        } else {
            v4.d1 K = pj0Var.K(0);
            int i11 = -org.telegram.messenger.g0.L(16.0f);
            if (K != null) {
                View view2 = K.a;
                i11 = view2.getBottom() - org.telegram.messenger.g0.L(16.0f);
                if (this.F1) {
                    i7 = ((int) view2.getTranslationY()) + i11;
                }
            }
            i7 = i11;
        }
        int i12 = (i7 - ((this.y1 + this.z1) + this.A1)) + this.B1;
        if (this.u1 && this.v1) {
            i12 -= org.telegram.messenger.g0.L(this.N1 == 2 ? 8.0f : 16.0f);
        }
        float f10 = i12;
        this.K1 = f10;
        T0(f10);
        int i13 = this.N1;
        float f11 = 1.0f;
        ja jaVar = this.l1;
        if (i13 == 1) {
            float L = 1.0f - ((org.telegram.messenger.g0.L(16.0f) + i12) / N0());
            if (L < 0.0f) {
                L = 0.0f;
            }
            org.telegram.messenger.g0.Z3(jaVar, L != 0.0f, 1.0f, true, this.m1);
        } else if (i13 == 2) {
            float max = Math.max(((org.telegram.messenger.g0.L(8.0f) + (i12 - this.B1)) + this.z1) - org.telegram.messenger.g0.m, 0.0f);
            float e10 = this.E1.e(false, max == 0.0f ? 1.0f : 0.0f);
            if (e10 != 0.0f && e10 != 1.0f) {
                canvas.save();
                canvas.clipRect(0.0f, max, this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
                this.J1 = true;
            }
            this.t1 = e10;
            f11 = org.telegram.messenger.g0.T1(1.0f, 0.5f, e10);
            jaVar.e.setAlpha(e10);
            Q0(e10);
            jaVar.e.setScaleX(e10);
            jaVar.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            jaVar.e.setScaleY(e10);
            org.telegram.ui.ActionBar.k5 titleTextView = jaVar.getTitleTextView();
            titleTextView.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(21.0f) - titleTextView.getLeft(), 0.0f, e10) + 0);
            if (this.I1) {
                titleTextView.setTranslationX(((jaVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            jaVar.setTranslationY(max);
            i12 -= org.telegram.messenger.g0.W1(e10, 0, org.telegram.messenger.g0.L(13.0f) + (((this.x1 - this.y1) - this.z1) - this.A1));
            jaVar.getBackground().setBounds(0, org.telegram.messenger.g0.W1(e10, jaVar.getHeight(), 0), jaVar.getWidth(), jaVar.getHeight());
            if (e10 > 0.5f) {
                if (this.D1) {
                    this.D1 = false;
                    jaVar.setTag(1);
                }
            } else if (!this.D1) {
                this.D1 = true;
                jaVar.setTag(null);
            }
        }
        if (Z0()) {
            if (this instanceof wg.a0) {
                this.r0.setBounds(-org.telegram.messenger.g0.L(6.0f), i12, org.telegram.messenger.g0.L(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                this.r0.setBounds(0, i12, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            K0();
            this.r0.draw(canvas);
            if (this.u1 && f11 > 0.0f) {
                int L2 = org.telegram.messenger.g0.L(36.0f);
                int L3 = org.telegram.messenger.g0.L(20.0f) + i12;
                float measuredWidth = (view.getMeasuredWidth() - L2) / 2.0f;
                float f12 = L3;
                float measuredWidth2 = (view.getMeasuredWidth() + L2) / 2.0f;
                float L4 = org.telegram.messenger.g0.L(4.0f) + L3;
                RectF rectF = this.w1;
                rectF.set(measuredWidth, f12, measuredWidth2, L4);
                org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, this.I0));
                org.telegram.ui.ActionBar.k6.t0.setAlpha((int) (r15.getAlpha() * f11));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.t0);
            }
        }
        R0(canvas, i12);
    }

    public final void X0() {
        pj0 pj0Var = this.k1;
        if (pj0Var == null || this.j1 == null || pj0Var.getChildCount() <= 0) {
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
            this.L1 = i7;
            this.M1 = this.b.getTop() + view.getTop();
            this.e1 = System.currentTimeMillis() + 80;
        }
    }

    public final void Y0() {
        if (this.p1) {
            return;
        }
        this.N1 = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.y1 = currentActionBarHeight;
        this.x1 = currentActionBarHeight + org.telegram.messenger.g0.m;
        this.z1 = org.telegram.messenger.g0.L(16.0f);
        this.A1 = org.telegram.messenger.g0.L(-20.0f);
        this.E1 = new w5(this.b, 0L, 350L, xq.h);
        this.l1.e.setPivotX(0.0f);
        this.k1.setClipToPadding(true);
    }

    public boolean Z0() {
        return true;
    }

    public final void a1() {
        if (this.f1 != null) {
            LaunchActivity.G1.F(true, true, true);
            return;
        }
        ja jaVar = this.l1;
        if (jaVar != null && jaVar.getTag() != null) {
            org.telegram.messenger.g0.q3(this, P0());
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.o1;
        if (f2Var != null) {
            org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
        }
    }

    public final void b1() {
        ja jaVar = this.l1;
        if (jaVar != null) {
            jaVar.setTitle(O0());
        }
    }

    public final void c1() {
        ja jaVar = this.l1;
        if (jaVar == null || TextUtils.equals(O0(), jaVar.getTitle())) {
            return;
        }
        jaVar.K(O0(), false, 350L, xq.h);
    }

    @Override // org.telegram.ui.ActionBar.v2, org.telegram.ui.ActionBar.b2
    public final boolean f() {
        ja jaVar = this.l1;
        if (jaVar != null && jaVar.getTag() != null) {
            return P0();
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.o1;
        return f2Var != null ? f2Var.isLightStatusBar() : P0();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public void h0() {
        T0(this.K1);
        K0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public na(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(r0, f2Var, new ma(r1));
        Activity parentActivity = f2Var.getParentActivity();
        ma maVar = new ma();
        maVar.a = z9;
        maVar.c = false;
        maVar.d = z10;
        maVar.g = f6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public na(Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f2Var, new ma(r0));
        ma maVar = new ma();
        maVar.a = z9;
        maVar.c = z10;
        maVar.d = false;
        maVar.g = f6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public na(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        this(context, (org.telegram.ui.ActionBar.f2) null, new ma(r0));
        ma maVar = new ma();
        maVar.a = z9;
        maVar.c = false;
        maVar.d = false;
        maVar.f = i7;
        maVar.g = f6Var;
    }

    public void Q0(float f10) {
    }

    public void T0(float f10) {
    }

    public void U0(rt0 rt0Var) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public na(Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f2Var, new ma(r0));
        ma maVar = new ma();
        maVar.a = z9;
        maVar.c = false;
        maVar.d = false;
        maVar.e = z10;
        maVar.f = i7;
        maVar.g = f6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public na(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        this(context, (org.telegram.ui.ActionBar.f2) null, new ma(r0));
        ma maVar = new ma();
        maVar.a = z9;
        maVar.b = 2;
        maVar.c = false;
        maVar.d = false;
        maVar.e = false;
        maVar.f = 2;
        maVar.g = f6Var;
    }

    public na(Context context, org.telegram.ui.ActionBar.f2 f2Var, ma maVar) {
        super(maVar.b, context, maVar.g, maVar.a);
        rt0 rt0Var;
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
        boolean z9 = maVar.c;
        boolean z10 = maVar.d;
        boolean z11 = maVar.e;
        int i7 = maVar.f;
        this.o1 = f2Var;
        this.p1 = z9;
        this.i1 = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z10) {
            ha haVar = new ha(this, context, z11, z9);
            this.q1 = haVar;
            rt0Var = haVar;
        } else {
            rt0Var = new ia(this, context, z11, z9);
        }
        pj0 M0 = M0(context);
        this.k1 = M0;
        jg.b0 b0Var = new jg.b0(6);
        this.j1 = b0Var;
        if (z11) {
            b0Var.l1(true);
        }
        M0.setLayoutManager(b0Var);
        ha haVar2 = this.q1;
        if (haVar2 != null) {
            haVar2.setBottomSheetContainerView(this.c);
            this.q1.setTargetListView(M0);
        }
        if (z9) {
            M0.setHasFixedSize(true);
            M0.setAdapter(L0(M0));
            this.N = rt0Var;
            rt0Var.addView(M0, c8.ha.c(-2.0f, -1));
        } else {
            M0.setAdapter(new la(this, L0(M0), context));
            this.b = rt0Var;
            ja jaVar = new ja(this, context, rt0Var);
            this.l1 = jaVar;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, jaVar, this.I0);
            org.telegram.ui.ActionBar.r6.m(jaVar, 5, org.telegram.ui.ActionBar.k6.G6, this.I0);
            org.telegram.ui.ActionBar.r6.m(jaVar, 3, org.telegram.ui.ActionBar.k6.z8, this.I0);
            jaVar.setBackButtonImage(R.drawable.ic_ab_back);
            org.telegram.ui.ActionBar.r6.m(jaVar, 1, org.telegram.ui.ActionBar.k6.y8, this.I0);
            jaVar.setCastShadows(true);
            jaVar.setTitle(O0());
            jaVar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 11));
            rt0Var.addView(M0);
            rt0Var.addView(jaVar, c8.ha.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            M0.j(new ai.b(rt0Var, 27));
        }
        if (i7 == 2) {
            Y0();
        }
        U0(rt0Var);
        a1();
    }

    public void R0(Canvas canvas, int i7) {
    }

    public void S0(int i7, int i10) {
    }
}
