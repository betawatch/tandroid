package c8;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class v0 {
    public static final Object a(Task task, gb.w wVar) {
        if (!task.isComplete()) {
            zd.m mVar = new zd.m(1, u0.b(wVar));
            mVar.s();
            task.addOnCompleteListener(je.a.a, new je.b(mVar));
            Object r10 = mVar.r();
            jd.a aVar = jd.a.a;
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
