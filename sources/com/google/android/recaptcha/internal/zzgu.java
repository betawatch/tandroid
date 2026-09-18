package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import v7.s7;
import zd.e0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class zzgu extends TimerTask {
    final /* synthetic */ zzgz zza;

    public zzgu(zzgz zzgzVar) {
        this.zza = zzgzVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        try {
            int i10 = zzby.zza;
            e0.q(((zzcr) s7.a(zzgw.zza).a()).zza(), new zzgv(this.zza, null));
        } catch (Exception unused) {
        }
    }
}
