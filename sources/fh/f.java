package fh;

import a8.m7;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import c8.j9;
import org.telegram.messenger.camera.q;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class f {
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

    public static long f(int i7, long j3) {
        return (j3 ^ i7) * 1099511628211L;
    }

    public final void a() {
        float f10;
        float[] fArr;
        float f11;
        float f12;
        float f13;
        float[] fArr2 = this.b;
        this.l = m7.a(fArr2);
        Rect rect = this.a;
        Rect rect2 = this.m;
        rect2.set(rect);
        int i7 = this.d;
        rect2.inset(i7, i7);
        RectF rectF = this.s;
        rectF.set(rect2);
        Path path = this.k;
        path.rewind();
        if (e()) {
            int i10 = this.n;
            boolean z9 = i10 == 0 || i10 == 2;
            if (i10 == 0) {
                rectF.left += this.p;
            } else if (i10 == 1) {
                rectF.top += this.p;
            } else if (i10 != 2) {
                rectF.bottom -= this.p;
            } else {
                rectF.right -= this.p;
            }
            float height = z9 ? rectF.height() : rectF.width();
            float width = z9 ? rectF.width() : rectF.height();
            int i11 = this.n;
            int i12 = i11 != 0 ? i11 != 1 ? i11 != 2 ? 2 : 1 : 0 : 3;
            float f14 = 2.0f;
            float max = Math.max(0.0f, Math.min(height, width) / 2.0f);
            int i13 = 0;
            while (true) {
                f10 = f14;
                fArr = this.A;
                if (i13 >= 4) {
                    break;
                }
                fArr[i13] = Math.min(fArr2[((i12 + i13) % 4) * 2], max);
                i13++;
                f14 = f10;
            }
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[2];
            float f18 = fArr[3];
            float f19 = this.p;
            float min = Math.min(this.q, f19);
            float f20 = this.r;
            Math.sqrt(0.5d);
            float b10 = q.b(min, f20, ((float) Math.sqrt(2.0d)) - 1.0f, f19);
            this.u = b10;
            int i14 = this.n;
            if (i14 != 0) {
                f11 = height;
                if (i14 == 1) {
                    f12 = this.o;
                    f13 = rectF.left;
                } else if (i14 != 2) {
                    f12 = rectF.right;
                    f13 = this.o;
                } else {
                    f12 = this.o;
                    f13 = rectF.top;
                }
            } else {
                f11 = height;
                f12 = rectF.bottom;
                f13 = this.o;
            }
            float f21 = f12 - f13;
            float f22 = f15 + b10;
            float f23 = f11 - f16;
            float f24 = f23 - b10;
            float a10 = f22 <= f24 ? j9.a(f21, f22, f24) : f11 / f10;
            this.t = a10;
            this.v = a10 - f15;
            this.w = f23 - a10;
            path.moveTo(f15, 0.0f);
            float f25 = this.u;
            float f26 = a10 - f25;
            float f27 = a10;
            float f28 = f20 * (-2.0f);
            RectF rectF2 = this.z;
            float f29 = width;
            rectF2.set(f26 - f20, f28, f26 + f20, 0.0f);
            path.arcTo(rectF2, 90.0f, -45.0f, false);
            float f30 = f27 - min;
            float f31 = -f19;
            rectF2.set(f30, f31, f27 + min, (min * f10) + f31);
            path.arcTo(rectF2, 225.0f, 90.0f, false);
            float f32 = f27 + f25;
            rectF2.set(f32 - f20, f28, f32 + f20, 0.0f);
            path.arcTo(rectF2, 135.0f, -45.0f, false);
            b(f11 - (f16 * f10), 0.0f, f16, 270.0f);
            float f33 = f17 * f10;
            b(f11 - f33, f29 - f33, f17, 0.0f);
            b(0.0f, f29 - (f18 * f10), f18, 90.0f);
            b(0.0f, 0.0f, f15, 180.0f);
            int i15 = this.n;
            Matrix matrix = this.y;
            if (i15 == 0) {
                matrix.setRotate(-90.0f);
                matrix.postTranslate(rectF.left, rectF.bottom);
            } else if (i15 == 1) {
                matrix.setTranslate(rectF.left, rectF.top);
            } else if (i15 != 2) {
                matrix.setRotate(180.0f);
                matrix.postTranslate(rectF.right, rectF.bottom);
            } else {
                matrix.setRotate(90.0f);
                matrix.postTranslate(rectF.right, rectF.top);
            }
            path.transform(matrix);
            long f34 = f(Math.round(f20 * 4.0f), f(Math.round(min * 4.0f), f(Math.round(f19 * 4.0f), f(Math.round(f27 * 4.0f), f(Math.round(f29 * 4.0f), f(Math.round(f11 * 4.0f), f(this.n, -3750763034362895579L)))))));
            for (float f35 : fArr) {
                f34 = f(Math.round(f35 * 4.0f), f34);
            }
            this.x = f(Math.round((rectF.top - rect2.top) * 4.0f), f(Math.round((rectF.left - rect2.left) * 4.0f), f34));
        } else {
            path.addRoundRect(rect2.left, rect2.top, rect2.right, rect2.bottom, this.b, Path.Direction.CW);
        }
        path.close();
    }

    public final void b(float f10, float f11, float f12, float f13) {
        Path path = this.k;
        if (f12 <= 0.0f) {
            path.lineTo(f10, f11);
            return;
        }
        float f14 = f12 * 2.0f;
        RectF rectF = this.z;
        rectF.set(f10, f11, f10 + f14, f14 + f11);
        path.arcTo(rectF, f13, 90.0f, false);
    }

    public final void c(Canvas canvas, Paint paint) {
        if (!this.l || e()) {
            canvas.drawPath(this.k, paint);
            return;
        }
        Rect rect = this.m;
        float f10 = rect.left;
        float f11 = rect.top;
        float f12 = rect.right;
        float f13 = rect.bottom;
        float f14 = this.b[0];
        canvas.drawRoundRect(f10, f11, f12, f13, f14, f14, paint);
    }

    public final void d(Canvas canvas, Paint paint, boolean z9) {
        if (!z9 || e()) {
            c(canvas, paint);
            return;
        }
        Rect rect = this.m;
        float f10 = rect.top;
        float[] fArr = this.b;
        float a10 = j9.a((fArr[0] * 2.0f) + f10, f10, rect.bottom);
        canvas.save();
        Rect rect2 = this.a;
        canvas.clipRect(rect2.left, rect2.top, rect2.right, a10);
        float f11 = rect.left;
        float f12 = rect.top;
        float f13 = rect.right;
        float f14 = fArr[0];
        canvas.drawRoundRect(f11, f12, f13, a10, f14, f14, paint);
        canvas.restore();
    }

    public final boolean e() {
        return this.n != -1 && this.p > 0.0f;
    }
}
