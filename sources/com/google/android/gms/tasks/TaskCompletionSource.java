package com.google.android.gms.tasks;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class TaskCompletionSource<TResult> {
    private final zzw zza = new zzw();

    public TaskCompletionSource() {
    }

    public Task<TResult> getTask() {
        return this.zza;
    }

    public void setException(Exception exc) {
        this.zza.zza(exc);
    }

    public void setResult(TResult tresult) {
        this.zza.zzb(tresult);
    }

    public boolean trySetException(Exception exc) {
        return this.zza.zzd(exc);
    }

    public boolean trySetResult(TResult tresult) {
        return this.zza.zze(tresult);
    }

    public TaskCompletionSource(CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new zzs(this));
    }
}
