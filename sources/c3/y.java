package c3;

import a8.yb;
import e2.n0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class y implements b0 {
    public final d5.z a;
    public final d5.z b;
    public long c;

    public y(long j10, long[] jArr, long[] jArr2) {
        yb.g(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new d5.z(length, 3);
            this.b = new d5.z(length, 3);
        } else {
            int i10 = length + 1;
            d5.z zVar = new d5.z(i10, 3);
            this.a = zVar;
            d5.z zVar2 = new d5.z(i10, 3);
            this.b = zVar2;
            zVar.c(0L);
            zVar2.c(0L);
        }
        this.a.d(jArr);
        this.b.d(jArr2);
        this.c = j10;
    }

    @Override // c3.b0
    public final boolean d() {
        return this.b.b > 0;
    }

    @Override // c3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // c3.b0
    public final a0 f(long j10) {
        d5.z zVar = this.b;
        if (zVar.b == 0) {
            c0 c0Var = c0.c;
            return new a0(c0Var, c0Var);
        }
        int c10 = n0.c(zVar, j10);
        long j11 = zVar.j(c10);
        d5.z zVar2 = this.a;
        c0 c0Var2 = new c0(j11, zVar2.j(c10));
        if (j11 == j10 || c10 == zVar.b - 1) {
            return new a0(c0Var2, c0Var2);
        }
        int i10 = c10 + 1;
        return new a0(c0Var2, new c0(zVar.j(i10), zVar2.j(i10)));
    }

    @Override // c3.b0
    public final long h() {
        return this.c;
    }
}
