package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ni1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ si1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni1(si1 si1Var, Activity activity) {
        super(activity);
        this.e = si1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        si1 si1Var = this.e;
        org.telegram.ui.Components.voip.c3 c3Var = si1Var.v;
        if (view == c3Var && (si1Var.n0 || si1Var.m0)) {
            return false;
        }
        if ((view != c3Var && view != si1Var.c0 && (view != si1Var.Y || !si1Var.a0)) || (!si1Var.g1 && si1Var.i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f7 = si1Var.f1;
        canvas.scale(f7, f7, si1Var.b1, si1Var.c1);
        canvas.translate(si1Var.Y0, si1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        si1 si1Var = this.e;
        ci1 ci1Var = si1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            si1Var.y.b(false, false);
            si1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ci1Var);
            if (si1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(ci1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.d3 d3Var;
        si1 si1Var = this.e;
        ci1 ci1Var = si1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            si1Var.y.b(false, false);
            si1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ci1Var);
            if (si1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(ci1Var, 10000L);
            }
        }
        if (!si1Var.h1 && !si1Var.a1 && !si1Var.g1 && motionEvent.getActionMasked() != 0) {
            si1.j(si1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            si1Var.h1 = false;
            si1Var.a1 = false;
            si1Var.g1 = false;
        }
        org.telegram.ui.Components.voip.s2 s2Var = si1Var.m0 ? si1Var.c0 : si1Var.d0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(s2Var.getX(), s2Var.getY(), s2Var.getX() + s2Var.getMeasuredWidth(), s2Var.getY() + s2Var.getMeasuredHeight());
                rectF.inset(((s2Var.getMeasuredHeight() * s2Var.T) - s2Var.getMeasuredHeight()) / 2.0f, ((s2Var.getMeasuredWidth() * s2Var.T) - s2Var.getMeasuredWidth()) / 2.0f);
                if (i60.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, s2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, s2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                si1Var.h1 = contains;
                if (!contains) {
                    si1.j(si1Var);
                }
            }
            if (si1Var.h1 && !si1Var.a1 && motionEvent.getPointerCount() == 2) {
                si1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                si1Var.b1 = x10;
                si1Var.V0 = x10;
                float y3 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                si1Var.c1 = y3;
                si1Var.W0 = y3;
                si1Var.f1 = 1.0f;
                si1Var.d1 = motionEvent.getPointerId(0);
                si1Var.e1 = motionEvent.getPointerId(1);
                si1Var.a1 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && si1Var.a1) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (si1Var.d1 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (si1Var.e1 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                si1.j(si1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / si1Var.X0;
                si1Var.f1 = hypot;
                if (hypot > 1.005f && !si1Var.g1) {
                    si1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                    float x11 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    si1Var.b1 = x11;
                    si1Var.V0 = x11;
                    float y10 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    si1Var.c1 = y10;
                    si1Var.W0 = y10;
                    si1Var.f1 = 1.0f;
                    si1Var.Y0 = 0.0f;
                    si1Var.Z0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    si1Var.g1 = true;
                    si1Var.a1 = true;
                }
                float x12 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                float y11 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                float f7 = si1Var.V0 - x12;
                float f10 = si1Var.W0 - y11;
                float f11 = si1Var.f1;
                si1Var.Y0 = (-f7) / f11;
                si1Var.Z0 = (-f10) / f11;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((si1Var.d1 == motionEvent.getPointerId(0) && si1Var.e1 == motionEvent.getPointerId(1)) || (si1Var.d1 == motionEvent.getPointerId(1) && si1Var.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            si1.j(si1Var);
        }
        si1Var.s.invalidate();
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
            float y12 = motionEvent.getY() - this.b;
            long currentTimeMillis = System.currentTimeMillis();
            float f12 = (y12 * y12) + (x13 * x13);
            float f13 = si1Var.t0;
            if (f12 < f13 * f13 && currentTimeMillis - this.d < 300 && currentTimeMillis - si1Var.K0 > 300) {
                si1Var.K0 = System.currentTimeMillis();
                if (si1Var.C0) {
                    si1Var.m(false);
                } else if (si1Var.z0) {
                    si1Var.A(!si1Var.x0);
                    si1Var.q0 = si1Var.p0;
                    if (!si1Var.x0 && (d3Var = si1Var.N0) != null && d3Var.V) {
                        d3Var.e(true);
                    }
                    si1Var.H();
                }
            }
            this.c = false;
        }
        return si1Var.h1 || this.c;
    }
}
