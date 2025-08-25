package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
final class V3 extends f2 {
    boolean b;
    final /* synthetic */ W3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V3(W3 w3, m2 m2Var) {
        super(m2Var);
        this.c = w3;
        this.b = true;
    }

    @Override // j$.util.stream.f2, j$.util.stream.m2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.j2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        if (this.b) {
            this.c.getClass();
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d);
            throw null;
        }
    }

    @Override // j$.util.stream.f2, j$.util.stream.m2
    public final boolean n() {
        return !this.b || this.a.n();
    }
}
