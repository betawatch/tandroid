package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zzp<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, zzq {
    private final Executor zza;
    private final SuccessContinuation zzb;
    private final zzw zzc;

    public zzp(Executor executor, SuccessContinuation successContinuation, zzw zzwVar) {
        this.zza = executor;
        this.zzb = successContinuation;
        this.zzc = zzwVar;
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.zzc.zzc();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.zzc.zzb(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(Task task) {
        this.zza.execute(new zzo(this, task));
    }
}
