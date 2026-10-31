package org.telegram.ui.Components;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n61 implements Executor {
    public final /* synthetic */ org.telegram.messenger.s5 a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.postRunnable(runnable);
    }
}
