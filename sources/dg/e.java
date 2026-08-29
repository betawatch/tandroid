package dg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import lh.e5;
import lh.h4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e implements GestureDetector.OnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ e(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                i iVar = (i) this.b;
                ValueAnimator valueAnimator = iVar.O;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    iVar.O.cancel();
                    iVar.O = null;
                }
                AnimatorSet animatorSet = iVar.P;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    iVar.P.cancel();
                    iVar.P = null;
                }
                AndroidUtilities.cancelRunOnUIThread(iVar.Q);
                iVar.a = true;
                break;
            default:
                e5 e5Var = (e5) this.b;
                e5Var.d.abortAnimation();
                ValueAnimator valueAnimator2 = e5Var.I;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    e5Var.I.cancel();
                    e5Var.I = null;
                }
                e5Var.H = false;
                e5Var.K.w = false;
                break;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        switch (this.a) {
            case 0:
                break;
            default:
                e5 e5Var = (e5) this.b;
                e5Var.d.fling((int) e5Var.e, 0, (int) (-f9), 0, (int) e5Var.f, (int) e5Var.h, 0, 0);
                e5Var.invalidate();
                break;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ((i) this.b).g();
                break;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        switch (this.a) {
            case 0:
                a aVar = ((i) this.b).b;
                aVar.d = (f9 * 0.5f) + aVar.d;
                aVar.g = (f10 * 0.05f) + aVar.g;
                return true;
            default:
                e5 e5Var = (e5) this.b;
                float f11 = e5Var.e + f9;
                e5Var.e = f11;
                float f12 = e5Var.f;
                if (f11 < f12) {
                    e5Var.e = f12;
                }
                float f13 = e5Var.e;
                float f14 = e5Var.h;
                if (f13 > f14) {
                    e5Var.e = f14;
                }
                e5Var.invalidate();
                return false;
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
                float measuredWidth = ((i) this.b).getMeasuredWidth() / 2.0f;
                AndroidUtilities.runOnUIThread(new d(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 0), 16L);
                return true;
            default:
                e5 e5Var = (e5) this.b;
                ArrayList arrayList = e5Var.C;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    h4 h4Var = (h4) arrayList.get(i10);
                    if (((h4) arrayList.get(i10)).a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i11 = e5Var.G;
                        int i12 = h4Var.b;
                        if (i11 != i12) {
                            e5Var.c(i12, true, false);
                        } else {
                            e5Var.J.n(false);
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
