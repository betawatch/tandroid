package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l51 extends org.telegram.ui.Cells.t1 {
    public boolean Fe;
    public final RectF Ge;
    public final RectF He;
    public RadialGradient Ie;
    public Paint Je;
    public Matrix Ke;
    public final Path Le;
    public Paint Me;
    public final Paint Ne;
    public org.telegram.ui.Components.l21 Oe;
    public final org.telegram.ui.Components.d6 Pe;
    public final /* synthetic */ int Qe;
    public final /* synthetic */ int Re;
    public final /* synthetic */ n51 Se;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l51(n51 n51Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12) {
        super(context, i10, false, null, f6Var);
        this.Se = n51Var;
        this.Qe = i11;
        this.Re = i12;
        this.Fe = false;
        this.Ge = new RectF();
        this.He = new RectF();
        this.Le = new Path();
        this.Ne = new Paint(1);
        this.Pe = new org.telegram.ui.Components.d6(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override // org.telegram.ui.Cells.t1
    public final void E1(Canvas canvas) {
        Paint paint = this.Je;
        n51 n51Var = this.Se;
        if (paint != null) {
            float f7 = n51Var.s;
            RectF rectF = n51Var.R;
            if (f7 > 0.0f) {
                if (n51Var.Q) {
                    if (this.oe) {
                        Bitmap bitmap = n51Var.P.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.Le;
                            path.rewind();
                            path.addCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, Path.Direction.CW);
                            canvas.clipPath(path);
                            canvas.scale(rectF.width() / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                            canvas.translate(rectF.left, rectF.top);
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                            bitmap.recycle();
                        }
                    } else {
                        float centerX = rectF.centerX();
                        float centerY = rectF.centerY();
                        float width = rectF.width() / 2.0f;
                        if (this.Me == null) {
                            Paint paint2 = new Paint(1);
                            this.Me = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.Me);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.Pe.e(n51Var.Q), 1.0f - n51Var.s));
                    getPhotoImage().draw(canvas);
                } else {
                    getPhotoImage().draw(canvas);
                }
            }
            this.Ke.reset();
            float width2 = (rectF.width() / 76.8f) * n51Var.v;
            this.Ke.postScale(width2, width2);
            this.Ke.postTranslate(rectF.centerX(), rectF.centerY());
            this.Ie.setLocalMatrix(this.Ke);
            canvas.saveLayerAlpha(rectF, 255, 31);
            super.E1(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.Je);
            canvas.restore();
            canvas.restore();
        } else {
            super.E1(canvas);
        }
        canvas.saveLayerAlpha(n51Var.R, (int) (n51Var.v * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.Ne;
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dp(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(n51Var.R);
        rectF2.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - n51Var.a0) * (-360.0f), false, paint3);
        if (this.Oe == null) {
            org.telegram.ui.Components.l21 l21Var = new org.telegram.ui.Components.l21(120);
            this.Oe = l21Var;
            l21Var.b = true;
        }
        paint3.setStrokeWidth(AndroidUtilities.dp(2.8f));
        this.Oe.a((1.0f - n51Var.a0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.t1
    public final void F1(Canvas canvas) {
        AndroidUtilities.lerp(1.0f, 1.5f, this.Se.v);
        super.F1(canvas);
    }

    @Override // org.telegram.ui.Cells.t1
    public final void d2(Canvas canvas, float f7, Integer num) {
        canvas.save();
        int i10 = -this.N.c;
        n51 n51Var = this.Se;
        canvas.translate(AndroidUtilities.lerp(0, i10, n51Var.s), AndroidUtilities.lerp(n51Var.O.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), r0.p, n51Var.s));
        super.d2(canvas, (1.0f - n51Var.s) * f7, num);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.t1, org.telegram.ui.Cells.a0
    public final int getBoundsLeft() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.t1, org.telegram.ui.Cells.a0
    public final int getBoundsRight() {
        return getWidth();
    }

    @Override // org.telegram.ui.Cells.t1
    public final void m2(float f7, Canvas canvas, boolean z10) {
        canvas.save();
        n51 n51Var = this.Se;
        if (n51Var.S) {
            int i10 = this.pb;
            MessageObject messageObject = n51Var.M;
            int i11 = 0;
            if (messageObject != null && messageObject.isOutOwner()) {
                MessageObject messageObject2 = n51Var.M;
                if (messageObject2 != null && messageObject2.type == 19) {
                    i11 = 4;
                }
                i11 += 20;
            }
            canvas.translate(((this.He.right - (AndroidUtilities.dp(8 + i11) + i10)) - this.rb) * n51Var.s, 0.0f);
        }
        super.m2(f7, canvas, z10);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        n51 n51Var = this.Se;
        boolean z10 = n51Var.S;
        RectF rectF = n51Var.R;
        if (z10) {
            boolean z11 = this.Fe;
            RectF rectF2 = this.He;
            RectF rectF3 = this.Ge;
            if (!z11) {
                rectF3.set(getPhotoImage().getImageX(), getPhotoImage().getImageY(), getPhotoImage().getImageX2(), getPhotoImage().getImageY2());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.Fe = true;
                this.Ie = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.Je = paint;
                paint.setShader(this.Ie);
                this.Je.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.Ke = new Matrix();
            }
            AndroidUtilities.lerp(rectF3, rectF2, n51Var.s, rectF);
            U3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().setRoundRadius((int) rectF.width());
            if (n51Var.s <= 0.0f || !n51Var.Q) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            }
            this.ve = 1.0f - n51Var.s;
        } else {
            canvas2 = canvas;
        }
        S1(canvas2);
        if (n51Var.S && n51Var.s > 0.0f && n51Var.Q) {
            canvas2.restore();
        }
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Qe, this.Re);
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        TextureView textureView = this.Se.P;
        if (textureView == null || i10 != 8) {
            return;
        }
        textureView.setVisibility(i10);
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void setPressed(boolean z10) {
    }
}
