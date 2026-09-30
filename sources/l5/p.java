package l5;

import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class p implements Executor {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public p(Looper looper) {
        this.b = new c0(looper, 4);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((Executor) this.b).execute(new o(0, runnable));
                break;
            default:
                ((c0) this.b).post(runnable);
                break;
        }
    }

    public p(ExecutorService executorService) {
        this.b = executorService;
    }
}
