package ng;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ i c;

    public f(i iVar) {
        this.c = iVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.c;
        if (!iVar.f || iVar.n) {
            return false;
        }
        l lVar = iVar.c.u;
        if ((f7 / 7.0f) + ((float) lVar.i) >= iVar.getWidth() / 2.0f) {
            displayMetrics = iVar.getResources().getDisplayMetrics();
            f11 = 2.14748365E9f;
        } else {
            displayMetrics = iVar.getResources().getDisplayMetrics();
            f11 = -2.14748365E9f;
        }
        lVar.i = i.a(displayMetrics, f11);
        iVar.d.u.i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.u.i));
        iVar.c.f();
        iVar.d.f();
        iVar.h = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.c;
        int i10 = iVar.F;
        if (!iVar.n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.r);
        }
        if (!iVar.f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.a = (float) iVar.c.u.i;
            this.b = (float) iVar.d.u.i;
            iVar.f = true;
        }
        if (iVar.f && !iVar.n) {
            iVar.c.u.i = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            iVar.d.u.i = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            iVar.c.f();
            iVar.d.f();
        }
        return iVar.f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.c;
        if (iVar.n || iVar.s) {
            return false;
        }
        iVar.c(true);
        return true;
    }
}
