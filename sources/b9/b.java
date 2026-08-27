package b9;

import c3.g;
import com.google.android.gms.tasks.TaskCompletionSource;
import f9.b0;
import f9.m;
import f9.q;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ q b;
    public final /* synthetic */ g c;

    public b(boolean z10, q qVar, g gVar) {
        this.a = z10;
        this.b = qVar;
        this.c = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!this.a) {
            return null;
        }
        q qVar = this.b;
        ExecutorService executorService = qVar.k;
        m mVar = new m(2, qVar, this.c);
        ExecutorService executorService2 = b0.a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new androidx.car.app.utils.a(mVar, executorService, taskCompletionSource, 11));
        taskCompletionSource.getTask();
        return null;
    }
}
