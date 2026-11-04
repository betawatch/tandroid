package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p31 extends org.telegram.ui.Components.n61 {
    public boolean W;
    public final /* synthetic */ r41 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p31(r41 r41Var, Activity activity) {
        super(activity, null);
        this.a0 = r41Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            r41 r41Var = this.a0;
            if (r41Var.k0 != null) {
                View currentView = getCurrentView();
                xd xdVar = r41Var.k0;
                if (currentView == xdVar) {
                    boolean G = xdVar.G(motionEvent.getX() - r41Var.k0.getX(), motionEvent.getY() - r41Var.k0.getY());
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

    @Override // org.telegram.ui.Components.n61, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.W && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.n61, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.W && A(motionEvent);
    }

    @Override // org.telegram.ui.Components.n61
    public final void s() {
        r41 r41Var = this.a0;
        r41Var.p0(r41Var.i0.getCurrentPosition(), true);
        r41Var.q0(false, 0.0f);
    }

    @Override // org.telegram.ui.Components.n61
    public final void u(boolean z10) {
        r41 r41Var = this.a0;
        float positionAnimated = r41Var.i0.getPositionAnimated();
        r41Var.q0(!z10, positionAnimated);
        if (z10) {
            return;
        }
        r41Var.p0(Math.round(positionAnimated), true);
    }
}
