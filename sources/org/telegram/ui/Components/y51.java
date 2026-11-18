package org.telegram.ui.Components;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y51 implements Executor {
    public final /* synthetic */ org.telegram.messenger.r5 a;

    public /* synthetic */ y51(org.telegram.messenger.r5 r5Var) {
        this.a = r5Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.postRunnable(runnable);
    }
}
