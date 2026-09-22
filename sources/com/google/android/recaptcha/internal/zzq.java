package com.google.android.recaptcha.internal;

import gd.c;
import gd.g;
import java.util.Iterator;
import java.util.List;
import v7.t7;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class zzq {
    private final c zza;

    public zzq() {
        int i10 = zzby.zza;
        this.zza = t7.a(zzp.zza);
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

    public final Object zzb(String str, long j3, id.c cVar) {
        return new zzhf(31, new zzl(this, str, j3, null), null);
    }

    public final Object zzc(long j3, zzxn zzxnVar, id.c cVar) {
        return new zzhf(30, new zzo(this, j3, zzxnVar, null), null);
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
