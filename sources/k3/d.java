package k3;

import c3.a0;
import c3.b0;
import c3.c0;
import c3.v;
import e6.n;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class d extends v {
    public final /* synthetic */ b0 b;
    public final /* synthetic */ n c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.c = nVar;
        this.b = b0Var2;
    }

    @Override // c3.v, c3.b0
    public final a0 j(long j3) {
        a0 j10 = this.b.j(j3);
        c0 c0Var = j10.a;
        long j11 = c0Var.a;
        long j12 = c0Var.b;
        long j13 = this.c.b;
        c0 c0Var2 = new c0(j11, j12 + j13);
        c0 c0Var3 = j10.b;
        return new a0(c0Var2, new c0(c0Var3.a, c0Var3.b + j13));
    }
}
