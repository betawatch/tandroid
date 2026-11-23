package com.google.android.recaptcha.internal;

import gd.k;
import id.c;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class zzg {
    private boolean zza;

    public abstract Object zza(String str, c cVar);

    public abstract Object zzb(String str, c cVar);

    public Object zzc(zzcg zzcgVar, c cVar) {
        return k.a;
    }

    public abstract Object zzd(zzxn zzxnVar, c cVar);

    public Object zze(String str, long j3, Exception exc, c cVar) {
        return k.a;
    }

    public Object zzf(Exception exc, c cVar) {
        return zzh.zza(exc, new zzcg(zzce.zzb, zzcd.zzap, exc.getMessage(), null, 8, null));
    }

    public final boolean zzi() {
        return this.zza;
    }

    public abstract int zzj();

    public abstract int zzk();

    public void zzh(zzyg zzygVar) {
    }
}
