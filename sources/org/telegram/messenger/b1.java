package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements Executor {
    public final /* synthetic */ DispatchQueue a;

    public /* synthetic */ b1(DispatchQueue dispatchQueue) {
        this.a = dispatchQueue;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.postRunnable(runnable);
    }
}
