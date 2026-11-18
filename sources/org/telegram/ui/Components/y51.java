package org.telegram.ui.Components;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
