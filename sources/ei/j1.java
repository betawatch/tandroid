package ei;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import b8.be;
import org.telegram.ui.Components.kt0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;

    public j1(int i3) {
        kt0 kt0Var = n1.Y;
        this.c = i3;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        n1 n1Var = n1.a0;
        if (n1Var.I) {
            for (int i3 = 1; i3 < n1Var.e.getChildCount(); i3++) {
                View childAt = n1Var.e.getChildAt(i3);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    n1Var.H = childAt;
                    return true;
                }
            }
        }
        this.a = n1Var.O;
        this.b = n1Var.P;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        n1 n1Var = n1.a0;
        if (!n1Var.F || n1Var.G) {
            return false;
        }
        q1.g gVar = n1Var.Q;
        gVar.a = f10;
        float f12 = n1Var.O;
        gVar.b = f12;
        gVar.c = true;
        gVar.m.i = (f10 / 7.0f) + ((n1Var.K / 2.0f) + f12) >= ((float) org.telegram.messenger.g0.q.x) / 2.0f ? (r5 - r2) - org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f);
        n1Var.Q.h();
        q1.g gVar2 = n1Var.R;
        gVar2.a = f10;
        gVar2.b = n1Var.P;
        gVar2.c = true;
        gVar2.m.i = be.a((f11 / 10.0f) + r10, org.telegram.messenger.g0.L(16.0f), (r3.y - n1Var.L) - org.telegram.messenger.g0.L(16.0f));
        n1Var.R.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        n1 n1Var = n1.a0;
        if (!n1Var.F && n1Var.J == null && !n1Var.G) {
            float abs = Math.abs(f10);
            float f12 = this.c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                n1Var.F = true;
                n1Var.Q.d();
                n1Var.R.d();
            }
        }
        if (n1Var.F) {
            WindowManager.LayoutParams layoutParams = n1Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            n1Var.O = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = n1Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            n1Var.P = rawY;
            layoutParams2.y = (int) rawY;
            org.telegram.messenger.g0.T3(n1Var.b, n1Var.d, n1Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        n1 n1Var = n1.a0;
        ci.d1 d1Var = n1Var.V;
        if (n1Var.J == null) {
            if (n1Var.U) {
                org.telegram.messenger.g0.r(d1Var);
                n1Var.U = false;
            }
            boolean z10 = !n1Var.I;
            n1Var.I = z10;
            n1Var.j(z10);
            if (n1Var.I && !n1Var.U) {
                org.telegram.messenger.g0.i3(d1Var, 2500L);
                n1Var.U = true;
            }
        }
        return true;
    }
}
