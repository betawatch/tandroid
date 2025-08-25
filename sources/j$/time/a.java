package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
final class a extends b implements Serializable {
    static final a b;
    private static final long serialVersionUID = 6740630888130243051L;
    private final ZoneId a;

    static {
        System.currentTimeMillis();
        b = new a(ZoneOffset.UTC);
    }

    a(ZoneId zoneId) {
        this.a = zoneId;
    }

    public final ZoneId a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.a.equals(((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }
}
