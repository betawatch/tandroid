package a8;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class qe {
    public static final Object a(Task task, nd.c cVar) {
        if (!task.isComplete()) {
            ce.m mVar = new ce.m(1, pe.b(cVar));
            mVar.s();
            task.addOnCompleteListener(me.a.a, new me.b(mVar));
            Object r6 = mVar.r();
            md.a aVar = md.a.a;
            return r6;
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
