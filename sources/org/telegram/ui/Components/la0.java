package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public abstract class la0 extends c71 {
    public final int T;
    public final ka0 U;
    public final t00 V;
    public final jx0 W;
    public final jx0 X;
    public float Y;
    public boolean Z;

    public la0(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        super(n2Var.getParentActivity(), n2Var.getCurrentAccount(), n2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        H(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        ka0 ka0Var = new ka0((wh.b) this, n2Var, this.container, j3);
        this.U = ka0Var;
        ka0Var.B = false;
        setDimBehindAlpha(75);
        this.w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        wh.g gVar = ka0Var.f;
        this.f = gVar;
        this.e = gVar;
        this.d.setAdapter(gVar);
        this.d.q1();
        ai.w0 w0Var = this.d;
        ka0Var.p = w0Var;
        w0Var.setOnItemClickListener(new ai.g(ka0Var, 18));
        s4.s0 onScrollListener = w0Var.getOnScrollListener();
        if (onScrollListener == null) {
            w0Var.setOnScrollListener(ka0Var.D);
        } else {
            w0Var.setOnScrollListener(new ii.m3(8, ka0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        t00 b10 = ka0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.y5.c(-1.0f, -1));
        jx0 a2 = ka0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.y5.c(-1.0f, -1));
        jx0 c10 = ka0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.y5.c(-1.0f, -1));
        ka0Var.e();
    }

    @Override // org.telegram.ui.Components.c71
    public final void E(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        int action = motionEvent.getAction();
        ka0 ka0Var = this.U;
        if (action == 0) {
            this.Y = this.y;
            ka0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.zn) {
                boolean P9 = ((org.telegram.ui.zn) n2Var).P9();
                this.Z = true;
                AndroidUtilities.runOnUIThread(new bv(22, this, h2Var), P9 ? 200L : 0L);
            } else {
                this.Z = true;
                setFocusable(true);
                h2Var.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(4, h2Var));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ka0Var.i(true);
        }
    }

    @Override // org.telegram.ui.Components.c71
    public final void G(String str) {
        this.U.j(str);
    }

    @Override // org.telegram.ui.Components.c71
    public final void I(int i10) {
        super.I(i10);
        this.V.setTranslationY(this.c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.c71
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
        ka0 ka0Var = this.U;
        if (ka0Var.b && this.y == 0) {
            this.y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        ka0Var.b = false;
    }
}
