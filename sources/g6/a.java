package g6;

import a9.n;
import android.os.Looper;
import c2.t0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public a(Looper looper) {
        this.b = new t0(looper, 6);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((t0) this.b).post(runnable);
                break;
            default:
                ((Executor) this.b).execute(new n(2, runnable));
                break;
        }
    }

    public a(ExecutorService executorService) {
        this.b = executorService;
    }
}
