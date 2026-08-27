package jh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import hh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.su0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class g1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;

    public g1(int i10) {
        su0 su0Var = i1.T;
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
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i1 i1Var = i1.V;
        if (!i1Var.A || i1Var.B) {
            return false;
        }
        o1.j jVar = i1Var.L;
        jVar.a = f10;
        float f12 = i1Var.J;
        jVar.b = f12;
        jVar.c = true;
        jVar.u.i = (f10 / 7.0f) + ((i1Var.F / 2.0f) + f12) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        i1Var.L.f();
        o1.j jVar2 = i1Var.M;
        jVar2.a = f10;
        jVar2.b = i1Var.K;
        jVar2.c = true;
        jVar2.u.i = h7.n.a((f11 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.G) - AndroidUtilities.dp(16.0f));
        i1Var.M.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i1 i1Var = i1.V;
        if (!i1Var.A && i1Var.E == null && !i1Var.B) {
            float abs = Math.abs(f10);
            float f12 = this.c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
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
        y9 y9Var = i1Var.Q;
        if (i1Var.E == null) {
            if (i1Var.P) {
                AndroidUtilities.cancelRunOnUIThread(y9Var);
                i1Var.P = false;
            }
            boolean z10 = !i1Var.D;
            i1Var.D = z10;
            i1Var.p(z10);
            if (i1Var.D && !i1Var.P) {
                AndroidUtilities.runOnUIThread(y9Var, 2500L);
                i1Var.P = true;
            }
        }
        return true;
    }
}
