package e2;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class x {
    public static final x a = new x();

    public final z a(Looper looper, Handler.Callback callback) {
        return new z(new Handler(looper, callback));
    }
}
