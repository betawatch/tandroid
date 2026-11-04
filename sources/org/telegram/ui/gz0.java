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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gz0 extends org.telegram.ui.Cells.q1 {
    public boolean kd;
    public final RectF ld;
    public final RectF md;
    public RadialGradient nd;
    public Paint od;
    public Matrix pd;
    public final Path qd;
    public Paint rd;
    public final Paint sd;
    public org.telegram.ui.Components.b01 td;
    public final org.telegram.ui.Components.u5 ud;
    public final /* synthetic */ int vd;
    public final /* synthetic */ int wd;
    public final /* synthetic */ iz0 xd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz0(iz0 iz0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11) {
        super(context, i3, false, null, e6Var);
        this.xd = iz0Var;
        this.vd = i10;
        this.wd = i11;
        this.kd = false;
        this.ld = new RectF();
        this.md = new RectF();
        this.qd = new Path();
        this.sd = new Paint(1);
        this.ud = new org.telegram.ui.Components.u5(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override // org.telegram.ui.Cells.q1
    public final void N0(Canvas canvas) {
        Paint paint = this.od;
        iz0 iz0Var = this.xd;
        if (paint != null) {
            float f10 = iz0Var.s;
            RectF rectF = iz0Var.S;
            if (f10 > 0.0f) {
                if (iz0Var.R) {
                    if (this.Fc) {
                        Bitmap bitmap = iz0Var.Q.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.qd;
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
                        if (this.rd == null) {
                            Paint paint2 = new Paint(1);
                            this.rd = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.rd);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.ud.d(iz0Var.R), 1.0f - iz0Var.s));
                    getPhotoImage().h(canvas, null);
                } else {
                    getPhotoImage().h(canvas, null);
                }
            }
            this.pd.reset();
            float width2 = (rectF.width() / 76.8f) * iz0Var.w;
            this.pd.postScale(width2, width2);
            this.pd.postTranslate(rectF.centerX(), rectF.centerY());
            this.nd.setLocalMatrix(this.pd);
            canvas.saveLayerAlpha(rectF, org.telegram.messenger.hs.e4, 31);
            super.N0(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.od);
            canvas.restore();
            canvas.restore();
        } else {
            super.N0(canvas);
        }
        canvas.saveLayerAlpha(iz0Var.S, (int) (iz0Var.w * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.sd;
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(iz0Var.S);
        rectF2.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - iz0Var.b0) * (-360.0f), false, paint3);
        if (this.td == null) {
            org.telegram.ui.Components.b01 b01Var = new org.telegram.ui.Components.b01(120);
            this.td = b01Var;
            b01Var.b = true;
        }
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.8f));
        this.td.a((1.0f - iz0Var.b0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1
    public final void O0(Canvas canvas) {
        float f10 = this.xd.w;
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
        int i3 = -this.O.b;
        iz0 iz0Var = this.xd;
        canvas.translate(org.telegram.messenger.g0.W1(iz0Var.s, 0, i3), org.telegram.messenger.g0.W1(iz0Var.s, iz0Var.P.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), r0.n));
        super.o1(canvas, (1.0f - iz0Var.s) * f10, num);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        iz0 iz0Var = this.xd;
        boolean z10 = iz0Var.T;
        RectF rectF = iz0Var.S;
        if (z10) {
            boolean z11 = this.kd;
            RectF rectF2 = this.md;
            RectF rectF3 = this.ld;
            if (!z11) {
                rectF3.set(getPhotoImage().L0, getPhotoImage().M0, getPhotoImage().y(), getPhotoImage().A());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.kd = true;
                this.nd = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.od = paint;
                paint.setShader(this.nd);
                this.od.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.pd = new Matrix();
            }
            org.telegram.messenger.g0.Z1(rectF3, rectF2, iz0Var.s, rectF);
            s3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().J0((int) rectF.width());
            if (iz0Var.s <= 0.0f || !iz0Var.R) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.hs.e4, 31);
            }
            this.Rc = 1.0f - iz0Var.s;
        } else {
            canvas2 = canvas;
        }
        d1(canvas2);
        if (iz0Var.T && iz0Var.s > 0.0f && iz0Var.R) {
            canvas2.restore();
        }
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(this.vd, this.wd);
    }

    @Override // android.view.View
    public final void setVisibility(int i3) {
        super.setVisibility(i3);
        TextureView textureView = this.xd.Q;
        if (textureView == null || i3 != 8) {
            return;
        }
        textureView.setVisibility(i3);
    }

    @Override // org.telegram.ui.Cells.q1
    public final void x1(float f10, Canvas canvas, boolean z10) {
        canvas.save();
        iz0 iz0Var = this.xd;
        if (iz0Var.T) {
            int i3 = this.z9;
            org.telegram.messenger.zi ziVar = iz0Var.N;
            int i10 = 0;
            if (ziVar != null && ziVar.Q3()) {
                org.telegram.messenger.zi ziVar2 = iz0Var.N;
                if (ziVar2 != null && ziVar2.D == 19) {
                    i10 = 4;
                }
                i10 += 20;
            }
            canvas.translate(((this.md.right - (org.telegram.messenger.g0.L(8 + i10) + i3)) - this.B9) * iz0Var.s, 0.0f);
        }
        super.x1(f10, canvas, z10);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void setPressed(boolean z10) {
    }
}
