package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class CrashlyticsBackgroundWorker {
    private final Executor executor;
    private Task tail = Tasks.forResult(null);
    private final Object tailLock = new Object();
    private final ThreadLocal isExecutorThread = new ThreadLocal();

    public CrashlyticsBackgroundWorker(Executor executor) {
        this.executor = executor;
        executor.execute(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker.1
            @Override // java.lang.Runnable
            public void run() {
                CrashlyticsBackgroundWorker.this.isExecutorThread.set(Boolean.TRUE);
            }
        });
    }

    private Task ignoreResult(Task task) {
        return task.continueWith(this.executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker.4
            @Override // com.google.android.gms.tasks.Continuation
            public Void then(Task task2) {
                return null;
            }
        });
    }

    private boolean isRunningOnThread() {
        return Boolean.TRUE.equals(this.isExecutorThread.get());
    }

    private Continuation newContinuation(final Callable callable) {
        return new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker.3
            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task) {
                return callable.call();
            }
        };
    }

    public void checkRunningOnThread() {
        if (!isRunningOnThread()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor getExecutor() {
        return this.executor;
    }

    Task submit(final Runnable runnable) {
        return submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker.2
            @Override // java.util.concurrent.Callable
            public Void call() {
                runnable.run();
                return null;
            }
        });
    }

    public Task submit(Callable callable) {
        Task continueWith;
        synchronized (this.tailLock) {
            continueWith = this.tail.continueWith(this.executor, newContinuation(callable));
            this.tail = ignoreResult(continueWith);
        }
        return continueWith;
    }

    public Task submitTask(Callable callable) {
        Task continueWithTask;
        synchronized (this.tailLock) {
            continueWithTask = this.tail.continueWithTask(this.executor, newContinuation(callable));
            this.tail = ignoreResult(continueWithTask);
        }
        return continueWithTask;
    }
}
