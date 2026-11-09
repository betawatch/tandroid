package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ij0 extends c10 {
    public View a;
    public final /* synthetic */ jj0 b;

    public ij0(jj0 jj0Var) {
        this.b = jj0Var;
    }

    @Override // org.telegram.ui.Components.c10
    public final boolean a() {
        return ((qj0) this.b.b).W0 != null;
    }

    public final void b(View view, MotionEvent motionEvent) {
        qj0 qj0Var = (qj0) this.b.b;
        if (view != null) {
            if (qj0Var.T0 == null && qj0Var.U0 == null) {
                return;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            qj0Var.j1(view, x10, y10, true);
            int i7 = qj0Var.M1;
            if (qj0Var.P1 && i7 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                cj0 cj0Var = qj0Var.T0;
                if (cj0Var != null) {
                    cj0Var.c(i7, view);
                } else {
                    dj0 dj0Var = qj0Var.U0;
                    if (dj0Var != null) {
                        dj0Var.f(x10 - view.getX(), y10 - view.getY(), i7, view);
                    }
                }
            }
            hj0 hj0Var = new hj0(this, view, i7, x10, y10);
            qj0Var.Q1 = hj0Var;
            org.telegram.messenger.g0.i3(hj0Var, ViewConfiguration.getPressedStateDuration());
            gj0 gj0Var = qj0Var.c1;
            if (gj0Var != null) {
                org.telegram.messenger.g0.r(gj0Var);
                qj0Var.c1 = null;
                qj0Var.L1 = null;
                qj0Var.N1 = false;
                qj0Var.m1(view, motionEvent);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        dj0 dj0Var;
        qj0 qj0Var = (qj0) this.b.b;
        View view = this.a;
        if (view == null || (dj0Var = qj0Var.U0) == null || !dj0Var.f1(view)) {
            return false;
        }
        qj0Var.U0.r0(this.a, motionEvent.getX(), motionEvent.getY());
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
        qj0 qj0Var = (qj0) this.b.b;
        View view = qj0Var.L1;
        if (view == null || (i7 = qj0Var.M1) == -1) {
            return;
        }
        ej0 ej0Var = qj0Var.V0;
        if (ej0Var == null && qj0Var.W0 == null) {
            return;
        }
        if (ej0Var != null) {
            if (ej0Var.c(i7, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (qj0Var.W0.f(motionEvent.getX() - qj0Var.L1.getX(), motionEvent.getY() - qj0Var.L1.getY(), i7, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            qj0Var.X0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        dj0 dj0Var;
        View view = this.a;
        if (view == null || (dj0Var = ((qj0) this.b.b).U0) == null || !dj0Var.f1(view)) {
            return false;
        }
        b(this.a, motionEvent);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        qj0 qj0Var = (qj0) this.b.b;
        View view = qj0Var.L1;
        if (view != null) {
            dj0 dj0Var = qj0Var.U0;
            if (dj0Var != null && dj0Var.f1(view)) {
                this.a = qj0Var.L1;
                return false;
            }
            b(qj0Var.L1, motionEvent);
        }
        return false;
    }
}
