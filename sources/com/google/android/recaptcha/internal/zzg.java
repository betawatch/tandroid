package com.google.android.recaptcha.internal;

import gd.i;
import id.c;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public abstract class zzg {
    private boolean zza;

    public abstract Object zza(String str, c cVar);

    public abstract Object zzb(String str, c cVar);

    public Object zzc(zzcg zzcgVar, c cVar) {
        return i.a;
    }

    public abstract Object zzd(zzxn zzxnVar, c cVar);

    public Object zze(String str, long j3, Exception exc, c cVar) {
        return i.a;
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
