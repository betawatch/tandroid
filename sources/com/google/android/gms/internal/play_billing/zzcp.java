package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
enum zzcp implements Executor {
    zza;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
