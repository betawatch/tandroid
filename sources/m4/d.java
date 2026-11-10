package m4;

import e2.t0;
import h9.i0;
import h9.t1;
import java.io.EOFException;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class d implements f3.o {
    public final int a;
    public final h2.x d;
    public final d4.f e;
    public f3.q f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final e b = new e(0, null, "audio/mp4a-latm", true);
    public final h2.x c = new h2.x(2048);
    public int i = -1;
    public long h = -1;

    public d(int i7) {
        this.a = i7;
        h2.x xVar = new h2.x(10);
        this.d = xVar;
        byte[] bArr = xVar.a;
        this.e = new d4.f(bArr, bArr.length);
    }

    @Override // f3.o
    public final boolean b(f3.p pVar) {
        int g10 = g(pVar);
        int i7 = g10;
        int i10 = 0;
        int i11 = 0;
        do {
            h2.x xVar = this.d;
            f3.l lVar = (f3.l) pVar;
            lVar.k(xVar.a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 65526) == 65520) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                lVar.k(xVar.a, 0, 4, false);
                d4.f fVar = this.e;
                fVar.J(14);
                int j3 = fVar.j(13);
                if (j3 <= 6) {
                    i7++;
                    lVar.f = 0;
                    lVar.v(i7, false);
                } else {
                    lVar.v(j3 - 6, false);
                    i11 += j3;
                }
            } else {
                i7++;
                lVar.f = 0;
                lVar.v(i7, false);
            }
            i10 = 0;
            i11 = 0;
        } while (i7 - g10 < 8192);
        return false;
    }

    @Override // f3.o
    public final void c(f3.q qVar) {
        this.f = qVar;
        this.b.g(qVar, new g0(0, 1));
        qVar.U0();
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        this.k = false;
        this.b.d();
        this.g = j10;
    }

    @Override // f3.o
    public final List e() {
        h9.g0 g0Var = i0.b;
        return t1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    @Override // f3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(f3.p pVar, f3.s sVar) {
        int i7;
        e eVar;
        this.f.getClass();
        long length = pVar.getLength();
        int i10 = this.a;
        int i11 = 0;
        if ((i10 & 1) != 0 && length != -1) {
            d4.f fVar = this.e;
            h2.x xVar = this.d;
            if (!this.j) {
                this.i = -1;
                pVar.q();
                long j3 = 0;
                if (pVar.getPosition() == 0) {
                    g(pVar);
                }
                int i12 = 0;
                while (true) {
                    try {
                        if (!pVar.k(xVar.a, i11, 2, true)) {
                            break;
                        }
                        xVar.N(i11);
                        if (((xVar.H() & 65526) == 65520 ? 1 : i11) == 0) {
                            i12 = i11;
                            break;
                        }
                        if (!pVar.k(xVar.a, i11, 4, true)) {
                            break;
                        }
                        fVar.J(14);
                        int j10 = fVar.j(13);
                        if (j10 <= 6) {
                            this.j = true;
                            throw t0.a(null, "Malformed ADTS stream");
                        }
                        j3 += j10;
                        i12++;
                        if (i12 != 1000 && pVar.v(j10 - 6, true)) {
                            i11 = 0;
                        }
                    } catch (EOFException unused) {
                    }
                }
                pVar.q();
                if (i12 > 0) {
                    this.i = (int) (j3 / i12);
                } else {
                    this.i = -1;
                }
                this.j = true;
            }
        }
        h2.x xVar2 = this.c;
        int read = pVar.read(xVar2.a, 0, 2048);
        boolean z9 = read == -1;
        boolean z10 = this.l;
        e eVar2 = this.b;
        if (!z10) {
            boolean z11 = (i10 & 1) != 0 && this.i > 0;
            if (!z11 || eVar2.s != -9223372036854775807L || z9) {
                if (z11) {
                    long j11 = eVar2.s;
                    if (j11 != -9223372036854775807L) {
                        f3.q qVar = this.f;
                        int i13 = this.i;
                        i7 = -1;
                        eVar = eVar2;
                        qVar.f(new f3.k(length, this.h, (int) ((i13 * 8000000) / j11), i13, false, true));
                        this.l = true;
                        if (z9) {
                            return i7;
                        }
                        xVar2.N(0);
                        xVar2.M(read);
                        if (!this.k) {
                            eVar.u = this.g;
                            this.k = true;
                        }
                        eVar.c(xVar2);
                        return 0;
                    }
                }
                i7 = -1;
                eVar = eVar2;
                this.f.f(new f3.t(-9223372036854775807L));
                this.l = true;
                if (z9) {
                }
            }
        }
        i7 = -1;
        eVar = eVar2;
        if (z9) {
        }
    }

    public final int g(f3.p pVar) {
        int i7 = 0;
        while (true) {
            h2.x xVar = this.d;
            pVar.b(0, 10, xVar.a);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z9 = xVar.z();
            i7 += z9 + 10;
            pVar.m(z9);
        }
        pVar.q();
        pVar.m(i7);
        if (this.h == -1) {
            this.h = i7;
        }
        return i7;
    }

    @Override // f3.o
    public final f3.o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
