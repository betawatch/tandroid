package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class d0 extends f0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(a aVar, int i, Object obj, int i2) {
        super(aVar, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.a
    public final g2 M(int i, g2 g2Var) {
        switch (this.m) {
            case 0:
                return new c0(this, g2Var);
            case 1:
                return new a0(this, g2Var, 5);
            case 2:
                return new U1(this, g2Var);
            default:
                return new l(this, g2Var, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, LongConsumer longConsumer) {
        super(g0Var, 0, 1);
        this.m = 1;
        this.n = longConsumer;
    }
}
