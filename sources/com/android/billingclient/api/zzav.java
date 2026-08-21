package com.android.billingclient.api;

import j$.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class zzav implements ThreadFactory {
    private final ThreadFactory zza;
    private final AtomicInteger zzb;

    zzav(BillingClientImpl billingClientImpl) {
        Objects.requireNonNull(billingClientImpl);
        this.zza = Executors.defaultThreadFactory();
        this.zzb = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.zzb;
        Thread newThread = this.zza.newThread(runnable);
        newThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return newThread;
    }
}
