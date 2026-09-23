package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class ea0 extends n61 {
    public final int T;
    public final da0 U;
    public final u00 V;
    public final xw0 W;
    public final xw0 X;
    public float Y;
    public boolean Z;

    public ea0(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        super(n2Var.getParentActivity(), n2Var.getCurrentAccount(), n2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.h6.a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        H(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        da0 da0Var = new da0((wh.b) this, n2Var, this.container, j3);
        this.U = da0Var;
        da0Var.B = false;
        setDimBehindAlpha(75);
        this.w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        wh.g gVar = da0Var.f;
        this.f = gVar;
        this.e = gVar;
        this.d.setAdapter(gVar);
        this.d.p1();
        ai.w0 w0Var = this.d;
        da0Var.p = w0Var;
        w0Var.setOnItemClickListener(new ai.g(da0Var, 18));
        s4.s0 onScrollListener = w0Var.getOnScrollListener();
        if (onScrollListener == null) {
            w0Var.setOnScrollListener(da0Var.D);
        } else {
            w0Var.setOnScrollListener(new ii.n3(8, da0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        u00 b10 = da0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.x5.c(-1.0f, -1));
        xw0 a2 = da0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.x5.c(-1.0f, -1));
        xw0 c10 = da0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.x5.c(-1.0f, -1));
        da0Var.e();
    }

    @Override // org.telegram.ui.Components.n61
    public final void E(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        int action = motionEvent.getAction();
        da0 da0Var = this.U;
        if (action == 0) {
            this.Y = this.y;
            da0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.xn) {
                boolean P9 = ((org.telegram.ui.xn) n2Var).P9();
                this.Z = true;
                AndroidUtilities.runOnUIThread(new oy(16, this, h2Var), P9 ? 200L : 0L);
            } else {
                this.Z = true;
                setFocusable(true);
                h2Var.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(4, h2Var));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            da0Var.i(true);
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final void G(String str) {
        this.U.j(str);
    }

    @Override // org.telegram.ui.Components.n61
    public final void I(int i10) {
        super.I(i10);
        this.V.setTranslationY(this.c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.n61
    public final void L() {
        ai.w0 w0Var = this.d;
        if (w0Var.getChildCount() > 0) {
            super.L();
            return;
        }
        int paddingTop = w0Var.getVisibility() == 0 ? w0Var.getPaddingTop() - AndroidUtilities.dp(8.0f) : 0;
        if (this.y != paddingTop) {
            this.y = paddingTop;
            I(paddingTop);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        wh.m mVar = this.U.s;
        if (mVar != null) {
            mVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        da0 da0Var = this.U;
        if (da0Var.b && this.y == 0) {
            this.y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        da0Var.b = false;
    }
}
