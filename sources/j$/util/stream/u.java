package j$.util.stream;

/* loaded from: classes2.dex */
final class u extends Z {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(b bVar, int i, int i2) {
        super(bVar, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.b
    final m2 Q(int i, m2 m2Var) {
        switch (this.m) {
            case 0:
                return new r(this, m2Var, 2);
            case 1:
                return new U(this, m2Var, 2);
            case 2:
                return m2Var;
            case 3:
                return new U(this, m2Var, 5);
            default:
                return new d0(this, m2Var, 2);
        }
    }
}
