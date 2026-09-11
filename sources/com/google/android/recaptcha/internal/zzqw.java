package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
    public final void zzA(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzth)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zzqvVar.zzt(i12);
            while (i11 < list.size()) {
                zzqvVar.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzth zzthVar = (zzth) list;
        if (!z10) {
            while (i11 < zzthVar.size()) {
                this.zza.zzh(i10, zzthVar.zze(i11));
                i11++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzthVar.size(); i15++) {
            zzthVar.zze(i15);
            i14 += 8;
        }
        zzqvVar2.zzt(i14);
        while (i11 < zzthVar.size()) {
            zzqvVar2.zzi(zzthVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzB(int i10, int i11) {
        this.zza.zzs(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzC(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzso)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzqv zzqvVar = this.zza;
                    int intValue = ((Integer) list.get(i11)).intValue();
                    zzqvVar.zzs(i10, (intValue >> 31) ^ (intValue + intValue));
                    i11++;
                }
                return;
            }
            zzqv zzqvVar2 = this.zza;
            zzqvVar2.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue2 = ((Integer) list.get(i13)).intValue();
                i12 += zzqv.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzqvVar2.zzt(i12);
            while (i11 < list.size()) {
                int intValue3 = ((Integer) list.get(i11)).intValue();
                zzqvVar2.zzt((intValue3 >> 31) ^ (intValue3 + intValue3));
                i11++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z10) {
            while (i11 < zzsoVar.size()) {
                zzqv zzqvVar3 = this.zza;
                int zze = zzsoVar.zze(i11);
                zzqvVar3.zzs(i10, (zze >> 31) ^ (zze + zze));
                i11++;
            }
            return;
        }
        zzqv zzqvVar4 = this.zza;
        zzqvVar4.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzsoVar.size(); i15++) {
            int zze2 = zzsoVar.zze(i15);
            i14 += zzqv.zzA((zze2 >> 31) ^ (zze2 + zze2));
        }
        zzqvVar4.zzt(i14);
        while (i11 < zzsoVar.size()) {
            int zze3 = zzsoVar.zze(i11);
            zzqvVar4.zzt((zze3 >> 31) ^ (zze3 + zze3));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzD(int i10, long j3) {
        this.zza.zzu(i10, (j3 >> 63) ^ (j3 + j3));
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzE(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzth)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzqv zzqvVar = this.zza;
                    long longValue = ((Long) list.get(i11)).longValue();
                    zzqvVar.zzu(i10, (longValue >> 63) ^ (longValue + longValue));
                    i11++;
                }
                return;
            }
            zzqv zzqvVar2 = this.zza;
            zzqvVar2.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue2 = ((Long) list.get(i13)).longValue();
                i12 += zzqv.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzqvVar2.zzt(i12);
            while (i11 < list.size()) {
                long longValue3 = ((Long) list.get(i11)).longValue();
                zzqvVar2.zzv((longValue3 >> 63) ^ (longValue3 + longValue3));
                i11++;
            }
            return;
        }
        zzth zzthVar = (zzth) list;
        if (!z10) {
            while (i11 < zzthVar.size()) {
                zzqv zzqvVar3 = this.zza;
                long zze = zzthVar.zze(i11);
                zzqvVar3.zzu(i10, (zze >> 63) ^ (zze + zze));
                i11++;
            }
            return;
        }
        zzqv zzqvVar4 = this.zza;
        zzqvVar4.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzthVar.size(); i15++) {
            long zze2 = zzthVar.zze(i15);
            i14 += zzqv.zzB((zze2 >> 63) ^ (zze2 + zze2));
        }
        zzqvVar4.zzt(i14);
        while (i11 < zzthVar.size()) {
            long zze3 = zzthVar.zze(i11);
            zzqvVar4.zzv((zze3 >> 63) ^ (zze3 + zze3));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    @Deprecated
    public final void zzF(int i10) {
        this.zza.zzr(i10, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzG(int i10, String str) {
        this.zza.zzp(i10, str);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzH(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof zzte)) {
            while (i11 < list.size()) {
                this.zza.zzp(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzte zzteVar = (zzte) list;
        while (i11 < list.size()) {
            Object zzc = zzteVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzp(i10, (String) zzc);
            } else {
                this.zza.zze(i10, (zzqm) zzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzI(int i10, int i11) {
        this.zza.zzs(i10, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzJ(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzso)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzs(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzqv.zzA(((Integer) list.get(i13)).intValue());
            }
            zzqvVar.zzt(i12);
            while (i11 < list.size()) {
                zzqvVar.zzt(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z10) {
            while (i11 < zzsoVar.size()) {
                this.zza.zzs(i10, zzsoVar.zze(i11));
                i11++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzsoVar.size(); i15++) {
            i14 += zzqv.zzA(zzsoVar.zze(i15));
        }
        zzqvVar2.zzt(i14);
        while (i11 < zzsoVar.size()) {
            zzqvVar2.zzt(zzsoVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzK(int i10, long j3) {
        this.zza.zzu(i10, j3);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzL(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzth)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzu(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzqv.zzB(((Long) list.get(i13)).longValue());
            }
            zzqvVar.zzt(i12);
            while (i11 < list.size()) {
                zzqvVar.zzv(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzth zzthVar = (zzth) list;
        if (!z10) {
            while (i11 < zzthVar.size()) {
                this.zza.zzu(i10, zzthVar.zze(i11));
                i11++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzthVar.size(); i15++) {
            i14 += zzqv.zzB(zzthVar.zze(i15));
        }
        zzqvVar2.zzt(i14);
        while (i11 < zzthVar.size()) {
            zzqvVar2.zzv(zzthVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzb(int i10, boolean z10) {
        this.zza.zzd(i10, z10);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzc(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzqd)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            zzqvVar.zzt(i12);
            while (i11 < list.size()) {
                zzqvVar.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zzqd zzqdVar = (zzqd) list;
        if (!z10) {
            while (i11 < zzqdVar.size()) {
                this.zza.zzd(i10, zzqdVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzqdVar.size(); i15++) {
            zzqdVar.zzf(i15);
            i14++;
        }
        zzqvVar2.zzt(i14);
        while (i11 < zzqdVar.size()) {
            zzqvVar2.zzb(zzqdVar.zzf(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzd(int i10, zzqm zzqmVar) {
        this.zza.zze(i10, zzqmVar);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zze(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zze(i10, (zzqm) list.get(i11));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzf(int i10, double d) {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzg(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzrs)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            zzqvVar.zzt(i12);
            while (i11 < list.size()) {
                zzqvVar.zzi(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzrs zzrsVar = (zzrs) list;
        if (!z10) {
            while (i11 < zzrsVar.size()) {
                this.zza.zzh(i10, Double.doubleToRawLongBits(zzrsVar.zze(i11)));
                i11++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzrsVar.size(); i15++) {
            zzrsVar.zze(i15);
            i14 += 8;
        }
        zzqvVar2.zzt(i14);
        while (i11 < zzrsVar.size()) {
            zzqvVar2.zzi(Double.doubleToRawLongBits(zzrsVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    @Deprecated
    public final void zzh(int i10) {
        this.zza.zzr(i10, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzi(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzj(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzso)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzqv.zzB(((Integer) list.get(i13)).intValue());
            }
            zzqvVar.zzt(i12);
            while (i11 < list.size()) {
                zzqvVar.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z10) {
            while (i11 < zzsoVar.size()) {
                this.zza.zzj(i10, zzsoVar.zze(i11));
                i11++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzsoVar.size(); i15++) {
            i14 += zzqv.zzB(zzsoVar.zze(i15));
        }
        zzqvVar2.zzt(i14);
        while (i11 < zzsoVar.size()) {
            zzqvVar2.zzk(zzsoVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzk(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzl(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzso)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zzqvVar.zzt(i12);
            while (i11 < list.size()) {
                zzqvVar.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z10) {
            while (i11 < zzsoVar.size()) {
                this.zza.zzf(i10, zzsoVar.zze(i11));
                i11++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzsoVar.size(); i15++) {
            zzsoVar.zze(i15);
            i14 += 4;
        }
        zzqvVar2.zzt(i14);
        while (i11 < zzsoVar.size()) {
            zzqvVar2.zzg(zzsoVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzm(int i10, long j3) {
        this.zza.zzh(i10, j3);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzn(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzth)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zzqvVar.zzt(i12);
            while (i11 < list.size()) {
                zzqvVar.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzth zzthVar = (zzth) list;
        if (!z10) {
            while (i11 < zzthVar.size()) {
                this.zza.zzh(i10, zzthVar.zze(i11));
                i11++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzthVar.size(); i15++) {
            zzthVar.zze(i15);
            i14 += 8;
        }
        zzqvVar2.zzt(i14);
        while (i11 < zzthVar.size()) {
            zzqvVar2.zzi(zzthVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzo(int i10, float f7) {
        this.zza.zzf(i10, Float.floatToRawIntBits(f7));
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzp(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzsf)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            zzqvVar.zzt(i12);
            while (i11 < list.size()) {
                zzqvVar.zzg(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzsf zzsfVar = (zzsf) list;
        if (!z10) {
            while (i11 < zzsfVar.size()) {
                this.zza.zzf(i10, Float.floatToRawIntBits(zzsfVar.zze(i11)));
                i11++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzsfVar.size(); i15++) {
            zzsfVar.zze(i15);
            i14 += 4;
        }
        zzqvVar2.zzt(i14);
        while (i11 < zzsfVar.size()) {
            zzqvVar2.zzg(Float.floatToRawIntBits(zzsfVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzq(int i10, Object obj, zzug zzugVar) {
        zzqv zzqvVar = this.zza;
        zzqvVar.zzr(i10, 3);
        zzugVar.zzj((zzts) obj, zzqvVar.zza);
        zzqvVar.zzr(i10, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzr(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzs(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzso)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzqv.zzB(((Integer) list.get(i13)).intValue());
            }
            zzqvVar.zzt(i12);
            while (i11 < list.size()) {
                zzqvVar.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z10) {
            while (i11 < zzsoVar.size()) {
                this.zza.zzj(i10, zzsoVar.zze(i11));
                i11++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzsoVar.size(); i15++) {
            i14 += zzqv.zzB(zzsoVar.zze(i15));
        }
        zzqvVar2.zzt(i14);
        while (i11 < zzsoVar.size()) {
            zzqvVar2.zzk(zzsoVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzt(int i10, long j3) {
        this.zza.zzu(i10, j3);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzu(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzth)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzu(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzqv.zzB(((Long) list.get(i13)).longValue());
            }
            zzqvVar.zzt(i12);
            while (i11 < list.size()) {
                zzqvVar.zzv(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzth zzthVar = (zzth) list;
        if (!z10) {
            while (i11 < zzthVar.size()) {
                this.zza.zzu(i10, zzthVar.zze(i11));
                i11++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzthVar.size(); i15++) {
            i14 += zzqv.zzB(zzthVar.zze(i15));
        }
        zzqvVar2.zzt(i14);
        while (i11 < zzthVar.size()) {
            zzqvVar2.zzv(zzthVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzv(int i10, Object obj, zzug zzugVar) {
        this.zza.zzm(i10, (zzts) obj, zzugVar);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzw(int i10, Object obj) {
        if (obj instanceof zzqm) {
            this.zza.zzo(i10, (zzqm) obj);
        } else {
            this.zza.zzn(i10, (zzts) obj);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzx(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzy(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzso)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzqv zzqvVar = this.zza;
            zzqvVar.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zzqvVar.zzt(i12);
            while (i11 < list.size()) {
                zzqvVar.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzso zzsoVar = (zzso) list;
        if (!z10) {
            while (i11 < zzsoVar.size()) {
                this.zza.zzf(i10, zzsoVar.zze(i11));
                i11++;
            }
            return;
        }
        zzqv zzqvVar2 = this.zza;
        zzqvVar2.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzsoVar.size(); i15++) {
            zzsoVar.zze(i15);
            i14 += 4;
        }
        zzqvVar2.zzt(i14);
        while (i11 < zzsoVar.size()) {
            zzqvVar2.zzg(zzsoVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvi
    public final void zzz(int i10, long j3) {
        this.zza.zzh(i10, j3);
    }
}
