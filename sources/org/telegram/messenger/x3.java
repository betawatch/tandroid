package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
