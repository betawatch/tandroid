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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class db extends org.telegram.ui.ActionBar.e3 {
    public boolean E;
    public final RectF F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public g6 N;
    public boolean O;
    public boolean P;
    public vu Q;
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final Drawable b;
    public final hg.a0 c;
    public final mm0 d;
    public final za e;
    public boolean f;
    public int h;
    public final org.telegram.ui.ActionBar.m2 n;
    public final boolean r;
    public final xa s;
    public float v;
    public boolean w;
    public float x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public db(org.telegram.ui.ActionBar.m2 m2Var, boolean z10) {
        this(r0, m2Var, new cb(r1));
        Activity parentActivity = m2Var.getParentActivity();
        cb cbVar = new cb();
        cbVar.a = false;
        cbVar.c = z10;
        cbVar.g = m2Var.getResourceProvider();
    }

    public abstract CharSequence A();

    public final boolean B() {
        return i0.a.f(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, this.resourcesProvider)) > 0.699999988079071d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(Canvas canvas, FrameLayout frameLayout) {
        int i10 = this.W;
        Drawable drawable = this.b;
        za zaVar = this.e;
        if (i10 == 1) {
            boolean z10 = this.w;
            if (z10) {
                float f7 = this.x;
                if (f7 != 1.0f) {
                    this.x = f7 + 0.10666667f;
                    frameLayout.invalidate();
                    this.x = Utilities.clamp(this.x, 1.0f, 0.0f);
                    if (zaVar != null && zaVar.getVisibility() == 0 && zaVar.getAlpha() != 0.0f && this.x != 0.0f) {
                        drawable.setBounds(this.backgroundPaddingLeft, zaVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + zaVar.getBottom());
                        drawable.setAlpha((int) (zaVar.getAlpha() * 255.0f * this.x));
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
            if (zaVar != null) {
                drawable.setBounds(this.backgroundPaddingLeft, zaVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + zaVar.getBottom());
                drawable.setAlpha((int) (zaVar.getAlpha() * 255.0f * this.x));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                }
            }
            this.f = true;
        } else if (i10 == 2 && ((int) (this.x * 255.0f)) != 0 && this.w) {
            drawable.setBounds(this.backgroundPaddingLeft, zaVar.getBottom() + ((int) zaVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + zaVar.getBottom() + ((int) zaVar.getTranslationY()));
            drawable.setAlpha((int) (this.x * 255.0f));
            drawable.draw(canvas);
        }
        if (this.S) {
            canvas.restore();
            this.S = false;
        }
    }

    public void J(Canvas canvas, View view) {
        int i10;
        this.S = false;
        if (this.r) {
            return;
        }
        boolean z10 = this.P;
        mm0 mm0Var = this.d;
        if (z10) {
            int height = mm0Var.getHeight();
            for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
                View childAt = mm0Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R != mm0Var.getAdapter().h() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.O ? (int) childAt.getTranslationY() : 0));
                }
            }
            i10 = height - AndroidUtilities.dp(16.0f);
        } else {
            s4.b1 K = mm0Var.K(0);
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
        G(f7);
        int i14 = this.W;
        float f10 = 1.0f;
        za zaVar = this.e;
        if (i14 == 1) {
            float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i13) / z());
            if (dp < 0.0f) {
                dp = 0.0f;
            }
            AndroidUtilities.updateViewVisibilityAnimated(zaVar, dp != 0.0f, 1.0f, this.f);
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
            zaVar.e.setAlpha(d);
            D(d);
            zaVar.e.setScaleX(d);
            zaVar.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            zaVar.e.setScaleY(d);
            org.telegram.ui.ActionBar.h5 titleTextView = zaVar.getTitleTextView();
            titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
            if (this.R) {
                titleTextView.setTranslationX(((zaVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            zaVar.setTranslationY(max);
            i13 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.G - this.H) - this.I) - this.J), d);
            zaVar.getBackground().setBounds(0, AndroidUtilities.lerp(zaVar.getHeight(), 0, d), zaVar.getWidth(), zaVar.getHeight());
            if (d > 0.5f) {
                if (this.M) {
                    this.M = false;
                    zaVar.setTag(1);
                }
            } else if (!this.M) {
                this.M = true;
                zaVar.setTag(null);
            }
        }
        if (M()) {
            if (this instanceof ug.a0) {
                this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                this.shadowDrawable.setBounds(0, i13, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            w();
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
                org.telegram.ui.ActionBar.g6.t0.setColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
                org.telegram.ui.ActionBar.g6.t0.setAlpha((int) (r15.getAlpha() * f10));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.t0);
            }
        }
        E(canvas, i13);
    }

    public final void K() {
        mm0 mm0Var = this.d;
        if (mm0Var == null || this.c == null || mm0Var.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i10 = -1;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i12 = 0; i12 < mm0Var.getChildCount(); i12++) {
            View childAt = mm0Var.getChildAt(i12);
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

    public final void L() {
        if (this.r) {
            return;
        }
        this.W = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.H = currentActionBarHeight;
        this.G = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.I = AndroidUtilities.dp(16.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.N = new g6(this.containerView, 0L, 350L, es.h);
        this.e.e.setPivotX(0.0f);
        this.d.setClipToPadding(true);
    }

    public boolean M() {
        return true;
    }

    public final void N() {
        if (this.attachedFragment != null) {
            LaunchActivity.G1.H(true, true, true);
            return;
        }
        za zaVar = this.e;
        if (zaVar != null && zaVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, B());
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.n;
        if (m2Var != null) {
            AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        }
    }

    public final void O() {
        za zaVar = this.e;
        if (zaVar != null) {
            zaVar.setTitle(A());
        }
    }

    public final void P() {
        za zaVar = this.e;
        if (zaVar == null || TextUtils.equals(A(), zaVar.getTitle())) {
            return;
        }
        zaVar.J(A(), false, 350L, es.h);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3, org.telegram.ui.ActionBar.i2
    public final boolean isAttachedLightStatusBar() {
        za zaVar = this.e;
        if (zaVar != null && zaVar.getTag() != null) {
            return B();
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.n;
        return m2Var != null ? m2Var.isLightStatusBar() : B();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public void onContainerViewTranslation() {
        G(this.T);
        w();
    }

    public final void u() {
        mm0 mm0Var = this.d;
        if (mm0Var == null || mm0Var.getLayoutManager() == null || this.U < 0) {
            return;
        }
        int top = (this.V - this.containerView.getTop()) - mm0Var.getPaddingTop();
        if (mm0Var.getLayoutManager() instanceof s4.b0) {
            ((s4.b0) mm0Var.getLayoutManager()).h1(this.U, top);
        }
        this.U = -1;
    }

    public boolean v(View view, float f7, float f10) {
        return true;
    }

    public final void w() {
        if (this.backDrawable == null || this.containerView == null || this.shadowDrawable == null || !M() || this.r) {
            return;
        }
        Rect bounds = this.shadowDrawable.getBounds();
        if (this.containerView.getMeasuredWidth() >= this.container.getMeasuredWidth()) {
            this.backDrawable.a(((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY()));
        } else {
            this.backDrawable.a(0);
        }
    }

    public abstract lm0 x(mm0 mm0Var);

    public mm0 y(Context context) {
        return new bi.o0(this, context, this.resourcesProvider, 10);
    }

    public int z() {
        return AndroidUtilities.dp(56.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public db(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        this(r0, m2Var, new cb(r1));
        Activity parentActivity = m2Var.getParentActivity();
        cb cbVar = new cb();
        cbVar.a = z10;
        cbVar.c = false;
        cbVar.d = z11;
        cbVar.g = c6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public db(Context context, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, m2Var, new cb(r0));
        cb cbVar = new cb();
        cbVar.a = z10;
        cbVar.c = z11;
        cbVar.d = false;
        cbVar.g = c6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public db(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.m2) null, new cb(r0));
        cb cbVar = new cb();
        cbVar.a = z10;
        cbVar.c = false;
        cbVar.d = false;
        cbVar.f = i10;
        cbVar.g = c6Var;
    }

    public void D(float f7) {
    }

    public void G(float f7) {
    }

    public void H(ow0 ow0Var) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public db(Context context, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, m2Var, new cb(r0));
        cb cbVar = new cb();
        cbVar.a = z10;
        cbVar.c = false;
        cbVar.d = false;
        cbVar.e = z11;
        cbVar.f = i10;
        cbVar.g = c6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public db(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.m2) null, new cb(r0));
        cb cbVar = new cb();
        cbVar.a = z10;
        cbVar.b = 2;
        cbVar.c = false;
        cbVar.d = false;
        cbVar.e = false;
        cbVar.f = 2;
        cbVar.g = c6Var;
    }

    public void E(Canvas canvas, int i10) {
    }

    public void F(int i10, int i11) {
    }

    public db(Context context, org.telegram.ui.ActionBar.m2 m2Var, cb cbVar) {
        super(cbVar.b, context, cbVar.g, cbVar.a);
        ow0 ow0Var;
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
        boolean z10 = cbVar.c;
        boolean z11 = cbVar.d;
        boolean z12 = cbVar.e;
        int i10 = cbVar.f;
        this.n = m2Var;
        this.r = z10;
        this.b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            xa xaVar = new xa(this, context, z12, z10);
            this.s = xaVar;
            ow0Var = xaVar;
        } else {
            ow0Var = new ya(this, context, z12, z10);
        }
        mm0 y3 = y(context);
        this.d = y3;
        hg.a0 a0Var = new hg.a0(6);
        this.c = a0Var;
        if (z12) {
            a0Var.l1(true);
        }
        y3.setLayoutManager(a0Var);
        xa xaVar2 = this.s;
        if (xaVar2 != null) {
            xaVar2.setBottomSheetContainerView(getContainer());
            this.s.setTargetListView(y3);
        }
        if (z10) {
            y3.setHasFixedSize(true);
            y3.setAdapter(x(y3));
            setCustomView(ow0Var);
            ow0Var.addView(y3, w7.a6.d(-2.0f, -1));
        } else {
            y3.setAdapter(new bb(this, x(y3), context));
            this.containerView = ow0Var;
            za zaVar = new za(this, context, ow0Var);
            this.e = zaVar;
            zaVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.h5));
            zaVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
            zaVar.B(getThemedColor(org.telegram.ui.ActionBar.g6.z8), false);
            zaVar.setBackButtonImage(R.drawable.ic_ab_back);
            zaVar.D(getThemedColor(org.telegram.ui.ActionBar.g6.y8), false);
            zaVar.setCastShadows(true);
            zaVar.setTitle(A());
            zaVar.setActionBarMenuOnItemClick(new org.telegram.ui.nb(this, 9));
            ow0Var.addView(y3);
            ow0Var.addView(zaVar, w7.a6.a(-2.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 0));
            y3.j(new ah.d0(ow0Var, 16));
        }
        if (i10 == 2) {
            L();
        }
        H(ow0Var);
        N();
    }
}
