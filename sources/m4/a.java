package m4;

import h9.i0;
import h9.t1;
import java.util.List;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class a implements f3.o {
    public final b a = new b("audio/ac3");
    public final h2.x b = new h2.x(2786);
    public boolean c;

    @Override // f3.o
    public final boolean b(f3.p pVar) {
        f3.l lVar;
        int e10;
        h2.x xVar = new h2.x(10);
        int i7 = 0;
        while (true) {
            lVar = (f3.l) pVar;
            lVar.k(xVar.a, 0, 10, false);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z9 = xVar.z();
            i7 += z9 + 10;
            lVar.v(z9, false);
        }
        lVar.f = 0;
        lVar.v(i7, false);
        int i10 = 0;
        int i11 = i7;
        while (true) {
            lVar.k(xVar.a, 0, 6, false);
            xVar.N(0);
            if (xVar.H() != 2935) {
                lVar.f = 0;
                i11++;
                if (i11 - i7 >= 8192) {
                    break;
                }
                lVar.v(i11, false);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                byte[] bArr = xVar.a;
                if (bArr.length < 6) {
                    e10 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    e10 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b10 = bArr[4];
                    e10 = f3.b.e((b10 & 192) >> 6, b10 & 63);
                }
                if (e10 == -1) {
                    break;
                }
                lVar.v(e10 - 6, false);
            }
        }
        return false;
    }

    @Override // f3.o
    public final void c(f3.q qVar) {
        this.a.g(qVar, new g0(0, 1));
        qVar.U0();
        qVar.f(new f3.t(-9223372036854775807L));
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        this.c = false;
        this.a.d();
    }

    @Override // f3.o
    public final List e() {
        h9.g0 g0Var = i0.b;
        return t1.e;
    }

    @Override // f3.o
    public final int f(f3.p pVar, f3.s sVar) {
        h2.x xVar = this.b;
        int read = pVar.read(xVar.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z9 = this.c;
        b bVar = this.a;
        if (!z9) {
            bVar.o = 0L;
            this.c = true;
        }
        bVar.c(xVar);
        return 0;
    }

    @Override // f3.o
    public final f3.o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
