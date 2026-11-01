package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.ui.ActionBar.w5;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class r0 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ t0 d;

    public r0(t0 t0Var, int i10) {
        this.d = t0Var;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        t0 t0Var = this.d;
        if (t0Var.K) {
            for (int i10 = 1; i10 < t0Var.e.getChildCount(); i10++) {
                View childAt = t0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    t0Var.J = childAt;
                    return true;
                }
            }
        }
        this.a = t0Var.Q;
        this.b = t0Var.R;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        t0 t0Var = this.d;
        if (!t0Var.H || t0Var.I) {
            return false;
        }
        o1.j jVar = t0Var.S;
        jVar.a = f7;
        float f11 = t0Var.Q;
        jVar.b = f11;
        jVar.c = true;
        jVar.m.i = (f7 / 7.0f) + ((t0Var.M / 2.0f) + f11) >= ((float) org.telegram.messenger.i0.q.x) / 2.0f ? (r5 - r2) - org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(16.0f);
        t0Var.S.h();
        o1.j jVar2 = t0Var.T;
        jVar2.a = f7;
        jVar2.b = t0Var.R;
        jVar2.c = true;
        jVar2.m.i = w7.u.a((f10 / 10.0f) + r10, org.telegram.messenger.i0.L(16.0f), (r3.y - t0Var.N) - org.telegram.messenger.i0.L(16.0f));
        t0Var.T.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        t0 t0Var = this.d;
        if (!t0Var.H && t0Var.L == null && !t0Var.I) {
            float abs = Math.abs(f7);
            float f11 = this.c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                t0Var.H = true;
                t0Var.S.d();
                t0Var.T.d();
            }
        }
        if (t0Var.H) {
            WindowManager.LayoutParams layoutParams = t0Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            t0Var.Q = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = t0Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            t0Var.R = rawY;
            layoutParams2.y = (int) rawY;
            org.telegram.messenger.i0.S3(t0Var.b, t0Var.d, t0Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        t0 t0Var = this.d;
        ValueAnimator valueAnimator = t0Var.L;
        w5 w5Var = t0Var.X;
        if (valueAnimator == null) {
            if (t0Var.W) {
                org.telegram.messenger.i0.r(w5Var);
                t0Var.W = false;
            }
            boolean z10 = !t0Var.K;
            t0Var.K = z10;
            t0Var.j(z10);
            if (t0Var.K && !t0Var.W) {
                org.telegram.messenger.i0.h3(w5Var, 2500L);
                t0Var.W = true;
            }
        }
        return true;
    }
}
