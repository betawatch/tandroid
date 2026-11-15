package com.google.android.recaptcha.internal;

import a8.bb;
import java.util.TimerTask;
import zd.b0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
            b0.q(((zzcr) bb.b(zzgw.zza).getValue()).zza(), new zzgv(this.zza, null));
        } catch (Exception unused) {
        }
    }
}
