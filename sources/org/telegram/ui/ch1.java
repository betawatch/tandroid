package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ch1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ hh1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch1(hh1 hh1Var, Activity activity) {
        super(activity);
        this.e = hh1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        hh1 hh1Var = this.e;
        org.telegram.ui.Components.voip.a3 a3Var = hh1Var.v;
        if (view == a3Var && (hh1Var.n0 || hh1Var.m0)) {
            return false;
        }
        if ((view != a3Var && view != hh1Var.c0 && (view != hh1Var.Y || !hh1Var.a0)) || (!hh1Var.g1 && hh1Var.i1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = hh1Var.f1;
        canvas.scale(f7, f7, hh1Var.b1, hh1Var.c1);
        canvas.translate(hh1Var.Y0, hh1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hh1 hh1Var = this.e;
        rg1 rg1Var = hh1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            hh1Var.y.b(false, false);
            hh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(rg1Var);
            if (hh1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(rg1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.b3 b3Var;
        hh1 hh1Var = this.e;
        rg1 rg1Var = hh1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            hh1Var.y.b(false, false);
            hh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(rg1Var);
            if (hh1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(rg1Var, 10000L);
            }
        }
        if (!hh1Var.h1 && !hh1Var.a1 && !hh1Var.g1 && motionEvent.getActionMasked() != 0) {
            hh1.i(hh1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            hh1Var.h1 = false;
            hh1Var.a1 = false;
            hh1Var.g1 = false;
        }
        org.telegram.ui.Components.voip.q2 q2Var = hh1Var.m0 ? hh1Var.c0 : hh1Var.d0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(q2Var.getX(), q2Var.getY(), q2Var.getX() + q2Var.getMeasuredWidth(), q2Var.getY() + q2Var.getMeasuredHeight());
                rectF.inset(((q2Var.getMeasuredHeight() * q2Var.T) - q2Var.getMeasuredHeight()) / 2.0f, ((q2Var.getMeasuredWidth() * q2Var.T) - q2Var.getMeasuredWidth()) / 2.0f);
                if (q50.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, q2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, q2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                hh1Var.h1 = contains;
                if (!contains) {
                    hh1.i(hh1Var);
                }
            }
            if (hh1Var.h1 && !hh1Var.a1 && motionEvent.getPointerCount() == 2) {
                hh1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                hh1Var.b1 = x10;
                hh1Var.V0 = x10;
                float y3 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                hh1Var.c1 = y3;
                hh1Var.W0 = y3;
                hh1Var.f1 = 1.0f;
                hh1Var.d1 = motionEvent.getPointerId(0);
                hh1Var.e1 = motionEvent.getPointerId(1);
                hh1Var.a1 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && hh1Var.a1) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (hh1Var.d1 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (hh1Var.e1 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                hh1.i(hh1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / hh1Var.X0;
                hh1Var.f1 = hypot;
                if (hypot > 1.005f && !hh1Var.g1) {
                    hh1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                    float x11 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    hh1Var.b1 = x11;
                    hh1Var.V0 = x11;
                    float y10 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    hh1Var.c1 = y10;
                    hh1Var.W0 = y10;
                    hh1Var.f1 = 1.0f;
                    hh1Var.Y0 = 0.0f;
                    hh1Var.Z0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    hh1Var.g1 = true;
                    hh1Var.a1 = true;
                }
                float x12 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                float y11 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                float f7 = hh1Var.V0 - x12;
                float f10 = hh1Var.W0 - y11;
                float f11 = hh1Var.f1;
                hh1Var.Y0 = (-f7) / f11;
                hh1Var.Z0 = (-f10) / f11;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((hh1Var.d1 == motionEvent.getPointerId(0) && hh1Var.e1 == motionEvent.getPointerId(1)) || (hh1Var.d1 == motionEvent.getPointerId(1) && hh1Var.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            hh1.i(hh1Var);
        }
        hh1Var.s.invalidate();
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
            float f13 = hh1Var.t0;
            if (f12 < f13 * f13 && currentTimeMillis - this.d < 300 && currentTimeMillis - hh1Var.K0 > 300) {
                hh1Var.K0 = System.currentTimeMillis();
                if (hh1Var.C0) {
                    hh1Var.l(false);
                } else if (hh1Var.z0) {
                    hh1Var.z(!hh1Var.x0);
                    hh1Var.q0 = hh1Var.p0;
                    if (!hh1Var.x0 && (b3Var = hh1Var.N0) != null && b3Var.V) {
                        b3Var.e(true);
                    }
                    hh1Var.G();
                }
            }
            this.c = false;
        }
        return hh1Var.h1 || this.c;
    }
}
