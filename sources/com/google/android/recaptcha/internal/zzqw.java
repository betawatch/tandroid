package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzqw implements zzvi {
    private final zzqv zza;

    private zzqw(zzqv zzqvVar) {
        byte[] bArr = zzsv.zzb;
        this.zza = zzqvVar;
        zzqvVar.zza = this;
    }

    public static zzqw zza(zzqv zzqvVar) {
        zzqw zzqwVar = zzqvVar.zza;
        return zzqwVar != null ? zzqwVar : new zzqw(zzqvVar);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzA(int i9, List list, boolean z10) {
        int i10 = 0;
        if (!(list instanceof zzth)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzh(i9, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            zzqvVar.zzt(i11);
            while (i10 < list.size()) {
                zzqvVar.zzi(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzth zzthVar = (zzth) list;
        if (!z10) {
            while (i10 < zzthVar.size()) {
                this.zza.zzh(i9, zzthVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzthVar.size(); i14++) {
            zzthVar.zze(i14);
            i13 += 8;
        }
        zzqvVar2.zzt(i13);
        while (i10 < zzthVar.size()) {
            zzqvVar2.zzi(zzthVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzB(int i9, int i10) {
        this.zza.zzs(i9, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzC(int i9, List list, boolean z10) {
        int i10 = 0;
        if (!(list instanceof zzso)) {
            if (!z10) {
                while (i10 < list.size()) {
                    zzqv zzqvVar = this.zza;
                    int intValue = ((Integer) list.get(i10)).intValue();
                    zzqvVar.zzs(i9, (intValue >> 31) ^ (intValue + intValue));
                    i10++;
                }
                return;
            }
            zzqv zzqvVar2 = this.zza;
            zzqvVar2.zzr(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue2 = ((Integer) list.get(i12)).intValue();
                i11 += zzqv.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzqvVar2.zzt(i11);
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                zzqvVar2.zzt((intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z10) {
            while (i10 < zzsoVar.size()) {
                zzqv zzqvVar3 = this.zza;
                int zze = zzsoVar.zze(i10);
                zzqvVar3.zzs(i9, (zze >> 31) ^ (zze + zze));
                i10++;
            }
            return;
        }
        zzqv zzqvVar4 = this.zza;
        zzqvVar4.zzr(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzsoVar.size(); i14++) {
            int zze2 = zzsoVar.zze(i14);
            i13 += zzqv.zzA((zze2 >> 31) ^ (zze2 + zze2));
        }
        zzqvVar4.zzt(i13);
        while (i10 < zzsoVar.size()) {
            int zze3 = zzsoVar.zze(i10);
            zzqvVar4.zzt((zze3 >> 31) ^ (zze3 + zze3));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzD(int i9, long j10) {
        this.zza.zzu(i9, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzE(int i9, List list, boolean z10) {
        int i10 = 0;
        if (!(list instanceof zzth)) {
            if (!z10) {
                while (i10 < list.size()) {
                    zzqv zzqvVar = this.zza;
                    long longValue = ((Long) list.get(i10)).longValue();
                    zzqvVar.zzu(i9, (longValue >> 63) ^ (longValue + longValue));
                    i10++;
                }
                return;
            }
            zzqv zzqvVar2 = this.zza;
            zzqvVar2.zzr(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long longValue2 = ((Long) list.get(i12)).longValue();
                i11 += zzqv.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzqvVar2.zzt(i11);
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                zzqvVar2.zzv((longValue3 >> 63) ^ (longValue3 + longValue3));
                i10++;
            }
            return;
        }
        zzth zzthVar = (zzth) list;
        if (!z10) {
            while (i10 < zzthVar.size()) {
                zzqv zzqvVar3 = this.zza;
                long zze = zzthVar.zze(i10);
                zzqvVar3.zzu(i9, (zze >> 63) ^ (zze + zze));
                i10++;
            }
            return;
        }
        zzqv zzqvVar4 = this.zza;
        zzqvVar4.zzr(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzthVar.size(); i14++) {
            long zze2 = zzthVar.zze(i14);
            i13 += zzqv.zzB((zze2 >> 63) ^ (zze2 + zze2));
        }
        zzqvVar4.zzt(i13);
        while (i10 < zzthVar.size()) {
            long zze3 = zzthVar.zze(i10);
            zzqvVar4.zzv((zze3 >> 63) ^ (zze3 + zze3));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    @Deprecated
    public final void zzF(int i9) {
        this.zza.zzr(i9, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzG(int i9, String str) {
        this.zza.zzp(i9, str);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzH(int i9, List list) {
        int i10 = 0;
        if (!(list instanceof zzte)) {
            while (i10 < list.size()) {
                this.zza.zzp(i9, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zzte zzteVar = (zzte) list;
        while (i10 < list.size()) {
            Object zzc = zzteVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzp(i9, (String) zzc);
            } else {
                this.zza.zze(i9, (zzqm) zzc);
            }
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzI(int i9, int i10) {
        this.zza.zzs(i9, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzJ(int i9, List list, boolean z10) {
        int i10 = 0;
        if (!(list instanceof zzso)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzs(i9, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzqv.zzA(((Integer) list.get(i12)).intValue());
            }
            zzqvVar.zzt(i11);
            while (i10 < list.size()) {
                zzqvVar.zzt(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z10) {
            while (i10 < zzsoVar.size()) {
                this.zza.zzs(i9, zzsoVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzsoVar.size(); i14++) {
            i13 += zzqv.zzA(zzsoVar.zze(i14));
        }
        zzqvVar2.zzt(i13);
        while (i10 < zzsoVar.size()) {
            zzqvVar2.zzt(zzsoVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzK(int i9, long j10) {
        this.zza.zzu(i9, j10);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzL(int i9, List list, boolean z10) {
        int i10 = 0;
        if (!(list instanceof zzth)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzu(i9, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzqv.zzB(((Long) list.get(i12)).longValue());
            }
            zzqvVar.zzt(i11);
            while (i10 < list.size()) {
                zzqvVar.zzv(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzth zzthVar = (zzth) list;
        if (!z10) {
            while (i10 < zzthVar.size()) {
                this.zza.zzu(i9, zzthVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzthVar.size(); i14++) {
            i13 += zzqv.zzB(zzthVar.zze(i14));
        }
        zzqvVar2.zzt(i13);
        while (i10 < zzthVar.size()) {
            zzqvVar2.zzv(zzthVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzb(int i9, boolean z10) {
        this.zza.zzd(i9, z10);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzc(int i9, List list, boolean z10) {
        int i10 = 0;
        if (!(list instanceof zzqd)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzd(i9, ((Boolean) list.get(i10)).booleanValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Boolean) list.get(i12)).getClass();
                i11++;
            }
            zzqvVar.zzt(i11);
            while (i10 < list.size()) {
                zzqvVar.zzb(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        zzqd zzqdVar = (zzqd) list;
        if (!z10) {
            while (i10 < zzqdVar.size()) {
                this.zza.zzd(i9, zzqdVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzqdVar.size(); i14++) {
            zzqdVar.zzf(i14);
            i13++;
        }
        zzqvVar2.zzt(i13);
        while (i10 < zzqdVar.size()) {
            zzqvVar2.zzb(zzqdVar.zzf(i10) ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzd(int i9, zzqm zzqmVar) {
        this.zza.zze(i9, zzqmVar);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zze(int i9, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zze(i9, (zzqm) list.get(i10));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzf(int i9, double d) {
        this.zza.zzh(i9, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzg(int i9, List list, boolean z10) {
        int i10 = 0;
        if (!(list instanceof zzrs)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzh(i9, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Double) list.get(i12)).getClass();
                i11 += 8;
            }
            zzqvVar.zzt(i11);
            while (i10 < list.size()) {
                zzqvVar.zzi(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        zzrs zzrsVar = (zzrs) list;
        if (!z10) {
            while (i10 < zzrsVar.size()) {
                this.zza.zzh(i9, Double.doubleToRawLongBits(zzrsVar.zze(i10)));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzrsVar.size(); i14++) {
            zzrsVar.zze(i14);
            i13 += 8;
        }
        zzqvVar2.zzt(i13);
        while (i10 < zzrsVar.size()) {
            zzqvVar2.zzi(Double.doubleToRawLongBits(zzrsVar.zze(i10)));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    @Deprecated
    public final void zzh(int i9) {
        this.zza.zzr(i9, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzi(int i9, int i10) {
        this.zza.zzj(i9, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzj(int i9, List list, boolean z10) {
        int i10 = 0;
        if (!(list instanceof zzso)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzj(i9, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzqv.zzB(((Integer) list.get(i12)).intValue());
            }
            zzqvVar.zzt(i11);
            while (i10 < list.size()) {
                zzqvVar.zzk(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z10) {
            while (i10 < zzsoVar.size()) {
                this.zza.zzj(i9, zzsoVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzsoVar.size(); i14++) {
            i13 += zzqv.zzB(zzsoVar.zze(i14));
        }
        zzqvVar2.zzt(i13);
        while (i10 < zzsoVar.size()) {
            zzqvVar2.zzk(zzsoVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzk(int i9, int i10) {
        this.zza.zzf(i9, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzl(int i9, List list, boolean z10) {
        int i10 = 0;
        if (!(list instanceof zzso)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzf(i9, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            zzqvVar.zzt(i11);
            while (i10 < list.size()) {
                zzqvVar.zzg(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z10) {
            while (i10 < zzsoVar.size()) {
                this.zza.zzf(i9, zzsoVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzsoVar.size(); i14++) {
            zzsoVar.zze(i14);
            i13 += 4;
        }
        zzqvVar2.zzt(i13);
        while (i10 < zzsoVar.size()) {
            zzqvVar2.zzg(zzsoVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzm(int i9, long j10) {
        this.zza.zzh(i9, j10);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzn(int i9, List list, boolean z10) {
        int i10 = 0;
        if (!(list instanceof zzth)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzh(i9, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            zzqvVar.zzt(i11);
            while (i10 < list.size()) {
                zzqvVar.zzi(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzth zzthVar = (zzth) list;
        if (!z10) {
            while (i10 < zzthVar.size()) {
                this.zza.zzh(i9, zzthVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzthVar.size(); i14++) {
            zzthVar.zze(i14);
            i13 += 8;
        }
        zzqvVar2.zzt(i13);
        while (i10 < zzthVar.size()) {
            zzqvVar2.zzi(zzthVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzo(int i9, float f10) {
        this.zza.zzf(i9, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzp(int i9, List list, boolean z10) {
        int i10 = 0;
        if (!(list instanceof zzsf)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzf(i9, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Float) list.get(i12)).getClass();
                i11 += 4;
            }
            zzqvVar.zzt(i11);
            while (i10 < list.size()) {
                zzqvVar.zzg(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        zzsf zzsfVar = (zzsf) list;
        if (!z10) {
            while (i10 < zzsfVar.size()) {
                this.zza.zzf(i9, Float.floatToRawIntBits(zzsfVar.zze(i10)));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzsfVar.size(); i14++) {
            zzsfVar.zze(i14);
            i13 += 4;
        }
        zzqvVar2.zzt(i13);
        while (i10 < zzsfVar.size()) {
            zzqvVar2.zzg(Float.floatToRawIntBits(zzsfVar.zze(i10)));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzq(int i9, Object obj, zzug zzugVar) {
        zzqv zzqvVar = this.zza;
        zzqvVar.zzr(i9, 3);
        zzugVar.zzj((zzts) obj, zzqvVar.zza);
        zzqvVar.zzr(i9, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzr(int i9, int i10) {
        this.zza.zzj(i9, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzs(int i9, List list, boolean z10) {
        int i10 = 0;
        if (!(list instanceof zzso)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzj(i9, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzqv.zzB(((Integer) list.get(i12)).intValue());
            }
            zzqvVar.zzt(i11);
            while (i10 < list.size()) {
                zzqvVar.zzk(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z10) {
            while (i10 < zzsoVar.size()) {
                this.zza.zzj(i9, zzsoVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzsoVar.size(); i14++) {
            i13 += zzqv.zzB(zzsoVar.zze(i14));
        }
        zzqvVar2.zzt(i13);
        while (i10 < zzsoVar.size()) {
            zzqvVar2.zzk(zzsoVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzt(int i9, long j10) {
        this.zza.zzu(i9, j10);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzu(int i9, List list, boolean z10) {
        int i10 = 0;
        if (!(list instanceof zzth)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzu(i9, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzqv.zzB(((Long) list.get(i12)).longValue());
            }
            zzqvVar.zzt(i11);
            while (i10 < list.size()) {
                zzqvVar.zzv(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzth zzthVar = (zzth) list;
        if (!z10) {
            while (i10 < zzthVar.size()) {
                this.zza.zzu(i9, zzthVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzthVar.size(); i14++) {
            i13 += zzqv.zzB(zzthVar.zze(i14));
        }
        zzqvVar2.zzt(i13);
        while (i10 < zzthVar.size()) {
            zzqvVar2.zzv(zzthVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzv(int i9, Object obj, zzug zzugVar) {
        this.zza.zzm(i9, (zzts) obj, zzugVar);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzw(int i9, Object obj) {
        if (obj instanceof zzqm) {
            this.zza.zzo(i9, (zzqm) obj);
        } else {
            this.zza.zzn(i9, (zzts) obj);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzx(int i9, int i10) {
        this.zza.zzf(i9, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzy(int i9, List list, boolean z10) {
        int i10 = 0;
        if (!(list instanceof zzso)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzf(i9, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            zzqvVar.zzt(i11);
            while (i10 < list.size()) {
                zzqvVar.zzg(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z10) {
            while (i10 < zzsoVar.size()) {
                this.zza.zzf(i9, zzsoVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzsoVar.size(); i14++) {
            zzsoVar.zze(i14);
            i13 += 4;
        }
        zzqvVar2.zzt(i13);
        while (i10 < zzsoVar.size()) {
            zzqvVar2.zzg(zzsoVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzz(int i9, long j10) {
        this.zza.zzh(i9, j10);
    }
}
