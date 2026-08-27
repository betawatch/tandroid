package com.google.android.recaptcha.internal;

import pc.i;
import rc.c;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class zzg {
    private boolean zza;

    public abstract Object zza(String str, c cVar);

    public abstract Object zzb(String str, c cVar);

    public Object zzc(zzcg zzcgVar, c cVar) {
        return i.a;
    }

    public abstract Object zzd(zzxn zzxnVar, c cVar);

    public Object zze(String str, long j10, Exception exc, c cVar) {
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
