// default package

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
