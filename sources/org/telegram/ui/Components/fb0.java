package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class fb0 extends t71 {
    public final int T;
    public final eb0 U;
    public final j10 V;
    public final ay0 W;
    public final ay0 X;
    public float Y;
    public boolean Z;

    public fb0(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        super(n2Var.getParentActivity(), n2Var.getCurrentAccount(), n2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.i6.a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        I(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        eb0 eb0Var = new eb0((wh.b) this, n2Var, this.container, j3);
        this.U = eb0Var;
        eb0Var.B = false;
        setDimBehindAlpha(75);
        this.w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        wh.g gVar = eb0Var.f;
        this.f = gVar;
        this.e = gVar;
        this.d.setAdapter(gVar);
        this.d.p1();
        ai.w0 w0Var = this.d;
        eb0Var.p = w0Var;
        w0Var.setOnItemClickListener(new ai.g(eb0Var, 18));
        s4.t0 onScrollListener = w0Var.getOnScrollListener();
        if (onScrollListener == null) {
            w0Var.setOnScrollListener(eb0Var.D);
        } else {
            w0Var.setOnScrollListener(new ii.n3(8, eb0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        j10 b10 = eb0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.x5.d(-1.0f, -1));
        ay0 a2 = eb0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.x5.d(-1.0f, -1));
        ay0 c10 = eb0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.x5.d(-1.0f, -1));
        eb0Var.e();
    }

    @Override // org.telegram.ui.Components.t71
    public final void F(MotionEvent motionEvent, ci.g2 g2Var) {
        org.telegram.ui.ActionBar.n2 n2Var;
        int action = motionEvent.getAction();
        eb0 eb0Var = this.U;
        if (action == 0) {
            this.Y = this.y;
            eb0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof org.telegram.ui.zn) {
                boolean U9 = ((org.telegram.ui.zn) n2Var).U9();
                this.Z = true;
                AndroidUtilities.runOnUIThread(new zr(28, this, g2Var), U9 ? 200L : 0L);
            } else {
                this.Z = true;
                setFocusable(true);
                g2Var.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(3, g2Var));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            eb0Var.i(true);
        }
    }

    @Override // org.telegram.ui.Components.t71
    public final void H(String str) {
        this.U.j(str);
    }

    @Override // org.telegram.ui.Components.t71
    public final void J(int i10) {
        super.J(i10);
        this.V.setTranslationY(this.c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.t71
    public final void M() {
        ai.w0 w0Var = this.d;
        if (w0Var.getChildCount() > 0) {
            super.M();
            return;
        }
        int paddingTop = w0Var.getVisibility() == 0 ? w0Var.getPaddingTop() - AndroidUtilities.dp(8.0f) : 0;
        if (this.y != paddingTop) {
            this.y = paddingTop;
            J(paddingTop);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        wh.k kVar = this.U.s;
        if (kVar != null) {
            kVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        eb0 eb0Var = this.U;
        if (eb0Var.b && this.y == 0) {
            this.y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        eb0Var.b = false;
    }
}
