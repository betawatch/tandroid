package com.google.android.gms.internal.recaptchabase;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.recaptchabase.ExecuteRequest;
import com.google.android.gms.recaptchabase.InitRequest;
import com.google.android.gms.recaptchabase.RecaptchaBaseClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zzl extends GoogleApi implements RecaptchaBaseClient {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final zzi zzb;
    private static final Api.ClientKey zzc;
    private static final Api zzd;

    static {
        zzi zziVar = new zzi();
        zzb = zziVar;
        Api.ClientKey clientKey = new Api.ClientKey();
        zzc = clientKey;
        zzd = new Api("RecaptchaBase.API", zziVar, clientKey);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzl(Context context) {
        super(context, zzd, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.google.android.gms.recaptchabase.RecaptchaBaseClient
    public final Task execute(final ExecuteRequest executeRequest) {
        Intrinsics.checkNotNullParameter(executeRequest, "executeRequest");
        Task doRead = doRead(TaskApiCall.builder().setFeatures(com.google.android.gms.recaptchabase.zze.zza).run(new RemoteCall() { // from class: com.google.android.gms.internal.recaptchabase.zzg
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i = zzl.$r8$clinit;
                ExecuteRequest executeRequest2 = ExecuteRequest.this;
                Intrinsics.checkNotNullParameter(executeRequest2, "$executeRequest");
                ((zzf) ((zzm) obj).getService()).zzc(new zzj((TaskCompletionSource) obj2), executeRequest2);
            }
        }).setMethodKey(34002).build());
        Intrinsics.checkNotNullExpressionValue(doRead, "doRead(...)");
        return doRead;
    }

    @Override // com.google.android.gms.recaptchabase.RecaptchaBaseClient
    public final Task init(final InitRequest initRequest) {
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Task doRead = doRead(TaskApiCall.builder().setFeatures(com.google.android.gms.recaptchabase.zze.zzb).run(new RemoteCall() { // from class: com.google.android.gms.internal.recaptchabase.zzh
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i = zzl.$r8$clinit;
                InitRequest initRequest2 = InitRequest.this;
                Intrinsics.checkNotNullParameter(initRequest2, "$initRequest");
                ((zzf) ((zzm) obj).getService()).zzd(new zzk((TaskCompletionSource) obj2), initRequest2);
            }
        }).setMethodKey(34001).build());
        Intrinsics.checkNotNullExpressionValue(doRead, "doRead(...)");
        return doRead;
    }
}
