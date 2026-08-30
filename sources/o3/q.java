package o3;

import android.media.MediaDrm;
import h5.d0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class q {
    public static boolean a(Throwable th2) {
        return th2 instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th2) {
        return d0.r(d0.s(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
    }
}
