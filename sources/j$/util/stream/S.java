package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class S extends W {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(a aVar, int i, Object obj, int i2) {
        super(aVar, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.a
    public final f2 M(int i, f2 f2Var) {
        switch (this.m) {
            case 0:
                return new Q(this, f2Var, 1);
            case 1:
                return new U(this, f2Var);
            case 2:
                return new k(this, f2Var, 4);
            default:
                return new T1(this, f2Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(X x, IntConsumer intConsumer) {
        super(x, 0, 1);
        this.m = 0;
        this.n = intConsumer;
    }
}
