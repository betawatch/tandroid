package j$.util.stream;

/* loaded from: classes2.dex */
final class t extends z {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(b bVar, int i, int i2) {
        super(bVar, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.b
    final m2 Q(int i, m2 m2Var) {
        switch (this.m) {
            case 0:
                return new r(this, m2Var, 1);
            case 1:
                return m2Var;
            case 2:
                return new r(this, m2Var, 4);
            case 3:
                return new W(1, m2Var);
            case 4:
                return new U(this, m2Var, 4);
            case 5:
                return new e0(m2Var);
            default:
                return new d0(this, m2Var, 3);
        }
    }
}
