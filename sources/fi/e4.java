package fi;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e4 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ d5 a;

    public e4(d5 d5Var) {
        this.a = d5Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        d5 d5Var = this.a;
        d5Var.d.abortAnimation();
        ValueAnimator valueAnimator = d5Var.N;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            d5Var.N.cancel();
            d5Var.N = null;
        }
        d5Var.M = false;
        d5Var.P.x = false;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        d5 d5Var = this.a;
        d5Var.d.fling((int) d5Var.e, 0, (int) (-f10), 0, (int) d5Var.f, (int) d5Var.h, 0, 0);
        d5Var.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        d5 d5Var = this.a;
        float f12 = d5Var.e + f10;
        d5Var.e = f12;
        float f13 = d5Var.f;
        if (f12 < f13) {
            d5Var.e = f13;
        }
        float f14 = d5Var.e;
        float f15 = d5Var.h;
        if (f14 > f15) {
            d5Var.e = f15;
        }
        d5Var.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        d5 d5Var = this.a;
        ArrayList arrayList = d5Var.H;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            g4 g4Var = (g4) arrayList.get(i7);
            if (((g4) arrayList.get(i7)).a.Q0.contains(motionEvent.getX(), motionEvent.getY())) {
                int i10 = d5Var.L;
                int i11 = g4Var.b;
                if (i10 != i11) {
                    d5Var.c(i11, true, false);
                } else {
                    d5Var.O.o(false);
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
