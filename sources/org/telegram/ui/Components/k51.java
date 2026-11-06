package org.telegram.ui.Components;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
