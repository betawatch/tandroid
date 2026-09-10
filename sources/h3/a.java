package h3;

import c3.e;
import c3.f;
import c3.g;
import c3.h;
import c3.i;
import c3.p;
import c3.s;
import e2.d;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a {
    public final e a;
    public final i b;
    public f c;
    public final int d;

    public a(g gVar, i iVar, long j3, long j10, long j11, long j12, long j13, int i10) {
        this.b = iVar;
        this.d = i10;
        this.a = new e(gVar, j3, j10, j11, j12, j13);
    }

    public static int a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static int c(p pVar, long j3, s sVar) {
        if (j3 == pVar.getPosition()) {
            return 0;
        }
        sVar.a = j3;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        return c(r27, r8, r28);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(p pVar, s sVar) {
        while (true) {
            f fVar = this.c;
            d.h(fVar);
            long j3 = fVar.f;
            long j10 = fVar.g;
            long j11 = fVar.h;
            long j12 = j10 - j3;
            long j13 = this.d;
            i iVar = this.b;
            if (j12 <= j13) {
                this.c = null;
                iVar.D();
                return c(pVar, j3, sVar);
            }
            long position = j11 - pVar.getPosition();
            if (position < 0 || position > 262144) {
                break;
            }
            pVar.q((int) position);
            pVar.p();
            h n10 = iVar.n(pVar, fVar.b);
            int i10 = n10.a;
            long j14 = n10.b;
            long j15 = n10.c;
            if (i10 == -3) {
                this.c = null;
                iVar.D();
                return c(pVar, j11, sVar);
            }
            if (i10 == -2) {
                fVar.d = j14;
                fVar.f = j15;
                fVar.h = f.a(fVar.b, j14, fVar.e, j15, fVar.g, fVar.c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = j15 - pVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        pVar.q((int) position2);
                    }
                    this.c = null;
                    iVar.D();
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
            this.c = new f(j3, eVar.a.b(j3), eVar.c, eVar.d, eVar.e, eVar.f);
        }
    }
}
