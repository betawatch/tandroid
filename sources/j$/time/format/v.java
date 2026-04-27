package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes2.dex */
public final class v {
    public static final v a = new v();

    public final int hashCode() {
        return NotificationCenter.themeUploadedToServer;
    }

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        ((v) obj).getClass();
        return true;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
