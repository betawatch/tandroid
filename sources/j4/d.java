package j4;

import b2.s0;
import e9.a1;
import e9.i0;
import java.io.EOFException;
import java.util.List;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class d implements c3.o {
    public final int a;
    public final e2.v d;
    public final a4.h e;
    public c3.q f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final e b = new e(0, null, MediaController.AUDIO_MIME_TYPE, true);
    public final e2.v c = new e2.v(2048);
    public int i = -1;
    public long h = -1;

    public d(int i10) {
        this.a = i10;
        e2.v vVar = new e2.v(10);
        this.d = vVar;
        byte[] bArr = vVar.a;
        this.e = new a4.h(bArr, bArr.length);
    }

    @Override // c3.o
    public final boolean a(c3.p pVar) {
        int b10 = b(pVar);
        int i10 = b10;
        int i11 = 0;
        int i12 = 0;
        do {
            e2.v vVar = this.d;
            c3.l lVar = (c3.l) pVar;
            lVar.h(vVar.a, 0, 2, false);
            vVar.J(0);
            if ((vVar.D() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.h(vVar.a, 0, 4, false);
                a4.h hVar = this.e;
                hVar.q(14);
                int i13 = hVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    lVar.f = 0;
                    lVar.t(i10, false);
                } else {
                    lVar.t(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                lVar.f = 0;
                lVar.t(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - b10 < 8192);
        return false;
    }

    public final int b(c3.p pVar) {
        int i10 = 0;
        while (true) {
            e2.v vVar = this.d;
            pVar.a(0, 10, vVar.a);
            vVar.J(0);
            if (vVar.A() != 4801587) {
                break;
            }
            vVar.K(3);
            int w10 = vVar.w();
            i10 += w10 + 10;
            pVar.l(w10);
        }
        pVar.p();
        pVar.l(i10);
        if (this.h == -1) {
            this.h = i10;
        }
        return i10;
    }

    @Override // c3.o
    public final void g(c3.q qVar) {
        this.f = qVar;
        this.b.d(qVar, new f0(0, 1));
        qVar.e1();
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        this.k = false;
        this.b.c();
        this.g = j10;
    }

    @Override // c3.o
    public final List i() {
        e9.g0 g0Var = i0.b;
        return a1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(c3.p pVar, c3.s sVar) {
        e eVar;
        int i10;
        e2.d.h(this.f);
        long length = pVar.getLength();
        int i11 = this.a;
        if ((i11 & 1) != 0 && length != -1) {
            a4.h hVar = this.e;
            e2.v vVar = this.d;
            if (!this.j) {
                this.i = -1;
                pVar.p();
                long j3 = 0;
                if (pVar.getPosition() == 0) {
                    b(pVar);
                }
                int i12 = 0;
                while (true) {
                    try {
                        if (!pVar.h(vVar.a, 0, 2, true)) {
                            break;
                        }
                        vVar.J(0);
                        if (!((vVar.D() & 65526) == 65520)) {
                            i12 = 0;
                            break;
                        }
                        if (!pVar.h(vVar.a, 0, 4, true)) {
                            break;
                        }
                        hVar.q(14);
                        int i13 = hVar.i(13);
                        if (i13 <= 6) {
                            this.j = true;
                            throw s0.a(null, "Malformed ADTS stream");
                        }
                        j3 += i13;
                        i12++;
                        if (i12 != 1000 && pVar.t(i13 - 6, true)) {
                        }
                    } catch (EOFException unused) {
                    }
                }
                pVar.p();
                if (i12 > 0) {
                    this.i = (int) (j3 / i12);
                } else {
                    this.i = -1;
                }
                this.j = true;
            }
        }
        e2.v vVar2 = this.c;
        int read = pVar.read(vVar2.a, 0, 2048);
        boolean z10 = read == -1;
        boolean z11 = this.l;
        e eVar2 = this.b;
        if (!z11) {
            boolean z12 = (i11 & 1) != 0 && this.i > 0;
            if (!z12 || eVar2.s != -9223372036854775807L || z10) {
                if (z12) {
                    long j10 = eVar2.s;
                    if (j10 != -9223372036854775807L) {
                        c3.q qVar = this.f;
                        int i14 = this.i;
                        eVar = eVar2;
                        i10 = -1;
                        qVar.X1(new c3.k(length, (int) ((i14 * 8000000) / j10), i14, false, this.h));
                        this.l = true;
                        if (z10) {
                            return i10;
                        }
                        vVar2.J(0);
                        vVar2.I(read);
                        if (!this.k) {
                            eVar.u = this.g;
                            this.k = true;
                        }
                        eVar.a(vVar2);
                        return 0;
                    }
                }
                eVar = eVar2;
                i10 = -1;
                this.f.X1(new c3.t(-9223372036854775807L));
                this.l = true;
                if (z10) {
                }
            }
        }
        eVar = eVar2;
        i10 = -1;
        if (z10) {
        }
    }

    @Override // c3.o
    public final c3.o c() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
