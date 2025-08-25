package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class x extends z {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(b bVar, int i, Object obj, int i2) {
        super(bVar, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(A a, DoubleConsumer doubleConsumer) {
        super(a, 0, 1);
        this.m = 1;
        this.n = doubleConsumer;
    }

    @Override // j$.util.stream.b
    final m2 Q(int i, m2 m2Var) {
        switch (this.m) {
            case 0:
                return new w(this, m2Var);
            case 1:
                return new r(this, m2Var, 5);
            case 2:
                return new n(this, m2Var, 6);
            default:
                return new a2(this, m2Var);
        }
    }
}
