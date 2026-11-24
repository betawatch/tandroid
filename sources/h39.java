// default package

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class h39 extends ps4 {
    public View a;
    public final /* synthetic */ ds5 b;

    public h39(ds5 ds5Var) {
        this.b = ds5Var;
    }

    @Override // ps4
    public final boolean a() {
        return ((o39) this.b.b).X0 != null;
    }

    public final void b(View view, MotionEvent motionEvent) {
        o39 o39Var = (o39) this.b.b;
        if (view != null) {
            if (o39Var.U0 == null && o39Var.V0 == null) {
                return;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            o39Var.k1(view, x, y, true);
            int i = o39Var.N1;
            if (o39Var.Q1 && i != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                c39 c39Var = o39Var.U0;
                if (c39Var != null) {
                    c39Var.d(i, view);
                } else {
                    d39 d39Var = o39Var.V0;
                    if (d39Var != null) {
                        d39Var.e(x - view.getX(), y - view.getY(), i, view);
                    }
                }
            }
            g39 g39Var = new g39(this, view, i, x, y);
            o39Var.R1 = g39Var;
            gl.d3(g39Var, ViewConfiguration.getPressedStateDuration());
            yq4 yq4Var = o39Var.d1;
            if (yq4Var != null) {
                gl.r(yq4Var);
                o39Var.d1 = null;
                o39Var.M1 = null;
                o39Var.O1 = false;
                o39Var.n1(view, motionEvent);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        d39 d39Var;
        o39 o39Var = (o39) this.b.b;
        View view = this.a;
        if (view == null || (d39Var = o39Var.V0) == null || !d39Var.q(view)) {
            return false;
        }
        o39Var.V0.l(this.a, motionEvent.getX(), motionEvent.getY());
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        int i;
        o39 o39Var = (o39) this.b.b;
        View view = o39Var.M1;
        if (view == null || (i = o39Var.N1) == -1) {
            return;
        }
        e39 e39Var = o39Var.W0;
        if (e39Var != null) {
            if (e39Var.d(i, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        f39 f39Var = o39Var.X0;
        if (f39Var == null || !f39Var.e(motionEvent.getX() - o39Var.M1.getX(), motionEvent.getY() - o39Var.M1.getY(), i, view)) {
            return;
        }
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused2) {
        }
        view.sendAccessibilityEvent(2);
        o39Var.Y0 = true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        d39 d39Var;
        View view = this.a;
        if (view == null || (d39Var = ((o39) this.b.b).V0) == null || !d39Var.q(view)) {
            return false;
        }
        b(this.a, motionEvent);
        this.a = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        o39 o39Var = (o39) this.b.b;
        View view = o39Var.M1;
        if (view != null) {
            d39 d39Var = o39Var.V0;
            if (d39Var != null && d39Var.q(view)) {
                this.a = o39Var.M1;
                return false;
            }
            b(o39Var.M1, motionEvent);
        }
        return false;
    }
}
