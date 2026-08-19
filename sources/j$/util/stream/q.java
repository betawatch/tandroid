package j$.util.stream;

/* loaded from: classes2.dex */
public final class q extends w {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(a aVar, int i, int i2) {
        super(aVar, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.a
    public final f2 M(int i, f2 f2Var) {
        switch (this.m) {
            case 0:
                return new o(this, f2Var, 1);
            case 1:
                return f2Var;
            case 2:
                return new o(this, f2Var, 4);
            case 3:
                return new T(1, f2Var);
            case 4:
                return new Q(this, f2Var, 4);
            case 5:
                return new a0(f2Var);
            default:
                return new Z(this, f2Var, 3);
        }
    }
}
