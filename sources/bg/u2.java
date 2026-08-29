package bg;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u2 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public boolean b;
    public float c;
    public final /* synthetic */ w2 d;

    public u2(w2 w2Var) {
        this.d = w2Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        w2 w2Var = this.d;
        boolean contains = w2Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (w2Var.f != contains) {
            w2Var.f = contains;
            w2Var.invalidate();
            if (contains) {
                v2 v2Var = w2Var.G;
                this.a = v2Var != null ? v2Var.get() : w2Var.D.c;
                this.b = false;
            }
        }
        return w2Var.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        w2 w2Var = this.d;
        if (w2Var.f) {
            if (!this.b) {
                this.c = motionEvent.getY() - motionEvent2.getY();
                this.b = true;
            }
            float f11 = this.a;
            float y8 = ((motionEvent.getY() - motionEvent2.getY()) - this.c) / w2Var.e.height();
            float f12 = w2Var.C;
            float f13 = w2Var.B;
            float a2 = i7.w.a(com.google.android.recaptcha.internal.a.z(f12, f13, y8, f11), f13, f12);
            v2 v2Var = w2Var.G;
            if (v2Var != null) {
                v2Var.K(a2);
            } else {
                w2Var.D.c = a2;
            }
            w2Var.w.d(a2, true);
            Runnable runnable = w2Var.E;
            if (runnable != null) {
                runnable.run();
            }
            w2Var.invalidate();
        }
        return w2Var.f;
    }
}
