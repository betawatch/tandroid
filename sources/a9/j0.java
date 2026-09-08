package a9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class j0 implements Runnable {
    private final TaskCompletionSource a;

    public j0() {
        this.a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e7) {
            a(e7);
        }
    }

    public j0(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }
}
