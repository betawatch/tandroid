package ai;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.el0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class j6 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ j6(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                l7 l7Var = (l7) this.b;
                l7Var.d.abortAnimation();
                ValueAnimator valueAnimator = l7Var.M;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    l7Var.M.cancel();
                    l7Var.M = null;
                }
                l7Var.L = false;
                l7Var.O.w = false;
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
                l7 l7Var = (l7) this.b;
                l7Var.d.fling((int) l7Var.e, 0, (int) (-f7), 0, (int) l7Var.f, (int) l7Var.h, 0, 0);
                l7Var.invalidate();
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
                l7 l7Var = (l7) this.b;
                float f11 = l7Var.e + f7;
                l7Var.e = f11;
                float f12 = l7Var.f;
                if (f11 < f12) {
                    l7Var.e = f12;
                }
                float f13 = l7Var.e;
                float f14 = l7Var.h;
                if (f13 > f14) {
                    l7Var.e = f14;
                }
                l7Var.invalidate();
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
                l7 l7Var = (l7) this.b;
                ArrayList arrayList = l7Var.G;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    l6 l6Var = (l6) arrayList.get(i10);
                    if (((l6) arrayList.get(i10)).a.getDrawRegion().contains(motionEvent.getX(), motionEvent.getY())) {
                        int i11 = l7Var.K;
                        int i12 = l6Var.b;
                        if (i11 != i12) {
                            l7Var.c(i12, true, false);
                        } else {
                            l7Var.N.n(false);
                        }
                    }
                }
                return false;
            default:
                float measuredWidth = ((sg.e) this.b).getMeasuredWidth() / 2.0f;
                AndroidUtilities.runOnUIThread(new el0(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 1), 16L);
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
