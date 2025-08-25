package j$.util.stream;

/* loaded from: classes2.dex */
final class v extends i0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(b bVar, int i, int i2) {
        super(bVar, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.b
    final m2 Q(int i, m2 m2Var) {
        switch (this.m) {
            case 0:
                return new r(this, m2Var, 3);
            case 1:
                return new W(0, m2Var);
            case 2:
                return new U(this, m2Var, 3);
            case 3:
                return new d0(this, m2Var, 1);
            case 4:
                return m2Var;
            default:
                return new d0(this, m2Var, 4);
        }
    }
}
