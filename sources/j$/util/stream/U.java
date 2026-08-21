package j$.util.stream;

/* loaded from: classes2.dex */
public final class U extends a2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(int i, g2 g2Var) {
        super(g2Var);
        this.b = i;
    }

    @Override // j$.util.stream.e2, j$.util.stream.g2
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
