package e3;

import d2.s0;
import d2.u0;
import g2.n0;
import java.nio.ByteOrder;
import java.util.Collections;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public final tf.b k;
    public final s0 l;

    public u(byte[] bArr, int i3) {
        c4.f fVar = new c4.f(bArr, bArr.length);
        fVar.J(i3 * 8);
        this.a = fVar.j(16);
        this.b = fVar.j(16);
        this.c = fVar.j(24);
        this.d = fVar.j(24);
        int j10 = fVar.j(20);
        this.e = j10;
        this.f = d(j10);
        this.g = fVar.j(3) + 1;
        int j11 = fVar.j(5) + 1;
        this.h = j11;
        this.i = a(j11);
        this.j = fVar.l(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i3) {
        if (i3 == 8) {
            return 1;
        }
        if (i3 == 12) {
            return 2;
        }
        if (i3 == 16) {
            return 4;
        }
        if (i3 == 20) {
            return 5;
        }
        if (i3 != 24) {
            return i3 != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i3) {
        switch (i3) {
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

    public final d2.v c(byte[] bArr, s0 s0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i3 = this.d;
        if (i3 <= 0) {
            i3 = -1;
        }
        s0 s0Var2 = this.l;
        if (s0Var2 != null) {
            s0Var = s0Var2.b(s0Var);
        }
        d2.u uVar = new d2.u();
        uVar.r = u0.n("audio/flac");
        uVar.s = i3;
        uVar.J = this.g;
        uVar.K = this.e;
        String str = n0.a;
        uVar.L = n0.D(this.h, ByteOrder.LITTLE_ENDIAN);
        uVar.u = Collections.singletonList(bArr);
        uVar.k = s0Var;
        return new d2.v(uVar);
    }

    public u(int i3, int i10, int i11, int i12, int i13, int i14, int i15, long j10, tf.b bVar, s0 s0Var) {
        this.a = i3;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = d(i13);
        this.g = i14;
        this.h = i15;
        this.i = a(i15);
        this.j = j10;
        this.k = bVar;
        this.l = s0Var;
    }
}
