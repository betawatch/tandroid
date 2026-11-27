// default package

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public interface k23 {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, b13 b13Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var);

    void onGetCredential(Context context, av4 av4Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var);

    void onGetCredential(Context context, fm8 fm8Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var);

    void onPrepareCredential(av4 av4Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var);
}
