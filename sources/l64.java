// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class l64 implements b86, oz6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l64(int i, cg8 cg8Var, cg8 cg8Var2) {
        this.a = i;
        this.b = cg8Var;
        this.c = cg8Var2;
    }

    @Override // oz6
    public final void a(xw6 xw6Var, int i) {
        ((sz6) this.b).S(xw6Var, i, this.a, (pz6) this.c);
    }

    @Override // b86
    public final void invoke(Object obj) {
        cg8 cg8Var = (cg8) this.b;
        cg8 cg8Var2 = (cg8) this.c;
        bg8 bg8Var = (bg8) obj;
        byte b = this.a;
        bg8Var.f(b);
        bg8Var.A(b, cg8Var, cg8Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l64(sz6 sz6Var, int i, pz6 pz6Var) {
        this.b = sz6Var;
        this.a = i;
        this.c = pz6Var;
    }
}
