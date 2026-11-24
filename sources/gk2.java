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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class gk2 extends Drawable {
    public final /* synthetic */ byte a = 1;
    public final Path b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public boolean f;
    public final Object g;

    public gk2(fk2 fk2Var, boolean z) {
        fk2 fk2Var2 = fk2Var;
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
        float N = gl.N(13.333333f);
        float N2 = gl.N(18.666666f);
        float N3 = gl.N(3.0f);
        float N4 = gl.N(10.0f);
        float N5 = gl.N(15.333333f);
        float N6 = gl.N(1.0f);
        float f = 1.33f;
        float N7 = gl.N(1.33f);
        path.setFillType(Path.FillType.EVEN_ODD);
        RectF rectF = gl.P;
        rectF.set((-N) / 2.0f, (-N2) / 2.0f, N / 2.0f, N2 / 2.0f);
        path.addRoundRect(rectF, N3, N3, Path.Direction.CW);
        ArrayList arrayList = fk2Var2.e;
        int i2 = fk2Var2.c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            int i4 = i3 + 1;
            ek2 ek2Var = (ek2) obj;
            int[] iArr = fk2Var2.d;
            int i5 = ek2Var.c;
            int i6 = ek2Var.b;
            int i7 = iArr[i5];
            float f2 = f;
            int i8 = i7 - 1;
            float max = (N4 - (Math.max(i, i8) * N7)) / i7;
            int i9 = i2 - 1;
            int i10 = i;
            float max2 = (N5 - (Math.max(i, i9) * N7)) / i2;
            RectF rectF2 = gl.P;
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
            rectF2.set(f6 + f5, f13, ir2.i(max, i6 + 1, f3, f6), ir2.i(max2, i5 + 1, f7, f11));
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
            fk2Var2 = fk2Var;
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
        this.d.setStrokeWidth(gl.L(3.33f));
        this.d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e.setStyle(style);
        this.e.setStrokeWidth(gl.L(f));
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
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, kk7.d4, 31);
                } else {
                    canvas.save();
                }
                canvas.translate(getBounds().centerX(), getBounds().centerY());
                canvas.drawPath(path, this.c);
                if (z) {
                    canvas.drawLine(-gl.L(8.66f), -gl.L(8.66f), gl.L(8.66f), gl.L(8.66f), this.d);
                    canvas.drawLine(-gl.L(8.66f), -gl.L(8.66f), gl.L(8.66f), gl.L(8.66f), this.e);
                }
                canvas.restore();
                break;
            default:
                float N = gl.N(1.66f);
                Paint paint = this.c;
                paint.setStrokeWidth(N);
                float N2 = gl.N(3.32f);
                Paint paint2 = this.e;
                paint2.setStrokeWidth(N2);
                float d = ((lm) this.g).d(this.f);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float N3 = gl.N(10.66f);
                RectF rectF = gl.P;
                rectF.set(centerX - N3, centerY - N3, centerX + N3, N3 + centerY);
                canvas.drawRoundRect(rectF, gl.N(8.33f), gl.N(8.33f), paint);
                if (d > 0.0f) {
                    canvas.saveLayerAlpha(rectF, kk7.d4, 31);
                } else {
                    canvas.save();
                }
                canvas.save();
                canvas.translate(gl.N(1.0f) + centerX, centerY - gl.N(0.5f));
                canvas.drawPath(path, this.d);
                canvas.restore();
                if (d > 0.0f) {
                    if (this.f) {
                        canvas.drawLine(centerX - gl.N(8.33f), centerY - gl.N(8.33f), oo1.e(16.66f, d, centerX - gl.N(8.33f)), oo1.e(16.66f, d, centerY - gl.N(8.33f)), paint2);
                        canvas.drawLine(centerX - gl.N(8.33f), centerY - gl.N(8.33f), oo1.e(16.66f, d, centerX - gl.N(8.33f)), oo1.e(16.66f, d, centerY - gl.N(8.33f)), paint);
                    } else {
                        canvas.drawLine(gl.N(8.33f) + centerX, gl.N(8.33f) + centerY, (gl.N(8.33f) + centerX) - (gl.N(16.66f) * d), (gl.N(8.33f) + centerY) - (gl.N(16.66f) * d), paint2);
                        canvas.drawLine(gl.N(8.33f) + centerX, gl.N(8.33f) + centerY, (gl.N(8.33f) + centerX) - (gl.N(16.66f) * d), (gl.N(8.33f) + centerY) - (gl.N(16.66f) * d), paint);
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
                return gl.L(32.0f);
            default:
                return gl.L(24.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return gl.L(32.0f);
            default:
                return gl.L(24.0f);
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

    public gk2() {
        Path path = new Path();
        this.b = path;
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.g = new lm(new vl6(this, (byte) 18), 320L, s33.h, 0);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(-1);
        paint2.setPathEffect(new CornerPathEffect(gl.N(2.0f)));
        paint2.setColor(-1);
        paint3.setStyle(style);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        path.moveTo(-gl.N(3.75f), -gl.N(5.4166f));
        path.lineTo(gl.N(3.75f), 0.0f);
        path.lineTo(-gl.N(3.75f), gl.N(5.4166f));
        path.close();
    }
}
