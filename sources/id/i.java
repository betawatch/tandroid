package id;

import java.io.Serializable;
import kotlin.jvm.internal.j;
import rd.p;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class i implements h, Serializable {
    public static final i a = new i();

    @Override // id.h
    public final f get(g key) {
        j.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // id.h
    public final h minusKey(g key) {
        j.e(key, "key");
        return this;
    }

    @Override // id.h
    public final h plus(h context) {
        j.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // id.h
    public final Object fold(Object obj, p pVar) {
        return obj;
    }
}
