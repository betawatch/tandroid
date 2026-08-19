package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class c0 extends e0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(a aVar, int i, Object obj, int i2) {
        super(aVar, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.a
    public final f2 M(int i, f2 f2Var) {
        switch (this.m) {
            case 0:
                return new b0(this, f2Var);
            case 1:
                return new Z(this, f2Var, 5);
            case 2:
                return new T1(this, f2Var);
            default:
                return new k(this, f2Var, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, LongConsumer longConsumer) {
        super(f0Var, 0, 1);
        this.m = 1;
        this.n = longConsumer;
    }
}
