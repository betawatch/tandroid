package androidx.biometric;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o implements Executor {
    public final /* synthetic */ int a;
    public final Handler b;

    public /* synthetic */ o(Handler handler, int i10) {
        this.a = i10;
        this.b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                this.b.post(runnable);
                return;
            case 1:
                this.b.post(runnable);
                return;
            case 2:
                this.b.post(runnable);
                return;
            case 3:
                runnable.getClass();
                Handler handler = this.b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                runnable.getClass();
                Handler handler2 = this.b;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
        }
    }

    public o(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new Handler(Looper.getMainLooper());
                break;
            default:
                this.b = new Handler(Looper.getMainLooper());
                break;
        }
    }
}
