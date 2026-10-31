package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class jx0 extends org.telegram.ui.Components.g9 implements org.telegram.ui.Components.ru0 {
    public static final s0 g0 = new s0("crossfadeProgress", 4);
    public boolean G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final Path N;
    public final RectF O;
    public final Paint P;
    public boolean Q;
    public float R;
    public float S;
    public ImageReceiver T;
    public final ImageReceiver U;
    public float V;
    public org.telegram.messenger.kc W;
    public boolean a0;
    public float b0;
    public org.telegram.ui.Components.ug0 c0;
    public boolean d0;
    public float e0;
    public Runnable f0;

    public jx0(Context context) {
        super(context);
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.N = new Path();
        this.O = new RectF();
        this.Q = true;
        this.R = 1.0f;
        this.a0 = true;
        this.e0 = 1.0f;
        this.f0 = null;
        setLayerType(2, null);
        this.U = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(-16777216);
    }

    @Override // org.telegram.ui.Components.ru0
    public final void f(Runnable runnable) {
        this.f0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.V;
    }

    public org.telegram.ui.Components.gg getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        return !this.M ? getRoundRadius()[0] : this.K;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.ug0 ug0Var = this.c0;
        if (ug0Var != null) {
            ug0Var.invalidate();
        }
        Runnable runnable = this.f0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.P();
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U.R();
        org.telegram.messenger.kc kcVar = this.W;
        if (kcVar != null) {
            kcVar.a();
            this.W = null;
        }
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.mg0 mg0Var;
        float f7;
        boolean z10;
        float f10;
        int i10;
        float f11;
        float f12;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.ug0 ug0Var = this.c0;
        boolean z11 = ug0Var != null && ug0Var.getVisibility() == 0 && this.M && this.H > 0.0f;
        if (z11) {
            org.telegram.ui.Components.mg0 blurDrawer = this.c0.getBlurDrawer();
            mg0Var = blurDrawer;
            z11 = blurDrawer != null;
        } else {
            mg0Var = null;
        }
        float A = org.telegram.messenger.m5.A(1.0f, this.V, this.e0, (1.0f - this.b0) * (this.d0 ? (int) org.telegram.messenger.i0.N(3.5f) : 0.0f));
        org.telegram.ui.Components.f5 f5Var = this.e;
        ImageReceiver imageReceiver = f5Var != null ? f5Var.k : this.a;
        int i11 = this.K;
        if (i11 > 0) {
            Path path = this.N;
            path.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            f7 = 1.0f;
            rectF.set(A, A, measuredWidth - A, measuredHeight - A);
            float f13 = i11;
            path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
            canvas.clipPath(path);
        } else {
            f7 = 1.0f;
        }
        canvas.save();
        float f14 = this.R;
        float f15 = measuredWidth;
        float f16 = measuredHeight;
        canvas.scale(f14, f14, f15 / 2.0f, f16 / 2.0f);
        if (z11) {
            measuredHeight = this.G ? Math.min(measuredHeight, measuredWidth) : (int) (f16 - org.telegram.messenger.i0.T1(0.0f, this.L / this.I, this.H));
        }
        ImageReceiver imageReceiver2 = this.T;
        if (imageReceiver2 != null) {
            float f17 = this.S;
            float f18 = (f7 - f17) * f7;
            if (f17 > 0.0f) {
                float f19 = imageReceiver2.K0;
                float f20 = imageReceiver2.L0;
                f10 = 0.0f;
                float f21 = imageReceiver2.M0;
                i10 = 0;
                float f22 = imageReceiver2.N0;
                float alpha = imageReceiver2.getAlpha();
                float f23 = A * 2.0f;
                z10 = z11;
                f12 = f18;
                this.T.y0(A, A, f15 - f23, measuredHeight - f23);
                this.T.setAlpha(f17);
                this.T.h(canvas, null);
                this.T.y0(f19, f20, f21, f22);
                this.T.setAlpha(alpha);
            } else {
                z10 = z11;
                f10 = 0.0f;
                f12 = f18;
                i10 = 0;
            }
            f11 = f12;
        } else {
            z10 = z11;
            f10 = 0.0f;
            i10 = 0;
            f11 = f7;
        }
        if (imageReceiver != null && f11 > f10 && (this.V < f7 || !this.a0)) {
            float f24 = A * 2.0f;
            imageReceiver.y0(A, A, f15 - f24, measuredHeight - f24);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f11);
            if (this.Q) {
                int i12 = imageReceiver.W0[i10];
                if (z10) {
                    imageReceiver.J0(i10);
                }
                imageReceiver.h(canvas, null);
                if (z10) {
                    imageReceiver.J0(i12);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.V > f10 && this.a0 && f11 > f10) {
            ImageReceiver imageReceiver3 = this.U;
            if (imageReceiver3.t() != null) {
                float f25 = A * 2.0f;
                imageReceiver3.y0(A, A, f15 - f25, measuredHeight - f25);
                imageReceiver3.setAlpha(this.V * f11);
                imageReceiver3.h(canvas, null);
            } else {
                RectF rectF2 = this.O;
                float f26 = f10;
                rectF2.set(f26, f26, f15, measuredHeight);
                int i13 = (int) (this.V * f11 * 255.0f);
                Paint paint = this.P;
                paint.setAlpha(i13);
                float f27 = imageReceiver3.W0[0];
                canvas.drawRoundRect(rectF2, f27, f27, paint);
            }
        }
        if (z10) {
            float f28 = measuredHeight;
            canvas.translate(A, A + f28);
            float f29 = A * 2.0f;
            mg0Var.e(canvas, this, f15 - f29, f28 - f29, true, (this.G || mg0Var.a || this.c0.getRealPosition() == 0) ? f7 - this.H : f7, f11);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.T = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.ug0 ug0Var) {
        this.c0 = ug0Var;
    }

    public void setCrossfadeProgress(float f7) {
        this.S = f7;
        invalidate();
    }

    public void setForegroundAlpha(float f7) {
        this.V = f7;
        invalidate();
    }

    public void setForegroundImageDrawable(org.telegram.messenger.kc kcVar) {
        if (kcVar != null) {
            this.U.w0(kcVar.d);
        }
        org.telegram.messenger.kc kcVar2 = this.W;
        if (kcVar2 != null) {
            kcVar2.a();
            this.W = null;
        }
        this.W = kcVar;
    }

    public void setHasStories(boolean z10) {
        if (this.d0 == z10) {
            return;
        }
        this.d0 = z10;
        invalidate();
    }

    public void setProgressToExpand(float f7) {
        if (this.b0 == f7) {
            return;
        }
        this.b0 = f7;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f7) {
        if (f7 == this.e0) {
            return;
        }
        this.e0 = f7;
        invalidate();
    }

    @Override // org.telegram.ui.Components.g9
    public void setRoundRadius(int i10) {
        super.setRoundRadius(i10);
        this.U.J0(i10);
    }

    public void setRoundRadiusCollapse(int i10) {
        int i11 = this.J;
        this.J = i10;
        if (i11 != i10) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i10) {
        if (!this.M) {
            setRoundRadius(i10);
        } else {
            this.K = i10;
            setRoundRadius(i10);
        }
    }

    public final void v(int i10) {
        this.L = i10;
        this.M = true;
    }

    public final void w(org.telegram.messenger.ic icVar, String str, Drawable drawable) {
        this.U.p0(icVar, str, drawable, 0L, null, null, 0);
        org.telegram.messenger.kc kcVar = this.W;
        if (kcVar != null) {
            kcVar.a();
            this.W = null;
        }
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.f0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        Runnable runnable = this.f0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
