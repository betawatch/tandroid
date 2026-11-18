package f3;

import a8.la;
import h2.l0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class y implements b0 {
    public final b3.j a;
    public final b3.j b;
    public long c;

    public y(long j3, long[] jArr, long[] jArr2) {
        la.f(jArr.length == jArr2.length);
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

    @Override // f3.b0
    public final boolean d() {
        return this.b.b > 0;
    }

    @Override // f3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // f3.b0
    public final a0 f(long j3) {
        b3.j jVar = this.b;
        if (jVar.b == 0) {
            c0 c0Var = c0.c;
            return new a0(c0Var, c0Var);
        }
        int c10 = l0.c(jVar, j3);
        long m10 = jVar.m(c10);
        b3.j jVar2 = this.a;
        c0 c0Var2 = new c0(m10, jVar2.m(c10));
        if (m10 == j3 || c10 == jVar.b - 1) {
            return new a0(c0Var2, c0Var2);
        }
        int i7 = c10 + 1;
        return new a0(c0Var2, new c0(jVar.m(i7), jVar2.m(i7)));
    }

    @Override // f3.b0
    public final long h() {
        return this.c;
    }
}
