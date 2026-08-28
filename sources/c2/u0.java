package c2;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class u0 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Looper looper, int i9) {
        super(looper);
        switch (i9) {
            case 4:
                super(looper);
                Looper.getMainLooper();
                break;
            case 5:
            default:
                Looper.getMainLooper();
                break;
            case 6:
                super(looper);
                Looper.getMainLooper();
                break;
        }
    }

    public u0(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
