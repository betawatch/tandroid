package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final /* synthetic */ class WithinAppServiceBinder$$Lambda$0 implements Executor {
    static final Executor $instance = new WithinAppServiceBinder$$Lambda$0();

    private WithinAppServiceBinder$$Lambda$0() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
