package j$.util.function;

/* loaded from: classes2.dex */
public final /* synthetic */ class h0 implements k0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;
    public final /* synthetic */ k0 c;

    public /* synthetic */ h0(k0 k0Var, k0 k0Var2, int i) {
        this.a = i;
        this.b = k0Var;
        this.c = k0Var2;
    }

    @Override // j$.util.function.k0
    public final long applyAsLong(long j) {
        switch (this.a) {
            case 0:
                return this.c.applyAsLong(this.b.applyAsLong(j));
            default:
                return this.b.applyAsLong(this.c.applyAsLong(j));
        }
    }

    @Override // j$.util.function.k0
    public final k0 a(k0 k0Var) {
        switch (this.a) {
            case 0:
                k0Var.getClass();
                break;
            default:
                k0Var.getClass();
                break;
        }
        return new h0(this, k0Var, 0);
    }

    @Override // j$.util.function.k0
    public final k0 b(k0 k0Var) {
        switch (this.a) {
            case 0:
                k0Var.getClass();
                break;
            default:
                k0Var.getClass();
                break;
        }
        return new h0(this, k0Var, 1);
    }
}
