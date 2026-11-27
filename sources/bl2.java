// default package

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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class bl2 extends Drawable {
    public final /* synthetic */ byte a = 1;
    public final Path b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public boolean f;
    public final Object g;

    public bl2(al2 al2Var, boolean z) {
        al2 al2Var2 = al2Var;
        int i = 0;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint(1);
        this.e = new Paint(1);
        Path path = new Path();
        this.b = path;
        this.g = new float[8];
        this.f = z;
        paint.setColor(-1);
        float N = hl.N(13.333333f);
        float N2 = hl.N(18.666666f);
        float N3 = hl.N(3.0f);
        float N4 = hl.N(10.0f);
        float N5 = hl.N(15.333333f);
        float N6 = hl.N(1.0f);
        float f = 1.33f;
        float N7 = hl.N(1.33f);
        path.setFillType(Path.FillType.EVEN_ODD);
        RectF rectF = hl.P;
        rectF.set((-N) / 2.0f, (-N2) / 2.0f, N / 2.0f, N2 / 2.0f);
        path.addRoundRect(rectF, N3, N3, Path.Direction.CW);
        ArrayList arrayList = al2Var2.e;
        int i2 = al2Var2.c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            int i4 = i3 + 1;
            zk2 zk2Var = (zk2) obj;
            int[] iArr = al2Var2.d;
            int i5 = zk2Var.c;
            int i6 = zk2Var.b;
            int i7 = iArr[i5];
            float f2 = f;
            int i8 = i7 - 1;
            float max = (N4 - (Math.max(i, i8) * N7)) / i7;
            int i9 = i2 - 1;
            int i10 = i;
            float max2 = (N5 - (Math.max(i, i9) * N7)) / i2;
            RectF rectF2 = hl.P;
            ArrayList arrayList2 = arrayList;
            float f3 = (-N4) / 2.0f;
            int i11 = i2;
            float f4 = i6;
            float f5 = (max * f4) + f3;
            float f6 = f4 * N7;
            int i12 = size;
            float f7 = (-N5) / 2.0f;
            float f8 = N4;
            float f9 = i5;
            float f10 = (max2 * f9) + f7;
            float f11 = f9 * N7;
            float f12 = N5;
            float f13 = f11 + f10;
            float f14 = N6;
            rectF2.set(f6 + f5, f13, bs2.i(max, i6 + 1, f3, f6), bs2.i(max2, i5 + 1, f7, f11));
            float[] fArr = (float[]) this.g;
            float f15 = 0.0f;
            float f16 = (i6 == 0 && i5 == 0) ? f14 : 0.0f;
            fArr[1] = f16;
            fArr[i10] = f16;
            float f17 = (i6 == i8 && i5 == 0) ? f14 : 0.0f;
            fArr[3] = f17;
            fArr[2] = f17;
            float f18 = (i6 == i8 && i5 == i9) ? f14 : 0.0f;
            fArr[5] = f18;
            fArr[4] = f18;
            if (i6 == 0 && i5 == i9) {
                f15 = f14;
            }
            fArr[7] = f15;
            fArr[6] = f15;
            this.b.addRoundRect(rectF2, fArr, Path.Direction.CW);
            al2Var2 = al2Var;
            f = f2;
            i = i10;
            arrayList = arrayList2;
            i2 = i11;
            i3 = i4;
            size = i12;
            N4 = f8;
            N6 = f14;
            N5 = f12;
        }
        Paint paint2 = this.d;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.d.setStrokeWidth(hl.L(3.33f));
        this.d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e.setStyle(style);
        this.e.setStrokeWidth(hl.L(f));
        this.e.setColor(-1);
        this.e.setStrokeCap(Paint.Cap.ROUND);
        this.e.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        Path path = this.b;
        switch (b) {
            case 0:
                boolean z = this.f;
                if (z) {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, jn7.d4, 31);
                } else {
                    canvas.save();
                }
                canvas.translate(getBounds().centerX(), getBounds().centerY());
                canvas.drawPath(path, this.c);
                if (z) {
                    canvas.drawLine(-hl.L(8.66f), -hl.L(8.66f), hl.L(8.66f), hl.L(8.66f), this.d);
                    canvas.drawLine(-hl.L(8.66f), -hl.L(8.66f), hl.L(8.66f), hl.L(8.66f), this.e);
                }
                canvas.restore();
                break;
            default:
                float N = hl.N(1.66f);
                Paint paint = this.c;
                paint.setStrokeWidth(N);
                float N2 = hl.N(3.32f);
                Paint paint2 = this.e;
                paint2.setStrokeWidth(N2);
                float d = ((mm) this.g).d(this.f);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float N3 = hl.N(10.66f);
                RectF rectF = hl.P;
                rectF.set(centerX - N3, centerY - N3, centerX + N3, N3 + centerY);
                canvas.drawRoundRect(rectF, hl.N(8.33f), hl.N(8.33f), paint);
                if (d > 0.0f) {
                    canvas.saveLayerAlpha(rectF, jn7.d4, 31);
                } else {
                    canvas.save();
                }
                canvas.save();
                canvas.translate(hl.N(1.0f) + centerX, centerY - hl.N(0.5f));
                canvas.drawPath(path, this.d);
                canvas.restore();
                if (d > 0.0f) {
                    if (this.f) {
                        canvas.drawLine(centerX - hl.N(8.33f), centerY - hl.N(8.33f), bp1.e(16.66f, d, centerX - hl.N(8.33f)), bp1.e(16.66f, d, centerY - hl.N(8.33f)), paint2);
                        canvas.drawLine(centerX - hl.N(8.33f), centerY - hl.N(8.33f), bp1.e(16.66f, d, centerX - hl.N(8.33f)), bp1.e(16.66f, d, centerY - hl.N(8.33f)), paint);
                    } else {
                        canvas.drawLine(hl.N(8.33f) + centerX, hl.N(8.33f) + centerY, (hl.N(8.33f) + centerX) - (hl.N(16.66f) * d), (hl.N(8.33f) + centerY) - (hl.N(16.66f) * d), paint2);
                        canvas.drawLine(hl.N(8.33f) + centerX, hl.N(8.33f) + centerY, (hl.N(8.33f) + centerX) - (hl.N(16.66f) * d), (hl.N(8.33f) + centerY) - (hl.N(16.66f) * d), paint);
                    }
                }
                canvas.restore();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return hl.L(32.0f);
            default:
                return hl.L(24.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return hl.L(32.0f);
            default:
                return hl.L(24.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        byte b = this.a;
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                this.c.setAlpha(i);
                break;
            default:
                this.c.setAlpha(i);
                this.d.setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                this.c.setColorFilter(colorFilter);
                break;
            default:
                this.d.setColorFilter(colorFilter);
                this.c.setColorFilter(colorFilter);
                break;
        }
    }

    public bl2() {
        Path path = new Path();
        this.b = path;
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.g = new mm(new ge7(this, (byte) 1), 320L, k43.h, 0);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(-1);
        paint2.setPathEffect(new CornerPathEffect(hl.N(2.0f)));
        paint2.setColor(-1);
        paint3.setStyle(style);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        path.moveTo(-hl.N(3.75f), -hl.N(5.4166f));
        path.lineTo(hl.N(3.75f), 0.0f);
        path.lineTo(-hl.N(3.75f), hl.N(5.4166f));
        path.close();
    }
}
