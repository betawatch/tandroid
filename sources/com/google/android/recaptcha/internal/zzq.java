package com.google.android.recaptcha.internal;

import a8.ab;
import gd.c;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class zzq {
    private final c zza;

    public zzq() {
        int i7 = zzby.zza;
        this.zza = ab.b(zzp.zza);
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
