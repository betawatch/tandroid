package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ConcurrentKt;

/* loaded from: classes3.dex */
public final class ExecutorCoroutineDispatcherImpl extends ExecutorCoroutineDispatcher implements Delay {
    private final Executor executor;

    public ExecutorCoroutineDispatcherImpl(Executor executor) {
        this.executor = executor;
        ConcurrentKt.removeFutureOnCancel(getExecutor());
    }

    public Executor getExecutor() {
        return this.executor;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            Executor executor = getExecutor();
            AbstractTimeSourceKt.access$getTimeSource$p();
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            AbstractTimeSourceKt.access$getTimeSource$p();
            cancelJobOnRejection(coroutineContext, e);
            Dispatchers.getIO().dispatch(coroutineContext, runnable);
        }
    }

    @Override // kotlinx.coroutines.Delay
    public void scheduleResumeAfterDelay(long j, CancellableContinuation cancellableContinuation) {
        long j2;
        Executor executor = getExecutor();
        ScheduledFuture scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j2 = j;
            scheduledFuture = scheduleBlock(scheduledExecutorService, new ResumeUndispatchedRunnable(this, cancellableContinuation), cancellableContinuation.getContext(), j2);
        } else {
            j2 = j;
        }
        if (scheduledFuture != null) {
            JobKt.cancelFutureOnCancellation(cancellableContinuation, scheduledFuture);
        } else {
            DefaultExecutor.INSTANCE.scheduleResumeAfterDelay(j2, cancellableContinuation);
        }
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j, Runnable runnable, CoroutineContext coroutineContext) {
        long j2;
        Runnable runnable2;
        CoroutineContext coroutineContext2;
        Executor executor = getExecutor();
        ScheduledFuture scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j2 = j;
            runnable2 = runnable;
            coroutineContext2 = coroutineContext;
            scheduledFuture = scheduleBlock(scheduledExecutorService, runnable2, coroutineContext2, j2);
        } else {
            j2 = j;
            runnable2 = runnable;
            coroutineContext2 = coroutineContext;
        }
        if (scheduledFuture != null) {
            return new DisposableFutureHandle(scheduledFuture);
        }
        return DefaultExecutor.INSTANCE.invokeOnTimeout(j2, runnable2, coroutineContext2);
    }

    private final ScheduledFuture scheduleBlock(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            cancelJobOnRejection(coroutineContext, e);
            return null;
        }
    }

    private final void cancelJobOnRejection(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        JobKt.cancel(coroutineContext, ExceptionsKt.CancellationException("The task was rejected", rejectedExecutionException));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executor = getExecutor();
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return getExecutor().toString();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ExecutorCoroutineDispatcherImpl) && ((ExecutorCoroutineDispatcherImpl) obj).getExecutor() == getExecutor();
    }

    public int hashCode() {
        return System.identityHashCode(getExecutor());
    }
}
