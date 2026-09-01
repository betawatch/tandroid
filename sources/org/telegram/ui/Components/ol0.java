package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ol0 extends n20 {
    public View a;
    public final /* synthetic */ f2.y b;

    public ol0(f2.y yVar) {
        this.b = yVar;
    }

    @Override // org.telegram.ui.Components.n20
    public final boolean a() {
        return ((tl0) this.b.b).V0 != null;
    }

    public final void b(MotionEvent motionEvent, View view) {
        tl0 tl0Var = (tl0) this.b.b;
        if (view != null) {
            if (tl0Var.S0 == null && tl0Var.T0 == null) {
                return;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            tl0Var.h1(view, x10, y10, true);
            int i10 = tl0Var.L1;
            if (tl0Var.O1 && i10 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                jl0 jl0Var = tl0Var.S0;
                if (jl0Var != null) {
                    jl0Var.f(i10, view);
                } else {
                    kl0 kl0Var = tl0Var.T0;
                    if (kl0Var != null) {
                        kl0Var.c(x10 - view.getX(), y10 - view.getY(), i10, view);
                    }
                }
            }
            nl0 nl0Var = new nl0(this, view, i10, x10, y10);
            tl0Var.P1 = nl0Var;
            AndroidUtilities.runOnUIThread(nl0Var, ViewConfiguration.getPressedStateDuration());
            gg.d dVar = tl0Var.b1;
            if (dVar != null) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
                tl0Var.b1 = null;
                tl0Var.K1 = null;
                tl0Var.M1 = false;
                tl0Var.k1(motionEvent, view);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        kl0 kl0Var;
        tl0 tl0Var = (tl0) this.b.b;
        View view = this.a;
        if (view == null || (kl0Var = tl0Var.T0) == null || !kl0Var.Y0(view)) {
            return false;
        }
        tl0Var.T0.r0(this.a, motionEvent.getX(), motionEvent.getY());
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
        tl0 tl0Var = (tl0) this.b.b;
        View view = tl0Var.K1;
        if (view == null || (i10 = tl0Var.L1) == -1) {
            return;
        }
        ll0 ll0Var = tl0Var.U0;
        if (ll0Var == null && tl0Var.V0 == null) {
            return;
        }
        if (ll0Var != null) {
            if (ll0Var.f(i10, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (tl0Var.V0.c(motionEvent.getX() - tl0Var.K1.getX(), motionEvent.getY() - tl0Var.K1.getY(), i10, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            tl0Var.W0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        kl0 kl0Var;
        View view = this.a;
        if (view == null || (kl0Var = ((tl0) this.b.b).T0) == null || !kl0Var.Y0(view)) {
            return false;
        }
        b(motionEvent, this.a);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        tl0 tl0Var = (tl0) this.b.b;
        View view = tl0Var.K1;
        if (view != null) {
            kl0 kl0Var = tl0Var.T0;
            if (kl0Var != null && kl0Var.Y0(view)) {
                this.a = tl0Var.K1;
                return false;
            }
            b(motionEvent, tl0Var.K1);
        }
        return false;
    }
}
