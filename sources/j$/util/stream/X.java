package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class X extends g2 {
    boolean b;
    T c;
    final /* synthetic */ V d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X(V v, m2 m2Var) {
        super(m2Var);
        this.d = v;
        m2 m2Var2 = this.a;
        Objects.requireNonNull(m2Var2);
        this.c = new T(m2Var2);
    }

    @Override // j$.util.stream.g2, j$.util.stream.m2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.k2, j$.util.stream.m2
    public final void accept(int i) {
        IntStream intStream = (IntStream) ((O0) this.d.n).apply(i);
        if (intStream != null) {
            try {
                boolean z = this.b;
                T t = this.c;
                if (!z) {
                    intStream.sequential().forEach(t);
                } else {
                    j$.util.Y spliterator = intStream.sequential().spliterator();
                    while (!this.a.n() && spliterator.tryAdvance((IntConsumer) t)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.g2, j$.util.stream.m2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}
