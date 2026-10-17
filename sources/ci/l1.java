package ci;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cw0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class l1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;

    public l1(int i10) {
        cw0 cw0Var = p1.X;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        p1 p1Var = p1.Z;
        if (p1Var.H) {
            for (int i10 = 1; i10 < p1Var.e.getChildCount(); i10++) {
                View childAt = p1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    p1Var.G = childAt;
                    return true;
                }
            }
        }
        this.a = p1Var.N;
        this.b = p1Var.O;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        p1 p1Var = p1.Z;
        if (!p1Var.E || p1Var.F) {
            return false;
        }
        o1.k kVar = p1Var.P;
        kVar.a = f7;
        float f11 = p1Var.N;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((p1Var.J / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        p1Var.P.h();
        o1.k kVar2 = p1Var.Q;
        kVar2.a = f7;
        kVar2.b = p1Var.O;
        kVar2.c = true;
        kVar2.u.i = w7.r.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - p1Var.K) - AndroidUtilities.dp(16.0f));
        p1Var.Q.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        p1 p1Var = p1.Z;
        if (!p1Var.E && p1Var.I == null && !p1Var.F) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                p1Var.E = true;
                p1Var.P.c();
                p1Var.Q.c();
            }
        }
        if (p1Var.E) {
            WindowManager.LayoutParams layoutParams = p1Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            p1Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = p1Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            p1Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(p1Var.b, p1Var.d, p1Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        p1 p1Var = p1.Z;
        androidx.fragment.app.d dVar = p1Var.U;
        if (p1Var.I == null) {
            if (p1Var.T) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
                p1Var.T = false;
            }
            boolean z10 = !p1Var.H;
            p1Var.H = z10;
            p1Var.o(z10);
            if (p1Var.H && !p1Var.T) {
                AndroidUtilities.runOnUIThread(dVar, 2500L);
                p1Var.T = true;
            }
        }
        return true;
    }
}
