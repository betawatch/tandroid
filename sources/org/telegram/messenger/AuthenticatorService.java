package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class AuthenticatorService extends Service {
    public static e60 a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (!intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            return null;
        }
        e60 e60Var = a;
        if (e60Var == null) {
            e60Var = new e60(this);
            a = e60Var;
        }
        return e60Var.getIBinder();
    }
}
