package org.telegram.ui.Components;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
