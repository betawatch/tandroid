package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class t0 extends c {
    private final s0 j;

    t0(s0 s0Var, b bVar, Spliterator spliterator) {
        super(bVar, spliterator);
        this.j = s0Var;
    }

    t0(t0 t0Var, Spliterator spliterator) {
        super(t0Var, spliterator);
        this.j = t0Var.j;
    }

    @Override // j$.util.stream.e
    protected final Object a() {
        boolean z;
        b bVar = this.a;
        q0 q0Var = (q0) this.j.b.get();
        bVar.A0(this.b, q0Var);
        boolean z2 = q0Var.b;
        z = this.j.a.b;
        if (z2 == z) {
            Boolean valueOf = Boolean.valueOf(z2);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.e
    protected final e d(Spliterator spliterator) {
        return new t0(this, spliterator);
    }

    @Override // j$.util.stream.c
    protected final Object i() {
        boolean z;
        z = this.j.a.b;
        return Boolean.valueOf(!z);
    }
}
