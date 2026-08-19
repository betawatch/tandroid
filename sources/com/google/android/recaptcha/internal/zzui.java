package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzui {
    public static final /* synthetic */ int zza = 0;
    private static final zzuv zzb;

    static {
        int i = zzuc.zza;
        zzb = new zzux();
    }

    public static void zzA(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzA(i, list, z);
    }

    public static void zzB(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzC(i, list, z);
    }

    public static void zzC(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzE(i, list, z);
    }

    public static void zzD(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzJ(i, list, z);
    }

    public static void zzE(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzL(i, list, z);
    }

    static boolean zzF(Object obj, Object obj2) {
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
        if (!(list instanceof zzso)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzqv.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzso zzsoVar = (zzso) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzqv.zzB(zzsoVar.zze(i));
            i++;
        }
        return i3;
    }

    static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzqv.zzA(i << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzqv.zzA(i << 3) + 8);
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
        if (!(list instanceof zzso)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzqv.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzso zzsoVar = (zzso) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzqv.zzB(zzsoVar.zze(i));
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
        if (!(list instanceof zzth)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzqv.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzth zzthVar = (zzth) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzqv.zzB(zzthVar.zze(i));
            i++;
        }
        return i3;
    }

    static int zzh(int i, Object obj, zzug zzugVar) {
        int i2 = i << 3;
        if (!(obj instanceof zztd)) {
            return zzqv.zzA(i2) + zzqv.zzy((zzts) obj, zzugVar);
        }
        int zzA = zzqv.zzA(i2);
        int zza2 = ((zztd) obj).zza();
        return zzA + zzqv.zzA(zza2) + zza2;
    }

    static int zzi(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzqv.zzA((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        zzso zzsoVar = (zzso) list;
        int i3 = 0;
        while (i < size) {
            int zze = zzsoVar.zze(i);
            i3 += zzqv.zzA((zze >> 31) ^ (zze + zze));
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
        if (!(list instanceof zzth)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += zzqv.zzB((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        zzth zzthVar = (zzth) list;
        int i3 = 0;
        while (i < size) {
            long zze = zzthVar.zze(i);
            i3 += zzqv.zzB((zze >> 63) ^ (zze + zze));
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
        if (!(list instanceof zzso)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzqv.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzso zzsoVar = (zzso) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzqv.zzA(zzsoVar.zze(i));
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
        if (!(list instanceof zzth)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzqv.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzth zzthVar = (zzth) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzqv.zzB(zzthVar.zze(i));
            i++;
        }
        return i3;
    }

    public static zzuv zzm() {
        return zzb;
    }

    static Object zzn(Object obj, int i, List list, zzsr zzsrVar, Object obj2, zzuv zzuvVar) {
        if (zzsrVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zzsrVar.zza(intValue)) {
                    obj2 = zzo(obj, i, intValue, obj2, zzuvVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int intValue2 = num.intValue();
            if (zzsrVar.zza(intValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = zzo(obj, i, intValue2, obj2, zzuvVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object zzo(Object obj, int i, int i2, Object obj2, zzuv zzuvVar) {
        if (obj2 == null) {
            obj2 = zzuvVar.zza(obj);
        }
        zzuvVar.zzh(obj2, i, i2);
        return obj2;
    }

    static void zzp(zzrz zzrzVar, Object obj, Object obj2) {
        zzsd zzsdVar = ((zzsk) obj2).zzb;
        if (zzsdVar.zza.isEmpty()) {
            return;
        }
        ((zzsk) obj).zzi().zzh(zzsdVar);
    }

    static void zzq(zzuv zzuvVar, Object obj, Object obj2) {
        zzsn zzsnVar = (zzsn) obj;
        zzuw zzuwVar = zzsnVar.zzc;
        zzuw zzuwVar2 = ((zzsn) obj2).zzc;
        if (!zzuw.zzc().equals(zzuwVar2)) {
            if (zzuw.zzc().equals(zzuwVar)) {
                zzuwVar = zzuw.zze(zzuwVar, zzuwVar2);
            } else {
                zzuwVar.zzd(zzuwVar2);
            }
        }
        zzsnVar.zzc = zzuwVar;
    }

    public static void zzr(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzc(i, list, z);
    }

    public static void zzs(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzg(i, list, z);
    }

    public static void zzt(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzj(i, list, z);
    }

    public static void zzu(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzl(i, list, z);
    }

    public static void zzv(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzn(i, list, z);
    }

    public static void zzw(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzp(i, list, z);
    }

    public static void zzx(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzs(i, list, z);
    }

    public static void zzy(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzu(i, list, z);
    }

    public static void zzz(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzy(i, list, z);
    }
}
