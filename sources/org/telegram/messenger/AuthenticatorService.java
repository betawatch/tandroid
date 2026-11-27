package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
