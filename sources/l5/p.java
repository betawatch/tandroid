package l5;

import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
