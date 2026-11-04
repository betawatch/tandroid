package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import b8.be;
import org.telegram.ui.ActionBar.d4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p0 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ s0 d;

    public p0(s0 s0Var, int i3) {
        this.d = s0Var;
        this.c = i3;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        s0 s0Var = this.d;
        if (s0Var.L) {
            for (int i3 = 1; i3 < s0Var.e.getChildCount(); i3++) {
                View childAt = s0Var.e.getChildAt(i3);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    s0Var.K = childAt;
                    return true;
                }
            }
        }
        this.a = s0Var.R;
        this.b = s0Var.S;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        s0 s0Var = this.d;
        if (!s0Var.I || s0Var.J) {
            return false;
        }
        q1.g gVar = s0Var.T;
        gVar.a = f10;
        float f12 = s0Var.R;
        gVar.b = f12;
        gVar.c = true;
        gVar.m.i = (f10 / 7.0f) + ((s0Var.N / 2.0f) + f12) >= ((float) org.telegram.messenger.g0.q.x) / 2.0f ? (r5 - r2) - org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f);
        s0Var.T.h();
        q1.g gVar2 = s0Var.U;
        gVar2.a = f10;
        gVar2.b = s0Var.S;
        gVar2.c = true;
        gVar2.m.i = be.a((f11 / 10.0f) + r10, org.telegram.messenger.g0.L(16.0f), (r3.y - s0Var.O) - org.telegram.messenger.g0.L(16.0f));
        s0Var.U.h();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        s0 s0Var = this.d;
        if (!s0Var.I && s0Var.M == null && !s0Var.J) {
            float abs = Math.abs(f10);
            float f12 = this.c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                s0Var.I = true;
                s0Var.T.d();
                s0Var.U.d();
            }
        }
        if (s0Var.I) {
            WindowManager.LayoutParams layoutParams = s0Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            s0Var.R = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = s0Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            s0Var.S = rawY;
            layoutParams2.y = (int) rawY;
            org.telegram.messenger.g0.T3(s0Var.b, s0Var.d, s0Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        s0 s0Var = this.d;
        ValueAnimator valueAnimator = s0Var.M;
        d4 d4Var = s0Var.Y;
        if (valueAnimator == null) {
            if (s0Var.X) {
                org.telegram.messenger.g0.r(d4Var);
                s0Var.X = false;
            }
            boolean z10 = !s0Var.L;
            s0Var.L = z10;
            s0Var.j(z10);
            if (s0Var.L && !s0Var.X) {
                org.telegram.messenger.g0.i3(d4Var, 2500L);
                s0Var.X = true;
            }
        }
        return true;
    }
}
