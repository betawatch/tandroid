package j6;

import a7.e;
import android.os.Looper;
import d9.j;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public a(Looper looper) {
        this.b = new e(looper, 0);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((e) this.b).post(runnable);
                break;
            default:
                ((Executor) this.b).execute(new j(2, runnable));
                break;
        }
    }

    public a(ExecutorService executorService) {
        this.b = executorService;
    }
}
