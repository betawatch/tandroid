package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ac1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ fc1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac1(fc1 fc1Var, Activity activity) {
        super(activity);
        this.e = fc1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        fc1 fc1Var = this.e;
        org.telegram.ui.Components.voip.u2 u2Var = fc1Var.w;
        if (view == u2Var && (fc1Var.m0 || fc1Var.l0)) {
            return false;
        }
        if ((view != u2Var && view != fc1Var.c0 && (view != fc1Var.Y || !fc1Var.a0)) || (!fc1Var.f1 && fc1Var.h1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = fc1Var.e1;
        canvas.scale(f10, f10, fc1Var.a1, fc1Var.b1);
        canvas.translate(fc1Var.X0, fc1Var.Y0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fc1 fc1Var = this.e;
        rb1 rb1Var = fc1Var.S0;
        if (motionEvent.getActionMasked() == 1) {
            fc1Var.D.b(false, false);
            fc1Var.w.a();
            org.telegram.messenger.g0.r(rb1Var);
            if (fc1Var.o0 == 3) {
                org.telegram.messenger.g0.i3(rb1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.zo zoVar;
        fc1 fc1Var = this.e;
        rb1 rb1Var = fc1Var.S0;
        if (motionEvent.getActionMasked() == 1) {
            fc1Var.D.b(false, false);
            fc1Var.w.a();
            org.telegram.messenger.g0.r(rb1Var);
            if (fc1Var.o0 == 3) {
                org.telegram.messenger.g0.i3(rb1Var, 10000L);
            }
        }
        if (!fc1Var.g1 && !fc1Var.Z0 && !fc1Var.f1 && motionEvent.getActionMasked() != 0) {
            fc1.a(fc1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            fc1Var.g1 = false;
            fc1Var.Z0 = false;
            fc1Var.f1 = false;
        }
        org.telegram.ui.Components.voip.k2 k2Var = fc1Var.l0 ? fc1Var.c0 : fc1Var.d0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(k2Var.getX(), k2Var.getY(), k2Var.getX() + k2Var.getMeasuredWidth(), k2Var.getY() + k2Var.getMeasuredHeight());
                rectF.inset(((k2Var.getMeasuredHeight() * k2Var.T) - k2Var.getMeasuredHeight()) / 2.0f, ((k2Var.getMeasuredWidth() * k2Var.T) - k2Var.getMeasuredWidth()) / 2.0f);
                if (c40.w5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, k2Var.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, k2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                fc1Var.g1 = contains;
                if (!contains) {
                    fc1.a(fc1Var);
                }
            }
            if (fc1Var.g1 && !fc1Var.Z0 && motionEvent.getPointerCount() == 2) {
                fc1Var.W0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                fc1Var.a1 = x10;
                fc1Var.U0 = x10;
                float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                fc1Var.b1 = y10;
                fc1Var.V0 = y10;
                fc1Var.e1 = 1.0f;
                fc1Var.c1 = motionEvent.getPointerId(0);
                fc1Var.d1 = motionEvent.getPointerId(1);
                fc1Var.Z0 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && fc1Var.Z0) {
            int i7 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                if (fc1Var.c1 == motionEvent.getPointerId(i11)) {
                    i7 = i11;
                }
                if (fc1Var.d1 == motionEvent.getPointerId(i11)) {
                    i10 = i11;
                }
            }
            if (i7 == -1 || i10 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                fc1.a(fc1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / fc1Var.W0;
                fc1Var.e1 = hypot;
                if (hypot > 1.005f && !fc1Var.f1) {
                    fc1Var.W0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7));
                    float x11 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                    fc1Var.a1 = x11;
                    fc1Var.U0 = x11;
                    float y11 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                    fc1Var.b1 = y11;
                    fc1Var.V0 = y11;
                    fc1Var.e1 = 1.0f;
                    fc1Var.X0 = 0.0f;
                    fc1Var.Y0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    fc1Var.f1 = true;
                    fc1Var.Z0 = true;
                }
                float x12 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                float y12 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                float f10 = fc1Var.U0 - x12;
                float f11 = fc1Var.V0 - y12;
                float f12 = fc1Var.e1;
                fc1Var.X0 = (-f10) / f12;
                fc1Var.Y0 = (-f11) / f12;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((fc1Var.c1 == motionEvent.getPointerId(0) && fc1Var.d1 == motionEvent.getPointerId(1)) || (fc1Var.c1 == motionEvent.getPointerId(1) && fc1Var.d1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            fc1.a(fc1Var);
        }
        fc1Var.s.invalidate();
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
            float f14 = fc1Var.s0;
            if (f13 < f14 * f14 && currentTimeMillis - this.d < 300 && currentTimeMillis - fc1Var.J0 > 300) {
                fc1Var.J0 = System.currentTimeMillis();
                if (fc1Var.B0) {
                    fc1Var.d(false);
                } else if (fc1Var.y0) {
                    fc1Var.r(!fc1Var.w0);
                    fc1Var.p0 = fc1Var.o0;
                    if (!fc1Var.w0 && (zoVar = fc1Var.M0) != null && zoVar.V) {
                        zoVar.f(true);
                    }
                    fc1Var.y();
                }
            }
            this.c = false;
        }
        return fc1Var.g1 || this.c;
    }
}
