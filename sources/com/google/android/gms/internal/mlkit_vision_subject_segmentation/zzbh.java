package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzbh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzb(Map map, Object obj) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
