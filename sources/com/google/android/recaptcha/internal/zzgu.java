package com.google.android.recaptcha.internal;

import a8.ab;
import java.util.TimerTask;
import zd.b0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
