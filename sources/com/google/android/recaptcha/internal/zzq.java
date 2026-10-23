package com.google.android.recaptcha.internal;

import id.c;
import id.g;
import java.util.Iterator;
import java.util.List;
import v7.h8;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class zzq {
    private final c zza;

    public zzq() {
        int i10 = zzby.zza;
        this.zza = h8.a(zzp.zza);
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

    public final Object zzb(String str, long j10, kd.c cVar) {
        return new zzhf(31, new zzl(this, str, j10, null), null);
    }

    public final Object zzc(long j10, zzxn zzxnVar, kd.c cVar) {
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
