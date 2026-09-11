package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class fl0 extends l20 {
    public View a;
    public final /* synthetic */ gl0 b;

    public fl0(gl0 gl0Var) {
        this.b = gl0Var;
    }

    @Override // org.telegram.ui.Components.l20
    public final boolean a() {
        return ((ll0) this.b.b).Y0 != null;
    }

    public final void b(MotionEvent motionEvent, View view) {
        ll0 ll0Var = (ll0) this.b.b;
        if (view != null) {
            if (ll0Var.V0 == null && ll0Var.W0 == null) {
                return;
            }
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            ll0Var.g1(view, x10, y3, true);
            int i10 = ll0Var.O1;
            if (ll0Var.R1 && i10 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                zk0 zk0Var = ll0Var.V0;
                if (zk0Var != null) {
                    zk0Var.a(i10, view);
                } else {
                    al0 al0Var = ll0Var.W0;
                    if (al0Var != null) {
                        al0Var.d(x10 - view.getX(), y3 - view.getY(), i10, view);
                    }
                }
            }
            el0 el0Var = new el0(this, view, i10, x10, y3);
            ll0Var.S1 = el0Var;
            AndroidUtilities.runOnUIThread(el0Var, ViewConfiguration.getPressedStateDuration());
            dl0 dl0Var = ll0Var.e1;
            if (dl0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(dl0Var);
                ll0Var.e1 = null;
                ll0Var.N1 = null;
                ll0Var.P1 = false;
                ll0Var.j1(motionEvent, view);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        al0 al0Var;
        ll0 ll0Var = (ll0) this.b.b;
        View view = this.a;
        if (view == null || (al0Var = ll0Var.W0) == null || !al0Var.d1(view)) {
            return false;
        }
        ll0Var.W0.q0(this.a, motionEvent.getX(), motionEvent.getY());
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
        ll0 ll0Var = (ll0) this.b.b;
        View view = ll0Var.N1;
        if (view == null || (i10 = ll0Var.O1) == -1) {
            return;
        }
        bl0 bl0Var = ll0Var.X0;
        if (bl0Var == null && ll0Var.Y0 == null) {
            return;
        }
        if (bl0Var != null) {
            if (bl0Var.a(i10, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (ll0Var.Y0.d(motionEvent.getX() - ll0Var.N1.getX(), motionEvent.getY() - ll0Var.N1.getY(), i10, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            ll0Var.Z0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        al0 al0Var;
        View view = this.a;
        if (view == null || (al0Var = ((ll0) this.b.b).W0) == null || !al0Var.d1(view)) {
            return false;
        }
        b(motionEvent, this.a);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ll0 ll0Var = (ll0) this.b.b;
        View view = ll0Var.N1;
        if (view != null) {
            al0 al0Var = ll0Var.W0;
            if (al0Var != null && al0Var.d1(view)) {
                this.a = ll0Var.N1;
                return false;
            }
            b(motionEvent, ll0Var.N1);
        }
        return false;
    }
}
