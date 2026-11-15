package ba;

import a3.h;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class a {
    public static final d3.b a = new d3.b(3);

    public static Task a(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        h hVar = new h(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, 5);
        d3.b bVar = a;
        task.continueWithTask(bVar, hVar);
        task2.continueWithTask(bVar, hVar);
        return taskCompletionSource.getTask();
    }
}
