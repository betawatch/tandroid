package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public abstract class pa0 extends b71 {
    public final int T;
    public final oa0 U;
    public final u00 V;
    public final ix0 W;
    public final ix0 X;
    public float Y;
    public boolean Z;

    public pa0(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        super(m2Var.getParentActivity(), m2Var.getCurrentAccount(), m2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.h6.a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        H(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        oa0 oa0Var = new oa0((wh.b) this, m2Var, this.container, j3);
        this.U = oa0Var;
        oa0Var.B = false;
        setDimBehindAlpha(75);
        this.w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        wh.g gVar = oa0Var.f;
        this.f = gVar;
        this.e = gVar;
        this.d.setAdapter(gVar);
        this.d.p1();
        ai.w0 w0Var = this.d;
        oa0Var.p = w0Var;
        w0Var.setOnItemClickListener(new ai.g(oa0Var, 18));
        s4.s0 onScrollListener = w0Var.getOnScrollListener();
        if (onScrollListener == null) {
            w0Var.setOnScrollListener(oa0Var.D);
        } else {
            w0Var.setOnScrollListener(new ii.n3(8, oa0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        u00 b10 = oa0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.y5.c(-1.0f, -1));
        ix0 a2 = oa0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.y5.c(-1.0f, -1));
        ix0 c10 = oa0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.y5.c(-1.0f, -1));
        oa0Var.e();
    }

    @Override // org.telegram.ui.Components.b71
    public final void E(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.m2 m2Var;
        int action = motionEvent.getAction();
        oa0 oa0Var = this.U;
        if (action == 0) {
            this.Y = this.y;
            oa0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                m2Var = null;
            }
            if (m2Var instanceof org.telegram.ui.wn) {
                boolean P9 = ((org.telegram.ui.wn) m2Var).P9();
                this.Z = true;
                AndroidUtilities.runOnUIThread(new vw(21, this, h2Var), P9 ? 200L : 0L);
            } else {
                this.Z = true;
                setFocusable(true);
                h2Var.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(4, h2Var));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            oa0Var.i(true);
        }
    }

    @Override // org.telegram.ui.Components.b71
    public final void G(String str) {
        this.U.j(str);
    }

    @Override // org.telegram.ui.Components.b71
    public final void I(int i10) {
        super.I(i10);
        this.V.setTranslationY(this.c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.b71
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

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onBackPressed() {
        wh.m mVar = this.U.s;
        if (mVar != null) {
            mVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        oa0 oa0Var = this.U;
        if (oa0Var.b && this.y == 0) {
            this.y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        oa0Var.b = false;
    }
}
