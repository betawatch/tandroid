package o5;

import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class p implements Executor {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public p(Looper looper) {
        this.b = new y(looper, 4);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((Executor) this.b).execute(new o(0, runnable));
                break;
            default:
                ((y) this.b).post(runnable);
                break;
        }
    }

    public p(ExecutorService executorService) {
        this.b = executorService;
    }
}
