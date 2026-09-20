package e2;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class x {
    public static final x a = new x();

    public final z a(Looper looper, Handler.Callback callback) {
        return new z(new Handler(looper, callback));
    }
}
