// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class cdd {
    public static final ocd a;

    static {
        ocd ocdVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            ocdVar = new ocd((byte) 0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            ocdVar = new ocd((byte) 1);
        }
        a = ocdVar;
    }
}
