package com.google.android.gms.internal.recaptchabase;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.recaptchabase.ExecuteResult;
import com.google.android.gms.recaptchabase.InitResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zzj extends zzd {
    final /* synthetic */ TaskCompletionSource zza;

    zzj(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.recaptchabase.zze
    public final void zzb(Status status, ExecuteResult executeResult) {
        Intrinsics.checkNotNullParameter(status, "status");
        TaskUtil.setResultOrApiException(status, executeResult, this.zza);
    }

    @Override // com.google.android.gms.internal.recaptchabase.zze
    public final void zzc(Status status, InitResult initResult) {
    }
}
