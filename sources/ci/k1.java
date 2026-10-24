package ci;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hw0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class k1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;

    public k1(int i10) {
        hw0 hw0Var = o1.X;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        o1 o1Var = o1.Z;
        if (o1Var.H) {
            for (int i10 = 1; i10 < o1Var.e.getChildCount(); i10++) {
                View childAt = o1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    o1Var.G = childAt;
                    return true;
                }
            }
        }
        this.a = o1Var.N;
        this.b = o1Var.O;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        o1 o1Var = o1.Z;
        if (!o1Var.E || o1Var.F) {
            return false;
        }
        o1.k kVar = o1Var.P;
        kVar.a = f7;
        float f11 = o1Var.N;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((o1Var.J / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        o1Var.P.h();
        o1.k kVar2 = o1Var.Q;
        kVar2.a = f7;
        kVar2.b = o1Var.O;
        kVar2.c = true;
        kVar2.u.i = w7.r.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - o1Var.K) - AndroidUtilities.dp(16.0f));
        o1Var.Q.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        o1 o1Var = o1.Z;
        if (!o1Var.E && o1Var.I == null && !o1Var.F) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                o1Var.E = true;
                o1Var.P.c();
                o1Var.Q.c();
            }
        }
        if (o1Var.E) {
            WindowManager.LayoutParams layoutParams = o1Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            o1Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = o1Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            o1Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(o1Var.b, o1Var.d, o1Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        o1 o1Var = o1.Z;
        androidx.fragment.app.d dVar = o1Var.U;
        if (o1Var.I == null) {
            if (o1Var.T) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
                o1Var.T = false;
            }
            boolean z10 = !o1Var.H;
            o1Var.H = z10;
            o1Var.o(z10);
            if (o1Var.H && !o1Var.T) {
                AndroidUtilities.runOnUIThread(dVar, 2500L);
                o1Var.T = true;
            }
        }
        return true;
    }
}
