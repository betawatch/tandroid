package c2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Handler b;

    public /* synthetic */ f(Handler handler, int i10) {
        this.a = i10;
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
