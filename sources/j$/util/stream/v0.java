package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class v0 extends c {
    private final u0 j;

    v0(u0 u0Var, b bVar, Spliterator spliterator) {
        super(bVar, spliterator);
        this.j = u0Var;
    }

    v0(v0 v0Var, Spliterator spliterator) {
        super(v0Var, spliterator);
        this.j = v0Var.j;
    }

    @Override // j$.util.stream.e
    protected final e e(Spliterator spliterator) {
        return new v0(this, spliterator);
    }

    @Override // j$.util.stream.e
    protected final Object a() {
        boolean z;
        b bVar = this.a;
        s0 s0Var = (s0) this.j.b.get();
        bVar.U(this.b, s0Var);
        boolean z2 = s0Var.b;
        z = this.j.a.b;
        if (z2 == z) {
            Boolean valueOf = Boolean.valueOf(z2);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.c
    protected final Object j() {
        boolean z;
        z = this.j.a.b;
        return Boolean.valueOf(!z);
    }
}
