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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class iz0 extends org.telegram.ui.Components.t9 implements org.telegram.ui.Components.ev0 {
    public static final w0 c0 = new w0("crossfadeProgress", 3);
    public boolean C;
    public float D;
    public float E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public final Path J;
    public final RectF K;
    public final Paint L;
    public boolean M;
    public float N;
    public float O;
    public ImageReceiver P;
    public final ImageReceiver Q;
    public float R;
    public ImageReceiver.BitmapHolder S;
    public boolean T;
    public float U;
    public org.telegram.ui.Components.kh0 V;
    public boolean W;
    public float a0;
    public Runnable b0;

    public iz0(Context context) {
        super(context);
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.J = new Path();
        this.K = new RectF();
        this.M = true;
        this.N = 1.0f;
        this.T = true;
        this.a0 = 1.0f;
        this.b0 = null;
        setLayerType(2, null);
        this.Q = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setColor(-16777216);
    }

    @Override // org.telegram.ui.Components.ev0
    public final void g(Runnable runnable) {
        this.b0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.R;
    }

    public org.telegram.ui.Components.ug getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        return !this.I ? getRoundRadius()[0] : this.G;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.kh0 kh0Var = this.V;
        if (kh0Var != null) {
            kh0Var.invalidate();
        }
        Runnable runnable = this.b0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q.onDetachedFromWindow();
        ImageReceiver.BitmapHolder bitmapHolder = this.S;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.S = null;
        }
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.bh0 bh0Var;
        boolean z10;
        float f9;
        float f10;
        char c3;
        float f11;
        float f12;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.kh0 kh0Var = this.V;
        boolean z11 = kh0Var != null && kh0Var.getVisibility() == 0 && this.I && this.D > 0.0f;
        if (z11) {
            org.telegram.ui.Components.bh0 blurDrawer = this.V.getBlurDrawer();
            bh0Var = blurDrawer;
            z11 = blurDrawer != null;
        } else {
            bh0Var = null;
        }
        float y8 = org.telegram.messenger.x3.y(1.0f, this.R, this.a0, (1.0f - this.U) * (this.W ? (int) AndroidUtilities.dpf2(3.5f) : 0.0f));
        org.telegram.ui.Components.p5 p5Var = this.e;
        ImageReceiver imageReceiver = p5Var != null ? p5Var.k : this.a;
        int i10 = this.G;
        if (i10 > 0) {
            Path path = this.J;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(y8, y8, measuredWidth - y8, measuredHeight - y8);
            float f13 = i10;
            path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
            canvas.clipPath(path);
        }
        canvas.save();
        float f14 = this.N;
        float f15 = measuredWidth;
        float f16 = measuredHeight;
        canvas.scale(f14, f14, f15 / 2.0f, f16 / 2.0f);
        if (z11) {
            measuredHeight = this.C ? Math.min(measuredHeight, measuredWidth) : (int) (f16 - AndroidUtilities.lerp(0.0f, this.H / this.E, this.D));
        }
        ImageReceiver imageReceiver2 = this.P;
        if (imageReceiver2 != null) {
            float f17 = this.O;
            float f18 = (1.0f - f17) * 1.0f;
            if (f17 > 0.0f) {
                float imageX = imageReceiver2.getImageX();
                float imageY = this.P.getImageY();
                float imageWidth = this.P.getImageWidth();
                f9 = 2.0f;
                float imageHeight = this.P.getImageHeight();
                f10 = 0.0f;
                float alpha = this.P.getAlpha();
                c3 = 0;
                float f19 = y8 * 2.0f;
                z10 = z11;
                f12 = f18;
                this.P.setImageCoords(y8, y8, f15 - f19, measuredHeight - f19);
                this.P.setAlpha(f17);
                this.P.draw(canvas);
                this.P.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                this.P.setAlpha(alpha);
            } else {
                z10 = z11;
                f12 = f18;
                f9 = 2.0f;
                f10 = 0.0f;
                c3 = 0;
            }
            f11 = f12;
        } else {
            z10 = z11;
            f9 = 2.0f;
            f10 = 0.0f;
            c3 = 0;
            f11 = 1.0f;
        }
        if (imageReceiver != null && f11 > f10 && (this.R < 1.0f || !this.T)) {
            float f20 = y8 * f9;
            imageReceiver.setImageCoords(y8, y8, f15 - f20, measuredHeight - f20);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f11);
            if (this.M) {
                int i11 = imageReceiver.getRoundRadius()[c3];
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
        if (this.R > f10 && this.T && f11 > f10) {
            ImageReceiver imageReceiver3 = this.Q;
            if (imageReceiver3.getDrawable() != null) {
                float f21 = y8 * f9;
                imageReceiver3.setImageCoords(y8, y8, f15 - f21, measuredHeight - f21);
                imageReceiver3.setAlpha(this.R * f11);
                imageReceiver3.draw(canvas);
            } else {
                RectF rectF2 = this.K;
                rectF2.set(0.0f, 0.0f, f15, measuredHeight);
                int i12 = (int) (this.R * f11 * 255.0f);
                Paint paint = this.L;
                paint.setAlpha(i12);
                float f22 = imageReceiver3.getRoundRadius()[0];
                canvas.drawRoundRect(rectF2, f22, f22, paint);
            }
        }
        if (z10) {
            float f23 = measuredHeight;
            canvas.translate(y8, y8 + f23);
            float f24 = y8 * f9;
            bh0Var.f(canvas, this, f15 - f24, f23 - f24, true, (this.C || bh0Var.a || this.V.getRealPosition() == 0) ? 1.0f - this.D : 1.0f, f11);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.P = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.kh0 kh0Var) {
        this.V = kh0Var;
    }

    public void setCrossfadeProgress(float f9) {
        this.O = f9;
        invalidate();
    }

    public void setForegroundAlpha(float f9) {
        this.R = f9;
        invalidate();
    }

    public void setForegroundImageDrawable(ImageReceiver.BitmapHolder bitmapHolder) {
        if (bitmapHolder != null) {
            this.Q.setImageBitmap(bitmapHolder.drawable);
        }
        ImageReceiver.BitmapHolder bitmapHolder2 = this.S;
        if (bitmapHolder2 != null) {
            bitmapHolder2.release();
            this.S = null;
        }
        this.S = bitmapHolder;
    }

    public void setHasStories(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        invalidate();
    }

    public void setProgressToExpand(float f9) {
        if (this.U == f9) {
            return;
        }
        this.U = f9;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f9) {
        if (f9 == this.a0) {
            return;
        }
        this.a0 = f9;
        invalidate();
    }

    @Override // org.telegram.ui.Components.t9
    public void setRoundRadius(int i10) {
        super.setRoundRadius(i10);
        this.Q.setRoundRadius(i10);
    }

    public void setRoundRadiusCollapse(int i10) {
        int i11 = this.F;
        this.F = i10;
        if (i11 != i10) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i10) {
        if (!this.I) {
            setRoundRadius(i10);
        } else {
            this.G = i10;
            setRoundRadius(i10);
        }
    }

    public final void t(int i10) {
        this.H = i10;
        this.I = true;
    }

    public final void u(ImageLocation imageLocation, String str, Drawable drawable) {
        this.Q.setImage(imageLocation, str, drawable, 0L, (String) null, (Object) null, 0);
        ImageReceiver.BitmapHolder bitmapHolder = this.S;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.S = null;
        }
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.b0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        Runnable runnable = this.b0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
