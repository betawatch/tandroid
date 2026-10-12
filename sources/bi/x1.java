package bi;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hw0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class x1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;

    public x1(int i10) {
        hw0 hw0Var = b2.X;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        b2 b2Var = b2.Z;
        if (b2Var.H) {
            for (int i10 = 1; i10 < b2Var.e.getChildCount(); i10++) {
                View childAt = b2Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    b2Var.G = childAt;
                    return true;
                }
            }
        }
        this.a = b2Var.N;
        this.b = b2Var.O;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        b2 b2Var = b2.Z;
        if (!b2Var.E || b2Var.F) {
            return false;
        }
        o1.k kVar = b2Var.P;
        kVar.a = f7;
        float f11 = b2Var.N;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((b2Var.J / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        b2Var.P.h();
        o1.k kVar2 = b2Var.Q;
        kVar2.a = f7;
        kVar2.b = b2Var.O;
        kVar2.c = true;
        kVar2.u.i = w7.s.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - b2Var.K) - AndroidUtilities.dp(16.0f));
        b2Var.Q.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        b2 b2Var = b2.Z;
        if (!b2Var.E && b2Var.I == null && !b2Var.F) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                b2Var.E = true;
                b2Var.P.c();
                b2Var.Q.c();
            }
        }
        if (b2Var.E) {
            WindowManager.LayoutParams layoutParams = b2Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            b2Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = b2Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            b2Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(b2Var.b, b2Var.d, b2Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        b2 b2Var = b2.Z;
        a3.d dVar = b2Var.U;
        if (b2Var.I == null) {
            if (b2Var.T) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
                b2Var.T = false;
            }
            boolean z10 = !b2Var.H;
            b2Var.H = z10;
            b2Var.o(z10);
            if (b2Var.H && !b2Var.T) {
                AndroidUtilities.runOnUIThread(dVar, 2500L);
                b2Var.T = true;
            }
        }
        return true;
    }
}
