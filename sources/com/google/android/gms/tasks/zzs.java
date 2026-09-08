package com.google.android.gms.tasks;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzs implements OnTokenCanceledListener {
    final /* synthetic */ TaskCompletionSource zza;

    public zzs(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        zzw zzwVar;
        zzwVar = this.zza.zza;
        zzwVar.zzc();
    }
}
