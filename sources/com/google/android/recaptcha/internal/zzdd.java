package com.google.android.recaptcha.internal;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
final class zzdd implements Executor {
    public static final zzdd zza = new zzdd();

    private zzdd() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
