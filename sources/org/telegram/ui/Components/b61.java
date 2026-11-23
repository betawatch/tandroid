package org.telegram.ui.Components;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b61 implements Executor {
    public final /* synthetic */ org.telegram.messenger.r5 a;

    public /* synthetic */ b61(org.telegram.messenger.r5 r5Var) {
        this.a = r5Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.postRunnable(runnable);
    }
}
