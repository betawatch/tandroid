package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.ui.ActionBar.w5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q0 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ s0 d;

    public q0(s0 s0Var, int i10) {
        this.d = s0Var;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        s0 s0Var = this.d;
        if (s0Var.K) {
            for (int i10 = 1; i10 < s0Var.e.getChildCount(); i10++) {
                View childAt = s0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    s0Var.J = childAt;
                    return true;
                }
            }
        }
        this.a = s0Var.Q;
        this.b = s0Var.R;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        s0 s0Var = this.d;
        if (!s0Var.H || s0Var.I) {
            return false;
        }
        o1.j jVar = s0Var.S;
        jVar.a = f7;
        float f11 = s0Var.Q;
        jVar.b = f11;
        jVar.c = true;
        jVar.m.i = (f7 / 7.0f) + ((s0Var.M / 2.0f) + f11) >= ((float) org.telegram.messenger.i0.q.x) / 2.0f ? (r5 - r2) - org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(16.0f);
        s0Var.S.h();
        o1.j jVar2 = s0Var.T;
        jVar2.a = f7;
        jVar2.b = s0Var.R;
        jVar2.c = true;
        jVar2.m.i = w7.u.a((f10 / 10.0f) + r10, org.telegram.messenger.i0.L(16.0f), (r3.y - s0Var.N) - org.telegram.messenger.i0.L(16.0f));
        s0Var.T.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        s0 s0Var = this.d;
        if (!s0Var.H && s0Var.L == null && !s0Var.I) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                s0Var.H = true;
                s0Var.S.d();
                s0Var.T.d();
            }
        }
        if (s0Var.H) {
            WindowManager.LayoutParams layoutParams = s0Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            s0Var.Q = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = s0Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            s0Var.R = rawY;
            layoutParams2.y = (int) rawY;
            org.telegram.messenger.i0.S3(s0Var.b, s0Var.d, s0Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        s0 s0Var = this.d;
        ValueAnimator valueAnimator = s0Var.L;
        w5 w5Var = s0Var.X;
        if (valueAnimator == null) {
            if (s0Var.W) {
                org.telegram.messenger.i0.r(w5Var);
                s0Var.W = false;
            }
            boolean z10 = !s0Var.K;
            s0Var.K = z10;
            s0Var.j(z10);
            if (s0Var.K && !s0Var.W) {
                org.telegram.messenger.i0.h3(w5Var, 2500L);
                s0Var.W = true;
            }
        }
        return true;
    }
}
