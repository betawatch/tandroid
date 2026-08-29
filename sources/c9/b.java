package c9;

import com.google.android.gms.tasks.TaskCompletionSource;
import e3.f;
import g9.a0;
import g9.n;
import g9.r;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ r b;
    public final /* synthetic */ f c;

    public b(boolean z10, r rVar, f fVar) {
        this.a = z10;
        this.b = rVar;
        this.c = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!this.a) {
            return null;
        }
        r rVar = this.b;
        ExecutorService executorService = rVar.k;
        n nVar = new n(2, rVar, this.c);
        ExecutorService executorService2 = a0.a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new androidx.car.app.utils.b(nVar, executorService, taskCompletionSource, 10));
        taskCompletionSource.getTask();
        return null;
    }
}
