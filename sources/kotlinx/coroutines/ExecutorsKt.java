package kotlinx.coroutines;

import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public abstract class ExecutorsKt {
    public static final ExecutorCoroutineDispatcher from(ExecutorService executorService) {
        return new ExecutorCoroutineDispatcherImpl(executorService);
    }
}
