package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class t0 extends y0 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(a aVar, int i10, Object obj, int i11) {
        super(aVar, i10);
        this.s = i11;
        this.t = obj;
    }

    @Override // j$.util.stream.a
    public final j5 Q0(int i10, j5 j5Var) {
        switch (this.s) {
            case 0:
                return new s0(this, j5Var, 1);
            case 1:
                return new v0(this, j5Var);
            case 2:
                return new l(this, j5Var, 4);
            default:
                return new w4(this, j5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(z0 z0Var, IntConsumer intConsumer) {
        super(z0Var, 0);
        this.s = 0;
        this.t = intConsumer;
    }
}
