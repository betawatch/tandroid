package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import d8.a;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
final class zzu implements Executor {
    private final Handler zza = new a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
