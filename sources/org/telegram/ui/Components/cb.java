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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public abstract class cb extends org.telegram.ui.ActionBar.f3 {
    public boolean E;
    public final RectF F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public e6 N;
    public boolean O;
    public boolean P;
    public mu Q;
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final Drawable b;
    public final gg.b0 c;
    public final zl0 d;
    public final ya e;
    public boolean f;
    public int h;
    public final org.telegram.ui.ActionBar.n2 n;
    public final boolean r;
    public final wa s;
    public float v;
    public boolean w;
    public float x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cb(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        this(r0, n2Var, new bb(r1));
        Activity parentActivity = n2Var.getParentActivity();
        bb bbVar = new bb();
        bbVar.a = false;
        bbVar.c = z10;
        bbVar.g = n2Var.getResourceProvider();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(Canvas canvas, FrameLayout frameLayout) {
        int i10 = this.W;
        Drawable drawable = this.b;
        ya yaVar = this.e;
        if (i10 == 1) {
            boolean z10 = this.w;
            if (z10) {
                float f7 = this.x;
                if (f7 != 1.0f) {
                    this.x = f7 + 0.10666667f;
                    frameLayout.invalidate();
                    this.x = Utilities.clamp(this.x, 1.0f, 0.0f);
                    if (yaVar != null && yaVar.getVisibility() == 0 && yaVar.getAlpha() != 0.0f && this.x != 0.0f) {
                        drawable.setBounds(this.backgroundPaddingLeft, yaVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + yaVar.getBottom());
                        drawable.setAlpha((int) (yaVar.getAlpha() * 255.0f * this.x));
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
            if (yaVar != null) {
                drawable.setBounds(this.backgroundPaddingLeft, yaVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + yaVar.getBottom());
                drawable.setAlpha((int) (yaVar.getAlpha() * 255.0f * this.x));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                }
            }
            this.f = true;
        } else if (i10 == 2 && ((int) (this.x * 255.0f)) != 0 && this.w) {
            drawable.setBounds(this.backgroundPaddingLeft, yaVar.getBottom() + ((int) yaVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + yaVar.getBottom() + ((int) yaVar.getTranslationY()));
            drawable.setAlpha((int) (this.x * 255.0f));
            drawable.draw(canvas);
        }
        if (this.S) {
            canvas.restore();
            this.S = false;
        }
    }

    public void G(Canvas canvas, View view) {
        int i10;
        this.S = false;
        if (this.r) {
            return;
        }
        boolean z10 = this.P;
        zl0 zl0Var = this.d;
        if (z10) {
            int height = zl0Var.getHeight();
            for (int i11 = 0; i11 < zl0Var.getChildCount(); i11++) {
                View childAt = zl0Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R != zl0Var.getAdapter().h() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.O ? (int) childAt.getTranslationY() : 0));
                }
            }
            i10 = height - AndroidUtilities.dp(16.0f);
        } else {
            s4.c1 K = zl0Var.K(0);
            int i12 = -AndroidUtilities.dp(16.0f);
            if (K != null) {
                View view2 = K.a;
                i12 = view2.getBottom() - AndroidUtilities.dp(16.0f);
                if (this.O) {
                    i10 = ((int) view2.getTranslationY()) + i12;
                }
            }
            i10 = i12;
        }
        int i13 = (i10 - ((this.H + this.I) + this.J)) + this.K;
        if (this.y && this.E) {
            i13 -= AndroidUtilities.dp(this.W == 2 ? 8.0f : 16.0f);
        }
        float f7 = i13;
        this.T = f7;
        D(f7);
        int i14 = this.W;
        float f10 = 1.0f;
        ya yaVar = this.e;
        if (i14 == 1) {
            float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i13) / x());
            if (dp < 0.0f) {
                dp = 0.0f;
            }
            AndroidUtilities.updateViewVisibilityAnimated(yaVar, dp != 0.0f, 1.0f, this.f);
        } else if (i14 == 2) {
            float max = Math.max(((AndroidUtilities.dp(8.0f) + (i13 - this.K)) + this.I) - AndroidUtilities.statusBarHeight, 0.0f);
            float d = this.N.d(max == 0.0f ? 1.0f : 0.0f, false);
            if (d != 0.0f && d != 1.0f) {
                canvas.save();
                canvas.clipRect(0.0f, max, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                this.S = true;
            }
            this.x = d;
            f10 = AndroidUtilities.lerp(1.0f, 0.5f, d);
            yaVar.e.setAlpha(d);
            A(d);
            yaVar.e.setScaleX(d);
            yaVar.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            yaVar.e.setScaleY(d);
            org.telegram.ui.ActionBar.i5 titleTextView = yaVar.getTitleTextView();
            titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
            if (this.R) {
                titleTextView.setTranslationX(((yaVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            yaVar.setTranslationY(max);
            i13 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.G - this.H) - this.I) - this.J), d);
            yaVar.getBackground().setBounds(0, AndroidUtilities.lerp(yaVar.getHeight(), 0, d), yaVar.getWidth(), yaVar.getHeight());
            if (d > 0.5f) {
                if (this.M) {
                    this.M = false;
                    yaVar.setTag(1);
                }
            } else if (!this.M) {
                this.M = true;
                yaVar.setTag(null);
            }
        }
        if (J()) {
            if (this instanceof tg.a0) {
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
                RectF rectF = this.F;
                rectF.set(measuredWidth, f11, measuredWidth2, dp4);
                org.telegram.ui.ActionBar.i6.t0.setColor(getThemedColor(org.telegram.ui.ActionBar.i6.Ii));
                org.telegram.ui.ActionBar.i6.t0.setAlpha((int) (r15.getAlpha() * f10));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.t0);
            }
        }
        B(canvas, i13);
    }

    public final void H() {
        zl0 zl0Var = this.d;
        if (zl0Var == null || this.c == null || zl0Var.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i10 = -1;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i12 = 0; i12 < zl0Var.getChildCount(); i12++) {
            View childAt = zl0Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && childAt.getTop() < i11) {
                i11 = childAt.getTop();
                view = childAt;
                i10 = R;
            }
        }
        if (view != null) {
            this.U = i10;
            this.V = this.containerView.getTop() + view.getTop();
            smoothContainerViewLayout();
        }
    }

    public final void I() {
        if (this.r) {
            return;
        }
        this.W = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.H = currentActionBarHeight;
        this.G = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.I = AndroidUtilities.dp(16.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.N = new e6(this.containerView, 0L, 350L, tr.h);
        this.e.e.setPivotX(0.0f);
        this.d.setClipToPadding(true);
    }

    public boolean J() {
        return true;
    }

    public final void K() {
        if (this.attachedFragment != null) {
            LaunchActivity.G1.I(true, true, true);
            return;
        }
        ya yaVar = this.e;
        if (yaVar != null && yaVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, z());
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.n;
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
    }

    public final void L() {
        ya yaVar = this.e;
        if (yaVar != null) {
            yaVar.setTitle(y());
        }
    }

    public final void M() {
        ya yaVar = this.e;
        if (yaVar == null || TextUtils.equals(y(), yaVar.getTitle())) {
            return;
        }
        yaVar.G(y(), false, 350L, tr.h);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public final boolean isAttachedLightStatusBar() {
        ya yaVar = this.e;
        if (yaVar != null && yaVar.getTag() != null) {
            return z();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.n;
        return n2Var != null ? n2Var.isLightStatusBar() : z();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public void onContainerViewTranslation() {
        D(this.T);
        u();
    }

    public final void s() {
        zl0 zl0Var = this.d;
        if (zl0Var == null || zl0Var.getLayoutManager() == null || this.U < 0) {
            return;
        }
        int top = (this.V - this.containerView.getTop()) - zl0Var.getPaddingTop();
        if (zl0Var.getLayoutManager() instanceof s4.c0) {
            ((s4.c0) zl0Var.getLayoutManager()).h1(this.U, top);
        }
        this.U = -1;
    }

    public boolean t(View view, float f7, float f10) {
        return true;
    }

    public final void u() {
        if (this.backDrawable == null || this.containerView == null || this.shadowDrawable == null || !J() || this.r) {
            return;
        }
        Rect bounds = this.shadowDrawable.getBounds();
        if (this.containerView.getMeasuredWidth() >= this.container.getMeasuredWidth()) {
            this.backDrawable.a(((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY()));
        } else {
            this.backDrawable.a(0);
        }
    }

    public abstract yl0 v(zl0 zl0Var);

    public zl0 w(Context context) {
        return new ai.w0(this, context, this.resourcesProvider, 10);
    }

    public int x() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence y();

    public final boolean z() {
        return i0.a.f(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, this.resourcesProvider)) > 0.699999988079071d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cb(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var) {
        this(r0, n2Var, new bb(r1));
        Activity parentActivity = n2Var.getParentActivity();
        bb bbVar = new bb();
        bbVar.a = z10;
        bbVar.c = false;
        bbVar.d = z11;
        bbVar.g = d6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cb(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, n2Var, new bb(r0));
        bb bbVar = new bb();
        bbVar.a = z10;
        bbVar.c = z11;
        bbVar.d = false;
        bbVar.g = d6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cb(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.n2) null, new bb(r0));
        bb bbVar = new bb();
        bbVar.a = z10;
        bbVar.c = false;
        bbVar.d = false;
        bbVar.f = i10;
        bbVar.g = d6Var;
    }

    public void A(float f7) {
    }

    public void D(float f7) {
    }

    public void E(mw0 mw0Var) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cb(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, n2Var, new bb(r0));
        bb bbVar = new bb();
        bbVar.a = z10;
        bbVar.c = false;
        bbVar.d = false;
        bbVar.e = z11;
        bbVar.f = i10;
        bbVar.g = d6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cb(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.n2) null, new bb(r0));
        bb bbVar = new bb();
        bbVar.a = z10;
        bbVar.b = 2;
        bbVar.c = false;
        bbVar.d = false;
        bbVar.e = false;
        bbVar.f = 2;
        bbVar.g = d6Var;
    }

    public void B(Canvas canvas, int i10) {
    }

    public void C(int i10, int i11) {
    }

    public cb(Context context, org.telegram.ui.ActionBar.n2 n2Var, bb bbVar) {
        super(bbVar.b, context, bbVar.g, bbVar.a);
        mw0 mw0Var;
        this.v = 0.4f;
        this.w = true;
        this.x = 1.0f;
        this.y = false;
        this.F = new RectF();
        this.W = 1;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = true;
        this.M = false;
        this.O = false;
        this.U = -1;
        boolean z10 = bbVar.c;
        boolean z11 = bbVar.d;
        boolean z12 = bbVar.e;
        int i10 = bbVar.f;
        this.n = n2Var;
        this.r = z10;
        this.b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            wa waVar = new wa(this, context, z12, z10);
            this.s = waVar;
            mw0Var = waVar;
        } else {
            mw0Var = new xa(this, context, z12, z10);
        }
        zl0 w10 = w(context);
        this.d = w10;
        gg.b0 b0Var = new gg.b0(6);
        this.c = b0Var;
        if (z12) {
            b0Var.l1(true);
        }
        w10.setLayoutManager(b0Var);
        wa waVar2 = this.s;
        if (waVar2 != null) {
            waVar2.setBottomSheetContainerView(getContainer());
            this.s.setTargetListView(w10);
        }
        if (z10) {
            w10.setHasFixedSize(true);
            w10.setAdapter(v(w10));
            setCustomView(mw0Var);
            mw0Var.addView(w10, w7.z5.c(-2.0f, -1));
        } else {
            w10.setAdapter(new ab(this, v(w10), context));
            this.containerView = mw0Var;
            ya yaVar = new ya(this, context, mw0Var);
            this.e = yaVar;
            yaVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.h5));
            yaVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.i6.G6));
            yaVar.z(getThemedColor(org.telegram.ui.ActionBar.i6.z8), false);
            yaVar.setBackButtonImage(R.drawable.ic_ab_back);
            yaVar.A(getThemedColor(org.telegram.ui.ActionBar.i6.y8), false);
            yaVar.setCastShadows(true);
            yaVar.setTitle(y());
            yaVar.setActionBarMenuOnItemClick(new org.telegram.ui.qo(this, 7));
            mw0Var.addView(w10);
            mw0Var.addView(yaVar, w7.z5.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            w10.j(new ai.r(mw0Var, 16));
        }
        if (i10 == 2) {
            I();
        }
        E(mw0Var);
        K();
    }
}
