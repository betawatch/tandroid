package j7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class r5 {
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
