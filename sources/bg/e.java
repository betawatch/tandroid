package bg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import jh.d5;
import jh.h4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                d5 d5Var = (d5) this.b;
                d5Var.d.abortAnimation();
                ValueAnimator valueAnimator2 = d5Var.I;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    d5Var.I.cancel();
                    d5Var.I = null;
                }
                d5Var.H = false;
                d5Var.K.w = false;
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
                d5 d5Var = (d5) this.b;
                d5Var.d.fling((int) d5Var.e, 0, (int) (-f10), 0, (int) d5Var.f, (int) d5Var.h, 0, 0);
                d5Var.invalidate();
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
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        switch (this.a) {
            case 0:
                a aVar = ((i) this.b).b;
                aVar.d = (f10 * 0.5f) + aVar.d;
                aVar.g = (f11 * 0.05f) + aVar.g;
                return true;
            default:
                d5 d5Var = (d5) this.b;
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
                d5 d5Var = (d5) this.b;
                ArrayList arrayList = d5Var.C;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    h4 h4Var = (h4) arrayList.get(i10);
                    if (((h4) arrayList.get(i10)).a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i11 = d5Var.G;
                        int i12 = h4Var.b;
                        if (i11 != i12) {
                            d5Var.c(i12, true, false);
                        } else {
                            d5Var.J.n(false);
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
