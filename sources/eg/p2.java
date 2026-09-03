package eg;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p2 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public boolean b;
    public float c;
    public final /* synthetic */ r2 d;

    public p2(r2 r2Var) {
        this.d = r2Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        r2 r2Var = this.d;
        boolean contains = r2Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (r2Var.f != contains) {
            r2Var.f = contains;
            r2Var.invalidate();
            if (contains) {
                q2 q2Var = r2Var.H;
                this.a = q2Var != null ? q2Var.get() : r2Var.E.c;
                this.b = false;
            }
        }
        return r2Var.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        r2 r2Var = this.d;
        if (r2Var.f) {
            if (!this.b) {
                this.c = motionEvent.getY() - motionEvent2.getY();
                this.b = true;
            }
            float f12 = this.a;
            float y10 = ((motionEvent.getY() - motionEvent2.getY()) - this.c) / r2Var.e.height();
            float f13 = r2Var.D;
            float f14 = r2Var.C;
            float a2 = k7.o.a(e2.c.w(f13, f14, y10, f12), f14, f13);
            q2 q2Var = r2Var.H;
            if (q2Var != null) {
                q2Var.H(a2);
            } else {
                r2Var.E.c = a2;
            }
            r2Var.w.d(a2, true);
            Runnable runnable = r2Var.F;
            if (runnable != null) {
                runnable.run();
            }
            r2Var.invalidate();
        }
        return r2Var.f;
    }
}
