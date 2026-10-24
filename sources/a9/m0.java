package a9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class m0 extends k0 {
    public final /* synthetic */ TaskCompletionSource h;
    public final /* synthetic */ k0 n;
    public final /* synthetic */ e r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, k0 k0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.n = k0Var;
        this.r = eVar;
    }

    @Override // a9.k0
    public final void b() {
        synchronized (this.r.f) {
            try {
                e eVar = this.r;
                TaskCompletionSource taskCompletionSource = this.h;
                eVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new qf.b(2, eVar, taskCompletionSource));
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
