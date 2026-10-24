package com.google.android.recaptcha.internal;

import be.f0;
import java.util.TimerTask;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
