package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class sl0 extends p20 {
    public View a;
    public final /* synthetic */ tl0 b;

    public sl0(tl0 tl0Var) {
        this.b = tl0Var;
    }

    @Override // org.telegram.ui.Components.p20
    public final boolean a() {
        return ((zl0) this.b.b).Y0 != null;
    }

    public final void b(MotionEvent motionEvent, View view) {
        zl0 zl0Var = (zl0) this.b.b;
        if (view != null) {
            if (zl0Var.V0 == null && zl0Var.W0 == null) {
                return;
            }
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            zl0Var.j1(view, x10, y3, true);
            int i10 = zl0Var.O1;
            if (zl0Var.R1 && i10 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                ml0 ml0Var = zl0Var.V0;
                if (ml0Var != null) {
                    ml0Var.d(i10, view);
                } else {
                    nl0 nl0Var = zl0Var.W0;
                    if (nl0Var != null) {
                        nl0Var.c(x10 - view.getX(), y3 - view.getY(), i10, view);
                    }
                }
            }
            rl0 rl0Var = new rl0(this, view, i10, x10, y3);
            zl0Var.S1 = rl0Var;
            AndroidUtilities.runOnUIThread(rl0Var, ViewConfiguration.getPressedStateDuration());
            ql0 ql0Var = zl0Var.e1;
            if (ql0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(ql0Var);
                zl0Var.e1 = null;
                zl0Var.N1 = null;
                zl0Var.P1 = false;
                zl0Var.m1(motionEvent, view);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        nl0 nl0Var;
        zl0 zl0Var = (zl0) this.b.b;
        View view = this.a;
        if (view == null || (nl0Var = zl0Var.W0) == null || !nl0Var.f1(view)) {
            return false;
        }
        zl0Var.W0.s0(this.a, motionEvent.getX(), motionEvent.getY());
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
        zl0 zl0Var = (zl0) this.b.b;
        View view = zl0Var.N1;
        if (view == null || (i10 = zl0Var.O1) == -1) {
            return;
        }
        ol0 ol0Var = zl0Var.X0;
        if (ol0Var == null && zl0Var.Y0 == null) {
            return;
        }
        if (ol0Var != null) {
            if (ol0Var.d(i10, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (zl0Var.Y0.c(motionEvent.getX() - zl0Var.N1.getX(), motionEvent.getY() - zl0Var.N1.getY(), i10, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            zl0Var.Z0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        nl0 nl0Var;
        View view = this.a;
        if (view == null || (nl0Var = ((zl0) this.b.b).W0) == null || !nl0Var.f1(view)) {
            return false;
        }
        b(motionEvent, this.a);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        zl0 zl0Var = (zl0) this.b.b;
        View view = zl0Var.N1;
        if (view != null) {
            nl0 nl0Var = zl0Var.W0;
            if (nl0Var != null && nl0Var.f1(view)) {
                this.a = zl0Var.N1;
                return false;
            }
            b(motionEvent, zl0Var.N1);
        }
        return false;
    }
}
