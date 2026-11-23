package f3;

import a8.va;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class h0 extends v {
    public final /* synthetic */ c0 b;
    public final /* synthetic */ va c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(va vaVar, c0 c0Var, c0 c0Var2) {
        super(c0Var);
        this.c = vaVar;
        this.b = c0Var2;
    }

    @Override // f3.v, f3.c0
    public final b0 f(long j3) {
        b0 f10 = this.b.f(j3);
        d0 d0Var = f10.a;
        long j10 = d0Var.a;
        long j11 = d0Var.b;
        long j12 = this.c.b;
        d0 d0Var2 = new d0(j10, j11 + j12);
        d0 d0Var3 = f10.b;
        return new b0(d0Var2, new d0(d0Var3.a, d0Var3.b + j12));
    }
}
