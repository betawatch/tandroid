// default package

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
