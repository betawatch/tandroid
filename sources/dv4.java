// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
