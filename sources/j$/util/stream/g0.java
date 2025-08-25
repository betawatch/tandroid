package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class g0 extends i0 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(b bVar, int i, Object obj, int i2) {
        super(bVar, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.b
    final m2 Q(int i, m2 m2Var) {
        switch (this.m) {
            case 0:
                return new f0(this, m2Var);
            case 1:
                return new d0(this, m2Var, 5);
            case 2:
                return new a2(this, m2Var);
            default:
                return new n(this, m2Var, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, LongConsumer longConsumer) {
        super(j0Var, 0, 1);
        this.m = 1;
        this.n = longConsumer;
    }
}
