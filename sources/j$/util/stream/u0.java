package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class u0 implements G3 {
    final t0 a;
    final Supplier b;

    u0(b3 b3Var, t0 t0Var, Supplier supplier) {
        this.a = t0Var;
        this.b = supplier;
    }

    @Override // j$.util.stream.G3
    public final int d() {
        return a3.u | a3.r;
    }

    @Override // j$.util.stream.G3
    public final Object b(b bVar, Spliterator spliterator) {
        s0 s0Var = (s0) this.b.get();
        bVar.U(spliterator, s0Var);
        return Boolean.valueOf(s0Var.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.G3
    public final Object c(b bVar, Spliterator spliterator) {
        return (Boolean) new v0(this, bVar, spliterator).invoke();
    }
}
