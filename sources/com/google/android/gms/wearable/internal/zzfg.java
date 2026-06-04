package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class zzfg extends zzu {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ byte[] zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfg(zzfl zzflVar, GoogleApiClient googleApiClient, String str, String str2, byte[] bArr) {
        super(googleApiClient);
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return new zzfk(status, -1);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzfb) ((zzim) anyClient).getService()).zzz(new zzig(this), this.zza, this.zzb, this.zzc);
    }
}
