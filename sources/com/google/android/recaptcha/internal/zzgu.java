package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import k7.p7;
import ld.e0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            e0.q(((zzcr) p7.a(zzgw.zza).a()).zza(), new zzgv(this.zza, null));
        } catch (Exception unused) {
        }
    }
}
