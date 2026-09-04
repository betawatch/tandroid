package j4;

import e9.a1;
import e9.i0;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class a implements c3.o {
    public final b a = new b("audio/ac3");
    public final e2.v b = new e2.v(2786);
    public boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        r5.f = 0;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(c3.p pVar) {
        c3.l lVar;
        int f7;
        e2.v vVar = new e2.v(10);
        int i10 = 0;
        while (true) {
            lVar = (c3.l) pVar;
            lVar.j(vVar.a, 0, 10, false);
            vVar.J(0);
            if (vVar.A() != 4801587) {
                break;
            }
            vVar.K(3);
            int w10 = vVar.w();
            i10 += w10 + 10;
            lVar.v(w10, false);
        }
        lVar.f = 0;
        lVar.v(i10, false);
        int i11 = i10;
        loop1: while (true) {
            int i12 = 0;
            while (true) {
                lVar.j(vVar.a, 0, 6, false);
                vVar.J(0);
                if (vVar.D() != 2935) {
                    break;
                }
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = vVar.a;
                if (bArr.length < 6) {
                    f7 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    f7 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b10 = bArr[4];
                    f7 = c3.b.f((b10 & 192) >> 6, b10 & 63);
                }
                if (f7 == -1) {
                    break loop1;
                }
                lVar.v(f7 - 6, false);
            }
            lVar.v(i11, false);
        }
        return false;
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
        int read = pVar.read(vVar.a, 0, 2786);
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
