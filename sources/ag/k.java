package ag;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ o c;

    public k(o oVar) {
        this.c = oVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        o oVar = this.c;
        if (!oVar.f || oVar.n) {
            return false;
        }
        o1.k kVar = oVar.c.u;
        if ((f10 / 7.0f) + ((float) kVar.i) >= oVar.getWidth() / 2.0f) {
            displayMetrics = oVar.getResources().getDisplayMetrics();
            f12 = 2.14748365E9f;
        } else {
            displayMetrics = oVar.getResources().getDisplayMetrics();
            f12 = -2.14748365E9f;
        }
        kVar.i = o.a(displayMetrics, f12);
        oVar.d.u.i = o.b(oVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) oVar.d.u.i));
        oVar.c.f();
        oVar.d.f();
        oVar.h = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        o oVar = this.c;
        int i10 = oVar.C;
        if (!oVar.n) {
            AndroidUtilities.cancelRunOnUIThread(oVar.r);
        }
        if (!oVar.f && (Math.abs(f10) >= i10 || Math.abs(f11) >= i10)) {
            this.a = (float) oVar.c.u.i;
            this.b = (float) oVar.d.u.i;
            oVar.f = true;
        }
        if (oVar.f && !oVar.n) {
            oVar.c.u.i = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            oVar.d.u.i = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            oVar.c.f();
            oVar.d.f();
        }
        return oVar.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        o oVar = this.c;
        if (oVar.n || oVar.s) {
            return false;
        }
        oVar.c(true);
        return true;
    }
}
