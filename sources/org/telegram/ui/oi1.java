package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class oi1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ ti1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi1(ti1 ti1Var, Activity activity) {
        super(activity);
        this.e = ti1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ti1 ti1Var = this.e;
        org.telegram.ui.Components.voip.c3 c3Var = ti1Var.v;
        if (view == c3Var && (ti1Var.n0 || ti1Var.m0)) {
            return false;
        }
        if ((view != c3Var && view != ti1Var.c0 && (view != ti1Var.Y || !ti1Var.a0)) || (!ti1Var.g1 && ti1Var.i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f7 = ti1Var.f1;
        canvas.scale(f7, f7, ti1Var.b1, ti1Var.c1);
        canvas.translate(ti1Var.Y0, ti1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti1 ti1Var = this.e;
        di1 di1Var = ti1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ti1Var.y.b(false, false);
            ti1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(di1Var);
            if (ti1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(di1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.d3 d3Var;
        ti1 ti1Var = this.e;
        di1 di1Var = ti1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ti1Var.y.b(false, false);
            ti1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(di1Var);
            if (ti1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(di1Var, 10000L);
            }
        }
        if (!ti1Var.h1 && !ti1Var.a1 && !ti1Var.g1 && motionEvent.getActionMasked() != 0) {
            ti1.j(ti1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ti1Var.h1 = false;
            ti1Var.a1 = false;
            ti1Var.g1 = false;
        }
        org.telegram.ui.Components.voip.s2 s2Var = ti1Var.m0 ? ti1Var.c0 : ti1Var.d0;
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
                ti1Var.h1 = contains;
                if (!contains) {
                    ti1.j(ti1Var);
                }
            }
            if (ti1Var.h1 && !ti1Var.a1 && motionEvent.getPointerCount() == 2) {
                ti1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ti1Var.b1 = x10;
                ti1Var.V0 = x10;
                float y3 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ti1Var.c1 = y3;
                ti1Var.W0 = y3;
                ti1Var.f1 = 1.0f;
                ti1Var.d1 = motionEvent.getPointerId(0);
                ti1Var.e1 = motionEvent.getPointerId(1);
                ti1Var.a1 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && ti1Var.a1) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (ti1Var.d1 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (ti1Var.e1 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ti1.j(ti1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / ti1Var.X0;
                ti1Var.f1 = hypot;
                if (hypot > 1.005f && !ti1Var.g1) {
                    ti1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                    float x11 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    ti1Var.b1 = x11;
                    ti1Var.V0 = x11;
                    float y10 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    ti1Var.c1 = y10;
                    ti1Var.W0 = y10;
                    ti1Var.f1 = 1.0f;
                    ti1Var.Y0 = 0.0f;
                    ti1Var.Z0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    ti1Var.g1 = true;
                    ti1Var.a1 = true;
                }
                float x12 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                float y11 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                float f7 = ti1Var.V0 - x12;
                float f10 = ti1Var.W0 - y11;
                float f11 = ti1Var.f1;
                ti1Var.Y0 = (-f7) / f11;
                ti1Var.Z0 = (-f10) / f11;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ti1Var.d1 == motionEvent.getPointerId(0) && ti1Var.e1 == motionEvent.getPointerId(1)) || (ti1Var.d1 == motionEvent.getPointerId(1) && ti1Var.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            ti1.j(ti1Var);
        }
        ti1Var.s.invalidate();
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
            float f13 = ti1Var.t0;
            if (f12 < f13 * f13 && currentTimeMillis - this.d < 300 && currentTimeMillis - ti1Var.K0 > 300) {
                ti1Var.K0 = System.currentTimeMillis();
                if (ti1Var.C0) {
                    ti1Var.m(false);
                } else if (ti1Var.z0) {
                    ti1Var.A(!ti1Var.x0);
                    ti1Var.q0 = ti1Var.p0;
                    if (!ti1Var.x0 && (d3Var = ti1Var.N0) != null && d3Var.V) {
                        d3Var.e(true);
                    }
                    ti1Var.H();
                }
            }
            this.c = false;
        }
        return ti1Var.h1 || this.c;
    }
}
