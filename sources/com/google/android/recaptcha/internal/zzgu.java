package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import v7.t7;
import zd.e0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
            e0.q(((zzcr) t7.a(zzgw.zza).a()).zza(), new zzgv(this.zza, null));
        } catch (Exception unused) {
        }
    }
}
