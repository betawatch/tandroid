package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class ha0 extends s61 {
    public final int Q;
    public final ga0 R;
    public final u00 S;
    public final ax0 T;
    public final ax0 U;
    public float V;
    public boolean W;

    public ha0(org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        super(p2Var.getParentActivity(), p2Var.getCurrentAccount(), p2Var.getResourceProvider());
        this.Q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.k6.a7;
        setBackgroundColor(getThemedColor(i10));
        this.I = i10;
        this.H = i10;
        G(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.D = false;
        this.E = false;
        ga0 ga0Var = new ga0((kh.c) this, p2Var, this.container, j10);
        this.R = ga0Var;
        ga0Var.B = false;
        setDimBehindAlpha(75);
        this.w.G.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        kh.n nVar = ga0Var.f;
        this.f = nVar;
        this.e = nVar;
        this.d.setAdapter(nVar);
        this.d.p1();
        mh.d1 d1Var = this.d;
        ga0Var.p = d1Var;
        d1Var.setOnItemClickListener(new ag.h(ga0Var, 5));
        f2.a1 onScrollListener = d1Var.getOnScrollListener();
        if (onScrollListener == null) {
            d1Var.setOnScrollListener(ga0Var.D);
        } else {
            d1Var.setOnScrollListener(new kh.l(0, ga0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        u00 b10 = ga0Var.b();
        this.S = b10;
        this.containerView.addView(b10, indexOfChild, k7.c6.c(-1.0f, -1));
        ax0 a2 = ga0Var.a();
        this.T = a2;
        this.containerView.addView(a2, indexOfChild, k7.c6.c(-1.0f, -1));
        ax0 c3 = ga0Var.c();
        this.U = c3;
        this.containerView.addView(c3, indexOfChild, k7.c6.c(-1.0f, -1));
        ga0Var.e();
    }

    @Override // org.telegram.ui.Components.s61
    public final void D(MotionEvent motionEvent, lg.f fVar) {
        org.telegram.ui.ActionBar.p2 p2Var;
        int action = motionEvent.getAction();
        ga0 ga0Var = this.R;
        if (action == 0) {
            this.V = this.y;
            ga0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.y - this.V) < this.Q && !this.W) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                p2Var = null;
            }
            if (p2Var instanceof org.telegram.ui.xn) {
                boolean P9 = ((org.telegram.ui.xn) p2Var).P9();
                this.W = true;
                AndroidUtilities.runOnUIThread(new a90(3, this, fVar), P9 ? 200L : 0L);
            } else {
                this.W = true;
                setFocusable(true);
                fVar.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(4, fVar));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ga0Var.i(true);
        }
    }

    @Override // org.telegram.ui.Components.s61
    public final void F(String str) {
        this.R.j(str);
    }

    @Override // org.telegram.ui.Components.s61
    public final void H(int i10) {
        super.H(i10);
        this.S.setTranslationY(this.c.getMeasuredHeight() + i10);
        float f10 = i10;
        this.T.setTranslationY(f10);
        this.U.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.s61
    public final void K() {
        mh.d1 d1Var = this.d;
        if (d1Var.getChildCount() > 0) {
            super.K();
            return;
        }
        int paddingTop = d1Var.getVisibility() == 0 ? d1Var.getPaddingTop() - AndroidUtilities.dp(8.0f) : 0;
        if (this.y != paddingTop) {
            this.y = paddingTop;
            H(paddingTop);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        kh.u uVar = this.R.s;
        if (uVar != null) {
            uVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        ga0 ga0Var = this.R;
        if (ga0Var.b && this.y == 0) {
            this.y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        ga0Var.b = false;
    }
}
