// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class a74 implements x76, kz6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a74(int i, qe8 qe8Var, qe8 qe8Var2) {
        this.a = i;
        this.b = qe8Var;
        this.c = qe8Var2;
    }

    @Override // kz6
    public final void a(sw6 sw6Var, int i) {
        ((oz6) this.b).S(sw6Var, i, this.a, (lz6) this.c);
    }

    @Override // x76
    public final void invoke(Object obj) {
        qe8 qe8Var = (qe8) this.b;
        qe8 qe8Var2 = (qe8) this.c;
        pe8 pe8Var = (pe8) obj;
        byte b = this.a;
        pe8Var.h(b);
        pe8Var.A(b, qe8Var, qe8Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a74(oz6 oz6Var, int i, lz6 lz6Var) {
        this.b = oz6Var;
        this.a = i;
        this.c = lz6Var;
    }
}
