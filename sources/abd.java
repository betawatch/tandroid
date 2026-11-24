// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class abd {
    public static final mad a;

    static {
        mad madVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            madVar = new mad((byte) 0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            madVar = new mad((byte) 1);
        }
        a = madVar;
    }
}
