package b8;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class kc {
    public static final Object a(Task task, db.v vVar) {
        if (!task.isComplete()) {
            wd.m mVar = new wd.m(1, jc.b(vVar));
            mVar.s();
            task.addOnCompleteListener(ge.a.a, new ge.b(mVar));
            Object r5 = mVar.r();
            gd.a aVar = gd.a.a;
            return r5;
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
