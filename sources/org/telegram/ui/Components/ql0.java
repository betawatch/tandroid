package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ql0 extends m20 {
    public View a;
    public final /* synthetic */ rl0 b;

    public ql0(rl0 rl0Var) {
        this.b = rl0Var;
    }

    @Override // org.telegram.ui.Components.m20
    public final boolean a() {
        return ((wl0) this.b.b).Y0 != null;
    }

    public final void b(MotionEvent motionEvent, View view) {
        wl0 wl0Var = (wl0) this.b.b;
        if (view != null) {
            if (wl0Var.V0 == null && wl0Var.W0 == null) {
                return;
            }
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            wl0Var.h1(view, x10, y3, true);
            int i10 = wl0Var.O1;
            if (wl0Var.R1 && i10 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                kl0 kl0Var = wl0Var.V0;
                if (kl0Var != null) {
                    kl0Var.d(i10, view);
                } else {
                    ll0 ll0Var = wl0Var.W0;
                    if (ll0Var != null) {
                        ll0Var.c(x10 - view.getX(), y3 - view.getY(), i10, view);
                    }
                }
            }
            pl0 pl0Var = new pl0(this, view, i10, x10, y3);
            wl0Var.S1 = pl0Var;
            AndroidUtilities.runOnUIThread(pl0Var, ViewConfiguration.getPressedStateDuration());
            ol0 ol0Var = wl0Var.e1;
            if (ol0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(ol0Var);
                wl0Var.e1 = null;
                wl0Var.N1 = null;
                wl0Var.P1 = false;
                wl0Var.k1(motionEvent, view);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ll0 ll0Var;
        wl0 wl0Var = (wl0) this.b.b;
        View view = this.a;
        if (view == null || (ll0Var = wl0Var.W0) == null || !ll0Var.d1(view)) {
            return false;
        }
        wl0Var.W0.r0(this.a, motionEvent.getX(), motionEvent.getY());
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
        wl0 wl0Var = (wl0) this.b.b;
        View view = wl0Var.N1;
        if (view == null || (i10 = wl0Var.O1) == -1) {
            return;
        }
        ml0 ml0Var = wl0Var.X0;
        if (ml0Var == null && wl0Var.Y0 == null) {
            return;
        }
        if (ml0Var != null) {
            if (ml0Var.d(i10, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (wl0Var.Y0.c(motionEvent.getX() - wl0Var.N1.getX(), motionEvent.getY() - wl0Var.N1.getY(), i10, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            wl0Var.Z0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ll0 ll0Var;
        View view = this.a;
        if (view == null || (ll0Var = ((wl0) this.b.b).W0) == null || !ll0Var.d1(view)) {
            return false;
        }
        b(motionEvent, this.a);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        wl0 wl0Var = (wl0) this.b.b;
        View view = wl0Var.N1;
        if (view != null) {
            ll0 ll0Var = wl0Var.W0;
            if (ll0Var != null && ll0Var.d1(view)) {
                this.a = wl0Var.N1;
                return false;
            }
            b(motionEvent, wl0Var.N1);
        }
        return false;
    }
}
