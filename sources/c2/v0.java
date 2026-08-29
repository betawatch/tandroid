package c2;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class v0 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Looper looper, int i10) {
        super(looper);
        switch (i10) {
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

    public v0(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
