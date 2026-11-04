package l3;

import b8.sd;
import e3.d0;
import e3.l;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements o {
    public final o a;
    public final boolean b;

    public b(int i3) {
        boolean z10 = (i3 & 1) != 0;
        this.b = z10;
        if (z10) {
            this.a = new d0(-1, -1, "image/heif");
        } else {
            this.a = new a();
        }
    }

    @Override // e3.o
    public final boolean b(p pVar) {
        return this.b ? sd.a((l) pVar, false) : this.a.b(pVar);
    }

    @Override // e3.o
    public final void c(q qVar) {
        this.a.c(qVar);
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
        this.a.d(j10, j11);
    }

    @Override // e3.o
    public final List e() {
        g0 g0Var = i0.b;
        return s1.e;
    }

    @Override // e3.o
    public final int f(p pVar, s sVar) {
        return this.a.f(pVar, sVar);
    }

    @Override // e3.o
    public final void release() {
        this.a.release();
    }

    @Override // e3.o
    public final o a() {
        return this;
    }
}
