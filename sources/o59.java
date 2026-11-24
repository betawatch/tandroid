// default package

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class o59 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o59(Looper looper, byte b) {
        super(looper);
        switch (b) {
            case 3:
                super(looper);
                Looper.getMainLooper();
                break;
            case 4:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }

    public o59(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
