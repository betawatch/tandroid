package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class v0 extends d5 {
    public boolean b;
    public final j$.util.i0 c;
    public final /* synthetic */ t0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(t0 t0Var, j5 j5Var) {
        super(j5Var);
        this.d = t0Var;
        j5 j5Var2 = this.a;
        Objects.requireNonNull(j5Var2);
        this.c = new j$.util.i0(j5Var2, 1);
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final void o(long j10) {
        this.a.o(-1L);
    }

    @Override // j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i10) {
        IntStream intStream = (IntStream) ((k0) this.d.t).apply(i10);
        if (intStream != null) {
            try {
                boolean z4 = this.b;
                j$.util.i0 i0Var = this.c;
                if (!z4) {
                    intStream.sequential().forEach(i0Var);
                } else {
                    j$.util.x0 spliterator = intStream.sequential().spliterator();
                    while (!this.a.q() && spliterator.tryAdvance((IntConsumer) i0Var)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    intStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final boolean q() {
        this.b = true;
        return this.a.q();
    }
}
