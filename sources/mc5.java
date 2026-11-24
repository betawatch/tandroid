// default package

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class mc5 implements Executor {
    public final /* synthetic */ byte a;
    public final Object b;

    public mc5(Looper looper) {
        this.a = (byte) 0;
        this.b = new o59(looper, (byte) 4);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((o59) obj).post(runnable);
                break;
            case 1:
                ((ExecutorService) obj).execute(new xo9(runnable, (byte) 0));
                break;
            default:
                ((o59) obj).post(runnable);
                break;
        }
    }

    public /* synthetic */ mc5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
