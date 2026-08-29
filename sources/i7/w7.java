package i7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class w7 {
    public static final Object a(Task task, uc.c cVar) {
        if (!task.isComplete()) {
            jd.m mVar = new jd.m(1, v7.b(cVar));
            mVar.s();
            task.addOnCompleteListener(td.a.a, new o1.a(mVar, 22));
            Object r6 = mVar.r();
            tc.a aVar = tc.a.a;
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
