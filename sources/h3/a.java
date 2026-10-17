package h3;

import c3.e;
import c3.f;
import c3.g;
import c3.h;
import c3.i;
import c3.p;
import c3.s;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class a {
    public final e a;
    public final i b;
    public f c;
    public final int d;

    public a(g gVar, i iVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.b = iVar;
        this.d = i10;
        this.a = new e(gVar, j10, j11, j12, j13, j14);
    }

    public static int a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static int c(p pVar, long j10, s sVar) {
        if (j10 == pVar.getPosition()) {
            return 0;
        }
        sVar.a = j10;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(p pVar, s sVar) {
        while (true) {
            f fVar = this.c;
            fVar.getClass();
            long j10 = fVar.f;
            long j11 = fVar.g;
            long j12 = fVar.h;
            long j13 = j11 - j10;
            long j14 = this.d;
            i iVar = this.b;
            if (j13 <= j14) {
                this.c = null;
                iVar.f();
                return c(pVar, j10, sVar);
            }
            long position = j12 - pVar.getPosition();
            if (position < 0 || position > 262144) {
                break;
            }
            pVar.r((int) position);
            pVar.q();
            h b10 = iVar.b(pVar, fVar.b);
            int i10 = b10.a;
            long j15 = b10.b;
            long j16 = b10.c;
            if (i10 == -3) {
                this.c = null;
                iVar.f();
                return c(pVar, j12, sVar);
            }
            if (i10 == -2) {
                fVar.d = j15;
                fVar.f = j16;
                fVar.h = f.a(fVar.b, j15, fVar.e, j16, fVar.g, fVar.c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = j16 - pVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        pVar.r((int) position2);
                    }
                    this.c = null;
                    iVar.f();
                    return c(pVar, j16, sVar);
                }
                fVar.e = j15;
                fVar.g = j16;
                fVar.h = f.a(fVar.b, fVar.d, j15, fVar.f, j16, fVar.c);
            }
        }
    }

    public final void d(long j10) {
        f fVar = this.c;
        if (fVar == null || fVar.a != j10) {
            e eVar = this.a;
            this.c = new f(j10, eVar.a.k(j10), eVar.c, eVar.d, eVar.e, eVar.f);
        }
    }
}
