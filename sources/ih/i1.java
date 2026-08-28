package ih;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;

    public i1(int i9) {
        pu0 pu0Var = k1.T;
        this.c = i9;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        k1 k1Var = k1.V;
        if (k1Var.D) {
            for (int i9 = 1; i9 < k1Var.e.getChildCount(); i9++) {
                View childAt = k1Var.e.getChildAt(i9);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    k1Var.C = childAt;
                    return true;
                }
            }
        }
        this.a = k1Var.J;
        this.b = k1Var.K;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        k1 k1Var = k1.V;
        if (!k1Var.A || k1Var.B) {
            return false;
        }
        o1.j jVar = k1Var.L;
        jVar.a = f10;
        float f12 = k1Var.J;
        jVar.b = f12;
        jVar.c = true;
        jVar.u.i = (f10 / 7.0f) + ((k1Var.F / 2.0f) + f12) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        k1Var.L.f();
        o1.j jVar2 = k1Var.M;
        jVar2.a = f10;
        jVar2.b = k1Var.K;
        jVar2.c = true;
        jVar2.u.i = g7.n.a((f11 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.G) - AndroidUtilities.dp(16.0f));
        k1Var.M.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        k1 k1Var = k1.V;
        if (!k1Var.A && k1Var.E == null && !k1Var.B) {
            float abs = Math.abs(f10);
            float f12 = this.c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                k1Var.A = true;
                k1Var.L.c();
                k1Var.M.c();
            }
        }
        if (k1Var.A) {
            WindowManager.LayoutParams layoutParams = k1Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            k1Var.J = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = k1Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            k1Var.K = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(k1Var.b, k1Var.d, k1Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        k1 k1Var = k1.V;
        g gVar = k1Var.Q;
        if (k1Var.E == null) {
            if (k1Var.P) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                k1Var.P = false;
            }
            boolean z10 = !k1Var.D;
            k1Var.D = z10;
            k1Var.p(z10);
            if (k1Var.D && !k1Var.P) {
                AndroidUtilities.runOnUIThread(gVar, 2500L);
                k1Var.P = true;
            }
        }
        return true;
    }
}
