package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class y3 implements Executor {
    public final /* synthetic */ r5 a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.c(runnable);
    }
}
