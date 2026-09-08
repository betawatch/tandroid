package bi;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.dl0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class t5 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ t5(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                t6 t6Var = (t6) this.b;
                t6Var.d.abortAnimation();
                ValueAnimator valueAnimator = t6Var.M;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    t6Var.M.cancel();
                    t6Var.M = null;
                }
                t6Var.L = false;
                t6Var.O.w = false;
                break;
            default:
                tg.e eVar = (tg.e) this.b;
                ValueAnimator valueAnimator2 = eVar.S;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    eVar.S.cancel();
                    eVar.S = null;
                }
                AnimatorSet animatorSet = eVar.T;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    eVar.T.cancel();
                    eVar.T = null;
                }
                AndroidUtilities.cancelRunOnUIThread(eVar.U);
                eVar.a = true;
                break;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.a) {
            case 0:
                t6 t6Var = (t6) this.b;
                t6Var.d.fling((int) t6Var.e, 0, (int) (-f7), 0, (int) t6Var.f, (int) t6Var.h, 0, 0);
                t6Var.invalidate();
                break;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((tg.e) this.b).g();
                break;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.a) {
            case 0:
                t6 t6Var = (t6) this.b;
                float f11 = t6Var.e + f7;
                t6Var.e = f11;
                float f12 = t6Var.f;
                if (f11 < f12) {
                    t6Var.e = f12;
                }
                float f13 = t6Var.e;
                float f14 = t6Var.h;
                if (f13 > f14) {
                    t6Var.e = f14;
                }
                t6Var.invalidate();
                return false;
            default:
                tg.a aVar = ((tg.e) this.b).b;
                aVar.d = (f7 * 0.5f) + aVar.d;
                aVar.g = (f10 * 0.05f) + aVar.g;
                return true;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        int i10 = this.a;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                t6 t6Var = (t6) this.b;
                ArrayList arrayList = t6Var.G;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    v5 v5Var = (v5) arrayList.get(i10);
                    if (((v5) arrayList.get(i10)).a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i11 = t6Var.K;
                        int i12 = v5Var.b;
                        if (i11 != i12) {
                            t6Var.c(i12, true, false);
                        } else {
                            t6Var.N.n(false);
                        }
                    }
                }
                return false;
            default:
                float measuredWidth = ((tg.e) this.b).getMeasuredWidth() / 2.0f;
                AndroidUtilities.runOnUIThread(new dl0(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 1), 16L);
                return true;
        }
    }

    private final void a(MotionEvent motionEvent) {
    }

    private final void b(MotionEvent motionEvent) {
    }

    private final void c(MotionEvent motionEvent) {
    }
}
