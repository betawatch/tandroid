package ai;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lw0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class i2 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;

    public i2(int i10) {
        lw0 lw0Var = n2.X;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        n2 n2Var = n2.Z;
        if (n2Var.H) {
            for (int i10 = 1; i10 < n2Var.e.getChildCount(); i10++) {
                View childAt = n2Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    n2Var.G = childAt;
                    return true;
                }
            }
        }
        this.a = n2Var.N;
        this.b = n2Var.O;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        n2 n2Var = n2.Z;
        if (!n2Var.E || n2Var.F) {
            return false;
        }
        o1.k kVar = n2Var.P;
        kVar.a = f7;
        float f11 = n2Var.N;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((n2Var.J / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        n2Var.P.h();
        o1.k kVar2 = n2Var.Q;
        kVar2.a = f7;
        kVar2.b = n2Var.O;
        kVar2.c = true;
        kVar2.u.i = w7.o.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - n2Var.K) - AndroidUtilities.dp(16.0f));
        n2Var.Q.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        n2 n2Var = n2.Z;
        if (!n2Var.E && n2Var.I == null && !n2Var.F) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                n2Var.E = true;
                n2Var.P.c();
                n2Var.Q.c();
            }
        }
        if (n2Var.E) {
            WindowManager.LayoutParams layoutParams = n2Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            n2Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = n2Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            n2Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(n2Var.b, n2Var.d, n2Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        n2 n2Var = n2.Z;
        a3.d dVar = n2Var.U;
        if (n2Var.I == null) {
            if (n2Var.T) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
                n2Var.T = false;
            }
            boolean z10 = !n2Var.H;
            n2Var.H = z10;
            n2Var.o(z10);
            if (n2Var.H && !n2Var.T) {
                AndroidUtilities.runOnUIThread(dVar, 2500L);
                n2Var.T = true;
            }
        }
        return true;
    }
}
