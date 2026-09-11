package gd;

import java.io.Serializable;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class g implements c, Serializable {
    public rd.a a;
    public volatile Object b;
    public final Object c;

    public g(rd.a initializer) {
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
                rd.a aVar = this.a;
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
