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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class a01 extends org.telegram.ui.Components.p9 implements org.telegram.ui.Components.nv0 {
    public static final w0 d0 = new w0("crossfadeProgress", 3);
    public boolean D;
    public float E;
    public float F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public final Path K;
    public final RectF L;
    public final Paint M;
    public boolean N;
    public float O;
    public float P;
    public ImageReceiver Q;
    public final ImageReceiver R;
    public float S;
    public ImageReceiver.BitmapHolder T;
    public boolean U;
    public float V;
    public org.telegram.ui.Components.wh0 W;
    public boolean a0;
    public float b0;
    public Runnable c0;

    public a01(Context context) {
        super(context);
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.K = new Path();
        this.L = new RectF();
        this.N = true;
        this.O = 1.0f;
        this.U = true;
        this.b0 = 1.0f;
        this.c0 = null;
        setLayerType(2, null);
        this.R = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setColor(-16777216);
    }

    @Override // org.telegram.ui.Components.nv0
    public final void g(Runnable runnable) {
        this.c0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.S;
    }

    public org.telegram.ui.Components.rg getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        return !this.J ? getRoundRadius()[0] : this.H;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.wh0 wh0Var = this.W;
        if (wh0Var != null) {
            wh0Var.invalidate();
        }
        Runnable runnable = this.c0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R.onDetachedFromWindow();
        ImageReceiver.BitmapHolder bitmapHolder = this.T;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.T = null;
        }
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.nh0 nh0Var;
        boolean z4;
        float f10;
        float f11;
        char c3;
        float f12;
        float f13;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.wh0 wh0Var = this.W;
        boolean z10 = wh0Var != null && wh0Var.getVisibility() == 0 && this.J && this.E > 0.0f;
        if (z10) {
            org.telegram.ui.Components.nh0 blurDrawer = this.W.getBlurDrawer();
            nh0Var = blurDrawer;
            z10 = blurDrawer != null;
        } else {
            nh0Var = null;
        }
        float y10 = org.telegram.messenger.y3.y(1.0f, this.S, this.b0, (1.0f - this.V) * (this.a0 ? (int) AndroidUtilities.dpf2(3.5f) : 0.0f));
        org.telegram.ui.Components.l5 l5Var = this.e;
        ImageReceiver imageReceiver = l5Var != null ? l5Var.k : this.a;
        int i10 = this.H;
        if (i10 > 0) {
            Path path = this.K;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(y10, y10, measuredWidth - y10, measuredHeight - y10);
            float f14 = i10;
            path.addRoundRect(rectF, f14, f14, Path.Direction.CW);
            canvas.clipPath(path);
        }
        canvas.save();
        float f15 = this.O;
        float f16 = measuredWidth;
        float f17 = measuredHeight;
        canvas.scale(f15, f15, f16 / 2.0f, f17 / 2.0f);
        if (z10) {
            measuredHeight = this.D ? Math.min(measuredHeight, measuredWidth) : (int) (f17 - AndroidUtilities.lerp(0.0f, this.I / this.F, this.E));
        }
        ImageReceiver imageReceiver2 = this.Q;
        if (imageReceiver2 != null) {
            float f18 = this.P;
            float f19 = (1.0f - f18) * 1.0f;
            if (f18 > 0.0f) {
                float imageX = imageReceiver2.getImageX();
                float imageY = this.Q.getImageY();
                float imageWidth = this.Q.getImageWidth();
                f10 = 2.0f;
                float imageHeight = this.Q.getImageHeight();
                f11 = 0.0f;
                float alpha = this.Q.getAlpha();
                c3 = 0;
                float f20 = y10 * 2.0f;
                z4 = z10;
                f13 = f19;
                this.Q.setImageCoords(y10, y10, f16 - f20, measuredHeight - f20);
                this.Q.setAlpha(f18);
                this.Q.draw(canvas);
                this.Q.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                this.Q.setAlpha(alpha);
            } else {
                z4 = z10;
                f13 = f19;
                f10 = 2.0f;
                f11 = 0.0f;
                c3 = 0;
            }
            f12 = f13;
        } else {
            z4 = z10;
            f10 = 2.0f;
            f11 = 0.0f;
            c3 = 0;
            f12 = 1.0f;
        }
        if (imageReceiver != null && f12 > f11 && (this.S < 1.0f || !this.U)) {
            float f21 = y10 * f10;
            imageReceiver.setImageCoords(y10, y10, f16 - f21, measuredHeight - f21);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f12);
            if (this.N) {
                int i11 = imageReceiver.getRoundRadius()[c3];
                if (z4) {
                    imageReceiver.setRoundRadius(0);
                }
                imageReceiver.draw(canvas);
                if (z4) {
                    imageReceiver.setRoundRadius(i11);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.S > f11 && this.U && f12 > f11) {
            ImageReceiver imageReceiver3 = this.R;
            if (imageReceiver3.getDrawable() != null) {
                float f22 = y10 * f10;
                imageReceiver3.setImageCoords(y10, y10, f16 - f22, measuredHeight - f22);
                imageReceiver3.setAlpha(this.S * f12);
                imageReceiver3.draw(canvas);
            } else {
                RectF rectF2 = this.L;
                rectF2.set(0.0f, 0.0f, f16, measuredHeight);
                int i12 = (int) (this.S * f12 * 255.0f);
                Paint paint = this.M;
                paint.setAlpha(i12);
                float f23 = imageReceiver3.getRoundRadius()[0];
                canvas.drawRoundRect(rectF2, f23, f23, paint);
            }
        }
        if (z4) {
            float f24 = measuredHeight;
            canvas.translate(y10, y10 + f24);
            float f25 = y10 * f10;
            nh0Var.f(canvas, this, f16 - f25, f24 - f25, true, (this.D || nh0Var.a || this.W.getRealPosition() == 0) ? 1.0f - this.E : 1.0f, f12);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.Q = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.wh0 wh0Var) {
        this.W = wh0Var;
    }

    public void setCrossfadeProgress(float f10) {
        this.P = f10;
        invalidate();
    }

    public void setForegroundAlpha(float f10) {
        this.S = f10;
        invalidate();
    }

    public void setForegroundImageDrawable(ImageReceiver.BitmapHolder bitmapHolder) {
        if (bitmapHolder != null) {
            this.R.setImageBitmap(bitmapHolder.drawable);
        }
        ImageReceiver.BitmapHolder bitmapHolder2 = this.T;
        if (bitmapHolder2 != null) {
            bitmapHolder2.release();
            this.T = null;
        }
        this.T = bitmapHolder;
    }

    public void setHasStories(boolean z4) {
        if (this.a0 == z4) {
            return;
        }
        this.a0 = z4;
        invalidate();
    }

    public void setProgressToExpand(float f10) {
        if (this.V == f10) {
            return;
        }
        this.V = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (f10 == this.b0) {
            return;
        }
        this.b0 = f10;
        invalidate();
    }

    @Override // org.telegram.ui.Components.p9
    public void setRoundRadius(int i10) {
        super.setRoundRadius(i10);
        this.R.setRoundRadius(i10);
    }

    public void setRoundRadiusCollapse(int i10) {
        int i11 = this.G;
        this.G = i10;
        if (i11 != i10) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i10) {
        if (!this.J) {
            setRoundRadius(i10);
        } else {
            this.H = i10;
            setRoundRadius(i10);
        }
    }

    public final void t(int i10) {
        this.I = i10;
        this.J = true;
    }

    public final void u(ImageLocation imageLocation, String str, Drawable drawable) {
        this.R.setImage(imageLocation, str, drawable, 0L, (String) null, (Object) null, 0);
        ImageReceiver.BitmapHolder bitmapHolder = this.T;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.T = null;
        }
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.c0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        Runnable runnable = this.c0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
