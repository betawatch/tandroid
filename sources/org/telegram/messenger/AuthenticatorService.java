package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class AuthenticatorService extends Service {
    public static g50 a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (!intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            return null;
        }
        g50 g50Var = a;
        if (g50Var == null) {
            g50Var = new g50(this);
            a = g50Var;
        }
        return g50Var.getIBinder();
    }
}
