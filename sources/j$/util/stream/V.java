package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class V extends Z {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(b bVar, int i, Object obj, int i2) {
        super(bVar, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.b
    final m2 Q(int i, m2 m2Var) {
        switch (this.m) {
            case 0:
                return new U(this, m2Var, 1);
            case 1:
                return new X(this, m2Var);
            case 2:
                return new n(this, m2Var, 4);
            default:
                return new a2(this, m2Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(a0 a0Var, IntConsumer intConsumer) {
        super(a0Var, 0, 1);
        this.m = 0;
        this.n = intConsumer;
    }
}
