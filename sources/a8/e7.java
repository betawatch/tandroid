package a8;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class e7 {
    public static void a(CancellationSignal cancellationSignal, rd.a onResultOrException) {
        kotlin.jvm.internal.j.e(onResultOrException, "onResultOrException");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.g.a(cancellationSignal)) {
            return;
        }
        onResultOrException.invoke();
    }

    public static boolean b(int i7, rd.p pVar, rd.l lVar, CancellationSignal cancellationSignal) {
        if (i7 == -1) {
            return false;
        }
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r();
        rVar.a = new w0.h(2, i5.c.j(i7, "activity with result code: ", " indicating not RESULT_OK"));
        if (i7 == 0) {
            rVar.a = new w0.g("activity is cancelled by the user.");
        }
        pVar.invoke(cancellationSignal, new b1.c(lVar, rVar, 1));
        return true;
    }
}
