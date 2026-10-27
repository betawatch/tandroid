package c3;

import a8.lg;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g0 extends v {
    public final /* synthetic */ b0 b;
    public final /* synthetic */ lg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(lg lgVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.c = lgVar;
        this.b = b0Var2;
    }

    @Override // c3.v, c3.b0
    public final a0 f(long j10) {
        a0 f7 = this.b.f(j10);
        c0 c0Var = f7.a;
        long j11 = c0Var.a;
        long j12 = c0Var.b;
        long j13 = this.c.b;
        c0 c0Var2 = new c0(j11, j12 + j13);
        c0 c0Var3 = f7.b;
        return new a0(c0Var2, new c0(c0Var3.a, c0Var3.b + j13));
    }
}
