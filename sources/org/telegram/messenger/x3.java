package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class x3 implements Executor {
    public final /* synthetic */ q5 a;

    public /* synthetic */ x3(q5 q5Var) {
        this.a = q5Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.c(runnable);
    }
}
