package j$.util.stream;

import j$.util.function.Function;

/* loaded from: classes2.dex */
final class S1 extends U1 {
    public final /* synthetic */ int m;
    final /* synthetic */ Function n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S1(V1 v1, int i, Function function, int i2) {
        super(v1, i, 1);
        this.m = i2;
        this.n = function;
    }

    @Override // j$.util.stream.b
    final d2 w0(int i, d2 d2Var) {
        switch (this.m) {
            case 0:
                return new n(this, d2Var, 3);
            default:
                return new n(this, d2Var, 7);
        }
    }
}
