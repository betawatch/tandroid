package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements Executor {
    public final /* synthetic */ DispatchQueue2 a;

    public /* synthetic */ i1(DispatchQueue2 dispatchQueue2) {
        this.a = dispatchQueue2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.postRunnable(runnable);
    }
}
