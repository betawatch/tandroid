package e9;

import com.google.android.gms.tasks.TaskCompletionSource;
import e3.g;
import i9.p;
import i9.y;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ p b;
    public final /* synthetic */ g c;

    public b(boolean z4, p pVar, g gVar) {
        this.a = z4;
        this.b = pVar;
        this.c = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!this.a) {
            return null;
        }
        p pVar = this.b;
        ExecutorService executorService = pVar.k;
        h2.g gVar = new h2.g(3, pVar, this.c);
        ExecutorService executorService2 = y.a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new androidx.car.app.utils.b(gVar, executorService, taskCompletionSource, 10));
        taskCompletionSource.getTask();
        return null;
    }
}
