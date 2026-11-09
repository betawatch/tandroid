package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
    public final void zzA(int i7, List list, boolean z9) {
        int i10 = 0;
        if (!(list instanceof zzth)) {
            if (!z9) {
                while (i10 < list.size()) {
                    this.zza.zzh(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i7, 2);
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
        if (!z9) {
            while (i10 < zzthVar.size()) {
                this.zza.zzh(i7, zzthVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i7, 2);
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
    public final void zzB(int i7, int i10) {
        this.zza.zzs(i7, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzC(int i7, List list, boolean z9) {
        int i10 = 0;
        if (!(list instanceof zzso)) {
            if (!z9) {
                while (i10 < list.size()) {
                    zzqv zzqvVar = this.zza;
                    int intValue = ((Integer) list.get(i10)).intValue();
                    zzqvVar.zzs(i7, (intValue >> 31) ^ (intValue + intValue));
                    i10++;
                }
                return;
            }
            zzqv zzqvVar2 = this.zza;
            zzqvVar2.zzr(i7, 2);
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
        if (!z9) {
            while (i10 < zzsoVar.size()) {
                zzqv zzqvVar3 = this.zza;
                int zze = zzsoVar.zze(i10);
                zzqvVar3.zzs(i7, (zze >> 31) ^ (zze + zze));
                i10++;
            }
            return;
        }
        zzqv zzqvVar4 = this.zza;
        zzqvVar4.zzr(i7, 2);
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
    public final void zzD(int i7, long j3) {
        this.zza.zzu(i7, (j3 >> 63) ^ (j3 + j3));
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzE(int i7, List list, boolean z9) {
        int i10 = 0;
        if (!(list instanceof zzth)) {
            if (!z9) {
                while (i10 < list.size()) {
                    zzqv zzqvVar = this.zza;
                    long longValue = ((Long) list.get(i10)).longValue();
                    zzqvVar.zzu(i7, (longValue >> 63) ^ (longValue + longValue));
                    i10++;
                }
                return;
            }
            zzqv zzqvVar2 = this.zza;
            zzqvVar2.zzr(i7, 2);
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
        if (!z9) {
            while (i10 < zzthVar.size()) {
                zzqv zzqvVar3 = this.zza;
                long zze = zzthVar.zze(i10);
                zzqvVar3.zzu(i7, (zze >> 63) ^ (zze + zze));
                i10++;
            }
            return;
        }
        zzqv zzqvVar4 = this.zza;
        zzqvVar4.zzr(i7, 2);
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
    public final void zzF(int i7) {
        this.zza.zzr(i7, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzG(int i7, String str) {
        this.zza.zzp(i7, str);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzH(int i7, List list) {
        int i10 = 0;
        if (!(list instanceof zzte)) {
            while (i10 < list.size()) {
                this.zza.zzp(i7, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zzte zzteVar = (zzte) list;
        while (i10 < list.size()) {
            Object zzc = zzteVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzp(i7, (String) zzc);
            } else {
                this.zza.zze(i7, (zzqm) zzc);
            }
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzI(int i7, int i10) {
        this.zza.zzs(i7, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzJ(int i7, List list, boolean z9) {
        int i10 = 0;
        if (!(list instanceof zzso)) {
            if (!z9) {
                while (i10 < list.size()) {
                    this.zza.zzs(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i7, 2);
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
        if (!z9) {
            while (i10 < zzsoVar.size()) {
                this.zza.zzs(i7, zzsoVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i7, 2);
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
    public final void zzK(int i7, long j3) {
        this.zza.zzu(i7, j3);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzL(int i7, List list, boolean z9) {
        int i10 = 0;
        if (!(list instanceof zzth)) {
            if (!z9) {
                while (i10 < list.size()) {
                    this.zza.zzu(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i7, 2);
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
        if (!z9) {
            while (i10 < zzthVar.size()) {
                this.zza.zzu(i7, zzthVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i7, 2);
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
    public final void zzb(int i7, boolean z9) {
        this.zza.zzd(i7, z9);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzc(int i7, List list, boolean z9) {
        int i10 = 0;
        if (!(list instanceof zzqd)) {
            if (!z9) {
                while (i10 < list.size()) {
                    this.zza.zzd(i7, ((Boolean) list.get(i10)).booleanValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i7, 2);
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
        if (!z9) {
            while (i10 < zzqdVar.size()) {
                this.zza.zzd(i7, zzqdVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i7, 2);
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
    public final void zzd(int i7, zzqm zzqmVar) {
        this.zza.zze(i7, zzqmVar);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zze(int i7, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zze(i7, (zzqm) list.get(i10));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzf(int i7, double d) {
        this.zza.zzh(i7, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzg(int i7, List list, boolean z9) {
        int i10 = 0;
        if (!(list instanceof zzrs)) {
            if (!z9) {
                while (i10 < list.size()) {
                    this.zza.zzh(i7, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i7, 2);
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
        if (!z9) {
            while (i10 < zzrsVar.size()) {
                this.zza.zzh(i7, Double.doubleToRawLongBits(zzrsVar.zze(i10)));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i7, 2);
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
    public final void zzh(int i7) {
        this.zza.zzr(i7, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzi(int i7, int i10) {
        this.zza.zzj(i7, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzj(int i7, List list, boolean z9) {
        int i10 = 0;
        if (!(list instanceof zzso)) {
            if (!z9) {
                while (i10 < list.size()) {
                    this.zza.zzj(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i7, 2);
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
        if (!z9) {
            while (i10 < zzsoVar.size()) {
                this.zza.zzj(i7, zzsoVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i7, 2);
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
    public final void zzk(int i7, int i10) {
        this.zza.zzf(i7, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzl(int i7, List list, boolean z9) {
        int i10 = 0;
        if (!(list instanceof zzso)) {
            if (!z9) {
                while (i10 < list.size()) {
                    this.zza.zzf(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i7, 2);
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
        if (!z9) {
            while (i10 < zzsoVar.size()) {
                this.zza.zzf(i7, zzsoVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i7, 2);
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
    public final void zzm(int i7, long j3) {
        this.zza.zzh(i7, j3);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzn(int i7, List list, boolean z9) {
        int i10 = 0;
        if (!(list instanceof zzth)) {
            if (!z9) {
                while (i10 < list.size()) {
                    this.zza.zzh(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i7, 2);
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
        if (!z9) {
            while (i10 < zzthVar.size()) {
                this.zza.zzh(i7, zzthVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i7, 2);
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
    public final void zzo(int i7, float f10) {
        this.zza.zzf(i7, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzp(int i7, List list, boolean z9) {
        int i10 = 0;
        if (!(list instanceof zzsf)) {
            if (!z9) {
                while (i10 < list.size()) {
                    this.zza.zzf(i7, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i7, 2);
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
        if (!z9) {
            while (i10 < zzsfVar.size()) {
                this.zza.zzf(i7, Float.floatToRawIntBits(zzsfVar.zze(i10)));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i7, 2);
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
    public final void zzq(int i7, Object obj, zzug zzugVar) {
        zzqv zzqvVar = this.zza;
        zzqvVar.zzr(i7, 3);
        zzugVar.zzj((zzts) obj, zzqvVar.zza);
        zzqvVar.zzr(i7, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzr(int i7, int i10) {
        this.zza.zzj(i7, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzs(int i7, List list, boolean z9) {
        int i10 = 0;
        if (!(list instanceof zzso)) {
            if (!z9) {
                while (i10 < list.size()) {
                    this.zza.zzj(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i7, 2);
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
        if (!z9) {
            while (i10 < zzsoVar.size()) {
                this.zza.zzj(i7, zzsoVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i7, 2);
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
    public final void zzt(int i7, long j3) {
        this.zza.zzu(i7, j3);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzu(int i7, List list, boolean z9) {
        int i10 = 0;
        if (!(list instanceof zzth)) {
            if (!z9) {
                while (i10 < list.size()) {
                    this.zza.zzu(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i7, 2);
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
        if (!z9) {
            while (i10 < zzthVar.size()) {
                this.zza.zzu(i7, zzthVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i7, 2);
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
    public final void zzv(int i7, Object obj, zzug zzugVar) {
        this.zza.zzm(i7, (zzts) obj, zzugVar);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzw(int i7, Object obj) {
        if (obj instanceof zzqm) {
            this.zza.zzo(i7, (zzqm) obj);
        } else {
            this.zza.zzn(i7, (zzts) obj);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzx(int i7, int i10) {
        this.zza.zzf(i7, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzy(int i7, List list, boolean z9) {
        int i10 = 0;
        if (!(list instanceof zzso)) {
            if (!z9) {
                while (i10 < list.size()) {
                    this.zza.zzf(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i7, 2);
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
        if (!z9) {
            while (i10 < zzsoVar.size()) {
                this.zza.zzf(i7, zzsoVar.zze(i10));
                i10++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i7, 2);
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
    public final void zzz(int i7, long j3) {
        this.zza.zzh(i7, j3);
    }
}
