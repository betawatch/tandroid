package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.zzaq;

/* loaded from: classes.dex */
final class zzas extends zzbk {
    final /* synthetic */ RemoteMediaClient zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzas(RemoteMediaClient remoteMediaClient, boolean z) {
        super(remoteMediaClient, true);
        this.zza = remoteMediaClient;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    protected final void zza() {
        zzaq zzaqVar;
        zzaqVar = this.zza.zzd;
        zzaqVar.zzu(zzb());
    }
}
