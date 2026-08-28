package a1;

import android.os.CancellationSignal;
import android.util.Log;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g {
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
