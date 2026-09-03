package o3;

import android.media.MediaDrm;
import h5.d0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class q {
    public static boolean a(Throwable th2) {
        return th2 instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th2) {
        return d0.r(d0.s(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
    }
}
