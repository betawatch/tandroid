package l4;

import g9.i0;
import g9.s1;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements e3.o {
    public final b a = new b("audio/ac3");
    public final g2.y b = new g2.y(2786);
    public boolean c;

    @Override // e3.o
    public final boolean b(e3.p pVar) {
        e3.l lVar;
        int e10;
        g2.y yVar = new g2.y(10);
        int i3 = 0;
        while (true) {
            lVar = (e3.l) pVar;
            lVar.h(yVar.a, 0, 10, false);
            yVar.N(0);
            if (yVar.D() != 4801587) {
                break;
            }
            yVar.O(3);
            int z10 = yVar.z();
            i3 += z10 + 10;
            lVar.w(z10, false);
        }
        lVar.f = 0;
        lVar.w(i3, false);
        int i10 = 0;
        int i11 = i3;
        while (true) {
            lVar.h(yVar.a, 0, 6, false);
            yVar.N(0);
            if (yVar.H() != 2935) {
                lVar.f = 0;
                i11++;
                if (i11 - i3 >= 8192) {
                    break;
                }
                lVar.w(i11, false);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                byte[] bArr = yVar.a;
                if (bArr.length < 6) {
                    e10 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    e10 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b10 = bArr[4];
                    e10 = e3.b.e((b10 & 192) >> 6, b10 & 63);
                }
                if (e10 == -1) {
                    break;
                }
                lVar.w(e10 - 6, false);
            }
        }
        return false;
    }

    @Override // e3.o
    public final void c(e3.q qVar) {
        this.a.f(qVar, new f0(0, 1));
        qVar.L();
        qVar.f(new e3.t(-9223372036854775807L));
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
        this.c = false;
        this.a.a();
    }

    @Override // e3.o
    public final List e() {
        g9.g0 g0Var = i0.b;
        return s1.e;
    }

    @Override // e3.o
    public final int f(e3.p pVar, e3.s sVar) {
        g2.y yVar = this.b;
        int read = pVar.read(yVar.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        yVar.N(0);
        yVar.M(read);
        boolean z10 = this.c;
        b bVar = this.a;
        if (!z10) {
            bVar.o = 0L;
            this.c = true;
        }
        bVar.c(yVar);
        return 0;
    }

    @Override // e3.o
    public final e3.o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
