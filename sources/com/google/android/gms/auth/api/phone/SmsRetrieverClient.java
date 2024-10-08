package com.google.android.gms.auth.api.phone;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public abstract class SmsRetrieverClient extends GoogleApi {
    private static final Api.ClientKey zza;
    private static final Api.AbstractClientBuilder zzb;
    private static final Api zzc;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zza zzaVar = new zza();
        zzb = zzaVar;
        zzc = new Api("SmsRetriever.API", zzaVar, clientKey);
    }

    public SmsRetrieverClient(Context context) {
        super(context, zzc, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public abstract Task startSmsRetriever();
}
