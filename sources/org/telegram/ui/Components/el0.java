package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class el0 extends h20 {
    public View a;
    public final /* synthetic */ f2.y b;

    public el0(f2.y yVar) {
        this.b = yVar;
    }

    @Override // org.telegram.ui.Components.h20
    public final boolean a() {
        return ((jl0) this.b.b).U0 != null;
    }

    public final void b(MotionEvent motionEvent, View view) {
        jl0 jl0Var = (jl0) this.b.b;
        if (view != null) {
            if (jl0Var.R0 == null && jl0Var.S0 == null) {
                return;
            }
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            jl0Var.h1(view, x4, y8, true);
            int i10 = jl0Var.K1;
            if (jl0Var.N1 && i10 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                zk0 zk0Var = jl0Var.R0;
                if (zk0Var != null) {
                    zk0Var.c(i10, view);
                } else {
                    al0 al0Var = jl0Var.S0;
                    if (al0Var != null) {
                        al0Var.b(x4 - view.getX(), y8 - view.getY(), i10, view);
                    }
                }
            }
            dl0 dl0Var = new dl0(this, view, i10, x4, y8);
            jl0Var.O1 = dl0Var;
            AndroidUtilities.runOnUIThread(dl0Var, ViewConfiguration.getPressedStateDuration());
            dg.d dVar = jl0Var.a1;
            if (dVar != null) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
                jl0Var.a1 = null;
                jl0Var.J1 = null;
                jl0Var.L1 = false;
                jl0Var.k1(motionEvent, view);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        al0 al0Var;
        jl0 jl0Var = (jl0) this.b.b;
        View view = this.a;
        if (view == null || (al0Var = jl0Var.S0) == null || !al0Var.b1(view)) {
            return false;
        }
        jl0Var.S0.o0(this.a, motionEvent.getX(), motionEvent.getY());
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
        jl0 jl0Var = (jl0) this.b.b;
        View view = jl0Var.J1;
        if (view == null || (i10 = jl0Var.K1) == -1) {
            return;
        }
        bl0 bl0Var = jl0Var.T0;
        if (bl0Var == null && jl0Var.U0 == null) {
            return;
        }
        if (bl0Var != null) {
            if (bl0Var.c(i10, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (jl0Var.U0.b(motionEvent.getX() - jl0Var.J1.getX(), motionEvent.getY() - jl0Var.J1.getY(), i10, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            jl0Var.V0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        al0 al0Var;
        View view = this.a;
        if (view == null || (al0Var = ((jl0) this.b.b).S0) == null || !al0Var.b1(view)) {
            return false;
        }
        b(motionEvent, this.a);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        jl0 jl0Var = (jl0) this.b.b;
        View view = jl0Var.J1;
        if (view != null) {
            al0 al0Var = jl0Var.S0;
            if (al0Var != null && al0Var.b1(view)) {
                this.a = jl0Var.J1;
                return false;
            }
            b(motionEvent, jl0Var.J1);
        }
        return false;
    }
}
