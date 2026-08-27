package h7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class k7 {
    public static final Object a(Task task, tc.c cVar) {
        if (!task.isComplete()) {
            id.m mVar = new id.m(1, h7.b(cVar));
            mVar.s();
            task.addOnCompleteListener(sd.a.a, new sd.b(mVar));
            Object r10 = mVar.r();
            sc.a aVar = sc.a.a;
            return r10;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
