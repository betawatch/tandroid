package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

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
        BuildersKt__Builders_commonKt.launch$default(zzbo.zzb(zzboVar).zzc(), null, null, new zzbh(zzboVar, this.zzb, null), 3, null);
    }
}
