// default package

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class b99 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b99(Looper looper, byte b) {
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

    public b99(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
