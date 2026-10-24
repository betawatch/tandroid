package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements Executor {
    public final /* synthetic */ DispatchQueue a;

    public /* synthetic */ g1(DispatchQueue dispatchQueue) {
        this.a = dispatchQueue;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.postRunnable(runnable);
    }
}
