package f3;

import a8.va;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
