package j6;

import a7.e;
import android.os.Looper;
import d9.j;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public a(Looper looper) {
        this.b = new e(looper, 0);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((e) this.b).post(runnable);
                break;
            default:
                ((Executor) this.b).execute(new j(2, runnable));
                break;
        }
    }

    public a(ExecutorService executorService) {
        this.b = executorService;
    }
}
