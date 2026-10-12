package j4;

import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class c implements c3.o {
    public final b a = new b(0, 1, null, "audio/ac4");
    public final e2.x b = new e2.x(16384);
    public boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(c3.p pVar) {
        c3.l lVar;
        int i10;
        e2.x xVar = new e2.x(10);
        int i11 = 0;
        while (true) {
            lVar = (c3.l) pVar;
            lVar.j(xVar.a, 0, 10, false);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z10 = xVar.z();
            i11 += z10 + 10;
            lVar.v(z10, false);
        }
        lVar.f = 0;
        lVar.v(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            lVar.j(xVar.a, 0, 7, false);
            xVar.N(0);
            int H = xVar.H();
            if (H == 44096 || H == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = xVar.a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (H == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    break;
                }
                lVar.v(i10 - 7, false);
            } else {
                lVar.f = 0;
                i13++;
                if (i13 - i11 >= 8192) {
                    break;
                }
                lVar.v(i13, false);
                i12 = 0;
            }
        }
    }

    @Override // c3.o
    public final void c(c3.q qVar) {
        this.a.d(qVar, new f0(0, 1));
        qVar.D();
        qVar.K(new c3.t(-9223372036854775807L));
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        this.c = false;
        this.a.c();
    }

    @Override // c3.o
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    @Override // c3.o
    public final int f(c3.p pVar, c3.s sVar) {
        e2.x xVar = this.b;
        int read = pVar.read(xVar.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z10 = this.c;
        b bVar = this.a;
        if (!z10) {
            bVar.o = 0L;
            this.c = true;
        }
        bVar.a(xVar);
        return 0;
    }

    @Override // c3.o
    public final c3.o b() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
