package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zzad<T> implements zzae<T> {
    private final CountDownLatch zza = new CountDownLatch(1);

    private zzad() {
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
    public final void onSuccess(T t6) {
        this.zza.countDown();
    }

    public final void zza() {
        this.zza.await();
    }

    public final boolean zzb(long j10, TimeUnit timeUnit) {
        return this.zza.await(j10, timeUnit);
    }

    public /* synthetic */ zzad(zzac zzacVar) {
    }
}
