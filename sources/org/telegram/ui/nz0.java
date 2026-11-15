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
import android.graphics.Typeface;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class nz0 extends org.telegram.ui.Cells.q1 {
    public final RectF Ad;
    public final RectF Bd;
    public RadialGradient Cd;
    public Paint Dd;
    public Matrix Ed;
    public final Path Fd;
    public Paint Gd;
    public final Paint Hd;
    public org.telegram.ui.Components.e01 Id;
    public final org.telegram.ui.Components.u5 Jd;
    public final /* synthetic */ int Kd;
    public final /* synthetic */ int Ld;
    public final /* synthetic */ pz0 Md;
    public boolean zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz0(pz0 pz0Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11) {
        super(context, i7, false, null, e6Var);
        this.Md = pz0Var;
        this.Kd = i10;
        this.Ld = i11;
        this.zd = false;
        this.Ad = new RectF();
        this.Bd = new RectF();
        this.Fd = new Path();
        this.Hd = new Paint(1);
        this.Jd = new org.telegram.ui.Components.u5(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override // org.telegram.ui.Cells.q1
    public final void N0(Canvas canvas) {
        Paint paint = this.Dd;
        pz0 pz0Var = this.Md;
        if (paint != null) {
            float f10 = pz0Var.s;
            RectF rectF = pz0Var.S;
            if (f10 > 0.0f) {
                if (pz0Var.R) {
                    if (this.Hc) {
                        Bitmap bitmap = pz0Var.Q.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.Fd;
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
                        if (this.Gd == null) {
                            Paint paint2 = new Paint(1);
                            this.Gd = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.Gd);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.Jd.d(pz0Var.R), 1.0f - pz0Var.s));
                    getPhotoImage().h(canvas, null);
                } else {
                    getPhotoImage().h(canvas, null);
                }
            }
            this.Ed.reset();
            float width2 = (rectF.width() / 76.8f) * pz0Var.w;
            this.Ed.postScale(width2, width2);
            this.Ed.postTranslate(rectF.centerX(), rectF.centerY());
            this.Cd.setLocalMatrix(this.Ed);
            canvas.saveLayerAlpha(rectF, org.telegram.messenger.ns.e4, 31);
            super.N0(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.Dd);
            canvas.restore();
            canvas.restore();
        } else {
            super.N0(canvas);
        }
        canvas.saveLayerAlpha(pz0Var.S, (int) (pz0Var.w * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.Hd;
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(pz0Var.S);
        rectF2.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - pz0Var.b0) * (-360.0f), false, paint3);
        if (this.Id == null) {
            org.telegram.ui.Components.e01 e01Var = new org.telegram.ui.Components.e01(120);
            this.Id = e01Var;
            e01Var.b = true;
        }
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.8f));
        this.Id.a((1.0f - pz0Var.b0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1
    public final void O0(Canvas canvas) {
        float f10 = this.Md.w;
        Typeface typeface = org.telegram.messenger.g0.a;
        super.O0(canvas);
    }

    @Override // org.telegram.ui.Cells.q1, org.telegram.ui.Cells.z
    public final int getBoundsLeft() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.q1, org.telegram.ui.Cells.z
    public final int getBoundsRight() {
        return getWidth();
    }

    @Override // org.telegram.ui.Cells.q1
    public final void o1(Canvas canvas, float f10, Integer num) {
        canvas.save();
        int i7 = -this.O.b;
        pz0 pz0Var = this.Md;
        canvas.translate(org.telegram.messenger.g0.W1(pz0Var.s, 0, i7), org.telegram.messenger.g0.W1(pz0Var.s, pz0Var.P.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), r0.n));
        super.o1(canvas, (1.0f - pz0Var.s) * f10, num);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        pz0 pz0Var = this.Md;
        boolean z10 = pz0Var.T;
        RectF rectF = pz0Var.S;
        if (z10) {
            boolean z11 = this.zd;
            RectF rectF2 = this.Bd;
            RectF rectF3 = this.Ad;
            if (!z11) {
                rectF3.set(getPhotoImage().L0, getPhotoImage().M0, getPhotoImage().y(), getPhotoImage().A());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.zd = true;
                this.Cd = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.Dd = paint;
                paint.setShader(this.Cd);
                this.Dd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.Ed = new Matrix();
            }
            org.telegram.messenger.g0.Z1(rectF3, rectF2, pz0Var.s, rectF);
            v3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().J0((int) rectF.width());
            if (pz0Var.s <= 0.0f || !pz0Var.R) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.ns.e4, 31);
            }
            this.gd = 1.0f - pz0Var.s;
        } else {
            canvas2 = canvas;
        }
        d1(canvas2);
        if (pz0Var.T && pz0Var.s > 0.0f && pz0Var.R) {
            canvas2.restore();
        }
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.Kd, this.Ld);
    }

    @Override // android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        TextureView textureView = this.Md.Q;
        if (textureView == null || i7 != 8) {
            return;
        }
        textureView.setVisibility(i7);
    }

    @Override // org.telegram.ui.Cells.q1
    public final void y1(float f10, Canvas canvas, boolean z10) {
        canvas.save();
        pz0 pz0Var = this.Md;
        if (pz0Var.T) {
            int i7 = this.A9;
            org.telegram.messenger.gj gjVar = pz0Var.N;
            int i10 = 0;
            if (gjVar != null && gjVar.P3()) {
                org.telegram.messenger.gj gjVar2 = pz0Var.N;
                if (gjVar2 != null && gjVar2.D == 19) {
                    i10 = 4;
                }
                i10 += 20;
            }
            canvas.translate(((this.Bd.right - (org.telegram.messenger.g0.L(8 + i10) + i7)) - this.C9) * pz0Var.s, 0.0f);
        }
        super.y1(f10, canvas, z10);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void setPressed(boolean z10) {
    }
}
