package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
