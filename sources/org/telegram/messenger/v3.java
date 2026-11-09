package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
