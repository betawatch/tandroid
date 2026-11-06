package ba;

import a3.h;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class a {
    public static final d3.b a = new d3.b(3);

    public static Task a(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        h hVar = new h(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, 4);
        d3.b bVar = a;
        task.continueWithTask(bVar, hVar);
        task2.continueWithTask(bVar, hVar);
        return taskCompletionSource.getTask();
    }
}
