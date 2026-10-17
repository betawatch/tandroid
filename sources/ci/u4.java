package ci;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class u4 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ v5 a;

    public u4(v5 v5Var) {
        this.a = v5Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        v5 v5Var = this.a;
        v5Var.d.abortAnimation();
        ValueAnimator valueAnimator = v5Var.M;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            v5Var.M.cancel();
            v5Var.M = null;
        }
        v5Var.L = false;
        v5Var.O.w = false;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        v5 v5Var = this.a;
        v5Var.d.fling((int) v5Var.e, 0, (int) (-f7), 0, (int) v5Var.f, (int) v5Var.h, 0, 0);
        v5Var.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        v5 v5Var = this.a;
        float f11 = v5Var.e + f7;
        v5Var.e = f11;
        float f12 = v5Var.f;
        if (f11 < f12) {
            v5Var.e = f12;
        }
        float f13 = v5Var.e;
        float f14 = v5Var.h;
        if (f13 > f14) {
            v5Var.e = f14;
        }
        v5Var.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        v5 v5Var = this.a;
        ArrayList arrayList = v5Var.G;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            w4 w4Var = (w4) arrayList.get(i10);
            if (((w4) arrayList.get(i10)).a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                int i11 = v5Var.K;
                int i12 = w4Var.b;
                if (i11 != i12) {
                    v5Var.c(i12, true, false);
                } else {
                    v5Var.N.n(false);
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
