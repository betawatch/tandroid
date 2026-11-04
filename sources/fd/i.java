package fd;

import java.io.Serializable;
import kotlin.jvm.internal.j;
import od.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i implements h, Serializable {
    public static final i a = new i();

    @Override // fd.h
    public final f get(g key) {
        j.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // fd.h
    public final h minusKey(g key) {
        j.e(key, "key");
        return this;
    }

    @Override // fd.h
    public final h plus(h context) {
        j.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // fd.h
    public final Object fold(Object obj, p pVar) {
        return obj;
    }
}
