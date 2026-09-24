package e2;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class x {
    public static final x a = new x();

    public final z a(Looper looper, Handler.Callback callback) {
        return new z(new Handler(looper, callback));
    }
}
