package j$.util.stream;

/* loaded from: classes2.dex */
public final class t extends h1 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(a aVar, int i9, int i10) {
        super(aVar, i9);
        this.s = i10;
    }

    @Override // j$.util.stream.a
    public final j5 Q0(int i9, j5 j5Var) {
        switch (this.s) {
            case 0:
                return new p(this, j5Var, 3);
            case 1:
                return new u0(0, j5Var);
            case 2:
                return new s0(this, j5Var, 3);
            case 3:
                return new b1(this, j5Var, 1);
            case 4:
                return j5Var;
            default:
                return new b1(this, j5Var, 4);
        }
    }
}
