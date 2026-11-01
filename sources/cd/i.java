package cd;

import java.io.Serializable;
import ld.p;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class i implements h, Serializable {
    public static final i a = new i();

    @Override // cd.h
    public final f get(g key) {
        kotlin.jvm.internal.i.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // cd.h
    public final h minusKey(g key) {
        kotlin.jvm.internal.i.e(key, "key");
        return this;
    }

    @Override // cd.h
    public final h plus(h context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // cd.h
    public final Object fold(Object obj, p pVar) {
        return obj;
    }
}
