package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import zd.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class zzbi extends TimerTask {
    final /* synthetic */ zzbo zza;
    final /* synthetic */ zzhk zzb;

    public zzbi(zzbo zzboVar, zzhk zzhkVar) {
        this.zza = zzboVar;
        this.zzb = zzhkVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzbo zzboVar = this.zza;
        e0.q(zzbo.zzb(zzboVar).zzc(), new zzbh(zzboVar, this.zzb, null));
    }
}
