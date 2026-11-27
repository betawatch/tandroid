// default package

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class il0 {
    public int d;
    public boolean e;
    public int f;
    public float i;
    public float j;
    public float o;
    public float p;
    public float q;
    public float r;
    public float t;
    public float u;
    public float v;
    public float w;
    public long x;
    public final Rect a = new Rect();
    public final float[] b = new float[8];
    public final float[] c = new float[8];
    public float g = 0.75f;
    public final float h = 1.5f;
    public final Path k = new Path();
    public boolean l = true;
    public final Rect m = new Rect();
    public int n = -1;
    public final RectF s = new RectF();
    public final Matrix y = new Matrix();
    public final RectF z = new RectF();
    public final float[] A = new float[4];

    public static long f(int i, long j) {
        return (j ^ i) * 1099511628211L;
    }

    public final void a() {
        Path path;
        float width;
        float height;
        float[] fArr;
        float f;
        float f2;
        float f3;
        float[] fArr2 = this.b;
        this.l = zwe.a(fArr2);
        Rect rect = this.a;
        Rect rect2 = this.m;
        rect2.set(rect);
        int i = this.d;
        rect2.inset(i, i);
        RectF rectF = this.s;
        rectF.set(rect2);
        Path path2 = this.k;
        path2.rewind();
        if (e()) {
            int i2 = this.n;
            boolean z = i2 == 0 || i2 == 2;
            if (i2 == 0) {
                rectF.left += this.p;
            } else if (i2 == 1) {
                rectF.top += this.p;
            } else if (i2 != 2) {
                rectF.bottom -= this.p;
            } else {
                rectF.right -= this.p;
            }
            if (z) {
                width = rectF.height();
                height = rectF.width();
            } else {
                width = rectF.width();
                height = rectF.height();
            }
            int i3 = this.n;
            int i4 = i3 != 0 ? i3 != 1 ? i3 != 2 ? 2 : 1 : 0 : 3;
            float f4 = 2.0f;
            float max = Math.max(0.0f, Math.min(width, height) / 2.0f);
            int i5 = 0;
            while (true) {
                fArr = this.A;
                f = f4;
                if (i5 >= 4) {
                    break;
                }
                fArr[i5] = Math.min(fArr2[((i4 + i5) % 4) << 1], max);
                i5++;
                f4 = f;
            }
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[2];
            float f8 = fArr[3];
            float f9 = this.p;
            float min = Math.min(this.q, f9);
            float f10 = this.r;
            float v = uh9.v(min, f10, 0.41421354f, f9);
            this.u = v;
            float f11 = width;
            int i6 = this.n;
            if (i6 == 0) {
                f2 = rectF.bottom;
                f3 = this.o;
            } else if (i6 == 1) {
                f2 = this.o;
                f3 = rectF.left;
            } else if (i6 != 2) {
                f2 = rectF.right;
                f3 = this.o;
            } else {
                f2 = this.o;
                f3 = rectF.top;
            }
            float f12 = f2 - f3;
            float f13 = f5 + v;
            float f14 = f11 - f6;
            float f15 = f14 - v;
            float a = f13 <= f15 ? ete.a(f12, f13, f15) : f11 / f;
            this.t = a;
            this.v = a - f5;
            this.w = f14 - a;
            path2.moveTo(f5, 0.0f);
            float f16 = this.u;
            float f17 = a - f16;
            float f18 = a;
            float f19 = f10 * (-2.0f);
            RectF rectF2 = this.z;
            float f20 = height;
            rectF2.set(f17 - f10, f19, f17 + f10, 0.0f);
            path2.arcTo(rectF2, 90.0f, -45.0f, false);
            float f21 = -f9;
            rectF2.set(f18 - min, f21, f18 + min, (min * f) + f21);
            path2.arcTo(rectF2, 225.0f, 90.0f, false);
            float f22 = f18 + f16;
            rectF2.set(f22 - f10, f19, f22 + f10, 0.0f);
            path2.arcTo(rectF2, 135.0f, -45.0f, false);
            b(f11 - (f6 * f), 0.0f, f6, 270.0f);
            float f23 = f7 * f;
            b(f11 - f23, f20 - f23, f7, 0.0f);
            b(0.0f, f20 - (f8 * f), f8, 90.0f);
            b(0.0f, 0.0f, f5, 180.0f);
            int i7 = this.n;
            Matrix matrix = this.y;
            if (i7 == 0) {
                matrix.setRotate(-90.0f);
                matrix.postTranslate(rectF.left, rectF.bottom);
            } else if (i7 == 1) {
                matrix.setTranslate(rectF.left, rectF.top);
            } else if (i7 != 2) {
                matrix.setRotate(180.0f);
                matrix.postTranslate(rectF.right, rectF.bottom);
            } else {
                matrix.setRotate(90.0f);
                matrix.postTranslate(rectF.right, rectF.top);
            }
            path2.transform(matrix);
            long f24 = f(Math.round(f10 * 4.0f), f(Math.round(min * 4.0f), f(Math.round(f9 * 4.0f), f(Math.round(f18 * 4.0f), f(Math.round(f20 * 4.0f), f(Math.round(f11 * 4.0f), f(this.n, -3750763034362895579L)))))));
            for (float f25 : fArr) {
                f24 = f(Math.round(f25 * 4.0f), f24);
            }
            this.x = f(Math.round((rectF.top - rect2.top) * 4.0f), f(Math.round((rectF.left - rect2.left) * 4.0f), f24));
            path = path2;
        } else {
            path = path2;
            path.addRoundRect(rect2.left, rect2.top, rect2.right, rect2.bottom, fArr2, Path.Direction.CW);
        }
        path.close();
    }

    public final void b(float f, float f2, float f3, float f4) {
        Path path = this.k;
        if (f3 <= 0.0f) {
            path.lineTo(f, f2);
            return;
        }
        float f5 = f3 * 2.0f;
        RectF rectF = this.z;
        rectF.set(f, f2, f + f5, f5 + f2);
        path.arcTo(rectF, f4, 90.0f, false);
    }

    public final void c(Canvas canvas, Paint paint) {
        if (!this.l || e()) {
            canvas.drawPath(this.k, paint);
            return;
        }
        Rect rect = this.m;
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        float f5 = this.b[0];
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, paint);
    }

    public final void d(Canvas canvas, Paint paint, boolean z) {
        if (!z || e()) {
            c(canvas, paint);
            return;
        }
        Rect rect = this.m;
        float f = rect.top;
        float[] fArr = this.b;
        float a = ete.a((fArr[0] * 2.0f) + f, f, rect.bottom);
        canvas.save();
        Rect rect2 = this.a;
        canvas.clipRect(rect2.left, rect2.top, rect2.right, a);
        float f2 = rect.left;
        float f3 = rect.top;
        float f4 = rect.right;
        float f5 = fArr[0];
        canvas.drawRoundRect(f2, f3, f4, a, f5, f5, paint);
        canvas.restore();
    }

    public final boolean e() {
        return this.n != -1 && this.p > 0.0f;
    }
}
