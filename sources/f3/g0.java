package f3;

import a8.va;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class g0 extends v {
    public final /* synthetic */ b0 b;
    public final /* synthetic */ va c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(va vaVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.c = vaVar;
        this.b = b0Var2;
    }

    @Override // f3.v, f3.b0
    public final a0 f(long j3) {
        a0 f10 = this.b.f(j3);
        c0 c0Var = f10.a;
        long j10 = c0Var.a;
        long j11 = c0Var.b;
        long j12 = this.c.b;
        c0 c0Var2 = new c0(j10, j11 + j12);
        c0 c0Var3 = f10.b;
        return new a0(c0Var2, new c0(c0Var3.a, c0Var3.b + j12));
    }
}
