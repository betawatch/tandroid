package com.google.android.gms.cast.framework.media;

import androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
abstract class zzbk extends BasePendingResult {
    private com.google.android.gms.cast.internal.zzas zza;
    private final boolean zzb;
    final /* synthetic */ RemoteMediaClient zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbk(RemoteMediaClient remoteMediaClient, boolean z) {
        super(null);
        this.zzg = remoteMediaClient;
        this.zzb = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzbj(this, status);
    }

    abstract void zza();

    final com.google.android.gms.cast.internal.zzas zzb() {
        if (this.zza == null) {
            this.zza = new zzbi(this);
        }
        return this.zza;
    }

    public final void zzc() {
        Object obj;
        List list;
        List list2;
        if (!this.zzb) {
            list = this.zzg.zzi;
            Iterator it = list.iterator();
            if (it.hasNext()) {
                ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                throw null;
            }
            list2 = this.zzg.zzj;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((RemoteMediaClient.Callback) it2.next()).onSendingRemoteMediaRequest();
            }
        }
        try {
            obj = this.zzg.zzb;
            synchronized (obj) {
                zza();
            }
        } catch (com.google.android.gms.cast.internal.zzao unused) {
            setResult(new zzbj(this, new Status(2100)));
        }
    }
}
