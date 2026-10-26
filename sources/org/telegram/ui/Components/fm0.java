package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fm0 extends w20 {
    public View a;
    public final /* synthetic */ gm0 b;

    public fm0(gm0 gm0Var) {
        this.b = gm0Var;
    }

    @Override // org.telegram.ui.Components.w20
    public final boolean a() {
        return ((mm0) this.b.b).W0 != null;
    }

    public final void b(MotionEvent motionEvent, View view) {
        mm0 mm0Var = (mm0) this.b.b;
        if (view != null) {
            if (mm0Var.T0 == null && mm0Var.U0 == null) {
                return;
            }
            float x9 = motionEvent.getX();
            float y3 = motionEvent.getY();
            mm0Var.k1(view, x9, y3, true);
            int i10 = mm0Var.M1;
            if (mm0Var.P1 && i10 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                zl0 zl0Var = mm0Var.T0;
                if (zl0Var != null) {
                    zl0Var.c(i10, view);
                } else {
                    am0 am0Var = mm0Var.U0;
                    if (am0Var != null) {
                        am0Var.e(x9 - view.getX(), y3 - view.getY(), i10, view);
                    }
                }
            }
            em0 em0Var = new em0(this, view, i10, x9, y3);
            mm0Var.Q1 = em0Var;
            AndroidUtilities.runOnUIThread(em0Var, ViewConfiguration.getPressedStateDuration());
            dm0 dm0Var = mm0Var.c1;
            if (dm0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(dm0Var);
                mm0Var.c1 = null;
                mm0Var.L1 = null;
                mm0Var.N1 = false;
                mm0Var.n1(motionEvent, view);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        am0 am0Var;
        mm0 mm0Var = (mm0) this.b.b;
        View view = this.a;
        if (view == null || (am0Var = mm0Var.U0) == null || !am0Var.c1(view)) {
            return false;
        }
        mm0Var.U0.l0(this.a, motionEvent.getX(), motionEvent.getY());
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
        mm0 mm0Var = (mm0) this.b.b;
        View view = mm0Var.L1;
        if (view == null || (i10 = mm0Var.M1) == -1) {
            return;
        }
        bm0 bm0Var = mm0Var.V0;
        if (bm0Var == null && mm0Var.W0 == null) {
            return;
        }
        if (bm0Var != null) {
            if (bm0Var.c(i10, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (mm0Var.W0.e(motionEvent.getX() - mm0Var.L1.getX(), motionEvent.getY() - mm0Var.L1.getY(), i10, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            mm0Var.X0 = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        am0 am0Var;
        View view = this.a;
        if (view == null || (am0Var = ((mm0) this.b.b).U0) == null || !am0Var.c1(view)) {
            return false;
        }
        b(motionEvent, this.a);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        mm0 mm0Var = (mm0) this.b.b;
        View view = mm0Var.L1;
        if (view != null) {
            am0 am0Var = mm0Var.U0;
            if (am0Var != null && am0Var.c1(view)) {
                this.a = mm0Var.L1;
                return false;
            }
            b(motionEvent, mm0Var.L1);
        }
        return false;
    }
}
