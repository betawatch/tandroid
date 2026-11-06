package com.google.android.recaptcha.internal;

import gd.k;
import id.c;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
