// default package

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bfb {
    public static final bfb a = new bfb();

    public final dfb a(Looper looper, Handler.Callback callback) {
        return new dfb(new Handler(looper, callback));
    }
}
