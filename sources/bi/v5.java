package bi;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class v5 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ x6 a;

    public v5(x6 x6Var) {
        this.a = x6Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        x6 x6Var = this.a;
        x6Var.d.abortAnimation();
        ValueAnimator valueAnimator = x6Var.M;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            x6Var.M.cancel();
            x6Var.M = null;
        }
        x6Var.L = false;
        x6Var.O.w = false;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        x6 x6Var = this.a;
        x6Var.d.fling((int) x6Var.e, 0, (int) (-f7), 0, (int) x6Var.f, (int) x6Var.h, 0, 0);
        x6Var.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        x6 x6Var = this.a;
        float f11 = x6Var.e + f7;
        x6Var.e = f11;
        float f12 = x6Var.f;
        if (f11 < f12) {
            x6Var.e = f12;
        }
        float f13 = x6Var.e;
        float f14 = x6Var.h;
        if (f13 > f14) {
            x6Var.e = f14;
        }
        x6Var.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        x6 x6Var = this.a;
        ArrayList arrayList = x6Var.G;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            x5 x5Var = (x5) arrayList.get(i10);
            if (((x5) arrayList.get(i10)).a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                int i11 = x6Var.K;
                int i12 = x5Var.b;
                if (i11 != i12) {
                    x6Var.c(i12, true, false);
                } else {
                    x6Var.N.n(false);
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
