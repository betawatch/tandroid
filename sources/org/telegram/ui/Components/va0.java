package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class va0 extends b81 {
    public final int T;
    public final ua0 U;
    public final c10 V;
    public final ey0 W;
    public final ey0 X;
    public float Y;
    public boolean Z;
    public int a0;

    public va0(org.telegram.ui.ActionBar.r2 r2Var, long j10) {
        super(r2Var.getParentActivity(), r2Var.getCurrentAccount(), r2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.y6.a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        H(0.0f);
        fixNavigationBarKey(i10);
        this.G = false;
        this.H = false;
        ua0 ua0Var = new ua0((yh.b) this, r2Var, this.container, j10);
        this.U = ua0Var;
        ua0Var.B = false;
        setDimBehindAlpha(75);
        this.w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        yh.f fVar = ua0Var.f;
        this.f = fVar;
        this.e = fVar;
        this.d.setAdapter(fVar);
        this.d.u1();
        bi.r1 r1Var = this.d;
        ua0Var.p = r1Var;
        r1Var.setOnItemClickListener(new ai.k(ua0Var, 23));
        s4.u0 onScrollListener = r1Var.getOnScrollListener();
        if (onScrollListener == null) {
            r1Var.setOnScrollListener(ua0Var.D);
        } else {
            r1Var.setOnScrollListener(new ai.u0(9, ua0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        c10 b10 = ua0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, gb1.g(-1.0f, -1));
        ey0 a2 = ua0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, gb1.g(-1.0f, -1));
        ey0 c10 = ua0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, gb1.g(-1.0f, -1));
        ua0Var.e();
    }

    @Override // org.telegram.ui.Components.b81
    public final void D(MotionEvent motionEvent, fi.c2 c2Var) {
        org.telegram.ui.ActionBar.r2 r2Var;
        int action = motionEvent.getAction();
        ua0 ua0Var = this.U;
        if (action == 0) {
            this.Y = this.y;
            ua0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                r2Var = (org.telegram.ui.ActionBar.r2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                r2Var = null;
            }
            if (r2Var instanceof org.telegram.ui.un) {
                boolean Z9 = ((org.telegram.ui.un) r2Var).Z9();
                this.Z = true;
                AndroidUtilities.runOnUIThread(new t90(3, this, c2Var), Z9 ? 200L : 0L);
            } else {
                this.Z = true;
                setFocusable(true);
                c2Var.requestFocus();
                AndroidUtilities.runOnUIThread(new o70(c2Var, 2));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ua0Var.i(true);
        }
    }

    @Override // org.telegram.ui.Components.b81
    public final void G(String str) {
        this.U.j(str);
    }

    @Override // org.telegram.ui.Components.b81
    public final void I(int i10) {
        super.I(i10);
        this.V.setTranslationY(this.c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.b81
    public final void L() {
        bi.r1 r1Var = this.d;
        if (r1Var.getChildCount() > 0) {
            super.L();
            return;
        }
        int paddingTop = r1Var.getVisibility() == 0 ? r1Var.getPaddingTop() - AndroidUtilities.dp(8.0f) : 0;
        if (this.y != paddingTop) {
            this.y = paddingTop;
            I(paddingTop);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onBackPressed() {
        yh.j jVar = this.U.s;
        if (jVar != null) {
            jVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.a7);
        if (themedColor != this.a0) {
            this.a0 = themedColor;
            setBackgroundColor(themedColor);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        ua0 ua0Var = this.U;
        if (ua0Var.b && this.y == 0) {
            this.y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        ua0Var.b = false;
    }
}
