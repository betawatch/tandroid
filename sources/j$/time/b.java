package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class b extends a implements Serializable {
    public static final b b;
    private static final long serialVersionUID = 6740630888130243051L;
    public final ZoneId a;

    static {
        System.currentTimeMillis();
        b = new b(ZoneOffset.UTC);
    }

    public b(ZoneId zoneId) {
        this.a = zoneId;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.a.equals(((b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.a + "]";
    }
}
