package com.google.android.recaptcha.internal;

import gd.c;
import gd.g;
import java.util.Iterator;
import java.util.List;
import v7.s7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class zzq {
    private final c zza;

    public zzq() {
        int i10 = zzby.zza;
        this.zza = s7.a(zzp.zza);
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
