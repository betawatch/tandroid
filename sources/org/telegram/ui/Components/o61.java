package org.telegram.ui.Components;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o61 implements Executor {
    public final /* synthetic */ org.telegram.messenger.s5 a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.postRunnable(runnable);
    }
}
