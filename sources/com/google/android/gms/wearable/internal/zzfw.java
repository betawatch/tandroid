package com.google.android.gms.wearable.internal;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageClient;

/* loaded from: classes.dex */
public final class zzfw extends MessageClient {
    final zzfl zza;

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task sendMessage(String str, String str2, byte[] bArr) {
        zzfl zzflVar = this.zza;
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzfg(zzflVar, asGoogleApiClient, str, str2, bArr)), new PendingResultUtil.ResultConverter() { // from class: com.google.android.gms.wearable.internal.zzfp
            @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
            public final Object convert(Result result) {
                return Integer.valueOf(((MessageApi.SendMessageResult) result).getRequestId());
            }
        });
    }

    public zzfw(Context context, GoogleApi.Settings settings) {
        super(context, settings);
        this.zza = new zzfl();
    }
}
