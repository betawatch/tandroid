package aa;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class b {
    public static final c3.b a = new c3.b(3);

    public static Task a(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        a aVar = new a(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, 0);
        c3.b bVar = a;
        task.continueWithTask(bVar, aVar);
        task2.continueWithTask(bVar, aVar);
        return taskCompletionSource.getTask();
    }
}
