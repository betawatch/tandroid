// default package

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ar9 implements d26, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(ar9.class, Object.class, "b");
    public volatile pr4 a;
    public volatile Object b;

    @Override // d26
    public final Object getValue() {
        Object obj = this.b;
        nf5 nf5Var = nf5.d;
        if (obj != nf5Var) {
            return obj;
        }
        pr4 pr4Var = this.a;
        if (pr4Var != null) {
            Object invoke = pr4Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nf5Var, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != nf5Var) {
                }
            }
            this.a = null;
            return invoke;
        }
        return this.b;
    }

    public final String toString() {
        return this.b != nf5.d ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
