package kd;

import java.io.Serializable;
import td.p;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class i implements h, Serializable {
    public static final i a = new i();

    @Override // kd.h
    public final f get(g key) {
        kotlin.jvm.internal.i.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // kd.h
    public final h minusKey(g key) {
        kotlin.jvm.internal.i.e(key, "key");
        return this;
    }

    @Override // kd.h
    public final h plus(h context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // kd.h
    public final Object fold(Object obj, p pVar) {
        return obj;
    }
}
