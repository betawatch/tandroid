// default package

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public interface k23 {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, b13 b13Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var);

    void onGetCredential(Context context, av4 av4Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var);

    void onGetCredential(Context context, fm8 fm8Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var);

    void onPrepareCredential(av4 av4Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var);
}
