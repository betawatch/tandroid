package kotlinx.coroutines;

import kotlin.Result;

/* loaded from: classes.dex */
public abstract class CompletableDeferredKt {
    public static final boolean completeWith(CompletableDeferred completableDeferred, Object obj) {
        Throwable th = Result.exceptionOrNull-impl(obj);
        return th == null ? completableDeferred.complete(obj) : completableDeferred.completeExceptionally(th);
    }

    public static final CompletableDeferred CompletableDeferred(Job job) {
        return new CompletableDeferredImpl(job);
    }

    public static /* synthetic */ CompletableDeferred CompletableDeferred$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return CompletableDeferred(job);
    }
}
