package fg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.i0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ l c;

    public h(l lVar) {
        this.c = lVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        l lVar = this.c;
        if (!lVar.f || lVar.n) {
            return false;
        }
        o1.k kVar = lVar.c.m;
        if ((f7 / 7.0f) + ((float) kVar.i) >= lVar.getWidth() / 2.0f) {
            displayMetrics = lVar.getResources().getDisplayMetrics();
            f11 = 2.14748365E9f;
        } else {
            displayMetrics = lVar.getResources().getDisplayMetrics();
            f11 = -2.14748365E9f;
        }
        kVar.i = l.a(displayMetrics, f11);
        lVar.d.m.i = l.b(lVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) lVar.d.m.i));
        lVar.c.h();
        lVar.d.h();
        lVar.h = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        l lVar = this.c;
        int i10 = lVar.F;
        if (!lVar.n) {
            i0.r(lVar.r);
        }
        if (!lVar.f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.a = (float) lVar.c.m.i;
            this.b = (float) lVar.d.m.i;
            lVar.f = true;
        }
        if (lVar.f && !lVar.n) {
            lVar.c.m.i = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            lVar.d.m.i = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            lVar.c.h();
            lVar.d.h();
        }
        return lVar.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.c;
        if (lVar.n || lVar.s) {
            return false;
        }
        lVar.c(true);
        return true;
    }
}
