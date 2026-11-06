package com.google.android.gms.tasks;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
final class zzb extends CancellationToken {
    private final zzw zza = new zzw();

    @Override // com.google.android.gms.tasks.CancellationToken
    public final boolean isCancellationRequested() {
        return this.zza.isComplete();
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final CancellationToken onCanceledRequested(OnTokenCanceledListener onTokenCanceledListener) {
        this.zza.addOnSuccessListener(TaskExecutors.MAIN_THREAD, new zza(this, onTokenCanceledListener));
        return this;
    }

    public final void zza() {
        this.zza.zzb(null);
    }
}
