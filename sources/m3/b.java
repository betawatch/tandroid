package m3;

import c8.m9;
import f3.e0;
import f3.l;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.List;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class b implements o {
    public final o a;
    public final boolean b;

    public b(int i7) {
        boolean z9 = (i7 & 1) != 0;
        this.b = z9;
        if (z9) {
            this.a = new e0(-1, -1, "image/heif");
        } else {
            this.a = new a();
        }
    }

    @Override // f3.o
    public final boolean b(p pVar) {
        return this.b ? m9.a((l) pVar, false) : this.a.b(pVar);
    }

    @Override // f3.o
    public final void c(q qVar) {
        this.a.c(qVar);
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        this.a.d(j3, j10);
    }

    @Override // f3.o
    public final List e() {
        g0 g0Var = i0.b;
        return t1.e;
    }

    @Override // f3.o
    public final int f(p pVar, s sVar) {
        return this.a.f(pVar, sVar);
    }

    @Override // f3.o
    public final void release() {
        this.a.release();
    }

    @Override // f3.o
    public final o a() {
        return this;
    }
}
