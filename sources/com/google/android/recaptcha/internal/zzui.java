package com.google.android.recaptcha.internal;

import aa.d;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzui {
    public static final /* synthetic */ int zza = 0;
    private static final zzuv zzb;

    static {
        int i9 = zzuc.zza;
        zzb = new zzux();
    }

    public static void zzA(int i9, List list, zzvi zzviVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzA(i9, list, z10);
    }

    public static void zzB(int i9, List list, zzvi zzviVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzC(i9, list, z10);
    }

    public static void zzC(int i9, List list, zzvi zzviVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzE(i9, list, z10);
    }

    public static void zzD(int i9, List list, zzvi zzviVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzJ(i9, list, z10);
    }

    public static void zzE(int i9, List list, zzvi zzviVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzL(i9, list, z10);
    }

    public static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int i10 = 0;
            while (i9 < size) {
                i10 += zzqv.zzB(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return i10;
        }
        zzso zzsoVar = (zzso) list;
        int i11 = 0;
        while (i9 < size) {
            i11 += zzqv.zzB(zzsoVar.zze(i9));
            i9++;
        }
        return i11;
    }

    public static int zzb(int i9, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzqv.zzA(i9 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i9, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzqv.zzA(i9 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int i10 = 0;
            while (i9 < size) {
                i10 += zzqv.zzB(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return i10;
        }
        zzso zzsoVar = (zzso) list;
        int i11 = 0;
        while (i9 < size) {
            i11 += zzqv.zzB(zzsoVar.zze(i9));
            i9++;
        }
        return i11;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzth)) {
            int i10 = 0;
            while (i9 < size) {
                i10 += zzqv.zzB(((Long) list.get(i9)).longValue());
                i9++;
            }
            return i10;
        }
        zzth zzthVar = (zzth) list;
        int i11 = 0;
        while (i9 < size) {
            i11 += zzqv.zzB(zzthVar.zze(i9));
            i9++;
        }
        return i11;
    }

    public static int zzh(int i9, Object obj, zzug zzugVar) {
        int i10 = i9 << 3;
        if (!(obj instanceof zztd)) {
            return zzqv.zzy((zzts) obj, zzugVar) + zzqv.zzA(i10);
        }
        int zzA = zzqv.zzA(i10);
        int zza2 = ((zztd) obj).zza();
        return d.C(zza2, zza2, zzA);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int i10 = 0;
            while (i9 < size) {
                int intValue = ((Integer) list.get(i9)).intValue();
                i10 += zzqv.zzA((intValue >> 31) ^ (intValue + intValue));
                i9++;
            }
            return i10;
        }
        zzso zzsoVar = (zzso) list;
        int i11 = 0;
        while (i9 < size) {
            int zze = zzsoVar.zze(i9);
            i11 += zzqv.zzA((zze >> 31) ^ (zze + zze));
            i9++;
        }
        return i11;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzth)) {
            int i10 = 0;
            while (i9 < size) {
                long longValue = ((Long) list.get(i9)).longValue();
                i10 += zzqv.zzB((longValue >> 63) ^ (longValue + longValue));
                i9++;
            }
            return i10;
        }
        zzth zzthVar = (zzth) list;
        int i11 = 0;
        while (i9 < size) {
            long zze = zzthVar.zze(i9);
            i11 += zzqv.zzB((zze >> 63) ^ (zze + zze));
            i9++;
        }
        return i11;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int i10 = 0;
            while (i9 < size) {
                i10 += zzqv.zzA(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return i10;
        }
        zzso zzsoVar = (zzso) list;
        int i11 = 0;
        while (i9 < size) {
            i11 += zzqv.zzA(zzsoVar.zze(i9));
            i9++;
        }
        return i11;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzth)) {
            int i10 = 0;
            while (i9 < size) {
                i10 += zzqv.zzB(((Long) list.get(i9)).longValue());
                i9++;
            }
            return i10;
        }
        zzth zzthVar = (zzth) list;
        int i11 = 0;
        while (i9 < size) {
            i11 += zzqv.zzB(zzthVar.zze(i9));
            i9++;
        }
        return i11;
    }

    public static zzuv zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i9, List list, zzsr zzsrVar, Object obj2, zzuv zzuvVar) {
        if (zzsrVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zzsrVar.zza(intValue)) {
                    obj2 = zzo(obj, i9, intValue, obj2, zzuvVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = (Integer) list.get(i11);
            int intValue2 = num.intValue();
            if (zzsrVar.zza(intValue2)) {
                if (i11 != i10) {
                    list.set(i10, num);
                }
                i10++;
            } else {
                obj2 = zzo(obj, i9, intValue2, obj2, zzuvVar);
            }
        }
        if (i10 != size) {
            list.subList(i10, size).clear();
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i9, int i10, Object obj2, zzuv zzuvVar) {
        if (obj2 == null) {
            obj2 = zzuvVar.zza(obj);
        }
        zzuvVar.zzh(obj2, i9, i10);
        return obj2;
    }

    public static void zzp(zzrz zzrzVar, Object obj, Object obj2) {
        zzsd zzsdVar = ((zzsk) obj2).zzb;
        if (zzsdVar.zza.isEmpty()) {
            return;
        }
        ((zzsk) obj).zzi().zzh(zzsdVar);
    }

    public static void zzq(zzuv zzuvVar, Object obj, Object obj2) {
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

    public static void zzr(int i9, List list, zzvi zzviVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzc(i9, list, z10);
    }

    public static void zzs(int i9, List list, zzvi zzviVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzg(i9, list, z10);
    }

    public static void zzt(int i9, List list, zzvi zzviVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzj(i9, list, z10);
    }

    public static void zzu(int i9, List list, zzvi zzviVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzl(i9, list, z10);
    }

    public static void zzv(int i9, List list, zzvi zzviVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzn(i9, list, z10);
    }

    public static void zzw(int i9, List list, zzvi zzviVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzp(i9, list, z10);
    }

    public static void zzx(int i9, List list, zzvi zzviVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzs(i9, list, z10);
    }

    public static void zzy(int i9, List list, zzvi zzviVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzu(i9, list, z10);
    }

    public static void zzz(int i9, List list, zzvi zzviVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzy(i9, list, z10);
    }
}
