package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jh1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ oh1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh1(oh1 oh1Var, Activity activity) {
        super(activity);
        this.e = oh1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        oh1 oh1Var = this.e;
        org.telegram.ui.Components.voip.e3 e3Var = oh1Var.v;
        if (view == e3Var && (oh1Var.j0 || oh1Var.i0)) {
            return false;
        }
        if ((view != e3Var && view != oh1Var.Y && (view != oh1Var.U || !oh1Var.W)) || (!oh1Var.c1 && oh1Var.e1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f9 = oh1Var.b1;
        canvas.scale(f9, f9, oh1Var.X0, oh1Var.Y0);
        canvas.translate(oh1Var.U0, oh1Var.V0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        oh1 oh1Var = this.e;
        yg1 yg1Var = oh1Var.P0;
        if (motionEvent.getActionMasked() == 1) {
            oh1Var.y.b(false, false);
            oh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(yg1Var);
            if (oh1Var.l0 == 3) {
                AndroidUtilities.runOnUIThread(yg1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.f3 f3Var;
        oh1 oh1Var = this.e;
        yg1 yg1Var = oh1Var.P0;
        if (motionEvent.getActionMasked() == 1) {
            oh1Var.y.b(false, false);
            oh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(yg1Var);
            if (oh1Var.l0 == 3) {
                AndroidUtilities.runOnUIThread(yg1Var, 10000L);
            }
        }
        if (!oh1Var.d1 && !oh1Var.W0 && !oh1Var.c1 && motionEvent.getActionMasked() != 0) {
            oh1.j(oh1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            oh1Var.d1 = false;
            oh1Var.W0 = false;
            oh1Var.c1 = false;
        }
        org.telegram.ui.Components.voip.u2 u2Var = oh1Var.i0 ? oh1Var.Y : oh1Var.Z;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(u2Var.getX(), u2Var.getY(), u2Var.getX() + u2Var.getMeasuredWidth(), u2Var.getY() + u2Var.getMeasuredHeight());
                rectF.inset(((u2Var.getMeasuredHeight() * u2Var.P) - u2Var.getMeasuredHeight()) / 2.0f, ((u2Var.getMeasuredWidth() * u2Var.P) - u2Var.getMeasuredWidth()) / 2.0f);
                if (r50.B3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, u2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, u2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                oh1Var.d1 = contains;
                if (!contains) {
                    oh1.j(oh1Var);
                }
            }
            if (oh1Var.d1 && !oh1Var.W0 && motionEvent.getPointerCount() == 2) {
                oh1Var.T0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x4 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                oh1Var.X0 = x4;
                oh1Var.R0 = x4;
                float y8 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                oh1Var.Y0 = y8;
                oh1Var.S0 = y8;
                oh1Var.b1 = 1.0f;
                oh1Var.Z0 = motionEvent.getPointerId(0);
                oh1Var.a1 = motionEvent.getPointerId(1);
                oh1Var.W0 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && oh1Var.W0) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (oh1Var.Z0 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (oh1Var.a1 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                oh1.j(oh1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / oh1Var.T0;
                oh1Var.b1 = hypot;
                if (hypot > 1.005f && !oh1Var.c1) {
                    oh1Var.T0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                    float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    oh1Var.X0 = x10;
                    oh1Var.R0 = x10;
                    float y10 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    oh1Var.Y0 = y10;
                    oh1Var.S0 = y10;
                    oh1Var.b1 = 1.0f;
                    oh1Var.U0 = 0.0f;
                    oh1Var.V0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    oh1Var.c1 = true;
                    oh1Var.W0 = true;
                }
                float x11 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                float y11 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                float f9 = oh1Var.R0 - x11;
                float f10 = oh1Var.S0 - y11;
                float f11 = oh1Var.b1;
                oh1Var.U0 = (-f9) / f11;
                oh1Var.V0 = (-f10) / f11;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((oh1Var.Z0 == motionEvent.getPointerId(0) && oh1Var.a1 == motionEvent.getPointerId(1)) || (oh1Var.Z0 == motionEvent.getPointerId(1) && oh1Var.a1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            oh1.j(oh1Var);
        }
        oh1Var.s.invalidate();
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
            float f13 = oh1Var.p0;
            if (f12 < f13 * f13 && currentTimeMillis - this.d < 300 && currentTimeMillis - oh1Var.G0 > 300) {
                oh1Var.G0 = System.currentTimeMillis();
                if (oh1Var.y0) {
                    oh1Var.m(false);
                } else if (oh1Var.v0) {
                    oh1Var.A(!oh1Var.t0);
                    oh1Var.m0 = oh1Var.l0;
                    if (!oh1Var.t0 && (f3Var = oh1Var.J0) != null && f3Var.R) {
                        f3Var.e(true);
                    }
                    oh1Var.H();
                }
            }
            this.c = false;
        }
        return oh1Var.d1 || this.c;
    }
}
