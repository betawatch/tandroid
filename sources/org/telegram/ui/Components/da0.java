package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class da0 extends p61 {
    public final int T;
    public final ca0 U;
    public final t00 V;
    public final zw0 W;
    public final zw0 X;
    public float Y;
    public boolean Z;

    public da0(org.telegram.ui.ActionBar.o2 o2Var, long j3) {
        super(o2Var.getParentActivity(), o2Var.getCurrentAccount(), o2Var.getResourceProvider());
        this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        setBackgroundColor(getThemedColor(i10));
        this.L = i10;
        this.K = i10;
        H(0.0f);
        fixNavigationBar(getThemedColor(i10));
        this.G = false;
        this.H = false;
        ca0 ca0Var = new ca0((wh.b) this, o2Var, this.container, j3);
        this.U = ca0Var;
        ca0Var.B = false;
        setDimBehindAlpha(75);
        this.w.J.setHint(LocaleController.getString(R.string.SearchMemberRequests));
        wh.g gVar = ca0Var.f;
        this.f = gVar;
        this.e = gVar;
        this.d.setAdapter(gVar);
        this.d.q1();
        ai.w0 w0Var = this.d;
        ca0Var.p = w0Var;
        w0Var.setOnItemClickListener(new ai.g(ca0Var, 18));
        s4.s0 onScrollListener = w0Var.getOnScrollListener();
        if (onScrollListener == null) {
            w0Var.setOnScrollListener(ca0Var.D);
        } else {
            w0Var.setOnScrollListener(new ii.m3(8, ca0Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.d.getParent()).indexOfChild(this.d);
        t00 b10 = ca0Var.b();
        this.V = b10;
        this.containerView.addView(b10, indexOfChild, w7.x5.c(-1.0f, -1));
        zw0 a2 = ca0Var.a();
        this.W = a2;
        this.containerView.addView(a2, indexOfChild, w7.x5.c(-1.0f, -1));
        zw0 c10 = ca0Var.c();
        this.X = c10;
        this.containerView.addView(c10, indexOfChild, w7.x5.c(-1.0f, -1));
        ca0Var.e();
    }

    @Override // org.telegram.ui.Components.p61
    public final void E(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.ActionBar.o2 o2Var;
        int action = motionEvent.getAction();
        ca0 ca0Var = this.U;
        if (action == 0) {
            this.Y = this.y;
            ca0Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.y - this.Y) < this.T && !this.Z) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                o2Var = (org.telegram.ui.ActionBar.o2) launchActivity.O().getFragmentStack().get(launchActivity.O().getFragmentStack().size() - 1);
            } else {
                o2Var = null;
            }
            if (o2Var instanceof org.telegram.ui.bo) {
                boolean P9 = ((org.telegram.ui.bo) o2Var).P9();
                this.Z = true;
                AndroidUtilities.runOnUIThread(new ny(16, this, h2Var), P9 ? 200L : 0L);
            } else {
                this.Z = true;
                setFocusable(true);
                h2Var.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(4, h2Var));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ca0Var.i(true);
        }
    }

    @Override // org.telegram.ui.Components.p61
    public final void G(String str) {
        this.U.j(str);
    }

    @Override // org.telegram.ui.Components.p61
    public final void I(int i10) {
        super.I(i10);
        this.V.setTranslationY(this.c.getMeasuredHeight() + i10);
        float f7 = i10;
        this.W.setTranslationY(f7);
        this.X.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.p61
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

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onBackPressed() {
        wh.m mVar = this.U.s;
        if (mVar != null) {
            mVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        ca0 ca0Var = this.U;
        if (ca0Var.b && this.y == 0) {
            this.y = AndroidUtilities.dp(8.0f);
        }
        super.show();
        ca0Var.b = false;
    }
}
