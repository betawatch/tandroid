package gd;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class h implements c, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "b");
    public volatile rd.a a;
    public volatile Object b;

    @Override // gd.c
    public final Object getValue() {
        Object obj = this.b;
        j jVar = j.a;
        if (obj != jVar) {
            return obj;
        }
        rd.a aVar = this.a;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != jVar) {
                }
            }
            this.a = null;
            return invoke;
        }
        return this.b;
    }

    public final String toString() {
        return this.b != j.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
