package com.google.android.recaptcha.internal;

import java.util.Map;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
final class zzsa extends zzrz {
    @Override // com.google.android.recaptcha.internal.zzrz
    public final void zza(Object obj) {
        ((zzsk) obj).zzb.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzrz
    public final void zzb(zzvi zzviVar, Map.Entry entry) {
        zzsl zzslVar = (zzsl) entry.getKey();
        zzvg zzvgVar = zzvg.zza;
        switch (zzslVar.zzb.ordinal()) {
            case 0:
                zzviVar.zzf(zzslVar.zza, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                zzviVar.zzo(zzslVar.zza, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                zzviVar.zzt(zzslVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                zzviVar.zzK(zzslVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                zzviVar.zzr(zzslVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                zzviVar.zzm(zzslVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                zzviVar.zzk(zzslVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                zzviVar.zzb(zzslVar.zza, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                zzviVar.zzG(zzslVar.zza, (String) entry.getValue());
                break;
            case 9:
                zzviVar.zzq(zzslVar.zza, entry.getValue(), zzuc.zza().zzb(entry.getValue().getClass()));
                break;
            case 10:
                zzviVar.zzv(zzslVar.zza, entry.getValue(), zzuc.zza().zzb(entry.getValue().getClass()));
                break;
            case 11:
                zzviVar.zzd(zzslVar.zza, (zzqm) entry.getValue());
                break;
            case 12:
                zzviVar.zzI(zzslVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                zzviVar.zzr(zzslVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                zzviVar.zzx(zzslVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                zzviVar.zzz(zzslVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                zzviVar.zzB(zzslVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                zzviVar.zzD(zzslVar.zza, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
