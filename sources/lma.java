// default package

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lma implements kma {
    public int a;
    public int b;
    public int c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public final Object h;

    public lma(Canvas canvas) {
        this.e = new BitSet();
        this.f = new Matrix();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.d = canvas;
    }

    @Override // kma
    public final void a(int i, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.e;
        mma mmaVar = (mma) this.h;
        asShortBuffer.get(sArr, mmaVar.j * mmaVar.b, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // kma
    public final void b(int i, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.f;
        int i2 = ((mma) this.h).b;
        asShortBuffer.put(sArr, 0, i * i2);
        byteBuffer.position(((i << 1) * i2) + byteBuffer.position());
    }

    @Override // kma
    public final void c(int i, int i2) {
        for (int i3 = 0; i3 < ((mma) this.h).b * i2; i3++) {
            ((short[]) this.e)[i + i3] = 0;
        }
    }

    @Override // kma
    public final void d(int i, int i2) {
        short[] sArr = (short[]) this.e;
        mma mmaVar = (mma) this.h;
        int i3 = mmaVar.h / i2;
        int i4 = mmaVar.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            ((short[]) this.d)[i7] = (short) (i8 / i5);
        }
    }

    @Override // kma
    public final int e(int i, int i2, int i3) {
        return s((short[]) this.e, i, i2, i3);
    }

    @Override // kma
    public final void f() {
        this.c = this.a;
    }

    @Override // kma
    public final void flush() {
        this.c = 0;
        this.a = 0;
        this.b = 0;
    }

    @Override // kma
    public final Object g() {
        return (short[]) this.e;
    }

    @Override // kma
    public final Object h() {
        return (short[]) this.f;
    }

    @Override // kma
    public final void i(int i) {
        this.f = r((short[]) this.f, ((mma) this.h).k, i);
    }

    @Override // kma
    public final boolean j() {
        int i = this.a;
        return i != 0 && ((mma) this.h).p != 0 && this.b <= i * 3 && (i << 1) > this.c * 3;
    }

    @Override // kma
    public final void k(long j, int i, long j2) {
        int i2 = 0;
        while (true) {
            mma mmaVar = (mma) this.h;
            int i3 = mmaVar.b;
            if (i2 >= i3) {
                return;
            }
            short[] sArr = (short[]) this.f;
            int i4 = (mmaVar.k * i3) + i2;
            short[] sArr2 = (short[]) this.g;
            int i5 = (i * i3) + i2;
            short s = sArr2[i5];
            short s2 = sArr2[i5 + i3];
            long j3 = mmaVar.n * j;
            long j4 = (r1 + 1) * j2;
            long j5 = j4 - j3;
            long j6 = j4 - (mmaVar.m * j2);
            sArr[i4] = (short) ((((j6 - j5) * s2) + (s * j5)) / j6);
            i2++;
        }
    }

    @Override // kma
    public final Object l() {
        return (short[]) this.g;
    }

    @Override // kma
    public final void m(int i, int i2, int i3, int i4, int i5) {
        short[] sArr = (short[]) this.f;
        short[] sArr2 = (short[]) this.e;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override // kma
    public final void n(int i) {
        this.g = r((short[]) this.g, ((mma) this.h).l, i);
    }

    @Override // kma
    public final int o() {
        return 2;
    }

    @Override // kma
    public final void p(int i) {
        this.e = r((short[]) this.e, ((mma) this.h).j, i);
    }

    @Override // kma
    public final int q(int i, int i2) {
        return s((short[]) this.d, 0, i, i2);
    }

    public final short[] r(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = ((mma) this.h).b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int s(short[] sArr, int i, int i2, int i3) {
        int i4 = i * ((mma) this.h).b;
        int i5 = nm7.d4;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.a = i6 / i7;
        this.b = i8 / i5;
        return i7;
    }

    public final void t() {
        ((Canvas) this.d).restore();
        Matrix matrix = (Matrix) this.f;
        ArrayList arrayList = (ArrayList) this.g;
        matrix.set((Matrix) td4.m(1, arrayList));
        if (((BitSet) this.e).get(arrayList.size())) {
            this.c--;
        }
        this.a--;
    }

    public final void u(boolean z) {
        BitSet bitSet = (BitSet) this.e;
        ArrayList arrayList = (ArrayList) this.g;
        bitSet.set(arrayList.size(), z);
        if (z) {
            this.c++;
        }
        arrayList.add(new Matrix((Matrix) this.f));
        this.a++;
    }

    public lma(mma mmaVar) {
        this.h = mmaVar;
        int i = mmaVar.h;
        this.d = new short[i];
        int i2 = i * mmaVar.b;
        this.e = new short[i2];
        this.f = new short[i2];
        this.g = new short[i2];
    }
}
