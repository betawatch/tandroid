// default package

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public interface k23 {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, b13 b13Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var);

    void onGetCredential(Context context, av4 av4Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var);

    void onGetCredential(Context context, fm8 fm8Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var);

    void onPrepareCredential(av4 av4Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var);
}
