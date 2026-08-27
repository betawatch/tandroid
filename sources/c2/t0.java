package c2;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class t0 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Looper looper, int i10) {
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

    public t0(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
