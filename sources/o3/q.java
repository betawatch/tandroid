package o3;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class q {
    public static boolean a(Throwable th2) {
        return th2 instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th2) {
        return th2 instanceof NotProvisionedException;
    }
}
