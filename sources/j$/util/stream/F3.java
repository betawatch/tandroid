package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class F3 extends a2 implements P3 {
    public final /* synthetic */ G3 b;

    @Override // j$.util.stream.P3
    public final long m() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F3(G3 g3, g2 g2Var, boolean z) {
        super(g2Var);
        this.b = g3;
    }

    @Override // j$.util.stream.e2, j$.util.stream.g2
    public final void accept(int i) {
        this.b.getClass();
        IntPredicate intPredicate = null;
        intPredicate.test(i);
        throw null;
    }
}
