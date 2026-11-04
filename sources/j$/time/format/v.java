package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import org.telegram.messenger.hs;

/* loaded from: classes2.dex */
public final class v {
    public static final v a = new v();

    public final int hashCode() {
        return hs.M2;
    }

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v);
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
