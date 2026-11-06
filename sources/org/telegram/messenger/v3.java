package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class v3 implements Executor {
    public final /* synthetic */ p5 a;

    public /* synthetic */ v3(p5 p5Var) {
        this.a = p5Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.c(runnable);
    }
}
