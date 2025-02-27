package com.google.android.gms.cast.framework;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;

/* loaded from: classes.dex */
final class zzr extends RemoteMediaClient.Callback {
    final /* synthetic */ CastSession zza;

    zzr(CastSession castSession) {
        this.zza = castSession;
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void zza(String str, long j, int i, long j2, long j3) {
        zzs zzsVar;
        zzs zzsVar2;
        CastSession castSession = this.zza;
        zzsVar = castSession.zzm;
        if (zzsVar != null) {
            zzsVar2 = castSession.zzm;
            zzsVar2.zzb(str, j, i, j2, j3);
        }
    }
}
