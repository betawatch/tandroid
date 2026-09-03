package b4;

import j3.r1;
import java.io.EOFException;
import org.telegram.ui.Components.jb;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d implements r3.k {
    public final int a;
    public final h5.w d;
    public final h5.v e;
    public r3.m f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final e b = new e(null, true);
    public final h5.w c = new h5.w(2048);
    public int i = -1;
    public long h = -1;

    public d(int i10) {
        this.a = i10;
        h5.w wVar = new h5.w(10);
        this.d = wVar;
        byte[] bArr = wVar.a;
        this.e = new h5.v(bArr, bArr.length);
    }

    public final int a(r3.l lVar) {
        int i10 = 0;
        while (true) {
            h5.w wVar = this.d;
            lVar.b(0, 10, wVar.a);
            wVar.F(0);
            if (wVar.w() != 4801587) {
                break;
            }
            wVar.G(3);
            int t6 = wVar.t();
            i10 += t6 + 10;
            lVar.i(t6);
        }
        lVar.m();
        lVar.i(i10);
        if (this.h == -1) {
            this.h = i10;
        }
        return i10;
    }

    @Override // r3.k
    public final void d(long j10, long j11) {
        this.k = false;
        this.b.b();
        this.g = j11;
    }

    @Override // r3.k
    public final void e(r3.m mVar) {
        this.f = mVar;
        this.b.c(mVar, new h0(0, 1));
        mVar.j1();
    }

    @Override // r3.k
    public final int h(r3.l lVar, jb jbVar) {
        h5.a.j(this.f);
        long j10 = ((r3.h) lVar).c;
        int i10 = this.a;
        int i11 = 4;
        if ((i10 & 1) != 0 && j10 != -1) {
            h5.v vVar = this.e;
            h5.w wVar = this.d;
            if (!this.j) {
                this.i = -1;
                r3.h hVar = (r3.h) lVar;
                hVar.f = 0;
                long j11 = 0;
                if (hVar.d == 0) {
                    a(lVar);
                }
                int i12 = 0;
                while (true) {
                    try {
                        r3.h hVar2 = (r3.h) lVar;
                        if (!hVar2.f(wVar.a, 0, 2, true)) {
                            break;
                        }
                        wVar.F(0);
                        if (!((wVar.z() & 65526) == 65520)) {
                            i12 = 0;
                            break;
                        }
                        if (!hVar2.f(wVar.a, 0, i11, true)) {
                            break;
                        }
                        vVar.p(14);
                        int i13 = vVar.i(13);
                        if (i13 <= 6) {
                            this.j = true;
                            throw r1.a("Malformed ADTS stream", null);
                        }
                        j11 += i13;
                        i12++;
                        if (i12 != 1000 && hVar2.a(i13 - 6, true)) {
                            i11 = 4;
                        }
                    } catch (EOFException unused) {
                    }
                }
                hVar.f = 0;
                if (i12 > 0) {
                    this.i = (int) (j11 / i12);
                } else {
                    this.i = -1;
                }
                this.j = true;
            }
        }
        h5.w wVar2 = this.c;
        int read = ((r3.h) lVar).read(wVar2.a, 0, 2048);
        boolean z4 = read == -1;
        boolean z10 = this.l;
        e eVar = this.b;
        if (!z10) {
            boolean z11 = (i10 & 1) != 0 && this.i > 0;
            if (!z11 || eVar.q != -9223372036854775807L || z4) {
                if (z11) {
                    long j12 = eVar.q;
                    if (j12 != -9223372036854775807L) {
                        r3.m mVar = this.f;
                        int i14 = this.i;
                        mVar.h2(new r3.g(j10, (int) ((i14 * 8000000) / j12), i14, false, this.h));
                        this.l = true;
                    }
                }
                this.f.h2(new r3.n(-9223372036854775807L));
                this.l = true;
            }
        }
        if (z4) {
            return -1;
        }
        wVar2.F(0);
        wVar2.E(read);
        if (!this.k) {
            eVar.e(4, this.g);
            this.k = true;
        }
        eVar.a(wVar2);
        return 0;
    }

    @Override // r3.k
    public final boolean i(r3.l lVar) {
        int a2 = a(lVar);
        int i10 = a2;
        int i11 = 0;
        int i12 = 0;
        do {
            h5.w wVar = this.d;
            r3.h hVar = (r3.h) lVar;
            hVar.f(wVar.a, 0, 2, false);
            wVar.F(0);
            if ((wVar.z() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                hVar.f(wVar.a, 0, 4, false);
                h5.v vVar = this.e;
                vVar.p(14);
                int i13 = vVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    hVar.f = 0;
                    hVar.a(i10, false);
                } else {
                    hVar.a(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                hVar.f = 0;
                hVar.a(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - a2 < 8192);
        return false;
    }

    @Override // r3.k
    public final void release() {
    }
}
