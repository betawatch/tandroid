// default package

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class gxe {
    public static final Object a(Task task, jq5 jq5Var) {
        if (!task.isComplete()) {
            vb1 vb1Var = new vb1(1, fne.a(jq5Var));
            vb1Var.s();
            task.addOnCompleteListener(gp3.b, new cf9(vb1Var, (byte) 13));
            return vb1Var.q();
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
