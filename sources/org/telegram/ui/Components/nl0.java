package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class nl0 extends m20 {
    public View a;
    public final /* synthetic */ f2.y b;

    public nl0(f2.y yVar) {
        this.b = yVar;
    }

    @Override // org.telegram.ui.Components.m20
    public final boolean a() {
        return ((sl0) this.b.b).V0 != null;
    }

    public final void b(MotionEvent motionEvent, View view) {
        sl0 sl0Var = (sl0) this.b.b;
        if (view != null) {
            if (sl0Var.S0 == null && sl0Var.T0 == null) {
                return;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            sl0Var.h1(view, x10, y10, true);
            int i10 = sl0Var.L1;
            if (sl0Var.O1 && i10 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                il0 il0Var = sl0Var.S0;
                if (il0Var != null) {
                    il0Var.f(i10, view);
                } else {
                    jl0 jl0Var = sl0Var.T0;
                    if (jl0Var != null) {
                        jl0Var.c(x10 - view.getX(), y10 - view.getY(), i10, view);
                    }
                }
            }
            ml0 ml0Var = new ml0(this, view, i10, x10, y10);
            sl0Var.P1 = ml0Var;
            AndroidUtilities.runOnUIThread(ml0Var, ViewConfiguration.getPressedStateDuration());
            fg.d dVar = sl0Var.b1;
            if (dVar != null) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
                sl0Var.b1 = null;
                sl0Var.K1 = null;
                sl0Var.M1 = false;
                sl0Var.k1(motionEvent, view);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        jl0 jl0Var;
        sl0 sl0Var = (sl0) this.b.b;
        View view = this.a;
        if (view == null || (jl0Var = sl0Var.T0) == null || !jl0Var.e1(view)) {
            return false;
        }
        sl0Var.T0.o0(this.a, motionEvent.getX(), motionEvent.getY());
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
        sl0 sl0Var = (sl0) this.b.b;
        View view = sl0Var.K1;
        if (view == null || (i10 = sl0Var.L1) == -1) {
            return;
        }
        kl0 kl0Var = sl0Var.U0;
        if (kl0Var == null && sl0Var.V0 == null) {
            return;
        }
        if (kl0Var != null) {
            if (kl0Var.f(i10, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (sl0Var.V0.c(motionEvent.getX() - sl0Var.K1.getX(), motionEvent.getY() - sl0Var.K1.getY(), i10, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            sl0Var.W0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        jl0 jl0Var;
        View view = this.a;
        if (view == null || (jl0Var = ((sl0) this.b.b).T0) == null || !jl0Var.e1(view)) {
            return false;
        }
        b(motionEvent, this.a);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        sl0 sl0Var = (sl0) this.b.b;
        View view = sl0Var.K1;
        if (view != null) {
            jl0 jl0Var = sl0Var.T0;
            if (jl0Var != null && jl0Var.e1(view)) {
                this.a = sl0Var.K1;
                return false;
            }
            b(motionEvent, sl0Var.K1);
        }
        return false;
    }
}
