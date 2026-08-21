package com.google.android.gms.internal.play_billing;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.List;

/* loaded from: classes.dex */
final class zzeq implements zzhu {
    private final zzep zza;

    private zzeq(zzep zzepVar) {
        byte[] bArr = zzfo.zzb;
        this.zza = zzepVar;
        zzepVar.zza = this;
    }

    public static zzeq zza(zzep zzepVar) {
        zzeq zzeqVar = zzepVar.zza;
        return zzeqVar != null ? zzeqVar : new zzeq(zzepVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzB(int i, int i2) {
        this.zza.zzu(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzD(int i, long j) {
        this.zza.zzw(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzF(int i) {
        this.zza.zzt(i, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzG(int i, String str) {
        this.zza.zzr(i, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzI(int i, int i2) {
        this.zza.zzu(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzK(int i, long j) {
        this.zza.zzw(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzb(int i, boolean z) {
        this.zza.zzd(i, z);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzd(int i, zzei zzeiVar) {
        this.zza.zze(i, zzeiVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zze(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zze(i, (zzei) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzf(int i, double d) {
        this.zza.zzi(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzh(int i) {
        this.zza.zzt(i, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzi(int i, int i2) {
        this.zza.zzk(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzk(int i, int i2) {
        this.zza.zzg(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzm(int i, long j) {
        this.zza.zzi(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzo(int i, float f) {
        this.zza.zzg(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzq(int i, Object obj, zzgv zzgvVar) {
        zzep zzepVar = this.zza;
        zzepVar.zzt(i, 3);
        zzgvVar.zzi((zzgl) obj, zzepVar.zza);
        zzepVar.zzt(i, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzr(int i, int i2) {
        this.zza.zzk(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzt(int i, long j) {
        this.zza.zzw(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzv(int i, Object obj, zzgv zzgvVar) {
        this.zza.zzn(i, (zzgl) obj, zzgvVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzx(int i, int i2) {
        this.zza.zzg(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzz(int i, long j) {
        this.zza.zzi(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzH(int i, List list) {
        int i2 = 0;
        if (!(list instanceof zzfx)) {
            while (i2 < list.size()) {
                this.zza.zzr(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzfx zzfxVar = (zzfx) list;
        while (i2 < list.size()) {
            Object zza = zzfxVar.zza();
            if (zza instanceof String) {
                this.zza.zzr(i, (String) zza);
            } else {
                this.zza.zze(i, (zzei) zza);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzJ(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzfj)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzu(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzep.zzC(((Integer) list.get(i4)).intValue());
            }
            zzepVar.zzv(i3);
            while (i2 < list.size()) {
                zzepVar.zzv(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z) {
            while (i2 < zzfjVar.size()) {
                this.zza.zzu(i, zzfjVar.zze(i2));
                i2++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzfjVar.size(); i6++) {
            i5 += zzep.zzC(zzfjVar.zze(i6));
        }
        zzepVar2.zzv(i5);
        while (i2 < zzfjVar.size()) {
            zzepVar2.zzv(zzfjVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzL(int i, List list, boolean z) {
        if (list instanceof zzga) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            if (!z) {
                throw null;
            }
            this.zza.zzt(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzw(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzep zzepVar = this.zza;
        zzepVar.zzt(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzep.zzD(((Long) list.get(i4)).longValue());
        }
        zzepVar.zzv(i3);
        while (i2 < list.size()) {
            zzepVar.zzx(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzl(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzfj)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzepVar.zzv(i3);
            while (i2 < list.size()) {
                zzepVar.zzh(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z) {
            while (i2 < zzfjVar.size()) {
                this.zza.zzg(i, zzfjVar.zze(i2));
                i2++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzfjVar.size(); i6++) {
            zzfjVar.zze(i6);
            i5 += 4;
        }
        zzepVar2.zzv(i5);
        while (i2 < zzfjVar.size()) {
            zzepVar2.zzh(zzfjVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzn(int i, List list, boolean z) {
        if (list instanceof zzga) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            if (!z) {
                throw null;
            }
            this.zza.zzt(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzi(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzep zzepVar = this.zza;
        zzepVar.zzt(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        zzepVar.zzv(i3);
        while (i2 < list.size()) {
            zzepVar.zzj(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzc(int i, List list, boolean z) {
        if (list instanceof zzdy) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            if (!z) {
                throw null;
            }
            this.zza.zzt(i, 2);
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
        zzep zzepVar = this.zza;
        zzepVar.zzt(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        zzepVar.zzv(i3);
        while (i2 < list.size()) {
            zzepVar.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzs(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzfj)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzk(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzep.zzD(((Integer) list.get(i4)).intValue());
            }
            zzepVar.zzv(i3);
            while (i2 < list.size()) {
                zzepVar.zzl(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z) {
            while (i2 < zzfjVar.size()) {
                this.zza.zzk(i, zzfjVar.zze(i2));
                i2++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzfjVar.size(); i6++) {
            i5 += zzep.zzD(zzfjVar.zze(i6));
        }
        zzepVar2.zzv(i5);
        while (i2 < zzfjVar.size()) {
            zzepVar2.zzl(zzfjVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzA(int i, List list, boolean z) {
        if (list instanceof zzga) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            if (!z) {
                throw null;
            }
            this.zza.zzt(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzi(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzep zzepVar = this.zza;
        zzepVar.zzt(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        zzepVar.zzv(i3);
        while (i2 < list.size()) {
            zzepVar.zzj(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzg(int i, List list, boolean z) {
        if (list instanceof zzer) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            if (!z) {
                throw null;
            }
            this.zza.zzt(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzi(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzep zzepVar = this.zza;
        zzepVar.zzt(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        zzepVar.zzv(i3);
        while (i2 < list.size()) {
            zzepVar.zzj(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzp(int i, List list, boolean z) {
        if (list instanceof zzfb) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            if (!z) {
                throw null;
            }
            this.zza.zzt(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzg(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzep zzepVar = this.zza;
        zzepVar.zzt(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        zzepVar.zzv(i3);
        while (i2 < list.size()) {
            zzepVar.zzh(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzy(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzfj)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzepVar.zzv(i3);
            while (i2 < list.size()) {
                zzepVar.zzh(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z) {
            while (i2 < zzfjVar.size()) {
                this.zza.zzg(i, zzfjVar.zze(i2));
                i2++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzfjVar.size(); i6++) {
            zzfjVar.zze(i6);
            i5 += 4;
        }
        zzepVar2.zzv(i5);
        while (i2 < zzfjVar.size()) {
            zzepVar2.zzh(zzfjVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzC(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzfj)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzep zzepVar = this.zza;
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzepVar.zzu(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            zzep zzepVar2 = this.zza;
            zzepVar2.zzt(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzep.zzC((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzepVar2.zzv(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzepVar2.zzv((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z) {
            while (i2 < zzfjVar.size()) {
                zzep zzepVar3 = this.zza;
                int zze = zzfjVar.zze(i2);
                zzepVar3.zzu(i, (zze >> 31) ^ (zze + zze));
                i2++;
            }
            return;
        }
        zzep zzepVar4 = this.zza;
        zzepVar4.zzt(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzfjVar.size(); i6++) {
            int zze2 = zzfjVar.zze(i6);
            i5 += zzep.zzC((zze2 >> 31) ^ (zze2 + zze2));
        }
        zzepVar4.zzv(i5);
        while (i2 < zzfjVar.size()) {
            int zze3 = zzfjVar.zze(i2);
            zzepVar4.zzv((zze3 >> 31) ^ (zze3 + zze3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzE(int i, List list, boolean z) {
        if (list instanceof zzga) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            if (!z) {
                throw null;
            }
            this.zza.zzt(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzep zzepVar = this.zza;
                long longValue = ((Long) list.get(i2)).longValue();
                zzepVar.zzw(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += zzep.zzD((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        zzepVar2.zzv(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzepVar2.zzx((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzj(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzfj)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzk(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzep.zzD(((Integer) list.get(i4)).intValue());
            }
            zzepVar.zzv(i3);
            while (i2 < list.size()) {
                zzepVar.zzl(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z) {
            while (i2 < zzfjVar.size()) {
                this.zza.zzk(i, zzfjVar.zze(i2));
                i2++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzfjVar.size(); i6++) {
            i5 += zzep.zzD(zzfjVar.zze(i6));
        }
        zzepVar2.zzv(i5);
        while (i2 < zzfjVar.size()) {
            zzepVar2.zzl(zzfjVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzu(int i, List list, boolean z) {
        if (list instanceof zzga) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            if (!z) {
                throw null;
            }
            this.zza.zzt(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzw(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzep zzepVar = this.zza;
        zzepVar.zzt(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzep.zzD(((Long) list.get(i4)).longValue());
        }
        zzepVar.zzv(i3);
        while (i2 < list.size()) {
            zzepVar.zzx(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
