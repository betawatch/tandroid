package bi;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hv0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class x1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;

    public x1(int i10) {
        hv0 hv0Var = a2.X;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        a2 a2Var = a2.Z;
        if (a2Var.H) {
            for (int i10 = 1; i10 < a2Var.e.getChildCount(); i10++) {
                View childAt = a2Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    a2Var.G = childAt;
                    return true;
                }
            }
        }
        this.a = a2Var.N;
        this.b = a2Var.O;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        a2 a2Var = a2.Z;
        if (!a2Var.E || a2Var.F) {
            return false;
        }
        o1.k kVar = a2Var.P;
        kVar.a = f7;
        float f11 = a2Var.N;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((a2Var.J / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        a2Var.P.f();
        o1.k kVar2 = a2Var.Q;
        kVar2.a = f7;
        kVar2.b = a2Var.O;
        kVar2.c = true;
        kVar2.u.i = w7.p.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - a2Var.K) - AndroidUtilities.dp(16.0f));
        a2Var.Q.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        a2 a2Var = a2.Z;
        if (!a2Var.E && a2Var.I == null && !a2Var.F) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                a2Var.E = true;
                a2Var.P.c();
                a2Var.Q.c();
            }
        }
        if (a2Var.E) {
            WindowManager.LayoutParams layoutParams = a2Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            a2Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = a2Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            a2Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(a2Var.b, a2Var.d, a2Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        a2 a2Var = a2.Z;
        a3.c cVar = a2Var.U;
        if (a2Var.I == null) {
            if (a2Var.T) {
                AndroidUtilities.cancelRunOnUIThread(cVar);
                a2Var.T = false;
            }
            boolean z10 = !a2Var.H;
            a2Var.H = z10;
            a2Var.p(z10);
            if (a2Var.H && !a2Var.T) {
                AndroidUtilities.runOnUIThread(cVar, 2500L);
                a2Var.T = true;
            }
        }
        return true;
    }
}
