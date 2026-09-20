package a9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                taskCompletionSource.getTask().addOnCompleteListener(new n4.y(eVar, taskCompletionSource));
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
