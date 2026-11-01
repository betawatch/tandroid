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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f11 extends org.telegram.ui.Cells.q1 {
    public boolean hd;
    public final RectF id;
    public final RectF jd;
    public RadialGradient kd;
    public Paint ld;
    public Matrix md;
    public final Path nd;
    public Paint od;
    public final Paint pd;
    public org.telegram.ui.Components.i11 qd;
    public final org.telegram.ui.Components.t5 rd;
    public final /* synthetic */ int sd;
    public final /* synthetic */ int td;
    public final /* synthetic */ h11 ud;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f11(h11 h11Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, int i12) {
        super(context, i10, false, null, p6Var);
        this.ud = h11Var;
        this.sd = i11;
        this.td = i12;
        this.hd = false;
        this.id = new RectF();
        this.jd = new RectF();
        this.nd = new Path();
        this.pd = new Paint(1);
        this.rd = new org.telegram.ui.Components.t5(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override // org.telegram.ui.Cells.q1
    public final void L0(Canvas canvas) {
        Paint paint = this.ld;
        h11 h11Var = this.ud;
        if (paint != null) {
            float f7 = h11Var.s;
            RectF rectF = h11Var.R;
            if (f7 > 0.0f) {
                if (h11Var.Q) {
                    if (this.Ec) {
                        Bitmap bitmap = h11Var.P.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.nd;
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
                        if (this.od == null) {
                            Paint paint2 = new Paint(1);
                            this.od = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.od);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.rd.d(h11Var.Q), 1.0f - h11Var.s));
                    getPhotoImage().h(canvas, null);
                } else {
                    getPhotoImage().h(canvas, null);
                }
            }
            this.md.reset();
            float width2 = (rectF.width() / 76.8f) * h11Var.w;
            this.md.postScale(width2, width2);
            this.md.postTranslate(rectF.centerX(), rectF.centerY());
            this.kd.setLocalMatrix(this.md);
            canvas.saveLayerAlpha(rectF, org.telegram.messenger.at.e4, 31);
            super.L0(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.ld);
            canvas.restore();
            canvas.restore();
        } else {
            super.L0(canvas);
        }
        canvas.saveLayerAlpha(h11Var.R, (int) (h11Var.w * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.pd;
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(h11Var.R);
        rectF2.inset(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - h11Var.a0) * (-360.0f), false, paint3);
        if (this.qd == null) {
            org.telegram.ui.Components.i11 i11Var = new org.telegram.ui.Components.i11(120);
            this.qd = i11Var;
            i11Var.b = true;
        }
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(2.8f));
        this.qd.a((1.0f - h11Var.a0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1
    public final void M0(Canvas canvas) {
        float f7 = this.ud.w;
        Typeface typeface = org.telegram.messenger.i0.a;
        super.M0(canvas);
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
    public final void m1(Canvas canvas, float f7, Integer num) {
        canvas.save();
        int i10 = -this.N.b;
        h11 h11Var = this.ud;
        canvas.translate(org.telegram.messenger.i0.W1(h11Var.s, 0, i10), org.telegram.messenger.i0.W1(h11Var.s, h11Var.O.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), r0.n));
        super.m1(canvas, (1.0f - h11Var.s) * f7, num);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        h11 h11Var = this.ud;
        boolean z10 = h11Var.S;
        RectF rectF = h11Var.R;
        if (z10) {
            boolean z11 = this.hd;
            RectF rectF2 = this.jd;
            RectF rectF3 = this.id;
            if (!z11) {
                rectF3.set(getPhotoImage().K0, getPhotoImage().L0, getPhotoImage().y(), getPhotoImage().A());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.hd = true;
                this.kd = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.ld = paint;
                paint.setShader(this.kd);
                this.ld.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.md = new Matrix();
            }
            org.telegram.messenger.i0.Z1(rectF3, rectF2, h11Var.s, rectF);
            q3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().J0((int) rectF.width());
            if (h11Var.s <= 0.0f || !h11Var.Q) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.at.e4, 31);
            }
            this.Qc = 1.0f - h11Var.s;
        } else {
            canvas2 = canvas;
        }
        b1(canvas2);
        if (h11Var.S && h11Var.s > 0.0f && h11Var.Q) {
            canvas2.restore();
        }
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.sd, this.td);
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        TextureView textureView = this.ud.P;
        if (textureView == null || i10 != 8) {
            return;
        }
        textureView.setVisibility(i10);
    }

    @Override // org.telegram.ui.Cells.q1
    public final void v1(float f7, Canvas canvas, boolean z10) {
        canvas.save();
        h11 h11Var = this.ud;
        if (h11Var.S) {
            int i10 = this.y9;
            org.telegram.messenger.kj kjVar = h11Var.M;
            int i11 = 0;
            if (kjVar != null && kjVar.P3()) {
                org.telegram.messenger.kj kjVar2 = h11Var.M;
                if (kjVar2 != null && kjVar2.D == 19) {
                    i11 = 4;
                }
                i11 += 20;
            }
            canvas.translate(((this.jd.right - (org.telegram.messenger.i0.L(8 + i11) + i10)) - this.A9) * h11Var.s, 0.0f);
        }
        super.v1(f7, canvas, z10);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void setPressed(boolean z10) {
    }
}
