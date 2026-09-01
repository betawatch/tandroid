package k7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import org.telegram.ui.Components.ai;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class i8 {
    public static final Object a(Task task, wc.c cVar) {
        if (!task.isComplete()) {
            ld.m mVar = new ld.m(1, h8.b(cVar));
            mVar.s();
            task.addOnCompleteListener(vd.a.a, new ai(mVar, 18));
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
