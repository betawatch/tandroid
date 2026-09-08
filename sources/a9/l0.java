package a9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class l0 extends j0 {
    public final /* synthetic */ TaskCompletionSource h;
    public final /* synthetic */ j0 n;
    public final /* synthetic */ e r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, j0 j0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.n = j0Var;
        this.r = eVar;
    }

    @Override // a9.j0
    public final void b() {
        synchronized (this.r.f) {
            try {
                e eVar = this.r;
                TaskCompletionSource taskCompletionSource = this.h;
                eVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new n4.y(2, eVar, taskCompletionSource));
                if (this.r.l.getAndIncrement() > 0) {
                    this.r.b.b("Already connected to the service.", new Object[0]);
                }
                e.b(this.r, this.n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
