package com.google.android.gms.tasks;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
