package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class p0 extends b {
    public final j$.util.concurrent.t j;

    public p0(j$.util.concurrent.t tVar, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.j = tVar;
    }

    public p0(p0 p0Var, Spliterator spliterator) {
        super(p0Var, spliterator);
        this.j = p0Var.j;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new p0(this, spliterator);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        n0 n0Var = (n0) ((Supplier) this.j.c).get();
        aVar.Q(this.b, n0Var);
        boolean z = n0Var.b;
        if (z == ((o0) this.j.b).b) {
            Boolean valueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return Boolean.valueOf(!((o0) this.j.b).b);
    }
}
