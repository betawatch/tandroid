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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b41 extends org.telegram.ui.Cells.t1 {
    public boolean Be;
    public final RectF Ce;
    public final RectF De;
    public RadialGradient Ee;
    public Paint Fe;
    public Matrix Ge;
    public final Path He;
    public Paint Ie;
    public final Paint Je;
    public org.telegram.ui.Components.d11 Ke;
    public final org.telegram.ui.Components.y5 Le;
    public final /* synthetic */ int Me;
    public final /* synthetic */ int Ne;
    public final /* synthetic */ d41 Oe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(d41 d41Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10, int i11) {
        super(context, i9, false, null, b6Var);
        this.Oe = d41Var;
        this.Me = i10;
        this.Ne = i11;
        this.Be = false;
        this.Ce = new RectF();
        this.De = new RectF();
        this.He = new Path();
        this.Je = new Paint(1);
        this.Le = new org.telegram.ui.Components.y5(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override // org.telegram.ui.Cells.t1
    public final void E1(Canvas canvas) {
        Paint paint = this.Fe;
        d41 d41Var = this.Oe;
        if (paint != null) {
            float f10 = d41Var.s;
            RectF rectF = d41Var.N;
            if (f10 > 0.0f) {
                if (d41Var.M) {
                    if (this.ke) {
                        Bitmap bitmap = d41Var.L.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.He;
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
                        if (this.Ie == null) {
                            Paint paint2 = new Paint(1);
                            this.Ie = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.Ie);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.Le.e(d41Var.M), 1.0f - d41Var.s));
                    getPhotoImage().draw(canvas);
                } else {
                    getPhotoImage().draw(canvas);
                }
            }
            this.Ge.reset();
            float width2 = (rectF.width() / 76.8f) * d41Var.v;
            this.Ge.postScale(width2, width2);
            this.Ge.postTranslate(rectF.centerX(), rectF.centerY());
            this.Ee.setLocalMatrix(this.Ge);
            canvas.saveLayerAlpha(rectF, 255, 31);
            super.E1(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.Fe);
            canvas.restore();
            canvas.restore();
        } else {
            super.E1(canvas);
        }
        canvas.saveLayerAlpha(d41Var.N, (int) (d41Var.v * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.Je;
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dp(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(d41Var.N);
        rectF2.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - d41Var.W) * (-360.0f), false, paint3);
        if (this.Ke == null) {
            org.telegram.ui.Components.d11 d11Var = new org.telegram.ui.Components.d11(120);
            this.Ke = d11Var;
            d11Var.b = true;
        }
        paint3.setStrokeWidth(AndroidUtilities.dp(2.8f));
        this.Ke.a((1.0f - d41Var.W) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.t1
    public final void F1(Canvas canvas) {
        AndroidUtilities.lerp(1.0f, 1.5f, this.Oe.v);
        super.F1(canvas);
    }

    @Override // org.telegram.ui.Cells.t1
    public final void d2(Canvas canvas, float f10, Integer num) {
        canvas.save();
        int i9 = -this.J.c;
        d41 d41Var = this.Oe;
        canvas.translate(AndroidUtilities.lerp(0, i9, d41Var.s), AndroidUtilities.lerp(d41Var.K.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), r0.p, d41Var.s));
        super.d2(canvas, (1.0f - d41Var.s) * f10, num);
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
    public final void m2(float f10, Canvas canvas, boolean z10) {
        canvas.save();
        d41 d41Var = this.Oe;
        if (d41Var.O) {
            int i9 = this.lb;
            MessageObject messageObject = d41Var.I;
            int i10 = 0;
            if (messageObject != null && messageObject.isOutOwner()) {
                MessageObject messageObject2 = d41Var.I;
                if (messageObject2 != null && messageObject2.type == 19) {
                    i10 = 4;
                }
                i10 += 20;
            }
            canvas.translate(((this.De.right - (AndroidUtilities.dp(8 + i10) + i9)) - this.nb) * d41Var.s, 0.0f);
        }
        super.m2(f10, canvas, z10);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        d41 d41Var = this.Oe;
        boolean z10 = d41Var.O;
        RectF rectF = d41Var.N;
        if (z10) {
            boolean z11 = this.Be;
            RectF rectF2 = this.De;
            RectF rectF3 = this.Ce;
            if (!z11) {
                rectF3.set(getPhotoImage().getImageX(), getPhotoImage().getImageY(), getPhotoImage().getImageX2(), getPhotoImage().getImageY2());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.Be = true;
                this.Ee = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.Fe = paint;
                paint.setShader(this.Ee);
                this.Fe.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.Ge = new Matrix();
            }
            AndroidUtilities.lerp(rectF3, rectF2, d41Var.s, rectF);
            U3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().setRoundRadius((int) rectF.width());
            if (d41Var.s <= 0.0f || !d41Var.M) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            }
            this.re = 1.0f - d41Var.s;
        } else {
            canvas2 = canvas;
        }
        S1(canvas2);
        if (d41Var.O && d41Var.s > 0.0f && d41Var.M) {
            canvas2.restore();
        }
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(this.Me, this.Ne);
    }

    @Override // android.view.View
    public final void setVisibility(int i9) {
        super.setVisibility(i9);
        TextureView textureView = this.Oe.L;
        if (textureView == null || i9 != 8) {
            return;
        }
        textureView.setVisibility(i9);
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void setPressed(boolean z10) {
    }
}
