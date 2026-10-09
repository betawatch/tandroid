package ai;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class k6 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ m7 a;

    public k6(m7 m7Var) {
        this.a = m7Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        m7 m7Var = this.a;
        m7Var.d.abortAnimation();
        ValueAnimator valueAnimator = m7Var.M;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            m7Var.M.cancel();
            m7Var.M = null;
        }
        m7Var.L = false;
        m7Var.O.w = false;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        m7 m7Var = this.a;
        m7Var.d.fling((int) m7Var.e, 0, (int) (-f7), 0, (int) m7Var.f, (int) m7Var.h, 0, 0);
        m7Var.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        m7 m7Var = this.a;
        float f11 = m7Var.e + f7;
        m7Var.e = f11;
        float f12 = m7Var.f;
        if (f11 < f12) {
            m7Var.e = f12;
        }
        float f13 = m7Var.e;
        float f14 = m7Var.h;
        if (f13 > f14) {
            m7Var.e = f14;
        }
        m7Var.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        m7 m7Var = this.a;
        ArrayList arrayList = m7Var.G;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            m6 m6Var = (m6) arrayList.get(i10);
            if (((m6) arrayList.get(i10)).a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                int i11 = m7Var.K;
                int i12 = m6Var.b;
                if (i11 != i12) {
                    m7Var.c(i12, true, false);
                } else {
                    m7Var.N.n(false);
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
