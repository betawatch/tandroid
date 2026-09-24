package ai;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tv0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class i2 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;

    public i2(int i10) {
        tv0 tv0Var = m2.X;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        m2 m2Var = m2.Z;
        if (m2Var.H) {
            for (int i10 = 1; i10 < m2Var.e.getChildCount(); i10++) {
                View childAt = m2Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    m2Var.G = childAt;
                    return true;
                }
            }
        }
        this.a = m2Var.N;
        this.b = m2Var.O;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        m2 m2Var = m2.Z;
        if (!m2Var.E || m2Var.F) {
            return false;
        }
        o1.k kVar = m2Var.P;
        kVar.a = f7;
        float f11 = m2Var.N;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((m2Var.J / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        m2Var.P.f();
        o1.k kVar2 = m2Var.Q;
        kVar2.a = f7;
        kVar2.b = m2Var.O;
        kVar2.c = true;
        kVar2.u.i = w7.q.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - m2Var.K) - AndroidUtilities.dp(16.0f));
        m2Var.Q.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        m2 m2Var = m2.Z;
        if (!m2Var.E && m2Var.I == null && !m2Var.F) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                m2Var.E = true;
                m2Var.P.c();
                m2Var.Q.c();
            }
        }
        if (m2Var.E) {
            WindowManager.LayoutParams layoutParams = m2Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            m2Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = m2Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            m2Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(m2Var.b, m2Var.d, m2Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        m2 m2Var = m2.Z;
        a3.d dVar = m2Var.U;
        if (m2Var.I == null) {
            if (m2Var.T) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
                m2Var.T = false;
            }
            boolean z10 = !m2Var.H;
            m2Var.H = z10;
            m2Var.p(z10);
            if (m2Var.H && !m2Var.T) {
                AndroidUtilities.runOnUIThread(dVar, 2500L);
                m2Var.T = true;
            }
        }
        return true;
    }
}
