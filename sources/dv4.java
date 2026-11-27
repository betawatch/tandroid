// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class dv4 implements m0b {
    public final TaskCompletionSource a;

    public dv4(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // m0b
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // m0b
    public final boolean b(ia0 ia0Var) {
        int i = ia0Var.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.trySetResult(ia0Var.a);
        return true;
    }
}
