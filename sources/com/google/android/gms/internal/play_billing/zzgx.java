package com.google.android.gms.internal.play_billing;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.List;

/* loaded from: classes.dex */
abstract class zzgx {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final zzhh zzb;

    static {
        int i = zzgs.$r8$clinit;
        zzb = new zzhj();
    }

    public static void zzA(int i, List list, zzhu zzhuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzC(i, list, z);
    }

    public static void zzB(int i, List list, zzhu zzhuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzE(i, list, z);
    }

    public static void zzC(int i, List list, zzhu zzhuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzJ(i, list, z);
    }

    public static void zzD(int i, List list, zzhu zzhuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzL(i, list, z);
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
        if (!(list instanceof zzfj)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzep.zzD(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzfj zzfjVar = (zzfj) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzep.zzD(zzfjVar.zze(i));
            i++;
        }
        return i3;
    }

    static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzep.zzC(i << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzep.zzC(i << 3) + 8);
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
        if (!(list instanceof zzfj)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzep.zzD(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzfj zzfjVar = (zzfj) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzep.zzD(zzfjVar.zze(i));
            i++;
        }
        return i3;
    }

    static int zzg(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzga) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzep.zzD(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    static int zzi(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfj)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzep.zzC((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        zzfj zzfjVar = (zzfj) list;
        int i3 = 0;
        while (i < size) {
            int zze = zzfjVar.zze(i);
            i3 += zzep.zzC((zze >> 31) ^ (zze + zze));
            i++;
        }
        return i3;
    }

    static int zzj(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzga) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += zzep.zzD((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfj)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzep.zzC(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzfj zzfjVar = (zzfj) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzep.zzC(zzfjVar.zze(i));
            i++;
        }
        return i3;
    }

    static int zzl(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzga) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzep.zzD(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static zzhh zzm() {
        return zzb;
    }

    static Object zzn(Object obj, int i, int i2, Object obj2, zzhh zzhhVar) {
        if (obj2 == null) {
            obj2 = zzhhVar.zza(obj);
        }
        ((zzhi) obj2).zzj(i << 3, Long.valueOf(i2));
        return obj2;
    }

    static void zzo(zzev zzevVar, Object obj, Object obj2) {
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
        throw null;
    }

    static void zzp(zzhh zzhhVar, Object obj, Object obj2) {
        zzfi zzfiVar = (zzfi) obj;
        zzhi zzhiVar = zzfiVar.zzc;
        zzhi zzhiVar2 = ((zzfi) obj2).zzc;
        if (!zzhi.zzc().equals(zzhiVar2)) {
            if (zzhi.zzc().equals(zzhiVar)) {
                zzhiVar = zzhi.zze(zzhiVar, zzhiVar2);
            } else {
                zzhiVar.zzd(zzhiVar2);
            }
        }
        zzfiVar.zzc = zzhiVar;
    }

    public static void zzq(int i, List list, zzhu zzhuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzc(i, list, z);
    }

    public static void zzr(int i, List list, zzhu zzhuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzg(i, list, z);
    }

    public static void zzs(int i, List list, zzhu zzhuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzj(i, list, z);
    }

    public static void zzt(int i, List list, zzhu zzhuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzl(i, list, z);
    }

    public static void zzu(int i, List list, zzhu zzhuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzn(i, list, z);
    }

    public static void zzv(int i, List list, zzhu zzhuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzp(i, list, z);
    }

    public static void zzw(int i, List list, zzhu zzhuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzs(i, list, z);
    }

    public static void zzx(int i, List list, zzhu zzhuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzu(i, list, z);
    }

    public static void zzy(int i, List list, zzhu zzhuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzy(i, list, z);
    }

    public static void zzz(int i, List list, zzhu zzhuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzA(i, list, z);
    }

    static int zzh(int i, Object obj, zzgv zzgvVar) {
        return zzep.zzC(i << 3) + zzep.zzA((zzgl) obj, zzgvVar);
    }
}
