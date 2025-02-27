package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.zzaq;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzax extends zzbk {
    final /* synthetic */ JSONObject zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzax(RemoteMediaClient remoteMediaClient, JSONObject jSONObject) {
        super(remoteMediaClient, false);
        this.zzb = remoteMediaClient;
        this.zza = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    protected final void zza() {
        zzaq zzaqVar;
        zzaqVar = this.zzb.zzd;
        zzaqVar.zzq(zzb(), this.zza);
    }
}
