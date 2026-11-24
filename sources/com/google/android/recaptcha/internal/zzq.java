package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zzq {
    private final d06 zza;

    public zzq() {
        int i = zzby.zza;
        this.zza = cne.b(zzp.zza);
    }

    private final zzi zzf() {
        return (zzi) this.zza.getValue();
    }

    public final zzzd zza() {
        zzzc zzf = zzzd.zzf();
        for (zzg zzgVar : zzf().zza()) {
            zzf.zzh(zzzd.zzi());
        }
        return (zzzd) zzf.zzk();
    }

    public final Object zzb(String str, long j, fw2 fw2Var) {
        return new zzhf(31, new zzl(this, str, j, null), null);
    }

    public final Object zzc(long j, zzxn zzxnVar, fw2 fw2Var) {
        return new zzhf(30, new zzo(this, j, zzxnVar, null), null);
    }

    public final List zzd() {
        return zzf().zza();
    }

    public final void zze(zzyg zzygVar) {
        Iterator it = zzf().zza().iterator();
        while (it.hasNext()) {
            ((zzg) it.next()).zzh(zzygVar);
        }
    }
}
