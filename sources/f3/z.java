package f3;

import a8.ma;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class z implements c0 {
    public final b3.j a;
    public final b3.j b;
    public long c;

    public z(long j3, long[] jArr, long[] jArr2) {
        ma.f(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new b3.j(length, 6);
            this.b = new b3.j(length, 6);
        } else {
            int i7 = length + 1;
            b3.j jVar = new b3.j(i7, 6);
            this.a = jVar;
            b3.j jVar2 = new b3.j(i7, 6);
            this.b = jVar2;
            jVar.c(0L);
            jVar2.c(0L);
        }
        this.a.d(jArr);
        this.b.d(jArr2);
        this.c = j3;
    }

    @Override // f3.c0
    public final boolean d() {
        return this.b.b > 0;
    }

    @Override // f3.c0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // f3.c0
    public final b0 f(long j3) {
        b3.j jVar = this.b;
        if (jVar.b == 0) {
            d0 d0Var = d0.c;
            return new b0(d0Var, d0Var);
        }
        int c10 = h2.l0.c(jVar, j3);
        long m10 = jVar.m(c10);
        b3.j jVar2 = this.a;
        d0 d0Var2 = new d0(m10, jVar2.m(c10));
        if (m10 == j3 || c10 == jVar.b - 1) {
            return new b0(d0Var2, d0Var2);
        }
        int i7 = c10 + 1;
        return new b0(d0Var2, new d0(jVar.m(i7), jVar2.m(i7)));
    }

    @Override // f3.c0
    public final long h() {
        return this.c;
    }
}
