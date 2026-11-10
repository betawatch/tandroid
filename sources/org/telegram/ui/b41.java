package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b41 extends org.telegram.ui.Components.v61 {
    public boolean V;
    public final /* synthetic */ e51 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(e51 e51Var, Activity activity) {
        super(activity, null);
        this.W = e51Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            e51 e51Var = this.W;
            if (e51Var.j0 != null) {
                View currentView = getCurrentView();
                zd zdVar = e51Var.j0;
                if (currentView == zdVar) {
                    boolean G = zdVar.G(motionEvent.getX() - e51Var.j0.getX(), motionEvent.getY() - e51Var.j0.getY());
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

    @Override // org.telegram.ui.Components.v61, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.V && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.v61, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.V && B(motionEvent);
    }

    @Override // org.telegram.ui.Components.v61
    public final void u() {
        e51 e51Var = this.W;
        e51Var.p0(e51Var.h0.getCurrentPosition(), true);
        e51Var.q0(false, 0.0f);
    }

    @Override // org.telegram.ui.Components.v61
    public final void w(boolean z9) {
        e51 e51Var = this.W;
        float positionAnimated = e51Var.h0.getPositionAnimated();
        e51Var.q0(!z9, positionAnimated);
        if (z9) {
            return;
        }
        e51Var.p0(Math.round(positionAnimated), true);
    }
}
