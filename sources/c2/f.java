package c2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Handler b;

    public /* synthetic */ f(Handler handler, int i9) {
        this.a = i9;
        this.b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler;
        switch (this.a) {
            case 0:
                handler = this.b;
                break;
            default:
                handler = (b) this.b;
                break;
        }
        handler.post(runnable);
    }
}
