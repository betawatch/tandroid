package k3;

import c3.a0;
import c3.b0;
import c3.c0;
import c3.v;
import e6.n;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
