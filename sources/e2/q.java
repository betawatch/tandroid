package e2;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q implements p {
    public int a;
    public int b;
    public int c;
    public final Serializable d;
    public Object e;
    public Serializable f;
    public Serializable g;
    public Object h;

    public q(byte[] bArr, String str, ArrayList arrayList, String str2, int i3, int i10, int i11) {
        this.d = str;
        this.e = arrayList;
        this.f = str2;
        this.a = i10;
        this.b = i3;
        this.c = i11;
    }

    @Override // e2.p
    public void a(int i3, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.e;
        r rVar = (r) this.h;
        asShortBuffer.get(sArr, rVar.j * rVar.b, i3 / 2);
        byteBuffer.position(byteBuffer.position() + i3);
    }

    @Override // e2.p
    public void b(int i3, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.f;
        r rVar = (r) this.h;
        asShortBuffer.put(sArr, 0, rVar.b * i3);
        byteBuffer.position((i3 * 2 * rVar.b) + byteBuffer.position());
    }

    @Override // e2.p
    public void c(int i3, int i10) {
        for (int i11 = 0; i11 < ((r) this.h).b * i10; i11++) {
            ((short[]) this.e)[i3 + i11] = 0;
        }
    }

    @Override // e2.p
    public void d(int i3, int i10) {
        short[] sArr = (short[]) this.e;
        r rVar = (r) this.h;
        int i11 = rVar.h / i10;
        int i12 = rVar.b;
        int i13 = i10 * i12;
        int i14 = i3 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            ((short[]) this.d)[i15] = (short) (i16 / i13);
        }
    }

    @Override // e2.p
    public int e(int i3, int i10, int i11) {
        return s((short[]) this.e, i3, i10, i11);
    }

    @Override // e2.p
    public void f() {
        this.c = this.a;
    }

    @Override // e2.p
    public void flush() {
        this.c = 0;
        this.a = 0;
        this.b = 0;
    }

    @Override // e2.p
    public Object g() {
        return (short[]) this.e;
    }

    @Override // e2.p
    public Object h() {
        return (short[]) this.f;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, short[]] */
    @Override // e2.p
    public void i(int i3) {
        this.f = r((short[]) this.f, ((r) this.h).k, i3);
    }

    @Override // e2.p
    public boolean j() {
        int i3 = this.a;
        return i3 != 0 && ((r) this.h).p != 0 && this.b <= i3 * 3 && i3 * 2 > this.c * 3;
    }

    @Override // e2.p
    public void k(long j10, int i3, long j11) {
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
            int i13 = (i3 * i11) + i10;
            short s6 = sArr2[i13];
            short s10 = sArr2[i13 + i11];
            long j12 = rVar.n * j10;
            long j13 = (r1 + 1) * j11;
            long j14 = j13 - j12;
            long j15 = j13 - (rVar.m * j11);
            sArr[i12] = (short) ((((j15 - j14) * s10) + (s6 * j14)) / j15);
            i10++;
        }
    }

    @Override // e2.p
    public Object l() {
        return (short[]) this.g;
    }

    @Override // e2.p
    public void m(int i3, int i10, int i11, int i12, int i13) {
        short[] sArr = (short[]) this.f;
        short[] sArr2 = (short[]) this.e;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i3; i18++) {
                sArr[i15] = (short) (((sArr2[i16] * i18) + ((i3 - i18) * sArr2[i17])) / i3);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, short[]] */
    @Override // e2.p
    public void n(int i3) {
        this.g = r((short[]) this.g, ((r) this.h).l, i3);
    }

    @Override // e2.p
    public int o() {
        return 2;
    }

    @Override // e2.p
    public void p(int i3) {
        this.e = r((short[]) this.e, ((r) this.h).j, i3);
    }

    @Override // e2.p
    public int q(int i3, int i10) {
        return s((short[]) this.d, 0, i3, i10);
    }

    public short[] r(short[] sArr, int i3, int i10) {
        int length = sArr.length;
        int i11 = ((r) this.h).b;
        int i12 = length / i11;
        return i3 + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public int s(short[] sArr, int i3, int i10, int i11) {
        int i12 = i3 * ((r) this.h).b;
        int i13 = hs.e4;
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
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Serializable, short[]] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Serializable, short[]] */
    public q(r rVar) {
        this.h = rVar;
        int i3 = rVar.h;
        this.d = new short[i3];
        int i10 = i3 * rVar.b;
        this.e = new short[i10];
        this.f = new short[i10];
        this.g = new short[i10];
    }
}
