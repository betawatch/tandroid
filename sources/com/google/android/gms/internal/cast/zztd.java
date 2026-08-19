package com.google.android.gms.internal.cast;

import java.util.List;

/* loaded from: classes.dex */
final class zztd implements zzwq {
    private final zztc zza;

    private zztd(zztc zztcVar) {
        byte[] bArr = zzty.zzd;
        this.zza = zztcVar;
        zztcVar.zza = this;
    }

    public static zztd zza(zztc zztcVar) {
        zztd zztdVar = zztcVar.zza;
        return zztdVar != null ? zztdVar : new zztd(zztcVar);
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzB(int i, long j) {
        this.zza.zzr(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzD(int i, String str) {
        this.zza.zzm(i, str);
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzF(int i, int i2) {
        this.zza.zzp(i, i2);
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzH(int i, long j) {
        this.zza.zzr(i, j);
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzb(int i, boolean z) {
        this.zza.zzd(i, z);
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzd(int i, zzsu zzsuVar) {
        this.zza.zze(i, zzsuVar);
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zze(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zze(i, (zzsu) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzf(int i, double d) {
        this.zza.zzh(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzh(int i, int i2) {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzj(int i, int i2) {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzl(int i, long j) {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzn(int i, float f) {
        this.zza.zzf(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzp(int i, Object obj, zzvi zzviVar) {
        zztc zztcVar = this.zza;
        zztcVar.zzo(i, 3);
        zzviVar.zzf((zzux) obj, zztcVar.zza);
        zztcVar.zzo(i, 4);
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzq(int i, int i2) {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzs(int i, long j) {
        this.zza.zzr(i, j);
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzu(int i, Object obj, zzvi zzviVar) {
        zzux zzuxVar = (zzux) obj;
        zzsz zzszVar = (zzsz) this.zza;
        zzszVar.zzq((i << 3) | 2);
        zzszVar.zzq(((zzsh) zzuxVar).zzq(zzviVar));
        zzviVar.zzf(zzuxVar, zzszVar.zza);
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzv(int i, int i2) {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzx(int i, long j) {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzz(int i, int i2) {
        this.zza.zzp(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzE(int i, List list) {
        int i2 = 0;
        if (!(list instanceof zzuf)) {
            while (i2 < list.size()) {
                this.zza.zzm(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzuf zzufVar = (zzuf) list;
        while (i2 < list.size()) {
            Object zze = zzufVar.zze(i2);
            if (zze instanceof String) {
                this.zza.zzm(i, (String) zze);
            } else {
                this.zza.zze(i, (zzsu) zze);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzG(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzp(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zztc.zzx(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzq(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzI(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzr(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zztc.zzy(((Long) list.get(i4)).longValue());
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzs(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzc(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzd(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzk(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzg(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzm(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzr(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zztc.zzu(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzk(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzA(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zztc zztcVar = this.zza;
                int intValue = ((Integer) list.get(i2)).intValue();
                zztcVar.zzp(i, (intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += zztc.zzx((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            zztc zztcVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zztcVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzC(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zztc zztcVar = this.zza;
                long longValue = ((Long) list.get(i2)).longValue();
                zztcVar.zzr(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += zztc.zzy((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            zztc zztcVar2 = this.zza;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zztcVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzg(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzi(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zztc.zzu(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzk(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzo(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzt(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzr(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zztc.zzy(((Long) list.get(i4)).longValue());
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzs(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzw(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzg(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwq
    public final void zzy(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        this.zza.zzq(i3);
        while (i2 < list.size()) {
            this.zza.zzi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
