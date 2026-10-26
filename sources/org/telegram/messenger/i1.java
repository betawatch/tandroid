package org.telegram.messenger;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements Executor {
    public final /* synthetic */ DispatchQueue2 a;

    public /* synthetic */ i1(DispatchQueue2 dispatchQueue2) {
        this.a = dispatchQueue2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.postRunnable(runnable);
    }
}
