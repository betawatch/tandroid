package j4;

import e9.a1;
import e9.i0;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class c implements c3.o {
    public final b a = new b(0, 1, null, "audio/ac4");
    public final e2.v b = new e2.v(16384);
    public boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r5.f = 0;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if ((r1 - r3) < 8192) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        return false;
     */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(c3.p pVar) {
        c3.l lVar;
        int i10;
        e2.v vVar = new e2.v(10);
        int i11 = 0;
        while (true) {
            lVar = (c3.l) pVar;
            lVar.j(vVar.a, 0, 10, false);
            vVar.J(0);
            if (vVar.A() != 4801587) {
                break;
            }
            vVar.K(3);
            int w10 = vVar.w();
            i11 += w10 + 10;
            lVar.v(w10, false);
        }
        lVar.f = 0;
        lVar.v(i11, false);
        int i12 = i11;
        loop1: while (true) {
            int i13 = 0;
            while (true) {
                int i14 = 7;
                lVar.j(vVar.a, 0, 7, false);
                vVar.J(0);
                int D = vVar.D();
                if (D != 44096 && D != 44097) {
                    break;
                }
                i13++;
                if (i13 >= 4) {
                    return true;
                }
                byte[] bArr = vVar.a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (D == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    break loop1;
                }
                lVar.v(i10 - 7, false);
            }
            lVar.v(i12, false);
        }
    }

    @Override // c3.o
    public final void g(c3.q qVar) {
        this.a.e(qVar, new f0(0, 1));
        qVar.Z0();
        qVar.P1(new c3.t(-9223372036854775807L));
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        this.c = false;
        this.a.d();
    }

    @Override // c3.o
    public final List i() {
        e9.g0 g0Var = i0.b;
        return a1.e;
    }

    @Override // c3.o
    public final int m(c3.p pVar, c3.s sVar) {
        e2.v vVar = this.b;
        int read = pVar.read(vVar.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        vVar.J(0);
        vVar.I(read);
        boolean z10 = this.c;
        b bVar = this.a;
        if (!z10) {
            bVar.o = 0L;
            this.c = true;
        }
        bVar.b(vVar);
        return 0;
    }

    @Override // c3.o
    public final c3.o c() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
