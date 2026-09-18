package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
