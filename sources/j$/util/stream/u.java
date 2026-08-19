package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class u extends w {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(a aVar, int i, Object obj, int i2) {
        super(aVar, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, DoubleConsumer doubleConsumer) {
        super(xVar, 0, 1);
        this.m = 1;
        this.n = doubleConsumer;
    }

    @Override // j$.util.stream.a
    public final f2 M(int i, f2 f2Var) {
        switch (this.m) {
            case 0:
                return new t(this, f2Var);
            case 1:
                return new o(this, f2Var, 5);
            case 2:
                return new k(this, f2Var, 6);
            default:
                return new T1(this, f2Var);
        }
    }
}
