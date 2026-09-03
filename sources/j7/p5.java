package j7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
