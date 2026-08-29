package h6;

import android.os.Looper;
import b9.k;
import c2.v0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public a(Looper looper) {
        this.b = new v0(looper, 6);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((v0) this.b).post(runnable);
                break;
            default:
                ((Executor) this.b).execute(new k(2, runnable));
                break;
        }
    }

    public a(ExecutorService executorService) {
        this.b = executorService;
    }
}
