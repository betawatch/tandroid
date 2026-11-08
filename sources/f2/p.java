package f2;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class p implements q {
    public final float[] a;
    public float[] b;
    public float[] c;
    public float[] d;
    public double e;
    public double f;
    public double g;
    public final /* synthetic */ r h;

    public p(r rVar) {
        this.h = rVar;
        int i7 = rVar.h;
        this.a = new float[i7];
        int i10 = i7 * rVar.b;
        this.b = new float[i10];
        this.c = new float[i10];
        this.d = new float[i10];
    }

    @Override // f2.q
    public final void a(int i7, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.b;
        r rVar = this.h;
        asFloatBuffer.get(fArr, rVar.j * rVar.b, i7 / 4);
        byteBuffer.position(byteBuffer.position() + i7);
    }

    @Override // f2.q
    public final void b(int i7, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.c;
        r rVar = this.h;
        asFloatBuffer.put(fArr, 0, rVar.b * i7);
        byteBuffer.position((i7 * 4 * rVar.b) + byteBuffer.position());
    }

    @Override // f2.q
    public final void c(int i7, int i10) {
        for (int i11 = 0; i11 < this.h.b * i10; i11++) {
            this.b[i7 + i11] = 0.0f;
        }
    }

    @Override // f2.q
    public final void d(int i7, int i10) {
        r rVar = this.h;
        int i11 = rVar.h / i10;
        int i12 = rVar.b;
        int i13 = i10 * i12;
        int i14 = i7 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            double d = 0.0d;
            for (int i16 = 0; i16 < i13; i16++) {
                d += this.b[(i15 * i13) + i14 + i16];
            }
            this.a[i15] = (float) (d / i13);
        }
    }

    @Override // f2.q
    public final int e(int i7, int i10, int i11) {
        return s(i7, i10, i11, this.b);
    }

    @Override // f2.q
    public final void f() {
        this.g = this.e;
    }

    @Override // f2.q
    public final void flush() {
        this.g = 0.0d;
        this.e = 0.0d;
        this.f = 0.0d;
    }

    @Override // f2.q
    public final Object g() {
        return this.b;
    }

    @Override // f2.q
    public final Object h() {
        return this.c;
    }

    @Override // f2.q
    public final void i(int i7) {
        this.c = r(this.h.k, i7, this.c);
    }

    @Override // f2.q
    public final boolean j() {
        double d = this.e;
        return d != 0.0d && this.h.p != 0 && this.f <= d * 3.0d && d * 2.0d > this.g * 3.0d;
    }

    @Override // f2.q
    public final void k(long j3, int i7, long j10) {
        int i10 = 0;
        while (true) {
            r rVar = this.h;
            int i11 = rVar.b;
            if (i10 >= i11) {
                return;
            }
            float[] fArr = this.c;
            int i12 = (rVar.k * i11) + i10;
            float[] fArr2 = this.d;
            int i13 = (i7 * i11) + i10;
            float f10 = fArr2[i13];
            float f11 = fArr2[i13 + i11];
            long j11 = rVar.n * j3;
            long j12 = (r1 + 1) * j10;
            long j13 = j12 - j11;
            fArr[i12] = (((r10 - j13) * f11) + (j13 * f10)) / (j12 - (rVar.m * j10));
            i10++;
        }
    }

    @Override // f2.q
    public final Object l() {
        return this.d;
    }

    @Override // f2.q
    public final void m(int i7, int i10, int i11, int i12, int i13) {
        float[] fArr = this.c;
        float[] fArr2 = this.b;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i7; i18++) {
                fArr[i15] = ((fArr2[i16] * i18) + (fArr2[i17] * (i7 - i18))) / i7;
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    @Override // f2.q
    public final void n(int i7) {
        this.d = r(this.h.l, i7, this.d);
    }

    @Override // f2.q
    public final int o() {
        return 4;
    }

    @Override // f2.q
    public final void p(int i7) {
        this.b = r(this.h.j, i7, this.b);
    }

    @Override // f2.q
    public final int q(int i7, int i10) {
        return s(0, i7, i10, this.a);
    }

    public final float[] r(int i7, int i10, float[] fArr) {
        int length = fArr.length;
        int i11 = this.h.b;
        int i12 = length / i11;
        return i7 + i10 <= i12 ? fArr : Arrays.copyOf(fArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int s(int i7, int i10, int i11, float[] fArr) {
        int i12 = this.h.b * i7;
        double d = 1.0d;
        int i13 = 0;
        double d2 = 0.0d;
        int i14 = 255;
        int i15 = i10;
        while (i15 <= i11) {
            double d10 = 0.0d;
            for (int i16 = 0; i16 < i15; i16++) {
                d10 += Math.abs(fArr[i12 + i16] - fArr[(i12 + i15) + i16]);
            }
            int i17 = i12;
            double d11 = i15;
            if (i13 * d10 < d * d11) {
                i13 = i15;
                d = d10;
            }
            if (i14 * d10 > d11 * d2) {
                i14 = i15;
                d2 = d10;
            }
            i15++;
            i12 = i17;
        }
        this.e = d / i13;
        this.f = d2 / i14;
        return i13;
    }
}
