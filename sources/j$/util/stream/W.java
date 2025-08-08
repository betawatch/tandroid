package j$.util.stream;

/* loaded from: classes2.dex */
final class W extends g0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(b bVar, int i, int i2) {
        super(bVar, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.b
    final d2 w0(int i, d2 d2Var) {
        switch (this.m) {
            case 0:
                return new U(0, d2Var);
            default:
                return d2Var;
        }
    }
}
