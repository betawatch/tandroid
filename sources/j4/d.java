package j4;

import b2.w0;
import e9.l0;
import e9.n0;
import e9.x1;
import java.io.EOFException;
import java.util.List;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class d implements c3.o {
    public final int a;
    public final e2.x d;
    public final a4.g e;
    public c3.q f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final e b = new e(0, null, MediaController.AUDIO_MIME_TYPE, true);
    public final e2.x c = new e2.x(2048);
    public int i = -1;
    public long h = -1;

    public d(int i10) {
        this.a = i10;
        e2.x xVar = new e2.x(10);
        this.d = xVar;
        byte[] bArr = xVar.a;
        this.e = new a4.g(bArr, bArr.length);
    }

    @Override // c3.o
    public final boolean a(c3.p pVar) {
        int g10 = g(pVar);
        int i10 = g10;
        int i11 = 0;
        int i12 = 0;
        do {
            e2.x xVar = this.d;
            c3.l lVar = (c3.l) pVar;
            lVar.j(xVar.a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.j(xVar.a, 0, 4, false);
                a4.g gVar = this.e;
                gVar.m(14);
                int g11 = gVar.g(13);
                if (g11 <= 6) {
                    i10++;
                    lVar.f = 0;
                    lVar.v(i10, false);
                } else {
                    lVar.v(g11 - 6, false);
                    i12 += g11;
                }
            } else {
                i10++;
                lVar.f = 0;
                lVar.v(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - g10 < 8192);
        return false;
    }

    @Override // c3.o
    public final void c(c3.q qVar) {
        this.f = qVar;
        this.b.d(qVar, new f0(0, 1));
        qVar.H();
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        this.k = false;
        this.b.c();
        this.g = j11;
    }

    @Override // c3.o
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(c3.p pVar, c3.s sVar) {
        int i10;
        e eVar;
        this.f.getClass();
        long length = pVar.getLength();
        int i11 = this.a;
        int i12 = 0;
        if ((i11 & 1) != 0 && length != -1) {
            a4.g gVar = this.e;
            e2.x xVar = this.d;
            if (!this.j) {
                this.i = -1;
                pVar.q();
                long j10 = 0;
                if (pVar.getPosition() == 0) {
                    g(pVar);
                }
                int i13 = 0;
                while (true) {
                    try {
                        if (!pVar.j(xVar.a, i12, 2, true)) {
                            break;
                        }
                        xVar.N(i12);
                        if (((xVar.H() & 65526) == 65520 ? 1 : i12) == 0) {
                            i13 = i12;
                            break;
                        }
                        if (!pVar.j(xVar.a, i12, 4, true)) {
                            break;
                        }
                        gVar.m(14);
                        int g10 = gVar.g(13);
                        if (g10 <= 6) {
                            this.j = true;
                            throw w0.a(null, "Malformed ADTS stream");
                        }
                        j10 += g10;
                        i13++;
                        if (i13 != 1000 && pVar.v(g10 - 6, true)) {
                            i12 = 0;
                        }
                    } catch (EOFException unused) {
                    }
                }
                pVar.q();
                if (i13 > 0) {
                    this.i = (int) (j10 / i13);
                } else {
                    this.i = -1;
                }
                this.j = true;
            }
        }
        e2.x xVar2 = this.c;
        int read = pVar.read(xVar2.a, 0, 2048);
        boolean z10 = read == -1;
        boolean z11 = this.l;
        e eVar2 = this.b;
        if (!z11) {
            boolean z12 = (i11 & 1) != 0 && this.i > 0;
            if (!z12 || eVar2.s != -9223372036854775807L || z10) {
                if (z12) {
                    long j11 = eVar2.s;
                    if (j11 != -9223372036854775807L) {
                        c3.q qVar = this.f;
                        int i14 = this.i;
                        i10 = -1;
                        eVar = eVar2;
                        qVar.g0(new c3.k(length, this.h, (int) ((i14 * 8000000) / j11), i14, false, true));
                        this.l = true;
                        if (z10) {
                            return i10;
                        }
                        xVar2.N(0);
                        xVar2.M(read);
                        if (!this.k) {
                            eVar.u = this.g;
                            this.k = true;
                        }
                        eVar.a(xVar2);
                        return 0;
                    }
                }
                i10 = -1;
                eVar = eVar2;
                this.f.g0(new c3.t(-9223372036854775807L));
                this.l = true;
                if (z10) {
                }
            }
        }
        i10 = -1;
        eVar = eVar2;
        if (z10) {
        }
    }

    public final int g(c3.p pVar) {
        int i10 = 0;
        while (true) {
            e2.x xVar = this.d;
            pVar.b(0, 10, xVar.a);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z10 = xVar.z();
            i10 += z10 + 10;
            pVar.l(z10);
        }
        pVar.q();
        pVar.l(i10);
        if (this.h == -1) {
            this.h = i10;
        }
        return i10;
    }

    @Override // c3.o
    public final c3.o b() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
