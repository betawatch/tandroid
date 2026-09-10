package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ i1 d;

    public g1(i1 i1Var, int i10) {
        this.d = i1Var;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        i1 i1Var = this.d;
        if (i1Var.K) {
            for (int i10 = 1; i10 < i1Var.e.getChildCount(); i10++) {
                View childAt = i1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    i1Var.J = childAt;
                    return true;
                }
            }
        }
        this.a = i1Var.Q;
        this.b = i1Var.R;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i1 i1Var = this.d;
        if (!i1Var.H || i1Var.I) {
            return false;
        }
        o1.k kVar = i1Var.S;
        kVar.a = f7;
        float f11 = i1Var.Q;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((i1Var.M / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        i1Var.S.f();
        o1.k kVar2 = i1Var.T;
        kVar2.a = f7;
        kVar2.b = i1Var.R;
        kVar2.c = true;
        kVar2.u.i = w7.q.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.N) - AndroidUtilities.dp(16.0f));
        i1Var.T.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i1 i1Var = this.d;
        if (!i1Var.H && i1Var.L == null && !i1Var.I) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                i1Var.H = true;
                i1Var.S.c();
                i1Var.T.c();
            }
        }
        if (i1Var.H) {
            WindowManager.LayoutParams layoutParams = i1Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            i1Var.Q = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = i1Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            i1Var.R = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(i1Var.b, i1Var.d, i1Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i1 i1Var = this.d;
        ValueAnimator valueAnimator = i1Var.L;
        x xVar = i1Var.X;
        if (valueAnimator == null) {
            if (i1Var.W) {
                AndroidUtilities.cancelRunOnUIThread(xVar);
                i1Var.W = false;
            }
            boolean z10 = !i1Var.K;
            i1Var.K = z10;
            i1Var.o(z10);
            if (i1Var.K && !i1Var.W) {
                AndroidUtilities.runOnUIThread(xVar, 2500L);
                i1Var.W = true;
            }
        }
        return true;
    }
}
