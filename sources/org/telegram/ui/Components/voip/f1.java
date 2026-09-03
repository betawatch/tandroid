package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import oh.t3;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class f1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ h1 d;

    public f1(h1 h1Var, int i10) {
        this.d = h1Var;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        h1 h1Var = this.d;
        if (h1Var.H) {
            for (int i10 = 1; i10 < h1Var.e.getChildCount(); i10++) {
                View childAt = h1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    h1Var.G = childAt;
                    return true;
                }
            }
        }
        this.a = h1Var.N;
        this.b = h1Var.O;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h1 h1Var = this.d;
        if (!h1Var.E || h1Var.F) {
            return false;
        }
        o1.j jVar = h1Var.P;
        jVar.a = f10;
        float f12 = h1Var.N;
        jVar.b = f12;
        jVar.c = true;
        jVar.u.i = (f10 / 7.0f) + ((h1Var.J / 2.0f) + f12) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        h1Var.P.f();
        o1.j jVar2 = h1Var.Q;
        jVar2.a = f10;
        jVar2.b = h1Var.O;
        jVar2.c = true;
        jVar2.u.i = k7.o.a((f11 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.K) - AndroidUtilities.dp(16.0f));
        h1Var.Q.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h1 h1Var = this.d;
        if (!h1Var.E && h1Var.I == null && !h1Var.F) {
            float abs = Math.abs(f10);
            float f12 = this.c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                h1Var.E = true;
                h1Var.P.c();
                h1Var.Q.c();
            }
        }
        if (h1Var.E) {
            WindowManager.LayoutParams layoutParams = h1Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            h1Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = h1Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            h1Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(h1Var.b, h1Var.d, h1Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h1 h1Var = this.d;
        ValueAnimator valueAnimator = h1Var.I;
        t3 t3Var = h1Var.U;
        if (valueAnimator == null) {
            if (h1Var.T) {
                AndroidUtilities.cancelRunOnUIThread(t3Var);
                h1Var.T = false;
            }
            boolean z4 = !h1Var.H;
            h1Var.H = z4;
            h1Var.o(z4);
            if (h1Var.H && !h1Var.T) {
                AndroidUtilities.runOnUIThread(t3Var, 2500L);
                h1Var.T = true;
            }
        }
        return true;
    }
}
