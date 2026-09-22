package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class h1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ j1 d;

    public h1(j1 j1Var, int i10) {
        this.d = j1Var;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        j1 j1Var = this.d;
        if (j1Var.K) {
            for (int i10 = 1; i10 < j1Var.e.getChildCount(); i10++) {
                View childAt = j1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    j1Var.J = childAt;
                    return true;
                }
            }
        }
        this.a = j1Var.Q;
        this.b = j1Var.R;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        j1 j1Var = this.d;
        if (!j1Var.H || j1Var.I) {
            return false;
        }
        o1.k kVar = j1Var.S;
        kVar.a = f7;
        float f11 = j1Var.Q;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((j1Var.M / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        j1Var.S.f();
        o1.k kVar2 = j1Var.T;
        kVar2.a = f7;
        kVar2.b = j1Var.R;
        kVar2.c = true;
        kVar2.u.i = w7.q.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.N) - AndroidUtilities.dp(16.0f));
        j1Var.T.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        j1 j1Var = this.d;
        if (!j1Var.H && j1Var.L == null && !j1Var.I) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                j1Var.H = true;
                j1Var.S.c();
                j1Var.T.c();
            }
        }
        if (j1Var.H) {
            WindowManager.LayoutParams layoutParams = j1Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            j1Var.Q = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = j1Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            j1Var.R = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(j1Var.b, j1Var.d, j1Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j1 j1Var = this.d;
        ValueAnimator valueAnimator = j1Var.L;
        i2.g0 g0Var = j1Var.X;
        if (valueAnimator == null) {
            if (j1Var.W) {
                AndroidUtilities.cancelRunOnUIThread(g0Var);
                j1Var.W = false;
            }
            boolean z10 = !j1Var.K;
            j1Var.K = z10;
            j1Var.o(z10);
            if (j1Var.K && !j1Var.W) {
                AndroidUtilities.runOnUIThread(g0Var, 2500L);
                j1Var.W = true;
            }
        }
        return true;
    }
}
