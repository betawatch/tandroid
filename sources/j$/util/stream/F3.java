package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class F3 extends Z1 implements P3 {
    public final /* synthetic */ G3 b;

    @Override // j$.util.stream.P3
    public final long m() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F3(G3 g3, f2 f2Var, boolean z) {
        super(f2Var);
        this.b = g3;
    }

    @Override // j$.util.stream.d2, j$.util.stream.f2
    public final void accept(int i) {
        this.b.getClass();
        IntPredicate intPredicate = null;
        intPredicate.test(i);
        throw null;
    }
}
