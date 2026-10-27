package com.google.android.recaptcha.internal;

import ce.f0;
import java.util.TimerTask;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        f0.q(zzbo.zzb(zzboVar).zzc(), new zzbh(zzboVar, this.zzb, null));
    }
}
