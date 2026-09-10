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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class ab extends org.telegram.ui.ActionBar.h3 {
    public boolean E;
    public final RectF F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public d6 N;
    public boolean O;
    public boolean P;
    public nu Q;
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final Drawable b;
    public final fg.a0 c;
    public final vl0 d;
    public final wa e;
    public boolean f;
    public int h;
    public final org.telegram.ui.ActionBar.p2 n;
    public final boolean r;
    public final ua s;
    public float v;
    public boolean w;
    public float x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ab(org.telegram.ui.ActionBar.p2 p2Var, boolean z10) {
        this(r0, p2Var, new za(r1));
        Activity parentActivity = p2Var.getParentActivity();
        za zaVar = new za();
        zaVar.a = false;
        zaVar.c = z10;
        zaVar.g = p2Var.getResourceProvider();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Canvas canvas, FrameLayout frameLayout) {
        int i10 = this.W;
        Drawable drawable = this.b;
        wa waVar = this.e;
        if (i10 == 1) {
            boolean z10 = this.w;
            if (z10) {
                float f7 = this.x;
                if (f7 != 1.0f) {
                    this.x = f7 + 0.10666667f;
                    frameLayout.invalidate();
                    this.x = Utilities.clamp(this.x, 1.0f, 0.0f);
                    if (waVar != null && waVar.getVisibility() == 0 && waVar.getAlpha() != 0.0f && this.x != 0.0f) {
                        drawable.setBounds(this.backgroundPaddingLeft, waVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + waVar.getBottom());
                        drawable.setAlpha((int) (waVar.getAlpha() * 255.0f * this.x));
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
            if (waVar != null) {
                drawable.setBounds(this.backgroundPaddingLeft, waVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + waVar.getBottom());
                drawable.setAlpha((int) (waVar.getAlpha() * 255.0f * this.x));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                }
            }
            this.f = true;
        } else if (i10 == 2 && ((int) (this.x * 255.0f)) != 0 && this.w) {
            drawable.setBounds(this.backgroundPaddingLeft, waVar.getBottom() + ((int) waVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + waVar.getBottom() + ((int) waVar.getTranslationY()));
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
        vl0 vl0Var = this.d;
        if (z10) {
            int height = vl0Var.getHeight();
            for (int i11 = 0; i11 < vl0Var.getChildCount(); i11++) {
                View childAt = vl0Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R != vl0Var.getAdapter().h() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.O ? (int) childAt.getTranslationY() : 0));
                }
            }
            i10 = height - AndroidUtilities.dp(16.0f);
        } else {
            s4.c1 K = vl0Var.K(0);
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
        E(f7);
        int i14 = this.W;
        float f10 = 1.0f;
        wa waVar = this.e;
        if (i14 == 1) {
            float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i13) / x());
            if (dp < 0.0f) {
                dp = 0.0f;
            }
            AndroidUtilities.updateViewVisibilityAnimated(waVar, dp != 0.0f, 1.0f, this.f);
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
            waVar.e.setAlpha(d);
            A(d);
            waVar.e.setScaleX(d);
            waVar.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            waVar.e.setScaleY(d);
            org.telegram.ui.ActionBar.l5 titleTextView = waVar.getTitleTextView();
            titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
            if (this.R) {
                titleTextView.setTranslationX(((waVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            waVar.setTranslationY(max);
            i13 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.G - this.H) - this.I) - this.J), d);
            waVar.getBackground().setBounds(0, AndroidUtilities.lerp(waVar.getHeight(), 0, d), waVar.getWidth(), waVar.getHeight());
            if (d > 0.5f) {
                if (this.M) {
                    this.M = false;
                    waVar.setTag(1);
                }
            } else if (!this.M) {
                this.M = true;
                waVar.setTag(null);
            }
        }
        if (L()) {
            if (this instanceof sg.a0) {
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
        C(canvas, i13);
    }

    public final void J() {
        vl0 vl0Var = this.d;
        if (vl0Var == null || this.c == null || vl0Var.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i10 = -1;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i12 = 0; i12 < vl0Var.getChildCount(); i12++) {
            View childAt = vl0Var.getChildAt(i12);
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

    public final void K() {
        if (this.r) {
            return;
        }
        this.W = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.H = currentActionBarHeight;
        this.G = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.I = AndroidUtilities.dp(16.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.N = new d6(this.containerView, 0L, 350L, wr.h);
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
        wa waVar = this.e;
        if (waVar != null && waVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, z());
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.n;
        if (p2Var != null) {
            AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        }
    }

    public final void N() {
        wa waVar = this.e;
        if (waVar != null) {
            waVar.setTitle(y());
        }
    }

    public final void O() {
        wa waVar = this.e;
        if (waVar == null || TextUtils.equals(y(), waVar.getTitle())) {
            return;
        }
        waVar.J(y(), false, 350L, wr.h);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3, org.telegram.ui.ActionBar.l2
    public final boolean isAttachedLightStatusBar() {
        wa waVar = this.e;
        if (waVar != null && waVar.getTag() != null) {
            return z();
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.n;
        return p2Var != null ? p2Var.isLightStatusBar() : z();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public void onContainerViewTranslation() {
        E(this.T);
        u();
    }

    public final void s() {
        vl0 vl0Var = this.d;
        if (vl0Var == null || vl0Var.getLayoutManager() == null || this.U < 0) {
            return;
        }
        int top = (this.V - this.containerView.getTop()) - vl0Var.getPaddingTop();
        if (vl0Var.getLayoutManager() instanceof s4.c0) {
            ((s4.c0) vl0Var.getLayoutManager()).h1(this.U, top);
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

    public abstract ul0 v(vl0 vl0Var);

    public vl0 w(Context context) {
        return new bi.y1(this, context, this.resourcesProvider, 9);
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
    public ab(org.telegram.ui.ActionBar.p2 p2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var) {
        this(r0, p2Var, new za(r1));
        Activity parentActivity = p2Var.getParentActivity();
        za zaVar = new za();
        zaVar.a = z10;
        zaVar.c = false;
        zaVar.d = z11;
        zaVar.g = f6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ab(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, p2Var, new za(r0));
        za zaVar = new za();
        zaVar.a = z10;
        zaVar.c = z11;
        zaVar.d = false;
        zaVar.g = f6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ab(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.p2) null, new za(r0));
        za zaVar = new za();
        zaVar.a = z10;
        zaVar.c = false;
        zaVar.d = false;
        zaVar.f = i10;
        zaVar.g = f6Var;
    }

    public void A(float f7) {
    }

    public void E(float f7) {
    }

    public void F(aw0 aw0Var) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ab(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, p2Var, new za(r0));
        za zaVar = new za();
        zaVar.a = z10;
        zaVar.c = false;
        zaVar.d = false;
        zaVar.e = z11;
        zaVar.f = i10;
        zaVar.g = f6Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ab(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this(context, (org.telegram.ui.ActionBar.p2) null, new za(r0));
        za zaVar = new za();
        zaVar.a = z10;
        zaVar.b = 2;
        zaVar.c = false;
        zaVar.d = false;
        zaVar.e = false;
        zaVar.f = 2;
        zaVar.g = f6Var;
    }

    public void C(Canvas canvas, int i10) {
    }

    public void D(int i10, int i11) {
    }

    public ab(Context context, org.telegram.ui.ActionBar.p2 p2Var, za zaVar) {
        super(zaVar.b, context, zaVar.g, zaVar.a);
        aw0 aw0Var;
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
        boolean z10 = zaVar.c;
        boolean z11 = zaVar.d;
        boolean z12 = zaVar.e;
        int i10 = zaVar.f;
        this.n = p2Var;
        this.r = z10;
        this.b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            ua uaVar = new ua(this, context, z12, z10);
            this.s = uaVar;
            aw0Var = uaVar;
        } else {
            aw0Var = new va(this, context, z12, z10);
        }
        vl0 w10 = w(context);
        this.d = w10;
        fg.a0 a0Var = new fg.a0(6);
        this.c = a0Var;
        if (z12) {
            a0Var.l1(true);
        }
        w10.setLayoutManager(a0Var);
        ua uaVar2 = this.s;
        if (uaVar2 != null) {
            uaVar2.setBottomSheetContainerView(getContainer());
            this.s.setTargetListView(w10);
        }
        if (z10) {
            w10.setHasFixedSize(true);
            w10.setAdapter(v(w10));
            setCustomView(aw0Var);
            aw0Var.addView(w10, w7.a6.c(-2.0f, -1));
        } else {
            w10.setAdapter(new ya(this, v(w10), context));
            this.containerView = aw0Var;
            wa waVar = new wa(this, context, aw0Var);
            this.e = waVar;
            waVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
            waVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
            waVar.A(getThemedColor(org.telegram.ui.ActionBar.j6.z8), false);
            waVar.setBackButtonImage(R.drawable.ic_ab_back);
            waVar.C(getThemedColor(org.telegram.ui.ActionBar.j6.y8), false);
            waVar.setCastShadows(true);
            waVar.setTitle(y());
            waVar.setActionBarMenuOnItemClick(new org.telegram.ui.vo(this, 7));
            aw0Var.addView(w10);
            aw0Var.addView(waVar, w7.a6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            w10.j(new bi.a2(aw0Var, 13));
        }
        if (i10 == 2) {
            K();
        }
        F(aw0Var);
        M();
    }
}
