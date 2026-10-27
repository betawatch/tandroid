package com.google.android.recaptcha.internal;

import a8.id;
import ce.f0;
import java.util.TimerTask;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
            f0.q(((zzcr) id.a(zzgw.zza).a()).zza(), new zzgv(this.zza, null));
        } catch (Exception unused) {
        }
    }
}
