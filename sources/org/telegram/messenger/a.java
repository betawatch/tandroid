package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AndroidUtilities.runOnUIThread(runnable);
    }
}
