package j3;

import a8.ad;
import c3.d0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b implements o {
    public final o a;
    public final boolean b;

    public b(int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.b = z10;
        if (z10) {
            this.a = new d0(-1, -1, "image/heif");
        } else {
            this.a = new a();
        }
    }

    @Override // c3.o
    public final boolean a(p pVar) {
        return this.b ? ad.a((l) pVar, false) : this.a.a(pVar);
    }

    @Override // c3.o
    public final void c(q qVar) {
        this.a.c(qVar);
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        this.a.d(j10, j11);
    }

    @Override // c3.o
    public final List e() {
        g0 g0Var = i0.b;
        return s1.e;
    }

    @Override // c3.o
    public final int f(p pVar, s sVar) {
        return this.a.f(pVar, sVar);
    }

    @Override // c3.o
    public final void release() {
        this.a.release();
    }

    @Override // c3.o
    public final o b() {
        return this;
    }
}
