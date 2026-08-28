package ag;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import ih.h5;
import ih.l4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f implements GestureDetector.OnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ f(int i9, View view) {
        this.a = i9;
        this.b = view;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                j jVar = (j) this.b;
                ValueAnimator valueAnimator = jVar.O;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    jVar.O.cancel();
                    jVar.O = null;
                }
                AnimatorSet animatorSet = jVar.P;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    jVar.P.cancel();
                    jVar.P = null;
                }
                AndroidUtilities.cancelRunOnUIThread(jVar.Q);
                jVar.a = true;
                break;
            default:
                h5 h5Var = (h5) this.b;
                h5Var.d.abortAnimation();
                ValueAnimator valueAnimator2 = h5Var.I;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    h5Var.I.cancel();
                    h5Var.I = null;
                }
                h5Var.H = false;
                h5Var.K.w = false;
                break;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        switch (this.a) {
            case 0:
                break;
            default:
                h5 h5Var = (h5) this.b;
                h5Var.d.fling((int) h5Var.e, 0, (int) (-f10), 0, (int) h5Var.f, (int) h5Var.h, 0, 0);
                h5Var.invalidate();
                break;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ((j) this.b).g();
                break;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        switch (this.a) {
            case 0:
                a aVar = ((j) this.b).b;
                aVar.d = (f10 * 0.5f) + aVar.d;
                aVar.g = (f11 * 0.05f) + aVar.g;
                return true;
            default:
                h5 h5Var = (h5) this.b;
                float f12 = h5Var.e + f10;
                h5Var.e = f12;
                float f13 = h5Var.f;
                if (f12 < f13) {
                    h5Var.e = f13;
                }
                float f14 = h5Var.e;
                float f15 = h5Var.h;
                if (f14 > f15) {
                    h5Var.e = f15;
                }
                h5Var.invalidate();
                return false;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        int i9 = this.a;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                float measuredWidth = ((j) this.b).getMeasuredWidth() / 2.0f;
                AndroidUtilities.runOnUIThread(new d(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 0), 16L);
                return true;
            default:
                h5 h5Var = (h5) this.b;
                ArrayList arrayList = h5Var.C;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    l4 l4Var = (l4) arrayList.get(i9);
                    if (((l4) arrayList.get(i9)).a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i10 = h5Var.G;
                        int i11 = l4Var.b;
                        if (i10 != i11) {
                            h5Var.c(i11, true, false);
                        } else {
                            h5Var.J.n(false);
                        }
                    }
                }
                return false;
        }
    }

    private final void a(MotionEvent motionEvent) {
    }

    private final void b(MotionEvent motionEvent) {
    }

    private final void c(MotionEvent motionEvent) {
    }
}
