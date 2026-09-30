package com.google.android.gms.tasks;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
        this.zza.zze(null);
    }
}
