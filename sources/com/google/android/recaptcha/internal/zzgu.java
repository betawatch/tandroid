package com.google.android.recaptcha.internal;

import java.util.TimerTask;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
            fud.b(((zzcr) ure.b(zzgw.zza).getValue()).zza(), new zzgv(this.zza, null));
        } catch (Exception unused) {
        }
    }
}
