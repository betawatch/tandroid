package com.google.android.gms.tasks;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zza implements OnSuccessListener {
    final /* synthetic */ OnTokenCanceledListener zza;

    public zza(zzb zzbVar, OnTokenCanceledListener onTokenCanceledListener) {
        this.zza = onTokenCanceledListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.zza.onCanceled();
    }
}
