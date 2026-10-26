package j4;

import f9.i0;
import f9.s1;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a implements c3.o {
    public final b a = new b("audio/ac3");
    public final e2.x b = new e2.x(2786);
    public boolean c;

    @Override // c3.o
    public final boolean a(c3.p pVar) {
        c3.l lVar;
        int e;
        e2.x xVar = new e2.x(10);
        int i10 = 0;
        while (true) {
            lVar = (c3.l) pVar;
            lVar.h(xVar.a, 0, 10, false);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z10 = xVar.z();
            i10 += z10 + 10;
            lVar.s(z10, false);
        }
        lVar.f = 0;
        lVar.s(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            lVar.h(xVar.a, 0, 6, false);
            xVar.N(0);
            if (xVar.H() != 2935) {
                lVar.f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    break;
                }
                lVar.s(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = xVar.a;
                if (bArr.length < 6) {
                    e = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    e = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b10 = bArr[4];
                    e = c3.b.e((b10 & 192) >> 6, b10 & 63);
                }
                if (e == -1) {
                    break;
                }
                lVar.s(e - 6, false);
            }
        }
        return false;
    }

    @Override // c3.o
    public final void c(c3.q qVar) {
        this.a.d(qVar, new f0(0, 1));
        qVar.Q0();
        qVar.D1(new c3.t(-9223372036854775807L));
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        this.c = false;
        this.a.c();
    }

    @Override // c3.o
    public final List e() {
        f9.g0 g0Var = i0.b;
        return s1.e;
    }

    @Override // c3.o
    public final int f(c3.p pVar, c3.s sVar) {
        e2.x xVar = this.b;
        int read = pVar.read(xVar.a, 0, 2786);
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
