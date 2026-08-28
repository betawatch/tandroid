package a9;

import c3.h;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.m;
import e9.q;
import e9.z;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ q b;
    public final /* synthetic */ h c;

    public d(boolean z10, q qVar, h hVar) {
        this.a = z10;
        this.b = qVar;
        this.c = hVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!this.a) {
            return null;
        }
        q qVar = this.b;
        ExecutorService executorService = qVar.k;
        m mVar = new m(2, qVar, this.c);
        ExecutorService executorService2 = z.a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new androidx.car.app.utils.b(mVar, executorService, taskCompletionSource, 11));
        taskCompletionSource.getTask();
        return null;
    }
}
