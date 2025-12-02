package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zbao extends zbq {
    final /* synthetic */ TaskCompletionSource zba;

    zbao(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth-api.zbr
    public final void zbb(Status status, PendingIntent pendingIntent) {
        TaskUtil.setResultOrApiException(status, pendingIntent, this.zba);
    }
}
