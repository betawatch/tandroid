// default package

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class e69 implements Executor {
    public final /* synthetic */ ExecutorService a;
    public final /* synthetic */ w26 b;

    public e69(ExecutorService executorService, w26 w26Var) {
        this.a = executorService;
        this.b = w26Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
