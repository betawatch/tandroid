package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
abstract class zzle {
    private static final Class zza = zzd();
    private static final zzlu zzb = zza(false);
    private static final zzlu zzc = zza(true);
    private static final zzlu zzd = new zzlw();

    public static void zza(Class cls) {
        Class cls2;
        if (!zzjb.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List list, zzmr zzmrVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzg(i, list, z);
    }

    public static void zzb(int i, List list, zzmr zzmrVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzf(i, list, z);
    }

    public static void zzc(int i, List list, zzmr zzmrVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzc(i, list, z);
    }

    public static void zzd(int i, List list, zzmr zzmrVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzd(i, list, z);
    }

    public static void zze(int i, List list, zzmr zzmrVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzn(i, list, z);
    }

    public static void zzf(int i, List list, zzmr zzmrVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zze(i, list, z);
    }

    public static void zzg(int i, List list, zzmr zzmrVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzl(i, list, z);
    }

    public static void zzh(int i, List list, zzmr zzmrVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zza(i, list, z);
    }

    public static void zzi(int i, List list, zzmr zzmrVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzj(i, list, z);
    }

    public static void zzj(int i, List list, zzmr zzmrVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzm(i, list, z);
    }

    public static void zzk(int i, List list, zzmr zzmrVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzb(i, list, z);
    }

    public static void zzl(int i, List list, zzmr zzmrVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzk(i, list, z);
    }

    public static void zzm(int i, List list, zzmr zzmrVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzh(i, list, z);
    }

    public static void zzn(int i, List list, zzmr zzmrVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzi(i, list, z);
    }

    public static void zza(int i, List list, zzmr zzmrVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zza(i, list);
    }

    public static void zzb(int i, List list, zzmr zzmrVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzb(i, list);
    }

    public static void zza(int i, List list, zzmr zzmrVar, zzlc zzlcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zza(i, list, zzlcVar);
    }

    public static void zzb(int i, List list, zzmr zzmrVar, zzlc zzlcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmrVar.zzb(i, list, zzlcVar);
    }

    static int zza(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzii.zzd(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    static int zza(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zza(list) + (list.size() * zzii.zze(i));
    }

    static int zzb(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzii.zze(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzii.zze(i));
    }

    static int zzc(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzii.zzf(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    static int zzc(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzc(list) + (size * zzii.zze(i));
    }

    static int zzd(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjd) {
            zzjd zzjdVar = (zzjd) list;
            i = 0;
            while (i2 < size) {
                i += zzii.zzk(zzjdVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzii.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzii.zze(i));
    }

    static int zze(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjd) {
            zzjd zzjdVar = (zzjd) list;
            i = 0;
            while (i2 < size) {
                i += zzii.zzf(zzjdVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzii.zzf(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zze(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzii.zze(i));
    }

    static int zzf(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjd) {
            zzjd zzjdVar = (zzjd) list;
            i = 0;
            while (i2 < size) {
                i += zzii.zzg(zzjdVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzii.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzf(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * zzii.zze(i));
    }

    static int zzg(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjd) {
            zzjd zzjdVar = (zzjd) list;
            i = 0;
            while (i2 < size) {
                i += zzii.zzh(zzjdVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzii.zzh(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzg(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzii.zze(i));
    }

    static int zzh(List list) {
        return list.size() << 2;
    }

    static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.zzi(i, 0);
    }

    static int zzi(List list) {
        return list.size() << 3;
    }

    static int zzi(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.zzg(i, 0L);
    }

    static int zzj(List list) {
        return list.size();
    }

    static int zzj(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.zzb(i, true);
    }

    static int zza(int i, List list) {
        int zzb2;
        int zzb3;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zze = zzii.zze(i) * size;
        if (list instanceof zzjv) {
            zzjv zzjvVar = (zzjv) list;
            while (i2 < size) {
                Object zzb4 = zzjvVar.zzb(i2);
                if (zzb4 instanceof zzht) {
                    zzb3 = zzii.zzb((zzht) zzb4);
                } else {
                    zzb3 = zzii.zzb((String) zzb4);
                }
                zze += zzb3;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzht) {
                    zzb2 = zzii.zzb((zzht) obj);
                } else {
                    zzb2 = zzii.zzb((String) obj);
                }
                zze += zzb2;
                i2++;
            }
        }
        return zze;
    }

    static int zza(int i, Object obj, zzlc zzlcVar) {
        return zzii.zzb(i, (zzkk) obj, zzlcVar);
    }

    static int zza(int i, List list, zzlc zzlcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = zzii.zze(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            zze += zzii.zza((zzkk) list.get(i2), zzlcVar);
        }
        return zze;
    }

    static int zzb(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = size * zzii.zze(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zze += zzii.zzb((zzht) list.get(i2));
        }
        return zze;
    }

    static int zzb(int i, List list, zzlc zzlcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzii.zzc(i, (zzkk) list.get(i3), zzlcVar);
        }
        return i2;
    }

    public static zzlu zza() {
        return zzb;
    }

    public static zzlu zzb() {
        return zzc;
    }

    public static zzlu zzc() {
        return zzd;
    }

    private static zzlu zza(boolean z) {
        try {
            Class zze = zze();
            if (zze == null) {
                return null;
            }
            return (zzlu) zze.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zza(zzkh zzkhVar, Object obj, Object obj2, long j) {
        zzma.zza(obj, j, zzkhVar.zza(zzma.zzf(obj, j), zzma.zzf(obj2, j)));
    }

    static void zza(zziq zziqVar, Object obj, Object obj2) {
        zziu zza2 = zziqVar.zza(obj2);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zziqVar.zzb(obj).zza(zza2);
    }

    static void zza(zzlu zzluVar, Object obj, Object obj2) {
        zzluVar.zza(obj, zzluVar.zzc(zzluVar.zzb(obj), zzluVar.zzb(obj2)));
    }

    static Object zza(int i, List list, zzjg zzjgVar, Object obj, zzlu zzluVar) {
        if (zzjgVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (zzjgVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj = zza(i, intValue, obj, zzluVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzjgVar.zza(intValue2)) {
                    obj = zza(i, intValue2, obj, zzluVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    static Object zza(int i, int i2, Object obj, zzlu zzluVar) {
        if (obj == null) {
            obj = zzluVar.zza();
        }
        zzluVar.zza(obj, i, i2);
        return obj;
    }
}
