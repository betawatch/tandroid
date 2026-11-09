package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a41 extends org.telegram.ui.Components.w61 {
    public boolean V;
    public final /* synthetic */ d51 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a41(d51 d51Var, Activity activity) {
        super(activity, null);
        this.W = d51Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            d51 d51Var = this.W;
            if (d51Var.j0 != null) {
                View currentView = getCurrentView();
                zd zdVar = d51Var.j0;
                if (currentView == zdVar) {
                    boolean G = zdVar.G(motionEvent.getX() - d51Var.j0.getX(), motionEvent.getY() - d51Var.j0.getY());
                    zdVar.Q0 = G;
                    if (G && zdVar.a1.b.canScrollHorizontally(-1)) {
                        z9 = true;
                        this.V = z9;
                    }
                }
            }
            z9 = false;
            this.V = z9;
        }
        try {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked != 1 && actionMasked != 3) {
                return dispatchTouchEvent;
            }
            this.V = false;
            return dispatchTouchEvent;
        } catch (Throwable th2) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.V = false;
            }
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.w61, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.V && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.w61, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.V && B(motionEvent);
    }

    @Override // org.telegram.ui.Components.w61
    public final void u() {
        d51 d51Var = this.W;
        d51Var.p0(d51Var.h0.getCurrentPosition(), true);
        d51Var.q0(false, 0.0f);
    }

    @Override // org.telegram.ui.Components.w61
    public final void w(boolean z9) {
        d51 d51Var = this.W;
        float positionAnimated = d51Var.h0.getPositionAnimated();
        d51Var.q0(!z9, positionAnimated);
        if (z9) {
            return;
        }
        d51Var.p0(Math.round(positionAnimated), true);
    }
}
