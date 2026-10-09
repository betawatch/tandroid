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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class eb extends org.telegram.ui.ActionBar.f3 {
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
    public zu Q;
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final Drawable b;
    public final gg.a0 c;
    public final qm0 d;
    public final ab e;
    public boolean f;
    public int h;
    public final org.telegram.ui.ActionBar.n2 n;
    public final boolean r;
    public final ya s;
    public float v;
    public boolean w;
    public float x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eb(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        this(r0, n2Var, new db(r1));
        Activity parentActivity = n2Var.getParentActivity();
        db dbVar = new db();
        dbVar.a = false;
        dbVar.c = z10;
        dbVar.g = n2Var.getResourceProvider();
    }

    public abstract CharSequence B();

    public final boolean C() {
        return i0.a.f(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h5, this.resourcesProvider)) > 0.699999988079071d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(Canvas canvas, FrameLayout frameLayout) {
        int i10 = this.W;
        Drawable drawable = this.b;
        ab abVar = this.e;
        if (i10 == 1) {
            boolean z10 = this.w;
            if (z10) {
                float f7 = this.x;
                if (f7 != 1.0f) {
                    this.x = f7 + 0.10666667f;
                    frameLayout.invalidate();
                    this.x = Utilities.clamp(this.x, 1.0f, 0.0f);
                    if (abVar != null && abVar.getVisibility() == 0 && abVar.getAlpha() != 0.0f && this.x != 0.0f) {
                        drawable.setBounds(this.backgroundPaddingLeft, abVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + abVar.getBottom());
                        drawable.setAlpha((int) (abVar.getAlpha() * 255.0f * this.x));
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
            if (abVar != null) {
                drawable.setBounds(this.backgroundPaddingLeft, abVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + abVar.getBottom());
                drawable.setAlpha((int) (abVar.getAlpha() * 255.0f * this.x));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                }
            }
            this.f = true;
        } else if (i10 == 2 && ((int) (this.x * 255.0f)) != 0 && this.w) {
            drawable.setBounds(this.backgroundPaddingLeft, abVar.getBottom() + ((int) abVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + abVar.getBottom() + ((int) abVar.getTranslationY()));
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
        qm0 qm0Var = this.d;
        if (z10) {
            int height = qm0Var.getHeight();
            for (int i11 = 0; i11 < qm0Var.getChildCount(); i11++) {
                View childAt = qm0Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R != qm0Var.getAdapter().h() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.O ? (int) childAt.getTranslationY() : 0));
                }
            }
            i10 = height - AndroidUtilities.dp(16.0f);
        } else {
            s4.d1 K = qm0Var.K(0);
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
        ab abVar = this.e;
        if (i14 == 1) {
            float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i13) / z());
            if (dp < 0.0f) {
                dp = 0.0f;
            }
            AndroidUtilities.updateViewVisibilityAnimated(abVar, dp != 0.0f, 1.0f, this.f);
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
            abVar.e.setAlpha(d);
            D(d);
            abVar.e.setScaleX(d);
            abVar.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            abVar.e.setScaleY(d);
            org.telegram.ui.ActionBar.j5 titleTextView = abVar.getTitleTextView();
            titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
            if (this.R) {
                titleTextView.setTranslationX(((abVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            abVar.setTranslationY(max);
            i13 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.G - this.H) - this.I) - this.J), d);
            abVar.getBackground().setBounds(0, AndroidUtilities.lerp(abVar.getHeight(), 0, d), abVar.getWidth(), abVar.getHeight());
            if (d > 0.5f) {
                if (this.M) {
                    this.M = false;
                    abVar.setTag(1);
                }
            } else if (!this.M) {
                this.M = true;
                abVar.setTag(null);
            }
        }
        if (M()) {
            if (this instanceof tg.a0) {
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
                org.telegram.ui.ActionBar.i6.t0.setColor(getThemedColor(org.telegram.ui.ActionBar.i6.Ii));
                org.telegram.ui.ActionBar.i6.t0.setAlpha((int) (r15.getAlpha() * f10));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.t0);
            }
        }
        E(canvas, i13);
    }

    public final void K() {
        qm0 qm0Var = this.d;
        if (qm0Var == null || this.c == null || qm0Var.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i10 = -1;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i12 = 0; i12 < qm0Var.getChildCount(); i12++) {
            View childAt = qm0Var.getChildAt(i12);
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
        this.N = new g6(this.containerView, 0L, 350L, hs.h);
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
        ab abVar = this.e;
        if (abVar != null && abVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, C());
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.n;
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
    }

    public final void O() {
        ab abVar = this.e;
        if (abVar != null) {
            abVar.setTitle(B());
        }
    }

    public final void P() {
        ab abVar = this.e;
        if (abVar == null || TextUtils.equals(B(), abVar.getTitle())) {
            return;
        }
        abVar.J(B(), false, 350L, hs.h);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public final boolean isAttachedLightStatusBar() {
        ab abVar = this.e;
        if (abVar != null && abVar.getTag() != null) {
            return C();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.n;
        return n2Var != null ? n2Var.isLightStatusBar() : C();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public void onContainerViewTranslation() {
        G(this.T);
        w();
    }

    public final void u() {
        qm0 qm0Var = this.d;
        if (qm0Var == null || qm0Var.getLayoutManager() == null || this.U < 0) {
            return;
        }
        int top = (this.V - this.containerView.getTop()) - qm0Var.getPaddingTop();
        if (qm0Var.getLayoutManager() instanceof s4.d0) {
            ((s4.d0) qm0Var.getLayoutManager()).h1(this.U, top);
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

    public abstract pm0 x(qm0 qm0Var);

    public qm0 y(Context context) {
        return new ai.w0(this, context, this.resourcesProvider, 10);
    }

    public int z() {
        return AndroidUtilities.dp(56.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eb(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        this(r0, n2Var, new db(r1));
        Activity parentActivity = n2Var.getParentActivity();
        db dbVar = new db();
        dbVar.a = z10;
        dbVar.c = false;
        dbVar.d = z11;
        dbVar.g = e6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eb(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, n2Var, new db(r0));
        db dbVar = new db();
        dbVar.a = z10;
        dbVar.c = z11;
        dbVar.d = false;
        dbVar.g = e6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eb(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.n2) null, new db(r0));
        db dbVar = new db();
        dbVar.a = z10;
        dbVar.c = false;
        dbVar.d = false;
        dbVar.f = i10;
        dbVar.g = e6Var;
    }

    public void D(float f7) {
    }

    public void G(float f7) {
    }

    public void H(sw0 sw0Var) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eb(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, n2Var, new db(r0));
        db dbVar = new db();
        dbVar.a = z10;
        dbVar.c = false;
        dbVar.d = false;
        dbVar.e = z11;
        dbVar.f = i10;
        dbVar.g = e6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eb(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.n2) null, new db(r0));
        db dbVar = new db();
        dbVar.a = z10;
        dbVar.b = 2;
        dbVar.c = false;
        dbVar.d = false;
        dbVar.e = false;
        dbVar.f = 2;
        dbVar.g = e6Var;
    }

    public void E(Canvas canvas, int i10) {
    }

    public void F(int i10, int i11) {
    }

    public eb(Context context, org.telegram.ui.ActionBar.n2 n2Var, db dbVar) {
        super(dbVar.b, context, dbVar.g, dbVar.a);
        sw0 sw0Var;
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
        boolean z10 = dbVar.c;
        boolean z11 = dbVar.d;
        boolean z12 = dbVar.e;
        int i10 = dbVar.f;
        this.n = n2Var;
        this.r = z10;
        this.b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            ya yaVar = new ya(this, context, z12, z10);
            this.s = yaVar;
            sw0Var = yaVar;
        } else {
            sw0Var = new za(this, context, z12, z10);
        }
        qm0 y3 = y(context);
        this.d = y3;
        gg.a0 a0Var = new gg.a0(6);
        this.c = a0Var;
        if (z12) {
            a0Var.l1(true);
        }
        y3.setLayoutManager(a0Var);
        ya yaVar2 = this.s;
        if (yaVar2 != null) {
            yaVar2.setBottomSheetContainerView(getContainer());
            this.s.setTargetListView(y3);
        }
        if (z10) {
            y3.setHasFixedSize(true);
            y3.setAdapter(x(y3));
            setCustomView(sw0Var);
            sw0Var.addView(y3, w7.x5.d(-2.0f, -1));
        } else {
            y3.setAdapter(new cb(this, x(y3), context));
            this.containerView = sw0Var;
            ab abVar = new ab(this, context, sw0Var);
            this.e = abVar;
            abVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.h5));
            abVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.i6.G6));
            abVar.C(getThemedColor(org.telegram.ui.ActionBar.i6.z8), false);
            abVar.setBackButtonImage(R.drawable.ic_ab_back);
            abVar.D(getThemedColor(org.telegram.ui.ActionBar.i6.y8), false);
            abVar.setCastShadows(true);
            abVar.setTitle(B());
            abVar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 7));
            sw0Var.addView(y3);
            sw0Var.addView(abVar, w7.x5.a(-2.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 0));
            y3.j(new ai.r(sw0Var, 15));
        }
        if (i10 == 2) {
            L();
        }
        H(sw0Var);
        N();
    }
}
