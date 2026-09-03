package j7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
