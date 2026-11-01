package l5;

import android.os.Looper;
import com.google.android.gms.internal.cast.z;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class p implements Executor {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public p(Looper looper) {
        this.b = new z(looper, 4);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((Executor) this.b).execute(new o(0, runnable));
                break;
            default:
                ((z) this.b).post(runnable);
                break;
        }
    }

    public p(ExecutorService executorService) {
        this.b = executorService;
    }
}
