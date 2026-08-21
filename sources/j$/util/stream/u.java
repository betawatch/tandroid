package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class u extends Z1 {
    public boolean b;
    public final j$.util.C c;
    public final /* synthetic */ v d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, g2 g2Var) {
        super(g2Var);
        this.d = vVar;
        g2 g2Var2 = this.a;
        Objects.requireNonNull(g2Var2);
        this.c = new j$.util.C(g2Var2, 1);
    }

    @Override // j$.util.stream.Z1, j$.util.stream.g2
    public final void y(long j) {
        this.a.y(-1L);
    }

    @Override // j$.util.stream.d2, j$.util.stream.g2
    public final void accept(double d) {
        B b = (B) ((j$.time.t) this.d.n).apply(d);
        if (b != null) {
            try {
                boolean z = this.b;
                j$.util.C c = this.c;
                if (!z) {
                    b.sequential().forEach(c);
                } else {
                    j$.util.T spliterator = b.sequential().spliterator();
                    while (!this.a.C() && spliterator.tryAdvance((DoubleConsumer) c)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (b != null) {
            b.close();
        }
    }

    @Override // j$.util.stream.Z1, j$.util.stream.g2
    public final boolean C() {
        this.b = true;
        return this.a.C();
    }
}
