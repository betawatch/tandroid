package j$.util;

import java.util.RandomAccess;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public class DesugarCollections {
    public static <T> java.util.List<T> synchronizedList(java.util.List<T> list) {
        return list instanceof RandomAccess ? new k(list) : new i(list);
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new j(map);
    }

    public static <T> java.util.Set<T> synchronizedSet(java.util.Set<T> set) {
        return new l(set);
    }

    public static <T> java.util.List<T> unmodifiableList(java.util.List<? extends T> list) {
        return list instanceof RandomAccess ? new u(list) : new p(list);
    }

    public static <K, V> java.util.Map<K, V> unmodifiableMap(java.util.Map<? extends K, ? extends V> map) {
        return new t(map);
    }

    public static <T> java.util.Set<T> unmodifiableSet(java.util.Set<? extends T> set) {
        return new v(set);
    }
}
