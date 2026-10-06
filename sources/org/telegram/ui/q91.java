package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class q91 extends org.telegram.ui.Components.h91 {
    public boolean V;
    public final /* synthetic */ ta1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q91(ta1 ta1Var, Activity activity) {
        super(activity, null);
        this.W = ta1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ta1 ta1Var = this.W;
            if (ta1Var.j0 != null) {
                View currentView = getCurrentView();
                me meVar = ta1Var.j0;
                if (currentView == meVar) {
                    boolean G = meVar.G(motionEvent.getX() - ta1Var.j0.getX(), motionEvent.getY() - ta1Var.j0.getY());
                    meVar.Q0 = G;
                    if (G && meVar.a1.b.canScrollHorizontally(-1)) {
                        z10 = true;
                        this.V = z10;
                    }
                }
            }
            z10 = false;
            this.V = z10;
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

    @Override // org.telegram.ui.Components.h91, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.V && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.h91, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.V && B(motionEvent);
    }

    @Override // org.telegram.ui.Components.h91
    public final void u() {
        ta1 ta1Var = this.W;
        ta1Var.k0(ta1Var.h0.getCurrentPosition(), true);
        ta1Var.l0(0.0f, false);
    }

    @Override // org.telegram.ui.Components.h91
    public final void w(boolean z10) {
        ta1 ta1Var = this.W;
        float positionAnimated = ta1Var.h0.getPositionAnimated();
        ta1Var.l0(positionAnimated, !z10);
        if (z10) {
            return;
        }
        ta1Var.k0(Math.round(positionAnimated), true);
    }
}
