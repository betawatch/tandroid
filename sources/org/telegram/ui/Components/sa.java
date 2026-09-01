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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class sa extends org.telegram.ui.ActionBar.h3 {
    public boolean B;
    public final RectF C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public z5 K;
    public boolean L;
    public fu M;
    public boolean N;
    public boolean O;
    public boolean P;
    public float Q;
    public int R;
    public int S;
    public int T;
    public final Drawable b;
    public final org.telegram.ui.k c;
    public final tl0 d;
    public final pa e;
    public boolean f;
    public int h;
    public final org.telegram.ui.ActionBar.p2 n;
    public final boolean r;
    public final na s;
    public float v;
    public boolean w;
    public float x;
    public boolean y;

    public sa(org.telegram.ui.ActionBar.p2 p2Var, boolean z4) {
        this(p2Var, z4, false, p2Var == null ? null : p2Var.getResourceProvider());
    }

    public final boolean A() {
        return i0.a.f(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, this.resourcesProvider)) > 0.699999988079071d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(Canvas canvas, FrameLayout frameLayout) {
        int i10 = this.T;
        Drawable drawable = this.b;
        pa paVar = this.e;
        if (i10 == 1) {
            boolean z4 = this.w;
            if (z4) {
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
            if (!z4) {
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
        } else if (i10 == 2 && ((int) (this.x * 255.0f)) != 0 && this.w) {
            drawable.setBounds(this.backgroundPaddingLeft, paVar.getBottom() + ((int) paVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + paVar.getBottom() + ((int) paVar.getTranslationY()));
            drawable.setAlpha((int) (this.x * 255.0f));
            drawable.draw(canvas);
        }
        if (this.P) {
            canvas.restore();
            this.P = false;
        }
    }

    public void H(Canvas canvas, View view) {
        int i10;
        this.P = false;
        if (this.r) {
            return;
        }
        boolean z4 = this.N;
        tl0 tl0Var = this.d;
        if (z4) {
            int height = tl0Var.getHeight();
            for (int i11 = 0; i11 < tl0Var.getChildCount(); i11++) {
                View childAt = tl0Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R != tl0Var.getAdapter().h() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.L ? (int) childAt.getTranslationY() : 0));
                }
            }
            i10 = height - AndroidUtilities.dp(16.0f);
        } else {
            f2.m1 K = tl0Var.K(0);
            int i12 = -AndroidUtilities.dp(16.0f);
            if (K != null) {
                View view2 = K.a;
                i12 = view2.getBottom() - AndroidUtilities.dp(16.0f);
                if (this.L) {
                    i10 = ((int) view2.getTranslationY()) + i12;
                }
            }
            i10 = i12;
        }
        int i13 = (i10 - ((this.E + this.F) + this.G)) + this.H;
        if (this.y && this.B) {
            i13 -= AndroidUtilities.dp(this.T == 2 ? 8.0f : 16.0f);
        }
        float f10 = i13;
        this.Q = f10;
        E(f10);
        int i14 = this.T;
        float f11 = 1.0f;
        pa paVar = this.e;
        if (i14 == 1) {
            float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i13) / x());
            if (dp < 0.0f) {
                dp = 0.0f;
            }
            AndroidUtilities.updateViewVisibilityAnimated(paVar, dp != 0.0f, 1.0f, this.f);
        } else if (i14 == 2) {
            float max = Math.max(((AndroidUtilities.dp(8.0f) + (i13 - this.H)) + this.F) - AndroidUtilities.statusBarHeight, 0.0f);
            float d = this.K.d(max == 0.0f ? 1.0f : 0.0f, false);
            if (d != 0.0f && d != 1.0f) {
                canvas.save();
                canvas.clipRect(0.0f, max, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                this.P = true;
            }
            this.x = d;
            f11 = AndroidUtilities.lerp(1.0f, 0.5f, d);
            paVar.e.setAlpha(d);
            B(d);
            paVar.e.setScaleX(d);
            paVar.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            paVar.e.setScaleY(d);
            org.telegram.ui.ActionBar.l5 titleTextView = paVar.getTitleTextView();
            titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
            if (this.O) {
                titleTextView.setTranslationX(((paVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            paVar.setTranslationY(max);
            i13 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.D - this.E) - this.F) - this.G), d);
            paVar.getBackground().setBounds(0, AndroidUtilities.lerp(paVar.getHeight(), 0, d), paVar.getWidth(), paVar.getHeight());
            if (d > 0.5f) {
                if (this.J) {
                    this.J = false;
                    paVar.setTag(1);
                }
            } else if (!this.J) {
                this.J = true;
                paVar.setTag(null);
            }
        }
        if (K()) {
            if (this instanceof hg.b1) {
                this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                this.shadowDrawable.setBounds(0, i13, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            u();
            this.shadowDrawable.draw(canvas);
            if (this.y && f11 > 0.0f) {
                int dp2 = AndroidUtilities.dp(36.0f);
                int dp3 = AndroidUtilities.dp(20.0f) + i13;
                float measuredWidth = (view.getMeasuredWidth() - dp2) / 2.0f;
                float f12 = dp3;
                float measuredWidth2 = (view.getMeasuredWidth() + dp2) / 2.0f;
                float dp4 = AndroidUtilities.dp(4.0f) + dp3;
                RectF rectF = this.C;
                rectF.set(measuredWidth, f12, measuredWidth2, dp4);
                org.telegram.ui.ActionBar.k6.t0.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ii));
                org.telegram.ui.ActionBar.k6.t0.setAlpha((int) (r15.getAlpha() * f11));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.t0);
            }
        }
        C(canvas, i13);
    }

    public final void I() {
        tl0 tl0Var = this.d;
        if (tl0Var == null || this.c == null || tl0Var.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i10 = -1;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i12 = 0; i12 < tl0Var.getChildCount(); i12++) {
            View childAt = tl0Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && childAt.getTop() < i11) {
                i11 = childAt.getTop();
                view = childAt;
                i10 = R;
            }
        }
        if (view != null) {
            this.R = i10;
            this.S = this.containerView.getTop() + view.getTop();
            smoothContainerViewLayout();
        }
    }

    public final void J() {
        if (this.r) {
            return;
        }
        this.T = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.E = currentActionBarHeight;
        this.D = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.F = AndroidUtilities.dp(16.0f);
        this.G = AndroidUtilities.dp(-20.0f);
        this.K = new z5(this.containerView, 0L, 350L, pr.h);
        this.e.e.setPivotX(0.0f);
        this.d.setClipToPadding(true);
    }

    public boolean K() {
        return true;
    }

    public final void M() {
        if (this.attachedFragment != null) {
            LaunchActivity.D1.H(true, true, true);
            return;
        }
        pa paVar = this.e;
        if (paVar != null && paVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, A());
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.n;
        if (p2Var != null) {
            AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        }
    }

    public final void N() {
        pa paVar = this.e;
        if (paVar != null) {
            paVar.setTitle(y());
        }
    }

    public final void O() {
        pa paVar = this.e;
        if (paVar == null || TextUtils.equals(y(), paVar.getTitle())) {
            return;
        }
        paVar.I(y(), false, 350L, pr.h);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3, org.telegram.ui.ActionBar.l2
    public final boolean isAttachedLightStatusBar() {
        pa paVar = this.e;
        if (paVar != null && paVar.getTag() != null) {
            return A();
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.n;
        return p2Var != null ? p2Var.isLightStatusBar() : A();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public void onContainerViewTranslation() {
        E(this.Q);
        u();
    }

    public final void s() {
        tl0 tl0Var = this.d;
        if (tl0Var == null || tl0Var.getLayoutManager() == null || this.R < 0) {
            return;
        }
        int top = (this.S - this.containerView.getTop()) - tl0Var.getPaddingTop();
        if (tl0Var.getLayoutManager() instanceof f2.j0) {
            ((f2.j0) tl0Var.getLayoutManager()).h1(this.R, top);
        }
        this.R = -1;
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

    public abstract sl0 v(tl0 tl0Var);

    public tl0 w(Context context) {
        return new mh.d1(this, context, this.resourcesProvider, 8);
    }

    public int x() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence y();

    public sa(org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        this(p2Var.getParentActivity(), p2Var, false, z4, z10, 1, g6Var);
    }

    public sa(org.telegram.ui.ActionBar.p2 p2Var) {
        this(p2Var.getParentActivity(), p2Var, false, false, false, 2, p2Var.getResourceProvider());
    }

    public sa(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, p2Var, z4, false, z10, z11, false, i10, g6Var);
    }

    public sa(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10, boolean z11, boolean z12, boolean z13, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, z4, z10);
        qv0 qv0Var;
        this.v = 0.4f;
        this.w = true;
        this.x = 1.0f;
        this.y = false;
        this.C = new RectF();
        this.T = 1;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = true;
        this.J = false;
        this.L = false;
        this.R = -1;
        this.n = p2Var;
        this.r = z11;
        this.b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z12) {
            na naVar = new na(this, context, z13, z11);
            this.s = naVar;
            qv0Var = naVar;
        } else {
            qv0Var = new oa(this, context, z13, z11);
        }
        tl0 w10 = w(context);
        this.d = w10;
        org.telegram.ui.k kVar = new org.telegram.ui.k(4);
        this.c = kVar;
        if (z13) {
            kVar.l1(true);
        }
        w10.setLayoutManager(kVar);
        na naVar2 = this.s;
        if (naVar2 != null) {
            naVar2.setBottomSheetContainerView(getContainer());
            this.s.setTargetListView(w10);
        }
        if (z11) {
            w10.setHasFixedSize(true);
            w10.setAdapter(v(w10));
            setCustomView(qv0Var);
            qv0Var.addView(w10, k7.c6.c(-2.0f, -1));
        } else {
            w10.setAdapter(new ra(this, v(w10), context));
            this.containerView = qv0Var;
            pa paVar = new pa(this, context, qv0Var);
            this.e = paVar;
            paVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.h5));
            paVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.k6.G6));
            paVar.B(getThemedColor(org.telegram.ui.ActionBar.k6.z8), false);
            paVar.setBackButtonImage(R.drawable.ic_ab_back);
            paVar.C(getThemedColor(org.telegram.ui.ActionBar.k6.y8), false);
            paVar.setCastShadows(true);
            paVar.setTitle(y());
            paVar.setActionBarMenuOnItemClick(new fg.l1(this, 24));
            qv0Var.addView(w10);
            qv0Var.addView(paVar, k7.c6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            w10.j(new fg.e2(qv0Var, 16));
        }
        if (i10 == 2) {
            J();
        }
        F(qv0Var);
        M();
    }

    public void B(float f10) {
    }

    public void E(float f10) {
    }

    public void F(qv0 qv0Var) {
    }

    public void C(Canvas canvas, int i10) {
    }

    public void D(int i10, int i11) {
    }
}
