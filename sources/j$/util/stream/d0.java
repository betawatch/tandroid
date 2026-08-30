package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class d0 implements b8 {
    public final int a;
    public final Object b;
    public final Predicate c;
    public final Supplier d;

    public d0(boolean z4, w6 w6Var, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z4 ? 0 : v6.r) | v6.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.b8
    public final int v() {
        return this.a;
    }

    @Override // j$.util.stream.b8
    public final Object f(a aVar, Spliterator spliterator) {
        c8 c8Var = (c8) this.d.get();
        aVar.F0(spliterator, c8Var);
        Object obj = c8Var.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.b8
    public final Object i(t3 t3Var, Spliterator spliterator) {
        a aVar = (a) t3Var;
        return new j0(this, v6.ORDERED.m(aVar.m), aVar, spliterator).invoke();
    }
}
