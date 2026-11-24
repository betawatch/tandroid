// default package

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class eve {
    public static final Object a(Task task, jo5 jo5Var) {
        if (!task.isComplete()) {
            na1 na1Var = new na1(1, dle.a(jo5Var));
            na1Var.s();
            task.addOnCompleteListener(wn3.b, new ln8(na1Var, (byte) 19));
            return na1Var.q();
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
