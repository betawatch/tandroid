// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class hkc extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final /* synthetic */ mkc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkc(mkc mkcVar, Activity activity) {
        super(activity);
        this.e = mkcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x001a, code lost:
    
        if (r0.b0 == false) goto L20;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        mkc mkcVar = this.e;
        if (view == mkcVar.w) {
            if (mkcVar.n0 || mkcVar.m0) {
                return false;
            }
        } else if (view != mkcVar.d0) {
            if (view == mkcVar.Z) {
            }
            return super.drawChild(canvas, view, j);
        }
        if (mkcVar.g1 || mkcVar.i1 != null) {
            canvas.save();
            float f = mkcVar.f1;
            canvas.scale(f, f, mkcVar.b1, mkcVar.c1);
            canvas.translate(mkcVar.Y0, mkcVar.Z0);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mkc mkcVar = this.e;
        xjc xjcVar = mkcVar.T0;
        if (motionEvent.getActionMasked() == 1) {
            mkcVar.E.b(false, false);
            mkcVar.w.a();
            hl.r(xjcVar);
            if (mkcVar.p0 == 3) {
                hl.d3(xjcVar, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ug2 ug2Var;
        mkc mkcVar = this.e;
        xjc xjcVar = mkcVar.T0;
        if (motionEvent.getActionMasked() == 1) {
            mkcVar.E.b(false, false);
            mkcVar.w.a();
            hl.r(xjcVar);
            if (mkcVar.p0 == 3) {
                hl.d3(xjcVar, 10000L);
            }
        }
        if (!mkcVar.h1 && !mkcVar.a1 && !mkcVar.g1 && motionEvent.getActionMasked() != 0) {
            mkcVar.e();
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            mkcVar.h1 = false;
            mkcVar.a1 = false;
            mkcVar.g1 = false;
        }
        hmc hmcVar = mkcVar.m0 ? mkcVar.d0 : mkcVar.e0;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = hl.P;
                rectF.set(hmcVar.getX(), hmcVar.getY(), hmcVar.getX() + hmcVar.getMeasuredWidth(), hmcVar.getY() + hmcVar.getMeasuredHeight());
                rectF.inset(((hmcVar.getMeasuredHeight() * hmcVar.U) - hmcVar.getMeasuredHeight()) / 2.0f, ((hmcVar.getMeasuredWidth() * hmcVar.U) - hmcVar.getMeasuredWidth()) / 2.0f);
                boolean z = j95.u5;
                float f = rectF.top;
                if (z) {
                    rectF.top = Math.max(f, a.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, hmcVar.getMeasuredWidth() - hl.L(90.0f));
                } else {
                    rectF.top = Math.max(f, a.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, hmcVar.getMeasuredHeight() - hl.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                mkcVar.h1 = contains;
                if (!contains) {
                    mkcVar.e();
                }
            }
            if (mkcVar.h1 && !mkcVar.a1 && motionEvent.getPointerCount() == 2) {
                mkcVar.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                mkcVar.b1 = x;
                mkcVar.V0 = x;
                float y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                mkcVar.c1 = y;
                mkcVar.W0 = y;
                mkcVar.f1 = 1.0f;
                mkcVar.d1 = motionEvent.getPointerId(0);
                mkcVar.e1 = motionEvent.getPointerId(1);
                mkcVar.a1 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && mkcVar.a1) {
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
                if (mkcVar.d1 == motionEvent.getPointerId(i3)) {
                    i = i3;
                }
                if (mkcVar.e1 == motionEvent.getPointerId(i3)) {
                    i2 = i3;
                }
            }
            if (i == -1 || i2 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                mkcVar.e();
            } else {
                float hypot = ((float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i))) / mkcVar.X0;
                mkcVar.f1 = hypot;
                if (hypot > 1.005f && !mkcVar.g1) {
                    mkcVar.X0 = (float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i));
                    float x2 = (motionEvent.getX(i2) + motionEvent.getX(i)) / 2.0f;
                    mkcVar.b1 = x2;
                    mkcVar.V0 = x2;
                    float y2 = (motionEvent.getY(i2) + motionEvent.getY(i)) / 2.0f;
                    mkcVar.c1 = y2;
                    mkcVar.W0 = y2;
                    mkcVar.f1 = 1.0f;
                    mkcVar.Y0 = 0.0f;
                    mkcVar.Z0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    mkcVar.g1 = true;
                    mkcVar.a1 = true;
                }
                float x3 = (motionEvent.getX(i2) + motionEvent.getX(i)) / 2.0f;
                float y3 = (motionEvent.getY(i2) + motionEvent.getY(i)) / 2.0f;
                float f2 = mkcVar.V0 - x3;
                float f3 = mkcVar.W0 - y3;
                float f4 = mkcVar.f1;
                mkcVar.Y0 = (-f2) / f4;
                mkcVar.Z0 = (-f3) / f4;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((mkcVar.d1 == motionEvent.getPointerId(0) && mkcVar.e1 == motionEvent.getPointerId(1)) || (mkcVar.d1 == motionEvent.getPointerId(1) && mkcVar.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            mkcVar.e();
        }
        mkcVar.s.invalidate();
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
            float f6 = mkcVar.t0;
            if (f5 < f6 * f6 && currentTimeMillis - this.d < 300 && currentTimeMillis - mkcVar.K0 > 300) {
                mkcVar.K0 = System.currentTimeMillis();
                if (mkcVar.C0) {
                    mkcVar.c(false);
                } else if (mkcVar.z0) {
                    mkcVar.r(!mkcVar.x0);
                    mkcVar.q0 = mkcVar.p0;
                    if (!mkcVar.x0 && (ug2Var = mkcVar.N0) != null && ug2Var.W) {
                        ug2Var.f(true);
                    }
                    mkcVar.y();
                }
            }
            this.c = false;
        }
        return mkcVar.h1 || this.c;
    }
}
