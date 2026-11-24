// default package

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class g50 implements Executor {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Handler b;

    public /* synthetic */ g50(Handler handler, byte b) {
        this.a = b;
        this.b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        this.b.post(runnable);
    }
}
