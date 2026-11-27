// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ggf extends v8f {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public ggf(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // v8f
    public final fgf a(lgf lgfVar) {
        return (fgf) this.d.getAndSet(lgfVar, fgf.d);
    }

    @Override // v8f
    public final jgf b(lgf lgfVar) {
        return (jgf) this.c.getAndSet(lgfVar, jgf.c);
    }

    @Override // v8f
    public final void c(jgf jgfVar, jgf jgfVar2) {
        this.b.lazySet(jgfVar, jgfVar2);
    }

    @Override // v8f
    public final void d(jgf jgfVar, Thread thread) {
        this.a.lazySet(jgfVar, thread);
    }

    @Override // v8f
    public final boolean e(lgf lgfVar, fgf fgfVar, fgf fgfVar2) {
        return x8f.a(this.d, lgfVar, fgfVar, fgfVar2);
    }

    @Override // v8f
    public final boolean f(lgf lgfVar, Object obj, Object obj2) {
        return x8f.a(this.e, lgfVar, obj, obj2);
    }

    @Override // v8f
    public final boolean g(lgf lgfVar, jgf jgfVar, jgf jgfVar2) {
        return x8f.a(this.c, lgfVar, jgfVar, jgfVar2);
    }
}
