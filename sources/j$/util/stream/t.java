package j$.util.stream;

/* loaded from: classes2.dex */
public final class t extends f0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(a aVar, int i, int i2) {
        super(aVar, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.a
    public final g2 M(int i, g2 g2Var) {
        switch (this.m) {
            case 0:
                return new p(this, g2Var, 3);
            case 1:
                return new U(0, g2Var);
            case 2:
                return new S(this, g2Var, 3);
            case 3:
                return new a0(this, g2Var, 1);
            case 4:
                return g2Var;
            default:
                return new a0(this, g2Var, 4);
        }
    }
}
