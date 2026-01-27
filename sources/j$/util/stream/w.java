package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class w extends f2 {
    boolean b;
    p c;
    final /* synthetic */ x d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(x xVar, m2 m2Var) {
        super(m2Var);
        this.d = xVar;
        m2 m2Var2 = this.a;
        Objects.requireNonNull(m2Var2);
        this.c = new p(m2Var2);
    }

    @Override // j$.util.stream.f2, j$.util.stream.m2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.j2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        D d2 = (D) ((a) this.d.n).apply(d);
        if (d2 != null) {
            try {
                boolean z = this.b;
                p pVar = this.c;
                if (!z) {
                    d2.sequential().forEach(pVar);
                } else {
                    j$.util.W spliterator = d2.sequential().spliterator();
                    while (!this.a.n() && spliterator.tryAdvance((DoubleConsumer) pVar)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    d2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (d2 != null) {
            d2.close();
        }
    }

    @Override // j$.util.stream.f2, j$.util.stream.m2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}
