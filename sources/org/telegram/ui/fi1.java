package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class fi1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ ki1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi1(ki1 ki1Var, Activity activity) {
        super(activity);
        this.e = ki1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ki1 ki1Var = this.e;
        org.telegram.ui.Components.voip.d3 d3Var = ki1Var.v;
        if (view == d3Var && (ki1Var.n0 || ki1Var.m0)) {
            return false;
        }
        if ((view != d3Var && view != ki1Var.c0 && (view != ki1Var.Y || !ki1Var.a0)) || (!ki1Var.g1 && ki1Var.i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f7 = ki1Var.f1;
        canvas.scale(f7, f7, ki1Var.b1, ki1Var.c1);
        canvas.translate(ki1Var.Y0, ki1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ki1 ki1Var = this.e;
        uh1 uh1Var = ki1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ki1Var.y.b(false, false);
            ki1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(uh1Var);
            if (ki1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(uh1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.e3 e3Var;
        ki1 ki1Var = this.e;
        uh1 uh1Var = ki1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ki1Var.y.b(false, false);
            ki1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(uh1Var);
            if (ki1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(uh1Var, 10000L);
            }
        }
        if (!ki1Var.h1 && !ki1Var.a1 && !ki1Var.g1 && motionEvent.getActionMasked() != 0) {
            ki1.j(ki1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ki1Var.h1 = false;
            ki1Var.a1 = false;
            ki1Var.g1 = false;
        }
        org.telegram.ui.Components.voip.t2 t2Var = ki1Var.m0 ? ki1Var.c0 : ki1Var.d0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(t2Var.getX(), t2Var.getY(), t2Var.getX() + t2Var.getMeasuredWidth(), t2Var.getY() + t2Var.getMeasuredHeight());
                rectF.inset(((t2Var.getMeasuredHeight() * t2Var.T) - t2Var.getMeasuredHeight()) / 2.0f, ((t2Var.getMeasuredWidth() * t2Var.T) - t2Var.getMeasuredWidth()) / 2.0f);
                if (h60.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, t2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, t2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ki1Var.h1 = contains;
                if (!contains) {
                    ki1.j(ki1Var);
                }
            }
            if (ki1Var.h1 && !ki1Var.a1 && motionEvent.getPointerCount() == 2) {
                ki1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ki1Var.b1 = x10;
                ki1Var.V0 = x10;
                float y3 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ki1Var.c1 = y3;
                ki1Var.W0 = y3;
                ki1Var.f1 = 1.0f;
                ki1Var.d1 = motionEvent.getPointerId(0);
                ki1Var.e1 = motionEvent.getPointerId(1);
                ki1Var.a1 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && ki1Var.a1) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (ki1Var.d1 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (ki1Var.e1 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ki1.j(ki1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / ki1Var.X0;
                ki1Var.f1 = hypot;
                if (hypot > 1.005f && !ki1Var.g1) {
                    ki1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                    float x11 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    ki1Var.b1 = x11;
                    ki1Var.V0 = x11;
                    float y10 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    ki1Var.c1 = y10;
                    ki1Var.W0 = y10;
                    ki1Var.f1 = 1.0f;
                    ki1Var.Y0 = 0.0f;
                    ki1Var.Z0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    ki1Var.g1 = true;
                    ki1Var.a1 = true;
                }
                float x12 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                float y11 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                float f7 = ki1Var.V0 - x12;
                float f10 = ki1Var.W0 - y11;
                float f11 = ki1Var.f1;
                ki1Var.Y0 = (-f7) / f11;
                ki1Var.Z0 = (-f10) / f11;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ki1Var.d1 == motionEvent.getPointerId(0) && ki1Var.e1 == motionEvent.getPointerId(1)) || (ki1Var.d1 == motionEvent.getPointerId(1) && ki1Var.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            ki1.j(ki1Var);
        }
        ki1Var.s.invalidate();
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
            float f13 = ki1Var.t0;
            if (f12 < f13 * f13 && currentTimeMillis - this.d < 300 && currentTimeMillis - ki1Var.K0 > 300) {
                ki1Var.K0 = System.currentTimeMillis();
                if (ki1Var.C0) {
                    ki1Var.m(false);
                } else if (ki1Var.z0) {
                    ki1Var.A(!ki1Var.x0);
                    ki1Var.q0 = ki1Var.p0;
                    if (!ki1Var.x0 && (e3Var = ki1Var.N0) != null && e3Var.V) {
                        e3Var.e(true);
                    }
                    ki1Var.H();
                }
            }
            this.c = false;
        }
        return ki1Var.h1 || this.c;
    }
}
