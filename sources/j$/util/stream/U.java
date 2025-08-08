package j$.util.stream;

/* loaded from: classes2.dex */
final class U extends X1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(int i, d2 d2Var) {
        super(d2Var);
        this.b = i;
    }

    @Override // j$.util.stream.d2
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
