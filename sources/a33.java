// default package

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class a33 extends q23 {
    public final Context e;
    public h23 f;
    public Executor g;
    public CancellationSignal h;
    public final q13 i;

    public a33(Context context) {
        context.getClass();
        this.e = context;
        this.i = new q13(this, new Handler(Looper.getMainLooper()), (byte) 3);
    }
}
