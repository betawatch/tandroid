package l4;

import d2.v0;
import g9.i0;
import g9.s1;
import java.io.EOFException;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d implements e3.o {
    public final int a;
    public final g2.y d;
    public final c4.f e;
    public e3.q f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final e b = new e(0, null, "audio/mp4a-latm", true);
    public final g2.y c = new g2.y(2048);
    public int i = -1;
    public long h = -1;

    public d(int i3) {
        this.a = i3;
        g2.y yVar = new g2.y(10);
        this.d = yVar;
        byte[] bArr = yVar.a;
        this.e = new c4.f(bArr, bArr.length);
    }

    @Override // e3.o
    public final boolean b(e3.p pVar) {
        int g7 = g(pVar);
        int i3 = g7;
        int i10 = 0;
        int i11 = 0;
        do {
            g2.y yVar = this.d;
            e3.l lVar = (e3.l) pVar;
            lVar.h(yVar.a, 0, 2, false);
            yVar.N(0);
            if ((yVar.H() & 65526) == 65520) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                lVar.h(yVar.a, 0, 4, false);
                c4.f fVar = this.e;
                fVar.J(14);
                int j10 = fVar.j(13);
                if (j10 <= 6) {
                    i3++;
                    lVar.f = 0;
                    lVar.w(i3, false);
                } else {
                    lVar.w(j10 - 6, false);
                    i11 += j10;
                }
            } else {
                i3++;
                lVar.f = 0;
                lVar.w(i3, false);
            }
            i10 = 0;
            i11 = 0;
        } while (i3 - g7 < 8192);
        return false;
    }

    @Override // e3.o
    public final void c(e3.q qVar) {
        this.f = qVar;
        this.b.f(qVar, new f0(0, 1));
        qVar.L();
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
        this.k = false;
        this.b.a();
        this.g = j11;
    }

    @Override // e3.o
    public final List e() {
        g9.g0 g0Var = i0.b;
        return s1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    @Override // e3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(e3.p pVar, e3.s sVar) {
        int i3;
        e eVar;
        this.f.getClass();
        long length = pVar.getLength();
        int i10 = this.a;
        int i11 = 0;
        if ((i10 & 1) != 0 && length != -1) {
            c4.f fVar = this.e;
            g2.y yVar = this.d;
            if (!this.j) {
                this.i = -1;
                pVar.o();
                long j10 = 0;
                if (pVar.getPosition() == 0) {
                    g(pVar);
                }
                int i12 = 0;
                while (true) {
                    try {
                        if (!pVar.h(yVar.a, i11, 2, true)) {
                            break;
                        }
                        yVar.N(i11);
                        if (((yVar.H() & 65526) == 65520 ? 1 : i11) == 0) {
                            i12 = i11;
                            break;
                        }
                        if (!pVar.h(yVar.a, i11, 4, true)) {
                            break;
                        }
                        fVar.J(14);
                        int j11 = fVar.j(13);
                        if (j11 <= 6) {
                            this.j = true;
                            throw v0.a(null, "Malformed ADTS stream");
                        }
                        j10 += j11;
                        i12++;
                        if (i12 != 1000 && pVar.w(j11 - 6, true)) {
                            i11 = 0;
                        }
                    } catch (EOFException unused) {
                    }
                }
                pVar.o();
                if (i12 > 0) {
                    this.i = (int) (j10 / i12);
                } else {
                    this.i = -1;
                }
                this.j = true;
            }
        }
        g2.y yVar2 = this.c;
        int read = pVar.read(yVar2.a, 0, 2048);
        boolean z10 = read == -1;
        boolean z11 = this.l;
        e eVar2 = this.b;
        if (!z11) {
            boolean z12 = (i10 & 1) != 0 && this.i > 0;
            if (!z12 || eVar2.s != -9223372036854775807L || z10) {
                if (z12) {
                    long j12 = eVar2.s;
                    if (j12 != -9223372036854775807L) {
                        e3.q qVar = this.f;
                        int i13 = this.i;
                        i3 = -1;
                        eVar = eVar2;
                        qVar.f(new e3.k(length, this.h, (int) ((i13 * 8000000) / j12), i13, false, true));
                        this.l = true;
                        if (z10) {
                            return i3;
                        }
                        yVar2.N(0);
                        yVar2.M(read);
                        if (!this.k) {
                            eVar.u = this.g;
                            this.k = true;
                        }
                        eVar.c(yVar2);
                        return 0;
                    }
                }
                i3 = -1;
                eVar = eVar2;
                this.f.f(new e3.t(-9223372036854775807L));
                this.l = true;
                if (z10) {
                }
            }
        }
        i3 = -1;
        eVar = eVar2;
        if (z10) {
        }
    }

    public final int g(e3.p pVar) {
        int i3 = 0;
        while (true) {
            g2.y yVar = this.d;
            pVar.c(0, 10, yVar.a);
            yVar.N(0);
            if (yVar.D() != 4801587) {
                break;
            }
            yVar.O(3);
            int z10 = yVar.z();
            i3 += z10 + 10;
            pVar.n(z10);
        }
        pVar.o();
        pVar.n(i3);
        if (this.h == -1) {
            this.h = i3;
        }
        return i3;
    }

    @Override // e3.o
    public final e3.o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
