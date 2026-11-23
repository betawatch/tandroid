package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        org.telegram.ui.Components.voip.y2 y2Var = fc1Var.w;
        if (view == y2Var && (fc1Var.n0 || fc1Var.m0)) {
            return false;
        }
        if ((view != y2Var && view != fc1Var.d0 && (view != fc1Var.Z || !fc1Var.b0)) || (!fc1Var.g1 && fc1Var.i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = fc1Var.f1;
        canvas.scale(f10, f10, fc1Var.b1, fc1Var.c1);
        canvas.translate(fc1Var.Y0, fc1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fc1 fc1Var = this.e;
        rb1 rb1Var = fc1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            fc1Var.E.b(false, false);
            fc1Var.w.a();
            org.telegram.messenger.g0.r(rb1Var);
            if (fc1Var.p0 == 3) {
                org.telegram.messenger.g0.h3(rb1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.op opVar;
        fc1 fc1Var = this.e;
        rb1 rb1Var = fc1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            fc1Var.E.b(false, false);
            fc1Var.w.a();
            org.telegram.messenger.g0.r(rb1Var);
            if (fc1Var.p0 == 3) {
                org.telegram.messenger.g0.h3(rb1Var, 10000L);
            }
        }
        if (!fc1Var.h1 && !fc1Var.a1 && !fc1Var.g1 && motionEvent.getActionMasked() != 0) {
            fc1.a(fc1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            fc1Var.h1 = false;
            fc1Var.a1 = false;
            fc1Var.g1 = false;
        }
        org.telegram.ui.Components.voip.o2 o2Var = fc1Var.m0 ? fc1Var.d0 : fc1Var.e0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(o2Var.getX(), o2Var.getY(), o2Var.getX() + o2Var.getMeasuredWidth(), o2Var.getY() + o2Var.getMeasuredHeight());
                rectF.inset(((o2Var.getMeasuredHeight() * o2Var.U) - o2Var.getMeasuredHeight()) / 2.0f, ((o2Var.getMeasuredWidth() * o2Var.U) - o2Var.getMeasuredWidth()) / 2.0f);
                if (e40.E5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, o2Var.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, o2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                fc1Var.h1 = contains;
                if (!contains) {
                    fc1.a(fc1Var);
                }
            }
            if (fc1Var.h1 && !fc1Var.a1 && motionEvent.getPointerCount() == 2) {
                fc1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                fc1Var.b1 = x10;
                fc1Var.V0 = x10;
                float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                fc1Var.c1 = y10;
                fc1Var.W0 = y10;
                fc1Var.f1 = 1.0f;
                fc1Var.d1 = motionEvent.getPointerId(0);
                fc1Var.e1 = motionEvent.getPointerId(1);
                fc1Var.a1 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && fc1Var.a1) {
            int i7 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                if (fc1Var.d1 == motionEvent.getPointerId(i11)) {
                    i7 = i11;
                }
                if (fc1Var.e1 == motionEvent.getPointerId(i11)) {
                    i10 = i11;
                }
            }
            if (i7 == -1 || i10 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                fc1.a(fc1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / fc1Var.X0;
                fc1Var.f1 = hypot;
                if (hypot > 1.005f && !fc1Var.g1) {
                    fc1Var.X0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7));
                    float x11 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                    fc1Var.b1 = x11;
                    fc1Var.V0 = x11;
                    float y11 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                    fc1Var.c1 = y11;
                    fc1Var.W0 = y11;
                    fc1Var.f1 = 1.0f;
                    fc1Var.Y0 = 0.0f;
                    fc1Var.Z0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    fc1Var.g1 = true;
                    fc1Var.a1 = true;
                }
                float x12 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                float y12 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                float f10 = fc1Var.V0 - x12;
                float f11 = fc1Var.W0 - y12;
                float f12 = fc1Var.f1;
                fc1Var.Y0 = (-f10) / f12;
                fc1Var.Z0 = (-f11) / f12;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((fc1Var.d1 == motionEvent.getPointerId(0) && fc1Var.e1 == motionEvent.getPointerId(1)) || (fc1Var.d1 == motionEvent.getPointerId(1) && fc1Var.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
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
            float f14 = fc1Var.t0;
            if (f13 < f14 * f14 && currentTimeMillis - this.d < 300 && currentTimeMillis - fc1Var.K0 > 300) {
                fc1Var.K0 = System.currentTimeMillis();
                if (fc1Var.C0) {
                    fc1Var.d(false);
                } else if (fc1Var.z0) {
                    fc1Var.r(!fc1Var.x0);
                    fc1Var.q0 = fc1Var.p0;
                    if (!fc1Var.x0 && (opVar = fc1Var.N0) != null && opVar.W) {
                        opVar.f(true);
                    }
                    fc1Var.y();
                }
            }
            this.c = false;
        }
        return fc1Var.h1 || this.c;
    }
}
