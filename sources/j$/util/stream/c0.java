package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class c0 extends b2 {
    public boolean b;
    public final j$.util.K c;
    public final /* synthetic */ d0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, g2 g2Var) {
        super(g2Var);
        this.d = d0Var;
        g2 g2Var2 = this.a;
        Objects.requireNonNull(g2Var2);
        this.c = new j$.util.K(g2Var2, 1);
    }

    @Override // j$.util.stream.b2, j$.util.stream.g2
    public final void y(long j) {
        this.a.y(-1L);
    }

    @Override // j$.util.stream.f2, j$.util.stream.g2
    public final void accept(long j) {
        LongStream longStream = (LongStream) ((j$.time.t) this.d.n).apply(j);
        if (longStream != null) {
            try {
                boolean z = this.b;
                j$.util.K k = this.c;
                if (!z) {
                    longStream.sequential().forEach(k);
                } else {
                    j$.util.Z spliterator = longStream.sequential().spliterator();
                    while (!this.a.C() && spliterator.tryAdvance((LongConsumer) k)) {
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

    @Override // j$.util.stream.b2, j$.util.stream.g2
    public final boolean C() {
        this.b = true;
        return this.a.C();
    }
}
