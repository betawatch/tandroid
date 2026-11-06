package d9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

    @Override // d9.h0
    public final void b() {
        synchronized (this.r.f) {
            try {
                c cVar = this.r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new q4.q(cVar, taskCompletionSource, false, 17));
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
