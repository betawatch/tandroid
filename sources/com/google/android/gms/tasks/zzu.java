package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import d8.a;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
final class zzu implements Executor {
    private final Handler zza = new a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
