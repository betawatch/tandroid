package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class a41 extends org.telegram.ui.Components.j71 {
    public boolean W;
    public final /* synthetic */ c51 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a41(c51 c51Var, Activity activity) {
        super(activity, null);
        this.a0 = c51Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c51 c51Var = this.a0;
            if (c51Var.k0 != null) {
                View currentView = getCurrentView();
                xd xdVar = c51Var.k0;
                if (currentView == xdVar) {
                    boolean G = xdVar.G(motionEvent.getX() - c51Var.k0.getX(), motionEvent.getY() - c51Var.k0.getY());
                    xdVar.R0 = G;
                    if (G && xdVar.b1.b.canScrollHorizontally(-1)) {
                        z10 = true;
                        this.W = z10;
                    }
                }
            }
            z10 = false;
            this.W = z10;
        }
        try {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked != 1 && actionMasked != 3) {
                return dispatchTouchEvent;
            }
            this.W = false;
            return dispatchTouchEvent;
        } catch (Throwable th2) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.W = false;
            }
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.j71, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.W && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.j71, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.W && x(motionEvent);
    }

    @Override // org.telegram.ui.Components.j71
    public final void q() {
        c51 c51Var = this.a0;
        c51Var.p0(c51Var.i0.getCurrentPosition(), true);
        c51Var.q0(false, 0.0f);
    }

    @Override // org.telegram.ui.Components.j71
    public final void s(boolean z10) {
        c51 c51Var = this.a0;
        float positionAnimated = c51Var.i0.getPositionAnimated();
        c51Var.q0(!z10, positionAnimated);
        if (z10) {
            return;
        }
        c51Var.p0(Math.round(positionAnimated), true);
    }
}
