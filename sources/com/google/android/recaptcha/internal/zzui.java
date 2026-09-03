package com.google.android.recaptcha.internal;

import android.support.v4.media.a;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
final class zzui {
    public static final /* synthetic */ int zza = 0;
    private static final zzuv zzb;

    static {
        int i10 = zzuc.zza;
        zzb = new zzux();
    }

    public static void zzA(int i10, List list, zzvi zzviVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzA(i10, list, z4);
    }

    public static void zzB(int i10, List list, zzvi zzviVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzC(i10, list, z4);
    }

    public static void zzC(int i10, List list, zzvi zzviVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzE(i10, list, z4);
    }

    public static void zzD(int i10, List list, zzvi zzviVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzJ(i10, list, z4);
    }

    public static void zzE(int i10, List list, zzvi zzviVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzL(i10, list, z4);
    }

    public static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += zzqv.zzB(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        zzso zzsoVar = (zzso) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += zzqv.zzB(zzsoVar.zze(i10));
            i10++;
        }
        return i12;
    }

    public static int zzb(int i10, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzqv.zzA(i10 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i10, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzqv.zzA(i10 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += zzqv.zzB(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        zzso zzsoVar = (zzso) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += zzqv.zzB(zzsoVar.zze(i10));
            i10++;
        }
        return i12;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzth)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += zzqv.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        zzth zzthVar = (zzth) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += zzqv.zzB(zzthVar.zze(i10));
            i10++;
        }
        return i12;
    }

    public static int zzh(int i10, Object obj, zzug zzugVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof zztd)) {
            return zzqv.zzy((zzts) obj, zzugVar) + zzqv.zzA(i11);
        }
        int zzA = zzqv.zzA(i11);
        int zza2 = ((zztd) obj).zza();
        return a.C(zza2, zza2, zzA);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int i11 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i11 += zzqv.zzA((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
            return i11;
        }
        zzso zzsoVar = (zzso) list;
        int i12 = 0;
        while (i10 < size) {
            int zze = zzsoVar.zze(i10);
            i12 += zzqv.zzA((zze >> 31) ^ (zze + zze));
            i10++;
        }
        return i12;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzth)) {
            int i11 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i11 += zzqv.zzB((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
            return i11;
        }
        zzth zzthVar = (zzth) list;
        int i12 = 0;
        while (i10 < size) {
            long zze = zzthVar.zze(i10);
            i12 += zzqv.zzB((zze >> 63) ^ (zze + zze));
            i10++;
        }
        return i12;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += zzqv.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        zzso zzsoVar = (zzso) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += zzqv.zzA(zzsoVar.zze(i10));
            i10++;
        }
        return i12;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzth)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += zzqv.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        zzth zzthVar = (zzth) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += zzqv.zzB(zzthVar.zze(i10));
            i10++;
        }
        return i12;
    }

    public static zzuv zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i10, List list, zzsr zzsrVar, Object obj2, zzuv zzuvVar) {
        if (zzsrVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zzsrVar.zza(intValue)) {
                    obj2 = zzo(obj, i10, intValue, obj2, zzuvVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int intValue2 = num.intValue();
            if (zzsrVar.zza(intValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = zzo(obj, i10, intValue2, obj2, zzuvVar);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i10, int i11, Object obj2, zzuv zzuvVar) {
        if (obj2 == null) {
            obj2 = zzuvVar.zza(obj);
        }
        zzuvVar.zzh(obj2, i10, i11);
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

    public static void zzr(int i10, List list, zzvi zzviVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzc(i10, list, z4);
    }

    public static void zzs(int i10, List list, zzvi zzviVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzg(i10, list, z4);
    }

    public static void zzt(int i10, List list, zzvi zzviVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzj(i10, list, z4);
    }

    public static void zzu(int i10, List list, zzvi zzviVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzl(i10, list, z4);
    }

    public static void zzv(int i10, List list, zzvi zzviVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzn(i10, list, z4);
    }

    public static void zzw(int i10, List list, zzvi zzviVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzp(i10, list, z4);
    }

    public static void zzx(int i10, List list, zzvi zzviVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzs(i10, list, z4);
    }

    public static void zzy(int i10, List list, zzvi zzviVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzu(i10, list, z4);
    }

    public static void zzz(int i10, List list, zzvi zzviVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzy(i10, list, z4);
    }
}
