package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
