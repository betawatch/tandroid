package com.google.android.recaptcha.internal;

import g7.x5;
import hd.f0;
import java.util.TimerTask;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzgu extends TimerTask {
    final /* synthetic */ zzgz zza;

    public zzgu(zzgz zzgzVar) {
        this.zza = zzgzVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        try {
            int i9 = zzby.zza;
            f0.q(((zzcr) x5.a(zzgw.zza).a()).zza(), new zzgv(this.zza, null));
        } catch (Exception unused) {
        }
    }
}
