package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class eh1 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ jh1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh1(jh1 jh1Var, Activity activity) {
        super(activity);
        this.e = jh1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        jh1 jh1Var = this.e;
        org.telegram.ui.Components.voip.a3 a3Var = jh1Var.v;
        if (view == a3Var && (jh1Var.n0 || jh1Var.m0)) {
            return false;
        }
        if ((view != a3Var && view != jh1Var.c0 && (view != jh1Var.Y || !jh1Var.a0)) || (!jh1Var.g1 && jh1Var.i1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = jh1Var.f1;
        canvas.scale(f7, f7, jh1Var.b1, jh1Var.c1);
        canvas.translate(jh1Var.Y0, jh1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        jh1 jh1Var = this.e;
        tg1 tg1Var = jh1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            jh1Var.y.b(false, false);
            jh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(tg1Var);
            if (jh1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(tg1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.b3 b3Var;
        jh1 jh1Var = this.e;
        tg1 tg1Var = jh1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            jh1Var.y.b(false, false);
            jh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(tg1Var);
            if (jh1Var.p0 == 3) {
                AndroidUtilities.runOnUIThread(tg1Var, 10000L);
            }
        }
        if (!jh1Var.h1 && !jh1Var.a1 && !jh1Var.g1 && motionEvent.getActionMasked() != 0) {
            jh1.i(jh1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            jh1Var.h1 = false;
            jh1Var.a1 = false;
            jh1Var.g1 = false;
        }
        org.telegram.ui.Components.voip.q2 q2Var = jh1Var.m0 ? jh1Var.c0 : jh1Var.d0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(q2Var.getX(), q2Var.getY(), q2Var.getX() + q2Var.getMeasuredWidth(), q2Var.getY() + q2Var.getMeasuredHeight());
                rectF.inset(((q2Var.getMeasuredHeight() * q2Var.T) - q2Var.getMeasuredHeight()) / 2.0f, ((q2Var.getMeasuredWidth() * q2Var.T) - q2Var.getMeasuredWidth()) / 2.0f);
                if (s50.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, q2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, q2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                jh1Var.h1 = contains;
                if (!contains) {
                    jh1.i(jh1Var);
                }
            }
            if (jh1Var.h1 && !jh1Var.a1 && motionEvent.getPointerCount() == 2) {
                jh1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                jh1Var.b1 = x10;
                jh1Var.V0 = x10;
                float y3 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                jh1Var.c1 = y3;
                jh1Var.W0 = y3;
                jh1Var.f1 = 1.0f;
                jh1Var.d1 = motionEvent.getPointerId(0);
                jh1Var.e1 = motionEvent.getPointerId(1);
                jh1Var.a1 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && jh1Var.a1) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (jh1Var.d1 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (jh1Var.e1 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                jh1.i(jh1Var);
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / jh1Var.X0;
                jh1Var.f1 = hypot;
                if (hypot > 1.005f && !jh1Var.g1) {
                    jh1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                    float x11 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    jh1Var.b1 = x11;
                    jh1Var.V0 = x11;
                    float y10 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    jh1Var.c1 = y10;
                    jh1Var.W0 = y10;
                    jh1Var.f1 = 1.0f;
                    jh1Var.Y0 = 0.0f;
                    jh1Var.Z0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    jh1Var.g1 = true;
                    jh1Var.a1 = true;
                }
                float x12 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                float y11 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                float f7 = jh1Var.V0 - x12;
                float f10 = jh1Var.W0 - y11;
                float f11 = jh1Var.f1;
                jh1Var.Y0 = (-f7) / f11;
                jh1Var.Z0 = (-f10) / f11;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((jh1Var.d1 == motionEvent.getPointerId(0) && jh1Var.e1 == motionEvent.getPointerId(1)) || (jh1Var.d1 == motionEvent.getPointerId(1) && jh1Var.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            jh1.i(jh1Var);
        }
        jh1Var.s.invalidate();
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
            float f13 = jh1Var.t0;
            if (f12 < f13 * f13 && currentTimeMillis - this.d < 300 && currentTimeMillis - jh1Var.K0 > 300) {
                jh1Var.K0 = System.currentTimeMillis();
                if (jh1Var.C0) {
                    jh1Var.l(false);
                } else if (jh1Var.z0) {
                    jh1Var.z(!jh1Var.x0);
                    jh1Var.q0 = jh1Var.p0;
                    if (!jh1Var.x0 && (b3Var = jh1Var.N0) != null && b3Var.V) {
                        b3Var.e(true);
                    }
                    jh1Var.G();
                }
            }
            this.c = false;
        }
        return jh1Var.h1 || this.c;
    }
}
