package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class gl0 extends m20 {
    public View a;
    public final /* synthetic */ hl0 b;

    public gl0(hl0 hl0Var) {
        this.b = hl0Var;
    }

    @Override // org.telegram.ui.Components.m20
    public final boolean a() {
        return ((ml0) this.b.b).Y0 != null;
    }

    public final void b(MotionEvent motionEvent, View view) {
        ml0 ml0Var = (ml0) this.b.b;
        if (view != null) {
            if (ml0Var.V0 == null && ml0Var.W0 == null) {
                return;
            }
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            ml0Var.h1(view, x10, y3, true);
            int i10 = ml0Var.O1;
            if (ml0Var.R1 && i10 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                al0 al0Var = ml0Var.V0;
                if (al0Var != null) {
                    al0Var.d(i10, view);
                } else {
                    bl0 bl0Var = ml0Var.W0;
                    if (bl0Var != null) {
                        bl0Var.c(x10 - view.getX(), y3 - view.getY(), i10, view);
                    }
                }
            }
            fl0 fl0Var = new fl0(this, view, i10, x10, y3);
            ml0Var.S1 = fl0Var;
            AndroidUtilities.runOnUIThread(fl0Var, ViewConfiguration.getPressedStateDuration());
            el0 el0Var = ml0Var.e1;
            if (el0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(el0Var);
                ml0Var.e1 = null;
                ml0Var.N1 = null;
                ml0Var.P1 = false;
                ml0Var.k1(motionEvent, view);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        bl0 bl0Var;
        ml0 ml0Var = (ml0) this.b.b;
        View view = this.a;
        if (view == null || (bl0Var = ml0Var.W0) == null || !bl0Var.d1(view)) {
            return false;
        }
        ml0Var.W0.r0(this.a, motionEvent.getX(), motionEvent.getY());
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
        ml0 ml0Var = (ml0) this.b.b;
        View view = ml0Var.N1;
        if (view == null || (i10 = ml0Var.O1) == -1) {
            return;
        }
        cl0 cl0Var = ml0Var.X0;
        if (cl0Var == null && ml0Var.Y0 == null) {
            return;
        }
        if (cl0Var != null) {
            if (cl0Var.d(i10, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (ml0Var.Y0.c(motionEvent.getX() - ml0Var.N1.getX(), motionEvent.getY() - ml0Var.N1.getY(), i10, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            ml0Var.Z0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        bl0 bl0Var;
        View view = this.a;
        if (view == null || (bl0Var = ((ml0) this.b.b).W0) == null || !bl0Var.d1(view)) {
            return false;
        }
        b(motionEvent, this.a);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ml0 ml0Var = (ml0) this.b.b;
        View view = ml0Var.N1;
        if (view != null) {
            bl0 bl0Var = ml0Var.W0;
            if (bl0Var != null && bl0Var.d1(view)) {
                this.a = ml0Var.N1;
                return false;
            }
            b(motionEvent, ml0Var.N1);
        }
        return false;
    }
}
