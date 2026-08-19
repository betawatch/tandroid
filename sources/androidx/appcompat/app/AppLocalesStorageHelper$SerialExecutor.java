package androidx.appcompat.app;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class AppLocalesStorageHelper$SerialExecutor implements Executor {
    Runnable mActive;
    final Executor mExecutor;
    private final Object mLock = new Object();
    final Queue mTasks = new ArrayDeque();

    AppLocalesStorageHelper$SerialExecutor(Executor executor) {
        this.mExecutor = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        synchronized (this.mLock) {
            try {
                this.mTasks.add(new Runnable() { // from class: androidx.appcompat.app.AppLocalesStorageHelper$SerialExecutor$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppLocalesStorageHelper$SerialExecutor.$r8$lambda$ryxIdFHRlGAin6xhl7ifa8d_Mk4(AppLocalesStorageHelper$SerialExecutor.this, runnable);
                    }
                });
                if (this.mActive == null) {
                    scheduleNext();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$ryxIdFHRlGAin6xhl7ifa8d_Mk4(AppLocalesStorageHelper$SerialExecutor appLocalesStorageHelper$SerialExecutor, Runnable runnable) {
        appLocalesStorageHelper$SerialExecutor.getClass();
        try {
            runnable.run();
        } finally {
            appLocalesStorageHelper$SerialExecutor.scheduleNext();
        }
    }

    protected void scheduleNext() {
        synchronized (this.mLock) {
            try {
                Runnable runnable = (Runnable) this.mTasks.poll();
                this.mActive = runnable;
                if (runnable != null) {
                    this.mExecutor.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
