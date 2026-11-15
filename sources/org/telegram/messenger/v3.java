package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
