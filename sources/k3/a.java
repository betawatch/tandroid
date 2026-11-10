package k3;

import f3.e;
import f3.f;
import f3.g;
import f3.h;
import f3.i;
import f3.p;
import f3.s;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a {
    public final e a;
    public final i b;
    public f c;
    public final int d;

    public a(g gVar, i iVar, long j3, long j10, long j11, long j12, long j13, int i7) {
        this.b = iVar;
        this.d = i7;
        this.a = new e(gVar, j3, j10, j11, j12, j13);
    }

    public static int a(int i7, byte[] bArr) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public static int c(p pVar, long j3, s sVar) {
        if (j3 == pVar.getPosition()) {
            return 0;
        }
        sVar.a = j3;
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
            long j3 = fVar.f;
            long j10 = fVar.g;
            long j11 = fVar.h;
            long j12 = j10 - j3;
            long j13 = this.d;
            i iVar = this.b;
            if (j12 <= j13) {
                this.c = null;
                iVar.M();
                return c(pVar, j3, sVar);
            }
            long position = j11 - pVar.getPosition();
            if (position < 0 || position > 262144) {
                break;
            }
            pVar.s((int) position);
            pVar.q();
            h a10 = iVar.a(pVar, fVar.b);
            int i7 = a10.a;
            long j14 = a10.b;
            long j15 = a10.c;
            if (i7 == -3) {
                this.c = null;
                iVar.M();
                return c(pVar, j11, sVar);
            }
            if (i7 == -2) {
                fVar.d = j14;
                fVar.f = j15;
                fVar.h = f.a(fVar.b, j14, fVar.e, j15, fVar.g, fVar.c);
            } else {
                if (i7 != -1) {
                    if (i7 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = j15 - pVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        pVar.s((int) position2);
                    }
                    this.c = null;
                    iVar.M();
                    return c(pVar, j15, sVar);
                }
                fVar.e = j14;
                fVar.g = j15;
                fVar.h = f.a(fVar.b, fVar.d, j14, fVar.f, j15, fVar.c);
            }
        }
    }

    public final void d(long j3) {
        f fVar = this.c;
        if (fVar == null || fVar.a != j3) {
            e eVar = this.a;
            this.c = new f(j3, eVar.a.q(j3), eVar.c, eVar.d, eVar.e, eVar.f);
        }
    }
}
