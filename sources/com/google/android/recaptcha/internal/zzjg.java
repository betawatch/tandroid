package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class zzjg implements zzjt {
    public static final zzjg zza = new zzjg();

    private zzjg() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length == 0) {
            throw new zzdm(4, 3, null);
        }
        zzyu zzf = zzyx.zzf();
        for (zzzt zzztVar : zzztVarArr) {
            Object zza2 = zzizVar.zzc().zza(zzztVar);
            if (zza2 == null) {
                throw new zzdm(4, 4, null);
            }
            zzyv zzf2 = zzyw.zzf();
            if (zza2 instanceof Integer) {
                zzf2.zzu(((Number) zza2).intValue());
            } else if (zza2 instanceof Short) {
                zzf2.zzt(((Number) zza2).shortValue());
            } else if (zza2 instanceof Byte) {
                zzf2.zzf(zzqm.zzl(new byte[]{((Number) zza2).byteValue()}, 0, 1));
            } else if (zza2 instanceof Long) {
                zzf2.zzv(((Number) zza2).longValue());
            } else if (zza2 instanceof Double) {
                zzf2.zzr(((Number) zza2).doubleValue());
            } else if (zza2 instanceof Float) {
                zzf2.zzs(((Number) zza2).floatValue());
            } else if (zza2 instanceof Boolean) {
                zzf2.zze(((Boolean) zza2).booleanValue());
            } else if (zza2 instanceof Character) {
                zzf2.zzq(String.valueOf(((Character) zza2).charValue()));
            } else if (zza2 instanceof String) {
                zzf2.zzw((String) zza2);
            } else {
                zzf2.zzw(zza2.toString());
            }
            zzf.zzf((zzyw) zzf2.zzk());
        }
        zzja zzc = zzizVar.zzc();
        byte[] zzd = ((zzyx) zzf.zzk()).zzd();
        zzc.zze(i10, zzpp.zzh().zzi(zzd, 0, zzd.length));
    }
}
