package o3;

import android.media.MediaDrm;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class r {
    public static boolean a(Throwable th2) {
        return th2 instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th2) {
        return h5.d0.r(h5.d0.s(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
    }
}
