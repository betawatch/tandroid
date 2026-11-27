// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class n5d extends j5d {
    public final /* synthetic */ TaskCompletionSource h;
    public final /* synthetic */ j5d n;
    public final /* synthetic */ y3d r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5d(y3d y3dVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, j5d j5dVar) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.n = j5dVar;
        this.r = y3dVar;
    }

    @Override // j5d
    public final void b() {
        synchronized (this.r.f) {
            y3d y3dVar = this.r;
            TaskCompletionSource taskCompletionSource = this.h;
            y3dVar.e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new k7b(y3dVar, taskCompletionSource, (byte) 9));
            if (this.r.l.getAndIncrement() > 0) {
                this.r.b.b("Already connected to the service.", new Object[0]);
            }
            y3d.b(this.r, this.n);
        }
    }
}
