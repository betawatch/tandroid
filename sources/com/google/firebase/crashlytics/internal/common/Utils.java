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

/* loaded from: classes.dex */
public abstract class Utils {
    private static final ExecutorService TASK_CONTINUATION_EXECUTOR_SERVICE = ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");

    public static Task race(Task task, Task task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation continuation = new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.Utils$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return Utils.$r8$lambda$fNSdSg4hoY-BdxTuelQo0-XNfdA(TaskCompletionSource.this, task3);
            }
        };
        task.continueWith(continuation);
        task2.continueWith(continuation);
        return taskCompletionSource.getTask();
    }

    public static /* synthetic */ Void $r8$lambda$fNSdSg4hoY-BdxTuelQo0-XNfdA(TaskCompletionSource taskCompletionSource, Task task) {
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

    public static Task race(Executor executor, Task task, Task task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation continuation = new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.Utils$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return Utils.$r8$lambda$NExQHcMqHF6e6danWK4vMHi41Y4(TaskCompletionSource.this, task3);
            }
        };
        task.continueWith(executor, continuation);
        task2.continueWith(executor, continuation);
        return taskCompletionSource.getTask();
    }

    public static /* synthetic */ Void $r8$lambda$NExQHcMqHF6e6danWK4vMHi41Y4(TaskCompletionSource taskCompletionSource, Task task) {
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

    public static Task callTask(final Executor executor, final Callable callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.Utils$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Utils.$r8$lambda$kWusQ-GH24kVwU03QEe1Xf63uWY(callable, executor, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public static /* synthetic */ void $r8$lambda$kWusQ-GH24kVwU03QEe1Xf63uWY(Callable callable, Executor executor, final TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.Utils$$ExternalSyntheticLambda4
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Utils.$r8$lambda$-YlsqxsjAEowli87HCBuZ6Mr9C4(TaskCompletionSource.this, task);
                }
            });
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ Object $r8$lambda$-YlsqxsjAEowli87HCBuZ6Mr9C4(TaskCompletionSource taskCompletionSource, Task task) {
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

    public static Object awaitEvenIfOnMainThread(Task task) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(TASK_CONTINUATION_EXECUTOR_SERVICE, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.Utils$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return Utils.$r8$lambda$BTAbU8pxKqAfoQOJygHsdSswNMI(countDownLatch, task2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
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

    public static /* synthetic */ Object $r8$lambda$BTAbU8pxKqAfoQOJygHsdSswNMI(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
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
}
