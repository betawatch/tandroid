package org.telegram.ui.Components;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
