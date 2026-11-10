package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ec1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ jc1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec1(jc1 jc1Var, Activity activity) {
        super(activity);
        this.e = jc1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        jc1 jc1Var = this.e;
        org.telegram.ui.Components.voip.u2 u2Var = jc1Var.w;
        if (view == u2Var && (jc1Var.m0 || jc1Var.l0)) {
            return false;
        }
        if ((view != u2Var && view != jc1Var.c0 && (view != jc1Var.Y || !jc1Var.a0)) || (!jc1Var.f1 && jc1Var.h1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = jc1Var.e1;
        canvas.scale(f10, f10, jc1Var.a1, jc1Var.b1);
        canvas.translate(jc1Var.X0, jc1Var.Y0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        jc1 jc1Var = this.e;
        vb1 vb1Var = jc1Var.S0;
        if (motionEvent.getActionMasked() == 1) {
            jc1Var.D.b(false, false);
            jc1Var.w.a();
            org.telegram.messenger.g0.r(vb1Var);
            if (jc1Var.o0 == 3) {
                org.telegram.messenger.g0.i3(vb1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.zo zoVar;
        jc1 jc1Var = this.e;
        vb1 vb1Var = jc1Var.S0;
        if (motionEvent.getActionMasked() == 1) {
            jc1Var.D.b(false, false);
            jc1Var.w.a();
            org.telegram.messenger.g0.r(vb1Var);
            if (jc1Var.o0 == 3) {
                org.telegram.messenger.g0.i3(vb1Var, 10000L);
            }
        }
        if (!jc1Var.g1 && !jc1Var.Z0 && !jc1Var.f1 && motionEvent.getActionMasked() != 0) {
            jc1.a(jc1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            jc1Var.g1 = false;
            jc1Var.Z0 = false;
            jc1Var.f1 = false;
        }
        org.telegram.ui.Components.voip.k2 k2Var = jc1Var.l0 ? jc1Var.c0 : jc1Var.d0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(k2Var.getX(), k2Var.getY(), k2Var.getX() + k2Var.getMeasuredWidth(), k2Var.getY() + k2Var.getMeasuredHeight());
                rectF.inset(((k2Var.getMeasuredHeight() * k2Var.T) - k2Var.getMeasuredHeight()) / 2.0f, ((k2Var.getMeasuredWidth() * k2Var.T) - k2Var.getMeasuredWidth()) / 2.0f);
                if (f40.z5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, k2Var.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, k2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                jc1Var.g1 = contains;
                if (!contains) {
                    jc1.a(jc1Var);
                }
            }
            if (jc1Var.g1 && !jc1Var.Z0 && motionEvent.getPointerCount() == 2) {
                jc1Var.W0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                jc1Var.a1 = x10;
                jc1Var.U0 = x10;
                float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                jc1Var.b1 = y10;
                jc1Var.V0 = y10;
                jc1Var.e1 = 1.0f;
                jc1Var.c1 = motionEvent.getPointerId(0);
                jc1Var.d1 = motionEvent.getPointerId(1);
                jc1Var.Z0 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && jc1Var.Z0) {
            int i7 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                if (jc1Var.c1 == motionEvent.getPointerId(i11)) {
                    i7 = i11;
                }
                if (jc1Var.d1 == motionEvent.getPointerId(i11)) {
                    i10 = i11;
                }
            }
            if (i7 == -1 || i10 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                jc1.a(jc1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / jc1Var.W0;
                jc1Var.e1 = hypot;
                if (hypot > 1.005f && !jc1Var.f1) {
                    jc1Var.W0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7));
                    float x11 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                    jc1Var.a1 = x11;
                    jc1Var.U0 = x11;
                    float y11 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                    jc1Var.b1 = y11;
                    jc1Var.V0 = y11;
                    jc1Var.e1 = 1.0f;
                    jc1Var.X0 = 0.0f;
                    jc1Var.Y0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    jc1Var.f1 = true;
                    jc1Var.Z0 = true;
                }
                float x12 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                float y12 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                float f10 = jc1Var.U0 - x12;
                float f11 = jc1Var.V0 - y12;
                float f12 = jc1Var.e1;
                jc1Var.X0 = (-f10) / f12;
                jc1Var.Y0 = (-f11) / f12;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((jc1Var.c1 == motionEvent.getPointerId(0) && jc1Var.d1 == motionEvent.getPointerId(1)) || (jc1Var.c1 == motionEvent.getPointerId(1) && jc1Var.d1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            jc1.a(jc1Var);
        }
        jc1Var.s.invalidate();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a = motionEvent.getX();
            this.b = motionEvent.getY();
            this.c = true;
            this.d = System.currentTimeMillis();
        } else if (action != 1) {
            if (action == 3) {
                this.c = false;
            }
        } else if (this.c) {
            float x13 = motionEvent.getX() - this.a;
            float y13 = motionEvent.getY() - this.b;
            long currentTimeMillis = System.currentTimeMillis();
            float f13 = (y13 * y13) + (x13 * x13);
            float f14 = jc1Var.s0;
            if (f13 < f14 * f14 && currentTimeMillis - this.d < 300 && currentTimeMillis - jc1Var.J0 > 300) {
                jc1Var.J0 = System.currentTimeMillis();
                if (jc1Var.B0) {
                    jc1Var.d(false);
                } else if (jc1Var.y0) {
                    jc1Var.r(!jc1Var.w0);
                    jc1Var.p0 = jc1Var.o0;
                    if (!jc1Var.w0 && (zoVar = jc1Var.M0) != null && zoVar.V) {
                        zoVar.f(true);
                    }
                    jc1Var.y();
                }
            }
            this.c = false;
        }
        return jc1Var.g1 || this.c;
    }
}
