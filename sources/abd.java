// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
