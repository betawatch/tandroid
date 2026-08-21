package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class q extends X1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(a aVar, int i, Object obj, int i2) {
        super(aVar, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.a
    public final g2 M(int i, g2 g2Var) {
        switch (this.m) {
            case 0:
                return new p(this, g2Var, 0);
            case 1:
                return new S(this, g2Var, 0);
            case 2:
                return new a0(this, g2Var, 0);
            case 3:
                return new l(this, g2Var, 1);
            case 4:
                return new l(this, g2Var, 2);
            case 5:
                return new l(this, g2Var, 3);
            default:
                return new k(this, g2Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Y1 y1, Consumer consumer) {
        super(y1, 0, 1);
        this.m = 3;
        this.n = consumer;
    }
}
