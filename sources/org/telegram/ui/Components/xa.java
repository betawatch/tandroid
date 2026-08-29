package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class xa extends org.telegram.ui.ActionBar.f3 {
    public boolean A;
    public final RectF B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public d6 J;
    public boolean K;
    public au L;
    public boolean M;
    public boolean N;
    public boolean O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public final Drawable b;
    public final org.telegram.ui.k c;
    public final jl0 d;
    public final ua e;
    public boolean f;
    public int h;
    public final org.telegram.ui.ActionBar.o2 n;
    public final boolean r;
    public final sa s;
    public float v;
    public boolean w;
    public float x;
    public boolean y;

    public xa(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        this(o2Var, z10, false, o2Var == null ? null : o2Var.getResourceProvider());
    }

    public final boolean A() {
        return i0.a.f(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, this.resourcesProvider)) > 0.699999988079071d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(Canvas canvas, FrameLayout frameLayout) {
        int i10 = this.S;
        Drawable drawable = this.b;
        ua uaVar = this.e;
        if (i10 == 1) {
            boolean z10 = this.w;
            if (z10) {
                float f9 = this.x;
                if (f9 != 1.0f) {
                    this.x = f9 + 0.10666667f;
                    frameLayout.invalidate();
                    this.x = Utilities.clamp(this.x, 1.0f, 0.0f);
                    if (uaVar != null && uaVar.getVisibility() == 0 && uaVar.getAlpha() != 0.0f && this.x != 0.0f) {
                        drawable.setBounds(this.backgroundPaddingLeft, uaVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + uaVar.getBottom());
                        drawable.setAlpha((int) (uaVar.getAlpha() * 255.0f * this.x));
                        drawable.draw(canvas);
                        if (drawable.getAlpha() < 255) {
                            frameLayout.invalidate();
                        }
                    }
                    this.f = true;
                }
            }
            if (!z10) {
                float f10 = this.x;
                if (f10 != 0.0f) {
                    this.x = f10 - 0.10666667f;
                    frameLayout.invalidate();
                }
            }
            this.x = Utilities.clamp(this.x, 1.0f, 0.0f);
            if (uaVar != null) {
                drawable.setBounds(this.backgroundPaddingLeft, uaVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + uaVar.getBottom());
                drawable.setAlpha((int) (uaVar.getAlpha() * 255.0f * this.x));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                }
            }
            this.f = true;
        } else if (i10 == 2 && ((int) (this.x * 255.0f)) != 0 && this.w) {
            drawable.setBounds(this.backgroundPaddingLeft, uaVar.getBottom() + ((int) uaVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + uaVar.getBottom() + ((int) uaVar.getTranslationY()));
            drawable.setAlpha((int) (this.x * 255.0f));
            drawable.draw(canvas);
        }
        if (this.O) {
            canvas.restore();
            this.O = false;
        }
    }

    public void H(Canvas canvas, View view) {
        int i10;
        this.O = false;
        if (this.r) {
            return;
        }
        boolean z10 = this.M;
        jl0 jl0Var = this.d;
        if (z10) {
            int height = jl0Var.getHeight();
            for (int i11 = 0; i11 < jl0Var.getChildCount(); i11++) {
                View childAt = jl0Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R != jl0Var.getAdapter().h() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.K ? (int) childAt.getTranslationY() : 0));
                }
            }
            i10 = height - AndroidUtilities.dp(16.0f);
        } else {
            f2.n1 K = jl0Var.K(0);
            int i12 = -AndroidUtilities.dp(16.0f);
            if (K != null) {
                View view2 = K.a;
                i12 = view2.getBottom() - AndroidUtilities.dp(16.0f);
                if (this.K) {
                    i10 = ((int) view2.getTranslationY()) + i12;
                }
            }
            i10 = i12;
        }
        int i13 = (i10 - ((this.D + this.E) + this.F)) + this.G;
        if (this.y && this.A) {
            i13 -= AndroidUtilities.dp(this.S == 2 ? 8.0f : 16.0f);
        }
        float f9 = i13;
        this.P = f9;
        E(f9);
        int i14 = this.S;
        float f10 = 1.0f;
        ua uaVar = this.e;
        if (i14 == 1) {
            float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i13) / x());
            if (dp < 0.0f) {
                dp = 0.0f;
            }
            AndroidUtilities.updateViewVisibilityAnimated(uaVar, dp != 0.0f, 1.0f, this.f);
        } else if (i14 == 2) {
            float max = Math.max(((AndroidUtilities.dp(8.0f) + (i13 - this.G)) + this.E) - AndroidUtilities.statusBarHeight, 0.0f);
            float d = this.J.d(max == 0.0f ? 1.0f : 0.0f, false);
            if (d != 0.0f && d != 1.0f) {
                canvas.save();
                canvas.clipRect(0.0f, max, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                this.O = true;
            }
            this.x = d;
            f10 = AndroidUtilities.lerp(1.0f, 0.5f, d);
            uaVar.e.setAlpha(d);
            B(d);
            uaVar.e.setScaleX(d);
            uaVar.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            uaVar.e.setScaleY(d);
            org.telegram.ui.ActionBar.h5 titleTextView = uaVar.getTitleTextView();
            titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
            if (this.N) {
                titleTextView.setTranslationX(((uaVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            uaVar.setTranslationY(max);
            i13 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.C - this.D) - this.E) - this.F), d);
            uaVar.getBackground().setBounds(0, AndroidUtilities.lerp(uaVar.getHeight(), 0, d), uaVar.getWidth(), uaVar.getHeight());
            if (d > 0.5f) {
                if (this.I) {
                    this.I = false;
                    uaVar.setTag(1);
                }
            } else if (!this.I) {
                this.I = true;
                uaVar.setTag(null);
            }
        }
        if (K()) {
            if (this instanceof eg.c1) {
                this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                this.shadowDrawable.setBounds(0, i13, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            u();
            this.shadowDrawable.draw(canvas);
            if (this.y && f10 > 0.0f) {
                int dp2 = AndroidUtilities.dp(36.0f);
                int dp3 = AndroidUtilities.dp(20.0f) + i13;
                float measuredWidth = (view.getMeasuredWidth() - dp2) / 2.0f;
                float f11 = dp3;
                float measuredWidth2 = (view.getMeasuredWidth() + dp2) / 2.0f;
                float dp4 = AndroidUtilities.dp(4.0f) + dp3;
                RectF rectF = this.B;
                rectF.set(measuredWidth, f11, measuredWidth2, dp4);
                org.telegram.ui.ActionBar.g6.t0.setColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
                org.telegram.ui.ActionBar.g6.t0.setAlpha((int) (r15.getAlpha() * f10));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.t0);
            }
        }
        C(canvas, i13);
    }

    public final void I() {
        jl0 jl0Var = this.d;
        if (jl0Var == null || this.c == null || jl0Var.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i10 = -1;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i12 = 0; i12 < jl0Var.getChildCount(); i12++) {
            View childAt = jl0Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && childAt.getTop() < i11) {
                i11 = childAt.getTop();
                view = childAt;
                i10 = R;
            }
        }
        if (view != null) {
            this.Q = i10;
            this.R = this.containerView.getTop() + view.getTop();
            smoothContainerViewLayout();
        }
    }

    public final void J() {
        if (this.r) {
            return;
        }
        this.S = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.D = currentActionBarHeight;
        this.C = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.E = AndroidUtilities.dp(16.0f);
        this.F = AndroidUtilities.dp(-20.0f);
        this.J = new d6(this.containerView, 0L, 350L, jr.h);
        this.e.e.setPivotX(0.0f);
        this.d.setClipToPadding(true);
    }

    public boolean K() {
        return true;
    }

    public final void L() {
        if (this.attachedFragment != null) {
            LaunchActivity.C1.H(true, true, true);
            return;
        }
        ua uaVar = this.e;
        if (uaVar != null && uaVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, A());
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.n;
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
    }

    public final void M() {
        ua uaVar = this.e;
        if (uaVar != null) {
            uaVar.setTitle(y());
        }
    }

    public final void O() {
        ua uaVar = this.e;
        if (uaVar == null || TextUtils.equals(y(), uaVar.getTitle())) {
            return;
        }
        uaVar.I(y(), false, 350L, jr.h);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.k2
    public final boolean isAttachedLightStatusBar() {
        ua uaVar = this.e;
        if (uaVar != null && uaVar.getTag() != null) {
            return A();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.n;
        return o2Var != null ? o2Var.isLightStatusBar() : A();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public void onContainerViewTranslation() {
        E(this.P);
        u();
    }

    public final void s() {
        jl0 jl0Var = this.d;
        if (jl0Var == null || jl0Var.getLayoutManager() == null || this.Q < 0) {
            return;
        }
        int top = (this.R - this.containerView.getTop()) - jl0Var.getPaddingTop();
        if (jl0Var.getLayoutManager() instanceof f2.j0) {
            ((f2.j0) jl0Var.getLayoutManager()).h1(this.Q, top);
        }
        this.Q = -1;
    }

    public boolean t(View view, float f9, float f10) {
        return true;
    }

    public final void u() {
        if (this.backDrawable == null || this.containerView == null || this.shadowDrawable == null || !K() || this.r) {
            return;
        }
        Rect bounds = this.shadowDrawable.getBounds();
        if (this.containerView.getMeasuredWidth() >= this.container.getMeasuredWidth()) {
            this.backDrawable.a(((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY()));
        } else {
            this.backDrawable.a(0);
        }
    }

    public abstract il0 v(jl0 jl0Var);

    public jl0 w(Context context) {
        return new jh.e1(this, context, this.resourcesProvider, 9);
    }

    public int x() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence y();

    public xa(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        this(o2Var.getParentActivity(), o2Var, false, z10, z11, 1, c6Var);
    }

    public xa(org.telegram.ui.ActionBar.o2 o2Var) {
        this(o2Var.getParentActivity(), o2Var, false, false, false, 2, o2Var.getResourceProvider());
    }

    public xa(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, o2Var, z10, false, z11, z12, false, i10, c6Var);
    }

    public xa(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, z10, z11);
        hv0 hv0Var;
        this.v = 0.4f;
        this.w = true;
        this.x = 1.0f;
        this.y = false;
        this.B = new RectF();
        this.S = 1;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = true;
        this.I = false;
        this.K = false;
        this.Q = -1;
        this.n = o2Var;
        this.r = z12;
        this.b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z13) {
            sa saVar = new sa(this, context, z14, z12);
            this.s = saVar;
            hv0Var = saVar;
        } else {
            hv0Var = new ta(this, context, z14, z12);
        }
        jl0 w10 = w(context);
        this.d = w10;
        org.telegram.ui.k kVar = new org.telegram.ui.k(4);
        this.c = kVar;
        if (z14) {
            kVar.l1(true);
        }
        w10.setLayoutManager(kVar);
        sa saVar2 = this.s;
        if (saVar2 != null) {
            saVar2.setBottomSheetContainerView(getContainer());
            this.s.setTargetListView(w10);
        }
        if (z12) {
            w10.setHasFixedSize(true);
            w10.setAdapter(v(w10));
            setCustomView(hv0Var);
            hv0Var.addView(w10, i7.f6.c(-2.0f, -1));
        } else {
            w10.setAdapter(new wa(this, v(w10), context));
            this.containerView = hv0Var;
            ua uaVar = new ua(this, context, hv0Var);
            this.e = uaVar;
            uaVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.h5));
            uaVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
            uaVar.B(getThemedColor(org.telegram.ui.ActionBar.g6.z8), false);
            uaVar.setBackButtonImage(R.drawable.ic_ab_back);
            uaVar.C(getThemedColor(org.telegram.ui.ActionBar.g6.y8), false);
            uaVar.setCastShadows(true);
            uaVar.setTitle(y());
            uaVar.setActionBarMenuOnItemClick(new cg.n1(this, 24));
            hv0Var.addView(w10);
            hv0Var.addView(uaVar, i7.f6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            w10.j(new cg.g2(hv0Var, 18));
        }
        if (i10 == 2) {
            J();
        }
        F(hv0Var);
        L();
    }

    public void B(float f9) {
    }

    public void E(float f9) {
    }

    public void F(hv0 hv0Var) {
    }

    public void C(Canvas canvas, int i10) {
    }

    public void D(int i10, int i11) {
    }
}
