package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class ga0 extends q61 {
    public final int Q;
    public final fa0 R;
    public final u00 S;
    public final zw0 T;
    public final zw0 U;
    public float V;
    public boolean W;

    public ga0(org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        super(p2Var.getParentActivity(), p2Var.getCurrentAccount(), p2Var.getResourceProvider());
        this.Q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        setBackgroundColor(getThemedColor(i10));
        this.I = i10;
        this.H = i10;
        G(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.D = false;
        this.E = false;
        fa0 fa0Var = new fa0((jh.c) this, p2Var, this.container, j10);
        this.R = fa0Var;
        fa0Var.B = false;
        setDimBehindAlpha(75);
        this.w.G.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        jh.n nVar = fa0Var.f;
        this.f = nVar;
        this.e = nVar;
        this.d.setAdapter(nVar);
        this.d.o1();
        lh.e1 e1Var = this.d;
        fa0Var.p = e1Var;
        e1Var.setOnItemClickListener(new dg.n(fa0Var, 4));
        f2.z0 onScrollListener = e1Var.getOnScrollListener();
        if (onScrollListener == null) {
            e1Var.setOnScrollListener(fa0Var.D);
        } else {
            e1Var.setOnScrollListener(new jh.l(0, fa0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        u00 b10 = fa0Var.b();
        this.S = b10;
        this.containerView.addView(b10, indexOfChild, k7.b6.c(-1.0f, -1));
        zw0 a2 = fa0Var.a();
        this.T = a2;
        this.containerView.addView(a2, indexOfChild, k7.b6.c(-1.0f, -1));
        zw0 c3 = fa0Var.c();
        this.U = c3;
        this.containerView.addView(c3, indexOfChild, k7.b6.c(-1.0f, -1));
        fa0Var.e();
    }

    @Override // org.telegram.ui.Components.q61
    public final void D(MotionEvent motionEvent, kg.f fVar) {
        org.telegram.ui.ActionBar.p2 p2Var;
        int action = motionEvent.getAction();
        fa0 fa0Var = this.R;
        if (action == 0) {
            this.V = this.y;
            fa0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.y - this.V) < this.Q && !this.W) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                p2Var = (org.telegram.ui.ActionBar.p2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                p2Var = null;
            }
            if (p2Var instanceof org.telegram.ui.zn) {
                boolean P9 = ((org.telegram.ui.zn) p2Var).P9();
                this.W = true;
                AndroidUtilities.runOnUIThread(new z80(3, this, fVar), P9 ? 200L : 0L);
            } else {
                this.W = true;
                setFocusable(true);
                fVar.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(4, fVar));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            fa0Var.i(true);
        }
    }

    @Override // org.telegram.ui.Components.q61
    public final void F(String str) {
        this.R.j(str);
    }

    @Override // org.telegram.ui.Components.q61
    public final void H(int i10) {
        super.H(i10);
        this.S.setTranslationY(this.c.getMeasuredHeight() + i10);
        float f10 = i10;
        this.T.setTranslationY(f10);
        this.U.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.q61
    public final void K() {
        lh.e1 e1Var = this.d;
        if (e1Var.getChildCount() > 0) {
            super.K();
            return;
        }
        int paddingTop = e1Var.getVisibility() == 0 ? e1Var.getPaddingTop() - AndroidUtilities.dp(8.0f) : 0;
        if (this.y != paddingTop) {
            this.y = paddingTop;
            H(paddingTop);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onBackPressed() {
        jh.u uVar = this.R.s;
        if (uVar != null) {
            uVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        fa0 fa0Var = this.R;
        if (fa0Var.b && this.y == 0) {
            this.y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        fa0Var.b = false;
    }
}
