package m8;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // m8.h0
    public final void b() {
        synchronized (this.r.f) {
            try {
                c cVar = this.r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new g9.l(cVar, taskCompletionSource, false, 21));
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
