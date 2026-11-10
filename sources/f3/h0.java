package f3;

import a8.ua;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class h0 extends v {
    public final /* synthetic */ c0 b;
    public final /* synthetic */ ua c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ua uaVar, c0 c0Var, c0 c0Var2) {
        super(c0Var);
        this.c = uaVar;
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
