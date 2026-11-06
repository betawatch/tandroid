package j$.util.stream;

/* loaded from: classes2.dex */
public final class u0 extends d5 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i7, j5 j5Var) {
        super(j5Var);
        this.b = i7;
    }

    @Override // j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i7) {
        switch (this.b) {
            case 0:
                this.a.accept(i7);
                break;
            default:
                this.a.accept(i7);
                break;
        }
    }
}
