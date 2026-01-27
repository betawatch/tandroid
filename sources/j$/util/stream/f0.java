package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class f0 extends h2 {
    boolean b;
    c0 c;
    final /* synthetic */ g0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f0(g0 g0Var, m2 m2Var) {
        super(m2Var);
        this.d = g0Var;
        m2 m2Var2 = this.a;
        Objects.requireNonNull(m2Var2);
        this.c = new c0(m2Var2);
    }

    @Override // j$.util.stream.h2, j$.util.stream.m2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.l2, j$.util.stream.m2
    public final void accept(long j) {
        LongStream longStream = (LongStream) ((a) this.d.n).apply(j);
        if (longStream != null) {
            try {
                boolean z = this.b;
                c0 c0Var = this.c;
                if (!z) {
                    longStream.sequential().forEach(c0Var);
                } else {
                    j$.util.c0 spliterator = longStream.sequential().spliterator();
                    while (!this.a.n() && spliterator.tryAdvance((LongConsumer) c0Var)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    longStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (longStream != null) {
            longStream.close();
        }
    }

    @Override // j$.util.stream.h2, j$.util.stream.m2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}
