// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dic extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ iic e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dic(iic iicVar, Activity activity) {
        super(activity);
        this.e = iicVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x001a, code lost:
    
        if (r0.b0 == false) goto L20;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        iic iicVar = this.e;
        if (view == iicVar.w) {
            if (iicVar.n0 || iicVar.m0) {
                return false;
            }
        } else if (view != iicVar.d0) {
            if (view == iicVar.Z) {
            }
            return super.drawChild(canvas, view, j);
        }
        if (iicVar.g1 || iicVar.i1 != null) {
            canvas.save();
            float f = iicVar.f1;
            canvas.scale(f, f, iicVar.b1, iicVar.c1);
            canvas.translate(iicVar.Y0, iicVar.Z0);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        iic iicVar = this.e;
        thc thcVar = iicVar.T0;
        if (motionEvent.getActionMasked() == 1) {
            iicVar.E.b(false, false);
            iicVar.w.a();
            gm.r(thcVar);
            if (iicVar.p0 == 3) {
                gm.d3(thcVar, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qh2 qh2Var;
        iic iicVar = this.e;
        thc thcVar = iicVar.T0;
        if (motionEvent.getActionMasked() == 1) {
            iicVar.E.b(false, false);
            iicVar.w.a();
            gm.r(thcVar);
            if (iicVar.p0 == 3) {
                gm.d3(thcVar, 10000L);
            }
        }
        if (!iicVar.h1 && !iicVar.a1 && !iicVar.g1 && motionEvent.getActionMasked() != 0) {
            iicVar.e();
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            iicVar.h1 = false;
            iicVar.a1 = false;
            iicVar.g1 = false;
        }
        akc akcVar = iicVar.m0 ? iicVar.d0 : iicVar.e0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = gm.P;
                rectF.set(akcVar.getX(), akcVar.getY(), akcVar.getX() + akcVar.getMeasuredWidth(), akcVar.getY() + akcVar.getMeasuredHeight());
                rectF.inset(((akcVar.getMeasuredHeight() * akcVar.U) - akcVar.getMeasuredHeight()) / 2.0f, ((akcVar.getMeasuredWidth() * akcVar.U) - akcVar.getMeasuredWidth()) / 2.0f);
                boolean z = g95.u5;
                float f = rectF.top;
                if (z) {
                    rectF.top = Math.max(f, a.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, akcVar.getMeasuredWidth() - gm.L(90.0f));
                } else {
                    rectF.top = Math.max(f, a.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, akcVar.getMeasuredHeight() - gm.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                iicVar.h1 = contains;
                if (!contains) {
                    iicVar.e();
                }
            }
            if (iicVar.h1 && !iicVar.a1 && motionEvent.getPointerCount() == 2) {
                iicVar.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                iicVar.b1 = x;
                iicVar.V0 = x;
                float y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                iicVar.c1 = y;
                iicVar.W0 = y;
                iicVar.f1 = 1.0f;
                iicVar.d1 = motionEvent.getPointerId(0);
                iicVar.e1 = motionEvent.getPointerId(1);
                iicVar.a1 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && iicVar.a1) {
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
                if (iicVar.d1 == motionEvent.getPointerId(i3)) {
                    i = i3;
                }
                if (iicVar.e1 == motionEvent.getPointerId(i3)) {
                    i2 = i3;
                }
            }
            if (i == -1 || i2 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                iicVar.e();
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i))) / iicVar.X0;
                iicVar.f1 = hypot;
                if (hypot > 1.005f && !iicVar.g1) {
                    iicVar.X0 = (float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i));
                    float x2 = (motionEvent.getX(i2) + motionEvent.getX(i)) / 2.0f;
                    iicVar.b1 = x2;
                    iicVar.V0 = x2;
                    float y2 = (motionEvent.getY(i2) + motionEvent.getY(i)) / 2.0f;
                    iicVar.c1 = y2;
                    iicVar.W0 = y2;
                    iicVar.f1 = 1.0f;
                    iicVar.Y0 = 0.0f;
                    iicVar.Z0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    iicVar.g1 = true;
                    iicVar.a1 = true;
                }
                float x3 = (motionEvent.getX(i2) + motionEvent.getX(i)) / 2.0f;
                float y3 = (motionEvent.getY(i2) + motionEvent.getY(i)) / 2.0f;
                float f2 = iicVar.V0 - x3;
                float f3 = iicVar.W0 - y3;
                float f4 = iicVar.f1;
                iicVar.Y0 = (-f2) / f4;
                iicVar.Z0 = (-f3) / f4;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((iicVar.d1 == motionEvent.getPointerId(0) && iicVar.e1 == motionEvent.getPointerId(1)) || (iicVar.d1 == motionEvent.getPointerId(1) && iicVar.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            iicVar.e();
        }
        iicVar.s.invalidate();
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
            float x4 = motionEvent.getX() - this.a;
            float y4 = motionEvent.getY() - this.b;
            long currentTimeMillis = System.currentTimeMillis();
            float f5 = (y4 * y4) + (x4 * x4);
            float f6 = iicVar.t0;
            if (f5 < f6 * f6 && currentTimeMillis - this.d < 300 && currentTimeMillis - iicVar.K0 > 300) {
                iicVar.K0 = System.currentTimeMillis();
                if (iicVar.C0) {
                    iicVar.c(false);
                } else if (iicVar.z0) {
                    iicVar.r(!iicVar.x0);
                    iicVar.q0 = iicVar.p0;
                    if (!iicVar.x0 && (qh2Var = iicVar.N0) != null && qh2Var.W) {
                        qh2Var.f(true);
                    }
                    iicVar.y();
                }
            }
            this.c = false;
        }
        return iicVar.h1 || this.c;
    }
}
