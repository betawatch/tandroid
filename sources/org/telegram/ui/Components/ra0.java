package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public abstract class ra0 extends o71 {
    public final int T;
    public final qa0 U;
    public final w00 V;
    public final ux0 W;
    public final ux0 X;
    public float Y;
    public boolean Z;

    public ra0(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        super(n2Var.getParentActivity(), n2Var.getCurrentAccount(), n2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.i6.a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        F(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        qa0 qa0Var = new qa0((wh.b) this, n2Var, this.container, j3);
        this.U = qa0Var;
        qa0Var.B = false;
        setDimBehindAlpha(75);
        this.w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        wh.g gVar = qa0Var.f;
        this.f = gVar;
        this.e = gVar;
        this.d.setAdapter(gVar);
        this.d.r1();
        ai.w0 w0Var = this.d;
        qa0Var.p = w0Var;
        w0Var.setOnItemClickListener(new ai.g(qa0Var, 18));
        s4.s0 onScrollListener = w0Var.getOnScrollListener();
        if (onScrollListener == null) {
            w0Var.setOnScrollListener(qa0Var.D);
        } else {
            w0Var.setOnScrollListener(new ii.n3(8, qa0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        w00 b10 = qa0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.z5.c(-1.0f, -1));
        ux0 a2 = qa0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.z5.c(-1.0f, -1));
        ux0 c10 = qa0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.z5.c(-1.0f, -1));
        qa0Var.e();
    }

    @Override // org.telegram.ui.Components.o71
    public final void C(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        int action = motionEvent.getAction();
        qa0 qa0Var = this.U;
        if (action == 0) {
            this.Y = this.y;
            qa0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.yn) {
                boolean O9 = ((org.telegram.ui.yn) n2Var).O9();
                this.Z = true;
                AndroidUtilities.runOnUIThread(new yw(20, this, h2Var), O9 ? 200L : 0L);
            } else {
                this.Z = true;
                setFocusable(true);
                h2Var.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(4, h2Var));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            qa0Var.i(true);
        }
    }

    @Override // org.telegram.ui.Components.o71
    public final void E(String str) {
        this.U.j(str);
    }

    @Override // org.telegram.ui.Components.o71
    public final void G(int i10) {
        super.G(i10);
        this.V.setTranslationY(this.c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.o71
    public final void J() {
        ai.w0 w0Var = this.d;
        if (w0Var.getChildCount() > 0) {
            super.J();
            return;
        }
        int paddingTop = w0Var.getVisibility() == 0 ? w0Var.getPaddingTop() - AndroidUtilities.dp(8.0f) : 0;
        if (this.y != paddingTop) {
            this.y = paddingTop;
            G(paddingTop);
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
        qa0 qa0Var = this.U;
        if (qa0Var.b && this.y == 0) {
            this.y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        qa0Var.b = false;
    }
}
