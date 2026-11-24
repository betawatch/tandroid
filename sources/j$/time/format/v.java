package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
        return nm7.L2;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
