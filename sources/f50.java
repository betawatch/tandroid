// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class f50 implements x76, fu2 {
    public final /* synthetic */ long a;

    public /* synthetic */ f50(long j) {
        this.a = j;
    }

    @Override // fu2
    public final void accept(Object obj) {
        ((cf8) obj).e(this.a);
    }

    @Override // x76
    public final void invoke(Object obj) {
        u40 u40Var;
        ab3 ab3Var = (ab3) obj;
        cb3 cb3Var = ab3Var.a;
        if (ab3Var != cb3Var.j || (u40Var = cb3Var.n) == null) {
            return;
        }
        u40Var.h(this.a);
    }
}
