package id;

import java.io.Serializable;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class g implements c, Serializable {
    public td.a a;
    public volatile Object b;
    public final Object c;

    public g(td.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.a = initializer;
        this.b = h.a;
        this.c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        h hVar = h.a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == hVar) {
                td.a aVar = this.a;
                kotlin.jvm.internal.i.b(aVar);
                obj = aVar.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.b != h.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
