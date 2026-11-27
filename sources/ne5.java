// default package

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ne5 implements Executor {
    public final /* synthetic */ byte a;
    public final Object b;

    public ne5(Looper looper) {
        this.a = (byte) 0;
        this.b = new b99(looper, (byte) 4);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((b99) obj).post(runnable);
                break;
            case 1:
                ((ExecutorService) obj).execute(new ps9(runnable, (byte) 0));
                break;
            default:
                ((b99) obj).post(runnable);
                break;
        }
    }

    public /* synthetic */ ne5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
