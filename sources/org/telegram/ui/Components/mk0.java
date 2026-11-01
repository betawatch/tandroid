package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class mk0 extends r10 {
    public View a;
    public final /* synthetic */ nk0 b;

    public mk0(nk0 nk0Var) {
        this.b = nk0Var;
    }

    @Override // org.telegram.ui.Components.r10
    public final boolean a() {
        return ((uk0) this.b.b).W0 != null;
    }

    public final void b(View view, MotionEvent motionEvent) {
        uk0 uk0Var = (uk0) this.b.b;
        if (view != null) {
            if (uk0Var.T0 == null && uk0Var.U0 == null) {
                return;
            }
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            uk0Var.j1(view, x10, y3, true);
            int i10 = uk0Var.M1;
            if (uk0Var.P1 && i10 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                hk0 hk0Var = uk0Var.T0;
                if (hk0Var != null) {
                    hk0Var.f(i10, view);
                } else {
                    ik0 ik0Var = uk0Var.U0;
                    if (ik0Var != null) {
                        ik0Var.b(x10 - view.getX(), y3 - view.getY(), i10, view);
                    }
                }
            }
            lk0 lk0Var = new lk0(this, view, i10, x10, y3);
            uk0Var.Q1 = lk0Var;
            org.telegram.messenger.i0.h3(lk0Var, ViewConfiguration.getPressedStateDuration());
            lg.k kVar = uk0Var.c1;
            if (kVar != null) {
                org.telegram.messenger.i0.r(kVar);
                uk0Var.c1 = null;
                uk0Var.L1 = null;
                uk0Var.N1 = false;
                uk0Var.m1(view, motionEvent);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ik0 ik0Var;
        uk0 uk0Var = (uk0) this.b.b;
        View view = this.a;
        if (view == null || (ik0Var = uk0Var.U0) == null || !ik0Var.h1(view)) {
            return false;
        }
        uk0Var.U0.q0(this.a, motionEvent.getX(), motionEvent.getY());
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
        uk0 uk0Var = (uk0) this.b.b;
        View view = uk0Var.L1;
        if (view == null || (i10 = uk0Var.M1) == -1) {
            return;
        }
        jk0 jk0Var = uk0Var.V0;
        if (jk0Var == null && uk0Var.W0 == null) {
            return;
        }
        if (jk0Var != null) {
            if (jk0Var.f(i10, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (uk0Var.W0.b(motionEvent.getX() - uk0Var.L1.getX(), motionEvent.getY() - uk0Var.L1.getY(), i10, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            uk0Var.X0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ik0 ik0Var;
        View view = this.a;
        if (view == null || (ik0Var = ((uk0) this.b.b).U0) == null || !ik0Var.h1(view)) {
            return false;
        }
        b(this.a, motionEvent);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        uk0 uk0Var = (uk0) this.b.b;
        View view = uk0Var.L1;
        if (view != null) {
            ik0 ik0Var = uk0Var.U0;
            if (ik0Var != null && ik0Var.h1(view)) {
                this.a = uk0Var.L1;
                return false;
            }
            b(uk0Var.L1, motionEvent);
        }
        return false;
    }
}
