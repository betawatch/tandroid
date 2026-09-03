package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class di1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ ii1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di1(ii1 ii1Var, Activity activity) {
        super(activity);
        this.e = ii1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ii1 ii1Var = this.e;
        org.telegram.ui.Components.voip.c3 c3Var = ii1Var.v;
        if (view == c3Var && (ii1Var.k0 || ii1Var.j0)) {
            return false;
        }
        if ((view != c3Var && view != ii1Var.Z && (view != ii1Var.V || !ii1Var.X)) || (!ii1Var.d1 && ii1Var.f1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f10 = ii1Var.c1;
        canvas.scale(f10, f10, ii1Var.Y0, ii1Var.Z0);
        canvas.translate(ii1Var.V0, ii1Var.W0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ii1 ii1Var = this.e;
        sh1 sh1Var = ii1Var.Q0;
        if (motionEvent.getActionMasked() == 1) {
            ii1Var.y.b(false, false);
            ii1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(sh1Var);
            if (ii1Var.m0 == 3) {
                AndroidUtilities.runOnUIThread(sh1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.d3 d3Var;
        ii1 ii1Var = this.e;
        sh1 sh1Var = ii1Var.Q0;
        if (motionEvent.getActionMasked() == 1) {
            ii1Var.y.b(false, false);
            ii1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(sh1Var);
            if (ii1Var.m0 == 3) {
                AndroidUtilities.runOnUIThread(sh1Var, 10000L);
            }
        }
        if (!ii1Var.e1 && !ii1Var.X0 && !ii1Var.d1 && motionEvent.getActionMasked() != 0) {
            ii1.j(ii1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ii1Var.e1 = false;
            ii1Var.X0 = false;
            ii1Var.d1 = false;
        }
        org.telegram.ui.Components.voip.s2 s2Var = ii1Var.j0 ? ii1Var.Z : ii1Var.a0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(s2Var.getX(), s2Var.getY(), s2Var.getX() + s2Var.getMeasuredWidth(), s2Var.getY() + s2Var.getMeasuredHeight());
                rectF.inset(((s2Var.getMeasuredHeight() * s2Var.Q) - s2Var.getMeasuredHeight()) / 2.0f, ((s2Var.getMeasuredWidth() * s2Var.Q) - s2Var.getMeasuredWidth()) / 2.0f);
                if (e60.C3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, s2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, s2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ii1Var.e1 = contains;
                if (!contains) {
                    ii1.j(ii1Var);
                }
            }
            if (ii1Var.e1 && !ii1Var.X0 && motionEvent.getPointerCount() == 2) {
                ii1Var.U0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ii1Var.Y0 = x10;
                ii1Var.S0 = x10;
                float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ii1Var.Z0 = y10;
                ii1Var.T0 = y10;
                ii1Var.c1 = 1.0f;
                ii1Var.a1 = motionEvent.getPointerId(0);
                ii1Var.b1 = motionEvent.getPointerId(1);
                ii1Var.X0 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && ii1Var.X0) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (ii1Var.a1 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (ii1Var.b1 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ii1.j(ii1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / ii1Var.U0;
                ii1Var.c1 = hypot;
                if (hypot > 1.005f && !ii1Var.d1) {
                    ii1Var.U0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                    float x11 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    ii1Var.Y0 = x11;
                    ii1Var.S0 = x11;
                    float y11 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    ii1Var.Z0 = y11;
                    ii1Var.T0 = y11;
                    ii1Var.c1 = 1.0f;
                    ii1Var.V0 = 0.0f;
                    ii1Var.W0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    ii1Var.d1 = true;
                    ii1Var.X0 = true;
                }
                float x12 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                float y12 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                float f10 = ii1Var.S0 - x12;
                float f11 = ii1Var.T0 - y12;
                float f12 = ii1Var.c1;
                ii1Var.V0 = (-f10) / f12;
                ii1Var.W0 = (-f11) / f12;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ii1Var.a1 == motionEvent.getPointerId(0) && ii1Var.b1 == motionEvent.getPointerId(1)) || (ii1Var.a1 == motionEvent.getPointerId(1) && ii1Var.b1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            ii1.j(ii1Var);
        }
        ii1Var.s.invalidate();
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
            float f14 = ii1Var.q0;
            if (f13 < f14 * f14 && currentTimeMillis - this.d < 300 && currentTimeMillis - ii1Var.H0 > 300) {
                ii1Var.H0 = System.currentTimeMillis();
                if (ii1Var.z0) {
                    ii1Var.m(false);
                } else if (ii1Var.w0) {
                    ii1Var.A(!ii1Var.u0);
                    ii1Var.n0 = ii1Var.m0;
                    if (!ii1Var.u0 && (d3Var = ii1Var.K0) != null && d3Var.S) {
                        d3Var.e(true);
                    }
                    ii1Var.H();
                }
            }
            this.c = false;
        }
        return ii1Var.e1 || this.c;
    }
}
