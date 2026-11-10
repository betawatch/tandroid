package f3;

import e2.q0;
import e2.s0;
import h2.m0;
import java.nio.ByteOrder;
import java.util.Collections;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
    public final q4.q k;
    public final q0 l;

    public u(byte[] bArr, int i7) {
        d4.f fVar = new d4.f(bArr, bArr.length);
        fVar.J(i7 * 8);
        this.a = fVar.j(16);
        this.b = fVar.j(16);
        this.c = fVar.j(24);
        this.d = fVar.j(24);
        int j3 = fVar.j(20);
        this.e = j3;
        this.f = d(j3);
        this.g = fVar.j(3) + 1;
        int j10 = fVar.j(5) + 1;
        this.h = j10;
        this.i = a(j10);
        this.j = fVar.l(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i7) {
        if (i7 == 8) {
            return 1;
        }
        if (i7 == 12) {
            return 2;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 == 20) {
            return 5;
        }
        if (i7 != 24) {
            return i7 != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i7) {
        switch (i7) {
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
        long j3 = this.j;
        if (j3 == 0) {
            return -9223372036854775807L;
        }
        return (j3 * 1000000) / this.e;
    }

    public final e2.u c(byte[] bArr, q0 q0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i7 = this.d;
        if (i7 <= 0) {
            i7 = -1;
        }
        q0 q0Var2 = this.l;
        if (q0Var2 != null) {
            q0Var = q0Var2.b(q0Var);
        }
        e2.t tVar = new e2.t();
        tVar.r = s0.n("audio/flac");
        tVar.s = i7;
        tVar.J = this.g;
        tVar.K = this.e;
        String str = m0.a;
        tVar.L = m0.D(this.h, ByteOrder.LITTLE_ENDIAN);
        tVar.u = Collections.singletonList(bArr);
        tVar.k = q0Var;
        return new e2.u(tVar);
    }

    public u(int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j3, q4.q qVar, q0 q0Var) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = d(i13);
        this.g = i14;
        this.h = i15;
        this.i = a(i15);
        this.j = j3;
        this.k = qVar;
        this.l = q0Var;
    }
}
