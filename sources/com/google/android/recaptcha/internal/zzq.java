package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zzq {
    private final Lazy zza;

    public zzq() {
        int i = zzby.zza;
        this.zza = LazyKt.lazy(zzp.zza);
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

    public final Object zzb(String str, long j, Continuation continuation) {
        return new zzhf(31, new zzl(this, str, j, null), null);
    }

    public final Object zzc(long j, zzxn zzxnVar, Continuation continuation) {
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
