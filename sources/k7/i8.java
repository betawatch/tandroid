package k7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import org.telegram.ui.Components.ai;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
