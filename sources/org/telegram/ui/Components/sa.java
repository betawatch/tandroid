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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class sa extends org.telegram.ui.ActionBar.f3 {
    public boolean A;
    public final RectF B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public y5 J;
    public boolean K;
    public ut L;
    public boolean M;
    public boolean N;
    public boolean O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public final Drawable b;
    public final of.y c;
    public final wk0 d;
    public final pa e;
    public boolean f;
    public int h;
    public final org.telegram.ui.ActionBar.o2 n;
    public final boolean r;
    public final na s;
    public float v;
    public boolean w;
    public float x;
    public boolean y;

    public sa(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        this(o2Var, z10, false, o2Var == null ? null : o2Var.getResourceProvider());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(Canvas canvas, FrameLayout frameLayout) {
        int i9 = this.S;
        Drawable drawable = this.b;
        pa paVar = this.e;
        if (i9 == 1) {
            boolean z10 = this.w;
            if (z10) {
                float f10 = this.x;
                if (f10 != 1.0f) {
                    this.x = f10 + 0.10666667f;
                    frameLayout.invalidate();
                    this.x = Utilities.clamp(this.x, 1.0f, 0.0f);
                    if (paVar != null && paVar.getVisibility() == 0 && paVar.getAlpha() != 0.0f && this.x != 0.0f) {
                        drawable.setBounds(this.backgroundPaddingLeft, paVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + paVar.getBottom());
                        drawable.setAlpha((int) (paVar.getAlpha() * 255.0f * this.x));
                        drawable.draw(canvas);
                        if (drawable.getAlpha() < 255) {
                            frameLayout.invalidate();
                        }
                    }
                    this.f = true;
                }
            }
            if (!z10) {
                float f11 = this.x;
                if (f11 != 0.0f) {
                    this.x = f11 - 0.10666667f;
                    frameLayout.invalidate();
                }
            }
            this.x = Utilities.clamp(this.x, 1.0f, 0.0f);
            if (paVar != null) {
                drawable.setBounds(this.backgroundPaddingLeft, paVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + paVar.getBottom());
                drawable.setAlpha((int) (paVar.getAlpha() * 255.0f * this.x));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                }
            }
            this.f = true;
        } else if (i9 == 2 && ((int) (this.x * 255.0f)) != 0 && this.w) {
            drawable.setBounds(this.backgroundPaddingLeft, paVar.getBottom() + ((int) paVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + paVar.getBottom() + ((int) paVar.getTranslationY()));
            drawable.setAlpha((int) (this.x * 255.0f));
            drawable.draw(canvas);
        }
        if (this.O) {
            canvas.restore();
            this.O = false;
        }
    }

    public void H(Canvas canvas, View view) {
        int i9;
        this.O = false;
        if (this.r) {
            return;
        }
        boolean z10 = this.M;
        wk0 wk0Var = this.d;
        if (z10) {
            int height = wk0Var.getHeight();
            for (int i10 = 0; i10 < wk0Var.getChildCount(); i10++) {
                View childAt = wk0Var.getChildAt(i10);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R != wk0Var.getAdapter().h() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.K ? (int) childAt.getTranslationY() : 0));
                }
            }
            i9 = height - AndroidUtilities.dp(16.0f);
        } else {
            f2.q1 K = wk0Var.K(0);
            int i11 = -AndroidUtilities.dp(16.0f);
            if (K != null) {
                View view2 = K.a;
                i11 = view2.getBottom() - AndroidUtilities.dp(16.0f);
                if (this.K) {
                    i9 = ((int) view2.getTranslationY()) + i11;
                }
            }
            i9 = i11;
        }
        int i12 = (i9 - ((this.D + this.E) + this.F)) + this.G;
        if (this.y && this.A) {
            i12 -= AndroidUtilities.dp(this.S == 2 ? 8.0f : 16.0f);
        }
        float f10 = i12;
        this.P = f10;
        E(f10);
        int i13 = this.S;
        float f11 = 1.0f;
        pa paVar = this.e;
        if (i13 == 1) {
            float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i12) / x());
            if (dp < 0.0f) {
                dp = 0.0f;
            }
            AndroidUtilities.updateViewVisibilityAnimated(paVar, dp != 0.0f, 1.0f, this.f);
        } else if (i13 == 2) {
            float max = Math.max(((AndroidUtilities.dp(8.0f) + (i12 - this.G)) + this.E) - AndroidUtilities.statusBarHeight, 0.0f);
            float d = this.J.d(max == 0.0f ? 1.0f : 0.0f, false);
            if (d != 0.0f && d != 1.0f) {
                canvas.save();
                canvas.clipRect(0.0f, max, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                this.O = true;
            }
            this.x = d;
            f11 = AndroidUtilities.lerp(1.0f, 0.5f, d);
            paVar.e.setAlpha(d);
            A(d);
            paVar.e.setScaleX(d);
            paVar.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            paVar.e.setScaleY(d);
            org.telegram.ui.ActionBar.h5 titleTextView = paVar.getTitleTextView();
            titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
            if (this.N) {
                titleTextView.setTranslationX(((paVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            paVar.setTranslationY(max);
            i12 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.C - this.D) - this.E) - this.F), d);
            paVar.getBackground().setBounds(0, AndroidUtilities.lerp(paVar.getHeight(), 0, d), paVar.getWidth(), paVar.getHeight());
            if (d > 0.5f) {
                if (this.I) {
                    this.I = false;
                    paVar.setTag(1);
                }
            } else if (!this.I) {
                this.I = true;
                paVar.setTag(null);
            }
        }
        if (K()) {
            if (this instanceof bg.h1) {
                this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), i12, AndroidUtilities.dp(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                this.shadowDrawable.setBounds(0, i12, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            u();
            this.shadowDrawable.draw(canvas);
            if (this.y && f11 > 0.0f) {
                int dp2 = AndroidUtilities.dp(36.0f);
                int dp3 = AndroidUtilities.dp(20.0f) + i12;
                float measuredWidth = (view.getMeasuredWidth() - dp2) / 2.0f;
                float f12 = dp3;
                float measuredWidth2 = (view.getMeasuredWidth() + dp2) / 2.0f;
                float dp4 = AndroidUtilities.dp(4.0f) + dp3;
                RectF rectF = this.B;
                rectF.set(measuredWidth, f12, measuredWidth2, dp4);
                org.telegram.ui.ActionBar.f6.t0.setColor(getThemedColor(org.telegram.ui.ActionBar.f6.Ii));
                org.telegram.ui.ActionBar.f6.t0.setAlpha((int) (r15.getAlpha() * f11));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.t0);
            }
        }
        C(canvas, i12);
    }

    public final void I() {
        wk0 wk0Var = this.d;
        if (wk0Var == null || this.c == null || wk0Var.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i9 = -1;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < wk0Var.getChildCount(); i11++) {
            View childAt = wk0Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && childAt.getTop() < i10) {
                i10 = childAt.getTop();
                view = childAt;
                i9 = R;
            }
        }
        if (view != null) {
            this.Q = i9;
            this.R = this.containerView.getTop() + view.getTop();
            smoothContainerViewLayout();
        }
    }

    public final void J() {
        if (this.r) {
            return;
        }
        this.S = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.D = currentActionBarHeight;
        this.C = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.E = AndroidUtilities.dp(16.0f);
        this.F = AndroidUtilities.dp(-20.0f);
        this.J = new y5(this.containerView, 0L, 350L, gr.h);
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
        pa paVar = this.e;
        if (paVar != null && paVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, z());
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.n;
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
    }

    public final void M() {
        pa paVar = this.e;
        if (paVar != null) {
            paVar.setTitle(y());
        }
    }

    public final void N() {
        pa paVar = this.e;
        if (paVar == null || TextUtils.equals(y(), paVar.getTitle())) {
            return;
        }
        paVar.I(y(), false, 350L, gr.h);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.k2
    public final boolean isAttachedLightStatusBar() {
        pa paVar = this.e;
        if (paVar != null && paVar.getTag() != null) {
            return z();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.n;
        return o2Var != null ? o2Var.isLightStatusBar() : z();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public void onContainerViewTranslation() {
        E(this.P);
        u();
    }

    public final void s() {
        wk0 wk0Var = this.d;
        if (wk0Var == null || wk0Var.getLayoutManager() == null || this.Q < 0) {
            return;
        }
        int top = (this.R - this.containerView.getTop()) - wk0Var.getPaddingTop();
        if (wk0Var.getLayoutManager() instanceof f2.m0) {
            ((f2.m0) wk0Var.getLayoutManager()).h1(this.Q, top);
        }
        this.Q = -1;
    }

    public boolean t(View view, float f10, float f11) {
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

    public abstract vk0 v(wk0 wk0Var);

    public wk0 w(Context context) {
        return new gh.f1(this, context, this.resourcesProvider, 10);
    }

    public int x() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence y();

    public final boolean z() {
        return i0.a.f(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, this.resourcesProvider)) > 0.699999988079071d;
    }

    public sa(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.b6 b6Var) {
        this(o2Var.getParentActivity(), o2Var, false, z10, z11, 1, b6Var);
    }

    public sa(org.telegram.ui.ActionBar.o2 o2Var) {
        this(o2Var.getParentActivity(), o2Var, false, false, false, 2, o2Var.getResourceProvider());
    }

    public sa(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, o2Var, z10, false, z11, z12, false, i9, b6Var);
    }

    public sa(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, z10, z11);
        xu0 xu0Var;
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
            na naVar = new na(this, context, z14, z12);
            this.s = naVar;
            xu0Var = naVar;
        } else {
            xu0Var = new oa(this, context, z14, z12);
        }
        wk0 w8 = w(context);
        this.d = w8;
        of.y yVar = new of.y(5);
        this.c = yVar;
        if (z14) {
            yVar.l1(true);
        }
        w8.setLayoutManager(yVar);
        na naVar2 = this.s;
        if (naVar2 != null) {
            naVar2.setBottomSheetContainerView(getContainer());
            this.s.setTargetListView(w8);
        }
        if (z12) {
            w8.setHasFixedSize(true);
            w8.setAdapter(v(w8));
            setCustomView(xu0Var);
            xu0Var.addView(w8, g7.e6.c(-2.0f, -1));
        } else {
            w8.setAdapter(new ra(this, v(w8), context));
            this.containerView = xu0Var;
            pa paVar = new pa(this, context, xu0Var);
            this.e = paVar;
            paVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.h5));
            paVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.f6.G6));
            paVar.A(getThemedColor(org.telegram.ui.ActionBar.f6.z8), false);
            paVar.setBackButtonImage(R.drawable.ic_ab_back);
            paVar.C(getThemedColor(org.telegram.ui.ActionBar.f6.y8), false);
            paVar.setCastShadows(true);
            paVar.setTitle(y());
            paVar.setActionBarMenuOnItemClick(new org.telegram.ui.tq(this, 2));
            xu0Var.addView(w8);
            xu0Var.addView(paVar, g7.e6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            w8.j(new bg.o2(xu0Var, 22));
        }
        if (i9 == 2) {
            J();
        }
        F(xu0Var);
        L();
    }

    public void A(float f10) {
    }

    public void E(float f10) {
    }

    public void F(xu0 xu0Var) {
    }

    public void C(Canvas canvas, int i9) {
    }

    public void D(int i9, int i10) {
    }
}
