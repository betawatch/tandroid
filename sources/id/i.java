package id;

import java.io.Serializable;
import kotlin.jvm.internal.j;
import rd.p;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
