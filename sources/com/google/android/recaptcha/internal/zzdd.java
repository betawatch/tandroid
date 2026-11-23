package com.google.android.recaptcha.internal;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
