package j7;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static void a(CancellationSignal cancellationSignal, dd.a onResultOrException) {
        kotlin.jvm.internal.j.e(onResultOrException, "onResultOrException");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.g.a(cancellationSignal)) {
            return;
        }
        onResultOrException.invoke();
    }

    public static boolean b(int i10, dd.p pVar, dd.l lVar, CancellationSignal cancellationSignal) {
        if (i10 == -1) {
            return false;
        }
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q();
        qVar.a = new w0.h(l.d.k(i10, "activity with result code: ", " indicating not RESULT_OK"), 2);
        if (i10 == 0) {
            qVar.a = new w0.g("activity is cancelled by the user.");
        }
        pVar.invoke(cancellationSignal, new b1.c(lVar, qVar, 1));
        return true;
    }
}
