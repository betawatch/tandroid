package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final class M3 extends Y1 implements P3 {
    public final /* synthetic */ N3 b;

    @Override // j$.util.stream.P3
    public final long m() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3(N3 n3, f2 f2Var, boolean z) {
        super(f2Var);
        this.b = n3;
    }

    @Override // j$.util.stream.c2, j$.util.stream.f2
    public final void accept(double d) {
        this.b.getClass();
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d);
        throw null;
    }
}
