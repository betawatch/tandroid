// default package

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g89 implements Executor {
    public final /* synthetic */ ExecutorService a;
    public final /* synthetic */ u36 b;

    public g89(ExecutorService executorService, u36 u36Var) {
        this.a = executorService;
        this.b = u36Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
