package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import k7.o7;
import sc.c;
import sc.g;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class zzq {
    private final c zza;

    public zzq() {
        int i10 = zzby.zza;
        this.zza = o7.a(zzp.zza);
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

    public final Object zzb(String str, long j10, uc.c cVar) {
        return new zzhf(31, new zzl(this, str, j10, null), null);
    }

    public final Object zzc(long j10, zzxn zzxnVar, uc.c cVar) {
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
