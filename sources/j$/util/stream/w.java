package j$.util.stream;

/* loaded from: classes2.dex */
final class w extends g0 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(b bVar, int i, Object obj, int i2) {
        super(bVar, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.b
    final d2 w0(int i, d2 d2Var) {
        switch (this.m) {
            case 0:
                return new s(this, d2Var, 3);
            case 1:
                return new V(this, d2Var, 3);
            case 2:
                return new e0(this, d2Var, 0);
            case 3:
                return new e0(this, d2Var, 4);
            case 4:
                return new e0(this, d2Var, 5);
            case 5:
                return new e0(this, d2Var, 6);
            case 6:
                return new Q1(this, d2Var);
            default:
                return new n(this, d2Var, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(h0 h0Var, j$.util.function.Y y) {
        super(h0Var, 0, 1);
        this.m = 5;
        this.n = y;
    }
}
