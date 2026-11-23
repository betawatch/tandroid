package c8;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class z0 {
    public static final Object a(Task task, gb.x xVar) {
        if (!task.isComplete()) {
            zd.m mVar = new zd.m(1, y0.b(xVar));
            mVar.s();
            task.addOnCompleteListener(je.a.a, new j6.r(mVar, 1));
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
