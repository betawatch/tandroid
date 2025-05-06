package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
final class s0 implements w3 {
    final r0 a;
    final Supplier b;

    s0(S2 s2, r0 r0Var, Supplier supplier) {
        this.a = r0Var;
        this.b = supplier;
    }

    @Override // j$.util.stream.w3
    public final Object a(b bVar, Spliterator spliterator) {
        q0 q0Var = (q0) this.b.get();
        bVar.A0(spliterator, q0Var);
        return Boolean.valueOf(q0Var.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.w3
    public final Object c(b bVar, Spliterator spliterator) {
        return (Boolean) new t0(this, bVar, spliterator).invoke();
    }

    @Override // j$.util.stream.w3
    public final int d() {
        return R2.u | R2.r;
    }
}
