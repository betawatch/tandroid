package j$.util.stream;

/* loaded from: classes2.dex */
public final class r extends y {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(a aVar, int i10, int i11) {
        super(aVar, i10);
        this.s = i11;
    }

    @Override // j$.util.stream.a
    public final j5 Q0(int i10, j5 j5Var) {
        switch (this.s) {
            case 0:
                return new p(this, j5Var, 1);
            case 1:
                return j5Var;
            case 2:
                return new p(this, j5Var, 4);
            case 3:
                return new u0(1, j5Var);
            case 4:
                return new s0(this, j5Var, 4);
            case 5:
                return new c1(j5Var);
            default:
                return new b1(this, j5Var, 3);
        }
    }
}
