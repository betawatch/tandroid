package e3;

import b8.zb;
import g2.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y implements b0 {
    public final e5.u a;
    public final e5.u b;
    public long c;

    public y(long j10, long[] jArr, long[] jArr2) {
        zb.f(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new e5.u(length, 7);
            this.b = new e5.u(length, 7);
        } else {
            int i3 = length + 1;
            e5.u uVar = new e5.u(i3, 7);
            this.a = uVar;
            e5.u uVar2 = new e5.u(i3, 7);
            this.b = uVar2;
            uVar.c(0L);
            uVar2.c(0L);
        }
        this.a.d(jArr);
        this.b.d(jArr2);
        this.c = j10;
    }

    @Override // e3.b0
    public final boolean d() {
        return this.b.b > 0;
    }

    @Override // e3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // e3.b0
    public final a0 f(long j10) {
        e5.u uVar = this.b;
        if (uVar.b == 0) {
            c0 c0Var = c0.c;
            return new a0(c0Var, c0Var);
        }
        int c2 = n0.c(uVar, j10);
        long j11 = uVar.j(c2);
        e5.u uVar2 = this.a;
        c0 c0Var2 = new c0(j11, uVar2.j(c2));
        if (j11 == j10 || c2 == uVar.b - 1) {
            return new a0(c0Var2, c0Var2);
        }
        int i3 = c2 + 1;
        return new a0(c0Var2, new c0(uVar.j(i3), uVar2.j(i3)));
    }

    @Override // e3.b0
    public final long h() {
        return this.c;
    }
}
