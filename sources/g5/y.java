package g5;

import android.system.ErrnoException;
import android.system.OsConstants;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class y {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th2) {
        return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
    }
}
