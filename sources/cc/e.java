package cc;

import f2.q;
import f2.r;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class e implements q {
    public int a;
    public int b;
    public int c;
    public final Serializable d;
    public Serializable e;
    public Object f;
    public Serializable g;
    public Object h;

    public e(byte[] bArr, String str, ArrayList arrayList, String str2, int i7, int i10, int i11) {
        this.d = str;
        this.f = arrayList;
        this.e = str2;
        this.a = i10;
        this.b = i7;
        this.c = i11;
    }

    @Override // f2.q
    public void a(int i7, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.e;
        r rVar = (r) this.h;
        asShortBuffer.get(sArr, rVar.j * rVar.b, i7 / 2);
        byteBuffer.position(byteBuffer.position() + i7);
    }

    @Override // f2.q
    public void b(int i7, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.f;
        r rVar = (r) this.h;
        asShortBuffer.put(sArr, 0, rVar.b * i7);
        byteBuffer.position((i7 * 2 * rVar.b) + byteBuffer.position());
    }

    @Override // f2.q
    public void c(int i7, int i10) {
        for (int i11 = 0; i11 < ((r) this.h).b * i10; i11++) {
            ((short[]) this.e)[i7 + i11] = 0;
        }
    }

    @Override // f2.q
    public void d(int i7, int i10) {
        short[] sArr = (short[]) this.e;
        r rVar = (r) this.h;
        int i11 = rVar.h / i10;
        int i12 = rVar.b;
        int i13 = i10 * i12;
        int i14 = i7 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            ((short[]) this.d)[i15] = (short) (i16 / i13);
        }
    }

    @Override // f2.q
    public int e(int i7, int i10, int i11) {
        return s((short[]) this.e, i7, i10, i11);
    }

    @Override // f2.q
    public void f() {
        this.c = this.a;
    }

    @Override // f2.q
    public void flush() {
        this.c = 0;
        this.a = 0;
        this.b = 0;
    }

    @Override // f2.q
    public Object g() {
        return (short[]) this.e;
    }

    @Override // f2.q
    public Object h() {
        return (short[]) this.f;
    }

    @Override // f2.q
    public void i(int i7) {
        this.f = r((short[]) this.f, ((r) this.h).k, i7);
    }

    @Override // f2.q
    public boolean j() {
        int i7 = this.a;
        return i7 != 0 && ((r) this.h).p != 0 && this.b <= i7 * 3 && i7 * 2 > this.c * 3;
    }

    @Override // f2.q
    public void k(long j3, int i7, long j10) {
        int i10 = 0;
        while (true) {
            r rVar = (r) this.h;
            int i11 = rVar.b;
            if (i10 >= i11) {
                return;
            }
            short[] sArr = (short[]) this.f;
            int i12 = (rVar.k * i11) + i10;
            short[] sArr2 = (short[]) this.g;
            int i13 = (i7 * i11) + i10;
            short s5 = sArr2[i13];
            short s9 = sArr2[i13 + i11];
            long j11 = rVar.n * j3;
            long j12 = (r1 + 1) * j10;
            long j13 = j12 - j11;
            long j14 = j12 - (rVar.m * j10);
            sArr[i12] = (short) ((((j14 - j13) * s9) + (s5 * j13)) / j14);
            i10++;
        }
    }

    @Override // f2.q
    public Object l() {
        return (short[]) this.g;
    }

    @Override // f2.q
    public void m(int i7, int i10, int i11, int i12, int i13) {
        short[] sArr = (short[]) this.f;
        short[] sArr2 = (short[]) this.e;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i7; i18++) {
                sArr[i15] = (short) (((sArr2[i16] * i18) + ((i7 - i18) * sArr2[i17])) / i7);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, short[]] */
    @Override // f2.q
    public void n(int i7) {
        this.g = r((short[]) this.g, ((r) this.h).l, i7);
    }

    @Override // f2.q
    public int o() {
        return 2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, short[]] */
    @Override // f2.q
    public void p(int i7) {
        this.e = r((short[]) this.e, ((r) this.h).j, i7);
    }

    @Override // f2.q
    public int q(int i7, int i10) {
        return s((short[]) this.d, 0, i7, i10);
    }

    public short[] r(short[] sArr, int i7, int i10) {
        int length = sArr.length;
        int i11 = ((r) this.h).b;
        int i12 = length / i11;
        return i7 + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public int s(short[] sArr, int i7, int i10, int i11) {
        int i12 = i7 * ((r) this.h).b;
        int i13 = qs.e4;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int i17 = 0;
            for (int i18 = 0; i18 < i10; i18++) {
                i17 += Math.abs(sArr[i12 + i18] - sArr[(i12 + i10) + i18]);
            }
            if (i17 * i15 < i14 * i10) {
                i15 = i10;
                i14 = i17;
            }
            if (i17 * i13 > i16 * i10) {
                i13 = i10;
                i16 = i17;
            }
            i10++;
        }
        this.a = i14 / i15;
        this.b = i16 / i13;
        return i15;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, short[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable, short[]] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Serializable, short[]] */
    public e(r rVar) {
        this.h = rVar;
        int i7 = rVar.h;
        this.d = new short[i7];
        int i10 = i7 * rVar.b;
        this.e = new short[i10];
        this.f = new short[i10];
        this.g = new short[i10];
    }
}
