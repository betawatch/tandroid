package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements Executor {
    public final /* synthetic */ DispatchQueue a;

    public /* synthetic */ d1(DispatchQueue dispatchQueue) {
        this.a = dispatchQueue;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.postRunnable(runnable);
    }
}
