package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class n01 extends org.telegram.ui.Components.x9 implements org.telegram.ui.Components.lv0 {
    public static final t0 g0 = new t0("crossfadeProgress", 3);
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
    public ImageReceiver.BitmapHolder W;
    public boolean a0;
    public float b0;
    public org.telegram.ui.Components.oh0 c0;
    public boolean d0;
    public float e0;
    public Runnable f0;

    public n01(Context context) {
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

    @Override // org.telegram.ui.Components.lv0
    public final void g(Runnable runnable) {
        this.f0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.V;
    }

    public org.telegram.ui.Components.ch getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        return !this.M ? getRoundRadius()[0] : this.K;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.oh0 oh0Var = this.c0;
        if (oh0Var != null) {
            oh0Var.invalidate();
        }
        Runnable runnable = this.f0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.x9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.x9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U.onDetachedFromWindow();
        ImageReceiver.BitmapHolder bitmapHolder = this.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.W = null;
        }
    }

    @Override // org.telegram.ui.Components.x9, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.fh0 fh0Var;
        boolean z10;
        float f7;
        float f10;
        char c10;
        float f11;
        float f12;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.oh0 oh0Var = this.c0;
        boolean z11 = oh0Var != null && oh0Var.getVisibility() == 0 && this.M && this.H > 0.0f;
        if (z11) {
            org.telegram.ui.Components.fh0 blurDrawer = this.c0.getBlurDrawer();
            fh0Var = blurDrawer;
            z11 = blurDrawer != null;
        } else {
            fh0Var = null;
        }
        float A = org.telegram.messenger.w1.A(1.0f, this.V, this.e0, (1.0f - this.b0) * (this.d0 ? (int) AndroidUtilities.dpf2(3.5f) : 0.0f));
        org.telegram.ui.Components.q5 q5Var = this.e;
        ImageReceiver imageReceiver = q5Var != null ? q5Var.k : this.a;
        int i10 = this.K;
        if (i10 > 0) {
            Path path = this.N;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(A, A, measuredWidth - A, measuredHeight - A);
            float f13 = i10;
            path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
            canvas.clipPath(path);
        }
        canvas.save();
        float f14 = this.R;
        float f15 = measuredWidth;
        float f16 = measuredHeight;
        canvas.scale(f14, f14, f15 / 2.0f, f16 / 2.0f);
        if (z11) {
            measuredHeight = this.G ? Math.min(measuredHeight, measuredWidth) : (int) (f16 - AndroidUtilities.lerp(0.0f, this.L / this.I, this.H));
        }
        ImageReceiver imageReceiver2 = this.T;
        if (imageReceiver2 != null) {
            float f17 = this.S;
            float f18 = (1.0f - f17) * 1.0f;
            if (f17 > 0.0f) {
                float imageX = imageReceiver2.getImageX();
                float imageY = this.T.getImageY();
                float imageWidth = this.T.getImageWidth();
                f7 = 2.0f;
                float imageHeight = this.T.getImageHeight();
                f10 = 0.0f;
                float alpha = this.T.getAlpha();
                c10 = 0;
                float f19 = A * 2.0f;
                z10 = z11;
                f12 = f18;
                this.T.setImageCoords(A, A, f15 - f19, measuredHeight - f19);
                this.T.setAlpha(f17);
                this.T.draw(canvas);
                this.T.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                this.T.setAlpha(alpha);
            } else {
                z10 = z11;
                f12 = f18;
                f7 = 2.0f;
                f10 = 0.0f;
                c10 = 0;
            }
            f11 = f12;
        } else {
            z10 = z11;
            f7 = 2.0f;
            f10 = 0.0f;
            c10 = 0;
            f11 = 1.0f;
        }
        if (imageReceiver != null && f11 > f10 && (this.V < 1.0f || !this.a0)) {
            float f20 = A * f7;
            imageReceiver.setImageCoords(A, A, f15 - f20, measuredHeight - f20);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f11);
            if (this.Q) {
                int i11 = imageReceiver.getRoundRadius()[c10];
                if (z10) {
                    imageReceiver.setRoundRadius(0);
                }
                imageReceiver.draw(canvas);
                if (z10) {
                    imageReceiver.setRoundRadius(i11);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.V > f10 && this.a0 && f11 > f10) {
            ImageReceiver imageReceiver3 = this.U;
            if (imageReceiver3.getDrawable() != null) {
                float f21 = A * f7;
                imageReceiver3.setImageCoords(A, A, f15 - f21, measuredHeight - f21);
                imageReceiver3.setAlpha(this.V * f11);
                imageReceiver3.draw(canvas);
            } else {
                RectF rectF2 = this.O;
                rectF2.set(0.0f, 0.0f, f15, measuredHeight);
                int i12 = (int) (this.V * f11 * 255.0f);
                Paint paint = this.P;
                paint.setAlpha(i12);
                float f22 = imageReceiver3.getRoundRadius()[0];
                canvas.drawRoundRect(rectF2, f22, f22, paint);
            }
        }
        if (z10) {
            float f23 = measuredHeight;
            canvas.translate(A, A + f23);
            float f24 = A * f7;
            fh0Var.f(canvas, this, f15 - f24, f23 - f24, true, (this.G || fh0Var.a || this.c0.getRealPosition() == 0) ? 1.0f - this.H : 1.0f, f11);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.T = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.oh0 oh0Var) {
        this.c0 = oh0Var;
    }

    public void setCrossfadeProgress(float f7) {
        this.S = f7;
        invalidate();
    }

    public void setForegroundAlpha(float f7) {
        this.V = f7;
        invalidate();
    }

    public void setForegroundImageDrawable(ImageReceiver.BitmapHolder bitmapHolder) {
        if (bitmapHolder != null) {
            this.U.setImageBitmap(bitmapHolder.drawable);
        }
        ImageReceiver.BitmapHolder bitmapHolder2 = this.W;
        if (bitmapHolder2 != null) {
            bitmapHolder2.release();
            this.W = null;
        }
        this.W = bitmapHolder;
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

    @Override // org.telegram.ui.Components.x9
    public void setRoundRadius(int i10) {
        super.setRoundRadius(i10);
        this.U.setRoundRadius(i10);
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

    public final void t(int i10) {
        this.L = i10;
        this.M = true;
    }

    public final void u(ImageLocation imageLocation, String str, Drawable drawable) {
        this.U.setImage(imageLocation, str, drawable, 0L, (String) null, (Object) null, 0);
        ImageReceiver.BitmapHolder bitmapHolder = this.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
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
