package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lj0 extends x00 {
    public View a;
    public final /* synthetic */ mj0 b;

    public lj0(mj0 mj0Var) {
        this.b = mj0Var;
    }

    @Override // org.telegram.ui.Components.x00
    public final boolean a() {
        return ((tj0) this.b.b).X0 != null;
    }

    public final void b(View view, MotionEvent motionEvent) {
        tj0 tj0Var = (tj0) this.b.b;
        if (view != null) {
            if (tj0Var.U0 == null && tj0Var.V0 == null) {
                return;
            }
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            tj0Var.j1(view, x10, y9, true);
            int i3 = tj0Var.N1;
            if (tj0Var.Q1 && i3 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                fj0 fj0Var = tj0Var.U0;
                if (fj0Var != null) {
                    fj0Var.f(i3, view);
                } else {
                    gj0 gj0Var = tj0Var.V0;
                    if (gj0Var != null) {
                        gj0Var.b(x10 - view.getX(), y9 - view.getY(), i3, view);
                    }
                }
            }
            kj0 kj0Var = new kj0(this, view, i3, x10, y9);
            tj0Var.R1 = kj0Var;
            org.telegram.messenger.g0.i3(kj0Var, ViewConfiguration.getPressedStateDuration());
            jj0 jj0Var = tj0Var.d1;
            if (jj0Var != null) {
                org.telegram.messenger.g0.r(jj0Var);
                tj0Var.d1 = null;
                tj0Var.M1 = null;
                tj0Var.O1 = false;
                tj0Var.m1(view, motionEvent);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        gj0 gj0Var;
        tj0 tj0Var = (tj0) this.b.b;
        View view = this.a;
        if (view == null || (gj0Var = tj0Var.V0) == null || !gj0Var.b1(view)) {
            return false;
        }
        tj0Var.V0.r0(this.a, motionEvent.getX(), motionEvent.getY());
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        int i3;
        tj0 tj0Var = (tj0) this.b.b;
        View view = tj0Var.M1;
        if (view == null || (i3 = tj0Var.N1) == -1) {
            return;
        }
        hj0 hj0Var = tj0Var.W0;
        if (hj0Var == null && tj0Var.X0 == null) {
            return;
        }
        if (hj0Var != null) {
            if (hj0Var.f(i3, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (tj0Var.X0.b(motionEvent.getX() - tj0Var.M1.getX(), motionEvent.getY() - tj0Var.M1.getY(), i3, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            tj0Var.Y0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        gj0 gj0Var;
        View view = this.a;
        if (view == null || (gj0Var = ((tj0) this.b.b).V0) == null || !gj0Var.b1(view)) {
            return false;
        }
        b(this.a, motionEvent);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        tj0 tj0Var = (tj0) this.b.b;
        View view = tj0Var.M1;
        if (view != null) {
            gj0 gj0Var = tj0Var.V0;
            if (gj0Var != null && gj0Var.b1(view)) {
                this.a = tj0Var.M1;
                return false;
            }
            b(tj0Var.M1, motionEvent);
        }
        return false;
    }
}
