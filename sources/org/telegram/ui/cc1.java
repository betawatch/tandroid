package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class cc1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ hc1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc1(hc1 hc1Var, Activity activity) {
        super(activity);
        this.e = hc1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        hc1 hc1Var = this.e;
        org.telegram.ui.Components.voip.x2 x2Var = hc1Var.w;
        if (view == x2Var && (hc1Var.n0 || hc1Var.m0)) {
            return false;
        }
        if ((view != x2Var && view != hc1Var.d0 && (view != hc1Var.Z || !hc1Var.b0)) || (!hc1Var.g1 && hc1Var.i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = hc1Var.f1;
        canvas.scale(f10, f10, hc1Var.b1, hc1Var.c1);
        canvas.translate(hc1Var.Y0, hc1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hc1 hc1Var = this.e;
        tb1 tb1Var = hc1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            hc1Var.E.b(false, false);
            hc1Var.w.a();
            org.telegram.messenger.g0.r(tb1Var);
            if (hc1Var.p0 == 3) {
                org.telegram.messenger.g0.h3(tb1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.pp ppVar;
        hc1 hc1Var = this.e;
        tb1 tb1Var = hc1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            hc1Var.E.b(false, false);
            hc1Var.w.a();
            org.telegram.messenger.g0.r(tb1Var);
            if (hc1Var.p0 == 3) {
                org.telegram.messenger.g0.h3(tb1Var, 10000L);
            }
        }
        if (!hc1Var.h1 && !hc1Var.a1 && !hc1Var.g1 && motionEvent.getActionMasked() != 0) {
            hc1.a(hc1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            hc1Var.h1 = false;
            hc1Var.a1 = false;
            hc1Var.g1 = false;
        }
        org.telegram.ui.Components.voip.n2 n2Var = hc1Var.m0 ? hc1Var.d0 : hc1Var.e0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(n2Var.getX(), n2Var.getY(), n2Var.getX() + n2Var.getMeasuredWidth(), n2Var.getY() + n2Var.getMeasuredHeight());
                rectF.inset(((n2Var.getMeasuredHeight() * n2Var.U) - n2Var.getMeasuredHeight()) / 2.0f, ((n2Var.getMeasuredWidth() * n2Var.U) - n2Var.getMeasuredWidth()) / 2.0f);
                if (f40.E5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, n2Var.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, n2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                hc1Var.h1 = contains;
                if (!contains) {
                    hc1.a(hc1Var);
                }
            }
            if (hc1Var.h1 && !hc1Var.a1 && motionEvent.getPointerCount() == 2) {
                hc1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                hc1Var.b1 = x10;
                hc1Var.V0 = x10;
                float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                hc1Var.c1 = y10;
                hc1Var.W0 = y10;
                hc1Var.f1 = 1.0f;
                hc1Var.d1 = motionEvent.getPointerId(0);
                hc1Var.e1 = motionEvent.getPointerId(1);
                hc1Var.a1 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && hc1Var.a1) {
            int i7 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                if (hc1Var.d1 == motionEvent.getPointerId(i11)) {
                    i7 = i11;
                }
                if (hc1Var.e1 == motionEvent.getPointerId(i11)) {
                    i10 = i11;
                }
            }
            if (i7 == -1 || i10 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                hc1.a(hc1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / hc1Var.X0;
                hc1Var.f1 = hypot;
                if (hypot > 1.005f && !hc1Var.g1) {
                    hc1Var.X0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7));
                    float x11 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                    hc1Var.b1 = x11;
                    hc1Var.V0 = x11;
                    float y11 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                    hc1Var.c1 = y11;
                    hc1Var.W0 = y11;
                    hc1Var.f1 = 1.0f;
                    hc1Var.Y0 = 0.0f;
                    hc1Var.Z0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    hc1Var.g1 = true;
                    hc1Var.a1 = true;
                }
                float x12 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                float y12 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                float f10 = hc1Var.V0 - x12;
                float f11 = hc1Var.W0 - y12;
                float f12 = hc1Var.f1;
                hc1Var.Y0 = (-f10) / f12;
                hc1Var.Z0 = (-f11) / f12;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((hc1Var.d1 == motionEvent.getPointerId(0) && hc1Var.e1 == motionEvent.getPointerId(1)) || (hc1Var.d1 == motionEvent.getPointerId(1) && hc1Var.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            hc1.a(hc1Var);
        }
        hc1Var.s.invalidate();
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
            float f14 = hc1Var.t0;
            if (f13 < f14 * f14 && currentTimeMillis - this.d < 300 && currentTimeMillis - hc1Var.K0 > 300) {
                hc1Var.K0 = System.currentTimeMillis();
                if (hc1Var.C0) {
                    hc1Var.d(false);
                } else if (hc1Var.z0) {
                    hc1Var.r(!hc1Var.x0);
                    hc1Var.q0 = hc1Var.p0;
                    if (!hc1Var.x0 && (ppVar = hc1Var.N0) != null && ppVar.W) {
                        ppVar.f(true);
                    }
                    hc1Var.y();
                }
            }
            this.c = false;
        }
        return hc1Var.h1 || this.c;
    }
}
