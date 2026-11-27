// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class j5d implements Runnable {
    private final TaskCompletionSource a;

    public j5d() {
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
        } catch (Exception e) {
            a(e);
        }
    }

    public j5d(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }
}
