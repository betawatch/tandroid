package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
