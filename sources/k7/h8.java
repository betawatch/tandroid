package k7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class h8 {
    public static final Object a(Task task, wc.c cVar) {
        if (!task.isComplete()) {
            ld.m mVar = new ld.m(1, g8.b(cVar));
            mVar.s();
            task.addOnCompleteListener(vd.a.a, new o2.i(mVar, 25));
            Object r10 = mVar.r();
            vc.a aVar = vc.a.a;
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
