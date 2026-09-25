package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class i1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ k1 d;

    public i1(k1 k1Var, int i10) {
        this.d = k1Var;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        k1 k1Var = this.d;
        if (k1Var.K) {
            for (int i10 = 1; i10 < k1Var.e.getChildCount(); i10++) {
                View childAt = k1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    k1Var.J = childAt;
                    return true;
                }
            }
        }
        this.a = k1Var.Q;
        this.b = k1Var.R;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        k1 k1Var = this.d;
        if (!k1Var.H || k1Var.I) {
            return false;
        }
        o1.k kVar = k1Var.S;
        kVar.a = f7;
        float f11 = k1Var.Q;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((k1Var.M / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        k1Var.S.f();
        o1.k kVar2 = k1Var.T;
        kVar2.a = f7;
        kVar2.b = k1Var.R;
        kVar2.c = true;
        kVar2.u.i = w7.q.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.N) - AndroidUtilities.dp(16.0f));
        k1Var.T.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        k1 k1Var = this.d;
        if (!k1Var.H && k1Var.L == null && !k1Var.I) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                k1Var.H = true;
                k1Var.S.c();
                k1Var.T.c();
            }
        }
        if (k1Var.H) {
            WindowManager.LayoutParams layoutParams = k1Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            k1Var.Q = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = k1Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            k1Var.R = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(k1Var.b, k1Var.d, k1Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        k1 k1Var = this.d;
        ValueAnimator valueAnimator = k1Var.L;
        i2.h0 h0Var = k1Var.X;
        if (valueAnimator == null) {
            if (k1Var.W) {
                AndroidUtilities.cancelRunOnUIThread(h0Var);
                k1Var.W = false;
            }
            boolean z10 = !k1Var.K;
            k1Var.K = z10;
            k1Var.o(z10);
            if (k1Var.K && !k1Var.W) {
                AndroidUtilities.runOnUIThread(h0Var, 2500L);
                k1Var.W = true;
            }
        }
        return true;
    }
}
