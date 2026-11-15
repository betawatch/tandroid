package c8;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class w0 {
    public static final Object a(Task task, gb.w wVar) {
        if (!task.isComplete()) {
            zd.m mVar = new zd.m(1, v0.b(wVar));
            mVar.s();
            task.addOnCompleteListener(je.a.a, new hi.l0(mVar, 4));
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
