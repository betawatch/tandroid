package kotlinx.coroutines.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class DirectExecutor implements Executor {
    public static final DirectExecutor INSTANCE = new DirectExecutor();

    private DirectExecutor() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
