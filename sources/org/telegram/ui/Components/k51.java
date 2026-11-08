package org.telegram.ui.Components;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k51 implements Executor {
    public final /* synthetic */ org.telegram.messenger.q5 a;

    public /* synthetic */ k51(org.telegram.messenger.q5 q5Var) {
        this.a = q5Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.postRunnable(runnable);
    }
}
