package j$.util.stream;

/* loaded from: classes2.dex */
final class u extends A {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(b bVar, int i, Object obj, int i2) {
        super(bVar, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b bVar, j$.util.function.m mVar) {
        super(bVar, 0, 1);
        this.m = 3;
        this.n = mVar;
    }

    @Override // j$.util.stream.b
    final e2 w0(int i, e2 e2Var) {
        switch (this.m) {
            case 0:
                return new t(this, e2Var, 0);
            case 1:
                return new t(this, e2Var, 4);
            case 2:
                return new t(this, e2Var, 5);
            case 3:
                return new t(this, e2Var, 6);
            case 4:
                return new W(this, e2Var, 4);
            case 5:
                return new f0(this, e2Var, 3);
            case 6:
                return new o(this, e2Var, 6);
            default:
                return new R1(this, e2Var);
        }
    }
}
