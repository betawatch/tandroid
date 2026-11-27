// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
