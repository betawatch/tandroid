package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class B implements y3 {
    public final int a;
    public final Object b;
    public final Predicate c;
    public final Supplier d;

    public B(boolean z, T2 t2, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : S2.r) | S2.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.y3
    public final int d() {
        return this.a;
    }

    @Override // j$.util.stream.y3
    public final Object b(a aVar, Spliterator spliterator) {
        z3 z3Var = (z3) this.d.get();
        aVar.Q(spliterator, z3Var);
        Object obj = z3Var.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.y3
    public final Object c(a aVar, Spliterator spliterator) {
        return new H(this, S2.ORDERED.q(aVar.f), aVar, spliterator).invoke();
    }
}
