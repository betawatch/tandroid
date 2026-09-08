package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class pi1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ ui1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi1(ui1 ui1Var, Activity activity) {
        super(activity);
        this.e = ui1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ui1 ui1Var = this.e;
        org.telegram.ui.Components.voip.a3 a3Var = ui1Var.v;
        if (view == a3Var && (ui1Var.n0 || ui1Var.m0)) {
            return false;
        }
        if ((view != a3Var && view != ui1Var.c0 && (view != ui1Var.Y || !ui1Var.a0)) || (!ui1Var.g1 && ui1Var.i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f7 = ui1Var.f1;
        canvas.scale(f7, f7, ui1Var.b1, ui1Var.c1);
        canvas.translate(ui1Var.Y0, ui1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ui1 ui1Var = this.e;
        ei1 ei1Var = ui1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ui1Var.y.b(false, false);
            ui1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ei1Var);
            if (ui1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(ei1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.b3 b3Var;
        ui1 ui1Var = this.e;
        ei1 ei1Var = ui1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ui1Var.y.b(false, false);
            ui1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ei1Var);
            if (ui1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(ei1Var, 10000L);
            }
        }
        if (!ui1Var.h1 && !ui1Var.a1 && !ui1Var.g1 && motionEvent.getActionMasked() != 0) {
            ui1.j(ui1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ui1Var.h1 = false;
            ui1Var.a1 = false;
            ui1Var.g1 = false;
        }
        org.telegram.ui.Components.voip.q2 q2Var = ui1Var.m0 ? ui1Var.c0 : ui1Var.d0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(q2Var.getX(), q2Var.getY(), q2Var.getX() + q2Var.getMeasuredWidth(), q2Var.getY() + q2Var.getMeasuredHeight());
                rectF.inset(((q2Var.getMeasuredHeight() * q2Var.T) - q2Var.getMeasuredHeight()) / 2.0f, ((q2Var.getMeasuredWidth() * q2Var.T) - q2Var.getMeasuredWidth()) / 2.0f);
                if (j60.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, q2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, q2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ui1Var.h1 = contains;
                if (!contains) {
                    ui1.j(ui1Var);
                }
            }
            if (ui1Var.h1 && !ui1Var.a1 && motionEvent.getPointerCount() == 2) {
                ui1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ui1Var.b1 = x10;
                ui1Var.V0 = x10;
                float y3 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ui1Var.c1 = y3;
                ui1Var.W0 = y3;
                ui1Var.f1 = 1.0f;
                ui1Var.d1 = motionEvent.getPointerId(0);
                ui1Var.e1 = motionEvent.getPointerId(1);
                ui1Var.a1 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && ui1Var.a1) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (ui1Var.d1 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (ui1Var.e1 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ui1.j(ui1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / ui1Var.X0;
                ui1Var.f1 = hypot;
                if (hypot > 1.005f && !ui1Var.g1) {
                    ui1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                    float x11 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    ui1Var.b1 = x11;
                    ui1Var.V0 = x11;
                    float y10 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    ui1Var.c1 = y10;
                    ui1Var.W0 = y10;
                    ui1Var.f1 = 1.0f;
                    ui1Var.Y0 = 0.0f;
                    ui1Var.Z0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    ui1Var.g1 = true;
                    ui1Var.a1 = true;
                }
                float x12 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                float y11 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                float f7 = ui1Var.V0 - x12;
                float f10 = ui1Var.W0 - y11;
                float f11 = ui1Var.f1;
                ui1Var.Y0 = (-f7) / f11;
                ui1Var.Z0 = (-f10) / f11;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ui1Var.d1 == motionEvent.getPointerId(0) && ui1Var.e1 == motionEvent.getPointerId(1)) || (ui1Var.d1 == motionEvent.getPointerId(1) && ui1Var.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            ui1.j(ui1Var);
        }
        ui1Var.s.invalidate();
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
            float f13 = ui1Var.t0;
            if (f12 < f13 * f13 && currentTimeMillis - this.d < 300 && currentTimeMillis - ui1Var.K0 > 300) {
                ui1Var.K0 = System.currentTimeMillis();
                if (ui1Var.C0) {
                    ui1Var.m(false);
                } else if (ui1Var.z0) {
                    ui1Var.A(!ui1Var.x0);
                    ui1Var.q0 = ui1Var.p0;
                    if (!ui1Var.x0 && (b3Var = ui1Var.N0) != null && b3Var.V) {
                        b3Var.e(true);
                    }
                    ui1Var.H();
                }
            }
            this.c = false;
        }
        return ui1Var.h1 || this.c;
    }
}
