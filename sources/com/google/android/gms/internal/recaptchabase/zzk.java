package com.google.android.gms.internal.recaptchabase;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.recaptchabase.ExecuteResult;
import com.google.android.gms.recaptchabase.InitResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zzk extends zzd {
    final /* synthetic */ TaskCompletionSource zza;

    zzk(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.recaptchabase.zze
    public final void zzb(Status status, ExecuteResult executeResult) {
    }

    @Override // com.google.android.gms.internal.recaptchabase.zze
    public final void zzc(Status status, InitResult initResult) {
        Intrinsics.checkNotNullParameter(status, "status");
        TaskUtil.setResultOrApiException(status, initResult, this.zza);
    }
}
