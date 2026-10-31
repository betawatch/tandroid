package c2;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o implements p {
    public final float[] a;
    public float[] b;
    public float[] c;
    public float[] d;
    public double e;
    public double f;
    public double g;
    public final /* synthetic */ r h;

    public o(r rVar) {
        this.h = rVar;
        int i10 = rVar.h;
        this.a = new float[i10];
        int i11 = i10 * rVar.b;
        this.b = new float[i11];
        this.c = new float[i11];
        this.d = new float[i11];
    }

    @Override // c2.p
    public final void a(int i10, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.b;
        r rVar = this.h;
        asFloatBuffer.get(fArr, rVar.j * rVar.b, i10 / 4);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override // c2.p
    public final void b(int i10, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.c;
        r rVar = this.h;
        asFloatBuffer.put(fArr, 0, rVar.b * i10);
        byteBuffer.position((i10 * 4 * rVar.b) + byteBuffer.position());
    }

    @Override // c2.p
    public final void c(int i10, int i11) {
        for (int i12 = 0; i12 < this.h.b * i11; i12++) {
            this.b[i10 + i12] = 0.0f;
        }
    }

    @Override // c2.p
    public final void d(int i10, int i11) {
        r rVar = this.h;
        int i12 = rVar.h / i11;
        int i13 = rVar.b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            double d = 0.0d;
            for (int i17 = 0; i17 < i14; i17++) {
                d += this.b[(i16 * i14) + i15 + i17];
            }
            this.a[i16] = (float) (d / i14);
        }
    }

    @Override // c2.p
    public final int e(int i10, int i11, int i12) {
        return s(i10, i11, i12, this.b);
    }

    @Override // c2.p
    public final void f() {
        this.g = this.e;
    }

    @Override // c2.p
    public final void flush() {
        this.g = 0.0d;
        this.e = 0.0d;
        this.f = 0.0d;
    }

    @Override // c2.p
    public final Object g() {
        return this.b;
    }

    @Override // c2.p
    public final Object h() {
        return this.c;
    }

    @Override // c2.p
    public final void i(int i10) {
        this.c = r(this.h.k, i10, this.c);
    }

    @Override // c2.p
    public final boolean j() {
        double d = this.e;
        return d != 0.0d && this.h.p != 0 && this.f <= d * 3.0d && d * 2.0d > this.g * 3.0d;
    }

    @Override // c2.p
    public final void k(long j10, int i10, long j11) {
        int i11 = 0;
        while (true) {
            r rVar = this.h;
            int i12 = rVar.b;
            if (i11 >= i12) {
                return;
            }
            float[] fArr = this.c;
            int i13 = (rVar.k * i12) + i11;
            float[] fArr2 = this.d;
            int i14 = (i10 * i12) + i11;
            float f7 = fArr2[i14];
            float f10 = fArr2[i14 + i12];
            long j12 = rVar.n * j10;
            long j13 = (r1 + 1) * j11;
            long j14 = j13 - j12;
            fArr[i13] = (((r10 - j14) * f10) + (j14 * f7)) / (j13 - (rVar.m * j11));
            i11++;
        }
    }

    @Override // c2.p
    public final Object l() {
        return this.d;
    }

    @Override // c2.p
    public final void m(int i10, int i11, int i12, int i13, int i14) {
        float[] fArr = this.c;
        float[] fArr2 = this.b;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                fArr[i16] = ((fArr2[i17] * i19) + (fArr2[i18] * (i10 - i19))) / i10;
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    @Override // c2.p
    public final void n(int i10) {
        this.d = r(this.h.l, i10, this.d);
    }

    @Override // c2.p
    public final int o() {
        return 4;
    }

    @Override // c2.p
    public final void p(int i10) {
        this.b = r(this.h.j, i10, this.b);
    }

    @Override // c2.p
    public final int q(int i10, int i11) {
        return s(0, i10, i11, this.a);
    }

    public final float[] r(int i10, int i11, float[] fArr) {
        int length = fArr.length;
        int i12 = this.h.b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? fArr : Arrays.copyOf(fArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int s(int i10, int i11, int i12, float[] fArr) {
        int i13 = this.h.b * i10;
        double d = 1.0d;
        int i14 = 0;
        double d10 = 0.0d;
        int i15 = 255;
        int i16 = i11;
        while (i16 <= i12) {
            double d11 = 0.0d;
            for (int i17 = 0; i17 < i16; i17++) {
                d11 += Math.abs(fArr[i13 + i17] - fArr[(i13 + i16) + i17]);
            }
            int i18 = i13;
            double d12 = i16;
            if (i14 * d11 < d * d12) {
                i14 = i16;
                d = d11;
            }
            if (i15 * d11 > d12 * d10) {
                i15 = i16;
                d10 = d11;
            }
            i16++;
            i13 = i18;
        }
        this.e = d / i14;
        this.f = d10 / i15;
        return i14;
    }
}
