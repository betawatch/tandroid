package org.telegram.ui.Components;

import java.util.concurrent.Executor;
import org.telegram.messenger.DispatchQueue;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l81 implements Executor {
    public final /* synthetic */ DispatchQueue a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.postRunnable(runnable);
    }
}
