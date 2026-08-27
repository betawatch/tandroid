package c2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
