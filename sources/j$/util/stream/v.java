package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class v extends y {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(a aVar, int i10, Object obj, int i11) {
        super(aVar, i10);
        this.s = i11;
        this.t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, DoubleConsumer doubleConsumer) {
        super(zVar, 0);
        this.s = 1;
        this.t = doubleConsumer;
    }

    @Override // j$.util.stream.a
    public final j5 Q0(int i10, j5 j5Var) {
        switch (this.s) {
            case 0:
                return new u(this, j5Var);
            case 1:
                return new p(this, j5Var, 5);
            case 2:
                return new l(this, j5Var, 6);
            default:
                return new w4(this, j5Var);
        }
    }
}
