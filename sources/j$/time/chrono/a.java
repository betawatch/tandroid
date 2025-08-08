package j$.time.chrono;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class a implements e {
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((e) obj).getClass();
        return 0;
    }

    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new Locale("ja", "JP", "JP");
    }

    protected a() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        ((a) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ 72805;
    }

    public final String toString() {
        return "ISO";
    }
}
