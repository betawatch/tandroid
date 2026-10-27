package a8;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
