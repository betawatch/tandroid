package com.google.android.recaptcha.internal;

import java.util.List;

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
    public final void zzB(int i, int i2) {
        this.zza.zzs(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzD(int i, long j) {
        this.zza.zzu(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    @Deprecated
    public final void zzF(int i) {
        this.zza.zzr(i, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzG(int i, String str) {
        this.zza.zzp(i, str);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzI(int i, int i2) {
        this.zza.zzs(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzK(int i, long j) {
        this.zza.zzu(i, j);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzb(int i, boolean z) {
        this.zza.zzd(i, z);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzd(int i, zzqm zzqmVar) {
        this.zza.zze(i, zzqmVar);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zze(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zze(i, (zzqm) list.get(i2));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzf(int i, double d) {
        this.zza.zzh(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    @Deprecated
    public final void zzh(int i) {
        this.zza.zzr(i, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzi(int i, int i2) {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzk(int i, int i2) {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzm(int i, long j) {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzo(int i, float f) {
        this.zza.zzf(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzq(int i, Object obj, zzug zzugVar) {
        zzqv zzqvVar = this.zza;
        zzqvVar.zzr(i, 3);
        zzugVar.zzj((zzts) obj, zzqvVar.zza);
        zzqvVar.zzr(i, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzr(int i, int i2) {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzt(int i, long j) {
        this.zza.zzu(i, j);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzv(int i, Object obj, zzug zzugVar) {
        this.zza.zzm(i, (zzts) obj, zzugVar);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzw(int i, Object obj) {
        if (obj instanceof zzqm) {
            this.zza.zzo(i, (zzqm) obj);
        } else {
            this.zza.zzn(i, (zzts) obj);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzx(int i, int i2) {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzz(int i, long j) {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzH(int i, List list) {
        int i2 = 0;
        if (!(list instanceof zzte)) {
            while (i2 < list.size()) {
                this.zza.zzp(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzte zzteVar = (zzte) list;
        while (i2 < list.size()) {
            Object zzc = zzteVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzp(i, (String) zzc);
            } else {
                this.zza.zze(i, (zzqm) zzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzJ(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzso)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzs(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqv.zzA(((Integer) list.get(i4)).intValue());
            }
            zzqvVar.zzt(i3);
            while (i2 < list.size()) {
                zzqvVar.zzt(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z) {
            while (i2 < zzsoVar.size()) {
                this.zza.zzs(i, zzsoVar.zze(i2));
                i2++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzsoVar.size(); i6++) {
            i5 += zzqv.zzA(zzsoVar.zze(i6));
        }
        zzqvVar2.zzt(i5);
        while (i2 < zzsoVar.size()) {
            zzqvVar2.zzt(zzsoVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzL(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzth)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzu(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqv.zzB(((Long) list.get(i4)).longValue());
            }
            zzqvVar.zzt(i3);
            while (i2 < list.size()) {
                zzqvVar.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzth zzthVar = (zzth) list;
        if (!z) {
            while (i2 < zzthVar.size()) {
                this.zza.zzu(i, zzthVar.zze(i2));
                i2++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzthVar.size(); i6++) {
            i5 += zzqv.zzB(zzthVar.zze(i6));
        }
        zzqvVar2.zzt(i5);
        while (i2 < zzthVar.size()) {
            zzqvVar2.zzv(zzthVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzl(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzso)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzqvVar.zzt(i3);
            while (i2 < list.size()) {
                zzqvVar.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z) {
            while (i2 < zzsoVar.size()) {
                this.zza.zzf(i, zzsoVar.zze(i2));
                i2++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzsoVar.size(); i6++) {
            zzsoVar.zze(i6);
            i5 += 4;
        }
        zzqvVar2.zzt(i5);
        while (i2 < zzsoVar.size()) {
            zzqvVar2.zzg(zzsoVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzn(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzth)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzqvVar.zzt(i3);
            while (i2 < list.size()) {
                zzqvVar.zzi(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzth zzthVar = (zzth) list;
        if (!z) {
            while (i2 < zzthVar.size()) {
                this.zza.zzh(i, zzthVar.zze(i2));
                i2++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzthVar.size(); i6++) {
            zzthVar.zze(i6);
            i5 += 8;
        }
        zzqvVar2.zzt(i5);
        while (i2 < zzthVar.size()) {
            zzqvVar2.zzi(zzthVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzc(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzqd)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                i3++;
            }
            zzqvVar.zzt(i3);
            while (i2 < list.size()) {
                zzqvVar.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzqd zzqdVar = (zzqd) list;
        if (!z) {
            while (i2 < zzqdVar.size()) {
                this.zza.zzd(i, zzqdVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzqdVar.size(); i6++) {
            zzqdVar.zzf(i6);
            i5++;
        }
        zzqvVar2.zzt(i5);
        while (i2 < zzqdVar.size()) {
            zzqvVar2.zzb(zzqdVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzs(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzso)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqv.zzB(((Integer) list.get(i4)).intValue());
            }
            zzqvVar.zzt(i3);
            while (i2 < list.size()) {
                zzqvVar.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z) {
            while (i2 < zzsoVar.size()) {
                this.zza.zzj(i, zzsoVar.zze(i2));
                i2++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzsoVar.size(); i6++) {
            i5 += zzqv.zzB(zzsoVar.zze(i6));
        }
        zzqvVar2.zzt(i5);
        while (i2 < zzsoVar.size()) {
            zzqvVar2.zzk(zzsoVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzA(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzth)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzqvVar.zzt(i3);
            while (i2 < list.size()) {
                zzqvVar.zzi(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzth zzthVar = (zzth) list;
        if (!z) {
            while (i2 < zzthVar.size()) {
                this.zza.zzh(i, zzthVar.zze(i2));
                i2++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzthVar.size(); i6++) {
            zzthVar.zze(i6);
            i5 += 8;
        }
        zzqvVar2.zzt(i5);
        while (i2 < zzthVar.size()) {
            zzqvVar2.zzi(zzthVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzg(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzrs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            zzqvVar.zzt(i3);
            while (i2 < list.size()) {
                zzqvVar.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzrs zzrsVar = (zzrs) list;
        if (!z) {
            while (i2 < zzrsVar.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(zzrsVar.zze(i2)));
                i2++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzrsVar.size(); i6++) {
            zzrsVar.zze(i6);
            i5 += 8;
        }
        zzqvVar2.zzt(i5);
        while (i2 < zzrsVar.size()) {
            zzqvVar2.zzi(Double.doubleToRawLongBits(zzrsVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzp(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzsf)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            zzqvVar.zzt(i3);
            while (i2 < list.size()) {
                zzqvVar.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzsf zzsfVar = (zzsf) list;
        if (!z) {
            while (i2 < zzsfVar.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(zzsfVar.zze(i2)));
                i2++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzsfVar.size(); i6++) {
            zzsfVar.zze(i6);
            i5 += 4;
        }
        zzqvVar2.zzt(i5);
        while (i2 < zzsfVar.size()) {
            zzqvVar2.zzg(Float.floatToRawIntBits(zzsfVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzy(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzso)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzqvVar.zzt(i3);
            while (i2 < list.size()) {
                zzqvVar.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z) {
            while (i2 < zzsoVar.size()) {
                this.zza.zzf(i, zzsoVar.zze(i2));
                i2++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzsoVar.size(); i6++) {
            zzsoVar.zze(i6);
            i5 += 4;
        }
        zzqvVar2.zzt(i5);
        while (i2 < zzsoVar.size()) {
            zzqvVar2.zzg(zzsoVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzC(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzso)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzqv zzqvVar = this.zza;
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzqvVar.zzs(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            zzqv zzqvVar2 = this.zza;
            zzqvVar2.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzqv.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzqvVar2.zzt(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzqvVar2.zzt((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z) {
            while (i2 < zzsoVar.size()) {
                zzqv zzqvVar3 = this.zza;
                int zze = zzsoVar.zze(i2);
                zzqvVar3.zzs(i, (zze >> 31) ^ (zze + zze));
                i2++;
            }
            return;
        }
        zzqv zzqvVar4 = this.zza;
        zzqvVar4.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzsoVar.size(); i6++) {
            int zze2 = zzsoVar.zze(i6);
            i5 += zzqv.zzA((zze2 >> 31) ^ (zze2 + zze2));
        }
        zzqvVar4.zzt(i5);
        while (i2 < zzsoVar.size()) {
            int zze3 = zzsoVar.zze(i2);
            zzqvVar4.zzt((zze3 >> 31) ^ (zze3 + zze3));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzE(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzth)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzqv zzqvVar = this.zza;
                    long longValue = ((Long) list.get(i2)).longValue();
                    zzqvVar.zzu(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            zzqv zzqvVar2 = this.zza;
            zzqvVar2.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += zzqv.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzqvVar2.zzt(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzqvVar2.zzv((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        zzth zzthVar = (zzth) list;
        if (!z) {
            while (i2 < zzthVar.size()) {
                zzqv zzqvVar3 = this.zza;
                long zze = zzthVar.zze(i2);
                zzqvVar3.zzu(i, (zze >> 63) ^ (zze + zze));
                i2++;
            }
            return;
        }
        zzqv zzqvVar4 = this.zza;
        zzqvVar4.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzthVar.size(); i6++) {
            long zze2 = zzthVar.zze(i6);
            i5 += zzqv.zzB((zze2 >> 63) ^ (zze2 + zze2));
        }
        zzqvVar4.zzt(i5);
        while (i2 < zzthVar.size()) {
            long zze3 = zzthVar.zze(i2);
            zzqvVar4.zzv((zze3 >> 63) ^ (zze3 + zze3));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzj(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzso)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqv.zzB(((Integer) list.get(i4)).intValue());
            }
            zzqvVar.zzt(i3);
            while (i2 < list.size()) {
                zzqvVar.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z) {
            while (i2 < zzsoVar.size()) {
                this.zza.zzj(i, zzsoVar.zze(i2));
                i2++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzsoVar.size(); i6++) {
            i5 += zzqv.zzB(zzsoVar.zze(i6));
        }
        zzqvVar2.zzt(i5);
        while (i2 < zzsoVar.size()) {
            zzqvVar2.zzk(zzsoVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzu(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzth)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzu(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqv.zzB(((Long) list.get(i4)).longValue());
            }
            zzqvVar.zzt(i3);
            while (i2 < list.size()) {
                zzqvVar.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzth zzthVar = (zzth) list;
        if (!z) {
            while (i2 < zzthVar.size()) {
                this.zza.zzu(i, zzthVar.zze(i2));
                i2++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzthVar.size(); i6++) {
            i5 += zzqv.zzB(zzthVar.zze(i6));
        }
        zzqvVar2.zzt(i5);
        while (i2 < zzthVar.size()) {
            zzqvVar2.zzv(zzthVar.zze(i2));
            i2++;
        }
    }
}
