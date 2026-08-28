package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class q extends a5 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(a aVar, int i9, Object obj, int i10) {
        super(aVar, i9);
        this.s = i10;
        this.t = obj;
    }

    @Override // j$.util.stream.a
    public final j5 Q0(int i9, j5 j5Var) {
        switch (this.s) {
            case 0:
                return new p(this, j5Var, 0);
            case 1:
                return new s0(this, j5Var, 0);
            case 2:
                return new b1(this, j5Var, 0);
            case 3:
                return new l(this, j5Var, 1);
            case 4:
                return new l(this, j5Var, 2);
            case 5:
                return new l(this, j5Var, 3);
            default:
                return new k(this, j5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b5 b5Var, Consumer consumer) {
        super(b5Var, 0);
        this.s = 3;
        this.t = consumer;
    }
}
