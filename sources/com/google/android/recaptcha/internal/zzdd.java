package com.google.android.recaptcha.internal;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
