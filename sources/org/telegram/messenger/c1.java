package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements Executor {
    public final /* synthetic */ DispatchQueue a;

    public /* synthetic */ c1(DispatchQueue dispatchQueue) {
        this.a = dispatchQueue;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.postRunnable(runnable);
    }
}
