// default package

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ex7 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public boolean b;
    public float c;
    public final /* synthetic */ gx7 d;

    public ex7(gx7 gx7Var) {
        this.d = gx7Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        gx7 gx7Var = this.d;
        boolean contains = gx7Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (gx7Var.f != contains) {
            gx7Var.f = contains;
            gx7Var.invalidate();
            if (contains) {
                fx7 fx7Var = gx7Var.L;
                this.a = fx7Var != null ? fx7Var.get() : gx7Var.I.c;
                this.b = false;
            }
        }
        return gx7Var.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        gx7 gx7Var = this.d;
        if (gx7Var.f) {
            if (!this.b) {
                this.c = motionEvent.getY() - motionEvent2.getY();
                this.b = true;
            }
            float f3 = this.a;
            float y = ((motionEvent.getY() - motionEvent2.getY()) - this.c) / gx7Var.e.height();
            float f4 = gx7Var.H;
            float f5 = gx7Var.G;
            float a = ete.a(qd4.A(f4, f5, y, f3), f5, f4);
            fx7 fx7Var = gx7Var.L;
            if (fx7Var != null) {
                fx7Var.G(a);
            } else {
                gx7Var.I.c = a;
            }
            gx7Var.x.e(true, a);
            Runnable runnable = gx7Var.J;
            if (runnable != null) {
                runnable.run();
            }
            gx7Var.invalidate();
        }
        return gx7Var.f;
    }
}
