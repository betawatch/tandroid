package cb;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class j {
    public final m a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public j() {
        m mVar = new m();
        mVar.b = new Object();
        mVar.c = new ArrayDeque();
        mVar.d = new AtomicReference();
        this.a = mVar;
    }

    public final Task a(final Executor executor, final Callable callable, final CancellationToken cancellationToken) {
        b6.m.k(this.b.get() > 0);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.a.w(new Runnable() { // from class: cb.s
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                j jVar = j.this;
                AtomicBoolean atomicBoolean = jVar.c;
                CancellationToken cancellationToken2 = cancellationToken;
                boolean isCancellationRequested = cancellationToken2.isCancellationRequested();
                CancellationTokenSource cancellationTokenSource2 = cancellationTokenSource;
                try {
                    if (isCancellationRequested) {
                        cancellationTokenSource2.cancel();
                        return;
                    }
                    try {
                        if (!atomicBoolean.get()) {
                            jVar.b();
                            atomicBoolean.set(true);
                        }
                        if (cancellationToken2.isCancellationRequested()) {
                            cancellationTokenSource2.cancel();
                            return;
                        }
                        Object call = callable2.call();
                        if (cancellationToken2.isCancellationRequested()) {
                            cancellationTokenSource2.cancel();
                        } else {
                            taskCompletionSource2.setResult(call);
                        }
                    } catch (RuntimeException e6) {
                        throw new ya.a("Internal error has occurred when executing ML Kit tasks", e6);
                    }
                } catch (Exception e10) {
                    if (cancellationToken2.isCancellationRequested()) {
                        cancellationTokenSource2.cancel();
                    } else {
                        taskCompletionSource2.setException(e10);
                    }
                }
            }
        }, new Executor() { // from class: cb.r
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e6) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                    } else {
                        taskCompletionSource.setException(e6);
                    }
                    throw e6;
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public abstract void b();

    public abstract void c();

    public final void d(Executor executor) {
        b6.m.k(this.b.get() > 0);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.w(new androidx.biometric.k(this, taskCompletionSource, false, 3), executor);
        taskCompletionSource.getTask();
    }
}
