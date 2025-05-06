package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public abstract class Utils {
    private static final ExecutorService TASK_CONTINUATION_EXECUTOR_SERVICE = ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");

    public static Object awaitEvenIfOnMainThread(Task task) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(TASK_CONTINUATION_EXECUTOR_SERVICE, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.Utils$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Object lambda$awaitEvenIfOnMainThread$4;
                lambda$awaitEvenIfOnMainThread$4 = Utils.lambda$awaitEvenIfOnMainThread$4(countDownLatch, task2);
                return lambda$awaitEvenIfOnMainThread$4;
            }
        });
        countDownLatch.await(Looper.getMainLooper() == Looper.myLooper() ? 3L : 4L, TimeUnit.SECONDS);
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static Task callTask(final Executor executor, final Callable callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.Utils$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Utils.lambda$callTask$3(callable, executor, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$awaitEvenIfOnMainThread$4(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$callTask$2(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$callTask$3(Callable callable, Executor executor, final TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.Utils$$ExternalSyntheticLambda4
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Object lambda$callTask$2;
                    lambda$callTask$2 = Utils.lambda$callTask$2(TaskCompletionSource.this, task);
                    return lambda$callTask$2;
                }
            });
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$race$0(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$race$1(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    public static Task race(Task task, Task task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation continuation = new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.Utils$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Void lambda$race$0;
                lambda$race$0 = Utils.lambda$race$0(TaskCompletionSource.this, task3);
                return lambda$race$0;
            }
        };
        task.continueWith(continuation);
        task2.continueWith(continuation);
        return taskCompletionSource.getTask();
    }

    public static Task race(Executor executor, Task task, Task task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation continuation = new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.Utils$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Void lambda$race$1;
                lambda$race$1 = Utils.lambda$race$1(TaskCompletionSource.this, task3);
                return lambda$race$1;
            }
        };
        task.continueWith(executor, continuation);
        task2.continueWith(executor, continuation);
        return taskCompletionSource.getTask();
    }
}
