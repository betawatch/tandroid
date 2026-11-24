// default package

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class lg7 {
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final yh4 a = new yh4((byte) 13);

    public final Task a(final Executor executor, final Callable callable, final CancellationToken cancellationToken) {
        ite.k(this.b.get() > 0);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.a.L(new Runnable() { // from class: x4f
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                lg7 lg7Var = lg7.this;
                AtomicBoolean atomicBoolean = lg7Var.c;
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
                            lg7Var.b();
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
                    } catch (RuntimeException e) {
                        throw new dg7("Internal error has occurred when executing ML Kit tasks", e);
                    }
                } catch (Exception e2) {
                    if (cancellationToken2.isCancellationRequested()) {
                        cancellationTokenSource2.cancel();
                    } else {
                        taskCompletionSource2.setException(e2);
                    }
                }
            }
        }, new Executor() { // from class: f2f
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                    } else {
                        taskCompletionSource.setException(e);
                    }
                    throw e;
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public abstract void b();

    public abstract void c();

    public final void d(Executor executor) {
        ite.k(this.b.get() > 0);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.L(new tnd(this, taskCompletionSource, (byte) 19), executor);
        taskCompletionSource.getTask();
    }
}
