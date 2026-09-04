package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class d1 extends e5 {
    public boolean b;
    public final j$.util.m0 c;
    public final /* synthetic */ e1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, j5 j5Var) {
        super(j5Var);
        this.d = e1Var;
        j5 j5Var2 = this.a;
        Objects.requireNonNull(j5Var2);
        this.c = new j$.util.m0(j5Var2, 1);
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final void o(long j3) {
        this.a.o(-1L);
    }

    @Override // j$.util.stream.i5, j$.util.stream.j5
    public final void accept(long j3) {
        LongStream longStream = (LongStream) ((j$.time.t) this.d.t).apply(j3);
        if (longStream != null) {
            try {
                boolean z10 = this.b;
                j$.util.m0 m0Var = this.c;
                if (!z10) {
                    longStream.sequential().forEach(m0Var);
                } else {
                    j$.util.a1 spliterator = longStream.sequential().spliterator();
                    while (!this.a.q() && spliterator.tryAdvance((LongConsumer) m0Var)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    longStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (longStream != null) {
            longStream.close();
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final boolean q() {
        this.b = true;
        return this.a.q();
    }
}
