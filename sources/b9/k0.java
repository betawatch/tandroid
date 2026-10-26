package b9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class k0 extends i0 {
    public final /* synthetic */ TaskCompletionSource h;
    public final /* synthetic */ i0 n;
    public final /* synthetic */ d r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(d dVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, i0 i0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.n = i0Var;
        this.r = dVar;
    }

    @Override // b9.i0
    public final void b() {
        synchronized (this.r.f) {
            try {
                d dVar = this.r;
                TaskCompletionSource taskCompletionSource = this.h;
                dVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new n4.s(7, dVar, taskCompletionSource));
                if (this.r.l.getAndIncrement() > 0) {
                    this.r.b.b("Already connected to the service.", new Object[0]);
                }
                d.b(this.r, this.n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
