package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import nh.m6;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        if (h1Var.G) {
            for (int i10 = 1; i10 < h1Var.e.getChildCount(); i10++) {
                View childAt = h1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    h1Var.F = childAt;
                    return true;
                }
            }
        }
        this.a = h1Var.M;
        this.b = h1Var.N;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        h1 h1Var = this.d;
        if (!h1Var.D || h1Var.E) {
            return false;
        }
        o1.k kVar = h1Var.O;
        kVar.a = f9;
        float f11 = h1Var.M;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f9 / 7.0f) + ((h1Var.I / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        h1Var.O.f();
        o1.k kVar2 = h1Var.P;
        kVar2.a = f9;
        kVar2.b = h1Var.N;
        kVar2.c = true;
        kVar2.u.i = i7.w.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.J) - AndroidUtilities.dp(16.0f));
        h1Var.P.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        h1 h1Var = this.d;
        if (!h1Var.D && h1Var.H == null && !h1Var.E) {
            float abs = Math.abs(f9);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                h1Var.D = true;
                h1Var.O.c();
                h1Var.P.c();
            }
        }
        if (h1Var.D) {
            WindowManager.LayoutParams layoutParams = h1Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            h1Var.M = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = h1Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            h1Var.N = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(h1Var.b, h1Var.d, h1Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h1 h1Var = this.d;
        ValueAnimator valueAnimator = h1Var.H;
        m6 m6Var = h1Var.T;
        if (valueAnimator == null) {
            if (h1Var.S) {
                AndroidUtilities.cancelRunOnUIThread(m6Var);
                h1Var.S = false;
            }
            boolean z10 = !h1Var.G;
            h1Var.G = z10;
            h1Var.o(z10);
            if (h1Var.G && !h1Var.S) {
                AndroidUtilities.runOnUIThread(m6Var, 2500L);
                h1Var.S = true;
            }
        }
        return true;
    }
}
