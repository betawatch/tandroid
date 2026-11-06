package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class hj0 extends b10 {
    public View a;
    public final /* synthetic */ ij0 b;

    public hj0(ij0 ij0Var) {
        this.b = ij0Var;
    }

    @Override // org.telegram.ui.Components.b10
    public final boolean a() {
        return ((pj0) this.b.b).W0 != null;
    }

    public final void b(View view, MotionEvent motionEvent) {
        pj0 pj0Var = (pj0) this.b.b;
        if (view != null) {
            if (pj0Var.T0 == null && pj0Var.U0 == null) {
                return;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            pj0Var.j1(view, x10, y10, true);
            int i7 = pj0Var.M1;
            if (pj0Var.P1 && i7 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                bj0 bj0Var = pj0Var.T0;
                if (bj0Var != null) {
                    bj0Var.c(i7, view);
                } else {
                    cj0 cj0Var = pj0Var.U0;
                    if (cj0Var != null) {
                        cj0Var.f(x10 - view.getX(), y10 - view.getY(), i7, view);
                    }
                }
            }
            gj0 gj0Var = new gj0(this, view, i7, x10, y10);
            pj0Var.Q1 = gj0Var;
            org.telegram.messenger.g0.i3(gj0Var, ViewConfiguration.getPressedStateDuration());
            fj0 fj0Var = pj0Var.c1;
            if (fj0Var != null) {
                org.telegram.messenger.g0.r(fj0Var);
                pj0Var.c1 = null;
                pj0Var.L1 = null;
                pj0Var.N1 = false;
                pj0Var.m1(view, motionEvent);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        cj0 cj0Var;
        pj0 pj0Var = (pj0) this.b.b;
        View view = this.a;
        if (view == null || (cj0Var = pj0Var.U0) == null || !cj0Var.f1(view)) {
            return false;
        }
        pj0Var.U0.r0(this.a, motionEvent.getX(), motionEvent.getY());
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
        pj0 pj0Var = (pj0) this.b.b;
        View view = pj0Var.L1;
        if (view == null || (i7 = pj0Var.M1) == -1) {
            return;
        }
        dj0 dj0Var = pj0Var.V0;
        if (dj0Var == null && pj0Var.W0 == null) {
            return;
        }
        if (dj0Var != null) {
            if (dj0Var.c(i7, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (pj0Var.W0.f(motionEvent.getX() - pj0Var.L1.getX(), motionEvent.getY() - pj0Var.L1.getY(), i7, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            pj0Var.X0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        cj0 cj0Var;
        View view = this.a;
        if (view == null || (cj0Var = ((pj0) this.b.b).U0) == null || !cj0Var.f1(view)) {
            return false;
        }
        b(this.a, motionEvent);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        pj0 pj0Var = (pj0) this.b.b;
        View view = pj0Var.L1;
        if (view != null) {
            cj0 cj0Var = pj0Var.U0;
            if (cj0Var != null && cj0Var.f1(view)) {
                this.a = pj0Var.L1;
                return false;
            }
            b(pj0Var.L1, motionEvent);
        }
        return false;
    }
}
