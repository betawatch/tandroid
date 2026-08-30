package b4;

import org.telegram.ui.Components.jb;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class x {
    public final r3.a a;
    public final r3.e b;
    public r3.b c;
    public final int d;

    public x(r3.c cVar, r3.e eVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.b = eVar;
        this.d = i10;
        this.a = new r3.a(cVar, j10, j11, j12, j13, j14);
    }

    public static int a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static int c(r3.l lVar, long j10, jb jbVar) {
        if (j10 == lVar.getPosition()) {
            return 0;
        }
        jbVar.a = j10;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        return c(r27, r8, r28);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(r3.l lVar, jb jbVar) {
        while (true) {
            r3.b bVar = this.c;
            h5.a.j(bVar);
            long j10 = bVar.f;
            long j11 = bVar.g;
            long j12 = bVar.h;
            long j13 = j11 - j10;
            long j14 = this.d;
            r3.e eVar = this.b;
            if (j13 <= j14) {
                this.c = null;
                eVar.o();
                return c(lVar, j10, jbVar);
            }
            long position = j12 - lVar.getPosition();
            if (position < 0 || position > 262144) {
                break;
            }
            lVar.u((int) position);
            lVar.t();
            r3.d d = eVar.d(lVar, bVar.b);
            int i10 = d.a;
            long j15 = d.b;
            long j16 = d.c;
            if (i10 == -3) {
                this.c = null;
                eVar.o();
                return c(lVar, j12, jbVar);
            }
            if (i10 == -2) {
                bVar.d = j15;
                bVar.f = j16;
                bVar.h = r3.b.a(bVar.b, j15, bVar.e, j16, bVar.g, bVar.c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = j16 - lVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        lVar.u((int) position2);
                    }
                    this.c = null;
                    eVar.o();
                    return c(lVar, j16, jbVar);
                }
                bVar.e = j15;
                bVar.g = j16;
                bVar.h = r3.b.a(bVar.b, bVar.d, j15, bVar.f, j16, bVar.c);
            }
        }
    }

    public final void d(long j10) {
        r3.b bVar = this.c;
        if (bVar == null || bVar.a != j10) {
            r3.a aVar = this.a;
            this.c = new r3.b(j10, aVar.a.f(j10), aVar.c, aVar.d, aVar.e, aVar.f);
        }
    }
}
