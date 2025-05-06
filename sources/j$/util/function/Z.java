package j$.util.function;

/* loaded from: classes2.dex */
public final /* synthetic */ class Z implements c0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;
    public final /* synthetic */ c0 c;

    public /* synthetic */ Z(c0 c0Var, c0 c0Var2, int i) {
        this.a = i;
        this.b = c0Var;
        this.c = c0Var2;
    }

    @Override // j$.util.function.c0
    public final c0 a(c0 c0Var) {
        switch (this.a) {
            case 0:
                c0Var.getClass();
                break;
            default:
                c0Var.getClass();
                break;
        }
        return new Z(this, c0Var, 0);
    }

    @Override // j$.util.function.c0
    public final long applyAsLong(long j) {
        switch (this.a) {
            case 0:
                return this.c.applyAsLong(this.b.applyAsLong(j));
            default:
                return this.b.applyAsLong(this.c.applyAsLong(j));
        }
    }

    @Override // j$.util.function.c0
    public final c0 b(c0 c0Var) {
        switch (this.a) {
            case 0:
                c0Var.getClass();
                break;
            default:
                c0Var.getClass();
                break;
        }
        return new Z(this, c0Var, 1);
    }
}
