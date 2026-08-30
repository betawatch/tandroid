package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class s1 extends b {
    public final j$.util.concurrent.t j;

    public s1(j$.util.concurrent.t tVar, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.j = tVar;
    }

    public s1(s1 s1Var, Spliterator spliterator) {
        super(s1Var, spliterator);
        this.j = s1Var.j;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new s1(this, spliterator);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        t3 t3Var = this.a;
        q1 q1Var = (q1) ((Supplier) this.j.c).get();
        t3Var.F0(this.b, q1Var);
        boolean z4 = q1Var.b;
        if (z4 == ((r1) this.j.b).b) {
            Boolean valueOf = Boolean.valueOf(z4);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return Boolean.valueOf(!((r1) this.j.b).b);
    }
}
