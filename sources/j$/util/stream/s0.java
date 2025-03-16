package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class s0 extends c {
    private final r0 j;

    s0(r0 r0Var, b bVar, Spliterator spliterator) {
        super(bVar, spliterator);
        this.j = r0Var;
    }

    s0(s0 s0Var, Spliterator spliterator) {
        super(s0Var, spliterator);
        this.j = s0Var.j;
    }

    @Override // j$.util.stream.e
    protected final Object a() {
        boolean z;
        b bVar = this.a;
        p0 p0Var = (p0) this.j.b.get();
        bVar.B0(this.b, p0Var);
        boolean z2 = p0Var.b;
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
        return new s0(this, spliterator);
    }

    @Override // j$.util.stream.c
    protected final Object i() {
        boolean z;
        z = this.j.a.b;
        return Boolean.valueOf(!z);
    }
}
