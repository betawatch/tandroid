// default package

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public interface d33 {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, u13 u13Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var);

    void onGetCredential(Context context, uk8 uk8Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var);

    void onGetCredential(Context context, xu4 xu4Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var);

    void onPrepareCredential(xu4 xu4Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var);
}
