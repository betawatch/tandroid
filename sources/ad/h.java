package ad;

import java.io.Serializable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h implements c, Serializable {
    public ld.a a;
    public volatile Object b;
    public final Object c;

    public h(ld.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.a = initializer;
        this.b = i.a;
        this.c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        i iVar = i.a;
        if (obj2 != iVar) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == iVar) {
                ld.a aVar = this.a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.b != i.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
