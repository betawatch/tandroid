package o5;

import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
