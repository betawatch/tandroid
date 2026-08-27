package d5;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b0 {
    public static final b0 a = new b0();

    public final d0 a(Looper looper, Handler.Callback callback) {
        return new d0(new Handler(looper, callback));
    }
}
