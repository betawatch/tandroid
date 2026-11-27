package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzaa<T> implements zzab<T> {
    private final CountDownLatch zza = new CountDownLatch(1);

    private zzaa() {
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.zza.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.zza.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t) {
        this.zza.countDown();
    }

    public final void zza() {
        this.zza.await();
    }

    public final boolean zzb(long j, TimeUnit timeUnit) {
        return this.zza.await(j, timeUnit);
    }

    public /* synthetic */ zzaa(byte[] bArr) {
    }
}
