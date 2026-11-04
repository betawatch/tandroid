package c9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j0 extends h0 {
    public final /* synthetic */ TaskCompletionSource h;
    public final /* synthetic */ h0 n;
    public final /* synthetic */ c r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h0 h0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.n = h0Var;
        this.r = cVar;
    }

    @Override // c9.h0
    public final void b() {
        synchronized (this.r.f) {
            try {
                c cVar = this.r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new p4.q(cVar, taskCompletionSource));
                if (this.r.l.getAndIncrement() > 0) {
                    this.r.b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.r, this.n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
