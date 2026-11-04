package b8;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class f1 {
    public static void a(CancellationSignal cancellationSignal, od.a onResultOrException) {
        kotlin.jvm.internal.j.e(onResultOrException, "onResultOrException");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.h.a(cancellationSignal)) {
            return;
        }
        onResultOrException.invoke();
    }

    public static boolean b(int i3, od.p pVar, od.l lVar, CancellationSignal cancellationSignal) {
        if (i3 == -1) {
            return false;
        }
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r();
        rVar.a = new w0.h(2, k2.p1.j(i3, "activity with result code: ", " indicating not RESULT_OK"));
        if (i3 == 0) {
            rVar.a = new w0.g("activity is cancelled by the user.");
        }
        pVar.invoke(cancellationSignal, new b1.c(lVar, rVar, 1));
        return true;
    }
}
