// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cgc extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ hgc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgc(hgc hgcVar, Activity activity) {
        super(activity);
        this.e = hgcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x001a, code lost:
    
        if (r0.b0 == false) goto L20;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        hgc hgcVar = this.e;
        if (view == hgcVar.w) {
            if (hgcVar.n0 || hgcVar.m0) {
                return false;
            }
        } else if (view != hgcVar.d0) {
            if (view == hgcVar.Z) {
            }
            return super.drawChild(canvas, view, j);
        }
        if (hgcVar.g1 || hgcVar.i1 != null) {
            canvas.save();
            float f = hgcVar.f1;
            canvas.scale(f, f, hgcVar.b1, hgcVar.c1);
            canvas.translate(hgcVar.Y0, hgcVar.Z0);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hgc hgcVar = this.e;
        sfc sfcVar = hgcVar.T0;
        if (motionEvent.getActionMasked() == 1) {
            hgcVar.E.b(false, false);
            hgcVar.w.a();
            gl.r(sfcVar);
            if (hgcVar.p0 == 3) {
                gl.e3(sfcVar, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cg2 cg2Var;
        hgc hgcVar = this.e;
        sfc sfcVar = hgcVar.T0;
        if (motionEvent.getActionMasked() == 1) {
            hgcVar.E.b(false, false);
            hgcVar.w.a();
            gl.r(sfcVar);
            if (hgcVar.p0 == 3) {
                gl.e3(sfcVar, 10000L);
            }
        }
        if (!hgcVar.h1 && !hgcVar.a1 && !hgcVar.g1 && motionEvent.getActionMasked() != 0) {
            hgcVar.e();
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            hgcVar.h1 = false;
            hgcVar.a1 = false;
            hgcVar.g1 = false;
        }
        aic aicVar = hgcVar.m0 ? hgcVar.d0 : hgcVar.e0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = gl.P;
                rectF.set(aicVar.getX(), aicVar.getY(), aicVar.getX() + aicVar.getMeasuredWidth(), aicVar.getY() + aicVar.getMeasuredHeight());
                rectF.inset(((aicVar.getMeasuredHeight() * aicVar.U) - aicVar.getMeasuredHeight()) / 2.0f, ((aicVar.getMeasuredWidth() * aicVar.U) - aicVar.getMeasuredWidth()) / 2.0f);
                boolean z = h75.u5;
                float f = rectF.top;
                if (z) {
                    rectF.top = Math.max(f, a.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, aicVar.getMeasuredWidth() - gl.L(90.0f));
                } else {
                    rectF.top = Math.max(f, a.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, aicVar.getMeasuredHeight() - gl.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                hgcVar.h1 = contains;
                if (!contains) {
                    hgcVar.e();
                }
            }
            if (hgcVar.h1 && !hgcVar.a1 && motionEvent.getPointerCount() == 2) {
                hgcVar.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                hgcVar.b1 = x;
                hgcVar.V0 = x;
                float y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                hgcVar.c1 = y;
                hgcVar.W0 = y;
                hgcVar.f1 = 1.0f;
                hgcVar.d1 = motionEvent.getPointerId(0);
                hgcVar.e1 = motionEvent.getPointerId(1);
                hgcVar.a1 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && hgcVar.a1) {
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
                if (hgcVar.d1 == motionEvent.getPointerId(i3)) {
                    i = i3;
                }
                if (hgcVar.e1 == motionEvent.getPointerId(i3)) {
                    i2 = i3;
                }
            }
            if (i == -1 || i2 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                hgcVar.e();
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i))) / hgcVar.X0;
                hgcVar.f1 = hypot;
                if (hypot > 1.005f && !hgcVar.g1) {
                    hgcVar.X0 = (float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i));
                    float x2 = (motionEvent.getX(i2) + motionEvent.getX(i)) / 2.0f;
                    hgcVar.b1 = x2;
                    hgcVar.V0 = x2;
                    float y2 = (motionEvent.getY(i2) + motionEvent.getY(i)) / 2.0f;
                    hgcVar.c1 = y2;
                    hgcVar.W0 = y2;
                    hgcVar.f1 = 1.0f;
                    hgcVar.Y0 = 0.0f;
                    hgcVar.Z0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    hgcVar.g1 = true;
                    hgcVar.a1 = true;
                }
                float x3 = (motionEvent.getX(i2) + motionEvent.getX(i)) / 2.0f;
                float y3 = (motionEvent.getY(i2) + motionEvent.getY(i)) / 2.0f;
                float f2 = hgcVar.V0 - x3;
                float f3 = hgcVar.W0 - y3;
                float f4 = hgcVar.f1;
                hgcVar.Y0 = (-f2) / f4;
                hgcVar.Z0 = (-f3) / f4;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((hgcVar.d1 == motionEvent.getPointerId(0) && hgcVar.e1 == motionEvent.getPointerId(1)) || (hgcVar.d1 == motionEvent.getPointerId(1) && hgcVar.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            hgcVar.e();
        }
        hgcVar.s.invalidate();
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
            float f6 = hgcVar.t0;
            if (f5 < f6 * f6 && currentTimeMillis - this.d < 300 && currentTimeMillis - hgcVar.K0 > 300) {
                hgcVar.K0 = System.currentTimeMillis();
                if (hgcVar.C0) {
                    hgcVar.c(false);
                } else if (hgcVar.z0) {
                    hgcVar.r(!hgcVar.x0);
                    hgcVar.q0 = hgcVar.p0;
                    if (!hgcVar.x0 && (cg2Var = hgcVar.N0) != null && cg2Var.W) {
                        cg2Var.f(true);
                    }
                    hgcVar.y();
                }
            }
            this.c = false;
        }
        return hgcVar.h1 || this.c;
    }
}
