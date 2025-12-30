package com.google.android.recaptcha.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class zzg {
    private boolean zza;

    protected abstract Object zza(String str, Continuation continuation);

    protected abstract Object zzb(String str, Continuation continuation);

    protected Object zzc(zzcg zzcgVar, Continuation continuation) {
        return Unit.INSTANCE;
    }

    protected abstract Object zzd(zzxn zzxnVar, Continuation continuation);

    protected Object zze(String str, long j, Exception exc, Continuation continuation) {
        return Unit.INSTANCE;
    }

    protected Object zzf(Exception exc, Continuation continuation) {
        return zzh.zza(exc, new zzcg(zzce.zzb, zzcd.zzap, exc.getMessage(), null, 8, null));
    }

    protected void zzh(zzyg zzygVar) {
    }

    public final boolean zzi() {
        return this.zza;
    }

    protected abstract int zzj();

    protected abstract int zzk();
}
