package ai;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ol0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class k6 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ k6(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.b;
                k7Var.d.abortAnimation();
                ValueAnimator valueAnimator = k7Var.M;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    k7Var.M.cancel();
                    k7Var.M = null;
                }
                k7Var.L = false;
                k7Var.O.w = false;
                break;
            default:
                sg.e eVar = (sg.e) this.b;
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
                k7 k7Var = (k7) this.b;
                k7Var.d.fling((int) k7Var.e, 0, (int) (-f7), 0, (int) k7Var.f, (int) k7Var.h, 0, 0);
                k7Var.invalidate();
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
                ((sg.e) this.b).g();
                break;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.b;
                float f11 = k7Var.e + f7;
                k7Var.e = f11;
                float f12 = k7Var.f;
                if (f11 < f12) {
                    k7Var.e = f12;
                }
                float f13 = k7Var.e;
                float f14 = k7Var.h;
                if (f13 > f14) {
                    k7Var.e = f14;
                }
                k7Var.invalidate();
                return false;
            default:
                sg.a aVar = ((sg.e) this.b).b;
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
                k7 k7Var = (k7) this.b;
                ArrayList arrayList = k7Var.G;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    m6 m6Var = (m6) arrayList.get(i10);
                    if (((m6) arrayList.get(i10)).a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i11 = k7Var.K;
                        int i12 = m6Var.b;
                        if (i11 != i12) {
                            k7Var.c(i12, true, false);
                        } else {
                            k7Var.N.n(false);
                        }
                    }
                }
                return false;
            default:
                float measuredWidth = ((sg.e) this.b).getMeasuredWidth() / 2.0f;
                AndroidUtilities.runOnUIThread(new ol0(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 1), 16L);
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
