package l8;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i0 extends g0 {
    public final /* synthetic */ TaskCompletionSource h;
    public final /* synthetic */ g0 n;
    public final /* synthetic */ c r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, g0 g0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.n = g0Var;
        this.r = cVar;
    }

    @Override // l8.g0
    public final void b() {
        synchronized (this.r.f) {
            try {
                c cVar = this.r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new g5.b(15, cVar, taskCompletionSource));
                if (this.r.l.getAndIncrement() > 0) {
                    this.r.b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.r, this.n);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
