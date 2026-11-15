package gd;

import java.io.Serializable;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
