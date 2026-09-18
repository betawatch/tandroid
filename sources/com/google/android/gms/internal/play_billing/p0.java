package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class p0 implements Executor {
    public static final p0 a;
    public static final /* synthetic */ p0[] b;

    static {
        p0 p0Var = new p0("INSTANCE", 0);
        a = p0Var;
        b = new p0[]{p0Var};
    }

    public static p0[] values() {
        return (p0[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
