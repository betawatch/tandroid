// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class av4 implements mya {
    public final TaskCompletionSource a;

    public av4(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // mya
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // mya
    public final boolean b(gb0 gb0Var) {
        int i = gb0Var.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.trySetResult(gb0Var.a);
        return true;
    }
}
