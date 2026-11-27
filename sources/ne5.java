// default package

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
