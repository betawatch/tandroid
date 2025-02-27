package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.zzaq;

/* loaded from: classes.dex */
final class zzat extends zzbk {
    final /* synthetic */ int[] zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzat(RemoteMediaClient remoteMediaClient, boolean z, int[] iArr) {
        super(remoteMediaClient, true);
        this.zzb = remoteMediaClient;
        this.zza = iArr;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    protected final void zza() {
        zzaq zzaqVar;
        zzaqVar = this.zzb.zzd;
        zzaqVar.zzv(zzb(), this.zza);
    }
}
