package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
final class N3 extends g2 {
    boolean b;
    final /* synthetic */ O3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N3(O3 o3, m2 m2Var) {
        super(m2Var);
        this.c = o3;
        this.b = true;
    }

    @Override // j$.util.stream.g2, j$.util.stream.m2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.k2, j$.util.stream.m2
    public final void accept(int i) {
        if (this.b) {
            this.c.getClass();
            IntPredicate intPredicate = null;
            intPredicate.test(i);
            throw null;
        }
    }

    @Override // j$.util.stream.g2, j$.util.stream.m2
    public final boolean n() {
        return !this.b || this.a.n();
    }
}
