package e3;

import b8.ig;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g0 extends v {
    public final /* synthetic */ b0 b;
    public final /* synthetic */ ig c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ig igVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.c = igVar;
        this.b = b0Var2;
    }

    @Override // e3.v, e3.b0
    public final a0 f(long j10) {
        a0 f10 = this.b.f(j10);
        c0 c0Var = f10.a;
        long j11 = c0Var.a;
        long j12 = c0Var.b;
        long j13 = this.c.b;
        c0 c0Var2 = new c0(j11, j12 + j13);
        c0 c0Var3 = f10.b;
        return new a0(c0Var2, new c0(c0Var3.a, c0Var3.b + j13));
    }
}
