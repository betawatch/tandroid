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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class za extends org.telegram.ui.ActionBar.g3 {
    public boolean E;
    public final RectF F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public c6 N;
    public boolean O;
    public boolean P;
    public ju Q;
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final Drawable b;
    public final gg.b0 c;
    public final ml0 d;
    public final va e;
    public boolean f;
    public int h;
    public final org.telegram.ui.ActionBar.o2 n;
    public final boolean r;
    public final ta s;
    public float v;
    public boolean w;
    public float x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public za(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        this(r0, o2Var, new ya(r1));
        Activity parentActivity = o2Var.getParentActivity();
        ya yaVar = new ya();
        yaVar.a = false;
        yaVar.c = z10;
        yaVar.g = o2Var.getResourceProvider();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Canvas canvas, FrameLayout frameLayout) {
        int i10 = this.W;
        Drawable drawable = this.b;
        va vaVar = this.e;
        if (i10 == 1) {
            boolean z10 = this.w;
            if (z10) {
                float f7 = this.x;
                if (f7 != 1.0f) {
                    this.x = f7 + 0.10666667f;
                    frameLayout.invalidate();
                    this.x = Utilities.clamp(this.x, 1.0f, 0.0f);
                    if (vaVar != null && vaVar.getVisibility() == 0 && vaVar.getAlpha() != 0.0f && this.x != 0.0f) {
                        drawable.setBounds(this.backgroundPaddingLeft, vaVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + vaVar.getBottom());
                        drawable.setAlpha((int) (vaVar.getAlpha() * 255.0f * this.x));
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
            if (vaVar != null) {
                drawable.setBounds(this.backgroundPaddingLeft, vaVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + vaVar.getBottom());
                drawable.setAlpha((int) (vaVar.getAlpha() * 255.0f * this.x));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                }
            }
            this.f = true;
        } else if (i10 == 2 && ((int) (this.x * 255.0f)) != 0 && this.w) {
            drawable.setBounds(this.backgroundPaddingLeft, vaVar.getBottom() + ((int) vaVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + vaVar.getBottom() + ((int) vaVar.getTranslationY()));
            drawable.setAlpha((int) (this.x * 255.0f));
            drawable.draw(canvas);
        }
        if (this.S) {
            canvas.restore();
            this.S = false;
        }
    }

    public void I(Canvas canvas, View view) {
        int i10;
        this.S = false;
        if (this.r) {
            return;
        }
        boolean z10 = this.P;
        ml0 ml0Var = this.d;
        if (z10) {
            int height = ml0Var.getHeight();
            for (int i11 = 0; i11 < ml0Var.getChildCount(); i11++) {
                View childAt = ml0Var.getChildAt(i11);
                int S = RecyclerView.S(childAt);
                if (S != -1 && S != ml0Var.getAdapter().h() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.O ? (int) childAt.getTranslationY() : 0));
                }
            }
            i10 = height - AndroidUtilities.dp(16.0f);
        } else {
            s4.c1 L = ml0Var.L(0);
            int i12 = -AndroidUtilities.dp(16.0f);
            if (L != null) {
                View view2 = L.a;
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
        F(f7);
        int i14 = this.W;
        float f10 = 1.0f;
        va vaVar = this.e;
        if (i14 == 1) {
            float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i13) / x());
            if (dp < 0.0f) {
                dp = 0.0f;
            }
            AndroidUtilities.updateViewVisibilityAnimated(vaVar, dp != 0.0f, 1.0f, this.f);
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
            vaVar.e.setAlpha(d);
            A(d);
            vaVar.e.setScaleX(d);
            vaVar.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            vaVar.e.setScaleY(d);
            org.telegram.ui.ActionBar.k5 titleTextView = vaVar.getTitleTextView();
            titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
            if (this.R) {
                titleTextView.setTranslationX(((vaVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            vaVar.setTranslationY(max);
            i13 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.G - this.H) - this.I) - this.J), d);
            vaVar.getBackground().setBounds(0, AndroidUtilities.lerp(vaVar.getHeight(), 0, d), vaVar.getWidth(), vaVar.getHeight());
            if (d > 0.5f) {
                if (this.M) {
                    this.M = false;
                    vaVar.setTag(1);
                }
            } else if (!this.M) {
                this.M = true;
                vaVar.setTag(null);
            }
        }
        if (L()) {
            if (this instanceof tg.b0) {
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
                org.telegram.ui.ActionBar.j6.t0.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
                org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (r15.getAlpha() * f10));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
            }
        }
        B(canvas, i13);
    }

    public final void J() {
        ml0 ml0Var = this.d;
        if (ml0Var == null || this.c == null || ml0Var.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i10 = -1;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i12 = 0; i12 < ml0Var.getChildCount(); i12++) {
            View childAt = ml0Var.getChildAt(i12);
            int S = RecyclerView.S(childAt);
            if (S >= 0 && childAt.getTop() < i11) {
                i11 = childAt.getTop();
                view = childAt;
                i10 = S;
            }
        }
        if (view != null) {
            this.U = i10;
            this.V = this.containerView.getTop() + view.getTop();
            smoothContainerViewLayout();
        }
    }

    public final void K() {
        if (this.r) {
            return;
        }
        this.W = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.H = currentActionBarHeight;
        this.G = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.I = AndroidUtilities.dp(16.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.N = new c6(this.containerView, 0L, 350L, qr.h);
        this.e.e.setPivotX(0.0f);
        this.d.setClipToPadding(true);
    }

    public boolean L() {
        return true;
    }

    public final void M() {
        if (this.attachedFragment != null) {
            LaunchActivity.G1.H(true, true, true);
            return;
        }
        va vaVar = this.e;
        if (vaVar != null && vaVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, z());
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.n;
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
    }

    public final void N() {
        va vaVar = this.e;
        if (vaVar != null) {
            vaVar.setTitle(y());
        }
    }

    public final void O() {
        va vaVar = this.e;
        if (vaVar == null || TextUtils.equals(y(), vaVar.getTitle())) {
            return;
        }
        vaVar.J(y(), false, 350L, qr.h);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3, org.telegram.ui.ActionBar.k2
    public final boolean isAttachedLightStatusBar() {
        va vaVar = this.e;
        if (vaVar != null && vaVar.getTag() != null) {
            return z();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.n;
        return o2Var != null ? o2Var.isLightStatusBar() : z();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public void onContainerViewTranslation() {
        F(this.T);
        u();
    }

    public final void s() {
        ml0 ml0Var = this.d;
        if (ml0Var == null || ml0Var.getLayoutManager() == null || this.U < 0) {
            return;
        }
        int top = (this.V - this.containerView.getTop()) - ml0Var.getPaddingTop();
        if (ml0Var.getLayoutManager() instanceof s4.c0) {
            ((s4.c0) ml0Var.getLayoutManager()).h1(this.U, top);
        }
        this.U = -1;
    }

    public boolean t(View view, float f7, float f10) {
        return true;
    }

    public final void u() {
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

    public abstract ll0 v(ml0 ml0Var);

    public ml0 w(Context context) {
        return new ai.w0(this, context, this.resourcesProvider, 10);
    }

    public int x() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence y();

    public final boolean z() {
        return i0.a.f(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, this.resourcesProvider)) > 0.699999988079071d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public za(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var) {
        this(r0, o2Var, new ya(r1));
        Activity parentActivity = o2Var.getParentActivity();
        ya yaVar = new ya();
        yaVar.a = z10;
        yaVar.c = false;
        yaVar.d = z11;
        yaVar.g = f6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public za(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, o2Var, new ya(r0));
        ya yaVar = new ya();
        yaVar.a = z10;
        yaVar.c = z11;
        yaVar.d = false;
        yaVar.g = f6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public za(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.o2) null, new ya(r0));
        ya yaVar = new ya();
        yaVar.a = z10;
        yaVar.c = false;
        yaVar.d = false;
        yaVar.f = i10;
        yaVar.g = f6Var;
    }

    public void A(float f7) {
    }

    public void F(float f7) {
    }

    public void G(qv0 qv0Var) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public za(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, o2Var, new ya(r0));
        ya yaVar = new ya();
        yaVar.a = z10;
        yaVar.c = false;
        yaVar.d = false;
        yaVar.e = z11;
        yaVar.f = i10;
        yaVar.g = f6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public za(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.o2) null, new ya(r0));
        ya yaVar = new ya();
        yaVar.a = z10;
        yaVar.b = 2;
        yaVar.c = false;
        yaVar.d = false;
        yaVar.e = false;
        yaVar.f = 2;
        yaVar.g = f6Var;
    }

    public void B(Canvas canvas, int i10) {
    }

    public void E(int i10, int i11) {
    }

    public za(Context context, org.telegram.ui.ActionBar.o2 o2Var, ya yaVar) {
        super(yaVar.b, context, yaVar.g, yaVar.a);
        qv0 qv0Var;
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
        boolean z10 = yaVar.c;
        boolean z11 = yaVar.d;
        boolean z12 = yaVar.e;
        int i10 = yaVar.f;
        this.n = o2Var;
        this.r = z10;
        this.b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            ta taVar = new ta(this, context, z12, z10);
            this.s = taVar;
            qv0Var = taVar;
        } else {
            qv0Var = new ua(this, context, z12, z10);
        }
        ml0 w10 = w(context);
        this.d = w10;
        gg.b0 b0Var = new gg.b0(6);
        this.c = b0Var;
        if (z12) {
            b0Var.l1(true);
        }
        w10.setLayoutManager(b0Var);
        ta taVar2 = this.s;
        if (taVar2 != null) {
            taVar2.setBottomSheetContainerView(getContainer());
            this.s.setTargetListView(w10);
        }
        if (z10) {
            w10.setHasFixedSize(true);
            w10.setAdapter(v(w10));
            setCustomView(qv0Var);
            qv0Var.addView(w10, w7.x5.c(-2.0f, -1));
        } else {
            w10.setAdapter(new xa(this, v(w10), context));
            this.containerView = qv0Var;
            va vaVar = new va(this, context, qv0Var);
            this.e = vaVar;
            vaVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
            vaVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
            vaVar.A(getThemedColor(org.telegram.ui.ActionBar.j6.z8), false);
            vaVar.setBackButtonImage(R.drawable.ic_ab_back);
            vaVar.B(getThemedColor(org.telegram.ui.ActionBar.j6.y8), false);
            vaVar.setCastShadows(true);
            vaVar.setTitle(y());
            vaVar.setActionBarMenuOnItemClick(new org.telegram.ui.to(this, 7));
            qv0Var.addView(w10);
            qv0Var.addView(vaVar, w7.x5.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            w10.j(new ai.r(qv0Var, 16));
        }
        if (i10 == 2) {
            K();
        }
        G(qv0Var);
        M();
    }
}
