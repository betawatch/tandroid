package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class E implements G3 {
    final int a;
    final Object b;
    final Predicate c;
    final Supplier d;

    E(boolean z, b3 b3Var, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : a3.r) | a3.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.G3
    public final int d() {
        return this.a;
    }

    @Override // j$.util.stream.G3
    public final Object b(b bVar, Spliterator spliterator) {
        H3 h3 = (H3) this.d.get();
        bVar.U(spliterator, h3);
        Object obj = h3.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.G3
    public final Object c(b bVar, Spliterator spliterator) {
        return new K(this, a3.ORDERED.m(bVar.J()), bVar, spliterator).invoke();
    }
}
