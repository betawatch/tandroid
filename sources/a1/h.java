package a1;

import android.os.CancellationSignal;
import android.util.Log;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h {
    public static boolean a(CancellationSignal cancellationSignal) {
        if (cancellationSignal == null) {
            Log.i("PlayServicesImpl", "No cancellationSignal found");
            return false;
        }
        if (!cancellationSignal.isCanceled()) {
            return false;
        }
        Log.i("PlayServicesImpl", "the flow has been canceled");
        return true;
    }
}
