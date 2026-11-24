package com.google.android.recaptcha.internal;

import java.util.TimerTask;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzgu extends TimerTask {
    final /* synthetic */ zzgz zza;

    public zzgu(zzgz zzgzVar) {
        this.zza = zzgzVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        try {
            int i = zzby.zza;
            srd.b(((zzcr) fpe.b(zzgw.zza).getValue()).zza(), new zzgv(this.zza, null));
        } catch (Exception unused) {
        }
    }
}
