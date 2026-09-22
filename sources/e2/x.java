package e2;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class x {
    public static final x a = new x();

    public final z a(Looper looper, Handler.Callback callback) {
        return new z(new Handler(looper, callback));
    }
}
