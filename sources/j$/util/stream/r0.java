package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
final class r0 implements w3 {
    final q0 a;
    final Supplier b;

    r0(S2 s2, q0 q0Var, Supplier supplier) {
        this.a = q0Var;
        this.b = supplier;
    }

    @Override // j$.util.stream.w3
    public final Object a(b bVar, Spliterator spliterator) {
        p0 p0Var = (p0) this.b.get();
        bVar.C0(spliterator, p0Var);
        return Boolean.valueOf(p0Var.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.w3
    public final Object c(b bVar, Spliterator spliterator) {
        return (Boolean) new s0(this, bVar, spliterator).invoke();
    }

    @Override // j$.util.stream.w3
    public final int d() {
        return R2.u | R2.r;
    }
}
