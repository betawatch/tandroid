package ei;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m4 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ l5 a;

    public m4(l5 l5Var) {
        this.a = l5Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        l5 l5Var = this.a;
        l5Var.d.abortAnimation();
        ValueAnimator valueAnimator = l5Var.N;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            l5Var.N.cancel();
            l5Var.N = null;
        }
        l5Var.M = false;
        l5Var.P.x = false;
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
        ArrayList arrayList = l5Var.H;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            o4 o4Var = (o4) arrayList.get(i3);
            if (((o4) arrayList.get(i3)).a.Q0.contains(motionEvent.getX(), motionEvent.getY())) {
                int i10 = l5Var.L;
                int i11 = o4Var.b;
                if (i10 != i11) {
                    l5Var.c(i11, true, false);
                } else {
                    l5Var.O.A(false);
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
