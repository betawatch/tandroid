package kg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.r20;
import org.telegram.messenger.z20;
import org.telegram.ui.j10;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e2 {
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
    public final /* synthetic */ f2 t;
    public float c = 1.0f;
    public boolean s = true;

    public e2(f2 f2Var) {
        this.t = f2Var;
        int i10 = f2Var.T;
        f2Var.T = i10 + 1;
        this.b = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, float f7) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        f2 f2Var = this.t;
        boolean z10 = f2Var.G;
        RectF rectF = f2Var.c;
        float f16 = f2Var.A;
        if (z10) {
            int[] iArr = f2Var.E;
            int i10 = this.l;
            int i11 = iArr[i10];
            float[] fArr = f2Var.D[i10];
            int i12 = i11 * 2;
            this.h = fArr[i12];
            this.i = fArr[i12 + 1];
            iArr[i10] = i11 + 1;
        } else {
            this.h = this.d;
            this.i = this.e;
        }
        if (rectF.isEmpty() || !rectF.contains(this.h, this.i)) {
            canvas.save();
            canvas.translate(this.h, this.i);
            float f17 = this.n;
            if (f17 != 0.0f) {
                f11 = 1000.0f;
                f10 = 2.0f;
                canvas.rotate(f17, f2Var.d[this.l].getWidth() / 2.0f, f2Var.d[this.l].getHeight() / 2.0f);
            } else {
                f10 = 2.0f;
                f11 = 1000.0f;
            }
            if (f2Var.I) {
                long j11 = this.a - j10;
                if (j11 < 200) {
                    f12 = Utilities.i(1.0f - (j11 / 150.0f), 1.0f, 0.0f);
                    f13 = this.q;
                    if (f13 >= 1.0f || j10.a != 1.0f) {
                        float interpolation = org.telegram.messenger.i0.H.getInterpolation(f13) * j10.a;
                        canvas.scale(interpolation, interpolation, 0.0f, 0.0f);
                    }
                    if (f2Var.f[this.l]) {
                        float min = (Math.min(f2Var.o, 3.5f) * (f16 / f11)) + this.r;
                        this.r = min;
                        canvas.scale((float) Math.cos(min * 3.141592653589793d), 1.0f, 0.0f, 0.0f);
                    }
                    r20 r20Var = f2Var.l;
                    Paint paint = r20Var == null ? (Paint) r20Var.a(Integer.valueOf(this.b)) : f2Var.i;
                    if (f2Var.N) {
                        f14 = f16;
                        f15 = 1.0f;
                    } else {
                        f14 = f16;
                        long j12 = this.o;
                        float i13 = 1.0f - Utilities.i((j10 - j12) / Math.max(1L, this.a - j12), 1.0f, 0.0f);
                        f15 = c3.i0.C((float) Math.sin((j10 * 0.011f) + this.p), 0.28f, 0.72f, c3.i0.D(i13, f10, 3.0f, i13 * i13));
                        f12 = 0.0f;
                    }
                    float f18 = 1.0f - f12;
                    paint.setAlpha((int) c3.i0.E(this.m, f18, f7, f15));
                    Bitmap bitmap = f2Var.d[this.l];
                    if (f2Var.m) {
                        float f19 = this.c * f18 * f7 * this.q * (f2Var.N ? 0.75f + (f15 * 0.25f) : 1.0f);
                        canvas.scale(f19, f19);
                    }
                    canvas.drawBitmap(bitmap, -(bitmap.getWidth() >> 1), -(bitmap.getHeight() >> 1), paint);
                    canvas.restore();
                }
            }
            f12 = 0.0f;
            f13 = this.q;
            if (f13 >= 1.0f) {
            }
            float interpolation2 = org.telegram.messenger.i0.H.getInterpolation(f13) * j10.a;
            canvas.scale(interpolation2, interpolation2, 0.0f, 0.0f);
            if (f2Var.f[this.l]) {
            }
            r20 r20Var2 = f2Var.l;
            if (r20Var2 == null) {
            }
            if (f2Var.N) {
            }
            float f182 = 1.0f - f12;
            paint.setAlpha((int) c3.i0.E(this.m, f182, f7, f15));
            Bitmap bitmap2 = f2Var.d[this.l];
            if (f2Var.m) {
            }
            canvas.drawBitmap(bitmap2, -(bitmap2.getWidth() >> 1), -(bitmap2.getHeight() >> 1), paint);
            canvas.restore();
        } else {
            f14 = f16;
            f11 = 1000.0f;
        }
        if (f2Var.g) {
            return;
        }
        float L = (f14 / 660.0f) * org.telegram.messenger.i0.L(4.0f);
        float min2 = f2Var.f[this.l] ? Math.min(f2Var.o, 3.5f) * 4.0f * L : L * f2Var.o;
        if (f2Var.N) {
            long j13 = this.o;
            float i14 = 1.0f - Utilities.i((j10 - j13) / Math.max(1L, this.a - j13), 1.0f, 0.0f);
            min2 *= (2.2f * i14 * i14) + 0.15f;
            this.e = z20.v(f14, f11, org.telegram.messenger.i0.L(5.0f), this.e);
        }
        this.d = (this.j * min2) + this.d;
        this.e = (this.k * min2) + this.e;
        float f20 = this.q;
        if (f20 != 1.0f) {
            float f21 = (f14 / 200.0f) + f20;
            this.q = f21;
            if (f21 > 1.0f) {
                this.q = 1.0f;
            }
        }
    }

    public final void b(long j10) {
        float f7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        f2 f2Var = this.t;
        int i11 = f2Var.O;
        ArrayList arrayList = f2Var.n;
        RectF rectF = f2Var.a;
        if (i11 == 28) {
            if (Utilities.c.nextFloat() < 0.13f) {
                this.l = 0;
            } else {
                this.l = (int) Math.floor((r4 * (f2Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.l = Math.abs(((int) Utilities.c.nextLong()) % f2Var.d.length);
        }
        long j11 = f2Var.x + j10;
        d5.a aVar = Utilities.c;
        this.a = aVar.nextInt(f2Var.y * (f2Var.f[this.l] ? 3 : 1)) + j11;
        this.o = j10;
        this.p = aVar.nextFloat() * 6.28f;
        float f15 = 0.0f;
        this.n = 0.0f;
        float f16 = 0.6f;
        if (f2Var.m) {
            this.c = (aVar.nextFloat() * 0.6f) + 0.4f;
        }
        if (f2Var.B) {
            float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
            float abs2 = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
            float f17 = 0.0f;
            int i12 = 0;
            while (i12 < 10) {
                float f18 = rectF.left;
                d5.a aVar2 = Utilities.c;
                float f19 = f15;
                int i13 = i12;
                float abs3 = Math.abs(((int) aVar2.nextLong()) % rectF.width()) + f18;
                float abs4 = Math.abs(((int) aVar2.nextLong()) % rectF.height()) + rectF.top;
                float f20 = 2.14748365E9f;
                int i14 = 0;
                while (i14 < arrayList.size()) {
                    if (f2Var.h) {
                        f13 = ((e2) arrayList.get(i14)).f - abs3;
                        f12 = f16;
                        f14 = ((e2) arrayList.get(i14)).g;
                    } else {
                        f12 = f16;
                        f13 = ((e2) arrayList.get(i14)).d - abs3;
                        f14 = ((e2) arrayList.get(i14)).e;
                    }
                    float f21 = f14 - abs4;
                    float f22 = (f21 * f21) + (f13 * f13);
                    if (f22 < f20) {
                        f20 = f22;
                    }
                    i14++;
                    f16 = f12;
                }
                float f23 = f16;
                if (f20 > f17) {
                    abs = abs3;
                    f17 = f20;
                    abs2 = abs4;
                }
                i12 = i13 + 1;
                f15 = f19;
                f16 = f23;
            }
            f7 = f15;
            f10 = f16;
            this.d = abs;
            this.e = abs2;
        } else {
            f7 = 0.0f;
            f10 = 0.6f;
            if (f2Var.J) {
                float width = rectF.width();
                float f24 = f2Var.j;
                float z10 = c3.i0.z(width, f24, Math.abs(((int) aVar.nextLong()) % 1000) / 1000.0f, f24);
                float abs5 = Math.abs(((int) aVar.nextLong()) % 360);
                if (!f2Var.f[this.l] || this.s) {
                    f11 = 0.0f;
                } else {
                    z10 = Math.min(z10, org.telegram.messenger.i0.L(10.0f));
                    f11 = org.telegram.messenger.i0.L(30.0f) + 0.0f;
                }
                double d = z10;
                double d10 = abs5;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f11 + f2Var.k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
                this.e = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
            }
        }
        if (f2Var.f[this.l]) {
            this.r = Math.abs(Utilities.c.nextFloat() * 2.0f);
        }
        double radians = f2Var.f[this.l] ? Math.toRadians(280.0f - (Utilities.c.nextFloat() * 200.0f)) : f2Var.h ? Utilities.c.nextDouble() * 3.141592653589793d * 2.0d : Math.atan2(this.e - (rectF.centerY() + f2Var.k), this.d - (rectF.centerX() + f7));
        this.j = (float) Math.cos(radians);
        this.k = (float) Math.sin(radians);
        if (f2Var.e[this.l]) {
            this.m = (int) (((Utilities.c.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.m = (int) (((Utilities.c.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i15 = f2Var.O;
        if ((i15 == 6 && ((i10 = this.l) == 1 || i10 == 2)) || i15 == 9 || i15 == 3 || i15 == 7 || i15 == 24 || i15 == 11 || i15 == 22 || i15 == 4) {
            this.n = (int) (((((int) Utilities.c.nextLong()) % 100) / 100.0f) * 45.0f);
        }
        if (f2Var.O != 101) {
            this.q = f7;
        }
        if (f2Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.c.nextFloat() * 1.2f) + f10)) / 2.0f;
            float cos = (((float) Math.cos(radians)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f = cos;
            float sin = (((float) Math.sin(radians)) * min) + rectF.centerY() + f2Var.k;
            this.e = sin;
            this.g = sin;
        }
        this.s = false;
    }
}
