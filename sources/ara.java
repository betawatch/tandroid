// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ara {
    public long a;
    public final int b;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public int m;
    public float n;
    public long o;
    public float p;
    public float q;
    public float r;
    public final /* synthetic */ bra t;
    public float c = 1.0f;
    public boolean s = true;

    public ara(bra braVar) {
        this.t = braVar;
        int i = braVar.S;
        braVar.S = i + 1;
        this.b = i;
    }

    public final void a(Canvas canvas, long j, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        bra braVar = this.t;
        boolean z = braVar.G;
        RectF rectF = braVar.c;
        float f6 = braVar.A;
        if (z) {
            int[] iArr = braVar.E;
            int i = this.l;
            int i2 = iArr[i];
            float[] fArr = braVar.D[i];
            int i3 = i2 << 1;
            this.h = fArr[i3];
            this.i = fArr[i3 + 1];
            iArr[i] = i2 + 1;
        } else {
            this.h = this.d;
            this.i = this.e;
        }
        if (rectF.isEmpty() || !rectF.contains(this.h, this.i)) {
            canvas.save();
            canvas.translate(this.h, this.i);
            float f7 = this.n;
            if (f7 != 0.0f) {
                f3 = 1000.0f;
                f2 = 2.0f;
                canvas.rotate(f7, braVar.d[this.l].getWidth() / 2.0f, braVar.d[this.l].getHeight() / 2.0f);
            } else {
                f2 = 2.0f;
                f3 = 1000.0f;
            }
            long j2 = this.a - j;
            float i4 = j2 < 200 ? Utilities.i(1.0f - (j2 / 150.0f), 1.0f, 0.0f) : 0.0f;
            float f8 = this.q;
            if (f8 < 1.0f || vq4.a != 1.0f) {
                float interpolation = gl.H.getInterpolation(f8) * vq4.a;
                canvas.scale(interpolation, interpolation, 0.0f, 0.0f);
            }
            if (braVar.f[this.l]) {
                float min = (Math.min(braVar.o, 3.5f) * (f6 / f3)) + this.r;
                this.r = min;
                canvas.scale((float) Math.cos(min * 3.141592653589793d), 1.0f, 0.0f, 0.0f);
            }
            q8c q8cVar = braVar.l;
            Paint paint = q8cVar != null ? (Paint) q8cVar.a(Integer.valueOf(this.b)) : braVar.i;
            if (braVar.M) {
                f4 = f6;
                long j3 = this.o;
                float i5 = 1.0f - Utilities.i((j - j3) / Math.max(1L, this.a - j3), 1.0f, 0.0f);
                f5 = yjb.z((float) Math.sin((j * 0.011f) + this.p), 0.28f, 0.72f, yjb.B(i5, f2, 3.0f, i5 * i5));
                i4 = 0.0f;
            } else {
                f4 = f6;
                f5 = 1.0f;
            }
            float f9 = 1.0f - i4;
            paint.setAlpha((int) yjb.C(this.m, f9, f, f5));
            Bitmap bitmap = braVar.d[this.l];
            if (braVar.m) {
                float f10 = this.c * f9 * f * this.q * (braVar.M ? 0.75f + (f5 * 0.25f) : 1.0f);
                canvas.scale(f10, f10);
            }
            canvas.drawBitmap(bitmap, -(bitmap.getWidth() >> 1), -(bitmap.getHeight() >> 1), paint);
            canvas.restore();
        } else {
            f4 = f6;
            f3 = 1000.0f;
        }
        if (braVar.g) {
            return;
        }
        float L = (f4 / 660.0f) * gl.L(4.0f);
        boolean z2 = braVar.f[this.l];
        float f11 = braVar.o;
        float min2 = z2 ? Math.min(f11, 3.5f) * 4.0f * L : L * f11;
        if (braVar.M) {
            long j4 = this.o;
            float i6 = 1.0f - Utilities.i((j - j4) / Math.max(1L, this.a - j4), 1.0f, 0.0f);
            min2 *= (2.2f * i6 * i6) + 0.15f;
            this.e = de9.x(f4, f3, gl.L(5.0f), this.e);
        }
        this.d = (this.j * min2) + this.d;
        this.e = (this.k * min2) + this.e;
        float f12 = this.q;
        if (f12 != 1.0f) {
            float f13 = (f4 / 200.0f) + f12;
            this.q = f13;
            if (f13 > 1.0f) {
                this.q = 1.0f;
            }
        }
    }

    public final void b(long j) {
        yyc yycVar;
        int abs;
        float f;
        float f2;
        float f3;
        yyc yycVar2;
        int i;
        float f4;
        float f5;
        float f6;
        bra braVar = this.t;
        int i2 = braVar.N;
        ArrayList arrayList = braVar.n;
        RectF rectF = braVar.a;
        if (i2 == 28) {
            yycVar = Utilities.c;
            if (yycVar.nextFloat() < 0.13f) {
                this.l = 0;
                abs = 0;
            } else {
                abs = (int) Math.floor((r7 * (braVar.d.length - 2)) + 1.0f);
                this.l = abs;
            }
        } else {
            yycVar = Utilities.c;
            abs = Math.abs(((int) yycVar.nextLong()) % braVar.d.length);
            this.l = abs;
        }
        this.a = yycVar.nextInt(braVar.y * (braVar.f[abs] ? (short) 3 : (short) 1)) + braVar.x + j;
        this.o = j;
        this.p = yycVar.nextFloat() * 6.28f;
        float f7 = 0.0f;
        this.n = 0.0f;
        float f8 = 0.6f;
        if (braVar.m) {
            this.c = (yycVar.nextFloat() * 0.6f) + 0.4f;
        }
        if (braVar.B) {
            float abs2 = Math.abs(((int) yycVar.nextLong()) % rectF.width()) + rectF.left;
            float abs3 = Math.abs(((int) yycVar.nextLong()) % rectF.height()) + rectF.top;
            float f9 = 0.0f;
            int i3 = 0;
            while (i3 < 10) {
                float f10 = rectF.left;
                yyc yycVar3 = Utilities.c;
                float f11 = f7;
                int i4 = i3;
                float abs4 = Math.abs(((int) yycVar3.nextLong()) % rectF.width()) + f10;
                float abs5 = Math.abs(((int) yycVar3.nextLong()) % rectF.height()) + rectF.top;
                float f12 = 2.1474836E9f;
                int i5 = 0;
                while (i5 < arrayList.size()) {
                    if (braVar.h) {
                        f5 = ((ara) arrayList.get(i5)).f - abs4;
                        f4 = f8;
                        f6 = ((ara) arrayList.get(i5)).g;
                    } else {
                        f4 = f8;
                        f5 = ((ara) arrayList.get(i5)).d - abs4;
                        f6 = ((ara) arrayList.get(i5)).e;
                    }
                    float f13 = f6 - abs5;
                    float f14 = (f13 * f13) + (f5 * f5);
                    if (f14 < f12) {
                        f12 = f14;
                    }
                    i5++;
                    f8 = f4;
                }
                float f15 = f8;
                if (f12 > f9) {
                    abs2 = abs4;
                    f9 = f12;
                    abs3 = abs5;
                }
                i3 = i4 + 1;
                f7 = f11;
                f8 = f15;
            }
            f = f7;
            f2 = f8;
            this.d = abs2;
            this.e = abs3;
        } else {
            f = 0.0f;
            f2 = 0.6f;
            if (braVar.I) {
                float width = rectF.width();
                float f16 = braVar.j;
                float A = tb4.A(width, f16, Math.abs(((int) yycVar.nextLong()) % 1000) / 1000.0f, f16);
                float abs6 = Math.abs(((int) yycVar.nextLong()) % 360);
                if (!braVar.f[this.l] || this.s) {
                    f3 = 0.0f;
                } else {
                    A = Math.min(A, gl.L(10.0f));
                    f3 = gl.L(30.0f) + 0.0f;
                }
                double d = A;
                double d2 = abs6;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d2)) * d));
                this.e = rectF.centerY() + f3 + braVar.k + ((float) (Math.cos(Math.toRadians(d2)) * d));
            } else {
                this.d = Math.abs(((int) yycVar.nextLong()) % rectF.width()) + rectF.left;
                this.e = Math.abs(((int) yycVar.nextLong()) % rectF.height()) + rectF.top;
            }
        }
        if (braVar.f[this.l]) {
            this.r = Math.abs(Utilities.c.nextFloat() * 2.0f);
        }
        double radians = braVar.f[this.l] ? Math.toRadians(280.0f - (Utilities.c.nextFloat() * 200.0f)) : braVar.h ? Utilities.c.nextDouble() * 3.141592653589793d * 2.0d : Math.atan2(this.e - (rectF.centerY() + braVar.k), this.d - (rectF.centerX() + f));
        this.j = (float) Math.cos(radians);
        this.k = (float) Math.sin(radians);
        if (braVar.e[this.l]) {
            yycVar2 = Utilities.c;
            this.m = (int) (((yycVar2.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            yycVar2 = Utilities.c;
            this.m = (int) (((yycVar2.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i6 = braVar.N;
        if ((i6 == 6 && ((i = this.l) == 1 || i == 2)) || i6 == 9 || i6 == 3 || i6 == 7 || i6 == 24 || i6 == 11 || i6 == 22 || i6 == 4) {
            this.n = (int) (((((int) yycVar2.nextLong()) % 100) / 100.0f) * 45.0f);
        }
        if (braVar.N != 101) {
            this.q = f;
        }
        if (braVar.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((yycVar2.nextFloat() * 1.2f) + f2)) / 2.0f;
            float cos = (((float) Math.cos(radians)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f = cos;
            float sin = (((float) Math.sin(radians)) * min) + rectF.centerY() + braVar.k;
            this.e = sin;
            this.g = sin;
        }
        this.s = false;
    }
}
