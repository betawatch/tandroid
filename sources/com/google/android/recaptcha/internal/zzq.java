package com.google.android.recaptcha.internal;

import g7.x5;
import java.util.Iterator;
import java.util.List;
import oc.c;
import oc.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzq {
    private final c zza;

    public zzq() {
        int i9 = zzby.zza;
        this.zza = x5.a(zzp.zza);
    }

    private final zzi zzf() {
        return (zzi) ((g) this.zza).a();
    }

    public final zzzd zza() {
        zzzc zzf = zzzd.zzf();
        for (zzg zzgVar : zzf().zza()) {
            zzf.zzh(zzzd.zzi());
        }
        return (zzzd) zzf.zzk();
    }

    public final Object zzb(String str, long j10, qc.c cVar) {
        return new zzhf(31, new zzl(this, str, j10, null), null);
    }

    public final Object zzc(long j10, zzxn zzxnVar, qc.c cVar) {
        return new zzhf(30, new zzo(this, j10, zzxnVar, null), null);
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
