package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class km0 extends c30 {
    public View a;
    public final /* synthetic */ lm0 b;

    public km0(lm0 lm0Var) {
        this.b = lm0Var;
    }

    @Override // org.telegram.ui.Components.c30
    public final boolean a() {
        return ((qm0) this.b.b).W0 != null;
    }

    public final void b(MotionEvent motionEvent, View view) {
        qm0 qm0Var = (qm0) this.b.b;
        if (view != null) {
            if (qm0Var.T0 == null && qm0Var.U0 == null) {
                return;
            }
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            qm0Var.h1(view, x10, y3, true);
            int i10 = qm0Var.M1;
            if (qm0Var.P1 && i10 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                em0 em0Var = qm0Var.T0;
                if (em0Var != null) {
                    em0Var.d(i10, view);
                } else {
                    fm0 fm0Var = qm0Var.U0;
                    if (fm0Var != null) {
                        fm0Var.c(x10 - view.getX(), y3 - view.getY(), i10, view);
                    }
                }
            }
            jm0 jm0Var = new jm0(this, view, i10, x10, y3);
            qm0Var.Q1 = jm0Var;
            AndroidUtilities.runOnUIThread(jm0Var, ViewConfiguration.getPressedStateDuration());
            im0 im0Var = qm0Var.c1;
            if (im0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(im0Var);
                qm0Var.c1 = null;
                qm0Var.L1 = null;
                qm0Var.N1 = false;
                qm0Var.k1(motionEvent, view);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        fm0 fm0Var;
        qm0 qm0Var = (qm0) this.b.b;
        View view = this.a;
        if (view == null || (fm0Var = qm0Var.U0) == null || !fm0Var.Y0(view)) {
            return false;
        }
        qm0Var.U0.n0(this.a, motionEvent.getX(), motionEvent.getY());
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
        qm0 qm0Var = (qm0) this.b.b;
        View view = qm0Var.L1;
        if (view == null || (i10 = qm0Var.M1) == -1) {
            return;
        }
        gm0 gm0Var = qm0Var.V0;
        if (gm0Var == null && qm0Var.W0 == null) {
            return;
        }
        if (gm0Var != null) {
            if (gm0Var.d(i10, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (qm0Var.W0.c(motionEvent.getX() - qm0Var.L1.getX(), motionEvent.getY() - qm0Var.L1.getY(), i10, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            qm0Var.X0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        fm0 fm0Var;
        View view = this.a;
        if (view == null || (fm0Var = ((qm0) this.b.b).U0) == null || !fm0Var.Y0(view)) {
            return false;
        }
        b(motionEvent, this.a);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        qm0 qm0Var = (qm0) this.b.b;
        View view = qm0Var.L1;
        if (view != null) {
            fm0 fm0Var = qm0Var.U0;
            if (fm0Var != null && fm0Var.Y0(view)) {
                this.a = qm0Var.L1;
                return false;
            }
            b(motionEvent, qm0Var.L1);
        }
        return false;
    }
}
