package a8;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import c8.ge;
import c8.wc;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class e7 {
    public static void a(int i7, int i10, Intent intent, Executor executor, v0.g gVar, CancellationSignal cancellationSignal) {
        String string;
        Bundle bundle;
        v0.o oVar;
        int i11 = b1.d.c;
        if (i7 != i11) {
            Log.w("GetCredentialController", "Returned request code " + i11 + " which  does not match what was given " + i7);
            return;
        }
        int i12 = b1.d.d;
        int i13 = 0;
        int i14 = 1;
        if (d7.b(i10, new b1.e(0), new ae.d(i14, executor, gVar), cancellationSignal)) {
            return;
        }
        if (intent == null) {
            d7.a(cancellationSignal, new b1.f(i13, executor, gVar));
            return;
        }
        int i15 = Build.VERSION.SDK_INT;
        w0.i iVar = null;
        if (i15 >= 34) {
            oVar = h1.a.d(intent);
        } else {
            Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
            oVar = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new v0.o(wc.a(string, bundle));
        }
        if (oVar != null) {
            d7.a(cancellationSignal, new b1.b(executor, gVar, oVar, i14));
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
                iVar = ge.b(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
            }
        }
        d7.a(cancellationSignal, new b1.b(executor, gVar, iVar, 2));
    }
}
