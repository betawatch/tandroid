package e2;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class x {
    public static final x a = new x();

    public final z a(Looper looper, Handler.Callback callback) {
        return new z(new Handler(looper, callback));
    }
}
