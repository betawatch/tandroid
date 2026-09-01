package o3;

import android.media.MediaDrm;
import h5.d0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class q {
    public static boolean a(Throwable th2) {
        return th2 instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th2) {
        return d0.r(d0.s(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
    }
}
