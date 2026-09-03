package dg;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r2 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public boolean b;
    public float c;
    public final /* synthetic */ t2 d;

    public r2(t2 t2Var) {
        this.d = t2Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        t2 t2Var = this.d;
        boolean contains = t2Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (t2Var.f != contains) {
            t2Var.f = contains;
            t2Var.invalidate();
            if (contains) {
                s2 s2Var = t2Var.H;
                this.a = s2Var != null ? s2Var.get() : t2Var.E.c;
                this.b = false;
            }
        }
        return t2Var.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        t2 t2Var = this.d;
        if (t2Var.f) {
            if (!this.b) {
                this.c = motionEvent.getY() - motionEvent2.getY();
                this.b = true;
            }
            float f12 = this.a;
            float y10 = ((motionEvent.getY() - motionEvent2.getY()) - this.c) / t2Var.e.height();
            float f13 = t2Var.D;
            float f14 = t2Var.C;
            float a2 = k7.n.a(e2.c.w(f13, f14, y10, f12), f14, f13);
            s2 s2Var = t2Var.H;
            if (s2Var != null) {
                s2Var.A(a2);
            } else {
                t2Var.E.c = a2;
            }
            t2Var.w.d(a2, true);
            Runnable runnable = t2Var.F;
            if (runnable != null) {
                runnable.run();
            }
            t2Var.invalidate();
        }
        return t2Var.f;
    }
}
