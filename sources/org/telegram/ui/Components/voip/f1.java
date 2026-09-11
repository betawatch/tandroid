package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
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
        if (h1Var.K) {
            for (int i10 = 1; i10 < h1Var.e.getChildCount(); i10++) {
                View childAt = h1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    h1Var.J = childAt;
                    return true;
                }
            }
        }
        this.a = h1Var.Q;
        this.b = h1Var.R;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        h1 h1Var = this.d;
        if (!h1Var.H || h1Var.I) {
            return false;
        }
        o1.k kVar = h1Var.S;
        kVar.a = f7;
        float f11 = h1Var.Q;
        kVar.b = f11;
        kVar.c = true;
        kVar.u.i = (f7 / 7.0f) + ((h1Var.M / 2.0f) + f11) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        h1Var.S.f();
        o1.k kVar2 = h1Var.T;
        kVar2.a = f7;
        kVar2.b = h1Var.R;
        kVar2.c = true;
        kVar2.u.i = w7.p.a((f10 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f));
        h1Var.T.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        h1 h1Var = this.d;
        if (!h1Var.H && h1Var.L == null && !h1Var.I) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                h1Var.H = true;
                h1Var.S.c();
                h1Var.T.c();
            }
        }
        if (h1Var.H) {
            WindowManager.LayoutParams layoutParams = h1Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            h1Var.Q = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = h1Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            h1Var.R = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(h1Var.b, h1Var.d, h1Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h1 h1Var = this.d;
        ValueAnimator valueAnimator = h1Var.L;
        ig.t0 t0Var = h1Var.X;
        if (valueAnimator == null) {
            if (h1Var.W) {
                AndroidUtilities.cancelRunOnUIThread(t0Var);
                h1Var.W = false;
            }
            boolean z10 = !h1Var.K;
            h1Var.K = z10;
            h1Var.o(z10);
            if (h1Var.K && !h1Var.W) {
                AndroidUtilities.runOnUIThread(t0Var, 2500L);
                h1Var.W = true;
            }
        }
        return true;
    }
}
