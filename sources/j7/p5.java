package j7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class p5 {
    public static void a(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.e()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(b6.m.m(status));
        }
    }

    public static void b(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.e()) {
            taskCompletionSource.trySetResult(obj);
        } else {
            taskCompletionSource.trySetException(b6.m.m(status));
        }
    }
}
