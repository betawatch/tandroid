package ld;

import java.io.Serializable;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i implements h, Serializable {
    public static final i a = new i();

    @Override // ld.h
    public final f get(g key) {
        kotlin.jvm.internal.i.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // ld.h
    public final h minusKey(g key) {
        kotlin.jvm.internal.i.e(key, "key");
        return this;
    }

    @Override // ld.h
    public final h plus(h context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // ld.h
    public final Object fold(Object obj, p pVar) {
        return obj;
    }
}
