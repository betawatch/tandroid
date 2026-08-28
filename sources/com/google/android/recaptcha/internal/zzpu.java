package com.google.android.recaptcha.internal;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzpu {
    private static final Map zza;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        zzb(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        zzb(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        zzb(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        zzb(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        zzb(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        zzb(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        zzb(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        zzb(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        zzb(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        zza = DesugarCollections.unmodifiableMap(linkedHashMap);
        DesugarCollections.unmodifiableMap(linkedHashMap2);
    }

    public static Class zza(Class cls) {
        cls.getClass();
        Class cls2 = (Class) zza.get(cls);
        return cls2 == null ? cls : cls2;
    }

    private static void zzb(Map map, Map map2, Class cls, Class cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }
}
