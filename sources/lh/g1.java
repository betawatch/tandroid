package lh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.av0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class g1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;

    public g1(int i10) {
        av0 av0Var = i1.T;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        i1 i1Var = i1.V;
        if (i1Var.D) {
            for (int i10 = 1; i10 < i1Var.e.getChildCount(); i10++) {
                View childAt = i1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    i1Var.C = childAt;
                    return true;
                }
            }
        }
        this.a = i1Var.J;
        this.b = i1Var.K;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        i1 i1Var = i1.V;
        if (!i1Var.A || i1Var.B) {
            return false;
        }
        o1.k kVar = i1Var.L;
        kVar.a = f9;
        float f11 = i1Var.J;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f9 / 7.0f) + ((i1Var.F / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        i1Var.L.f();
        o1.k kVar2 = i1Var.M;
        kVar2.a = f9;
        kVar2.b = i1Var.K;
        kVar2.c = true;
        kVar2.u.i = i7.w.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.G) - AndroidUtilities.dp(16.0f));
        i1Var.M.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        i1 i1Var = i1.V;
        if (!i1Var.A && i1Var.E == null && !i1Var.B) {
            float abs = Math.abs(f9);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                i1Var.A = true;
                i1Var.L.c();
                i1Var.M.c();
            }
        }
        if (i1Var.A) {
            WindowManager.LayoutParams layoutParams = i1Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            i1Var.J = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = i1Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            i1Var.K = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(i1Var.b, i1Var.d, i1Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i1 i1Var = i1.V;
        jh.o oVar = i1Var.Q;
        if (i1Var.E == null) {
            if (i1Var.P) {
                AndroidUtilities.cancelRunOnUIThread(oVar);
                i1Var.P = false;
            }
            boolean z10 = !i1Var.D;
            i1Var.D = z10;
            i1Var.p(z10);
            if (i1Var.D && !i1Var.P) {
                AndroidUtilities.runOnUIThread(oVar, 2500L);
                i1Var.P = true;
            }
        }
        return true;
    }
}
