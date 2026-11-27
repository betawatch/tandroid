package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class x extends g5 {
    public boolean b;
    public final j$.util.e0 c;
    public final /* synthetic */ y d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, n5 n5Var) {
        super(n5Var);
        this.d = yVar;
        n5 n5Var2 = this.a;
        Objects.requireNonNull(n5Var2);
        this.c = new j$.util.e0(n5Var2, (byte) 1);
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        f0 f0Var = (f0) ((j$.time.v) this.d.m).apply(d);
        if (f0Var != null) {
            try {
                boolean z = this.b;
                j$.util.e0 e0Var = this.c;
                if (z) {
                    j$.util.u0 spliterator = f0Var.sequential().spliterator();
                    while (!this.a.q() && spliterator.tryAdvance((DoubleConsumer) e0Var)) {
                    }
                } else {
                    f0Var.sequential().forEach(e0Var);
                }
            } catch (Throwable th) {
                try {
                    f0Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (f0Var != null) {
            f0Var.close();
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void n(long j) {
        this.a.n(-1L);
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final boolean q() {
        this.b = true;
        return this.a.q();
    }
}
