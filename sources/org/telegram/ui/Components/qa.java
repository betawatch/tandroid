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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class qa extends org.telegram.ui.ActionBar.e3 {
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
    public tt L;
    public boolean M;
    public boolean N;
    public boolean O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public final Drawable b;
    public final org.telegram.ui.j c;
    public final zk0 d;
    public final na e;
    public boolean f;
    public int h;
    public final org.telegram.ui.ActionBar.n2 n;
    public final boolean r;
    public final la s;
    public float v;
    public boolean w;
    public float x;
    public boolean y;

    public qa(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        this(n2Var, z10, false, n2Var == null ? null : n2Var.getResourceProvider());
    }

    public final boolean B() {
        return i0.b.f(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, this.resourcesProvider)) > 0.699999988079071d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Canvas canvas, FrameLayout frameLayout) {
        int i10 = this.S;
        Drawable drawable = this.b;
        na naVar = this.e;
        if (i10 == 1) {
            boolean z10 = this.w;
            if (z10) {
                float f10 = this.x;
                if (f10 != 1.0f) {
                    this.x = f10 + 0.10666667f;
                    frameLayout.invalidate();
                    this.x = Utilities.clamp(this.x, 1.0f, 0.0f);
                    if (naVar != null && naVar.getVisibility() == 0 && naVar.getAlpha() != 0.0f && this.x != 0.0f) {
                        drawable.setBounds(this.backgroundPaddingLeft, naVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + naVar.getBottom());
                        drawable.setAlpha((int) (naVar.getAlpha() * 255.0f * this.x));
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
            if (naVar != null) {
                drawable.setBounds(this.backgroundPaddingLeft, naVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + naVar.getBottom());
                drawable.setAlpha((int) (naVar.getAlpha() * 255.0f * this.x));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                }
            }
            this.f = true;
        } else if (i10 == 2 && ((int) (this.x * 255.0f)) != 0 && this.w) {
            drawable.setBounds(this.backgroundPaddingLeft, naVar.getBottom() + ((int) naVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + naVar.getBottom() + ((int) naVar.getTranslationY()));
            drawable.setAlpha((int) (this.x * 255.0f));
            drawable.draw(canvas);
        }
        if (this.O) {
            canvas.restore();
            this.O = false;
        }
    }

    public void I(Canvas canvas, View view) {
        int i10;
        this.O = false;
        if (this.r) {
            return;
        }
        boolean z10 = this.M;
        zk0 zk0Var = this.d;
        if (z10) {
            int height = zk0Var.getHeight();
            for (int i11 = 0; i11 < zk0Var.getChildCount(); i11++) {
                View childAt = zk0Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R != zk0Var.getAdapter().h() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.K ? (int) childAt.getTranslationY() : 0));
                }
            }
            i10 = height - AndroidUtilities.dp(16.0f);
        } else {
            f2.o1 K = zk0Var.K(0);
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
        float f10 = i13;
        this.P = f10;
        F(f10);
        int i14 = this.S;
        float f11 = 1.0f;
        na naVar = this.e;
        if (i14 == 1) {
            float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i13) / y());
            if (dp < 0.0f) {
                dp = 0.0f;
            }
            AndroidUtilities.updateViewVisibilityAnimated(naVar, dp != 0.0f, 1.0f, this.f);
        } else if (i14 == 2) {
            float max = Math.max(((AndroidUtilities.dp(8.0f) + (i13 - this.G)) + this.E) - AndroidUtilities.statusBarHeight, 0.0f);
            float d = this.J.d(max == 0.0f ? 1.0f : 0.0f, false);
            if (d != 0.0f && d != 1.0f) {
                canvas.save();
                canvas.clipRect(0.0f, max, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                this.O = true;
            }
            this.x = d;
            f11 = AndroidUtilities.lerp(1.0f, 0.5f, d);
            naVar.e.setAlpha(d);
            C(d);
            naVar.e.setScaleX(d);
            naVar.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            naVar.e.setScaleY(d);
            org.telegram.ui.ActionBar.h5 titleTextView = naVar.getTitleTextView();
            titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
            if (this.N) {
                titleTextView.setTranslationX(((naVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            naVar.setTranslationY(max);
            i13 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.C - this.D) - this.E) - this.F), d);
            naVar.getBackground().setBounds(0, AndroidUtilities.lerp(naVar.getHeight(), 0, d), naVar.getWidth(), naVar.getHeight());
            if (d > 0.5f) {
                if (this.I) {
                    this.I = false;
                    naVar.setTag(1);
                }
            } else if (!this.I) {
                this.I = true;
                naVar.setTag(null);
            }
        }
        if (L()) {
            if (this instanceof cg.d1) {
                this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                this.shadowDrawable.setBounds(0, i13, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            v();
            this.shadowDrawable.draw(canvas);
            if (this.y && f11 > 0.0f) {
                int dp2 = AndroidUtilities.dp(36.0f);
                int dp3 = AndroidUtilities.dp(20.0f) + i13;
                float measuredWidth = (view.getMeasuredWidth() - dp2) / 2.0f;
                float f12 = dp3;
                float measuredWidth2 = (view.getMeasuredWidth() + dp2) / 2.0f;
                float dp4 = AndroidUtilities.dp(4.0f) + dp3;
                RectF rectF = this.B;
                rectF.set(measuredWidth, f12, measuredWidth2, dp4);
                org.telegram.ui.ActionBar.g6.t0.setColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
                org.telegram.ui.ActionBar.g6.t0.setAlpha((int) (r15.getAlpha() * f11));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.t0);
            }
        }
        D(canvas, i13);
    }

    public final void J() {
        zk0 zk0Var = this.d;
        if (zk0Var == null || this.c == null || zk0Var.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i10 = -1;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i12 = 0; i12 < zk0Var.getChildCount(); i12++) {
            View childAt = zk0Var.getChildAt(i12);
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

    public final void K() {
        if (this.r) {
            return;
        }
        this.S = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.D = currentActionBarHeight;
        this.C = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.E = AndroidUtilities.dp(16.0f);
        this.F = AndroidUtilities.dp(-20.0f);
        this.J = new y5(this.containerView, 0L, 350L, er.h);
        this.e.e.setPivotX(0.0f);
        this.d.setClipToPadding(true);
    }

    public boolean L() {
        return true;
    }

    public final void M() {
        if (this.attachedFragment != null) {
            LaunchActivity.C1.H(true, true, true);
            return;
        }
        na naVar = this.e;
        if (naVar != null && naVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, B());
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.n;
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
    }

    public final void N() {
        na naVar = this.e;
        if (naVar != null) {
            naVar.setTitle(z());
        }
    }

    public final void O() {
        na naVar = this.e;
        if (naVar == null || TextUtils.equals(z(), naVar.getTitle())) {
            return;
        }
        naVar.J(z(), false, 350L, er.h);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3, org.telegram.ui.ActionBar.j2
    public final boolean isAttachedLightStatusBar() {
        na naVar = this.e;
        if (naVar != null && naVar.getTag() != null) {
            return B();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.n;
        return n2Var != null ? n2Var.isLightStatusBar() : B();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public void onContainerViewTranslation() {
        F(this.P);
        v();
    }

    public final void t() {
        zk0 zk0Var = this.d;
        if (zk0Var == null || zk0Var.getLayoutManager() == null || this.Q < 0) {
            return;
        }
        int top = (this.R - this.containerView.getTop()) - zk0Var.getPaddingTop();
        if (zk0Var.getLayoutManager() instanceof f2.k0) {
            ((f2.k0) zk0Var.getLayoutManager()).h1(this.Q, top);
        }
        this.Q = -1;
    }

    public boolean u(View view, float f10, float f11) {
        return true;
    }

    public final void v() {
        if (this.backDrawable == null || this.containerView == null || this.shadowDrawable == null || !L() || this.r) {
            return;
        }
        Rect bounds = this.shadowDrawable.getBounds();
        if (this.containerView.getMeasuredWidth() >= this.container.getMeasuredWidth()) {
            this.backDrawable.a(((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY()));
        } else {
            this.backDrawable.a(0);
        }
    }

    public abstract yk0 w(zk0 zk0Var);

    public zk0 x(Context context) {
        return new hh.f1(this, context, this.resourcesProvider, 10);
    }

    public int y() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence z();

    public qa(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        this(n2Var.getParentActivity(), n2Var, false, z10, z11, 1, c6Var);
    }

    public qa(org.telegram.ui.ActionBar.n2 n2Var) {
        this(n2Var.getParentActivity(), n2Var, false, false, false, 2, n2Var.getResourceProvider());
    }

    public qa(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, n2Var, z10, false, z11, z12, false, i10, c6Var);
    }

    public qa(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, z10, z11);
        zu0 zu0Var;
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
        this.n = n2Var;
        this.r = z12;
        this.b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z13) {
            la laVar = new la(this, context, z14, z12);
            this.s = laVar;
            zu0Var = laVar;
        } else {
            zu0Var = new ma(this, context, z14, z12);
        }
        zk0 x8 = x(context);
        this.d = x8;
        org.telegram.ui.j jVar = new org.telegram.ui.j(4);
        this.c = jVar;
        if (z14) {
            jVar.l1(true);
        }
        x8.setLayoutManager(jVar);
        la laVar2 = this.s;
        if (laVar2 != null) {
            laVar2.setBottomSheetContainerView(getContainer());
            this.s.setTargetListView(x8);
        }
        if (z12) {
            x8.setHasFixedSize(true);
            x8.setAdapter(w(x8));
            setCustomView(zu0Var);
            zu0Var.addView(x8, h7.z5.c(-2.0f, -1));
        } else {
            x8.setAdapter(new pa(this, w(x8), context));
            this.containerView = zu0Var;
            na naVar = new na(this, context, zu0Var);
            this.e = naVar;
            naVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.h5));
            naVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
            naVar.C(getThemedColor(org.telegram.ui.ActionBar.g6.z8), false);
            naVar.setBackButtonImage(R.drawable.ic_ab_back);
            naVar.D(getThemedColor(org.telegram.ui.ActionBar.g6.y8), false);
            naVar.setCastShadows(true);
            naVar.setTitle(z());
            naVar.setActionBarMenuOnItemClick(new org.telegram.ui.zp(this, 3));
            zu0Var.addView(x8);
            zu0Var.addView(naVar, h7.z5.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            x8.j(new ag.z2(zu0Var, 23));
        }
        if (i10 == 2) {
            K();
        }
        G(zu0Var);
        M();
    }

    public void C(float f10) {
    }

    public void F(float f10) {
    }

    public void G(zu0 zu0Var) {
    }

    public void D(Canvas canvas, int i10) {
    }

    public void E(int i10, int i11) {
    }
}
