package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class q0 extends b {
    public final j$.util.concurrent.t j;

    public q0(j$.util.concurrent.t tVar, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.j = tVar;
    }

    public q0(q0 q0Var, Spliterator spliterator) {
        super(q0Var, spliterator);
        this.j = q0Var.j;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new q0(this, spliterator);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        o0 o0Var = (o0) ((Supplier) this.j.c).get();
        aVar.Q(this.b, o0Var);
        boolean z = o0Var.b;
        if (z == ((p0) this.j.b).b) {
            Boolean valueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return Boolean.valueOf(!((p0) this.j.b).b);
    }
}
