package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gm0 extends w20 {
    public View a;
    public final /* synthetic */ hm0 b;

    public gm0(hm0 hm0Var) {
        this.b = hm0Var;
    }

    @Override // org.telegram.ui.Components.w20
    public final boolean a() {
        return ((nm0) this.b.b).W0 != null;
    }

    public final void b(MotionEvent motionEvent, View view) {
        nm0 nm0Var = (nm0) this.b.b;
        if (view != null) {
            if (nm0Var.T0 == null && nm0Var.U0 == null) {
                return;
            }
            float x9 = motionEvent.getX();
            float y3 = motionEvent.getY();
            nm0Var.k1(view, x9, y3, true);
            int i10 = nm0Var.M1;
            if (nm0Var.P1 && i10 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                am0 am0Var = nm0Var.T0;
                if (am0Var != null) {
                    am0Var.c(i10, view);
                } else {
                    bm0 bm0Var = nm0Var.U0;
                    if (bm0Var != null) {
                        bm0Var.e(x9 - view.getX(), y3 - view.getY(), i10, view);
                    }
                }
            }
            fm0 fm0Var = new fm0(this, view, i10, x9, y3);
            nm0Var.Q1 = fm0Var;
            AndroidUtilities.runOnUIThread(fm0Var, ViewConfiguration.getPressedStateDuration());
            em0 em0Var = nm0Var.c1;
            if (em0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(em0Var);
                nm0Var.c1 = null;
                nm0Var.L1 = null;
                nm0Var.N1 = false;
                nm0Var.n1(motionEvent, view);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        bm0 bm0Var;
        nm0 nm0Var = (nm0) this.b.b;
        View view = this.a;
        if (view == null || (bm0Var = nm0Var.U0) == null || !bm0Var.c1(view)) {
            return false;
        }
        nm0Var.U0.l0(this.a, motionEvent.getX(), motionEvent.getY());
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
        nm0 nm0Var = (nm0) this.b.b;
        View view = nm0Var.L1;
        if (view == null || (i10 = nm0Var.M1) == -1) {
            return;
        }
        cm0 cm0Var = nm0Var.V0;
        if (cm0Var == null && nm0Var.W0 == null) {
            return;
        }
        if (cm0Var != null) {
            if (cm0Var.c(i10, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (nm0Var.W0.e(motionEvent.getX() - nm0Var.L1.getX(), motionEvent.getY() - nm0Var.L1.getY(), i10, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            nm0Var.X0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        bm0 bm0Var;
        View view = this.a;
        if (view == null || (bm0Var = ((nm0) this.b.b).U0) == null || !bm0Var.c1(view)) {
            return false;
        }
        b(motionEvent, this.a);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        nm0 nm0Var = (nm0) this.b.b;
        View view = nm0Var.L1;
        if (view != null) {
            bm0 bm0Var = nm0Var.U0;
            if (bm0Var != null && bm0Var.c1(view)) {
                this.a = nm0Var.L1;
                return false;
            }
            b(motionEvent, nm0Var.L1);
        }
        return false;
    }
}
