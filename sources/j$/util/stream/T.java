package j$.util.stream;

/* loaded from: classes2.dex */
public final class T extends Z1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(int i, f2 f2Var) {
        super(f2Var);
        this.b = i;
    }

    @Override // j$.util.stream.d2, j$.util.stream.f2
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
