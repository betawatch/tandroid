package org.telegram.ui.Components;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a61 implements Executor {
    public final /* synthetic */ org.telegram.messenger.r5 a;

    public /* synthetic */ a61(org.telegram.messenger.r5 r5Var) {
        this.a = r5Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.postRunnable(runnable);
    }
}
