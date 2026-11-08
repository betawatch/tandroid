package com.google.android.recaptcha.internal;

import a8.ab;
import java.util.TimerTask;
import zd.b0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class zzgu extends TimerTask {
    final /* synthetic */ zzgz zza;

    public zzgu(zzgz zzgzVar) {
        this.zza = zzgzVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        try {
            int i7 = zzby.zza;
            b0.q(((zzcr) ab.b(zzgw.zza).getValue()).zza(), new zzgv(this.zza, null));
        } catch (Exception unused) {
        }
    }
}
