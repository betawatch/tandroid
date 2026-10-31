package jg;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b2 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public boolean b;
    public float c;
    public final /* synthetic */ d2 d;

    public b2(d2 d2Var) {
        this.d = d2Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        d2 d2Var = this.d;
        boolean contains = d2Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (d2Var.f != contains) {
            d2Var.f = contains;
            d2Var.invalidate();
            if (contains) {
                c2 c2Var = d2Var.K;
                this.a = c2Var != null ? c2Var.get() : d2Var.H.c;
                this.b = false;
            }
        }
        return d2Var.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        d2 d2Var = this.d;
        if (d2Var.f) {
            if (!this.b) {
                this.c = motionEvent.getY() - motionEvent2.getY();
                this.b = true;
            }
            float f11 = this.a;
            float y3 = ((motionEvent.getY() - motionEvent2.getY()) - this.c) / d2Var.e.height();
            float f12 = d2Var.G;
            float f13 = d2Var.F;
            float a2 = w7.u.a(c3.i0.z(f12, f13, y3, f11), f13, f12);
            c2 c2Var = d2Var.K;
            if (c2Var != null) {
                c2Var.G(a2);
            } else {
                d2Var.H.c = a2;
            }
            d2Var.x.e(true, a2);
            Runnable runnable = d2Var.I;
            if (runnable != null) {
                runnable.run();
            }
            d2Var.invalidate();
        }
        return d2Var.f;
    }
}
