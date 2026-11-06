package f3;

import a8.ia;
import h2.m0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class z implements c0 {
    public final f5.u a;
    public final f5.u b;
    public long c;

    public z(long j3, long[] jArr, long[] jArr2) {
        ia.f(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new f5.u(length, 7);
            this.b = new f5.u(length, 7);
        } else {
            int i7 = length + 1;
            f5.u uVar = new f5.u(i7, 7);
            this.a = uVar;
            f5.u uVar2 = new f5.u(i7, 7);
            this.b = uVar2;
            uVar.c(0L);
            uVar2.c(0L);
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
        f5.u uVar = this.b;
        if (uVar.b == 0) {
            d0 d0Var = d0.c;
            return new b0(d0Var, d0Var);
        }
        int c10 = m0.c(uVar, j3);
        long j10 = uVar.j(c10);
        f5.u uVar2 = this.a;
        d0 d0Var2 = new d0(j10, uVar2.j(c10));
        if (j10 == j3 || c10 == uVar.b - 1) {
            return new b0(d0Var2, d0Var2);
        }
        int i7 = c10 + 1;
        return new b0(d0Var2, new d0(uVar.j(i7), uVar2.j(i7)));
    }

    @Override // f3.c0
    public final long h() {
        return this.c;
    }
}
