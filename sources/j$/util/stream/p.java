package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class p extends W1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(a aVar, int i, Object obj, int i2) {
        super(aVar, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.a
    public final f2 M(int i, f2 f2Var) {
        switch (this.m) {
            case 0:
                return new o(this, f2Var, 0);
            case 1:
                return new Q(this, f2Var, 0);
            case 2:
                return new Z(this, f2Var, 0);
            case 3:
                return new k(this, f2Var, 1);
            case 4:
                return new k(this, f2Var, 2);
            case 5:
                return new k(this, f2Var, 3);
            default:
                return new j(this, f2Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(X1 x1, Consumer consumer) {
        super(x1, 0, 1);
        this.m = 3;
        this.n = consumer;
    }
}
