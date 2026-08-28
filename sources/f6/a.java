package f6;

import android.os.Looper;
import c2.u0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public a(Looper looper) {
        this.b = new u0(looper, 6);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((u0) this.b).post(runnable);
                break;
            default:
                ((Executor) this.b).execute(new c(1, runnable));
                break;
        }
    }

    public a(ExecutorService executorService) {
        this.b = executorService;
    }
}
