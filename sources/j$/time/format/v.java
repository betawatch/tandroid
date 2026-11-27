package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
