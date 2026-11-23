package gd;

import java.io.Serializable;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class i implements c, Serializable {
    public rd.a a;
    public volatile Object b;
    public final Object c;

    public i(rd.a initializer) {
        kotlin.jvm.internal.j.e(initializer, "initializer");
        this.a = initializer;
        this.b = j.a;
        this.c = this;
    }

    @Override // gd.c
    public final Object getValue() {
        Object obj;
        Object obj2 = this.b;
        j jVar = j.a;
        if (obj2 != jVar) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == jVar) {
                rd.a aVar = this.a;
                kotlin.jvm.internal.j.b(aVar);
                obj = aVar.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.b != j.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
