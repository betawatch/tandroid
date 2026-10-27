package b9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
