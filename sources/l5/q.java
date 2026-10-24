package l5;

import android.os.Looper;
import com.google.android.gms.internal.cast.a0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class q implements Executor {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public q(Looper looper) {
        this.b = new a0(looper, 4);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((Executor) this.b).execute(new p(0, runnable));
                break;
            default:
                ((a0) this.b).post(runnable);
                break;
        }
    }

    public q(ExecutorService executorService) {
        this.b = executorService;
    }
}
