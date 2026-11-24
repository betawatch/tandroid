package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class g1 extends i5 {
    public boolean b;
    public final j$.util.m0 c;
    public final /* synthetic */ h1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var, n5 n5Var) {
        super(n5Var);
        this.d = h1Var;
        n5 n5Var2 = this.a;
        Objects.requireNonNull(n5Var2);
        this.c = new j$.util.m0(n5Var2, (byte) 1);
    }

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        LongStream longStream = (LongStream) ((j$.time.v) this.d.m).apply(j);
        if (longStream != null) {
            try {
                boolean z = this.b;
                j$.util.m0 m0Var = this.c;
                if (z) {
                    j$.util.a1 spliterator = longStream.sequential().spliterator();
                    while (!this.a.q() && spliterator.tryAdvance((LongConsumer) m0Var)) {
                    }
                } else {
                    longStream.sequential().forEach(m0Var);
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

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final void n(long j) {
        this.a.n(-1L);
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final boolean q() {
        this.b = true;
        return this.a.q();
    }
}
