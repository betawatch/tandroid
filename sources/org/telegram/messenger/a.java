package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AndroidUtilities.runOnUIThread(runnable);
    }
}
