package l5;

import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class q implements Executor {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public q(Looper looper) {
        this.b = new c0(looper, 4);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((Executor) this.b).execute(new p(0, runnable));
                break;
            default:
                ((c0) this.b).post(runnable);
                break;
        }
    }

    public q(ExecutorService executorService) {
        this.b = executorService;
    }
}
