package ca;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g implements i {
    public final TaskCompletionSource a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // ca.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // ca.i
    public final boolean b(da.b bVar) {
        int i10 = bVar.b;
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            return false;
        }
        this.a.trySetResult(bVar.a);
        return true;
    }
}
