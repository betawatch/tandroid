package fi;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class c4 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ b5 a;

    public c4(b5 b5Var) {
        this.a = b5Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        b5 b5Var = this.a;
        b5Var.d.abortAnimation();
        ValueAnimator valueAnimator = b5Var.N;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            b5Var.N.cancel();
            b5Var.N = null;
        }
        b5Var.M = false;
        b5Var.P.x = false;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        b5 b5Var = this.a;
        b5Var.d.fling((int) b5Var.e, 0, (int) (-f10), 0, (int) b5Var.f, (int) b5Var.h, 0, 0);
        b5Var.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        b5 b5Var = this.a;
        float f12 = b5Var.e + f10;
        b5Var.e = f12;
        float f13 = b5Var.f;
        if (f12 < f13) {
            b5Var.e = f13;
        }
        float f14 = b5Var.e;
        float f15 = b5Var.h;
        if (f14 > f15) {
            b5Var.e = f15;
        }
        b5Var.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        b5 b5Var = this.a;
        ArrayList arrayList = b5Var.H;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            e4 e4Var = (e4) arrayList.get(i7);
            if (((e4) arrayList.get(i7)).a.Q0.contains(motionEvent.getX(), motionEvent.getY())) {
                int i10 = b5Var.L;
                int i11 = e4Var.b;
                if (i10 != i11) {
                    b5Var.c(i11, true, false);
                } else {
                    b5Var.O.o(false);
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
