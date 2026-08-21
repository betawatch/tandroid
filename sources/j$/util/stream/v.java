package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class v extends x {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(a aVar, int i, Object obj, int i2) {
        super(aVar, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, DoubleConsumer doubleConsumer) {
        super(yVar, 0, 1);
        this.m = 1;
        this.n = doubleConsumer;
    }

    @Override // j$.util.stream.a
    public final g2 M(int i, g2 g2Var) {
        switch (this.m) {
            case 0:
                return new u(this, g2Var);
            case 1:
                return new p(this, g2Var, 5);
            case 2:
                return new l(this, g2Var, 6);
            default:
                return new U1(this, g2Var);
        }
    }
}
