package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class U extends Z1 {
    public boolean b;
    public final j$.util.G c;
    public final /* synthetic */ S d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(S s, f2 f2Var) {
        super(f2Var);
        this.d = s;
        f2 f2Var2 = this.a;
        Objects.requireNonNull(f2Var2);
        this.c = new j$.util.G(f2Var2, 1);
    }

    @Override // j$.util.stream.Z1, j$.util.stream.f2
    public final void y(long j) {
        this.a.y(-1L);
    }

    @Override // j$.util.stream.d2, j$.util.stream.f2
    public final void accept(int i) {
        IntStream intStream = (IntStream) ((I) this.d.n).apply(i);
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

    @Override // j$.util.stream.Z1, j$.util.stream.f2
    public final boolean C() {
        this.b = true;
        return this.a.C();
    }
}
