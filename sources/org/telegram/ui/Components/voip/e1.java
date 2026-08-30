package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import nh.n5;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ g1 d;

    public e1(g1 g1Var, int i10) {
        this.d = g1Var;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        g1 g1Var = this.d;
        if (g1Var.H) {
            for (int i10 = 1; i10 < g1Var.e.getChildCount(); i10++) {
                View childAt = g1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    g1Var.G = childAt;
                    return true;
                }
            }
        }
        this.a = g1Var.N;
        this.b = g1Var.O;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        g1 g1Var = this.d;
        if (!g1Var.E || g1Var.F) {
            return false;
        }
        o1.j jVar = g1Var.P;
        jVar.a = f10;
        float f12 = g1Var.N;
        jVar.b = f12;
        jVar.c = true;
        jVar.u.i = (f10 / 7.0f) + ((g1Var.J / 2.0f) + f12) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        g1Var.P.f();
        o1.j jVar2 = g1Var.Q;
        jVar2.a = f10;
        jVar2.b = g1Var.O;
        jVar2.c = true;
        jVar2.u.i = k7.n.a((f11 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.K) - AndroidUtilities.dp(16.0f));
        g1Var.Q.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        g1 g1Var = this.d;
        if (!g1Var.E && g1Var.I == null && !g1Var.F) {
            float abs = Math.abs(f10);
            float f12 = this.c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                g1Var.E = true;
                g1Var.P.c();
                g1Var.Q.c();
            }
        }
        if (g1Var.E) {
            WindowManager.LayoutParams layoutParams = g1Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            g1Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = g1Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            g1Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(g1Var.b, g1Var.d, g1Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        g1 g1Var = this.d;
        ValueAnimator valueAnimator = g1Var.I;
        n5 n5Var = g1Var.U;
        if (valueAnimator == null) {
            if (g1Var.T) {
                AndroidUtilities.cancelRunOnUIThread(n5Var);
                g1Var.T = false;
            }
            boolean z4 = !g1Var.H;
            g1Var.H = z4;
            g1Var.o(z4);
            if (g1Var.H && !g1Var.T) {
                AndroidUtilities.runOnUIThread(n5Var, 2500L);
                g1Var.T = true;
            }
        }
        return true;
    }
}
