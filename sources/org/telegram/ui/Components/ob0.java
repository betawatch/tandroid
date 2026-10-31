package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ob0 extends Drawable {
    public final /* synthetic */ int a = 0;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Path e;
    public boolean f;
    public final Object g;

    public ob0() {
        Path path = new Path();
        this.e = path;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.g = new t5(new eb0(this, 1), 320L, gr.h, 0);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(-1);
        paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.N(2.0f)));
        paint2.setColor(-1);
        paint3.setStyle(style);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        path.moveTo(-org.telegram.messenger.i0.N(3.75f), -org.telegram.messenger.i0.N(5.4166f));
        path.lineTo(org.telegram.messenger.i0.N(3.75f), 0.0f);
        path.lineTo(-org.telegram.messenger.i0.N(3.75f), org.telegram.messenger.i0.N(5.4166f));
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                float N = org.telegram.messenger.i0.N(1.66f);
                Paint paint = this.b;
                paint.setStrokeWidth(N);
                float N2 = org.telegram.messenger.i0.N(3.32f);
                Paint paint2 = this.d;
                paint2.setStrokeWidth(N2);
                float d = ((t5) this.g).d(this.f);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float N3 = org.telegram.messenger.i0.N(10.66f);
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(centerX - N3, centerY - N3, centerX + N3, N3 + centerY);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(8.33f), org.telegram.messenger.i0.N(8.33f), paint);
                if (d > 0.0f) {
                    canvas.saveLayerAlpha(rectF, org.telegram.messenger.zs.e4, 31);
                } else {
                    canvas.save();
                }
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.N(1.0f) + centerX, centerY - org.telegram.messenger.i0.N(0.5f));
                canvas.drawPath(this.e, this.c);
                canvas.restore();
                if (d > 0.0f) {
                    if (this.f) {
                        canvas.drawLine(centerX - org.telegram.messenger.i0.N(8.33f), centerY - org.telegram.messenger.i0.N(8.33f), org.telegram.ui.Cells.f1.d(16.66f, d, centerX - org.telegram.messenger.i0.N(8.33f)), org.telegram.ui.Cells.f1.d(16.66f, d, centerY - org.telegram.messenger.i0.N(8.33f)), paint2);
                        canvas.drawLine(centerX - org.telegram.messenger.i0.N(8.33f), centerY - org.telegram.messenger.i0.N(8.33f), org.telegram.ui.Cells.f1.d(16.66f, d, centerX - org.telegram.messenger.i0.N(8.33f)), org.telegram.ui.Cells.f1.d(16.66f, d, centerY - org.telegram.messenger.i0.N(8.33f)), paint);
                    } else {
                        canvas.drawLine(org.telegram.messenger.i0.N(8.33f) + centerX, org.telegram.messenger.i0.N(8.33f) + centerY, (org.telegram.messenger.i0.N(8.33f) + centerX) - (org.telegram.messenger.i0.N(16.66f) * d), (org.telegram.messenger.i0.N(8.33f) + centerY) - (org.telegram.messenger.i0.N(16.66f) * d), paint2);
                        canvas.drawLine(org.telegram.messenger.i0.N(8.33f) + centerX, org.telegram.messenger.i0.N(8.33f) + centerY, (org.telegram.messenger.i0.N(8.33f) + centerX) - (org.telegram.messenger.i0.N(16.66f) * d), (org.telegram.messenger.i0.N(8.33f) + centerY) - (org.telegram.messenger.i0.N(16.66f) * d), paint);
                    }
                }
                canvas.restore();
                break;
            default:
                boolean z10 = this.f;
                if (z10) {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, org.telegram.messenger.zs.e4, 31);
                } else {
                    canvas.save();
                }
                canvas.translate(getBounds().centerX(), getBounds().centerY());
                canvas.drawPath(this.e, this.b);
                if (z10) {
                    canvas.drawLine(-org.telegram.messenger.i0.L(8.66f), -org.telegram.messenger.i0.L(8.66f), org.telegram.messenger.i0.L(8.66f), org.telegram.messenger.i0.L(8.66f), this.c);
                    canvas.drawLine(-org.telegram.messenger.i0.L(8.66f), -org.telegram.messenger.i0.L(8.66f), org.telegram.messenger.i0.L(8.66f), org.telegram.messenger.i0.L(8.66f), this.d);
                }
                canvas.restore();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return org.telegram.messenger.i0.L(24.0f);
            default:
                return org.telegram.messenger.i0.L(32.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return org.telegram.messenger.i0.L(24.0f);
            default:
                return org.telegram.messenger.i0.L(32.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(i10);
                this.c.setAlpha(i10);
                break;
            default:
                this.b.setAlpha(i10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                this.c.setColorFilter(colorFilter);
                this.b.setColorFilter(colorFilter);
                break;
            default:
                this.b.setColorFilter(colorFilter);
                break;
        }
    }

    public ob0(vh.r rVar, boolean z10) {
        vh.r rVar2 = rVar;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        this.d = new Paint(1);
        Path path = new Path();
        this.e = path;
        this.g = new float[8];
        this.f = z10;
        paint.setColor(-1);
        float N = org.telegram.messenger.i0.N(13.333333f);
        float N2 = org.telegram.messenger.i0.N(18.666666f);
        float N3 = org.telegram.messenger.i0.N(3.0f);
        float N4 = org.telegram.messenger.i0.N(10.0f);
        float N5 = org.telegram.messenger.i0.N(15.333333f);
        float N6 = org.telegram.messenger.i0.N(1.0f);
        float f7 = 1.33f;
        float N7 = org.telegram.messenger.i0.N(1.33f);
        path.setFillType(Path.FillType.EVEN_ODD);
        RectF rectF = org.telegram.messenger.i0.P;
        float f10 = 2.0f;
        rectF.set((-N) / 2.0f, (-N2) / 2.0f, N / 2.0f, N2 / 2.0f);
        path.addRoundRect(rectF, N3, N3, Path.Direction.CW);
        ArrayList arrayList = rVar2.e;
        int i10 = rVar2.c;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            int i13 = i12 + 1;
            vh.q qVar = (vh.q) obj;
            int[] iArr = rVar2.d;
            float f11 = f7;
            int i14 = qVar.c;
            int i15 = qVar.b;
            int i16 = iArr[i14];
            float f12 = f10;
            int i17 = i16 - 1;
            float max = (N4 - (Math.max(i11, i17) * N7)) / i16;
            int i18 = i10 - 1;
            int i19 = i11;
            float max2 = (N5 - (Math.max(i11, i18) * N7)) / i10;
            RectF rectF2 = org.telegram.messenger.i0.P;
            ArrayList arrayList2 = arrayList;
            float f13 = (-N4) / f12;
            int i20 = i10;
            float f14 = i15;
            float f15 = (max * f14) + f13;
            float f16 = f14 * N7;
            int i21 = size;
            float f17 = (-N5) / f12;
            float f18 = N4;
            float f19 = i14;
            float f20 = (max2 * f19) + f17;
            float f21 = f19 * N7;
            float f22 = N5;
            float f23 = f21 + f20;
            float f24 = N6;
            rectF2.set(f16 + f15, f23, sc.e.d(max, i15 + 1, f13, f16), sc.e.d(max2, i14 + 1, f17, f21));
            float[] fArr = (float[]) this.g;
            float f25 = 0.0f;
            float f26 = (i15 == 0 && i14 == 0) ? f24 : 0.0f;
            fArr[1] = f26;
            fArr[i19] = f26;
            float f27 = (i15 == i17 && i14 == 0) ? f24 : 0.0f;
            fArr[3] = f27;
            fArr[2] = f27;
            float f28 = (i15 == i17 && i14 == i18) ? f24 : 0.0f;
            fArr[5] = f28;
            fArr[4] = f28;
            if (i15 == 0 && i14 == i18) {
                f25 = f24;
            }
            fArr[7] = f25;
            fArr[6] = f25;
            this.e.addRoundRect(rectF2, fArr, Path.Direction.CW);
            rVar2 = rVar;
            f7 = f11;
            f10 = f12;
            i11 = i19;
            arrayList = arrayList2;
            i10 = i20;
            i12 = i13;
            size = i21;
            N4 = f18;
            N6 = f24;
            N5 = f22;
        }
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.c.setStrokeWidth(org.telegram.messenger.i0.L(3.33f));
        this.c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.d.setStyle(style);
        this.d.setStrokeWidth(org.telegram.messenger.i0.L(f7));
        this.d.setColor(-1);
        this.d.setStrokeCap(Paint.Cap.ROUND);
        this.d.setStrokeJoin(Paint.Join.ROUND);
    }
}
