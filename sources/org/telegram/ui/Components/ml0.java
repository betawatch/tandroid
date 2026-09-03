package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ml0 extends n20 {
    public View a;
    public final /* synthetic */ f2.y b;

    public ml0(f2.y yVar) {
        this.b = yVar;
    }

    @Override // org.telegram.ui.Components.n20
    public final boolean a() {
        return ((rl0) this.b.b).V0 != null;
    }

    public final void b(MotionEvent motionEvent, View view) {
        rl0 rl0Var = (rl0) this.b.b;
        if (view != null) {
            if (rl0Var.S0 == null && rl0Var.T0 == null) {
                return;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            rl0Var.g1(view, x10, y10, true);
            int i10 = rl0Var.L1;
            if (rl0Var.O1 && i10 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                hl0 hl0Var = rl0Var.S0;
                if (hl0Var != null) {
                    hl0Var.d(i10, view);
                } else {
                    il0 il0Var = rl0Var.T0;
                    if (il0Var != null) {
                        il0Var.c(x10 - view.getX(), y10 - view.getY(), i10, view);
                    }
                }
            }
            ll0 ll0Var = new ll0(this, view, i10, x10, y10);
            rl0Var.P1 = ll0Var;
            AndroidUtilities.runOnUIThread(ll0Var, ViewConfiguration.getPressedStateDuration());
            fg.d dVar = rl0Var.b1;
            if (dVar != null) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
                rl0Var.b1 = null;
                rl0Var.K1 = null;
                rl0Var.M1 = false;
                rl0Var.j1(motionEvent, view);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        il0 il0Var;
        rl0 rl0Var = (rl0) this.b.b;
        View view = this.a;
        if (view == null || (il0Var = rl0Var.T0) == null || !il0Var.Z0(view)) {
            return false;
        }
        rl0Var.T0.n0(this.a, motionEvent.getX(), motionEvent.getY());
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        int i10;
        rl0 rl0Var = (rl0) this.b.b;
        View view = rl0Var.K1;
        if (view == null || (i10 = rl0Var.L1) == -1) {
            return;
        }
        jl0 jl0Var = rl0Var.U0;
        if (jl0Var == null && rl0Var.V0 == null) {
            return;
        }
        if (jl0Var != null) {
            if (jl0Var.d(i10, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (rl0Var.V0.c(motionEvent.getX() - rl0Var.K1.getX(), motionEvent.getY() - rl0Var.K1.getY(), i10, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            rl0Var.W0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        il0 il0Var;
        View view = this.a;
        if (view == null || (il0Var = ((rl0) this.b.b).T0) == null || !il0Var.Z0(view)) {
            return false;
        }
        b(motionEvent, this.a);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        rl0 rl0Var = (rl0) this.b.b;
        View view = rl0Var.K1;
        if (view != null) {
            il0 il0Var = rl0Var.T0;
            if (il0Var != null && il0Var.Z0(view)) {
                this.a = rl0Var.K1;
                return false;
            }
            b(motionEvent, rl0Var.K1);
        }
        return false;
    }
}
