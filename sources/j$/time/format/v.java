package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class v {
    public static final v a = new v();

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v);
    }

    public final int hashCode() {
        return kk7.L2;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
