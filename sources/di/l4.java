package di;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class l4 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ l5 a;

    public l4(l5 l5Var) {
        this.a = l5Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        l5 l5Var = this.a;
        l5Var.d.abortAnimation();
        ValueAnimator valueAnimator = l5Var.M;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            l5Var.M.cancel();
            l5Var.M = null;
        }
        l5Var.L = false;
        l5Var.O.x = false;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        l5 l5Var = this.a;
        l5Var.d.fling((int) l5Var.e, 0, (int) (-f10), 0, (int) l5Var.f, (int) l5Var.h, 0, 0);
        l5Var.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        l5 l5Var = this.a;
        float f12 = l5Var.e + f10;
        l5Var.e = f12;
        float f13 = l5Var.f;
        if (f12 < f13) {
            l5Var.e = f13;
        }
        float f14 = l5Var.e;
        float f15 = l5Var.h;
        if (f14 > f15) {
            l5Var.e = f15;
        }
        l5Var.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l5 l5Var = this.a;
        ArrayList arrayList = l5Var.G;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            n4 n4Var = (n4) arrayList.get(i7);
            if (((n4) arrayList.get(i7)).a.P0.contains(motionEvent.getX(), motionEvent.getY())) {
                int i10 = l5Var.K;
                int i11 = n4Var.b;
                if (i10 != i11) {
                    l5Var.c(i11, true, false);
                } else {
                    l5Var.N.o(false);
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
