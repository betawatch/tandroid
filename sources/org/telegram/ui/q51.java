package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class q51 extends org.telegram.ui.Components.x71 {
    public boolean V;
    public final /* synthetic */ s61 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q51(s61 s61Var, Activity activity) {
        super(activity, null);
        this.W = s61Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            s61 s61Var = this.W;
            if (s61Var.j0 != null) {
                View currentView = getCurrentView();
                le leVar = s61Var.j0;
                if (currentView == leVar) {
                    boolean G = leVar.G(motionEvent.getX() - s61Var.j0.getX(), motionEvent.getY() - s61Var.j0.getY());
                    leVar.Q0 = G;
                    if (G && leVar.a1.b.canScrollHorizontally(-1)) {
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

    @Override // org.telegram.ui.Components.x71, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.V && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.x71, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.V && B(motionEvent);
    }

    @Override // org.telegram.ui.Components.x71
    public final void u() {
        s61 s61Var = this.W;
        s61Var.p0(s61Var.h0.getCurrentPosition(), true);
        s61Var.q0(false, 0.0f);
    }

    @Override // org.telegram.ui.Components.x71
    public final void w(boolean z10) {
        s61 s61Var = this.W;
        float positionAnimated = s61Var.h0.getPositionAnimated();
        s61Var.q0(!z10, positionAnimated);
        if (z10) {
            return;
        }
        s61Var.p0(Math.round(positionAnimated), true);
    }
}
