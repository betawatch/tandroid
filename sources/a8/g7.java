package a8;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import c8.ad;
import c8.ke;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class g7 {
    public static void a(int i7, int i10, Intent intent, Executor executor, v0.g gVar, CancellationSignal cancellationSignal) {
        String string;
        Bundle bundle;
        v0.n nVar;
        int i11 = b1.d.c;
        if (i7 != i11) {
            Log.w("GetCredentialController", "Returned request code " + i11 + " which  does not match what was given " + i7);
            return;
        }
        int i12 = b1.d.d;
        int i13 = 0;
        int i14 = 1;
        if (f7.b(i10, new b1.e(0), new ae.d(i14, executor, gVar), cancellationSignal)) {
            return;
        }
        if (intent == null) {
            f7.a(cancellationSignal, new b1.f(i13, executor, gVar));
            return;
        }
        int i15 = Build.VERSION.SDK_INT;
        w0.i iVar = null;
        if (i15 >= 34) {
            nVar = h1.a.d(intent);
        } else {
            Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
            nVar = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new v0.n(ad.a(string, bundle));
        }
        if (nVar != null) {
            f7.a(cancellationSignal, new b1.b(executor, gVar, nVar, i14));
            return;
        }
        if (i15 >= 34) {
            iVar = h1.a.c(intent);
        } else {
            int i16 = w0.i.a;
            Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
            if (bundleExtra2 != null) {
                String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                if (string2 == null) {
                    throw new IllegalArgumentException("Bundle was missing exception type.");
                }
                iVar = ke.b(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
            }
        }
        f7.a(cancellationSignal, new b1.b(executor, gVar, iVar, 2));
    }
}
