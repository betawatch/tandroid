package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kh1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ ph1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh1(ph1 ph1Var, Activity activity) {
        super(activity);
        this.e = ph1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ph1 ph1Var = this.e;
        org.telegram.ui.Components.voip.d3 d3Var = ph1Var.v;
        if (view == d3Var && (ph1Var.n0 || ph1Var.m0)) {
            return false;
        }
        if ((view != d3Var && view != ph1Var.c0 && (view != ph1Var.Y || !ph1Var.a0)) || (!ph1Var.g1 && ph1Var.i1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = ph1Var.f1;
        canvas.scale(f7, f7, ph1Var.b1, ph1Var.c1);
        canvas.translate(ph1Var.Y0, ph1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ph1 ph1Var = this.e;
        yg1 yg1Var = ph1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ph1Var.y.b(false, false);
            ph1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(yg1Var);
            if (ph1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(yg1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.e3 e3Var;
        ph1 ph1Var = this.e;
        yg1 yg1Var = ph1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ph1Var.y.b(false, false);
            ph1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(yg1Var);
            if (ph1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(yg1Var, 10000L);
            }
        }
        if (!ph1Var.h1 && !ph1Var.a1 && !ph1Var.g1 && motionEvent.getActionMasked() != 0) {
            ph1.i(ph1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ph1Var.h1 = false;
            ph1Var.a1 = false;
            ph1Var.g1 = false;
        }
        org.telegram.ui.Components.voip.t2 t2Var = ph1Var.m0 ? ph1Var.c0 : ph1Var.d0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(t2Var.getX(), t2Var.getY(), t2Var.getX() + t2Var.getMeasuredWidth(), t2Var.getY() + t2Var.getMeasuredHeight());
                rectF.inset(((t2Var.getMeasuredHeight() * t2Var.T) - t2Var.getMeasuredHeight()) / 2.0f, ((t2Var.getMeasuredWidth() * t2Var.T) - t2Var.getMeasuredWidth()) / 2.0f);
                if (v50.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, t2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, t2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ph1Var.h1 = contains;
                if (!contains) {
                    ph1.i(ph1Var);
                }
            }
            if (ph1Var.h1 && !ph1Var.a1 && motionEvent.getPointerCount() == 2) {
                ph1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x9 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ph1Var.b1 = x9;
                ph1Var.V0 = x9;
                float y3 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ph1Var.c1 = y3;
                ph1Var.W0 = y3;
                ph1Var.f1 = 1.0f;
                ph1Var.d1 = motionEvent.getPointerId(0);
                ph1Var.e1 = motionEvent.getPointerId(1);
                ph1Var.a1 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && ph1Var.a1) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (ph1Var.d1 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (ph1Var.e1 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ph1.i(ph1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / ph1Var.X0;
                ph1Var.f1 = hypot;
                if (hypot > 1.005f && !ph1Var.g1) {
                    ph1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                    float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    ph1Var.b1 = x10;
                    ph1Var.V0 = x10;
                    float y10 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    ph1Var.c1 = y10;
                    ph1Var.W0 = y10;
                    ph1Var.f1 = 1.0f;
                    ph1Var.Y0 = 0.0f;
                    ph1Var.Z0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    ph1Var.g1 = true;
                    ph1Var.a1 = true;
                }
                float x11 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                float y11 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                float f7 = ph1Var.V0 - x11;
                float f10 = ph1Var.W0 - y11;
                float f11 = ph1Var.f1;
                ph1Var.Y0 = (-f7) / f11;
                ph1Var.Z0 = (-f10) / f11;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ph1Var.d1 == motionEvent.getPointerId(0) && ph1Var.e1 == motionEvent.getPointerId(1)) || (ph1Var.d1 == motionEvent.getPointerId(1) && ph1Var.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            ph1.i(ph1Var);
        }
        ph1Var.s.invalidate();
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
            float f13 = ph1Var.t0;
            if (f12 < f13 * f13 && currentTimeMillis - this.d < 300 && currentTimeMillis - ph1Var.K0 > 300) {
                ph1Var.K0 = System.currentTimeMillis();
                if (ph1Var.C0) {
                    ph1Var.l(false);
                } else if (ph1Var.z0) {
                    ph1Var.z(!ph1Var.x0);
                    ph1Var.q0 = ph1Var.p0;
                    if (!ph1Var.x0 && (e3Var = ph1Var.N0) != null && e3Var.V) {
                        e3Var.e(true);
                    }
                    ph1Var.G();
                }
            }
            this.c = false;
        }
        return ph1Var.h1 || this.c;
    }
}
