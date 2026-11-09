package id;

import java.io.Serializable;
import kotlin.jvm.internal.j;
import rd.p;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
