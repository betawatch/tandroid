package com.google.android.gms.internal.play_billing;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.List;

/* loaded from: classes.dex */
final class zzgs implements zzjw {
    private final zzgr zza;

    private zzgs(zzgr zzgrVar) {
        byte[] bArr = zzhp.zzb;
        this.zza = zzgrVar;
        zzgrVar.zza = this;
    }

    public static zzgs zza(zzgr zzgrVar) {
        zzgs zzgsVar = zzgrVar.zza;
        return zzgsVar != null ? zzgsVar : new zzgs(zzgrVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzB(int i, int i2) {
        this.zza.zzs(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzD(int i, long j) {
        this.zza.zzu(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzF(int i) {
        this.zza.zzr(i, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzG(int i, String str) {
        this.zza.zzp(i, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzI(int i, int i2) {
        this.zza.zzs(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzK(int i, long j) {
        this.zza.zzu(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzb(int i, boolean z) {
        this.zza.zzd(i, z);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzd(int i, zzgk zzgkVar) {
        this.zza.zze(i, zzgkVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zze(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zze(i, (zzgk) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzf(int i, double d) {
        this.zza.zzh(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzh(int i) {
        this.zza.zzr(i, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzi(int i, int i2) {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzk(int i, int i2) {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzm(int i, long j) {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzo(int i, float f) {
        this.zza.zzf(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzq(int i, Object obj, zzix zzixVar) {
        zzgr zzgrVar = this.zza;
        zzgrVar.zzr(i, 3);
        zzixVar.zzi((zzim) obj, zzgrVar.zza);
        zzgrVar.zzr(i, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzr(int i, int i2) {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzt(int i, long j) {
        this.zza.zzu(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzv(int i, Object obj, zzix zzixVar) {
        this.zza.zzm(i, (zzim) obj, zzixVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzx(int i, int i2) {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzz(int i, long j) {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzH(int i, List list) {
        int i2 = 0;
        if (!(list instanceof zzhy)) {
            while (i2 < list.size()) {
                this.zza.zzp(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzhy zzhyVar = (zzhy) list;
        while (i2 < list.size()) {
            Object zzc = zzhyVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzp(i, (String) zzc);
            } else {
                this.zza.zze(i, (zzgk) zzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzJ(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzhl)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzs(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgr.zzz(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzt(i3);
            while (i2 < list.size()) {
                this.zza.zzt(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z) {
            while (i2 < zzhlVar.size()) {
                this.zza.zzs(i, zzhlVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhlVar.size(); i6++) {
            i5 += zzgr.zzz(zzhlVar.zze(i6));
        }
        this.zza.zzt(i5);
        while (i2 < zzhlVar.size()) {
            this.zza.zzt(zzhlVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzL(int i, List list, boolean z) {
        if (list instanceof zzib) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            if (!z) {
                throw null;
            }
            this.zza.zzr(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzu(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzgr.zzA(((Long) list.get(i4)).longValue());
        }
        this.zza.zzt(i3);
        while (i2 < list.size()) {
            this.zza.zzv(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzl(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzhl)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.zza.zzt(i3);
            while (i2 < list.size()) {
                this.zza.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z) {
            while (i2 < zzhlVar.size()) {
                this.zza.zzf(i, zzhlVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhlVar.size(); i6++) {
            zzhlVar.zze(i6);
            i5 += 4;
        }
        this.zza.zzt(i5);
        while (i2 < zzhlVar.size()) {
            this.zza.zzg(zzhlVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzn(int i, List list, boolean z) {
        if (list instanceof zzib) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            if (!z) {
                throw null;
            }
            this.zza.zzr(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.zza.zzt(i3);
        while (i2 < list.size()) {
            this.zza.zzi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzc(int i, List list, boolean z) {
        if (list instanceof zzgb) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            if (!z) {
                throw null;
            }
            this.zza.zzr(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzd(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        this.zza.zzt(i3);
        while (i2 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzs(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzhl)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgr.zzA(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzt(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z) {
            while (i2 < zzhlVar.size()) {
                this.zza.zzj(i, zzhlVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhlVar.size(); i6++) {
            i5 += zzgr.zzA(zzhlVar.zze(i6));
        }
        this.zza.zzt(i5);
        while (i2 < zzhlVar.size()) {
            this.zza.zzk(zzhlVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzA(int i, List list, boolean z) {
        if (list instanceof zzib) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            if (!z) {
                throw null;
            }
            this.zza.zzr(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.zza.zzt(i3);
        while (i2 < list.size()) {
            this.zza.zzi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzg(int i, List list, boolean z) {
        if (list instanceof zzgt) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            if (!z) {
                throw null;
            }
            this.zza.zzr(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        this.zza.zzt(i3);
        while (i2 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzp(int i, List list, boolean z) {
        if (list instanceof zzhd) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            if (!z) {
                throw null;
            }
            this.zza.zzr(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        this.zza.zzt(i3);
        while (i2 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzy(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzhl)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.zza.zzt(i3);
            while (i2 < list.size()) {
                this.zza.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z) {
            while (i2 < zzhlVar.size()) {
                this.zza.zzf(i, zzhlVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhlVar.size(); i6++) {
            zzhlVar.zze(i6);
            i5 += 4;
        }
        this.zza.zzt(i5);
        while (i2 < zzhlVar.size()) {
            this.zza.zzg(zzhlVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzC(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzhl)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzgr zzgrVar = this.zza;
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzgrVar.zzs(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzgr.zzz((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            this.zza.zzt(i3);
            while (i2 < list.size()) {
                zzgr zzgrVar2 = this.zza;
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzgrVar2.zzt((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z) {
            while (i2 < zzhlVar.size()) {
                zzgr zzgrVar3 = this.zza;
                int zze = zzhlVar.zze(i2);
                zzgrVar3.zzs(i, (zze >> 31) ^ (zze + zze));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhlVar.size(); i6++) {
            int zze2 = zzhlVar.zze(i6);
            i5 += zzgr.zzz((zze2 >> 31) ^ (zze2 + zze2));
        }
        this.zza.zzt(i5);
        while (i2 < zzhlVar.size()) {
            zzgr zzgrVar4 = this.zza;
            int zze3 = zzhlVar.zze(i2);
            zzgrVar4.zzt((zze3 >> 31) ^ (zze3 + zze3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzE(int i, List list, boolean z) {
        if (list instanceof zzib) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            if (!z) {
                throw null;
            }
            this.zza.zzr(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzgr zzgrVar = this.zza;
                long longValue = ((Long) list.get(i2)).longValue();
                zzgrVar.zzu(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += zzgr.zzA((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzt(i3);
        while (i2 < list.size()) {
            zzgr zzgrVar2 = this.zza;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzgrVar2.zzv((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzj(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzhl)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgr.zzA(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzt(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z) {
            while (i2 < zzhlVar.size()) {
                this.zza.zzj(i, zzhlVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhlVar.size(); i6++) {
            i5 += zzgr.zzA(zzhlVar.zze(i6));
        }
        this.zza.zzt(i5);
        while (i2 < zzhlVar.size()) {
            this.zza.zzk(zzhlVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzu(int i, List list, boolean z) {
        if (list instanceof zzib) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            if (!z) {
                throw null;
            }
            this.zza.zzr(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzu(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzgr.zzA(((Long) list.get(i4)).longValue());
        }
        this.zza.zzt(i3);
        while (i2 < list.size()) {
            this.zza.zzv(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
