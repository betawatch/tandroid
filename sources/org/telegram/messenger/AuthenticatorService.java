package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class AuthenticatorService extends Service {
    public static e50 a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (!intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            return null;
        }
        e50 e50Var = a;
        if (e50Var == null) {
            e50Var = new e50(this);
            a = e50Var;
        }
        return e50Var.getIBinder();
    }
}
