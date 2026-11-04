package e2;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        int i3 = rVar.h;
        this.a = new float[i3];
        int i10 = i3 * rVar.b;
        this.b = new float[i10];
        this.c = new float[i10];
        this.d = new float[i10];
    }

    @Override // e2.p
    public final void a(int i3, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.b;
        r rVar = this.h;
        asFloatBuffer.get(fArr, rVar.j * rVar.b, i3 / 4);
        byteBuffer.position(byteBuffer.position() + i3);
    }

    @Override // e2.p
    public final void b(int i3, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.c;
        r rVar = this.h;
        asFloatBuffer.put(fArr, 0, rVar.b * i3);
        byteBuffer.position((i3 * 4 * rVar.b) + byteBuffer.position());
    }

    @Override // e2.p
    public final void c(int i3, int i10) {
        for (int i11 = 0; i11 < this.h.b * i10; i11++) {
            this.b[i3 + i11] = 0.0f;
        }
    }

    @Override // e2.p
    public final void d(int i3, int i10) {
        r rVar = this.h;
        int i11 = rVar.h / i10;
        int i12 = rVar.b;
        int i13 = i10 * i12;
        int i14 = i3 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            double d = 0.0d;
            for (int i16 = 0; i16 < i13; i16++) {
                d += this.b[(i15 * i13) + i14 + i16];
            }
            this.a[i15] = (float) (d / i13);
        }
    }

    @Override // e2.p
    public final int e(int i3, int i10, int i11) {
        return s(i3, i10, i11, this.b);
    }

    @Override // e2.p
    public final void f() {
        this.g = this.e;
    }

    @Override // e2.p
    public final void flush() {
        this.g = 0.0d;
        this.e = 0.0d;
        this.f = 0.0d;
    }

    @Override // e2.p
    public final Object g() {
        return this.b;
    }

    @Override // e2.p
    public final Object h() {
        return this.c;
    }

    @Override // e2.p
    public final void i(int i3) {
        this.c = r(this.h.k, i3, this.c);
    }

    @Override // e2.p
    public final boolean j() {
        double d = this.e;
        return d != 0.0d && this.h.p != 0 && this.f <= d * 3.0d && d * 2.0d > this.g * 3.0d;
    }

    @Override // e2.p
    public final void k(long j10, int i3, long j11) {
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
            int i13 = (i3 * i11) + i10;
            float f10 = fArr2[i13];
            float f11 = fArr2[i13 + i11];
            long j12 = rVar.n * j10;
            long j13 = (r1 + 1) * j11;
            long j14 = j13 - j12;
            fArr[i12] = (((r10 - j14) * f11) + (j14 * f10)) / (j13 - (rVar.m * j11));
            i10++;
        }
    }

    @Override // e2.p
    public final Object l() {
        return this.d;
    }

    @Override // e2.p
    public final void m(int i3, int i10, int i11, int i12, int i13) {
        float[] fArr = this.c;
        float[] fArr2 = this.b;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i3; i18++) {
                fArr[i15] = ((fArr2[i16] * i18) + (fArr2[i17] * (i3 - i18))) / i3;
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    @Override // e2.p
    public final void n(int i3) {
        this.d = r(this.h.l, i3, this.d);
    }

    @Override // e2.p
    public final int o() {
        return 4;
    }

    @Override // e2.p
    public final void p(int i3) {
        this.b = r(this.h.j, i3, this.b);
    }

    @Override // e2.p
    public final int q(int i3, int i10) {
        return s(0, i3, i10, this.a);
    }

    public final float[] r(int i3, int i10, float[] fArr) {
        int length = fArr.length;
        int i11 = this.h.b;
        int i12 = length / i11;
        return i3 + i10 <= i12 ? fArr : Arrays.copyOf(fArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int s(int i3, int i10, int i11, float[] fArr) {
        int i12 = this.h.b * i3;
        double d = 1.0d;
        int i13 = 0;
        double d10 = 0.0d;
        int i14 = 255;
        int i15 = i10;
        while (i15 <= i11) {
            double d11 = 0.0d;
            for (int i16 = 0; i16 < i15; i16++) {
                d11 += Math.abs(fArr[i12 + i16] - fArr[(i12 + i15) + i16]);
            }
            int i17 = i12;
            double d12 = i15;
            if (i13 * d11 < d * d12) {
                i13 = i15;
                d = d11;
            }
            if (i14 * d11 > d12 * d10) {
                i14 = i15;
                d10 = d11;
            }
            i15++;
            i12 = i17;
        }
        this.e = d / i13;
        this.f = d10 / i14;
        return i13;
    }
}
