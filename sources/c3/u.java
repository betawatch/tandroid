package c3;

import b2.t0;
import b2.v0;
import e2.m0;
import java.nio.ByteOrder;
import java.util.Collections;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class u {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final n4.s k;
    public final t0 l;

    public u(byte[] bArr, int i10) {
        a4.g gVar = new a4.g(bArr, bArr.length);
        gVar.m(i10 * 8);
        this.a = gVar.g(16);
        this.b = gVar.g(16);
        this.c = gVar.g(24);
        this.d = gVar.g(24);
        int g10 = gVar.g(20);
        this.e = g10;
        this.f = d(g10);
        this.g = gVar.g(3) + 1;
        int g11 = gVar.g(5) + 1;
        this.h = g11;
        this.i = a(g11);
        this.j = gVar.i(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j10 = this.j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.e;
    }

    public final b2.w c(byte[] bArr, t0 t0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.d;
        if (i10 <= 0) {
            i10 = -1;
        }
        t0 t0Var2 = this.l;
        if (t0Var2 != null) {
            t0Var = t0Var2.b(t0Var);
        }
        b2.v vVar = new b2.v();
        vVar.r = v0.n("audio/flac");
        vVar.s = i10;
        vVar.J = this.g;
        vVar.K = this.e;
        String str = m0.a;
        vVar.L = m0.D(this.h, ByteOrder.LITTLE_ENDIAN);
        vVar.u = Collections.singletonList(bArr);
        vVar.k = t0Var;
        return new b2.w(vVar);
    }

    public u(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, n4.s sVar, t0 t0Var) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
        this.e = i14;
        this.f = d(i14);
        this.g = i15;
        this.h = i16;
        this.i = a(i16);
        this.j = j10;
        this.k = sVar;
        this.l = t0Var;
    }
}
