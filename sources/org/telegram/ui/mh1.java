package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mh1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ rh1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh1(rh1 rh1Var, Activity activity) {
        super(activity);
        this.e = rh1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        rh1 rh1Var = this.e;
        org.telegram.ui.Components.voip.d3 d3Var = rh1Var.v;
        if (view == d3Var && (rh1Var.n0 || rh1Var.m0)) {
            return false;
        }
        if ((view != d3Var && view != rh1Var.c0 && (view != rh1Var.Y || !rh1Var.a0)) || (!rh1Var.g1 && rh1Var.i1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = rh1Var.f1;
        canvas.scale(f7, f7, rh1Var.b1, rh1Var.c1);
        canvas.translate(rh1Var.Y0, rh1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        rh1 rh1Var = this.e;
        ah1 ah1Var = rh1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            rh1Var.y.b(false, false);
            rh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ah1Var);
            if (rh1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(ah1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.e3 e3Var;
        rh1 rh1Var = this.e;
        ah1 ah1Var = rh1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            rh1Var.y.b(false, false);
            rh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ah1Var);
            if (rh1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(ah1Var, 10000L);
            }
        }
        if (!rh1Var.h1 && !rh1Var.a1 && !rh1Var.g1 && motionEvent.getActionMasked() != 0) {
            rh1.i(rh1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            rh1Var.h1 = false;
            rh1Var.a1 = false;
            rh1Var.g1 = false;
        }
        org.telegram.ui.Components.voip.t2 t2Var = rh1Var.m0 ? rh1Var.c0 : rh1Var.d0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(t2Var.getX(), t2Var.getY(), t2Var.getX() + t2Var.getMeasuredWidth(), t2Var.getY() + t2Var.getMeasuredHeight());
                rectF.inset(((t2Var.getMeasuredHeight() * t2Var.T) - t2Var.getMeasuredHeight()) / 2.0f, ((t2Var.getMeasuredWidth() * t2Var.T) - t2Var.getMeasuredWidth()) / 2.0f);
                if (x50.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, t2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, t2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                rh1Var.h1 = contains;
                if (!contains) {
                    rh1.i(rh1Var);
                }
            }
            if (rh1Var.h1 && !rh1Var.a1 && motionEvent.getPointerCount() == 2) {
                rh1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x9 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                rh1Var.b1 = x9;
                rh1Var.V0 = x9;
                float y3 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                rh1Var.c1 = y3;
                rh1Var.W0 = y3;
                rh1Var.f1 = 1.0f;
                rh1Var.d1 = motionEvent.getPointerId(0);
                rh1Var.e1 = motionEvent.getPointerId(1);
                rh1Var.a1 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && rh1Var.a1) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (rh1Var.d1 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (rh1Var.e1 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                rh1.i(rh1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / rh1Var.X0;
                rh1Var.f1 = hypot;
                if (hypot > 1.005f && !rh1Var.g1) {
                    rh1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                    float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    rh1Var.b1 = x10;
                    rh1Var.V0 = x10;
                    float y10 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    rh1Var.c1 = y10;
                    rh1Var.W0 = y10;
                    rh1Var.f1 = 1.0f;
                    rh1Var.Y0 = 0.0f;
                    rh1Var.Z0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    rh1Var.g1 = true;
                    rh1Var.a1 = true;
                }
                float x11 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                float y11 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                float f7 = rh1Var.V0 - x11;
                float f10 = rh1Var.W0 - y11;
                float f11 = rh1Var.f1;
                rh1Var.Y0 = (-f7) / f11;
                rh1Var.Z0 = (-f10) / f11;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((rh1Var.d1 == motionEvent.getPointerId(0) && rh1Var.e1 == motionEvent.getPointerId(1)) || (rh1Var.d1 == motionEvent.getPointerId(1) && rh1Var.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            rh1.i(rh1Var);
        }
        rh1Var.s.invalidate();
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
            float x12 = motionEvent.getX() - this.a;
            float y12 = motionEvent.getY() - this.b;
            long currentTimeMillis = System.currentTimeMillis();
            float f12 = (y12 * y12) + (x12 * x12);
            float f13 = rh1Var.t0;
            if (f12 < f13 * f13 && currentTimeMillis - this.d < 300 && currentTimeMillis - rh1Var.K0 > 300) {
                rh1Var.K0 = System.currentTimeMillis();
                if (rh1Var.C0) {
                    rh1Var.l(false);
                } else if (rh1Var.z0) {
                    rh1Var.z(!rh1Var.x0);
                    rh1Var.q0 = rh1Var.p0;
                    if (!rh1Var.x0 && (e3Var = rh1Var.N0) != null && e3Var.V) {
                        e3Var.e(true);
                    }
                    rh1Var.G();
                }
            }
            this.c = false;
        }
        return rh1Var.h1 || this.c;
    }
}
