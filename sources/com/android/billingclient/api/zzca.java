package com.android.billingclient.api;

import androidx.core.util.Consumer;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import j$.util.Objects;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class zzca implements com.google.android.gms.internal.play_billing.zzcs {
    final /* synthetic */ Consumer zza;
    final /* synthetic */ Runnable zzb;
    final /* synthetic */ zzce zzc;
    final /* synthetic */ int zzd;

    zzca(zzce zzceVar, int i, Consumer consumer, Runnable runnable) {
        this.zzd = i;
        this.zza = consumer;
        this.zzb = runnable;
        Objects.requireNonNull(zzceVar);
        this.zzc = zzceVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final void zza(Throwable th) {
        if (th instanceof TimeoutException) {
            this.zzc.zzaF(zzie.zzaX, 28, zzcj.zzF);
            zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            this.zzc.zzaF(zzie.zzaQ, 28, zzcj.zzF);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.zzb.run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean zzaC;
        BillingResult zzaD;
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        zzce zzceVar = this.zzc;
        zzaC = zzce.zzaC(intValue);
        if (!zzaC) {
            this.zzb.run();
        } else {
            zzaD = zzceVar.zzaD(this.zzd, num.intValue());
            this.zza.accept(zzaD);
        }
    }
}
