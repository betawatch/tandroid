package j$.util.stream;

/* loaded from: classes2.dex */
final class W extends g2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(int i, m2 m2Var) {
        super(m2Var);
        this.b = i;
    }

    @Override // j$.util.stream.k2, j$.util.stream.m2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(i);
                break;
            default:
                this.a.accept(i);
                break;
        }
    }
}
