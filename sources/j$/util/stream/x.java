package j$.util.stream;

/* loaded from: classes2.dex */
final class x extends z {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(b bVar, int i, int i2) {
        super(bVar, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.b
    final d2 w0(int i, d2 d2Var) {
        switch (this.m) {
            case 0:
                return d2Var;
            case 1:
                return new U(1, d2Var);
            default:
                return new d0(d2Var);
        }
    }
}
