package l4;

import g2.l0;
import g2.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x {
    public final /* synthetic */ int a;
    public final l0 b;
    public final g2.y c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public x(int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = new l0(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new g2.y();
                break;
            default:
                this.b = new l0(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new g2.y();
                break;
        }
    }

    public static int b(int i3, byte[] bArr) {
        return (bArr[i3 + 3] & 255) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3 + 2] & 255) << 8);
    }

    public static long c(g2.y yVar) {
        int i3 = yVar.b;
        if (yVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        yVar.k(0, 9, bArr);
        yVar.N(i3);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = b10;
                    long j11 = b11;
                    return ((j11 & 3) << 13) | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(e3.p pVar) {
        switch (this.a) {
            case 0:
                byte[] bArr = n0.b;
                g2.y yVar = this.c;
                yVar.getClass();
                yVar.L(bArr.length, bArr);
                this.d = true;
                pVar.o();
                break;
            default:
                byte[] bArr2 = n0.b;
                g2.y yVar2 = this.c;
                yVar2.getClass();
                yVar2.L(bArr2.length, bArr2);
                this.d = true;
                pVar.o();
                break;
        }
    }
}
