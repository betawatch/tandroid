package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class y0 extends h5 {
    public boolean b;
    public final j$.util.i0 c;
    public final /* synthetic */ w0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(w0 w0Var, n5 n5Var) {
        super(n5Var);
        this.d = w0Var;
        n5 n5Var2 = this.a;
        Objects.requireNonNull(n5Var2);
        this.c = new j$.util.i0(n5Var2, (byte) 1);
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i) {
        IntStream intStream = (IntStream) ((n0) this.d.m).apply(i);
        if (intStream != null) {
            try {
                boolean z = this.b;
                j$.util.i0 i0Var = this.c;
                if (z) {
                    j$.util.x0 spliterator = intStream.sequential().spliterator();
                    while (!this.a.q() && spliterator.tryAdvance((IntConsumer) i0Var)) {
                    }
                } else {
                    intStream.sequential().forEach(i0Var);
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

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void n(long j) {
        this.a.n(-1L);
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final boolean q() {
        this.b = true;
        return this.a.q();
    }
}
