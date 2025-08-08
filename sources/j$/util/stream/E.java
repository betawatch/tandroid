package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Predicate;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
final class E implements v3 {
    final boolean a;
    final Object b;
    final Predicate c;
    final Supplier d;

    E(boolean z, R2 r2, Object obj, Predicate predicate, Supplier supplier) {
        this.a = z;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.v3
    public final int d() {
        return Q2.u | (this.a ? 0 : Q2.r);
    }

    @Override // j$.util.stream.v3
    public final Object a(b bVar, Spliterator spliterator) {
        w3 w3Var = (w3) this.d.get();
        bVar.A0(spliterator, w3Var);
        Object obj = w3Var.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.v3
    public final Object c(b bVar, Spliterator spliterator) {
        return new K(this, bVar, spliterator).invoke();
    }
}
