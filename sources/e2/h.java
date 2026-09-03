package e2;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class h {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
