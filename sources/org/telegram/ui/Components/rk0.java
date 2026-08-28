package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rk0 extends w10 {
    public View a;
    public final /* synthetic */ f2.a0 b;

    public rk0(f2.a0 a0Var) {
        this.b = a0Var;
    }

    @Override // org.telegram.ui.Components.w10
    public final boolean a() {
        return ((wk0) this.b.b).U0 != null;
    }

    public final void b(MotionEvent motionEvent, View view) {
        wk0 wk0Var = (wk0) this.b.b;
        if (view != null) {
            if (wk0Var.R0 == null && wk0Var.S0 == null) {
                return;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            wk0Var.h1(view, x10, y10, true);
            int i9 = wk0Var.K1;
            if (wk0Var.N1 && i9 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                mk0 mk0Var = wk0Var.R0;
                if (mk0Var != null) {
                    mk0Var.a(i9, view);
                } else {
                    nk0 nk0Var = wk0Var.S0;
                    if (nk0Var != null) {
                        nk0Var.c(x10 - view.getX(), y10 - view.getY(), i9, view);
                    }
                }
            }
            qk0 qk0Var = new qk0(this, view, i9, x10, y10);
            wk0Var.O1 = qk0Var;
            AndroidUtilities.runOnUIThread(qk0Var, ViewConfiguration.getPressedStateDuration());
            ag.d dVar = wk0Var.a1;
            if (dVar != null) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
                wk0Var.a1 = null;
                wk0Var.J1 = null;
                wk0Var.L1 = false;
                wk0Var.k1(motionEvent, view);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        nk0 nk0Var;
        wk0 wk0Var = (wk0) this.b.b;
        View view = this.a;
        if (view == null || (nk0Var = wk0Var.S0) == null || !nk0Var.f1(view)) {
            return false;
        }
        wk0Var.S0.g0(this.a, motionEvent.getX(), motionEvent.getY());
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        int i9;
        wk0 wk0Var = (wk0) this.b.b;
        View view = wk0Var.J1;
        if (view == null || (i9 = wk0Var.K1) == -1) {
            return;
        }
        ok0 ok0Var = wk0Var.T0;
        if (ok0Var == null && wk0Var.U0 == null) {
            return;
        }
        if (ok0Var != null) {
            if (ok0Var.a(i9, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (wk0Var.U0.c(motionEvent.getX() - wk0Var.J1.getX(), motionEvent.getY() - wk0Var.J1.getY(), i9, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            wk0Var.V0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        nk0 nk0Var;
        View view = this.a;
        if (view == null || (nk0Var = ((wk0) this.b.b).S0) == null || !nk0Var.f1(view)) {
            return false;
        }
        b(motionEvent, this.a);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        wk0 wk0Var = (wk0) this.b.b;
        View view = wk0Var.J1;
        if (view != null) {
            nk0 nk0Var = wk0Var.S0;
            if (nk0Var != null && nk0Var.f1(view)) {
                this.a = wk0Var.J1;
                return false;
            }
            b(motionEvent, wk0Var.J1);
        }
        return false;
    }
}
