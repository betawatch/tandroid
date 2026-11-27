// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class hr8 extends de0 implements tma {
    public static final qm h0 = new qm("crossfadeProgress", (byte) 10);
    public boolean H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final Path O;
    public final RectF P;
    public final Paint Q;
    public boolean R;
    public float S;
    public float T;
    public ImageReceiver U;
    public final ImageReceiver V;
    public float W;
    public mn5 a0;
    public boolean b0;
    public float c0;
    public et8 d0;
    public boolean e0;
    public float f0;
    public Runnable g0;

    public hr8(Context context) {
        super(context);
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.O = new Path();
        this.P = new RectF();
        this.R = true;
        this.S = 1.0f;
        this.b0 = true;
        this.f0 = 1.0f;
        this.g0 = null;
        setLayerType(2, null);
        this.V = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.Q = paint;
        paint.setColor(-16777216);
    }

    @Override // tma
    public final void d(Runnable runnable) {
        this.g0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.W;
    }

    public kz1 getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        return !this.N ? getRoundRadius()[0] : this.L;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        et8 et8Var = this.d0;
        if (et8Var != null) {
            et8Var.invalidate();
        }
        Runnable runnable = this.g0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // de0, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V.I();
    }

    @Override // de0, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V.K();
        mn5 mn5Var = this.a0;
        if (mn5Var != null) {
            mn5Var.a();
            this.a0 = null;
        }
    }

    @Override // de0, android.view.View
    public final void onDraw(Canvas canvas) {
        ws8 ws8Var;
        float f;
        boolean z;
        float f2;
        int i;
        float f3;
        float f4;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        et8 et8Var = this.d0;
        boolean z2 = et8Var != null && et8Var.getVisibility() == 0 && this.N && this.I > 0.0f;
        if (z2) {
            ws8 blurDrawer = this.d0.getBlurDrawer();
            ws8Var = blurDrawer;
            z2 = blurDrawer != null;
        } else {
            ws8Var = null;
        }
        float z3 = qd4.z(1.0f, this.W, this.f0, (1.0f - this.c0) * (this.e0 ? (int) hl.N(3.5f) : 0.0f));
        wl wlVar = this.e;
        ImageReceiver imageReceiver = wlVar != null ? wlVar.k : this.a;
        int i2 = this.L;
        if (i2 > 0) {
            Path path = this.O;
            path.rewind();
            RectF rectF = hl.P;
            f = 1.0f;
            rectF.set(z3, z3, measuredWidth - z3, measuredHeight - z3);
            float f5 = i2;
            path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
            canvas.clipPath(path);
        } else {
            f = 1.0f;
        }
        canvas.save();
        float f6 = this.S;
        float f7 = measuredWidth;
        float f8 = measuredHeight;
        canvas.scale(f6, f6, f7 / 2.0f, f8 / 2.0f);
        if (z2) {
            measuredHeight = this.H ? Math.min(measuredHeight, measuredWidth) : (int) (f8 - hl.R1(0.0f, this.M / this.J, this.I));
        }
        ImageReceiver imageReceiver2 = this.U;
        if (imageReceiver2 != null) {
            float f9 = this.T;
            float f10 = (f - f9) * f;
            if (f9 > 0.0f) {
                float f11 = imageReceiver2.L0;
                float f12 = imageReceiver2.M0;
                f2 = 0.0f;
                float f13 = imageReceiver2.N0;
                i = 0;
                float f14 = imageReceiver2.O0;
                float alpha = imageReceiver2.getAlpha();
                float f15 = z3 * 2.0f;
                z = z2;
                f4 = f10;
                this.U.i0(z3, z3, f7 - f15, measuredHeight - f15);
                this.U.setAlpha(f9);
                this.U.h(canvas, null);
                this.U.i0(f11, f12, f13, f14);
                this.U.setAlpha(alpha);
            } else {
                z = z2;
                f2 = 0.0f;
                f4 = f10;
                i = 0;
            }
            f3 = f4;
        } else {
            z = z2;
            f2 = 0.0f;
            i = 0;
            f3 = f;
        }
        if (imageReceiver != null && f3 > f2 && (this.W < f || !this.b0)) {
            float f16 = z3 * 2.0f;
            imageReceiver.i0(z3, z3, f7 - f16, measuredHeight - f16);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f3);
            if (this.R) {
                int i3 = imageReceiver.X0[i];
                if (z) {
                    imageReceiver.q0(i);
                }
                imageReceiver.h(canvas, null);
                if (z) {
                    imageReceiver.q0(i3);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.W > f2 && this.b0 && f3 > f2) {
            ImageReceiver imageReceiver3 = this.V;
            if (imageReceiver3.t() != null) {
                float f17 = z3 * 2.0f;
                imageReceiver3.i0(z3, z3, f7 - f17, measuredHeight - f17);
                imageReceiver3.setAlpha(this.W * f3);
                imageReceiver3.h(canvas, null);
            } else {
                RectF rectF2 = this.P;
                float f18 = f2;
                rectF2.set(f18, f18, f7, measuredHeight);
                int i4 = (int) (this.W * f3 * 255.0f);
                Paint paint = this.Q;
                paint.setAlpha(i4);
                float f19 = imageReceiver3.X0[0];
                canvas.drawRoundRect(rectF2, f19, f19, paint);
            }
        }
        if (z) {
            float f20 = measuredHeight;
            canvas.translate(z3, z3 + f20);
            float f21 = z3 * 2.0f;
            ws8Var.d(canvas, this, f7 - f21, f20 - f21, true, (this.H || ws8Var.a || this.d0.getRealPosition() == 0) ? f - this.I : f, f3);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.U = imageReceiver;
    }

    public void setAvatarsViewPager(et8 et8Var) {
        this.d0 = et8Var;
    }

    public void setCrossfadeProgress(float f) {
        this.T = f;
        invalidate();
    }

    public void setForegroundAlpha(float f) {
        this.W = f;
        invalidate();
    }

    public void setForegroundImageDrawable(mn5 mn5Var) {
        if (mn5Var != null) {
            this.V.g0(mn5Var.d);
        }
        mn5 mn5Var2 = this.a0;
        if (mn5Var2 != null) {
            mn5Var2.a();
            this.a0 = null;
        }
        this.a0 = mn5Var;
    }

    public void setHasStories(boolean z) {
        if (this.e0 == z) {
            return;
        }
        this.e0 = z;
        invalidate();
    }

    public void setProgressToExpand(float f) {
        if (this.c0 == f) {
            return;
        }
        this.c0 = f;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f) {
        if (f == this.f0) {
            return;
        }
        this.f0 = f;
        invalidate();
    }

    @Override // de0
    public void setRoundRadius(int i) {
        super.setRoundRadius(i);
        this.V.q0(i);
    }

    public void setRoundRadiusCollapse(int i) {
        int i2 = this.K;
        this.K = i;
        if (i2 != i) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i) {
        if (!this.N) {
            setRoundRadius(i);
        } else {
            this.L = i;
            setRoundRadius(i);
        }
    }

    public final void u(int i) {
        this.M = i;
        this.N = true;
    }

    public final void v(jn5 jn5Var, String str, Drawable drawable) {
        this.V.c0(jn5Var, str, drawable, 0L, null, null, 0);
        mn5 mn5Var = this.a0;
        if (mn5Var != null) {
            mn5Var.a();
            this.a0 = null;
        }
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.g0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        Runnable runnable = this.g0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
