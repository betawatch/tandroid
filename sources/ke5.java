// default package

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ke5 implements Executor {
    public final /* synthetic */ byte a;
    public final Object b;

    public ke5(Looper looper) {
        this.a = (byte) 0;
        this.b = new q79(looper, (byte) 4);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((q79) obj).post(runnable);
                break;
            case 1:
                ((ExecutorService) obj).execute(new yq9(runnable, (byte) 0));
                break;
            default:
                ((q79) obj).post(runnable);
                break;
        }
    }

    public /* synthetic */ ke5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
