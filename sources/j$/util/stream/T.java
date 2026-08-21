package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class T extends X {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(a aVar, int i, Object obj, int i2) {
        super(aVar, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.a
    public final g2 M(int i, g2 g2Var) {
        switch (this.m) {
            case 0:
                return new S(this, g2Var, 1);
            case 1:
                return new V(this, g2Var);
            case 2:
                return new l(this, g2Var, 4);
            default:
                return new U1(this, g2Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Y y, IntConsumer intConsumer) {
        super(y, 0, 1);
        this.m = 0;
        this.n = intConsumer;
    }
}
