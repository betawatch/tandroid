package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
final class zzui {
    public static final /* synthetic */ int zza = 0;
    private static final zzuv zzb;

    static {
        int i7 = zzuc.zza;
        zzb = new zzux();
    }

    public static void zzA(int i7, List list, zzvi zzviVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzA(i7, list, z9);
    }

    public static void zzB(int i7, List list, zzvi zzviVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzC(i7, list, z9);
    }

    public static void zzC(int i7, List list, zzvi zzviVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzE(i7, list, z9);
    }

    public static void zzD(int i7, List list, zzvi zzviVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzJ(i7, list, z9);
    }

    public static void zzE(int i7, List list, zzvi zzviVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzL(i7, list, z9);
    }

    public static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int i10 = 0;
            while (i7 < size) {
                i10 += zzqv.zzB(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return i10;
        }
        zzso zzsoVar = (zzso) list;
        int i11 = 0;
        while (i7 < size) {
            i11 += zzqv.zzB(zzsoVar.zze(i7));
            i7++;
        }
        return i11;
    }

    public static int zzb(int i7, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzqv.zzA(i7 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i7, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzqv.zzA(i7 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int i10 = 0;
            while (i7 < size) {
                i10 += zzqv.zzB(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return i10;
        }
        zzso zzsoVar = (zzso) list;
        int i11 = 0;
        while (i7 < size) {
            i11 += zzqv.zzB(zzsoVar.zze(i7));
            i7++;
        }
        return i11;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzth)) {
            int i10 = 0;
            while (i7 < size) {
                i10 += zzqv.zzB(((Long) list.get(i7)).longValue());
                i7++;
            }
            return i10;
        }
        zzth zzthVar = (zzth) list;
        int i11 = 0;
        while (i7 < size) {
            i11 += zzqv.zzB(zzthVar.zze(i7));
            i7++;
        }
        return i11;
    }

    public static int zzh(int i7, Object obj, zzug zzugVar) {
        int i10 = i7 << 3;
        if (!(obj instanceof zztd)) {
            return zzqv.zzy((zzts) obj, zzugVar) + zzqv.zzA(i10);
        }
        int zzA = zzqv.zzA(i10);
        int zza2 = ((zztd) obj).zza();
        return a.d(zza2, zza2, zzA);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int i10 = 0;
            while (i7 < size) {
                int intValue = ((Integer) list.get(i7)).intValue();
                i10 += zzqv.zzA((intValue >> 31) ^ (intValue + intValue));
                i7++;
            }
            return i10;
        }
        zzso zzsoVar = (zzso) list;
        int i11 = 0;
        while (i7 < size) {
            int zze = zzsoVar.zze(i7);
            i11 += zzqv.zzA((zze >> 31) ^ (zze + zze));
            i7++;
        }
        return i11;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzth)) {
            int i10 = 0;
            while (i7 < size) {
                long longValue = ((Long) list.get(i7)).longValue();
                i10 += zzqv.zzB((longValue >> 63) ^ (longValue + longValue));
                i7++;
            }
            return i10;
        }
        zzth zzthVar = (zzth) list;
        int i11 = 0;
        while (i7 < size) {
            long zze = zzthVar.zze(i7);
            i11 += zzqv.zzB((zze >> 63) ^ (zze + zze));
            i7++;
        }
        return i11;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int i10 = 0;
            while (i7 < size) {
                i10 += zzqv.zzA(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return i10;
        }
        zzso zzsoVar = (zzso) list;
        int i11 = 0;
        while (i7 < size) {
            i11 += zzqv.zzA(zzsoVar.zze(i7));
            i7++;
        }
        return i11;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzth)) {
            int i10 = 0;
            while (i7 < size) {
                i10 += zzqv.zzB(((Long) list.get(i7)).longValue());
                i7++;
            }
            return i10;
        }
        zzth zzthVar = (zzth) list;
        int i11 = 0;
        while (i7 < size) {
            i11 += zzqv.zzB(zzthVar.zze(i7));
            i7++;
        }
        return i11;
    }

    public static zzuv zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i7, List list, zzsr zzsrVar, Object obj2, zzuv zzuvVar) {
        if (zzsrVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zzsrVar.zza(intValue)) {
                    obj2 = zzo(obj, i7, intValue, obj2, zzuvVar);
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
                obj2 = zzo(obj, i7, intValue2, obj2, zzuvVar);
            }
        }
        if (i10 != size) {
            list.subList(i10, size).clear();
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i7, int i10, Object obj2, zzuv zzuvVar) {
        if (obj2 == null) {
            obj2 = zzuvVar.zza(obj);
        }
        zzuvVar.zzh(obj2, i7, i10);
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

    public static void zzr(int i7, List list, zzvi zzviVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzc(i7, list, z9);
    }

    public static void zzs(int i7, List list, zzvi zzviVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzg(i7, list, z9);
    }

    public static void zzt(int i7, List list, zzvi zzviVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzj(i7, list, z9);
    }

    public static void zzu(int i7, List list, zzvi zzviVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzl(i7, list, z9);
    }

    public static void zzv(int i7, List list, zzvi zzviVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzn(i7, list, z9);
    }

    public static void zzw(int i7, List list, zzvi zzviVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzp(i7, list, z9);
    }

    public static void zzx(int i7, List list, zzvi zzviVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzs(i7, list, z9);
    }

    public static void zzy(int i7, List list, zzvi zzviVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzu(i7, list, z9);
    }

    public static void zzz(int i7, List list, zzvi zzviVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzy(i7, list, z9);
    }
}
