package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class V extends a2 {
    public boolean b;
    public final j$.util.G c;
    public final /* synthetic */ T d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(T t, g2 g2Var) {
        super(g2Var);
        this.d = t;
        g2 g2Var2 = this.a;
        Objects.requireNonNull(g2Var2);
        this.c = new j$.util.G(g2Var2, 1);
    }

    @Override // j$.util.stream.a2, j$.util.stream.g2
    public final void y(long j) {
        this.a.y(-1L);
    }

    @Override // j$.util.stream.e2, j$.util.stream.g2
    public final void accept(int i) {
        IntStream intStream = (IntStream) ((J) this.d.n).apply(i);
        if (intStream != null) {
            try {
                boolean z = this.b;
                j$.util.G g = this.c;
                if (!z) {
                    intStream.sequential().forEach(g);
                } else {
                    j$.util.W spliterator = intStream.sequential().spliterator();
                    while (!this.a.C() && spliterator.tryAdvance((IntConsumer) g)) {
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

    @Override // j$.util.stream.a2, j$.util.stream.g2
    public final boolean C() {
        this.b = true;
        return this.a.C();
    }
}
