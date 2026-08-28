package g7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class h7 {
    public static final Object a(Task task, sc.c cVar) {
        if (!task.isComplete()) {
            hd.m mVar = new hd.m(1, g7.b(cVar));
            mVar.s();
            task.addOnCompleteListener(rd.a.a, new n5.a0(mVar, 16));
            Object r10 = mVar.r();
            rc.a aVar = rc.a.a;
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
