package com.google.android.gms.internal.cast;

import java.util.List;

/* loaded from: classes.dex */
abstract class zzvk {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final Class zzb;
    private static final zzvz zzc;
    private static final zzvz zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzvz zzvzVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzvzVar = (zzvz) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzvzVar;
        zzd = new zzwb();
    }

    public static void zzA(int i, List list, zzwq zzwqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzwqVar.zzA(i, list, z);
    }

    public static void zzB(int i, List list, zzwq zzwqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzwqVar.zzC(i, list, z);
    }

    public static void zzC(int i, List list, zzwq zzwqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzwqVar.zzG(i, list, z);
    }

    public static void zzD(int i, List list, zzwq zzwqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzwqVar.zzI(i, list, z);
    }

    static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zztq)) {
            int i2 = 0;
            while (i < size) {
                i2 += zztc.zzu(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zztq zztqVar = (zztq) list;
        int i3 = 0;
        while (i < size) {
            i3 += zztc.zzu(zztqVar.zzd(i));
            i++;
        }
        return i3;
    }

    static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zztc.zzx(i << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zztc.zzx(i << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zztq)) {
            int i2 = 0;
            while (i < size) {
                i2 += zztc.zzu(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zztq zztqVar = (zztq) list;
        int i3 = 0;
        while (i < size) {
            i3 += zztc.zzu(zztqVar.zzd(i));
            i++;
        }
        return i3;
    }

    static int zzg(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzum)) {
            int i2 = 0;
            while (i < size) {
                i2 += zztc.zzy(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzum zzumVar = (zzum) list;
        int i3 = 0;
        while (i < size) {
            i3 += zztc.zzy(zzumVar.zzd(i));
            i++;
        }
        return i3;
    }

    static int zzi(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zztq)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zztc.zzx((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        zztq zztqVar = (zztq) list;
        int i3 = 0;
        while (i < size) {
            int zzd2 = zztqVar.zzd(i);
            i3 += zztc.zzx((zzd2 >> 31) ^ (zzd2 + zzd2));
            i++;
        }
        return i3;
    }

    static int zzj(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzum)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += zztc.zzy((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        zzum zzumVar = (zzum) list;
        int i3 = 0;
        while (i < size) {
            long zzd2 = zzumVar.zzd(i);
            i3 += zztc.zzy((zzd2 >> 63) ^ (zzd2 + zzd2));
            i++;
        }
        return i3;
    }

    static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zztq)) {
            int i2 = 0;
            while (i < size) {
                i2 += zztc.zzx(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zztq zztqVar = (zztq) list;
        int i3 = 0;
        while (i < size) {
            i3 += zztc.zzx(zztqVar.zzd(i));
            i++;
        }
        return i3;
    }

    static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzum)) {
            int i2 = 0;
            while (i < size) {
                i2 += zztc.zzy(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzum zzumVar = (zzum) list;
        int i3 = 0;
        while (i < size) {
            i3 += zztc.zzy(zzumVar.zzd(i));
            i++;
        }
        return i3;
    }

    public static zzvz zzm() {
        return zzc;
    }

    public static zzvz zzn() {
        return zzd;
    }

    static void zzo(zzvz zzvzVar, Object obj, Object obj2) {
        zzvzVar.zzf(obj, zzvzVar.zzd(zzvzVar.zzc(obj), zzvzVar.zzc(obj2)));
    }

    public static void zzp(Class cls) {
        Class cls2;
        if (!zztp.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzq(int i, List list, zzwq zzwqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzwqVar.zzc(i, list, z);
    }

    public static void zzr(int i, List list, zzwq zzwqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzwqVar.zzg(i, list, z);
    }

    public static void zzs(int i, List list, zzwq zzwqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzwqVar.zzi(i, list, z);
    }

    public static void zzt(int i, List list, zzwq zzwqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzwqVar.zzk(i, list, z);
    }

    public static void zzu(int i, List list, zzwq zzwqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzwqVar.zzm(i, list, z);
    }

    public static void zzv(int i, List list, zzwq zzwqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzwqVar.zzo(i, list, z);
    }

    public static void zzw(int i, List list, zzwq zzwqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzwqVar.zzr(i, list, z);
    }

    public static void zzx(int i, List list, zzwq zzwqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzwqVar.zzt(i, list, z);
    }

    public static void zzy(int i, List list, zzwq zzwqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzwqVar.zzw(i, list, z);
    }

    public static void zzz(int i, List list, zzwq zzwqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzwqVar.zzy(i, list, z);
    }

    static int zzh(int i, Object obj, zzvi zzviVar) {
        return zztc.zzx(i << 3) + zztc.zzv((zzux) obj, zzviVar);
    }
}
