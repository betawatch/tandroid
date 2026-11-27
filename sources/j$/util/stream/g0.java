package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class g0 implements h8 {
    public final int a;
    public final Object b;
    public final Predicate c;
    public final Supplier d;

    public g0(boolean z, c7 c7Var, Object obj, Predicate predicate, Supplier supplier) {
        this.a = b7.u | (z ? 0 : b7.r);
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.h8
    public final Object a(a aVar, Spliterator spliterator) {
        i8 i8Var = (i8) this.d.get();
        aVar.Q(spliterator, i8Var);
        Object obj = i8Var.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.h8
    public final Object b(a aVar, Spliterator spliterator) {
        return new m0(this, b7.ORDERED.n(aVar.f), aVar, spliterator).invoke();
    }

    @Override // j$.util.stream.h8
    public final int c() {
        return this.a;
    }
}
