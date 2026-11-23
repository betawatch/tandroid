package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class wj0 extends p10 {
    public View a;
    public final /* synthetic */ xj0 b;

    public wj0(xj0 xj0Var) {
        this.b = xj0Var;
    }

    @Override // org.telegram.ui.Components.p10
    public final boolean a() {
        return ((ek0) this.b.b).X0 != null;
    }

    public final void b(View view, MotionEvent motionEvent) {
        ek0 ek0Var = (ek0) this.b.b;
        if (view != null) {
            if (ek0Var.U0 == null && ek0Var.V0 == null) {
                return;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            ek0Var.j1(view, x10, y10, true);
            int i7 = ek0Var.N1;
            if (ek0Var.Q1 && i7 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                qj0 qj0Var = ek0Var.U0;
                if (qj0Var != null) {
                    qj0Var.c(i7, view);
                } else {
                    rj0 rj0Var = ek0Var.V0;
                    if (rj0Var != null) {
                        rj0Var.f(x10 - view.getX(), y10 - view.getY(), i7, view);
                    }
                }
            }
            vj0 vj0Var = new vj0(this, view, i7, x10, y10);
            ek0Var.R1 = vj0Var;
            org.telegram.messenger.g0.h3(vj0Var, ViewConfiguration.getPressedStateDuration());
            uj0 uj0Var = ek0Var.d1;
            if (uj0Var != null) {
                org.telegram.messenger.g0.r(uj0Var);
                ek0Var.d1 = null;
                ek0Var.M1 = null;
                ek0Var.O1 = false;
                ek0Var.m1(view, motionEvent);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        rj0 rj0Var;
        ek0 ek0Var = (ek0) this.b.b;
        View view = this.a;
        if (view == null || (rj0Var = ek0Var.V0) == null || !rj0Var.b1(view)) {
            return false;
        }
        ek0Var.V0.s0(this.a, motionEvent.getX(), motionEvent.getY());
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        int i7;
        ek0 ek0Var = (ek0) this.b.b;
        View view = ek0Var.M1;
        if (view == null || (i7 = ek0Var.N1) == -1) {
            return;
        }
        sj0 sj0Var = ek0Var.W0;
        if (sj0Var == null && ek0Var.X0 == null) {
            return;
        }
        if (sj0Var != null) {
            if (sj0Var.c(i7, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (ek0Var.X0.f(motionEvent.getX() - ek0Var.M1.getX(), motionEvent.getY() - ek0Var.M1.getY(), i7, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            ek0Var.Y0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        rj0 rj0Var;
        View view = this.a;
        if (view == null || (rj0Var = ((ek0) this.b.b).V0) == null || !rj0Var.b1(view)) {
            return false;
        }
        b(this.a, motionEvent);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ek0 ek0Var = (ek0) this.b.b;
        View view = ek0Var.M1;
        if (view != null) {
            rj0 rj0Var = ek0Var.V0;
            if (rj0Var != null && rj0Var.b1(view)) {
                this.a = ek0Var.M1;
                return false;
            }
            b(ek0Var.M1, motionEvent);
        }
        return false;
    }
}
