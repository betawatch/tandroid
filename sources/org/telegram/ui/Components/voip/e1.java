package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
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
        if (g1Var.G) {
            for (int i10 = 1; i10 < g1Var.e.getChildCount(); i10++) {
                View childAt = g1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    g1Var.F = childAt;
                    return true;
                }
            }
        }
        this.a = g1Var.M;
        this.b = g1Var.N;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        g1 g1Var = this.d;
        if (!g1Var.D || g1Var.E) {
            return false;
        }
        o1.j jVar = g1Var.O;
        jVar.a = f10;
        float f12 = g1Var.M;
        jVar.b = f12;
        jVar.c = true;
        jVar.u.i = (f10 / 7.0f) + ((g1Var.I / 2.0f) + f12) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        g1Var.O.f();
        o1.j jVar2 = g1Var.P;
        jVar2.a = f10;
        jVar2.b = g1Var.N;
        jVar2.c = true;
        jVar2.u.i = h7.n.a((f11 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.J) - AndroidUtilities.dp(16.0f));
        g1Var.P.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        g1 g1Var = this.d;
        if (!g1Var.D && g1Var.H == null && !g1Var.E) {
            float abs = Math.abs(f10);
            float f12 = this.c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                g1Var.D = true;
                g1Var.O.c();
                g1Var.P.c();
            }
        }
        if (g1Var.D) {
            WindowManager.LayoutParams layoutParams = g1Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            g1Var.M = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = g1Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            g1Var.N = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(g1Var.b, g1Var.d, g1Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        g1 g1Var = this.d;
        ValueAnimator valueAnimator = g1Var.H;
        nh.f0 f0Var = g1Var.T;
        if (valueAnimator == null) {
            if (g1Var.S) {
                AndroidUtilities.cancelRunOnUIThread(f0Var);
                g1Var.S = false;
            }
            boolean z10 = !g1Var.G;
            g1Var.G = z10;
            g1Var.o(z10);
            if (g1Var.G && !g1Var.S) {
                AndroidUtilities.runOnUIThread(f0Var, 2500L);
                g1Var.S = true;
            }
        }
        return true;
    }
}
