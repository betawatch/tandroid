package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class eb0 extends q71 {
    public final int T;
    public final db0 U;
    public final f10 V;
    public final wx0 W;
    public final wx0 X;
    public float Y;
    public boolean Z;

    public eb0(org.telegram.ui.ActionBar.m2 m2Var, long j10) {
        super(m2Var.getParentActivity(), m2Var.getCurrentAccount(), m2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        I(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        db0 db0Var = new db0((xh.b) this, m2Var, this.container, j10);
        this.U = db0Var;
        db0Var.B = false;
        setDimBehindAlpha(75);
        this.w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        xh.g gVar = db0Var.f;
        this.f = gVar;
        this.e = gVar;
        this.d.setAdapter(gVar);
        this.d.p1();
        bi.o0 o0Var = this.d;
        db0Var.p = o0Var;
        o0Var.setOnItemClickListener(new bi.d(db0Var, 18));
        s4.r0 onScrollListener = o0Var.getOnScrollListener();
        if (onScrollListener == null) {
            o0Var.setOnScrollListener(db0Var.D);
        } else {
            o0Var.setOnScrollListener(new ji.n3(8, db0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        f10 b10 = db0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.a6.d(-1.0f, -1));
        wx0 a2 = db0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.a6.d(-1.0f, -1));
        wx0 c10 = db0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.a6.d(-1.0f, -1));
        db0Var.e();
    }

    @Override // org.telegram.ui.Components.q71
    public final void F(MotionEvent motionEvent, di.g2 g2Var) {
        org.telegram.ui.ActionBar.m2 m2Var;
        int action = motionEvent.getAction();
        db0 db0Var = this.U;
        if (action == 0) {
            this.Y = this.y;
            db0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                m2Var = (org.telegram.ui.ActionBar.m2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                m2Var = null;
            }
            if (m2Var instanceof org.telegram.ui.fo) {
                boolean U9 = ((org.telegram.ui.fo) m2Var).U9();
                this.Z = true;
                AndroidUtilities.runOnUIThread(new f60(9, this, g2Var), U9 ? 200L : 0L);
            } else {
                this.Z = true;
                setFocusable(true);
                g2Var.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(3, g2Var));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            db0Var.i(true);
        }
    }

    @Override // org.telegram.ui.Components.q71
    public final void H(String str) {
        this.U.j(str);
    }

    @Override // org.telegram.ui.Components.q71
    public final void J(int i10) {
        super.J(i10);
        this.V.setTranslationY(this.c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.q71
    public final void M() {
        bi.o0 o0Var = this.d;
        if (o0Var.getChildCount() > 0) {
            super.M();
            return;
        }
        int paddingTop = o0Var.getVisibility() == 0 ? o0Var.getPaddingTop() - AndroidUtilities.dp(8.0f) : 0;
        if (this.y != paddingTop) {
            this.y = paddingTop;
            J(paddingTop);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onBackPressed() {
        xh.k kVar = this.U.s;
        if (kVar != null) {
            kVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        db0 db0Var = this.U;
        if (db0Var.b && this.y == 0) {
            this.y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        db0Var.b = false;
    }
}
