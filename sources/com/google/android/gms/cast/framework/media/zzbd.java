package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.zzaq;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzbd extends zzbk {
    final /* synthetic */ double zza;
    final /* synthetic */ JSONObject zzb;
    final /* synthetic */ RemoteMediaClient zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbd(RemoteMediaClient remoteMediaClient, double d, JSONObject jSONObject) {
        super(remoteMediaClient, false);
        this.zzc = remoteMediaClient;
        this.zza = d;
        this.zzb = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    protected final void zza() {
        zzaq zzaqVar;
        zzaqVar = this.zzc.zzd;
        zzaqVar.zzE(zzb(), this.zza, this.zzb);
    }
}
