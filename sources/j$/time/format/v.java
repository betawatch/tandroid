package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        return jn7.L2;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
