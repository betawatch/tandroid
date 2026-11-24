// default package

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public abstract class er8 {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
